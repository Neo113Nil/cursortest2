package xsna;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class u4z0 implements View.OnClickListener {
    public final /* synthetic */ w4z0 b;

    public u4z0(w4z0 w4z0Var) {
        this.b = w4z0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wty0 wty0Var;
        w4z0 w4z0Var = this.b;
        nxy0 nxy0Var = w4z0Var.o;
        if (nxy0Var == null || (wty0Var = nxy0Var.L) == null) {
            return;
        }
        fvy0 fvy0Var = w4z0Var.l;
        if (fvy0Var == null || !fvy0Var.c()) {
            Activity activity = (Activity) w4z0Var.g.get();
            if (fvy0Var == null || activity == null) {
                de.L(wty0Var.b, null, null, null, w4z0Var.h);
            } else {
                fvy0Var.b(activity);
            }
        }
    }
}
