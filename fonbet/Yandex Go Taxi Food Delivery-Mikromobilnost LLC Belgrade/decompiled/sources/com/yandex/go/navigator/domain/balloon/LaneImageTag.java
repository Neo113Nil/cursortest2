package com.yandex.go.navigator.domain.balloon;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/navigator/domain/balloon/LaneImageTag;", "", "LEFT", "RIGHT", "BIG", "SMALL", "TURN", "POCKET", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LaneImageTag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LaneImageTag[] $VALUES;
    public static final LaneImageTag BIG;
    public static final LaneImageTag LEFT;
    public static final LaneImageTag POCKET;
    public static final LaneImageTag RIGHT;
    public static final LaneImageTag SMALL;
    public static final LaneImageTag TURN;

    static {
        LaneImageTag laneImageTag = new LaneImageTag("LEFT", 0);
        LEFT = laneImageTag;
        LaneImageTag laneImageTag2 = new LaneImageTag("RIGHT", 1);
        RIGHT = laneImageTag2;
        LaneImageTag laneImageTag3 = new LaneImageTag("BIG", 2);
        BIG = laneImageTag3;
        LaneImageTag laneImageTag4 = new LaneImageTag("SMALL", 3);
        SMALL = laneImageTag4;
        LaneImageTag laneImageTag5 = new LaneImageTag("TURN", 4);
        TURN = laneImageTag5;
        LaneImageTag laneImageTag6 = new LaneImageTag("POCKET", 5);
        POCKET = laneImageTag6;
        LaneImageTag[] laneImageTagArr = {laneImageTag, laneImageTag2, laneImageTag3, laneImageTag4, laneImageTag5, laneImageTag6};
        $VALUES = laneImageTagArr;
        $ENTRIES = a.a(laneImageTagArr);
    }

    public static LaneImageTag valueOf(String str) {
        return (LaneImageTag) Enum.valueOf(LaneImageTag.class, str);
    }

    public static LaneImageTag[] values() {
        return (LaneImageTag[]) $VALUES.clone();
    }
}
