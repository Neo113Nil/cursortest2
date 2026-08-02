package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5090pc implements D9 {
    public final C5262w5 a;

    public C5090pc(H9 h9, X6 x6, C4707ah c4707ah, A4 a4, C4747c5 c4747c5, C4860gf c4860gf) {
        C5064oc c5064oc = new C5064oc(x6, c4707ah, this, a4, c4860gf);
        this.a = new C5262w5(h9, c5064oc.a(), c5064oc.b(), c4747c5);
    }

    @Override // io.appmetrica.analytics.impl.D9
    public final C9 a() {
        return this.a;
    }

    public final C5262w5 b() {
        return this.a;
    }
}
