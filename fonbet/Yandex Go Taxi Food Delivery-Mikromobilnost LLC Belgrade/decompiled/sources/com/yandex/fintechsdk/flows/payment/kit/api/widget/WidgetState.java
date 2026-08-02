package com.yandex.fintechsdk.flows.payment.kit.api.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/api/widget/WidgetState;", "", "LOADING", "READY", "ERROR", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WidgetState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WidgetState[] $VALUES;
    public static final WidgetState ERROR;
    public static final WidgetState LOADING;
    public static final WidgetState READY;

    static {
        WidgetState widgetState = new WidgetState("LOADING", 0);
        LOADING = widgetState;
        WidgetState widgetState2 = new WidgetState("READY", 1);
        READY = widgetState2;
        WidgetState widgetState3 = new WidgetState("ERROR", 2);
        ERROR = widgetState3;
        WidgetState[] widgetStateArr = {widgetState, widgetState2, widgetState3};
        $VALUES = widgetStateArr;
        $ENTRIES = a.a(widgetStateArr);
    }

    public static WidgetState valueOf(String str) {
        return (WidgetState) Enum.valueOf(WidgetState.class, str);
    }

    public static WidgetState[] values() {
        return (WidgetState[]) $VALUES.clone();
    }
}
