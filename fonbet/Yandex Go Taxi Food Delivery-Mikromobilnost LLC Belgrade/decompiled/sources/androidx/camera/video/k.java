package androidx.camera.video;

import android.view.Surface;
import defpackage.bh11;
import defpackage.d7g0;
import defpackage.euy;
import defpackage.gii0;
import defpackage.hiv;
import defpackage.sgb1;
import defpackage.vg10;
import defpackage.znw0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class k {
    public final Executor a;
    public final Executor b;
    public final d7g0 c;
    public androidx.camera.video.internal.encoder.j d = null;
    public Surface e = null;
    public znw0 f = null;
    public androidx.camera.core.impl.utils.executor.b g = null;
    public gii0 h = null;
    public VideoEncoderSession$VideoEncoderState i = VideoEncoderSession$VideoEncoderState.NOT_INITIALIZED;
    public euy j = new hiv(1, new IllegalStateException("Cannot close the encoder before configuring."));
    public androidx.concurrent.futures.b k = null;
    public euy l = new hiv(1, new IllegalStateException("Cannot close the encoder before configuring."));
    public androidx.concurrent.futures.b m = null;

    public k(d7g0 d7g0Var, androidx.camera.core.impl.utils.executor.b bVar, Executor executor) {
        this.a = executor;
        this.b = bVar;
        this.c = d7g0Var;
    }

    public final void a() {
        int ordinal = this.i.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            b();
            return;
        }
        if (ordinal == 2 || ordinal == 3) {
            Objects.toString(this.i);
            sgb1.g(3, "VideoEncoderSession");
            this.i = VideoEncoderSession$VideoEncoderState.PENDING_RELEASE;
        } else if (ordinal == 4) {
            sgb1.g(3, "VideoEncoderSession");
        } else {
            vg10.s("State ", this.i, " is not handled");
        }
    }

    public final void b() {
        int ordinal = this.i.ordinal();
        if (ordinal == 0) {
            this.i = VideoEncoderSession$VideoEncoderState.RELEASED;
            return;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            VideoEncoderSession$VideoEncoderState videoEncoderSession$VideoEncoderState = this.i;
            if (ordinal != 4) {
                vg10.p("State ", videoEncoderSession$VideoEncoderState, " is not handled");
                return;
            } else {
                Objects.toString(videoEncoderSession$VideoEncoderState);
                sgb1.g(3, "VideoEncoderSession");
                return;
            }
        }
        this.i = VideoEncoderSession$VideoEncoderState.RELEASED;
        this.m.b(this.d);
        this.f = null;
        androidx.camera.video.internal.encoder.j jVar = this.d;
        if (jVar == null) {
            sgb1.g(5, "VideoEncoderSession");
            this.k.b(null);
            return;
        }
        Objects.toString(jVar);
        sgb1.g(3, "VideoEncoderSession");
        androidx.camera.video.internal.encoder.j jVar2 = this.d;
        jVar2.i.execute(new androidx.camera.video.internal.encoder.c(1, jVar2));
        this.d.j.c(new bh11(22, this), this.b);
        this.d = null;
    }

    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
