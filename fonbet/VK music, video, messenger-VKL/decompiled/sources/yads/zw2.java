package yads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes10.dex */
public final class zw2 implements ar2 {
    public final v9 a;
    public final Context b;
    public final /* synthetic */ bx2 c;

    public zw2(bx2 bx2Var, Context context, v9 v9Var) {
        this.c = bx2Var;
        this.a = v9Var;
        this.b = context.getApplicationContext();
    }

    @Override // yads.ar2
    public final void a() {
        v9 v9Var = this.a;
        d4 d4Var = this.c.f;
        g32 g32Var = new g32();
        bx2 bx2Var = this.c;
        bx2Var.d.a(this.b, this.a, bx2Var.g);
        cu2 cu2Var = this.c.d;
        Context context = this.b;
        v9 v9Var2 = this.a;
        cu2Var.getClass();
        new gp2((Map) null, 3);
        gp2 a = g32Var.a(v9Var, d4Var, null);
        ep2 ep2Var = ep2.c;
        a.b("success", "status");
        cu2Var.a(context, v9Var2, dp2.h, a);
    }

    @Override // yads.ar2
    public final void a(e22 e22Var) {
        v9 v9Var = this.a;
        d4 d4Var = this.c.f;
        g32 g32Var = new g32();
        bx2 bx2Var = this.c;
        bx2Var.d.a(this.b, this.a, bx2Var.g);
        cu2 cu2Var = this.c.d;
        Context context = this.b;
        v9 v9Var2 = this.a;
        cu2Var.getClass();
        new gp2((Map) null, 3);
        gp2 a = g32Var.a(v9Var, d4Var, e22Var);
        ep2 ep2Var = ep2.c;
        a.b("success", "status");
        cu2Var.a(context, v9Var2, dp2.h, a);
    }
}
