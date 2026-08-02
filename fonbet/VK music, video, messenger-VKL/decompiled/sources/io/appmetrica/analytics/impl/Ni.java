package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class Ni implements InterfaceC5029n3 {

    @NonNull
    public final Object a;

    @NonNull
    public final InterfaceC5029n3 b;

    public Ni(@NonNull Object obj, @NonNull InterfaceC5029n3 interfaceC5029n3) {
        this.a = obj;
        this.b = interfaceC5029n3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5029n3
    public final int getBytesTruncated() {
        return this.b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.a + ", metaInfo=" + this.b + '}';
    }
}
