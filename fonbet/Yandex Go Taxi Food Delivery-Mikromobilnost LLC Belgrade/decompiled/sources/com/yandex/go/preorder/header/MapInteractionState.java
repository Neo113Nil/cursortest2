package com.yandex.go.preorder.header;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/preorder/header/MapInteractionState;", "", "INTERACTING", "IDLE", "DRAGGING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapInteractionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapInteractionState[] $VALUES;
    public static final MapInteractionState DRAGGING;
    public static final MapInteractionState IDLE;
    public static final MapInteractionState INTERACTING;

    static {
        MapInteractionState mapInteractionState = new MapInteractionState("INTERACTING", 0);
        INTERACTING = mapInteractionState;
        MapInteractionState mapInteractionState2 = new MapInteractionState("IDLE", 1);
        IDLE = mapInteractionState2;
        MapInteractionState mapInteractionState3 = new MapInteractionState("DRAGGING", 2);
        DRAGGING = mapInteractionState3;
        MapInteractionState[] mapInteractionStateArr = {mapInteractionState, mapInteractionState2, mapInteractionState3};
        $VALUES = mapInteractionStateArr;
        $ENTRIES = kotlin.enums.a.a(mapInteractionStateArr);
    }

    public static MapInteractionState valueOf(String str) {
        return (MapInteractionState) Enum.valueOf(MapInteractionState.class, str);
    }

    public static MapInteractionState[] values() {
        return (MapInteractionState[]) $VALUES.clone();
    }
}
