package com.google.protobuf;

import defpackage.aci0;
import defpackage.bor;
import defpackage.d5m;
import defpackage.eac;
import defpackage.evf0;
import defpackage.i7y;
import defpackage.i96;
import defpackage.o5w;
import defpackage.oqw;
import defpackage.pyo;
import defpackage.qlz;
import defpackage.rqw;
import defpackage.som0;
import java.util.List;

/* loaded from: classes11.dex */
public final class i implements aci0 {
    public final eac a;
    public int b;
    public int c;
    public int d = 0;

    public i(eac eacVar) {
        rqw.a(eacVar, "input");
        this.a = eacVar;
        eacVar.c = this;
    }

    public static void W(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.j();
        }
    }

    public static void X(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.j();
        }
    }

    public static i a(eac eacVar) {
        i iVar = eacVar.c;
        return iVar != null ? iVar : new i(eacVar);
    }

    public final void A(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof qlz;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(eacVar.r()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = eacVar.d() + eacVar.A();
            do {
                list.add(Long.valueOf(eacVar.r()));
            } while (eacVar.d() < d);
            U(d);
            return;
        }
        qlz qlzVar = (qlz) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                qlzVar.b(eacVar.r());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = eacVar.d() + eacVar.A();
        do {
            qlzVar.b(eacVar.r());
        } while (eacVar.d() < d2);
        U(d2);
    }

    public final Object B(Class cls, pyo pyoVar) {
        V(2);
        som0 a = evf0.c.a(cls);
        Object d = a.d();
        g(d, a, pyoVar);
        a.c(d);
        return d;
    }

    public final void C(oqw oqwVar, som0 som0Var, pyo pyoVar) {
        int z;
        int i = this.b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            Object d = som0Var.d();
            g(d, som0Var, pyoVar);
            som0Var.c(d);
            oqwVar.add(d);
            eac eacVar = this.a;
            if (eacVar.e() || this.d != 0) {
                return;
            } else {
                z = eacVar.z();
            }
        } while (z == i);
        this.d = z;
    }

    public final int D() {
        V(5);
        return this.a.t();
    }

    public final void E(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof o5w;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 2) {
                int A = eacVar.A();
                W(A);
                int d = eacVar.d() + A;
                do {
                    list.add(Integer.valueOf(eacVar.t()));
                } while (eacVar.d() < d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.g();
            }
            do {
                list.add(Integer.valueOf(eacVar.t()));
                if (eacVar.e()) {
                    return;
                } else {
                    z = eacVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        o5w o5wVar = (o5w) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int A2 = eacVar.A();
            W(A2);
            int d2 = eacVar.d() + A2;
            do {
                o5wVar.b(eacVar.t());
            } while (eacVar.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            o5wVar.b(eacVar.t());
            if (eacVar.e()) {
                return;
            } else {
                z2 = eacVar.z();
            }
        } while (z2 == this.b);
        this.d = z2;
    }

    public final long F() {
        V(1);
        return this.a.u();
    }

    public final void G(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof qlz;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(eacVar.u()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int A = eacVar.A();
            X(A);
            int d = eacVar.d() + A;
            do {
                list.add(Long.valueOf(eacVar.u()));
            } while (eacVar.d() < d);
            return;
        }
        qlz qlzVar = (qlz) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                qlzVar.b(eacVar.u());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int A2 = eacVar.A();
        X(A2);
        int d2 = eacVar.d() + A2;
        do {
            qlzVar.b(eacVar.u());
        } while (eacVar.d() < d2);
    }

    public final int H() {
        V(0);
        return this.a.v();
    }

    public final void I(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof o5w;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(eacVar.v()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = eacVar.d() + eacVar.A();
            do {
                list.add(Integer.valueOf(eacVar.v()));
            } while (eacVar.d() < d);
            U(d);
            return;
        }
        o5w o5wVar = (o5w) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                o5wVar.b(eacVar.v());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = eacVar.d() + eacVar.A();
        do {
            o5wVar.b(eacVar.v());
        } while (eacVar.d() < d2);
        U(d2);
    }

    public final long J() {
        V(0);
        return this.a.w();
    }

    public final void K(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof qlz;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(eacVar.w()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = eacVar.d() + eacVar.A();
            do {
                list.add(Long.valueOf(eacVar.w()));
            } while (eacVar.d() < d);
            U(d);
            return;
        }
        qlz qlzVar = (qlz) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                qlzVar.b(eacVar.w());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = eacVar.d() + eacVar.A();
        do {
            qlzVar.b(eacVar.w());
        } while (eacVar.d() < d2);
        U(d2);
    }

    public final String L() {
        V(2);
        return this.a.x();
    }

    public final void M(oqw oqwVar) {
        N(oqwVar, false);
    }

    public final void N(List list, boolean z) {
        int z2;
        int z3;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        boolean z4 = list instanceof i7y;
        eac eacVar = this.a;
        if (!z4 || z) {
            do {
                list.add(z ? P() : L());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        i7y i7yVar = (i7y) list;
        do {
            j();
            i7yVar.u0();
            if (eacVar.e()) {
                return;
            } else {
                z3 = eacVar.z();
            }
        } while (z3 == this.b);
        this.d = z3;
    }

    public final void O(oqw oqwVar) {
        N(oqwVar, true);
    }

    public final String P() {
        V(2);
        return this.a.y();
    }

    public final int Q() {
        V(0);
        return this.a.A();
    }

    public final void R(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof o5w;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(eacVar.A()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = eacVar.d() + eacVar.A();
            do {
                list.add(Integer.valueOf(eacVar.A()));
            } while (eacVar.d() < d);
            U(d);
            return;
        }
        o5w o5wVar = (o5w) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                o5wVar.b(eacVar.A());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = eacVar.d() + eacVar.A();
        do {
            o5wVar.b(eacVar.A());
        } while (eacVar.d() < d2);
        U(d2);
    }

    public final long S() {
        V(0);
        return this.a.B();
    }

    public final void T(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof qlz;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(eacVar.B()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = eacVar.d() + eacVar.A();
            do {
                list.add(Long.valueOf(eacVar.B()));
            } while (eacVar.d() < d);
            U(d);
            return;
        }
        qlz qlzVar = (qlz) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                qlzVar.b(eacVar.B());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = eacVar.d() + eacVar.A();
        do {
            qlzVar.b(eacVar.B());
        } while (eacVar.d() < d2);
        U(d2);
    }

    public final void U(int i) {
        if (this.a.d() != i) {
            throw InvalidProtocolBufferException.m();
        }
    }

    public final void V(int i) {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final int b() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.z();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final int c() {
        return this.b;
    }

    public final void d(Object obj, som0 som0Var, pyo pyoVar) {
        V(3);
        e(obj, som0Var, pyoVar);
    }

    public final void e(Object obj, som0 som0Var, pyo pyoVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            som0Var.f(obj, this, pyoVar);
            if (this.b == this.c) {
            } else {
                throw InvalidProtocolBufferException.j();
            }
        } finally {
            this.c = i;
        }
    }

    public final void f(Object obj, som0 som0Var, pyo pyoVar) {
        V(2);
        g(obj, som0Var, pyoVar);
    }

    public final void g(Object obj, som0 som0Var, pyo pyoVar) {
        eac eacVar = this.a;
        int A = eacVar.A();
        if (eacVar.a + eacVar.b >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = eacVar.i(A);
        eacVar.a++;
        som0Var.f(obj, this, pyoVar);
        eacVar.a(0);
        eacVar.a--;
        eacVar.h(i);
    }

    public final boolean h() {
        V(0);
        return this.a.j();
    }

    public final void i(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof i96;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(eacVar.j()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = eacVar.d() + eacVar.A();
            do {
                list.add(Boolean.valueOf(eacVar.j()));
            } while (eacVar.d() < d);
            U(d);
            return;
        }
        i96 i96Var = (i96) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                i96Var.b(eacVar.j());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = eacVar.d() + eacVar.A();
        do {
            i96Var.b(eacVar.j());
        } while (eacVar.d() < d2);
        U(d2);
    }

    public final ByteString j() {
        V(2);
        return this.a.k();
    }

    public final void k(oqw oqwVar) {
        int z;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            oqwVar.add(j());
            eac eacVar = this.a;
            if (eacVar.e()) {
                return;
            } else {
                z = eacVar.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public final double l() {
        V(1);
        return this.a.l();
    }

    public final void m(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof d5m;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(eacVar.l()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int A = eacVar.A();
            X(A);
            int d = eacVar.d() + A;
            do {
                list.add(Double.valueOf(eacVar.l()));
            } while (eacVar.d() < d);
            return;
        }
        d5m d5mVar = (d5m) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                d5mVar.b(eacVar.l());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int A2 = eacVar.A();
        X(A2);
        int d2 = eacVar.d() + A2;
        do {
            d5mVar.b(eacVar.l());
        } while (eacVar.d() < d2);
    }

    public final int n() {
        V(0);
        return this.a.m();
    }

    public final void o(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof o5w;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(eacVar.m()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = eacVar.d() + eacVar.A();
            do {
                list.add(Integer.valueOf(eacVar.m()));
            } while (eacVar.d() < d);
            U(d);
            return;
        }
        o5w o5wVar = (o5w) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                o5wVar.b(eacVar.m());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = eacVar.d() + eacVar.A();
        do {
            o5wVar.b(eacVar.m());
        } while (eacVar.d() < d2);
        U(d2);
    }

    public final int p() {
        V(5);
        return this.a.n();
    }

    public final void q(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof o5w;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 2) {
                int A = eacVar.A();
                W(A);
                int d = eacVar.d() + A;
                do {
                    list.add(Integer.valueOf(eacVar.n()));
                } while (eacVar.d() < d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.g();
            }
            do {
                list.add(Integer.valueOf(eacVar.n()));
                if (eacVar.e()) {
                    return;
                } else {
                    z = eacVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        o5w o5wVar = (o5w) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int A2 = eacVar.A();
            W(A2);
            int d2 = eacVar.d() + A2;
            do {
                o5wVar.b(eacVar.n());
            } while (eacVar.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            o5wVar.b(eacVar.n());
            if (eacVar.e()) {
                return;
            } else {
                z2 = eacVar.z();
            }
        } while (z2 == this.b);
        this.d = z2;
    }

    public final long r() {
        V(1);
        return this.a.o();
    }

    public final void s(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof qlz;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(eacVar.o()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int A = eacVar.A();
            X(A);
            int d = eacVar.d() + A;
            do {
                list.add(Long.valueOf(eacVar.o()));
            } while (eacVar.d() < d);
            return;
        }
        qlz qlzVar = (qlz) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                qlzVar.b(eacVar.o());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int A2 = eacVar.A();
        X(A2);
        int d2 = eacVar.d() + A2;
        do {
            qlzVar.b(eacVar.o());
        } while (eacVar.d() < d2);
    }

    public final float t() {
        V(5);
        return this.a.p();
    }

    public final void u(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof bor;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 2) {
                int A = eacVar.A();
                W(A);
                int d = eacVar.d() + A;
                do {
                    list.add(Float.valueOf(eacVar.p()));
                } while (eacVar.d() < d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.g();
            }
            do {
                list.add(Float.valueOf(eacVar.p()));
                if (eacVar.e()) {
                    return;
                } else {
                    z = eacVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        bor borVar = (bor) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int A2 = eacVar.A();
            W(A2);
            int d2 = eacVar.d() + A2;
            do {
                borVar.b(eacVar.p());
            } while (eacVar.d() < d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            borVar.b(eacVar.p());
            if (eacVar.e()) {
                return;
            } else {
                z2 = eacVar.z();
            }
        } while (z2 == this.b);
        this.d = z2;
    }

    public final Object v(Class cls, pyo pyoVar) {
        V(3);
        som0 a = evf0.c.a(cls);
        Object d = a.d();
        e(d, a, pyoVar);
        a.c(d);
        return d;
    }

    public final void w(oqw oqwVar, som0 som0Var, pyo pyoVar) {
        int z;
        int i = this.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.g();
        }
        do {
            Object d = som0Var.d();
            e(d, som0Var, pyoVar);
            som0Var.c(d);
            oqwVar.add(d);
            eac eacVar = this.a;
            if (eacVar.e() || this.d != 0) {
                return;
            } else {
                z = eacVar.z();
            }
        } while (z == i);
        this.d = z;
    }

    public final int x() {
        V(0);
        return this.a.q();
    }

    public final void y(List list) {
        int z;
        int z2;
        boolean z3 = list instanceof o5w;
        int i = this.b;
        eac eacVar = this.a;
        if (!z3) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(eacVar.q()));
                    if (eacVar.e()) {
                        return;
                    } else {
                        z = eacVar.z();
                    }
                } while (z == this.b);
                this.d = z;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.g();
            }
            int d = eacVar.d() + eacVar.A();
            do {
                list.add(Integer.valueOf(eacVar.q()));
            } while (eacVar.d() < d);
            U(d);
            return;
        }
        o5w o5wVar = (o5w) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                o5wVar.b(eacVar.q());
                if (eacVar.e()) {
                    return;
                } else {
                    z2 = eacVar.z();
                }
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.g();
        }
        int d2 = eacVar.d() + eacVar.A();
        do {
            o5wVar.b(eacVar.q());
        } while (eacVar.d() < d2);
        U(d2);
    }

    public final long z() {
        V(0);
        return this.a.r();
    }
}
