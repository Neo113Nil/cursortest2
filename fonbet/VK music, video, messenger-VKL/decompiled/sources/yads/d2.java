package yads;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;

/* loaded from: classes10.dex */
public final class d2 implements i2 {
    public final ov2 a;

    public d2(ov2 ov2Var) {
        this.a = ov2Var;
    }

    @Override // yads.i2
    public final h2 a(Activity activity, RelativeLayout relativeLayout, q2 q2Var, b2 b2Var, Intent intent, Window window, x1 x1Var) {
        if (x1Var == null) {
            return null;
        }
        v9 v9Var = x1Var.a;
        d4 d4Var = x1Var.b;
        x12 x12Var = x1Var.e;
        qu2 a = gx2.a().a(window.getContext());
        if (x12Var == null) {
            return null;
        }
        return new g2(activity, relativeLayout, window, x12Var, v9Var, q2Var, b2Var, d4Var, this.a, x1Var.f, a, new ay0(activity), new fy0(d4Var.a));
    }
}
