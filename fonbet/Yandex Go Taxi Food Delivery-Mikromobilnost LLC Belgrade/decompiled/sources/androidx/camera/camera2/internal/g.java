package androidx.camera.camera2.internal;

import androidx.camera.core.impl.DeferrableSurface;
import defpackage.f48;
import defpackage.fyq0;
import defpackage.geb1;
import defpackage.iqs;
import defpackage.jyq0;
import defpackage.k6u;
import defpackage.mh3;
import defpackage.sgb1;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* loaded from: classes10.dex */
public final class g implements iqs {
    public final /* synthetic */ f48 a;
    public final /* synthetic */ l b;

    public g(l lVar, f48 f48Var) {
        this.b = lVar;
        this.a = f48Var;
    }

    @Override // defpackage.iqs
    public final void onFailure(Throwable th) {
        jyq0 jyq0Var;
        boolean z = th instanceof DeferrableSurface.SurfaceClosedException;
        l lVar = this.b;
        if (!z) {
            if (th instanceof CancellationException) {
                lVar.w("Unable to configure camera cancelled");
                return;
            }
            Camera2CameraImpl$InternalState camera2CameraImpl$InternalState = lVar.x;
            Camera2CameraImpl$InternalState camera2CameraImpl$InternalState2 = Camera2CameraImpl$InternalState.OPENED;
            if (camera2CameraImpl$InternalState == camera2CameraImpl$InternalState2) {
                this.b.H(camera2CameraImpl$InternalState2, new androidx.camera.core.b(4, th), true);
            }
            sgb1.e("Camera2CameraImpl", "Unable to configure camera " + this.b, th);
            l lVar2 = this.b;
            if (lVar2.F == this.a) {
                lVar2.F();
                return;
            }
            return;
        }
        DeferrableSurface a = ((DeferrableSurface.SurfaceClosedException) th).a();
        Iterator it = lVar.a.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                jyq0Var = null;
                break;
            } else {
                jyq0Var = (jyq0) it.next();
                if (jyq0Var.b().contains(a)) {
                    break;
                }
            }
        }
        if (jyq0Var != null) {
            l lVar3 = this.b;
            k6u f = geb1.f();
            fyq0 fyq0Var = jyq0Var.f;
            if (fyq0Var != null) {
                new Throwable();
                lVar3.w("Posting surface closed");
                f.execute(new mh3(29, fyq0Var, jyq0Var));
            }
        }
    }

    @Override // defpackage.iqs
    public final void onSuccess(Object obj) {
        if (this.b.M.b() == 2 && this.b.x == Camera2CameraImpl$InternalState.OPENED) {
            this.b.G(Camera2CameraImpl$InternalState.CONFIGURED);
        }
    }
}
