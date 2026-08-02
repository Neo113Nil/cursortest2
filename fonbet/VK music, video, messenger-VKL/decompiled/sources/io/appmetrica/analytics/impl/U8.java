package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public enum U8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);

    public final int a;

    U8(int i) {
        this.a = i;
    }

    public static U8 a(Integer num) {
        if (num != null) {
            for (U8 u8 : values()) {
                if (u8.a == num.intValue()) {
                    return u8;
                }
            }
        }
        return NONE;
    }
}
