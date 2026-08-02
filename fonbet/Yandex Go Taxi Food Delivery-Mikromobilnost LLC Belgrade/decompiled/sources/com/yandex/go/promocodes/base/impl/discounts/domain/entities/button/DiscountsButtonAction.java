package com.yandex.go.promocodes.base.impl.discounts.domain.entities.button;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/domain/entities/button/DiscountsButtonAction;", "", "GO_TO_ORDER", "SELECT_CARD", "ADD_CARD", "REMOVE_PROMO_CODE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscountsButtonAction[] $VALUES;
    public static final DiscountsButtonAction ADD_CARD;
    public static final DiscountsButtonAction GO_TO_ORDER;
    public static final DiscountsButtonAction REMOVE_PROMO_CODE;
    public static final DiscountsButtonAction SELECT_CARD;

    static {
        DiscountsButtonAction discountsButtonAction = new DiscountsButtonAction("GO_TO_ORDER", 0);
        GO_TO_ORDER = discountsButtonAction;
        DiscountsButtonAction discountsButtonAction2 = new DiscountsButtonAction("SELECT_CARD", 1);
        SELECT_CARD = discountsButtonAction2;
        DiscountsButtonAction discountsButtonAction3 = new DiscountsButtonAction("ADD_CARD", 2);
        ADD_CARD = discountsButtonAction3;
        DiscountsButtonAction discountsButtonAction4 = new DiscountsButtonAction("REMOVE_PROMO_CODE", 3);
        REMOVE_PROMO_CODE = discountsButtonAction4;
        DiscountsButtonAction[] discountsButtonActionArr = {discountsButtonAction, discountsButtonAction2, discountsButtonAction3, discountsButtonAction4};
        $VALUES = discountsButtonActionArr;
        $ENTRIES = a.a(discountsButtonActionArr);
    }

    public static DiscountsButtonAction valueOf(String str) {
        return (DiscountsButtonAction) Enum.valueOf(DiscountsButtonAction.class, str);
    }

    public static DiscountsButtonAction[] values() {
        return (DiscountsButtonAction[]) $VALUES.clone();
    }
}
