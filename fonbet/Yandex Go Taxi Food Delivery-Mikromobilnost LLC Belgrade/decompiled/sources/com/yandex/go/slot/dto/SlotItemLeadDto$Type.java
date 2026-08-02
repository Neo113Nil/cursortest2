package com.yandex.go.slot.dto;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/slot/dto/SlotItemLeadDto$Type", "", "Lcom/yandex/go/slot/dto/SlotItemLeadDto$Type;", JCP.RAW_PREFIX, "ICON", "IMAGE", Card.CARD_TYPE_CREDIT_DEBIT, "go-client-android.features.slot:dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SlotItemLeadDto$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotItemLeadDto$Type[] $VALUES;
    public static final SlotItemLeadDto$Type ICON;
    public static final SlotItemLeadDto$Type IMAGE;
    public static final SlotItemLeadDto$Type NONE;
    public static final SlotItemLeadDto$Type PAYMENT;

    static {
        SlotItemLeadDto$Type slotItemLeadDto$Type = new SlotItemLeadDto$Type(JCP.RAW_PREFIX, 0);
        NONE = slotItemLeadDto$Type;
        SlotItemLeadDto$Type slotItemLeadDto$Type2 = new SlotItemLeadDto$Type("ICON", 1);
        ICON = slotItemLeadDto$Type2;
        SlotItemLeadDto$Type slotItemLeadDto$Type3 = new SlotItemLeadDto$Type("IMAGE", 2);
        IMAGE = slotItemLeadDto$Type3;
        SlotItemLeadDto$Type slotItemLeadDto$Type4 = new SlotItemLeadDto$Type(Card.CARD_TYPE_CREDIT_DEBIT, 3);
        PAYMENT = slotItemLeadDto$Type4;
        SlotItemLeadDto$Type[] slotItemLeadDto$TypeArr = {slotItemLeadDto$Type, slotItemLeadDto$Type2, slotItemLeadDto$Type3, slotItemLeadDto$Type4};
        $VALUES = slotItemLeadDto$TypeArr;
        $ENTRIES = kotlin.enums.a.a(slotItemLeadDto$TypeArr);
    }

    public static SlotItemLeadDto$Type valueOf(String str) {
        return (SlotItemLeadDto$Type) Enum.valueOf(SlotItemLeadDto$Type.class, str);
    }

    public static SlotItemLeadDto$Type[] values() {
        return (SlotItemLeadDto$Type[]) $VALUES.clone();
    }
}
