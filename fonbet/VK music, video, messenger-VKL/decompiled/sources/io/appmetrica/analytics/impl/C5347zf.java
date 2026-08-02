package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5347zf implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@NonNull EnumC4801e8 enumC4801e8) {
        int ordinal = enumC4801e8.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnumC4801e8 toModel(@NonNull Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return EnumC4801e8.c;
        }
        if (intValue == 2) {
            return EnumC4801e8.e;
        }
        if (intValue != 3) {
            return EnumC4801e8.b;
        }
        return EnumC4801e8.d;
    }
}
