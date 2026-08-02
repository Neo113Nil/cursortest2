package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.nn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5049nn implements Vn {
    public final Vn a;
    public final Object b;

    public C5049nn(@NonNull Vn vn, @Nullable Object obj) {
        this.a = vn;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Vn
    @Nullable
    public final Object a(@Nullable Object obj) {
        return obj != this.a.a(obj) ? this.b : obj;
    }
}
