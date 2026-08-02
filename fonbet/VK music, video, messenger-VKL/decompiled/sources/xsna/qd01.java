package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class qd01 {
    public long A;

    @Nullable
    public String B;
    public boolean C;
    public long D;
    public long E;
    public final mb01 a;
    public final String b;

    @Nullable
    public String c;

    @Nullable
    public String d;

    @Nullable
    public String e;

    @Nullable
    public String f;
    public long g;
    public long h;
    public long i;

    @Nullable
    public String j;
    public long k;

    @Nullable
    public String l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    @Nullable
    public String q;

    @Nullable
    public Boolean r;
    public long s;

    @Nullable
    public ArrayList t;

    @Nullable
    public String u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public qd01(mb01 mb01Var, String str) {
        exc0.i(mb01Var);
        exc0.f(str);
        this.a = mb01Var;
        this.b = str;
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.k();
    }

    public final boolean A() {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        return this.p;
    }

    public final long B() {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        return this.k;
    }

    public final long C() {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        return this.s;
    }

    @Nullable
    public final String D() {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        return this.q;
    }

    @Nullable
    public final String E() {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        String str = this.B;
        t(null);
        return str;
    }

    public final String F() {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        return this.b;
    }

    @Nullable
    public final String G() {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        return this.c;
    }

    @Nullable
    public final String H() {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        return this.j;
    }

    @Nullable
    public final String I() {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        return this.f;
    }

    @Nullable
    public final String J() {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        return this.d;
    }

    public final void a() {
        mb01 mb01Var = this.a;
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        kb01Var.k();
        long j = this.g + 1;
        if (j > 2147483647L) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.l.b(k901.r(this.b), "Bundle index overflow. appId");
            j = 0;
        }
        this.C = true;
        this.g = j;
    }

    public final void b(@Nullable String str) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ c4g0.G(this.q, str);
        this.q = str;
    }

    public final void c(@Nullable String str) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= !c4g0.G(this.c, str);
        this.c = str;
    }

    public final void d(@Nullable String str) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= !c4g0.G(this.l, str);
        this.l = str;
    }

    public final void e(@Nullable String str) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= !c4g0.G(this.j, str);
        this.j = str;
    }

    public final void f(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.k != j;
        this.k = j;
    }

    public final void g(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.D != j;
        this.D = j;
    }

    public final void h(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.y != j;
        this.y = j;
    }

    public final void i(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.z != j;
        this.z = j;
    }

    public final void j(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.x != j;
        this.x = j;
    }

    public final void k(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.w != j;
        this.w = j;
    }

    public final void l(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.A != j;
        this.A = j;
    }

    public final void m(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.v != j;
        this.v = j;
    }

    public final void n(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.n != j;
        this.n = j;
    }

    public final void o(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.s != j;
        this.s = j;
    }

    public final void p(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.E != j;
        this.E = j;
    }

    public final void q(@Nullable String str) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= !c4g0.G(this.f, str);
        this.f = str;
    }

    public final void r(@Nullable String str) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ c4g0.G(this.d, str);
        this.d = str;
    }

    public final void s(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.m != j;
        this.m = j;
    }

    public final void t(@Nullable String str) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= !c4g0.G(this.B, str);
        this.B = str;
    }

    public final void u(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.i != j;
        this.i = j;
    }

    public final void v(long j) {
        exc0.b(j >= 0);
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.g != j;
        this.g = j;
    }

    public final void w(long j) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.h != j;
        this.h = j;
    }

    public final void x(boolean z) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= this.o != z;
        this.o = z;
    }

    public final void y(@Nullable String str) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        this.C |= !c4g0.G(this.e, str);
        this.e = str;
    }

    public final void z(@Nullable List list) {
        kb01 kb01Var = this.a.k;
        mb01.k(kb01Var);
        kb01Var.k();
        if (c4g0.G(this.t, list)) {
            return;
        }
        this.C = true;
        this.t = list != null ? new ArrayList(list) : null;
    }
}
