package com.yandex.go.taxi.order.bubble;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/bubble/StyledOrderBubbleViewHolder$State", "", "Lcom/yandex/go/taxi/order/bubble/StyledOrderBubbleViewHolder$State;", "COLLAPSED", "EXPANDED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StyledOrderBubbleViewHolder$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StyledOrderBubbleViewHolder$State[] $VALUES;
    public static final StyledOrderBubbleViewHolder$State COLLAPSED;
    public static final StyledOrderBubbleViewHolder$State EXPANDED;

    static {
        StyledOrderBubbleViewHolder$State styledOrderBubbleViewHolder$State = new StyledOrderBubbleViewHolder$State("COLLAPSED", 0);
        COLLAPSED = styledOrderBubbleViewHolder$State;
        StyledOrderBubbleViewHolder$State styledOrderBubbleViewHolder$State2 = new StyledOrderBubbleViewHolder$State("EXPANDED", 1);
        EXPANDED = styledOrderBubbleViewHolder$State2;
        StyledOrderBubbleViewHolder$State[] styledOrderBubbleViewHolder$StateArr = {styledOrderBubbleViewHolder$State, styledOrderBubbleViewHolder$State2};
        $VALUES = styledOrderBubbleViewHolder$StateArr;
        $ENTRIES = kotlin.enums.a.a(styledOrderBubbleViewHolder$StateArr);
    }

    public static StyledOrderBubbleViewHolder$State valueOf(String str) {
        return (StyledOrderBubbleViewHolder$State) Enum.valueOf(StyledOrderBubbleViewHolder$State.class, str);
    }

    public static StyledOrderBubbleViewHolder$State[] values() {
        return (StyledOrderBubbleViewHolder$State[]) $VALUES.clone();
    }
}
