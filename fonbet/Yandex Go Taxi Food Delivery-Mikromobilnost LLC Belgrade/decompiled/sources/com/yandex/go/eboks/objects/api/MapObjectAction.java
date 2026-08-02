package com.yandex.go.eboks.objects.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/eboks/objects/api/MapObjectAction;", "", "SELECT", "DESELECT", "go-client-android.features.eboks.objects:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapObjectAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapObjectAction[] $VALUES;
    public static final MapObjectAction DESELECT;
    public static final MapObjectAction SELECT;

    static {
        MapObjectAction mapObjectAction = new MapObjectAction("SELECT", 0);
        SELECT = mapObjectAction;
        MapObjectAction mapObjectAction2 = new MapObjectAction("DESELECT", 1);
        DESELECT = mapObjectAction2;
        MapObjectAction[] mapObjectActionArr = {mapObjectAction, mapObjectAction2};
        $VALUES = mapObjectActionArr;
        $ENTRIES = a.a(mapObjectActionArr);
    }

    public static MapObjectAction valueOf(String str) {
        return (MapObjectAction) Enum.valueOf(MapObjectAction.class, str);
    }

    public static MapObjectAction[] values() {
        return (MapObjectAction[]) $VALUES.clone();
    }
}
