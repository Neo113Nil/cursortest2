package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.c6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4748c6 extends F4 {
    public C4748c6(@NonNull String str, double d) {
        super(2, str, Double.valueOf(d), new Cb(), new E4(new Sb(new C5311y4(100))));
    }

    @Override // io.appmetrica.analytics.impl.F4
    public final void a(@NonNull C5102po c5102po) {
        C5153ro c5153ro = c5102po.d;
        c5153ro.c = ((Double) this.f).doubleValue() + c5153ro.c;
    }
}
