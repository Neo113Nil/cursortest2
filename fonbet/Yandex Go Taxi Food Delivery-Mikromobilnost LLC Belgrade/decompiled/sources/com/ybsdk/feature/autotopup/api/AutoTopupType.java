package com.ybsdk.feature.autotopup.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/AutoTopupType;", "", "<init>", "(Ljava/lang/String;I)V", "BALANCE_THRESHOLD", "UP_TO_BALANCE", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupType[] $VALUES;
    public static final AutoTopupType BALANCE_THRESHOLD = new AutoTopupType("BALANCE_THRESHOLD", 0);
    public static final AutoTopupType UP_TO_BALANCE = new AutoTopupType("UP_TO_BALANCE", 1);

    private static final /* synthetic */ AutoTopupType[] $values() {
        return new AutoTopupType[]{BALANCE_THRESHOLD, UP_TO_BALANCE};
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
