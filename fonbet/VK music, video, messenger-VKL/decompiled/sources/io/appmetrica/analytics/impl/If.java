package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes8.dex */
public final class If extends Ca {
    public If(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(@Nullable Z z) {
        if (z == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z.b) + 12;
    }
}
