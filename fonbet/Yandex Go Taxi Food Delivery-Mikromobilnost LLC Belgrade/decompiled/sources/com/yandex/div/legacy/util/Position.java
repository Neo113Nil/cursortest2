package com.yandex.div.legacy.util;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/legacy/util/Position;", "", "LEFT", "RIGHT", "div-legacy_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Position {
    private static final /* synthetic */ Position[] $VALUES;
    public static final Position LEFT;
    public static final Position RIGHT;

    static {
        Position position = new Position("LEFT", 0);
        LEFT = position;
        Position position2 = new Position("RIGHT", 1);
        RIGHT = position2;
        $VALUES = new Position[]{position, position2};
    }

    public static Position valueOf(String str) {
        return (Position) Enum.valueOf(Position.class, str);
    }

    public static Position[] values() {
        return (Position[]) $VALUES.clone();
    }
}
