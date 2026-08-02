package com.yandex.plus.core.strings;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "", "YANDEX", "YANGO", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusSdkBrandType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusSdkBrandType[] $VALUES;
    public static final PlusSdkBrandType YANDEX;
    public static final PlusSdkBrandType YANGO;

    static {
        PlusSdkBrandType plusSdkBrandType = new PlusSdkBrandType("YANDEX", 0);
        YANDEX = plusSdkBrandType;
        PlusSdkBrandType plusSdkBrandType2 = new PlusSdkBrandType("YANGO", 1);
        YANGO = plusSdkBrandType2;
        PlusSdkBrandType[] plusSdkBrandTypeArr = {plusSdkBrandType, plusSdkBrandType2};
        $VALUES = plusSdkBrandTypeArr;
        $ENTRIES = a.a(plusSdkBrandTypeArr);
    }

    public static PlusSdkBrandType valueOf(String str) {
        return (PlusSdkBrandType) Enum.valueOf(PlusSdkBrandType.class, str);
    }

    public static PlusSdkBrandType[] values() {
        return (PlusSdkBrandType[]) $VALUES.clone();
    }
}
