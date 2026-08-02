package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/xplat/payment/sdk/ButtonNameForAnalytics;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SCANNER_BUTTON", "CLOSE_SCANNER_BUTTON", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ButtonNameForAnalytics {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonNameForAnalytics[] $VALUES;
    public static final ButtonNameForAnalytics CLOSE_SCANNER_BUTTON;
    public static final ButtonNameForAnalytics SCANNER_BUTTON;
    private final String value;

    static {
        ButtonNameForAnalytics buttonNameForAnalytics = new ButtonNameForAnalytics("SCANNER_BUTTON", 0, "scanner_button");
        SCANNER_BUTTON = buttonNameForAnalytics;
        ButtonNameForAnalytics buttonNameForAnalytics2 = new ButtonNameForAnalytics("CLOSE_SCANNER_BUTTON", 1, "close_scanner_button");
        CLOSE_SCANNER_BUTTON = buttonNameForAnalytics2;
        ButtonNameForAnalytics[] buttonNameForAnalyticsArr = {buttonNameForAnalytics, buttonNameForAnalytics2};
        $VALUES = buttonNameForAnalyticsArr;
        $ENTRIES = a.a(buttonNameForAnalyticsArr);
    }

    public ButtonNameForAnalytics(String str, int i, String str2) {
        this.value = str2;
    }

    public static ButtonNameForAnalytics valueOf(String str) {
        return (ButtonNameForAnalytics) Enum.valueOf(ButtonNameForAnalytics.class, str);
    }

    public static ButtonNameForAnalytics[] values() {
        return (ButtonNameForAnalytics[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
