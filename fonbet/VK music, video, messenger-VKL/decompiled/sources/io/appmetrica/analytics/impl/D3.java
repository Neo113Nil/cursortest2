package io.appmetrica.analytics.impl;

import java.util.Map;
import xsna.epx;

/* loaded from: classes8.dex */
public final class D3 implements InterfaceC4827f8 {
    public final Map a;
    public final EnumC4801e8 b;

    public D3(Map<String, String> map, EnumC4801e8 enumC4801e8) {
        this.a = map;
        this.b = enumC4801e8;
    }

    public final D3 a(Map<String, String> map, EnumC4801e8 enumC4801e8) {
        return new D3(map, enumC4801e8);
    }

    public final Map<String, String> b() {
        return this.a;
    }

    public final EnumC4801e8 c() {
        return this.b;
    }

    public final Map<String, String> d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D3)) {
            return false;
        }
        D3 d3 = (D3) obj;
        return epx.f(this.a, d3.a) && this.b == d3.b;
    }

    public final int hashCode() {
        Map map = this.a;
        return this.b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.a + ", source=" + this.b + ')';
    }

    public static D3 a(D3 d3, Map map, EnumC4801e8 enumC4801e8, int i, Object obj) {
        if ((i & 1) != 0) {
            map = d3.a;
        }
        if ((i & 2) != 0) {
            enumC4801e8 = d3.b;
        }
        d3.getClass();
        return new D3(map, enumC4801e8);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4827f8
    public final EnumC4801e8 a() {
        return this.b;
    }
}
