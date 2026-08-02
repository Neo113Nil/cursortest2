package yads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes10.dex */
public final class rw2 implements ar2 {
    public final Context a;
    public final v9 b;
    public final /* synthetic */ uw2 c;

    public rw2(uw2 uw2Var, Context context, v9 v9Var) {
        this.c = uw2Var;
        this.a = context;
        this.b = v9Var;
    }

    @Override // yads.ar2
    public final void a() {
        uw2 uw2Var = this.c;
        uw2Var.e.a(this.a, this.b, uw2Var.d);
        this.c.e.a(this.a, this.b, (f32) null);
    }

    @Override // yads.ar2
    public final void a(e22 e22Var) {
        v9 v9Var = this.b;
        d4 d4Var = this.c.a.c;
        g32 g32Var = new g32();
        uw2 uw2Var = this.c;
        uw2Var.e.a(this.a, this.b, uw2Var.d);
        cu2 cu2Var = this.c.e;
        Context context = this.a;
        v9 v9Var2 = this.b;
        cu2Var.getClass();
        new gp2((Map) null, 3);
        gp2 a = g32Var.a(v9Var, d4Var, e22Var);
        ep2 ep2Var = ep2.c;
        a.b("success", "status");
        cu2Var.a(context, v9Var2, dp2.h, a);
    }
}
