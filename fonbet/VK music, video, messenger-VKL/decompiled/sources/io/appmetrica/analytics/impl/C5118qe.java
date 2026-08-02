package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5118qe extends F4 {
    public C5118qe(@NonNull String str, double d, @NonNull Co co, @NonNull V2 v2) {
        super(1, str, Double.valueOf(d), co, v2);
    }

    @Override // io.appmetrica.analytics.impl.F4
    public final void a(@NonNull C5102po c5102po) {
        c5102po.d.b = ((Double) this.f).doubleValue();
    }
}
