package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4842fn extends Mi {
    public C4842fn(@NonNull Context context, @NonNull String str) {
        super(context, str, "string");
    }

    @Override // io.appmetrica.analytics.impl.Mi
    @Nullable
    public final Object a(int i) {
        return this.a.getString(i);
    }

    @Nullable
    public final String b(int i) {
        return this.a.getString(i);
    }
}
