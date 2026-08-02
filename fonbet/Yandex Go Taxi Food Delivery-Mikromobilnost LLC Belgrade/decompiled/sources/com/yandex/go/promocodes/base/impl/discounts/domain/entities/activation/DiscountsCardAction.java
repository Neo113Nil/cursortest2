package com.yandex.go.promocodes.base.impl.discounts.domain.entities.activation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/domain/entities/activation/DiscountsCardAction;", "", "ADD", "SELECT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsCardAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiscountsCardAction[] $VALUES;
    public static final DiscountsCardAction ADD;
    public static final DiscountsCardAction SELECT;

    static {
        DiscountsCardAction discountsCardAction = new DiscountsCardAction("ADD", 0);
        ADD = discountsCardAction;
        DiscountsCardAction discountsCardAction2 = new DiscountsCardAction("SELECT", 1);
        SELECT = discountsCardAction2;
        DiscountsCardAction[] discountsCardActionArr = {discountsCardAction, discountsCardAction2};
        $VALUES = discountsCardActionArr;
        $ENTRIES = a.a(discountsCardActionArr);
    }

    public static DiscountsCardAction valueOf(String str) {
        return (DiscountsCardAction) Enum.valueOf(DiscountsCardAction.class, str);
    }

    public static DiscountsCardAction[] values() {
        return (DiscountsCardAction[]) $VALUES.clone();
    }
}
