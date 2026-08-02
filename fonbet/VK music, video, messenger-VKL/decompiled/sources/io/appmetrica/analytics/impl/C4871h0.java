package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.UUID;
import xsna.zr;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4871h0 implements Co {
    @Override // io.appmetrica.analytics.impl.Co
    public final Ao a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return new Ao(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new Ao(this, true, "");
        } catch (Throwable unused) {
            return new Ao(this, false, zr.a("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
