package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes7.dex */
public final class au81 implements hk61 {
    public final ArrayList a;
    public final hk61 b;

    public au81(ArrayList arrayList) {
        this.a = arrayList;
        this.b = (hk61) a.R(arrayList);
    }

    @Override // defpackage.hk61
    public final z681 a(xg81 xg81Var) {
        z681 a;
        hk61 hk61Var = this.b;
        return (hk61Var == null || (a = hk61Var.a(xg81Var)) == null) ? new l081(null, new IllegalStateException("No native ad available for binding")) : a;
    }

    @Override // defpackage.hk61
    public final qb71 b() {
        hk61 hk61Var = this.b;
        if (hk61Var != null) {
            return hk61Var.b();
        }
        return null;
    }

    @Override // defpackage.hk61
    public final String c() {
        hk61 hk61Var = this.b;
        String c = hk61Var != null ? hk61Var.c() : null;
        return c == null ? "" : c;
    }

    @Override // defpackage.hk61
    public final rr41 d() {
        rr41 d;
        hk61 hk61Var = this.b;
        if (hk61Var != null && (d = hk61Var.d()) != null) {
            return d;
        }
        Object obj = null;
        return new rr41(14, obj, obj);
    }

    @Override // defpackage.hk61
    public final xn61 e() {
        hk61 hk61Var = this.b;
        if (hk61Var != null) {
            return hk61Var.e();
        }
        return null;
    }

    @Override // defpackage.hk61
    public final List f() {
        hk61 hk61Var = this.b;
        if (hk61Var != null) {
            return hk61Var.f();
        }
        return null;
    }

    @Override // defpackage.hk61
    public final String g() {
        hk61 hk61Var = this.b;
        if (hk61Var != null) {
            return hk61Var.g();
        }
        return null;
    }

    @Override // defpackage.hk61
    public final m081 getAdAssets() {
        m081 adAssets;
        hk61 hk61Var = this.b;
        return (hk61Var == null || (adAssets = hk61Var.getAdAssets()) == null) ? new m081(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false) : adAssets;
    }

    @Override // defpackage.hk61
    public final void h() {
        hk61 hk61Var = this.b;
        if (hk61Var != null) {
            hk61Var.h();
        }
    }

    @Override // defpackage.hk61
    public final void i(xg81 xg81Var, t171 t171Var) {
        hk61 hk61Var = this.b;
        if (hk61Var != null) {
            hk61Var.i(xg81Var, t171Var);
        }
    }

    @Override // defpackage.hk61
    public final void j(nr41 nr41Var) {
        hk61 hk61Var = this.b;
        if (hk61Var != null) {
            hk61Var.j(nr41Var);
        }
    }

    @Override // defpackage.hk61
    public final String a() {
        hk61 hk61Var = this.b;
        if (hk61Var != null) {
            return hk61Var.a();
        }
        return null;
    }
}
