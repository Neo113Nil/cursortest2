package com.yandex.go.taxi.order.bubble;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/bubble/SimpleOrderBubbleViewHolder$State", "", "Lcom/yandex/go/taxi/order/bubble/SimpleOrderBubbleViewHolder$State;", "EXPANDED", "COLLAPSED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SimpleOrderBubbleViewHolder$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SimpleOrderBubbleViewHolder$State[] $VALUES;
    public static final SimpleOrderBubbleViewHolder$State COLLAPSED;
    public static final SimpleOrderBubbleViewHolder$State EXPANDED;

    static {
        SimpleOrderBubbleViewHolder$State simpleOrderBubbleViewHolder$State = new SimpleOrderBubbleViewHolder$State("EXPANDED", 0);
        EXPANDED = simpleOrderBubbleViewHolder$State;
        SimpleOrderBubbleViewHolder$State simpleOrderBubbleViewHolder$State2 = new SimpleOrderBubbleViewHolder$State("COLLAPSED", 1);
        COLLAPSED = simpleOrderBubbleViewHolder$State2;
        SimpleOrderBubbleViewHolder$State[] simpleOrderBubbleViewHolder$StateArr = {simpleOrderBubbleViewHolder$State, simpleOrderBubbleViewHolder$State2};
        $VALUES = simpleOrderBubbleViewHolder$StateArr;
        $ENTRIES = kotlin.enums.a.a(simpleOrderBubbleViewHolder$StateArr);
    }

    public static SimpleOrderBubbleViewHolder$State valueOf(String str) {
        return (SimpleOrderBubbleViewHolder$State) Enum.valueOf(SimpleOrderBubbleViewHolder$State.class, str);
    }

    public static SimpleOrderBubbleViewHolder$State[] values() {
        return (SimpleOrderBubbleViewHolder$State[]) $VALUES.clone();
    }
}
