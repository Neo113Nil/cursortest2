package androidx.heifwriter;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import defpackage.i8m;
import defpackage.wvb1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class d implements AutoCloseable {
    public int[] B;
    public int C;
    public boolean D;
    public final int a;
    public final Handler b;
    public int c;
    public final int w;
    public MediaMuxer y;
    public HeifEncoder z;
    public final wvb1 x = new wvb1();
    public final AtomicBoolean A = new AtomicBoolean(false);
    public final ArrayList E = new ArrayList();

    public d(String str, int i, int i2, int i3) {
        MediaFormat.createVideoFormat("image/vnd.android.heic", i, i2);
        this.c = 1;
        this.a = 2;
        this.w = 1;
        HandlerThread handlerThread = new HandlerThread("HeifEncoderThread", -2);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.b = handler;
        this.y = new MediaMuxer(str, 3);
        this.z = new HeifEncoder(i, i2, true, i3, 2, handler, new c(this));
    }

    public final void a() {
        MediaMuxer mediaMuxer = this.y;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.y.release();
            this.y = null;
        }
        HeifEncoder heifEncoder = this.z;
        if (heifEncoder != null) {
            heifEncoder.close();
            synchronized (this) {
                this.z = null;
            }
        }
    }

    public final void c() {
        Pair pair;
        if (!this.A.get()) {
            return;
        }
        while (true) {
            synchronized (this.E) {
                try {
                    if (this.E.isEmpty()) {
                        return;
                    } else {
                        pair = (Pair) this.E.remove(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(((ByteBuffer) pair.second).position(), ((ByteBuffer) pair.second).remaining(), 0L, 16);
            this.y.writeSampleData(this.B[((Integer) pair.first).intValue()], (ByteBuffer) pair.second, bufferInfo);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.postAtFrontOfQueue(new i8m(19, this));
    }
}
