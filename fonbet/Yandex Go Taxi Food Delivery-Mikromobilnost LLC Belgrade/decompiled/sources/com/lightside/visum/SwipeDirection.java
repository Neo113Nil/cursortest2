package com.lightside.visum;

import defpackage.k4o;
import defpackage.uxw0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/lightside/visum/SwipeDirection;", "", "Companion", "uxw0", "UP", "DOWN", "LEFT", "RIGHT", "visum_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SwipeDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SwipeDirection[] $VALUES;
    public static final uxw0 Companion;
    public static final SwipeDirection DOWN;
    public static final SwipeDirection LEFT;
    public static final SwipeDirection RIGHT;
    public static final SwipeDirection UP;

    static {
        SwipeDirection swipeDirection = new SwipeDirection("UP", 0);
        UP = swipeDirection;
        SwipeDirection swipeDirection2 = new SwipeDirection("DOWN", 1);
        DOWN = swipeDirection2;
        SwipeDirection swipeDirection3 = new SwipeDirection("LEFT", 2);
        LEFT = swipeDirection3;
        SwipeDirection swipeDirection4 = new SwipeDirection("RIGHT", 3);
        RIGHT = swipeDirection4;
        SwipeDirection[] swipeDirectionArr = {swipeDirection, swipeDirection2, swipeDirection3, swipeDirection4};
        $VALUES = swipeDirectionArr;
        $ENTRIES = kotlin.enums.a.a(swipeDirectionArr);
        Companion = new uxw0();
    }

    public static SwipeDirection valueOf(String str) {
        return (SwipeDirection) Enum.valueOf(SwipeDirection.class, str);
    }

    public static SwipeDirection[] values() {
        return (SwipeDirection[]) $VALUES.clone();
    }
}
