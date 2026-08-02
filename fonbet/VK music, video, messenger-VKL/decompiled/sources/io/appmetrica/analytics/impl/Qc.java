package io.appmetrica.analytics.impl;

import xsna.gzs;

/* loaded from: classes8.dex */
public final class Qc implements R8 {
    public final Fe a;
    public final gzs b;

    public Qc(Fe fe, gzs<Integer> gzsVar) {
        this.a = fe;
        this.b = gzsVar;
    }

    @Override // io.appmetrica.analytics.impl.R8
    public final boolean b() {
        return ((Ee) this.a).b.get() >= ((long) ((Number) this.b.invoke()).intValue());
    }
}
