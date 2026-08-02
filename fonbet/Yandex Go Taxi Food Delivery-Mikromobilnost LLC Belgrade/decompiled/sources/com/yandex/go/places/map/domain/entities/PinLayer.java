package com.yandex.go.places.map.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/places/map/domain/entities/PinLayer;", "", "MAIN", "SOCIAL", PolicyMappingsExtension.MAP}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PinLayer {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PinLayer[] $VALUES;
    public static final PinLayer MAIN;
    public static final PinLayer SOCIAL;

    static {
        PinLayer pinLayer = new PinLayer("MAIN", 0);
        MAIN = pinLayer;
        PinLayer pinLayer2 = new PinLayer("SOCIAL", 1);
        SOCIAL = pinLayer2;
        PinLayer[] pinLayerArr = {pinLayer, pinLayer2};
        $VALUES = pinLayerArr;
        $ENTRIES = a.a(pinLayerArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static PinLayer valueOf(String str) {
        return (PinLayer) Enum.valueOf(PinLayer.class, str);
    }

    public static PinLayer[] values() {
        return (PinLayer[]) $VALUES.clone();
    }
}
