package com.yandex.go.promocodes.base.impl.discounts.domain.entities.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/domain/entities/analytics/DiscountsAnalyticsScreen;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MAIN", "LIST", "DESCRIPTION_CARD", "INPUT", "REFERRAL", "MENU", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsAnalyticsScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscountsAnalyticsScreen[] $VALUES;
    public static final DiscountsAnalyticsScreen DESCRIPTION_CARD;
    public static final DiscountsAnalyticsScreen INPUT;
    public static final DiscountsAnalyticsScreen LIST;
    public static final DiscountsAnalyticsScreen MAIN;
    public static final DiscountsAnalyticsScreen MENU;
    public static final DiscountsAnalyticsScreen REFERRAL;
    private final String value;

    static {
        DiscountsAnalyticsScreen discountsAnalyticsScreen = new DiscountsAnalyticsScreen("MAIN", 0, "Main");
        MAIN = discountsAnalyticsScreen;
        DiscountsAnalyticsScreen discountsAnalyticsScreen2 = new DiscountsAnalyticsScreen("LIST", 1, "PromoCodes");
        LIST = discountsAnalyticsScreen2;
        DiscountsAnalyticsScreen discountsAnalyticsScreen3 = new DiscountsAnalyticsScreen("DESCRIPTION_CARD", 2, "DiscountDescriptionCard");
        DESCRIPTION_CARD = discountsAnalyticsScreen3;
        DiscountsAnalyticsScreen discountsAnalyticsScreen4 = new DiscountsAnalyticsScreen("INPUT", 3, "EnterPromoCodeCard");
        INPUT = discountsAnalyticsScreen4;
        DiscountsAnalyticsScreen discountsAnalyticsScreen5 = new DiscountsAnalyticsScreen("REFERRAL", 4, "ReferralDiscountPromo");
        REFERRAL = discountsAnalyticsScreen5;
        DiscountsAnalyticsScreen discountsAnalyticsScreen6 = new DiscountsAnalyticsScreen("MENU", 5, "Menu");
        MENU = discountsAnalyticsScreen6;
        DiscountsAnalyticsScreen[] discountsAnalyticsScreenArr = {discountsAnalyticsScreen, discountsAnalyticsScreen2, discountsAnalyticsScreen3, discountsAnalyticsScreen4, discountsAnalyticsScreen5, discountsAnalyticsScreen6};
        $VALUES = discountsAnalyticsScreenArr;
        $ENTRIES = a.a(discountsAnalyticsScreenArr);
    }

    public DiscountsAnalyticsScreen(String str, int i, String str2) {
        this.value = str2;
    }

    public static DiscountsAnalyticsScreen valueOf(String str) {
        return (DiscountsAnalyticsScreen) Enum.valueOf(DiscountsAnalyticsScreen.class, str);
    }

    public static DiscountsAnalyticsScreen[] values() {
        return (DiscountsAnalyticsScreen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
