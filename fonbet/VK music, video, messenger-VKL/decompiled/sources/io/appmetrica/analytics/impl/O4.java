package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class O4 extends Pf {
    public final N4 a;

    public O4(J4 j4) {
        this.a = new N4(j4);
    }

    @Override // io.appmetrica.analytics.impl.Pf
    public final AbstractC4906i9 a(int i) {
        ArrayList arrayList = new ArrayList();
        int ordinal = EnumC5037nb.a(i).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.a.a);
        } else if (ordinal == 14) {
            arrayList.add(this.a.b);
        } else if (ordinal == 34) {
            arrayList.add(this.a.c);
        }
        return new C4880h9(arrayList);
    }
}
