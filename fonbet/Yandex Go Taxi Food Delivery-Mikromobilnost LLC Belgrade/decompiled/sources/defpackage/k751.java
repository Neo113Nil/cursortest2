package defpackage;

import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class k751 {
    public static final n751 b = new x651().a.h().a.a().a.b().a.c();
    public final n751 a;

    public k751(n751 n751Var) {
        this.a = n751Var;
    }

    public n751 a() {
        return this.a;
    }

    public n751 b() {
        return this.a;
    }

    public n751 c() {
        return this.a;
    }

    public void d(View view) {
    }

    public void e(n751 n751Var) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k751)) {
            return false;
        }
        k751 k751Var = (k751) obj;
        return p() == k751Var.p() && o() == k751Var.o() && Objects.equals(l(), k751Var.l()) && Objects.equals(j(), k751Var.j()) && Objects.equals(f(), k751Var.f());
    }

    public bzj f() {
        return null;
    }

    public u1w g(int i) {
        return u1w.e;
    }

    public u1w h(int i) {
        if ((i & 8) == 0) {
            return u1w.e;
        }
        ny61.g("Unable to query the maximum insets for IME");
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public u1w i() {
        return l();
    }

    public u1w j() {
        return u1w.e;
    }

    public u1w k() {
        return l();
    }

    public u1w l() {
        return u1w.e;
    }

    public u1w m() {
        return l();
    }

    public n751 n(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i) {
        return true;
    }

    public void r(u1w[] u1wVarArr) {
    }

    public void s(u1w u1wVar) {
    }

    public void t(n751 n751Var) {
    }

    public void u(int i) {
    }
}
