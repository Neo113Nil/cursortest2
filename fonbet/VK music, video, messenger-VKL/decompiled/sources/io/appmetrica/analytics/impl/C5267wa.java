package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5267wa implements InterfaceC4833fe {
    @Override // io.appmetrica.analytics.impl.InterfaceC4833fe
    @Nullable
    public final C5087p9 a(@Nullable Integer num, @Nullable String str) {
        C5087p9 c5087p9 = new C5087p9();
        if (num != null) {
            c5087p9.a = num.intValue();
        }
        if (str != null) {
            c5087p9.b = str;
        }
        return c5087p9;
    }
}
