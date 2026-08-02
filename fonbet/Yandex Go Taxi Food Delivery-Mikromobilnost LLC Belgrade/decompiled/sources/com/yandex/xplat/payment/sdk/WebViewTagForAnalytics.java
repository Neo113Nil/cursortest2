package com.yandex.xplat.payment.sdk;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "FORM_3DS", Card.CARD_TYPE_CREDIT, "COMMON", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewTagForAnalytics {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebViewTagForAnalytics[] $VALUES;
    public static final WebViewTagForAnalytics COMMON;
    public static final WebViewTagForAnalytics CREDIT;
    public static final WebViewTagForAnalytics FORM_3DS;
    private final String value;

    static {
        WebViewTagForAnalytics webViewTagForAnalytics = new WebViewTagForAnalytics("FORM_3DS", 0, "form_3ds");
        FORM_3DS = webViewTagForAnalytics;
        WebViewTagForAnalytics webViewTagForAnalytics2 = new WebViewTagForAnalytics(Card.CARD_TYPE_CREDIT, 1, "credit");
        CREDIT = webViewTagForAnalytics2;
        WebViewTagForAnalytics webViewTagForAnalytics3 = new WebViewTagForAnalytics("COMMON", 2, "common");
        COMMON = webViewTagForAnalytics3;
        WebViewTagForAnalytics[] webViewTagForAnalyticsArr = {webViewTagForAnalytics, webViewTagForAnalytics2, webViewTagForAnalytics3};
        $VALUES = webViewTagForAnalyticsArr;
        $ENTRIES = a.a(webViewTagForAnalyticsArr);
    }

    public WebViewTagForAnalytics(String str, int i, String str2) {
        this.value = str2;
    }

    public static WebViewTagForAnalytics valueOf(String str) {
        return (WebViewTagForAnalytics) Enum.valueOf(WebViewTagForAnalytics.class, str);
    }

    public static WebViewTagForAnalytics[] values() {
        return (WebViewTagForAnalytics[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
