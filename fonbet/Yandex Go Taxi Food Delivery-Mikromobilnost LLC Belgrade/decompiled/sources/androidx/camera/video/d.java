package androidx.camera.video;

import android.media.MediaMuxer;
import androidx.camera.video.internal.encoder.EncodeException;
import defpackage.aq6;
import defpackage.b84;
import defpackage.ny61;
import defpackage.pyn;
import defpackage.sgb1;
import defpackage.xyn;

/* loaded from: classes10.dex */
public final class d implements xyn {
    public final /* synthetic */ androidx.concurrent.futures.b a;
    public final /* synthetic */ c b;
    public final /* synthetic */ b84 c;
    public final /* synthetic */ g w;

    public d(g gVar, androidx.concurrent.futures.b bVar, c cVar, b84 b84Var) {
        this.w = gVar;
        this.a = bVar;
        this.b = cVar;
        this.c = b84Var;
    }

    @Override // defpackage.xyn
    public final void C(pyn pynVar) {
        g gVar = this.w;
        if (gVar.K == Recorder$AudioState.DISABLED) {
            pynVar.close();
            ny61.f("Audio is not enabled but audio encoded data is being produced.");
            return;
        }
        MediaMuxer mediaMuxer = gVar.D;
        b84 b84Var = this.c;
        if (mediaMuxer == null) {
            if (gVar.s) {
                sgb1.g(3, "Recorder");
            } else {
                gVar.Y.c(new aq6(pynVar));
                if (gVar.X != null) {
                    sgb1.g(3, "Recorder");
                    gVar.E(b84Var);
                } else {
                    sgb1.g(3, "Recorder");
                }
            }
            pynVar.close();
            return;
        }
        try {
            gVar.L(pynVar, b84Var);
            pynVar.close();
        } catch (Throwable th) {
            if (pynVar != null) {
                try {
                    pynVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.xyn
    public final void e(EncodeException encodeException) {
        if (this.w.Z == null) {
            this.b.accept(encodeException);
        }
    }

    @Override // defpackage.xyn
    public final void l() {
        this.a.b(null);
    }

    @Override // defpackage.xyn
    public final void w(androidx.camera.video.internal.encoder.h hVar) {
        this.w.J = hVar;
    }
}
