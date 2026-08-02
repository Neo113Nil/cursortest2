package androidx.heifwriter;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.heifwriter.HeifEncoder;
import defpackage.wvb1;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class c extends HeifEncoder.a {
    public boolean a;
    public final /* synthetic */ d b;

    public c(d dVar) {
        this.b = dVar;
    }

    @Override // androidx.heifwriter.HeifEncoder.a
    public final void a() {
        e(null);
    }

    @Override // androidx.heifwriter.HeifEncoder.a
    public final void b(ByteBuffer byteBuffer) {
        d dVar = this.b;
        int i = dVar.w;
        if (this.a) {
            return;
        }
        if (dVar.B == null) {
            e(new IllegalStateException("Output buffer received before format info"));
            return;
        }
        if (dVar.C < dVar.c * i) {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), 0L, 0);
            dVar.y.writeSampleData(dVar.B[dVar.C / dVar.c], byteBuffer, bufferInfo);
        }
        int i2 = dVar.C + 1;
        dVar.C = i2;
        if (i2 == i * dVar.c) {
            e(null);
        }
    }

    @Override // androidx.heifwriter.HeifEncoder.a
    public final void c(MediaCodec.CodecException codecException) {
        e(codecException);
    }

    @Override // androidx.heifwriter.HeifEncoder.a
    public final void d(MediaFormat mediaFormat) {
        if (this.a) {
            return;
        }
        d dVar = this.b;
        if (dVar.B != null) {
            e(new IllegalStateException("Output format changed after muxer started"));
            return;
        }
        try {
            dVar.c = mediaFormat.getInteger("grid-rows") * mediaFormat.getInteger("grid-cols");
        } catch (ClassCastException | NullPointerException unused) {
            dVar.c = 1;
        }
        dVar.B = new int[dVar.w];
        int i = 0;
        while (i < dVar.B.length) {
            mediaFormat.setInteger("is-default", i == 0 ? 1 : 0);
            dVar.B[i] = dVar.y.addTrack(mediaFormat);
            i++;
        }
        dVar.y.start();
        dVar.A.set(true);
        dVar.c();
    }

    public final void e(IllegalStateException illegalStateException) {
        if (this.a) {
            return;
        }
        this.a = true;
        wvb1 wvb1Var = this.b.x;
        synchronized (wvb1Var) {
            if (!wvb1Var.a) {
                wvb1Var.a = true;
                wvb1Var.b = illegalStateException;
                wvb1Var.notifyAll();
            }
        }
    }
}
