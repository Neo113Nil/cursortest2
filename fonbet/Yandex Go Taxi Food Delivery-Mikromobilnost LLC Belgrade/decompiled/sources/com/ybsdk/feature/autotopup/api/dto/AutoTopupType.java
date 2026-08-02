package com.ybsdk.feature.autotopup.api.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupType;", "", "<init>", "(Ljava/lang/String;I)V", "LIMIT_EXACT", "LIMIT_FILL", "REGULAR_PERIOD", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupType[] $VALUES;
    public static final AutoTopupType LIMIT_EXACT = new AutoTopupType("LIMIT_EXACT", 0);
    public static final AutoTopupType LIMIT_FILL = new AutoTopupType("LIMIT_FILL", 1);
    public static final AutoTopupType REGULAR_PERIOD = new AutoTopupType("REGULAR_PERIOD", 2);

    private static final /* synthetic */ AutoTopupType[] $values() {
        return new AutoTopupType[]{LIMIT_EXACT, LIMIT_FILL, REGULAR_PERIOD};
    }

    static {
        AutoTopupType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoTopupType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupType valueOf(String str) {
        return (AutoTopupType) Enum.valueOf(AutoTopupType.class, str);
    }

    public static AutoTopupType[] values() {
        return (AutoTopupType[]) $VALUES.clone();
    }
}
