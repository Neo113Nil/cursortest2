package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/me2me/result/Me2MeDebitResultState$WidgetState", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/result/Me2MeDebitResultState$WidgetState;", "<init>", "(Ljava/lang/String;I)V", "OFF", "ON", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitResultState$WidgetState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Me2MeDebitResultState$WidgetState[] $VALUES;
    public static final Me2MeDebitResultState$WidgetState OFF = new Me2MeDebitResultState$WidgetState("OFF", 0);
    public static final Me2MeDebitResultState$WidgetState ON = new Me2MeDebitResultState$WidgetState("ON", 1);

    private static final /* synthetic */ Me2MeDebitResultState$WidgetState[] $values() {
        return new Me2MeDebitResultState$WidgetState[]{OFF, ON};
    }

    static {
        Me2MeDebitResultState$WidgetState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Me2MeDebitResultState$WidgetState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Me2MeDebitResultState$WidgetState valueOf(String str) {
        return (Me2MeDebitResultState$WidgetState) Enum.valueOf(Me2MeDebitResultState$WidgetState.class, str);
    }

    public static Me2MeDebitResultState$WidgetState[] values() {
        return (Me2MeDebitResultState$WidgetState[]) $VALUES.clone();
    }
}
