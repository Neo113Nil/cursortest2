package xsna;

import android.view.View;
import java.lang.ref.WeakReference;
import xsna.izy0;
import xsna.thz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class q2z0 extends izy0.a {
    public final /* synthetic */ View a;
    public final /* synthetic */ r2z0 b;

    public q2z0(r2z0 r2z0Var, View view) {
        this.b = r2z0Var;
        this.a = view;
    }

    @Override // xsna.izy0.a
    public final void c() {
        wvy0 closeButton;
        r2z0 r2z0Var = this.b;
        thz0 thz0Var = r2z0Var.o;
        if (thz0Var != null) {
            thz0Var.d(this.a, new thz0.b[0]);
            WeakReference weakReference = r2z0Var.n;
            if (weakReference != null && (closeButton = ((rxy0) weakReference.get()).c.getCloseButton()) != null) {
                r2z0Var.o.f(new thz0.b(closeButton));
            }
            r2z0Var.o.h();
        }
    }
}
