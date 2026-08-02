package com.yandex.go.layers.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/layers/api/model/MapObjectComponentType;", "", "BODY", TlsConstants.TLS_LABEL, "BUBBLE", "OVERLAY", "IMAGE_OVERLAY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapObjectComponentType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapObjectComponentType[] $VALUES;
    public static final MapObjectComponentType BODY;
    public static final MapObjectComponentType BUBBLE;
    public static final MapObjectComponentType IMAGE_OVERLAY;
    public static final MapObjectComponentType LABEL;
    public static final MapObjectComponentType OVERLAY;

    static {
        MapObjectComponentType mapObjectComponentType = new MapObjectComponentType("BODY", 0);
        BODY = mapObjectComponentType;
        MapObjectComponentType mapObjectComponentType2 = new MapObjectComponentType(TlsConstants.TLS_LABEL, 1);
        LABEL = mapObjectComponentType2;
        MapObjectComponentType mapObjectComponentType3 = new MapObjectComponentType("BUBBLE", 2);
        BUBBLE = mapObjectComponentType3;
        MapObjectComponentType mapObjectComponentType4 = new MapObjectComponentType("OVERLAY", 3);
        OVERLAY = mapObjectComponentType4;
        MapObjectComponentType mapObjectComponentType5 = new MapObjectComponentType("IMAGE_OVERLAY", 4);
        IMAGE_OVERLAY = mapObjectComponentType5;
        MapObjectComponentType[] mapObjectComponentTypeArr = {mapObjectComponentType, mapObjectComponentType2, mapObjectComponentType3, mapObjectComponentType4, mapObjectComponentType5};
        $VALUES = mapObjectComponentTypeArr;
        $ENTRIES = a.a(mapObjectComponentTypeArr);
    }

    public static MapObjectComponentType valueOf(String str) {
        return (MapObjectComponentType) Enum.valueOf(MapObjectComponentType.class, str);
    }

    public static MapObjectComponentType[] values() {
        return (MapObjectComponentType[]) $VALUES.clone();
    }
}
