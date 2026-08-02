package com.yandex.go.chargers.analytics;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/chargers/analytics/ChargersAnalytics$ChargersDiscountDetailsButton", "", "Lcom/yandex/go/chargers/analytics/ChargersAnalytics$ChargersDiscountDetailsButton;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LocationsList", "Apply", "ActivatePromocode", "ChoosePaymentMethod", "Ok", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAnalytics$ChargersDiscountDetailsButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersAnalytics$ChargersDiscountDetailsButton[] $VALUES;
    public static final ChargersAnalytics$ChargersDiscountDetailsButton ActivatePromocode;
    public static final ChargersAnalytics$ChargersDiscountDetailsButton Apply;
    public static final ChargersAnalytics$ChargersDiscountDetailsButton ChoosePaymentMethod;
    public static final ChargersAnalytics$ChargersDiscountDetailsButton LocationsList;
    public static final ChargersAnalytics$ChargersDiscountDetailsButton Ok;
    private final String eventValue;

    static {
        ChargersAnalytics$ChargersDiscountDetailsButton chargersAnalytics$ChargersDiscountDetailsButton = new ChargersAnalytics$ChargersDiscountDetailsButton("LocationsList", 0, "locations_list");
        LocationsList = chargersAnalytics$ChargersDiscountDetailsButton;
        ChargersAnalytics$ChargersDiscountDetailsButton chargersAnalytics$ChargersDiscountDetailsButton2 = new ChargersAnalytics$ChargersDiscountDetailsButton("Apply", 1, "apply");
        Apply = chargersAnalytics$ChargersDiscountDetailsButton2;
        ChargersAnalytics$ChargersDiscountDetailsButton chargersAnalytics$ChargersDiscountDetailsButton3 = new ChargersAnalytics$ChargersDiscountDetailsButton("ActivatePromocode", 2, "activate_promocode");
        ActivatePromocode = chargersAnalytics$ChargersDiscountDetailsButton3;
        ChargersAnalytics$ChargersDiscountDetailsButton chargersAnalytics$ChargersDiscountDetailsButton4 = new ChargersAnalytics$ChargersDiscountDetailsButton("ChoosePaymentMethod", 3, "choose_payment_method");
        ChoosePaymentMethod = chargersAnalytics$ChargersDiscountDetailsButton4;
        ChargersAnalytics$ChargersDiscountDetailsButton chargersAnalytics$ChargersDiscountDetailsButton5 = new ChargersAnalytics$ChargersDiscountDetailsButton("Ok", 4, WriteBlocks.OK);
        Ok = chargersAnalytics$ChargersDiscountDetailsButton5;
        ChargersAnalytics$ChargersDiscountDetailsButton[] chargersAnalytics$ChargersDiscountDetailsButtonArr = {chargersAnalytics$ChargersDiscountDetailsButton, chargersAnalytics$ChargersDiscountDetailsButton2, chargersAnalytics$ChargersDiscountDetailsButton3, chargersAnalytics$ChargersDiscountDetailsButton4, chargersAnalytics$ChargersDiscountDetailsButton5};
        $VALUES = chargersAnalytics$ChargersDiscountDetailsButtonArr;
        $ENTRIES = a.a(chargersAnalytics$ChargersDiscountDetailsButtonArr);
    }

    public ChargersAnalytics$ChargersDiscountDetailsButton(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChargersAnalytics$ChargersDiscountDetailsButton valueOf(String str) {
        return (ChargersAnalytics$ChargersDiscountDetailsButton) Enum.valueOf(ChargersAnalytics$ChargersDiscountDetailsButton.class, str);
    }

    public static ChargersAnalytics$ChargersDiscountDetailsButton[] values() {
        return (ChargersAnalytics$ChargersDiscountDetailsButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
