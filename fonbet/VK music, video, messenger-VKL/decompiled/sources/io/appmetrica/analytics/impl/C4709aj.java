package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4709aj implements F9 {
    @Override // io.appmetrica.analytics.impl.F9
    @Nullable
    public final Integer a(@NonNull Z8 z8) {
        EnumC5037nb enumC5037nb = z8.h;
        if (enumC5037nb != null) {
            return (Integer) Zf.c.get(enumC5037nb);
        }
        Map map = Zf.a;
        return null;
    }
}
