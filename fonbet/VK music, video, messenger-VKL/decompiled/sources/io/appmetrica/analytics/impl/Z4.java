package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;
import xsna.e43;

/* loaded from: classes8.dex */
public final class Z4 {
    public final J5 a;
    public final Qc b;
    public final Qc c;

    public Z4(X6 x6, C4707ah c4707ah) {
        Ee ee = new Ee(x6);
        this.a = new J5(x6);
        this.b = new Qc(ee, new Y4(c4707ah));
        this.c = new Qc(ee, X4.a);
    }

    public final List<R8> a() {
        return e43.l(this.a, this.b);
    }

    public final List<R8> b() {
        return Collections.singletonList(this.c);
    }
}
