package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.jn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4945jn implements Do {
    @Override // io.appmetrica.analytics.impl.Do
    @NonNull
    public final byte[] a(@NonNull Z8 z8, @NonNull C5224uh c5224uh) {
        return !TextUtils.isEmpty(z8.b) ? StringUtils.getUTF8Bytes(z8.b) : new byte[0];
    }
}
