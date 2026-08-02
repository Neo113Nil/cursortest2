package yads;

/* loaded from: classes10.dex */
public final class zw implements xw, rh1 {
    public static final Object j = new Object();
    public final x93 b;
    public final x93 c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public String h;
    public String i;

    public zw(ax axVar, bx bxVar, sh1 sh1Var) {
        this.b = axVar;
        this.c = bxVar;
        for (sw swVar : sw.values()) {
            a(sh1Var, swVar);
        }
        ((uh1) sh1Var).a(this);
    }

    public final boolean a() {
        boolean z;
        synchronized (j) {
            z = this.f;
        }
        return z;
    }

    public final String b() {
        String str;
        synchronized (j) {
            str = this.d;
        }
        return str;
    }

    public final String c() {
        String str;
        synchronized (j) {
            str = this.e;
        }
        return str;
    }

    public final String d() {
        String str;
        synchronized (j) {
            str = this.g;
        }
        return str;
    }

    public final String e() {
        String str;
        synchronized (j) {
            str = this.h;
        }
        return str;
    }

    public final void a(sh1 sh1Var, sw swVar) {
        ix a = this.c.a(sh1Var, swVar);
        if (a == null) {
            a = this.b.a(sh1Var, swVar);
        }
        a(a);
    }

    public final void a(ix ixVar) {
        if (ixVar instanceof dx) {
            this.f = ((dx) ixVar).a;
            return;
        }
        if (ixVar instanceof ex) {
            this.d = ((ex) ixVar).a;
            return;
        }
        if (ixVar instanceof fx) {
            this.e = ((fx) ixVar).a;
            return;
        }
        if (ixVar instanceof gx) {
            this.g = ((gx) ixVar).a;
        } else if (ixVar instanceof hx) {
            this.h = ((hx) ixVar).a;
        } else if (ixVar instanceof cx) {
            this.i = ((cx) ixVar).a;
        }
    }
}
