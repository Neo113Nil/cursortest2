package com.yandex.go.navigator;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/navigator/Direction;", "", "CLOCKWISE", "COUNTER_CLOCKWISE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final class Direction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction CLOCKWISE;
    public static final Direction COUNTER_CLOCKWISE;

    static {
        Direction direction = new Direction("CLOCKWISE", 0);
        CLOCKWISE = direction;
        Direction direction2 = new Direction("COUNTER_CLOCKWISE", 1);
        COUNTER_CLOCKWISE = direction2;
        Direction[] directionArr = {direction, direction2};
        $VALUES = directionArr;
        $ENTRIES = kotlin.enums.a.a(directionArr);
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
