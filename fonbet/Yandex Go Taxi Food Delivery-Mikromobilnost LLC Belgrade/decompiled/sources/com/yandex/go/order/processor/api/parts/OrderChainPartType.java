package com.yandex.go.order.processor.api.parts;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b'\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lcom/yandex/go/order/processor/api/parts/OrderChainPartType;", "", "Authorization", "NotificationPermission", "BulletsFirstOrderPopup", "TariffUnavailableAction", "IntercityContact", "EmailRequired", "SharedAccountPayment", "OrderForAnother", "AlternativeDestinationForAnother", "Maas", "DriveOffer", "ComboWarning", "Overdraft", "ExtraPhone", "ValidateDue", "ValidateTransfer", "GluedRequirement", "MultiTariff", "ExpandDetailsBySummaryButton", "ZonePaymentMethodCheck", "MultimodalOffer", "PaymentMethodRequired", "CardExpiration", "CostCenters", "DestinationRequired", "RequirementAddress", "TariffSurge", "BulletsLastOrderPopup", "Acceptance", "UnsupportedRequirements", "UnavailableRequirements", "Delivery", "ClarifySourceAddressBefore", "ClarifyPoints", "SummaryPromotions", "TollRoad", "RidaBids", "SuccessTaxi", "go-client-android.features.order.processor:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OrderChainPartType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderChainPartType[] $VALUES;
    public static final OrderChainPartType Acceptance;
    public static final OrderChainPartType AlternativeDestinationForAnother;
    public static final OrderChainPartType Authorization;
    public static final OrderChainPartType BulletsFirstOrderPopup;
    public static final OrderChainPartType BulletsLastOrderPopup;
    public static final OrderChainPartType CardExpiration;
    public static final OrderChainPartType ClarifyPoints;
    public static final OrderChainPartType ClarifySourceAddressBefore;
    public static final OrderChainPartType ComboWarning;
    public static final OrderChainPartType CostCenters;
    public static final OrderChainPartType Delivery;
    public static final OrderChainPartType DestinationRequired;
    public static final OrderChainPartType DriveOffer;
    public static final OrderChainPartType EmailRequired;
    public static final OrderChainPartType ExpandDetailsBySummaryButton;
    public static final OrderChainPartType ExtraPhone;
    public static final OrderChainPartType GluedRequirement;
    public static final OrderChainPartType IntercityContact;
    public static final OrderChainPartType Maas;
    public static final OrderChainPartType MultiTariff;
    public static final OrderChainPartType MultimodalOffer;
    public static final OrderChainPartType NotificationPermission;
    public static final OrderChainPartType OrderForAnother;
    public static final OrderChainPartType Overdraft;
    public static final OrderChainPartType PaymentMethodRequired;
    public static final OrderChainPartType RequirementAddress;
    public static final OrderChainPartType RidaBids;
    public static final OrderChainPartType SharedAccountPayment;
    public static final OrderChainPartType SuccessTaxi;
    public static final OrderChainPartType SummaryPromotions;
    public static final OrderChainPartType TariffSurge;
    public static final OrderChainPartType TariffUnavailableAction;
    public static final OrderChainPartType TollRoad;
    public static final OrderChainPartType UnavailableRequirements;
    public static final OrderChainPartType UnsupportedRequirements;
    public static final OrderChainPartType ValidateDue;
    public static final OrderChainPartType ValidateTransfer;
    public static final OrderChainPartType ZonePaymentMethodCheck;

    static {
        OrderChainPartType orderChainPartType = new OrderChainPartType("Authorization", 0);
        Authorization = orderChainPartType;
        OrderChainPartType orderChainPartType2 = new OrderChainPartType("NotificationPermission", 1);
        NotificationPermission = orderChainPartType2;
        OrderChainPartType orderChainPartType3 = new OrderChainPartType("BulletsFirstOrderPopup", 2);
        BulletsFirstOrderPopup = orderChainPartType3;
        OrderChainPartType orderChainPartType4 = new OrderChainPartType("TariffUnavailableAction", 3);
        TariffUnavailableAction = orderChainPartType4;
        OrderChainPartType orderChainPartType5 = new OrderChainPartType("IntercityContact", 4);
        IntercityContact = orderChainPartType5;
        OrderChainPartType orderChainPartType6 = new OrderChainPartType("EmailRequired", 5);
        EmailRequired = orderChainPartType6;
        OrderChainPartType orderChainPartType7 = new OrderChainPartType("SharedAccountPayment", 6);
        SharedAccountPayment = orderChainPartType7;
        OrderChainPartType orderChainPartType8 = new OrderChainPartType("OrderForAnother", 7);
        OrderForAnother = orderChainPartType8;
        OrderChainPartType orderChainPartType9 = new OrderChainPartType("AlternativeDestinationForAnother", 8);
        AlternativeDestinationForAnother = orderChainPartType9;
        OrderChainPartType orderChainPartType10 = new OrderChainPartType("Maas", 9);
        Maas = orderChainPartType10;
        OrderChainPartType orderChainPartType11 = new OrderChainPartType("DriveOffer", 10);
        DriveOffer = orderChainPartType11;
        OrderChainPartType orderChainPartType12 = new OrderChainPartType("ComboWarning", 11);
        ComboWarning = orderChainPartType12;
        OrderChainPartType orderChainPartType13 = new OrderChainPartType("Overdraft", 12);
        Overdraft = orderChainPartType13;
        OrderChainPartType orderChainPartType14 = new OrderChainPartType("ExtraPhone", 13);
        ExtraPhone = orderChainPartType14;
        OrderChainPartType orderChainPartType15 = new OrderChainPartType("ValidateDue", 14);
        ValidateDue = orderChainPartType15;
        OrderChainPartType orderChainPartType16 = new OrderChainPartType("ValidateTransfer", 15);
        ValidateTransfer = orderChainPartType16;
        OrderChainPartType orderChainPartType17 = new OrderChainPartType("GluedRequirement", 16);
        GluedRequirement = orderChainPartType17;
        OrderChainPartType orderChainPartType18 = new OrderChainPartType("MultiTariff", 17);
        MultiTariff = orderChainPartType18;
        OrderChainPartType orderChainPartType19 = new OrderChainPartType("ExpandDetailsBySummaryButton", 18);
        ExpandDetailsBySummaryButton = orderChainPartType19;
        OrderChainPartType orderChainPartType20 = new OrderChainPartType("ZonePaymentMethodCheck", 19);
        ZonePaymentMethodCheck = orderChainPartType20;
        OrderChainPartType orderChainPartType21 = new OrderChainPartType("MultimodalOffer", 20);
        MultimodalOffer = orderChainPartType21;
        OrderChainPartType orderChainPartType22 = new OrderChainPartType("PaymentMethodRequired", 21);
        PaymentMethodRequired = orderChainPartType22;
        OrderChainPartType orderChainPartType23 = new OrderChainPartType("CardExpiration", 22);
        CardExpiration = orderChainPartType23;
        OrderChainPartType orderChainPartType24 = new OrderChainPartType("CostCenters", 23);
        CostCenters = orderChainPartType24;
        OrderChainPartType orderChainPartType25 = new OrderChainPartType("DestinationRequired", 24);
        DestinationRequired = orderChainPartType25;
        OrderChainPartType orderChainPartType26 = new OrderChainPartType("RequirementAddress", 25);
        RequirementAddress = orderChainPartType26;
        OrderChainPartType orderChainPartType27 = new OrderChainPartType("TariffSurge", 26);
        TariffSurge = orderChainPartType27;
        OrderChainPartType orderChainPartType28 = new OrderChainPartType("BulletsLastOrderPopup", 27);
        BulletsLastOrderPopup = orderChainPartType28;
        OrderChainPartType orderChainPartType29 = new OrderChainPartType("Acceptance", 28);
        Acceptance = orderChainPartType29;
        OrderChainPartType orderChainPartType30 = new OrderChainPartType("UnsupportedRequirements", 29);
        UnsupportedRequirements = orderChainPartType30;
        OrderChainPartType orderChainPartType31 = new OrderChainPartType("UnavailableRequirements", 30);
        UnavailableRequirements = orderChainPartType31;
        OrderChainPartType orderChainPartType32 = new OrderChainPartType("Delivery", 31);
        Delivery = orderChainPartType32;
        OrderChainPartType orderChainPartType33 = new OrderChainPartType("ClarifySourceAddressBefore", 32);
        ClarifySourceAddressBefore = orderChainPartType33;
        OrderChainPartType orderChainPartType34 = new OrderChainPartType("ClarifyPoints", 33);
        ClarifyPoints = orderChainPartType34;
        OrderChainPartType orderChainPartType35 = new OrderChainPartType("SummaryPromotions", 34);
        SummaryPromotions = orderChainPartType35;
        OrderChainPartType orderChainPartType36 = new OrderChainPartType("TollRoad", 35);
        TollRoad = orderChainPartType36;
        OrderChainPartType orderChainPartType37 = new OrderChainPartType("RidaBids", 36);
        RidaBids = orderChainPartType37;
        OrderChainPartType orderChainPartType38 = new OrderChainPartType("SuccessTaxi", 37);
        SuccessTaxi = orderChainPartType38;
        OrderChainPartType[] orderChainPartTypeArr = {orderChainPartType, orderChainPartType2, orderChainPartType3, orderChainPartType4, orderChainPartType5, orderChainPartType6, orderChainPartType7, orderChainPartType8, orderChainPartType9, orderChainPartType10, orderChainPartType11, orderChainPartType12, orderChainPartType13, orderChainPartType14, orderChainPartType15, orderChainPartType16, orderChainPartType17, orderChainPartType18, orderChainPartType19, orderChainPartType20, orderChainPartType21, orderChainPartType22, orderChainPartType23, orderChainPartType24, orderChainPartType25, orderChainPartType26, orderChainPartType27, orderChainPartType28, orderChainPartType29, orderChainPartType30, orderChainPartType31, orderChainPartType32, orderChainPartType33, orderChainPartType34, orderChainPartType35, orderChainPartType36, orderChainPartType37, orderChainPartType38};
        $VALUES = orderChainPartTypeArr;
        $ENTRIES = a.a(orderChainPartTypeArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static OrderChainPartType valueOf(String str) {
        return (OrderChainPartType) Enum.valueOf(OrderChainPartType.class, str);
    }

    public static OrderChainPartType[] values() {
        return (OrderChainPartType[]) $VALUES.clone();
    }
}
