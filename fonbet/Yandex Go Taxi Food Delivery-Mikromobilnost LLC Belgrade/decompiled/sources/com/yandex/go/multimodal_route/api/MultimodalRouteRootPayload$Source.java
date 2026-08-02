package com.yandex.go.multimodal_route.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/multimodal_route/api/MultimodalRouteRootPayload$Source", "", "Lcom/yandex/go/multimodal_route/api/MultimodalRouteRootPayload$Source;", "Hub", "Taxi", "Transport", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MultimodalRouteRootPayload$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultimodalRouteRootPayload$Source[] $VALUES;
    public static final MultimodalRouteRootPayload$Source Hub;
    public static final MultimodalRouteRootPayload$Source Taxi;
    public static final MultimodalRouteRootPayload$Source Transport;

    static {
        MultimodalRouteRootPayload$Source multimodalRouteRootPayload$Source = new MultimodalRouteRootPayload$Source("Hub", 0);
        Hub = multimodalRouteRootPayload$Source;
        MultimodalRouteRootPayload$Source multimodalRouteRootPayload$Source2 = new MultimodalRouteRootPayload$Source("Taxi", 1);
        Taxi = multimodalRouteRootPayload$Source2;
        MultimodalRouteRootPayload$Source multimodalRouteRootPayload$Source3 = new MultimodalRouteRootPayload$Source("Transport", 2);
        Transport = multimodalRouteRootPayload$Source3;
        MultimodalRouteRootPayload$Source[] multimodalRouteRootPayload$SourceArr = {multimodalRouteRootPayload$Source, multimodalRouteRootPayload$Source2, multimodalRouteRootPayload$Source3};
        $VALUES = multimodalRouteRootPayload$SourceArr;
        $ENTRIES = a.a(multimodalRouteRootPayload$SourceArr);
    }

    public static MultimodalRouteRootPayload$Source valueOf(String str) {
        return (MultimodalRouteRootPayload$Source) Enum.valueOf(MultimodalRouteRootPayload$Source.class, str);
    }

    public static MultimodalRouteRootPayload$Source[] values() {
        return (MultimodalRouteRootPayload$Source[]) $VALUES.clone();
    }
}
