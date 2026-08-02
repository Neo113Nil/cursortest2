package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes8.dex */
public final class H2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4873h2 fromModel(@NonNull J2 j2) {
        C4873h2 c4873h2 = new C4873h2();
        I2 i2 = j2.a;
        if (i2 != null) {
            int ordinal = i2.ordinal();
            if (ordinal == 0) {
                c4873h2.a = 6;
            } else if (ordinal == 1) {
                c4873h2.a = 1;
            } else if (ordinal == 2) {
                c4873h2.a = 2;
            } else if (ordinal == 3) {
                c4873h2.a = 3;
            } else if (ordinal == 4) {
                c4873h2.a = 4;
            } else if (ordinal != 5) {
                c4873h2.a = 0;
            } else {
                c4873h2.a = 5;
            }
        }
        Boolean bool = j2.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                c4873h2.b = 1;
                return c4873h2;
            }
            c4873h2.b = 0;
        }
        return c4873h2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J2 toModel(@NonNull C4873h2 c4873h2) {
        I2 i2;
        Boolean bool = null;
        switch (c4873h2.a) {
            case 1:
                i2 = I2.ACTIVE;
                break;
            case 2:
                i2 = I2.WORKING_SET;
                break;
            case 3:
                i2 = I2.FREQUENT;
                break;
            case 4:
                i2 = I2.RARE;
                break;
            case 5:
                i2 = I2.RESTRICTED;
                break;
            case 6:
                i2 = I2.EXEMPTED;
                break;
            default:
                i2 = null;
                break;
        }
        int i = c4873h2.b;
        if (i == 0) {
            bool = Boolean.FALSE;
        } else if (i == 1) {
            bool = Boolean.TRUE;
        }
        return new J2(i2, bool);
    }
}
