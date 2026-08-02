package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.i5s;

/* renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5014me implements Co {
    public final String a;

    public C5014me(@NonNull String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(@Nullable Object obj) {
        return obj == null ? new Ao(this, false, i5s.a(new StringBuilder(), this.a, " is null.")) : new Ao(this, true, "");
    }

    @NonNull
    public final String a() {
        return this.a;
    }
}
