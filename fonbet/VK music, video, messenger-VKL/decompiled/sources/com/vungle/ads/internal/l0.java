package com.vungle.ads.internal;

import xsna.epx;

/* loaded from: classes7.dex */
public final class l0 {
    public m0 a;
    public m0 b;

    public l0(m0 m0Var, m0 m0Var2) {
        this.a = m0Var;
        this.b = m0Var2;
    }

    public final m0 a() {
        return this.a;
    }

    public final m0 b() {
        return this.b;
    }

    public final boolean c() {
        m0 m0Var = this.a;
        if (m0Var.a == Integer.MIN_VALUE || m0Var.b == Integer.MIN_VALUE) {
            return false;
        }
        m0 m0Var2 = this.b;
        return (m0Var2.a == Integer.MIN_VALUE || m0Var2.b == Integer.MIN_VALUE) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return epx.f(this.a, l0Var.a) && epx.f(this.b, l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ClickCoordinate(downCoordinate=");
        a.append(this.a);
        a.append(", upCoordinate=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }

    public final void a(m0 m0Var) {
        this.a = m0Var;
    }

    public final void b(m0 m0Var) {
        this.b = m0Var;
    }
}
