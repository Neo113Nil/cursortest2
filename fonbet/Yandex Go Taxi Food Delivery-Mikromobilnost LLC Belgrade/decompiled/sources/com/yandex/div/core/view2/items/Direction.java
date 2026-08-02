package com.yandex.div.core.view2.items;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/items/Direction;", "", "NEXT", "PREVIOUS", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Direction {
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction NEXT;
    public static final Direction PREVIOUS;

    static {
        Direction direction = new Direction("NEXT", 0);
        NEXT = direction;
        Direction direction2 = new Direction("PREVIOUS", 1);
        PREVIOUS = direction2;
        $VALUES = new Direction[]{direction, direction2};
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
