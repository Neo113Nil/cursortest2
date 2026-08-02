package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes8.dex */
public final class O8 implements Do {
    public final T8 a;

    public O8() {
        this(new T8());
    }

    @Override // io.appmetrica.analytics.impl.Do
    @NonNull
    public final byte[] a(@NonNull Z8 z8, @NonNull C5224uh c5224uh) {
        String str = z8.b;
        return ((S8) this.a.a.a(z8.o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public O8(T8 t8) {
        this.a = t8;
    }
}
