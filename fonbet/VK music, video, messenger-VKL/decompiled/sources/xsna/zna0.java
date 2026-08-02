package xsna;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.os.MemoryFile;
import android.os.SystemClock;
import com.vk.media.MediaUtils;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;

/* compiled from: PingPongDecoder.kt */
@TargetApi(18)
/* loaded from: classes3.dex */
public final class zna0 extends d8l {
    public MediaCodec d;
    public MediaMuxer e;
    public File f;
    public boolean g;
    public MediaUtils.e h;
    public volatile boolean j;
    public final aoa0 c = new aoa0();
    public volatile int i = -1;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, ArrayList arrayList) {
        boolean z;
        MediaCodec.BufferInfo bufferInfo;
        int i2;
        ByteBuffer[] byteBufferArr;
        int i3;
        ByteBuffer[] byteBufferArr2;
        InputStream inputStream;
        int i4;
        boolean z2 = false;
        this.e = new MediaMuxer(this.f.getAbsolutePath(), 0);
        int size = arrayList.size();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        ByteBuffer[] inputBuffers = this.d.getInputBuffers();
        ByteBuffer[] outputBuffers = this.d.getOutputBuffers();
        long j = 1000;
        long j2 = ((size * 2) - 2) * i * 26 * j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        while (SystemClock.elapsedRealtime() - elapsedRealtime <= 16000) {
            synchronized (this) {
                if (!this.b) {
                    return z2;
                }
                if (i5 == 0) {
                    z3 = z2;
                    z = true;
                } else {
                    z = true;
                    if (i5 == size - 1) {
                        z3 = true;
                    }
                }
                bufferInfo = bufferInfo2;
                int dequeueInputBuffer = this.d.dequeueInputBuffer(2500L);
                if (dequeueInputBuffer >= 0) {
                    int i7 = z3 ? i5 - 1 : i5 + 1;
                    ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                    MemoryFile memoryFile = (MemoryFile) arrayList.get(i7);
                    i2 = size;
                    byte[] bArr = this.c.i;
                    byteBuffer.clear();
                    InputStream inputStream2 = memoryFile.getInputStream();
                    try {
                        int limit = byteBuffer.limit();
                        int i8 = 0;
                        while (true) {
                            int read = inputStream2.read(bArr);
                            if (read <= 0) {
                                try {
                                    break;
                                } catch (Exception unused) {
                                }
                            } else {
                                inputStream = inputStream2;
                                if (i8 + read > limit) {
                                    read = limit - i8;
                                }
                                int i9 = read;
                                int i10 = limit;
                                try {
                                    byteBuffer.put(bArr, 0, i9);
                                    i8 += i9;
                                    limit = i10;
                                    inputStream2 = inputStream;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        th.toString();
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        i4 = 0;
                                        if (i4 > 0) {
                                        }
                                    } catch (Throwable th2) {
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                        }
                                        throw th2;
                                    }
                                }
                            }
                        }
                        inputStream2.close();
                        i4 = i8;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream2;
                    }
                    if (i4 > 0) {
                        return false;
                    }
                    this.d.queueInputBuffer(dequeueInputBuffer, 0, i4, i6 * 26 * j, 0);
                    i6++;
                    i5 = i7;
                } else {
                    i2 = size;
                }
                byteBufferArr = inputBuffers;
                int dequeueOutputBuffer = this.d.dequeueOutputBuffer(bufferInfo, 2500L);
                if (dequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer2 = outputBuffers[dequeueOutputBuffer];
                    i3 = i5;
                    if (this.i == -1) {
                        this.i = this.e.addTrack(this.d.getOutputFormat());
                        this.e.start();
                    }
                    byteBufferArr2 = outputBuffers;
                    if (bufferInfo.presentationTimeUs >= j2) {
                        return z;
                    }
                    this.e.writeSampleData(this.i, byteBuffer2, bufferInfo);
                    this.d.releaseOutputBuffer(dequeueOutputBuffer, false);
                } else {
                    i3 = i5;
                    byteBufferArr2 = outputBuffers;
                }
                s3q0 s3q0Var = s3q0.a;
            }
            bufferInfo2 = bufferInfo;
            inputBuffers = byteBufferArr;
            i5 = i3;
            outputBuffers = byteBufferArr2;
            size = i2;
            z2 = false;
        }
        return z2;
    }

    public final void b() {
        this.b = false;
        try {
            MediaCodec mediaCodec = this.d;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (Throwable th) {
            th.toString();
        }
        MediaCodec mediaCodec2 = this.d;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        this.d = null;
    }

    public final void c(final boolean z) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.b = false;
        asu0.a.getClass();
        asu0.h().execute(new Runnable() { // from class: xsna.yna0
            @Override // java.lang.Runnable
            public final void run() {
                zna0 zna0Var = zna0.this;
                boolean z2 = z;
                synchronized (zna0Var) {
                    zna0Var.b();
                    s3q0 s3q0Var = s3q0.a;
                }
                zna0Var.c.a();
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    synchronized (zna0Var.a) {
                        arrayList.addAll(zna0Var.a);
                        zna0Var.a.clear();
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Future) it.next()).cancel(true);
                    }
                }
            }
        });
    }

    public final void d() {
        MediaMuxer mediaMuxer;
        if (this.i != -1 && (mediaMuxer = this.e) != null) {
            mediaMuxer.stop();
        }
        MediaMuxer mediaMuxer2 = this.e;
        if (mediaMuxer2 != null) {
            mediaMuxer2.release();
        }
        this.i = -1;
    }
}
