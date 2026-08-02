package com.yandex.go.scooters.offers.v2.analytics;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.yandex.go.scooters.analytics.ScootersOfferCardAnalytics$CardButton;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"com/yandex/go/scooters/offers/v2/analytics/ScootersCardV2Analytics$CardButton", "", "Lcom/yandex/go/scooters/offers/v2/analytics/ScootersCardV2Analytics$CardButton;", "Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$CardButton;", "evgenValue", "Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$CardButton;", "a", "()Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$CardButton;", "INSURANCE_ONBOARDING", "INSURANCE_TOGGLE", "INSURANCE_BADGE", "INSURANCE_OPTION", Card.CARD_TYPE_CREDIT_DEBIT, "ONBOARDING", "BOOK", "SUBSCRIPTION", "SUBSCRIPTION_PROMOBLOCK_TOGGLE", "SUBSCRIPTION_PURCHASE", "PACKAGE", "SUPERPASS", "PASSES", "SUPERPASSES", "ACTIVE_PASSES", "ACTIVE_SUPERPASSES", "DEEPLINK", "SCOOTER_FROM_PARKING", "OFFER_DETAILS", "CLOSE", "CHARITY", "SCAN_OVER_CARD", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardV2Analytics$CardButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersCardV2Analytics$CardButton[] $VALUES;
    public static final ScootersCardV2Analytics$CardButton ACTIVE_PASSES;
    public static final ScootersCardV2Analytics$CardButton ACTIVE_SUPERPASSES;
    public static final ScootersCardV2Analytics$CardButton BOOK;
    public static final ScootersCardV2Analytics$CardButton CHARITY;
    public static final ScootersCardV2Analytics$CardButton CLOSE;
    public static final ScootersCardV2Analytics$CardButton DEEPLINK;
    public static final ScootersCardV2Analytics$CardButton INSURANCE_BADGE;
    public static final ScootersCardV2Analytics$CardButton INSURANCE_ONBOARDING;
    public static final ScootersCardV2Analytics$CardButton INSURANCE_OPTION;
    public static final ScootersCardV2Analytics$CardButton INSURANCE_TOGGLE;
    public static final ScootersCardV2Analytics$CardButton OFFER_DETAILS;
    public static final ScootersCardV2Analytics$CardButton ONBOARDING;
    public static final ScootersCardV2Analytics$CardButton PACKAGE;
    public static final ScootersCardV2Analytics$CardButton PASSES;
    public static final ScootersCardV2Analytics$CardButton PAYMENT;
    public static final ScootersCardV2Analytics$CardButton SCAN_OVER_CARD;
    public static final ScootersCardV2Analytics$CardButton SCOOTER_FROM_PARKING;
    public static final ScootersCardV2Analytics$CardButton SUBSCRIPTION;
    public static final ScootersCardV2Analytics$CardButton SUBSCRIPTION_PROMOBLOCK_TOGGLE;
    public static final ScootersCardV2Analytics$CardButton SUBSCRIPTION_PURCHASE;
    public static final ScootersCardV2Analytics$CardButton SUPERPASS;
    public static final ScootersCardV2Analytics$CardButton SUPERPASSES;
    private final ScootersOfferCardAnalytics$CardButton evgenValue;

    static {
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton = new ScootersCardV2Analytics$CardButton("INSURANCE_ONBOARDING", 0, ScootersOfferCardAnalytics$CardButton.InsuranceOnboarding);
        INSURANCE_ONBOARDING = scootersCardV2Analytics$CardButton;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton2 = new ScootersCardV2Analytics$CardButton("INSURANCE_TOGGLE", 1, ScootersOfferCardAnalytics$CardButton.InsuranceToggle);
        INSURANCE_TOGGLE = scootersCardV2Analytics$CardButton2;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton3 = new ScootersCardV2Analytics$CardButton("INSURANCE_BADGE", 2, ScootersOfferCardAnalytics$CardButton.InsuranceBadge);
        INSURANCE_BADGE = scootersCardV2Analytics$CardButton3;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton4 = new ScootersCardV2Analytics$CardButton("INSURANCE_OPTION", 3, ScootersOfferCardAnalytics$CardButton.InsuranceOption);
        INSURANCE_OPTION = scootersCardV2Analytics$CardButton4;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton5 = new ScootersCardV2Analytics$CardButton(Card.CARD_TYPE_CREDIT_DEBIT, 4, ScootersOfferCardAnalytics$CardButton.Payment);
        PAYMENT = scootersCardV2Analytics$CardButton5;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton6 = new ScootersCardV2Analytics$CardButton("ONBOARDING", 5, ScootersOfferCardAnalytics$CardButton.Onboarding);
        ONBOARDING = scootersCardV2Analytics$CardButton6;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton7 = new ScootersCardV2Analytics$CardButton("BOOK", 6, ScootersOfferCardAnalytics$CardButton.Book);
        BOOK = scootersCardV2Analytics$CardButton7;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton8 = new ScootersCardV2Analytics$CardButton("SUBSCRIPTION", 7, ScootersOfferCardAnalytics$CardButton.Subscription);
        SUBSCRIPTION = scootersCardV2Analytics$CardButton8;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton9 = new ScootersCardV2Analytics$CardButton("SUBSCRIPTION_PROMOBLOCK_TOGGLE", 8, ScootersOfferCardAnalytics$CardButton.SubscriptionPromoblockToggle);
        SUBSCRIPTION_PROMOBLOCK_TOGGLE = scootersCardV2Analytics$CardButton9;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton10 = new ScootersCardV2Analytics$CardButton("SUBSCRIPTION_PURCHASE", 9, ScootersOfferCardAnalytics$CardButton.SubscriptionPurchase);
        SUBSCRIPTION_PURCHASE = scootersCardV2Analytics$CardButton10;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton11 = new ScootersCardV2Analytics$CardButton("PACKAGE", 10, ScootersOfferCardAnalytics$CardButton.Package);
        PACKAGE = scootersCardV2Analytics$CardButton11;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton12 = new ScootersCardV2Analytics$CardButton("SUPERPASS", 11, ScootersOfferCardAnalytics$CardButton.Superpass);
        SUPERPASS = scootersCardV2Analytics$CardButton12;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton13 = new ScootersCardV2Analytics$CardButton("PASSES", 12, ScootersOfferCardAnalytics$CardButton.Passes);
        PASSES = scootersCardV2Analytics$CardButton13;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton14 = new ScootersCardV2Analytics$CardButton("SUPERPASSES", 13, ScootersOfferCardAnalytics$CardButton.Superpasses);
        SUPERPASSES = scootersCardV2Analytics$CardButton14;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton15 = new ScootersCardV2Analytics$CardButton("ACTIVE_PASSES", 14, ScootersOfferCardAnalytics$CardButton.ActivePasses);
        ACTIVE_PASSES = scootersCardV2Analytics$CardButton15;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton16 = new ScootersCardV2Analytics$CardButton("ACTIVE_SUPERPASSES", 15, ScootersOfferCardAnalytics$CardButton.ActiveSuperPasses);
        ACTIVE_SUPERPASSES = scootersCardV2Analytics$CardButton16;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton17 = new ScootersCardV2Analytics$CardButton("DEEPLINK", 16, ScootersOfferCardAnalytics$CardButton.Deeplink);
        DEEPLINK = scootersCardV2Analytics$CardButton17;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton18 = new ScootersCardV2Analytics$CardButton("SCOOTER_FROM_PARKING", 17, ScootersOfferCardAnalytics$CardButton.ScooterFromParking);
        SCOOTER_FROM_PARKING = scootersCardV2Analytics$CardButton18;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton19 = new ScootersCardV2Analytics$CardButton("OFFER_DETAILS", 18, ScootersOfferCardAnalytics$CardButton.OfferDetails);
        OFFER_DETAILS = scootersCardV2Analytics$CardButton19;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton20 = new ScootersCardV2Analytics$CardButton("CLOSE", 19, ScootersOfferCardAnalytics$CardButton.Close);
        CLOSE = scootersCardV2Analytics$CardButton20;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton21 = new ScootersCardV2Analytics$CardButton("CHARITY", 20, ScootersOfferCardAnalytics$CardButton.Charity);
        CHARITY = scootersCardV2Analytics$CardButton21;
        ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton22 = new ScootersCardV2Analytics$CardButton("SCAN_OVER_CARD", 21, ScootersOfferCardAnalytics$CardButton.ScanOverCard);
        SCAN_OVER_CARD = scootersCardV2Analytics$CardButton22;
        ScootersCardV2Analytics$CardButton[] scootersCardV2Analytics$CardButtonArr = {scootersCardV2Analytics$CardButton, scootersCardV2Analytics$CardButton2, scootersCardV2Analytics$CardButton3, scootersCardV2Analytics$CardButton4, scootersCardV2Analytics$CardButton5, scootersCardV2Analytics$CardButton6, scootersCardV2Analytics$CardButton7, scootersCardV2Analytics$CardButton8, scootersCardV2Analytics$CardButton9, scootersCardV2Analytics$CardButton10, scootersCardV2Analytics$CardButton11, scootersCardV2Analytics$CardButton12, scootersCardV2Analytics$CardButton13, scootersCardV2Analytics$CardButton14, scootersCardV2Analytics$CardButton15, scootersCardV2Analytics$CardButton16, scootersCardV2Analytics$CardButton17, scootersCardV2Analytics$CardButton18, scootersCardV2Analytics$CardButton19, scootersCardV2Analytics$CardButton20, scootersCardV2Analytics$CardButton21, scootersCardV2Analytics$CardButton22};
        $VALUES = scootersCardV2Analytics$CardButtonArr;
        $ENTRIES = kotlin.enums.a.a(scootersCardV2Analytics$CardButtonArr);
    }

    public ScootersCardV2Analytics$CardButton(String str, int i, ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton) {
        this.evgenValue = scootersOfferCardAnalytics$CardButton;
    }

    public static ScootersCardV2Analytics$CardButton valueOf(String str) {
        return (ScootersCardV2Analytics$CardButton) Enum.valueOf(ScootersCardV2Analytics$CardButton.class, str);
    }

    public static ScootersCardV2Analytics$CardButton[] values() {
        return (ScootersCardV2Analytics$CardButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final ScootersOfferCardAnalytics$CardButton getEvgenValue() {
        return this.evgenValue;
    }
}
