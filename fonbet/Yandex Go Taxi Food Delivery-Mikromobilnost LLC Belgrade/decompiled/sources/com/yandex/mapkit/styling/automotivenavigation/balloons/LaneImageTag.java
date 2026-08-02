package com.yandex.mapkit.styling.automotivenavigation.balloons;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneImageTag;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "BIG", "SMALL", "TURN", "POCKET", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LaneImageTag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LaneImageTag[] $VALUES;
    public static final LaneImageTag LEFT = new LaneImageTag("LEFT", 0);
    public static final LaneImageTag RIGHT = new LaneImageTag("RIGHT", 1);
    public static final LaneImageTag BIG = new LaneImageTag("BIG", 2);
    public static final LaneImageTag SMALL = new LaneImageTag("SMALL", 3);
    public static final LaneImageTag TURN = new LaneImageTag("TURN", 4);
    public static final LaneImageTag POCKET = new LaneImageTag("POCKET", 5);

    private static final /* synthetic */ LaneImageTag[] $values() {
        return new LaneImageTag[]{LEFT, RIGHT, BIG, SMALL, TURN, POCKET};
    }

    static {
        LaneImageTag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private LaneImageTag(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static LaneImageTag valueOf(String str) {
        return (LaneImageTag) Enum.valueOf(LaneImageTag.class, str);
    }

    public static LaneImageTag[] values() {
        return (LaneImageTag[]) $VALUES.clone();
    }
}
