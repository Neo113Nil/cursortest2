package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.j5g;

/* renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5064oc {
    public final C4707ah a;
    public final D9 b;
    public final A4 c;
    public final C4860gf d;
    public final Z4 e;
    public final Hc f = new Hc();
    public final Lazy g = new bpn0(new C5038nc(this));

    public C5064oc(X6 x6, C4707ah c4707ah, D9 d9, A4 a4, C4860gf c4860gf) {
        this.a = c4707ah;
        this.b = d9;
        this.c = a4;
        this.d = c4860gf;
        this.e = new Z4(x6, c4707ah);
    }

    public final List<R8> a() {
        return this.e.a();
    }

    public final List<R8> b() {
        return j5g.u0(Collections.singletonList((R8) this.g.getValue()), Collections.singletonList(this.e.c));
    }
}
