package com.yandex.go.scooters.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"com/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$CardButton", "", "Lcom/yandex/go/scooters/analytics/ScootersOfferCardAnalytics$CardButton;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "InsuranceOnboarding", "InsuranceToggle", "InsuranceBadge", "InsuranceOption", "Payment", "Onboarding", "Book", "Subscription", "SubscriptionPromoblockToggle", "SubscriptionPurchase", "Package", "Superpass", "Passes", "Superpasses", "ActivePasses", "ActiveSuperPasses", "Deeplink", "ScooterFromParking", "OfferDetails", "Close", "Charity", "ScanOverCard", "MinutesOffer", "FixOffer", "go-client-android.features.scooters:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersOfferCardAnalytics$CardButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersOfferCardAnalytics$CardButton[] $VALUES;
    public static final ScootersOfferCardAnalytics$CardButton ActivePasses;
    public static final ScootersOfferCardAnalytics$CardButton ActiveSuperPasses;
    public static final ScootersOfferCardAnalytics$CardButton Book;
    public static final ScootersOfferCardAnalytics$CardButton Charity;
    public static final ScootersOfferCardAnalytics$CardButton Close;
    public static final ScootersOfferCardAnalytics$CardButton Deeplink;
    public static final ScootersOfferCardAnalytics$CardButton FixOffer;
    public static final ScootersOfferCardAnalytics$CardButton InsuranceBadge;
    public static final ScootersOfferCardAnalytics$CardButton InsuranceOnboarding;
    public static final ScootersOfferCardAnalytics$CardButton InsuranceOption;
    public static final ScootersOfferCardAnalytics$CardButton InsuranceToggle;
    public static final ScootersOfferCardAnalytics$CardButton MinutesOffer;
    public static final ScootersOfferCardAnalytics$CardButton OfferDetails;
    public static final ScootersOfferCardAnalytics$CardButton Onboarding;
    public static final ScootersOfferCardAnalytics$CardButton Package;
    public static final ScootersOfferCardAnalytics$CardButton Passes;
    public static final ScootersOfferCardAnalytics$CardButton Payment;
    public static final ScootersOfferCardAnalytics$CardButton ScanOverCard;
    public static final ScootersOfferCardAnalytics$CardButton ScooterFromParking;
    public static final ScootersOfferCardAnalytics$CardButton Subscription;
    public static final ScootersOfferCardAnalytics$CardButton SubscriptionPromoblockToggle;
    public static final ScootersOfferCardAnalytics$CardButton SubscriptionPurchase;
    public static final ScootersOfferCardAnalytics$CardButton Superpass;
    public static final ScootersOfferCardAnalytics$CardButton Superpasses;
    private final String eventValue;

    static {
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton = new ScootersOfferCardAnalytics$CardButton("InsuranceOnboarding", 0, "insurance_onboarding");
        InsuranceOnboarding = scootersOfferCardAnalytics$CardButton;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton2 = new ScootersOfferCardAnalytics$CardButton("InsuranceToggle", 1, "insurance_toggle");
        InsuranceToggle = scootersOfferCardAnalytics$CardButton2;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton3 = new ScootersOfferCardAnalytics$CardButton("InsuranceBadge", 2, "insurance_badge");
        InsuranceBadge = scootersOfferCardAnalytics$CardButton3;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton4 = new ScootersOfferCardAnalytics$CardButton("InsuranceOption", 3, "insurance_option");
        InsuranceOption = scootersOfferCardAnalytics$CardButton4;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton5 = new ScootersOfferCardAnalytics$CardButton("Payment", 4, "payment");
        Payment = scootersOfferCardAnalytics$CardButton5;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton6 = new ScootersOfferCardAnalytics$CardButton("Onboarding", 5, "onboarding");
        Onboarding = scootersOfferCardAnalytics$CardButton6;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton7 = new ScootersOfferCardAnalytics$CardButton("Book", 6, "book");
        Book = scootersOfferCardAnalytics$CardButton7;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton8 = new ScootersOfferCardAnalytics$CardButton("Subscription", 7, "subscription");
        Subscription = scootersOfferCardAnalytics$CardButton8;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton9 = new ScootersOfferCardAnalytics$CardButton("SubscriptionPromoblockToggle", 8, "subscription_promoblock_toggle");
        SubscriptionPromoblockToggle = scootersOfferCardAnalytics$CardButton9;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton10 = new ScootersOfferCardAnalytics$CardButton("SubscriptionPurchase", 9, "subscription_purchase");
        SubscriptionPurchase = scootersOfferCardAnalytics$CardButton10;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton11 = new ScootersOfferCardAnalytics$CardButton("Package", 10, "package");
        Package = scootersOfferCardAnalytics$CardButton11;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton12 = new ScootersOfferCardAnalytics$CardButton("Superpass", 11, "superpass");
        Superpass = scootersOfferCardAnalytics$CardButton12;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton13 = new ScootersOfferCardAnalytics$CardButton("Passes", 12, "passes");
        Passes = scootersOfferCardAnalytics$CardButton13;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton14 = new ScootersOfferCardAnalytics$CardButton("Superpasses", 13, "superpasses");
        Superpasses = scootersOfferCardAnalytics$CardButton14;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton15 = new ScootersOfferCardAnalytics$CardButton("ActivePasses", 14, "active_passes");
        ActivePasses = scootersOfferCardAnalytics$CardButton15;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton16 = new ScootersOfferCardAnalytics$CardButton("ActiveSuperPasses", 15, "active_super_passes");
        ActiveSuperPasses = scootersOfferCardAnalytics$CardButton16;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton17 = new ScootersOfferCardAnalytics$CardButton("Deeplink", 16, Constants.DEEPLINK);
        Deeplink = scootersOfferCardAnalytics$CardButton17;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton18 = new ScootersOfferCardAnalytics$CardButton("ScooterFromParking", 17, "scooter_from_parking");
        ScooterFromParking = scootersOfferCardAnalytics$CardButton18;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton19 = new ScootersOfferCardAnalytics$CardButton("OfferDetails", 18, "offer_details");
        OfferDetails = scootersOfferCardAnalytics$CardButton19;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton20 = new ScootersOfferCardAnalytics$CardButton("Close", 19, "close");
        Close = scootersOfferCardAnalytics$CardButton20;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton21 = new ScootersOfferCardAnalytics$CardButton("Charity", 20, "charity");
        Charity = scootersOfferCardAnalytics$CardButton21;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton22 = new ScootersOfferCardAnalytics$CardButton("ScanOverCard", 21, "scan_over_card");
        ScanOverCard = scootersOfferCardAnalytics$CardButton22;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton23 = new ScootersOfferCardAnalytics$CardButton("MinutesOffer", 22, "minutes_offer");
        MinutesOffer = scootersOfferCardAnalytics$CardButton23;
        ScootersOfferCardAnalytics$CardButton scootersOfferCardAnalytics$CardButton24 = new ScootersOfferCardAnalytics$CardButton("FixOffer", 23, "fix_offer");
        FixOffer = scootersOfferCardAnalytics$CardButton24;
        ScootersOfferCardAnalytics$CardButton[] scootersOfferCardAnalytics$CardButtonArr = {scootersOfferCardAnalytics$CardButton, scootersOfferCardAnalytics$CardButton2, scootersOfferCardAnalytics$CardButton3, scootersOfferCardAnalytics$CardButton4, scootersOfferCardAnalytics$CardButton5, scootersOfferCardAnalytics$CardButton6, scootersOfferCardAnalytics$CardButton7, scootersOfferCardAnalytics$CardButton8, scootersOfferCardAnalytics$CardButton9, scootersOfferCardAnalytics$CardButton10, scootersOfferCardAnalytics$CardButton11, scootersOfferCardAnalytics$CardButton12, scootersOfferCardAnalytics$CardButton13, scootersOfferCardAnalytics$CardButton14, scootersOfferCardAnalytics$CardButton15, scootersOfferCardAnalytics$CardButton16, scootersOfferCardAnalytics$CardButton17, scootersOfferCardAnalytics$CardButton18, scootersOfferCardAnalytics$CardButton19, scootersOfferCardAnalytics$CardButton20, scootersOfferCardAnalytics$CardButton21, scootersOfferCardAnalytics$CardButton22, scootersOfferCardAnalytics$CardButton23, scootersOfferCardAnalytics$CardButton24};
        $VALUES = scootersOfferCardAnalytics$CardButtonArr;
        $ENTRIES = a.a(scootersOfferCardAnalytics$CardButtonArr);
    }

    public ScootersOfferCardAnalytics$CardButton(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ScootersOfferCardAnalytics$CardButton valueOf(String str) {
        return (ScootersOfferCardAnalytics$CardButton) Enum.valueOf(ScootersOfferCardAnalytics$CardButton.class, str);
    }

    public static ScootersOfferCardAnalytics$CardButton[] values() {
        return (ScootersOfferCardAnalytics$CardButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
