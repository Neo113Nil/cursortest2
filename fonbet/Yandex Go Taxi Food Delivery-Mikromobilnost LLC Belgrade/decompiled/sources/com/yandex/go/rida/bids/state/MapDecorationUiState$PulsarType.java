package com.yandex.go.rida.bids.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/rida/bids/state/MapDecorationUiState$PulsarType", "", "Lcom/yandex/go/rida/bids/state/MapDecorationUiState$PulsarType;", JCP.RAW_PREFIX, "TWO_CIRCLES", "WIDE_CIRCLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapDecorationUiState$PulsarType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapDecorationUiState$PulsarType[] $VALUES;
    public static final MapDecorationUiState$PulsarType NONE;
    public static final MapDecorationUiState$PulsarType TWO_CIRCLES;
    public static final MapDecorationUiState$PulsarType WIDE_CIRCLE;

    static {
        MapDecorationUiState$PulsarType mapDecorationUiState$PulsarType = new MapDecorationUiState$PulsarType(JCP.RAW_PREFIX, 0);
        NONE = mapDecorationUiState$PulsarType;
        MapDecorationUiState$PulsarType mapDecorationUiState$PulsarType2 = new MapDecorationUiState$PulsarType("TWO_CIRCLES", 1);
        TWO_CIRCLES = mapDecorationUiState$PulsarType2;
        MapDecorationUiState$PulsarType mapDecorationUiState$PulsarType3 = new MapDecorationUiState$PulsarType("WIDE_CIRCLE", 2);
        WIDE_CIRCLE = mapDecorationUiState$PulsarType3;
        MapDecorationUiState$PulsarType[] mapDecorationUiState$PulsarTypeArr = {mapDecorationUiState$PulsarType, mapDecorationUiState$PulsarType2, mapDecorationUiState$PulsarType3};
        $VALUES = mapDecorationUiState$PulsarTypeArr;
        $ENTRIES = a.a(mapDecorationUiState$PulsarTypeArr);
    }

    public static MapDecorationUiState$PulsarType valueOf(String str) {
        return (MapDecorationUiState$PulsarType) Enum.valueOf(MapDecorationUiState$PulsarType.class, str);
    }

    public static MapDecorationUiState$PulsarType[] values() {
        return (MapDecorationUiState$PulsarType[]) $VALUES.clone();
    }
}
