package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC5088pa {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);

    public final int a;

    EnumC5088pa(int i) {
        this.a = i;
    }

    public static EnumC5088pa a(Integer num) {
        if (num != null) {
            for (EnumC5088pa enumC5088pa : values()) {
                if (enumC5088pa.a == num.intValue()) {
                    return enumC5088pa;
                }
            }
        }
        return UNKNOWN;
    }
}
