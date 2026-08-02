package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.b;
import yads.gv;
import yads.hm2;
import yads.hw2;
import yads.po2;

/* loaded from: classes7.dex */
public final class hj81 extends gn81 {
    public final gi61 B;
    public final mj31 C;
    public final e381 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj81(Context context, d881 d881Var, fe81 fe81Var, v981 v981Var, mb71 mb71Var) {
        super(context, d881Var, fe81Var, v981Var, mb71Var, new ju81());
        gi61 gi61Var = new gi61();
        new ai71();
        mj31 mj31Var = new mj31(fe81Var, v981Var);
        this.B = gi61Var;
        this.C = mj31Var;
        e381 e381Var = null;
        if (d881Var != null) {
            po2 po2Var = d881Var.p;
            if (po2Var.b) {
                hw2 hw2Var = po2Var.d;
                if (hw2Var != null) {
                    e381Var = new a441(context, fe81Var, v981Var, hw2Var);
                }
            } else {
                gv gvVar = po2Var.c;
                if (gvVar != null) {
                    e381Var = new rr41(gvVar, gi61Var);
                }
            }
        }
        this.D = e381Var;
    }

    @Override // defpackage.gn81, defpackage.rk81
    public final void a(int i, Bundle bundle) {
        if (i == 13) {
            c();
        } else {
            super.a(i, bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        Map f;
        mj31 mj31Var = this.C;
        mj31Var.getClass();
        hn71 hn71Var = new hn71(3, (HashMap) (0 == true ? 1 : 0));
        d881 d881Var = this.b;
        Boolean valueOf = d881Var != null ? Boolean.valueOf(d881Var.p.b) : null;
        if (jl40.l(valueOf, Boolean.TRUE)) {
            f = g8e.z("rewarding_side", "server_side");
        } else if (jl40.l(valueOf, Boolean.FALSE)) {
            f = g8e.z("rewarding_side", "client_side");
        } else {
            if (valueOf != null) {
                w511.b();
                return;
            }
            f = b.f();
        }
        hn71Var.r(f, "reward_info");
        mj31Var.s(this.a, d881Var, hm2.w, hn71Var);
        e381 e381Var = this.D;
        if (e381Var != null) {
            e381Var.mo24a();
        }
    }
}
