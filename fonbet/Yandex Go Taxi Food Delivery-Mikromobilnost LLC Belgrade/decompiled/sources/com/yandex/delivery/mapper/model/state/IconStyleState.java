package com.yandex.delivery.mapper.model.state;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/delivery/mapper/model/state/IconStyleState;", "", "ICON", "IMAGE", "BRAND", Card.CARD_TYPE_CREDIT_DEBIT, "BRANDXS", "USERPIC", "SERVICE", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IconStyleState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IconStyleState[] $VALUES;
    public static final IconStyleState BRAND;
    public static final IconStyleState BRANDXS;
    public static final IconStyleState ICON;
    public static final IconStyleState IMAGE;
    public static final IconStyleState PAYMENT;
    public static final IconStyleState SERVICE;
    public static final IconStyleState USERPIC;

    static {
        IconStyleState iconStyleState = new IconStyleState("ICON", 0);
        ICON = iconStyleState;
        IconStyleState iconStyleState2 = new IconStyleState("IMAGE", 1);
        IMAGE = iconStyleState2;
        IconStyleState iconStyleState3 = new IconStyleState("BRAND", 2);
        BRAND = iconStyleState3;
        IconStyleState iconStyleState4 = new IconStyleState(Card.CARD_TYPE_CREDIT_DEBIT, 3);
        PAYMENT = iconStyleState4;
        IconStyleState iconStyleState5 = new IconStyleState("BRANDXS", 4);
        BRANDXS = iconStyleState5;
        IconStyleState iconStyleState6 = new IconStyleState("USERPIC", 5);
        USERPIC = iconStyleState6;
        IconStyleState iconStyleState7 = new IconStyleState("SERVICE", 6);
        SERVICE = iconStyleState7;
        IconStyleState[] iconStyleStateArr = {iconStyleState, iconStyleState2, iconStyleState3, iconStyleState4, iconStyleState5, iconStyleState6, iconStyleState7};
        $VALUES = iconStyleStateArr;
        $ENTRIES = a.a(iconStyleStateArr);
    }

    public static IconStyleState valueOf(String str) {
        return (IconStyleState) Enum.valueOf(IconStyleState.class, str);
    }

    public static IconStyleState[] values() {
        return (IconStyleState[]) $VALUES.clone();
    }
}
