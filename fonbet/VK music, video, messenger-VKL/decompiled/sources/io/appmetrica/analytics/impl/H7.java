package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class H7 implements ProtobufConverter {
    @NonNull
    public final BigDecimal a(@NonNull C5163s8 c5163s8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5163s8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = J7.a;
        int i = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(J7.a) <= 0 && unscaledValue.compareTo(J7.b) >= 0) {
                Pair pair = new Pair(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i));
                I7 i7 = new I7(((Number) pair.i()).longValue(), ((Number) pair.j()).intValue());
                C5163s8 c5163s8 = new C5163s8();
                c5163s8.a = i7.a;
                c5163s8.b = i7.b;
                return c5163s8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }
}
