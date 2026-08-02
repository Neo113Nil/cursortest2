package com.yandex.go.promocodes.base.impl.discounts.presentation.entities.list;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/presentation/entities/list/DiscountsListItemType;", "", "", "id", CA20Status.STATUS_USER_I, "a", "()I", "ADD", "PROMO_CODE", "REFERRAL", "PROMO_LINK", IDialogId.INTENT_EXTRA_IN_HEADER, "NULL_HEADER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsListItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscountsListItemType[] $VALUES;
    public static final DiscountsListItemType ADD;
    public static final DiscountsListItemType HEADER;
    public static final DiscountsListItemType NULL_HEADER;
    public static final DiscountsListItemType PROMO_CODE;
    public static final DiscountsListItemType PROMO_LINK;
    public static final DiscountsListItemType REFERRAL;
    private final int id;

    static {
        DiscountsListItemType discountsListItemType = new DiscountsListItemType("ADD", 0, 1);
        ADD = discountsListItemType;
        DiscountsListItemType discountsListItemType2 = new DiscountsListItemType("PROMO_CODE", 1, 2);
        PROMO_CODE = discountsListItemType2;
        DiscountsListItemType discountsListItemType3 = new DiscountsListItemType("REFERRAL", 2, 3);
        REFERRAL = discountsListItemType3;
        DiscountsListItemType discountsListItemType4 = new DiscountsListItemType("PROMO_LINK", 3, 4);
        PROMO_LINK = discountsListItemType4;
        DiscountsListItemType discountsListItemType5 = new DiscountsListItemType(IDialogId.INTENT_EXTRA_IN_HEADER, 4, 5);
        HEADER = discountsListItemType5;
        DiscountsListItemType discountsListItemType6 = new DiscountsListItemType("NULL_HEADER", 5, 6);
        NULL_HEADER = discountsListItemType6;
        DiscountsListItemType[] discountsListItemTypeArr = {discountsListItemType, discountsListItemType2, discountsListItemType3, discountsListItemType4, discountsListItemType5, discountsListItemType6};
        $VALUES = discountsListItemTypeArr;
        $ENTRIES = a.a(discountsListItemTypeArr);
    }

    public DiscountsListItemType(String str, int i, int i2) {
        this.id = i2;
    }

    public static DiscountsListItemType valueOf(String str) {
        return (DiscountsListItemType) Enum.valueOf(DiscountsListItemType.class, str);
    }

    public static DiscountsListItemType[] values() {
        return (DiscountsListItemType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }
}
