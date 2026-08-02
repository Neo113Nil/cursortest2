package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes8.dex */
public final class Da extends Ca {
    public Da(int i, int i2) {
        this(i, new Ea(i2));
    }

    public final int a(@Nullable String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final int b(@Nullable Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public Da(int i, @NonNull Ea ea) {
        super(i, ea);
    }
}
