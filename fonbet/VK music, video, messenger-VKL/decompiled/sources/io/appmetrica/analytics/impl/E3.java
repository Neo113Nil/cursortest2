package io.appmetrica.analytics.impl;

import java.util.List;
import xsna.epx;
import xsna.ms9;

/* loaded from: classes8.dex */
public final class E3 implements InterfaceC4750c8 {
    public final D3 a;
    public final List b;

    public E3(D3 d3, List<D3> list) {
        this.a = d3;
        this.b = list;
    }

    public final E3 a(D3 d3, List<D3> list) {
        return new E3(d3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4750c8
    public final Object b() {
        return this.a;
    }

    public final D3 c() {
        return this.a;
    }

    public final List<D3> d() {
        return this.b;
    }

    public final D3 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E3)) {
            return false;
        }
        E3 e3 = (E3) obj;
        return epx.f(this.a, e3.a) && epx.f(this.b, e3.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClidsInfo(chosen=");
        sb.append(this.a);
        sb.append(", candidates=");
        return ms9.a(')', sb, this.b);
    }

    public static E3 a(E3 e3, D3 d3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            d3 = e3.a;
        }
        if ((i & 2) != 0) {
            list = e3.b;
        }
        e3.getClass();
        return new E3(d3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4750c8
    public final List<D3> a() {
        return this.b;
    }
}
