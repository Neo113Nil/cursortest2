package com.ybsdk.core.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/utils/CountryCodes;", "", "<init>", "(Ljava/lang/String;I)V", "RU", "UZ", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CountryCodes {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CountryCodes[] $VALUES;
    public static final CountryCodes RU = new CountryCodes("RU", 0);
    public static final CountryCodes UZ = new CountryCodes("UZ", 1);

    private static final /* synthetic */ CountryCodes[] $values() {
        return new CountryCodes[]{RU, UZ};
    }

    static {
        CountryCodes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CountryCodes(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CountryCodes valueOf(String str) {
        return (CountryCodes) Enum.valueOf(CountryCodes.class, str);
    }

    public static CountryCodes[] values() {
        return (CountryCodes[]) $VALUES.clone();
    }
}
