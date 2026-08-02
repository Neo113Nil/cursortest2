package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/pay/repository/api/model/offers/CompositeOfferDetails$PaymentMethod$Type", "", "Lcom/yandex/plus/pay/repository/api/model/offers/CompositeOfferDetails$PaymentMethod$Type;", "NEW_CARD", "NEW_YB_CARD", "NEW_SBP", "CARD", "SBP", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositeOfferDetails$PaymentMethod$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CompositeOfferDetails$PaymentMethod$Type[] $VALUES;
    public static final CompositeOfferDetails$PaymentMethod$Type CARD;
    public static final CompositeOfferDetails$PaymentMethod$Type NEW_CARD;
    public static final CompositeOfferDetails$PaymentMethod$Type NEW_SBP;
    public static final CompositeOfferDetails$PaymentMethod$Type NEW_YB_CARD;
    public static final CompositeOfferDetails$PaymentMethod$Type SBP;

    static {
        CompositeOfferDetails$PaymentMethod$Type compositeOfferDetails$PaymentMethod$Type = new CompositeOfferDetails$PaymentMethod$Type("NEW_CARD", 0);
        NEW_CARD = compositeOfferDetails$PaymentMethod$Type;
        CompositeOfferDetails$PaymentMethod$Type compositeOfferDetails$PaymentMethod$Type2 = new CompositeOfferDetails$PaymentMethod$Type("NEW_YB_CARD", 1);
        NEW_YB_CARD = compositeOfferDetails$PaymentMethod$Type2;
        CompositeOfferDetails$PaymentMethod$Type compositeOfferDetails$PaymentMethod$Type3 = new CompositeOfferDetails$PaymentMethod$Type("NEW_SBP", 2);
        NEW_SBP = compositeOfferDetails$PaymentMethod$Type3;
        CompositeOfferDetails$PaymentMethod$Type compositeOfferDetails$PaymentMethod$Type4 = new CompositeOfferDetails$PaymentMethod$Type("CARD", 3);
        CARD = compositeOfferDetails$PaymentMethod$Type4;
        CompositeOfferDetails$PaymentMethod$Type compositeOfferDetails$PaymentMethod$Type5 = new CompositeOfferDetails$PaymentMethod$Type("SBP", 4);
        SBP = compositeOfferDetails$PaymentMethod$Type5;
        CompositeOfferDetails$PaymentMethod$Type[] compositeOfferDetails$PaymentMethod$TypeArr = {compositeOfferDetails$PaymentMethod$Type, compositeOfferDetails$PaymentMethod$Type2, compositeOfferDetails$PaymentMethod$Type3, compositeOfferDetails$PaymentMethod$Type4, compositeOfferDetails$PaymentMethod$Type5};
        $VALUES = compositeOfferDetails$PaymentMethod$TypeArr;
        $ENTRIES = kotlin.enums.a.a(compositeOfferDetails$PaymentMethod$TypeArr);
    }

    public static CompositeOfferDetails$PaymentMethod$Type valueOf(String str) {
        return (CompositeOfferDetails$PaymentMethod$Type) Enum.valueOf(CompositeOfferDetails$PaymentMethod$Type.class, str);
    }

    public static CompositeOfferDetails$PaymentMethod$Type[] values() {
        return (CompositeOfferDetails$PaymentMethod$Type[]) $VALUES.clone();
    }
}
