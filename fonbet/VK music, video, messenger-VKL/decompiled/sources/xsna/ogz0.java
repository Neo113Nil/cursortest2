package xsna;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ogz0 {
    public final oly0 a;
    public final thz0 b;
    public final Context c;
    public final riz0 d;
    public boolean e = true;

    public ogz0(oly0 oly0Var, thz0 thz0Var, Context context) {
        this.a = oly0Var;
        this.b = thz0Var;
        this.c = context;
        this.d = new riz0(context);
    }

    public final nuy0 a(tez0 tez0Var, tjz0 tjz0Var, gdy0 gdy0Var, FrameLayout frameLayout, phz0 phz0Var) {
        if (!tez0Var.b0.isEmpty()) {
            return new lwy0(((wfy0) tez0Var.b0.get(0)).U, tjz0Var, gdy0Var, phz0Var, frameLayout, this.d, this.c);
        }
        if (tez0Var.c0 == null) {
            return new vxy0(tjz0Var, gdy0Var, phz0Var, frameLayout, this.d, this.c);
        }
        fzy0 fzy0Var = new fzy0(tjz0Var, gdy0Var, phz0Var, frameLayout, this.d, this.c);
        fzy0Var.addView(fzy0Var.b);
        fzy0Var.addView(fzy0Var.h);
        fzy0Var.addView(fzy0Var.i);
        fzy0Var.addView(fzy0Var.m);
        fzy0Var.addView(gdy0Var);
        return fzy0Var;
    }
}
