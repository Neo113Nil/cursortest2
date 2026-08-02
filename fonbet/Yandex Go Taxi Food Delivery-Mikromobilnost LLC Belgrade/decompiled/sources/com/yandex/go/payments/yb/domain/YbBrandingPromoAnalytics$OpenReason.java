package com.yandex.go.payments.yb.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/payments/yb/domain/YbBrandingPromoAnalytics$OpenReason", "", "Lcom/yandex/go/payments/yb/domain/YbBrandingPromoAnalytics$OpenReason;", "", "source", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PAYMENT_LIST", "ADD_CARD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class YbBrandingPromoAnalytics$OpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbBrandingPromoAnalytics$OpenReason[] $VALUES;
    public static final YbBrandingPromoAnalytics$OpenReason ADD_CARD;
    public static final YbBrandingPromoAnalytics$OpenReason PAYMENT_LIST;
    private final String source;

    static {
        YbBrandingPromoAnalytics$OpenReason ybBrandingPromoAnalytics$OpenReason = new YbBrandingPromoAnalytics$OpenReason("PAYMENT_LIST", 0, "payment_methods_list");
        PAYMENT_LIST = ybBrandingPromoAnalytics$OpenReason;
        YbBrandingPromoAnalytics$OpenReason ybBrandingPromoAnalytics$OpenReason2 = new YbBrandingPromoAnalytics$OpenReason("ADD_CARD", 1, "add_card");
        ADD_CARD = ybBrandingPromoAnalytics$OpenReason2;
        YbBrandingPromoAnalytics$OpenReason[] ybBrandingPromoAnalytics$OpenReasonArr = {ybBrandingPromoAnalytics$OpenReason, ybBrandingPromoAnalytics$OpenReason2};
        $VALUES = ybBrandingPromoAnalytics$OpenReasonArr;
        $ENTRIES = kotlin.enums.a.a(ybBrandingPromoAnalytics$OpenReasonArr);
    }

    public YbBrandingPromoAnalytics$OpenReason(String str, int i, String str2) {
        this.source = str2;
    }

    public static YbBrandingPromoAnalytics$OpenReason valueOf(String str) {
        return (YbBrandingPromoAnalytics$OpenReason) Enum.valueOf(YbBrandingPromoAnalytics$OpenReason.class, str);
    }

    public static YbBrandingPromoAnalytics$OpenReason[] values() {
        return (YbBrandingPromoAnalytics$OpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getSource() {
        return this.source;
    }
}
