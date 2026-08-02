package com.yandex.go.promocodes.base.impl.discounts.domain.entities.activation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/domain/entities/activation/DiscountsPromoCodeActivationAction;", "", "DO_NOTHING", "ACTIVATE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsPromoCodeActivationAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscountsPromoCodeActivationAction[] $VALUES;
    public static final DiscountsPromoCodeActivationAction ACTIVATE;
    public static final DiscountsPromoCodeActivationAction DO_NOTHING;

    static {
        DiscountsPromoCodeActivationAction discountsPromoCodeActivationAction = new DiscountsPromoCodeActivationAction("DO_NOTHING", 0);
        DO_NOTHING = discountsPromoCodeActivationAction;
        DiscountsPromoCodeActivationAction discountsPromoCodeActivationAction2 = new DiscountsPromoCodeActivationAction("ACTIVATE", 1);
        ACTIVATE = discountsPromoCodeActivationAction2;
        DiscountsPromoCodeActivationAction[] discountsPromoCodeActivationActionArr = {discountsPromoCodeActivationAction, discountsPromoCodeActivationAction2};
        $VALUES = discountsPromoCodeActivationActionArr;
        $ENTRIES = a.a(discountsPromoCodeActivationActionArr);
    }

    public static DiscountsPromoCodeActivationAction valueOf(String str) {
        return (DiscountsPromoCodeActivationAction) Enum.valueOf(DiscountsPromoCodeActivationAction.class, str);
    }

    public static DiscountsPromoCodeActivationAction[] values() {
        return (DiscountsPromoCodeActivationAction[]) $VALUES.clone();
    }
}
