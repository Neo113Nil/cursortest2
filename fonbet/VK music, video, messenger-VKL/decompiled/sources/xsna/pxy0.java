package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class pxy0 implements View.OnClickListener {
    public final /* synthetic */ wty0 b;
    public final /* synthetic */ rxy0 c;

    public pxy0(rxy0 rxy0Var, wty0 wty0Var) {
        this.c = rxy0Var;
        this.b = wty0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = view.getContext();
        rxy0 rxy0Var = this.c;
        fvy0 fvy0Var = rxy0Var.d;
        if (fvy0Var == null || !fvy0Var.c()) {
            fvy0 fvy0Var2 = rxy0Var.d;
            if (fvy0Var2 == null) {
                de.L(this.b.b, null, null, null, context);
            } else {
                fvy0Var2.b(context);
            }
        }
    }
}
