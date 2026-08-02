package com.yandex.go.sharedpayments.api.model;

import defpackage.k4o;
import defpackage.pmr0;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/sharedpayments/api/model/SharedAccountScreen;", "", "Companion", "pmr0", "DETAILS", "PAYMENT_METHOD", "REPORT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharedAccountScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SharedAccountScreen[] $VALUES;
    public static final pmr0 Companion;
    public static final SharedAccountScreen DETAILS;
    public static final SharedAccountScreen PAYMENT_METHOD;
    public static final SharedAccountScreen REPORT;

    static {
        SharedAccountScreen sharedAccountScreen = new SharedAccountScreen("DETAILS", 0);
        DETAILS = sharedAccountScreen;
        SharedAccountScreen sharedAccountScreen2 = new SharedAccountScreen("PAYMENT_METHOD", 1);
        PAYMENT_METHOD = sharedAccountScreen2;
        SharedAccountScreen sharedAccountScreen3 = new SharedAccountScreen("REPORT", 2);
        REPORT = sharedAccountScreen3;
        SharedAccountScreen[] sharedAccountScreenArr = {sharedAccountScreen, sharedAccountScreen2, sharedAccountScreen3};
        $VALUES = sharedAccountScreenArr;
        $ENTRIES = a.a(sharedAccountScreenArr);
        Companion = new pmr0();
    }

    public static SharedAccountScreen valueOf(String str) {
        return (SharedAccountScreen) Enum.valueOf(SharedAccountScreen.class, str);
    }

    public static SharedAccountScreen[] values() {
        return (SharedAccountScreen[]) $VALUES.clone();
    }
}
