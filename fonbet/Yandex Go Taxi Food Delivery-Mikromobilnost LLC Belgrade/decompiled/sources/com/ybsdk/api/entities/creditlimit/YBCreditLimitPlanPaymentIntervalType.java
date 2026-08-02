package com.ybsdk.api.entities.creditlimit;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/api/entities/creditlimit/YBCreditLimitPlanPaymentIntervalType;", "", "<init>", "(Ljava/lang/String;I)V", DivkitThemeChangeListener.THEME_VARIABLE_DEFAULT_VALUE, "MONTH", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBCreditLimitPlanPaymentIntervalType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBCreditLimitPlanPaymentIntervalType[] $VALUES;
    public static final YBCreditLimitPlanPaymentIntervalType DAY = new YBCreditLimitPlanPaymentIntervalType(DivkitThemeChangeListener.THEME_VARIABLE_DEFAULT_VALUE, 0);
    public static final YBCreditLimitPlanPaymentIntervalType MONTH = new YBCreditLimitPlanPaymentIntervalType("MONTH", 1);

    private static final /* synthetic */ YBCreditLimitPlanPaymentIntervalType[] $values() {
        return new YBCreditLimitPlanPaymentIntervalType[]{DAY, MONTH};
    }

    static {
        YBCreditLimitPlanPaymentIntervalType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBCreditLimitPlanPaymentIntervalType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBCreditLimitPlanPaymentIntervalType valueOf(String str) {
        return (YBCreditLimitPlanPaymentIntervalType) Enum.valueOf(YBCreditLimitPlanPaymentIntervalType.class, str);
    }

    public static YBCreditLimitPlanPaymentIntervalType[] values() {
        return (YBCreditLimitPlanPaymentIntervalType[]) $VALUES.clone();
    }
}
