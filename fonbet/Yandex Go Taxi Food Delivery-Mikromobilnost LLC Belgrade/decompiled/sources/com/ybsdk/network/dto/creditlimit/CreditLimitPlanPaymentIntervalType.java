package com.ybsdk.network.dto.creditlimit;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanPaymentIntervalType;", "", "<init>", "(Ljava/lang/String;I)V", DivkitThemeChangeListener.THEME_VARIABLE_DEFAULT_VALUE, "MONTH", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreditLimitPlanPaymentIntervalType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreditLimitPlanPaymentIntervalType[] $VALUES;
    public static final CreditLimitPlanPaymentIntervalType DAY = new CreditLimitPlanPaymentIntervalType(DivkitThemeChangeListener.THEME_VARIABLE_DEFAULT_VALUE, 0);
    public static final CreditLimitPlanPaymentIntervalType MONTH = new CreditLimitPlanPaymentIntervalType("MONTH", 1);

    private static final /* synthetic */ CreditLimitPlanPaymentIntervalType[] $values() {
        return new CreditLimitPlanPaymentIntervalType[]{DAY, MONTH};
    }

    static {
        CreditLimitPlanPaymentIntervalType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CreditLimitPlanPaymentIntervalType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CreditLimitPlanPaymentIntervalType valueOf(String str) {
        return (CreditLimitPlanPaymentIntervalType) Enum.valueOf(CreditLimitPlanPaymentIntervalType.class, str);
    }

    public static CreditLimitPlanPaymentIntervalType[] values() {
        return (CreditLimitPlanPaymentIntervalType[]) $VALUES.clone();
    }
}
