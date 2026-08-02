package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.vk.media.pipeline.codec.CodecDrainer;
import com.vk.media.pipeline.session.transform.task.transcode.TranscodeException;
import com.vk.media.pipeline.stat.ErrorStatBuilder;
import java.nio.ByteBuffer;
import xsna.kfp0;

/* compiled from: VideoConsumer.kt */
/* loaded from: classes3.dex */
public final class hds0 implements gyi {
    public final csp a;
    public final rfp0 b;
    public final pms0 c;
    public final ju4 d;
    public final hu5 e;
    public b0u f;
    public fkn0 g;
    public kfp0<zis0> h;
    public zis0 i;
    public long j = Long.MIN_VALUE;
    public volatile TranscodeException k;

    /* compiled from: VideoConsumer.kt */
    public final class a implements kfp0.a<zis0> {
        public a() {
        }

        @Override // xsna.kfp0.a
        public final CodecDrainer.DrainStatus a(MediaFormat mediaFormat) {
            hds0 hds0Var = hds0.this;
            hds0Var.b.e.c(mediaFormat);
            kfp0<zis0> kfp0Var = hds0Var.h;
            if (kfp0Var == null) {
                kfp0Var = null;
            }
            kfp0Var.getClass();
            return CodecDrainer.DrainStatus.CONTINUE;
        }

        @Override // xsna.kfp0.a
        public final CodecDrainer.DrainStatus b(CodecDrainer<zis0> codecDrainer, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            int remaining = byteBuffer.remaining();
            hds0 hds0Var = hds0.this;
            if (remaining == 0 && bufferInfo.flags == 0 && bufferInfo.presentationTimeUs == 0) {
                ((ErrorStatBuilder) hds0Var.d.b).k.add(ErrorStatBuilder.EmptySampleDataOrigin.ENCODER.toString());
            }
            hds0Var.b.e.b(byteBuffer, bufferInfo);
            kfp0<zis0> kfp0Var = hds0Var.h;
            if (kfp0Var == null) {
                kfp0Var = null;
            }
            return kfp0Var.b(codecDrainer, bufferInfo);
        }
    }

    public hds0(csp cspVar, rfp0 rfp0Var, pms0 pms0Var, HandlerThread handlerThread, ju4 ju4Var) {
        this.a = cspVar;
        this.b = rfp0Var;
        this.c = pms0Var;
        this.d = ju4Var;
        this.e = new hu5(new Handler(handlerThread.getLooper()));
        f(new odc0(this, 27));
    }

    @Override // xsna.gyi
    public final void a(final int i, final long j, final kes0 kes0Var) {
        f(new gzs() { // from class: xsna.gds0
            @Override // xsna.gzs
            public final Object invoke() {
                hds0 hds0Var = hds0.this;
                long j2 = hds0Var.j;
                long j3 = j;
                if (j2 == Long.MIN_VALUE) {
                    f100 f100Var = hds0Var.a.d;
                    if (f100Var != null) {
                        f100Var.e("VideoConsumer", "duplicating first empty frame");
                    }
                    hds0Var.j = j3;
                }
                int i2 = 0;
                while (true) {
                    int i3 = i;
                    if (i2 >= i3) {
                        return s3q0.a;
                    }
                    i2++;
                    long j4 = hds0Var.j + ((long) ((((j3 - r5) * 1.0d) / (i3 + 1)) * i2));
                    fkn0 fkn0Var = hds0Var.g;
                    kfp0<zis0> kfp0Var = null;
                    if (fkn0Var == null) {
                        fkn0Var = null;
                    }
                    fkn0Var.a(i3, j4, kes0Var);
                    kfp0<zis0> kfp0Var2 = hds0Var.h;
                    if (kfp0Var2 != null) {
                        kfp0Var = kfp0Var2;
                    }
                    kfp0Var.a();
                }
            }
        });
    }

    @Override // xsna.gyi
    public final void b(f7s0 f7s0Var) {
        f(new com.vk.movika.sdk.base.ui.z(16, this, f7s0Var));
    }

    @Override // xsna.gyi
    public final void c(ocs ocsVar) {
        f(new fk(23, this, ocsVar));
    }

    @Override // xsna.gyi
    public final void d(kes0 kes0Var, long j) {
        f(new t9s(j, this, kes0Var, 2));
    }

    @Override // xsna.gyi
    public final void e(l8l l8lVar) {
        f(new plq0(2, this, l8lVar));
    }

    public final void f(gzs<s3q0> gzsVar) {
        this.e.a(new com.vk.catalog2.common.ui.holders.b(27, gzsVar, this));
        TranscodeException transcodeException = this.k;
        if (transcodeException == null) {
            return;
        }
        this.k = null;
        throw transcodeException;
    }
}
