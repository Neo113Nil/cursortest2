package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class Wn implements InterfaceC5029n3 {

    @Nullable
    public final Object a;

    @NonNull
    public final InterfaceC5029n3 b;

    public Wn(@Nullable Object obj, @NonNull InterfaceC5029n3 interfaceC5029n3) {
        this.a = obj;
        this.b = interfaceC5029n3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5029n3
    public final int getBytesTruncated() {
        return this.b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "TrimmingResult{value=" + this.a + ", metaInfo=" + this.b + '}';
    }
}
