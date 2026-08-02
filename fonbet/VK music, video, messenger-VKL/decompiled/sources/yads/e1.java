package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class e1 {
    public final Context a;
    public final i1 b;
    public final w0 c;
    public final r53 d;
    public final d1 e;

    public e1(Context context, i1 i1Var, w0 w0Var, r53 r53Var) {
        this.a = context;
        this.b = i1Var;
        this.c = w0Var;
        this.d = r53Var;
        this.e = new d1(this);
    }

    public final void a() {
        ((z0) this.c).a(this.a, (l1) this.e);
        ((z0) this.c).a(this.a, this.e);
    }

    public final void b() {
        this.b.a(h1.c);
        ((z0) this.c).b(this.a, this.e);
        w0 w0Var = this.c;
        Context context = this.a;
        d1 d1Var = this.e;
        z0 z0Var = (z0) w0Var;
        synchronized (z0Var.a) {
            z0Var.c.remove(d1Var);
            z0Var.b(context);
            s3q0 s3q0Var = s3q0.a;
        }
        this.d.a(le1.d, this);
    }

    public final void c() {
        this.d.b(le1.d, this);
        ((z0) this.c).a(this.a, (l1) this.e);
        ((z0) this.c).a(this.a, this.e);
        this.b.b(h1.c);
    }

    public final void d() {
        this.b.a(h1.d);
    }

    public final void e() {
        this.b.b(h1.d);
    }

    public /* synthetic */ e1(Context context, d4 d4Var, ov2 ov2Var, v9 v9Var, g1 g1Var, er0 er0Var) {
        this(context.getApplicationContext(), new i1(context, d4Var, ov2Var, v9Var, g1Var, er0Var), x0.a(), q53.a());
    }
}
