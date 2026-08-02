package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class M3 extends AbstractC4776d8 {
    @Override // io.appmetrica.analytics.impl.AbstractC4776d8
    public final boolean a(D3 d3, D3 d32) {
        if (vo.a(d32.a)) {
            return true;
        }
        if (vo.a(d3.a)) {
            return false;
        }
        EnumC4801e8 enumC4801e8 = d3.b;
        if (enumC4801e8 == EnumC4801e8.c) {
            if (((Number) this.a.a(enumC4801e8)).intValue() >= ((Number) this.a.a(d32.b)).intValue()) {
                return true;
            }
        } else if (((Number) this.a.a(enumC4801e8)).intValue() > ((Number) this.a.a(d32.b)).intValue()) {
            return true;
        }
        return false;
    }
}
