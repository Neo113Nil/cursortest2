package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class Vf implements Do, K8 {
    @Override // io.appmetrica.analytics.impl.K8
    public final int a(@NonNull U8 u8) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.Do
    @NonNull
    public final byte[] a(@NonNull Z8 z8, @NonNull C5224uh c5224uh) {
        return TextUtils.isEmpty(z8.b) ? new byte[0] : Base64.decode(z8.b, 0);
    }
}
