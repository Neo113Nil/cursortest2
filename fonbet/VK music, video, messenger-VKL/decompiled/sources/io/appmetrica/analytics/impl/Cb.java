package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class Cb implements Co {
    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(@Nullable String str) {
        return str == null ? new Ao(this, false, "key is null") : str.startsWith(S7.b) ? new Ao(this, false, "key starts with appmetrica") : str.length() > 200 ? new Ao(this, false, "key length more then 200 characters") : new Ao(this, true, "");
    }
}
