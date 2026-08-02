package com.yandex.xplat.payment.sdk;

import com.samsung.android.sdk.samsungpay.v2.card.IdvVerifyInfo;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/xplat/payment/sdk/TextFieldNameForAnalytics;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "CARD_NUMBER", "EXPIRATION_DATE", "CVN", IdvVerifyInfo.IDV_TYPE_EMAIL, "SCANNER", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldNameForAnalytics {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextFieldNameForAnalytics[] $VALUES;
    public static final TextFieldNameForAnalytics CARD_NUMBER;
    public static final TextFieldNameForAnalytics CVN;
    public static final TextFieldNameForAnalytics EMAIL;
    public static final TextFieldNameForAnalytics EXPIRATION_DATE;
    public static final TextFieldNameForAnalytics SCANNER;
    private final String value;

    static {
        TextFieldNameForAnalytics textFieldNameForAnalytics = new TextFieldNameForAnalytics("CARD_NUMBER", 0, "card_number");
        CARD_NUMBER = textFieldNameForAnalytics;
        TextFieldNameForAnalytics textFieldNameForAnalytics2 = new TextFieldNameForAnalytics("EXPIRATION_DATE", 1, "expiration_date");
        EXPIRATION_DATE = textFieldNameForAnalytics2;
        TextFieldNameForAnalytics textFieldNameForAnalytics3 = new TextFieldNameForAnalytics("CVN", 2, "cvn");
        CVN = textFieldNameForAnalytics3;
        TextFieldNameForAnalytics textFieldNameForAnalytics4 = new TextFieldNameForAnalytics(IdvVerifyInfo.IDV_TYPE_EMAIL, 3, "email");
        EMAIL = textFieldNameForAnalytics4;
        TextFieldNameForAnalytics textFieldNameForAnalytics5 = new TextFieldNameForAnalytics("SCANNER", 4, "scanner");
        SCANNER = textFieldNameForAnalytics5;
        TextFieldNameForAnalytics[] textFieldNameForAnalyticsArr = {textFieldNameForAnalytics, textFieldNameForAnalytics2, textFieldNameForAnalytics3, textFieldNameForAnalytics4, textFieldNameForAnalytics5};
        $VALUES = textFieldNameForAnalyticsArr;
        $ENTRIES = a.a(textFieldNameForAnalyticsArr);
    }

    public TextFieldNameForAnalytics(String str, int i, String str2) {
        this.value = str2;
    }

    public static TextFieldNameForAnalytics valueOf(String str) {
        return (TextFieldNameForAnalytics) Enum.valueOf(TextFieldNameForAnalytics.class, str);
    }

    public static TextFieldNameForAnalytics[] values() {
        return (TextFieldNameForAnalytics[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
