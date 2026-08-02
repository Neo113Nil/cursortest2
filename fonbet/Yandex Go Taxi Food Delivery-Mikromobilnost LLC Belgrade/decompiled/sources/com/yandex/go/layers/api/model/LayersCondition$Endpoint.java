package com.yandex.go.layers.api.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/layers/api/model/LayersCondition$Endpoint", "", "Lcom/yandex/go/layers/api/model/LayersCondition$Endpoint;", "OBJECTS", "POLYGONS", "POLYLINES", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayersCondition$Endpoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LayersCondition$Endpoint[] $VALUES;
    public static final LayersCondition$Endpoint OBJECTS;
    public static final LayersCondition$Endpoint POLYGONS;
    public static final LayersCondition$Endpoint POLYLINES;

    static {
        LayersCondition$Endpoint layersCondition$Endpoint = new LayersCondition$Endpoint("OBJECTS", 0);
        OBJECTS = layersCondition$Endpoint;
        LayersCondition$Endpoint layersCondition$Endpoint2 = new LayersCondition$Endpoint("POLYGONS", 1);
        POLYGONS = layersCondition$Endpoint2;
        LayersCondition$Endpoint layersCondition$Endpoint3 = new LayersCondition$Endpoint("POLYLINES", 2);
        POLYLINES = layersCondition$Endpoint3;
        LayersCondition$Endpoint[] layersCondition$EndpointArr = {layersCondition$Endpoint, layersCondition$Endpoint2, layersCondition$Endpoint3};
        $VALUES = layersCondition$EndpointArr;
        $ENTRIES = a.a(layersCondition$EndpointArr);
    }

    public static LayersCondition$Endpoint valueOf(String str) {
        return (LayersCondition$Endpoint) Enum.valueOf(LayersCondition$Endpoint.class, str);
    }

    public static LayersCondition$Endpoint[] values() {
        return (LayersCondition$Endpoint[]) $VALUES.clone();
    }
}
