package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5222uf extends AbstractC4776d8 {
    @Override // io.appmetrica.analytics.impl.AbstractC4776d8
    public final boolean a(Af af, Af af2) {
        if (af.c) {
            return !af2.c || ((Number) this.a.a(af.e)).intValue() > ((Number) this.a.a(af2.e)).intValue();
        }
        return false;
    }
}
