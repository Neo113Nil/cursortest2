package yads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class xr2 extends ry0 {
    public final xl2 m;
    public final cu2 n;
    public final ps2 o;

    public xr2(Context context, v9 v9Var, d4 d4Var, ov2 ov2Var, cy0 cy0Var, xl2 xl2Var, qs2 qs2Var, j22 j22Var, cu2 cu2Var) {
        super(context, v9Var, d4Var, ov2Var, cy0Var, new m5());
        this.m = xl2Var;
        this.n = cu2Var;
        this.o = qs2Var.a(context, v9Var, ov2Var, d4Var);
        j22Var.a(v9Var);
    }

    @Override // yads.ry0, yads.y83, yads.f4
    public final void a(int i, Bundle bundle) {
        if (i == 13) {
            h();
        } else {
            super.a(i, bundle);
        }
    }

    public final void h() {
        Object obj;
        rr2 rr2Var;
        cu2 cu2Var = this.n;
        Context context = this.a;
        v9 v9Var = this.b;
        cu2Var.getClass();
        Boolean bool = null;
        gp2 gp2Var = new gp2((Map) null, 3);
        if (v9Var != null && (rr2Var = v9Var.r) != null) {
            bool = Boolean.valueOf(rr2Var.b);
        }
        if (epx.f(bool, Boolean.TRUE)) {
            obj = xsna.dt.b("rewarding_side", "server_side");
        } else if (epx.f(bool, Boolean.FALSE)) {
            obj = xsna.dt.b("rewarding_side", "client_side");
        } else {
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            obj = jgp.b;
        }
        gp2Var.b(obj, "reward_info");
        cu2Var.a(context, v9Var, dp2.C, gp2Var);
        ps2 ps2Var = this.o;
        if (ps2Var != null) {
            ps2Var.a();
        }
    }

    public final void a(wl2 wl2Var) {
        this.l = wl2Var;
        this.m.a = wl2Var;
    }

    @Override // yads.ry0
    public final ry0 f() {
        return this;
    }
}
