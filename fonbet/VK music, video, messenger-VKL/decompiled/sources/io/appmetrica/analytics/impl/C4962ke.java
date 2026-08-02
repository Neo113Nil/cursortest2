package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.i5s;

/* renamed from: io.appmetrica.analytics.impl.ke, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4962ke implements Co {
    public final String a;

    public C4962ke(@NonNull String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(@Nullable String str) {
        return TextUtils.isEmpty(str) ? new Ao(this, false, i5s.a(new StringBuilder(), this.a, " is empty.")) : new Ao(this, true, "");
    }
}
