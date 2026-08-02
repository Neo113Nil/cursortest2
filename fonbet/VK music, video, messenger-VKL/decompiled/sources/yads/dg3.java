package yads;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class dg3 implements og3 {
    public final nf3 a;
    public final lg3 b;
    public final zg3 c;
    public final ch3 d;
    public final nh3 e;
    public final w5 f;
    public final cl3 g;
    public final eg3 h;
    public final boolean i;
    public kg3 j;
    public boolean k;

    public dg3(nf3 nf3Var, lg3 lg3Var, zg3 zg3Var, ch3 ch3Var, nh3 nh3Var, w5 w5Var, dl3 dl3Var, eg3 eg3Var, boolean z) {
        this.a = nf3Var;
        this.b = lg3Var;
        this.c = zg3Var;
        this.d = ch3Var;
        this.e = nh3Var;
        this.f = w5Var;
        this.g = dl3Var;
        this.h = eg3Var;
        this.i = z;
    }

    @Override // yads.og3
    public final void a() {
        if (this.k) {
            this.e.a(lh3.e);
            this.g.j();
        }
    }

    @Override // yads.og3
    public final void b() {
        if (this.k) {
            this.e.a(lh3.i);
            this.g.f();
        }
    }

    @Override // yads.og3
    public final void c() {
        this.k = true;
        this.e.a(lh3.e);
        zg3 zg3Var = this.c;
        if (!zg3Var.d) {
            zg3Var.d = true;
            zg3Var.b.a();
            zg3Var.c.post(new yg3(zg3Var));
        }
        this.j = new kg3(this.b, this.g);
        this.h.b(this.a);
    }

    @Override // yads.og3
    public final void d() {
        this.k = false;
        this.e.a(lh3.g);
        if (this.i) {
            this.g.b();
        }
        this.c.a();
        this.d.b();
        this.h.c(this.a);
        this.b.a((dg3) null);
        this.h.g(this.a);
    }

    @Override // yads.og3
    public final void e() {
        this.g.g();
        this.k = false;
        this.e.a(lh3.f);
        this.c.a();
        this.d.b();
        this.h.h(this.a);
        this.b.a((dg3) null);
        this.h.g(this.a);
    }

    @Override // yads.og3
    public final void f() {
        this.e.a(lh3.e);
        if (this.k) {
            this.g.c();
        }
        zg3 zg3Var = this.c;
        if (!zg3Var.d) {
            zg3Var.d = true;
            zg3Var.b.a();
            zg3Var.c.post(new yg3(zg3Var));
        }
        this.h.d(this.a);
    }

    @Override // yads.og3
    public final void h() {
        this.e.a(lh3.d);
        this.f.a(v5.v);
        this.h.j(this.a);
    }

    @Override // yads.og3
    public final void i() {
        this.e.a(lh3.h);
        if (this.k) {
            this.g.d();
        }
        this.h.k(this.a);
    }

    @Override // yads.og3
    public final void onVolumeChanged(float f) {
        this.g.a(f);
        kg3 kg3Var = this.j;
        if (kg3Var != null) {
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (!kg3Var.b) {
                    kg3Var.b = true;
                    kg3Var.a.l();
                }
            } else if (kg3Var.b) {
                kg3Var.b = false;
                kg3Var.a.a();
            }
        }
        this.h.a(this.a, f);
    }

    @Override // yads.og3
    public final void a(ng3 ng3Var) {
        lh3 lh3Var;
        this.k = false;
        nh3 nh3Var = this.e;
        if (nh3Var.a.contains(lh3.d)) {
            lh3Var = lh3.j;
        } else {
            lh3Var = lh3.k;
        }
        this.e.a(lh3Var);
        this.c.a();
        this.d.a(ng3Var);
        this.g.a(ng3Var);
        this.h.a(this.a, ng3Var);
        this.b.a((dg3) null);
        this.h.g(this.a);
    }
}
