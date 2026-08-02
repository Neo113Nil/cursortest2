package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.kr00;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/m0", "DisplayableObjectType", "ZoomableObjectType", "$serializer", "com/yandex/go/taxi/order/models/api/objects/c0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MapRouteParametersDto {
    public static final c0 Companion = new c0();
    public static final i3y[] d;
    public final m0 a;
    public final jsq0 b;
    public final jsq0 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$DisplayableObjectType;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/d0", "STARTING_LOCATION", "DESTINATION_LOCATION", "POIS", "TRANSIT_POINTS", "CURRENT_LOCATION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DisplayableObjectType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DisplayableObjectType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final DisplayableObjectType CURRENT_LOCATION;
        public static final d0 Companion;
        public static final DisplayableObjectType DESTINATION_LOCATION;
        public static final DisplayableObjectType POIS;
        public static final DisplayableObjectType STARTING_LOCATION;
        public static final DisplayableObjectType TRANSIT_POINTS;

        static {
            DisplayableObjectType displayableObjectType = new DisplayableObjectType("STARTING_LOCATION", 0);
            STARTING_LOCATION = displayableObjectType;
            DisplayableObjectType displayableObjectType2 = new DisplayableObjectType("DESTINATION_LOCATION", 1);
            DESTINATION_LOCATION = displayableObjectType2;
            DisplayableObjectType displayableObjectType3 = new DisplayableObjectType("POIS", 2);
            POIS = displayableObjectType3;
            DisplayableObjectType displayableObjectType4 = new DisplayableObjectType("TRANSIT_POINTS", 3);
            TRANSIT_POINTS = displayableObjectType4;
            DisplayableObjectType displayableObjectType5 = new DisplayableObjectType("CURRENT_LOCATION", 4);
            CURRENT_LOCATION = displayableObjectType5;
            DisplayableObjectType[] displayableObjectTypeArr = {displayableObjectType, displayableObjectType2, displayableObjectType3, displayableObjectType4, displayableObjectType5};
            $VALUES = displayableObjectTypeArr;
            $ENTRIES = kotlin.enums.a.a(displayableObjectTypeArr);
            Companion = new d0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(3));
        }

        public static DisplayableObjectType valueOf(String str) {
            return (DisplayableObjectType) Enum.valueOf(DisplayableObjectType.class, str);
        }

        public static DisplayableObjectType[] values() {
            return (DisplayableObjectType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$ZoomableObjectType;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/n0", "STARTING_LOCATION", "DESTINATION_LOCATION", "CURRENT_LOCATION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ZoomableObjectType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ZoomableObjectType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ZoomableObjectType CURRENT_LOCATION;
        public static final n0 Companion;
        public static final ZoomableObjectType DESTINATION_LOCATION;
        public static final ZoomableObjectType STARTING_LOCATION;

        static {
            ZoomableObjectType zoomableObjectType = new ZoomableObjectType("STARTING_LOCATION", 0);
            STARTING_LOCATION = zoomableObjectType;
            ZoomableObjectType zoomableObjectType2 = new ZoomableObjectType("DESTINATION_LOCATION", 1);
            DESTINATION_LOCATION = zoomableObjectType2;
            ZoomableObjectType zoomableObjectType3 = new ZoomableObjectType("CURRENT_LOCATION", 2);
            CURRENT_LOCATION = zoomableObjectType3;
            ZoomableObjectType[] zoomableObjectTypeArr = {zoomableObjectType, zoomableObjectType2, zoomableObjectType3};
            $VALUES = zoomableObjectTypeArr;
            $ENTRIES = kotlin.enums.a.a(zoomableObjectTypeArr);
            Companion = new n0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(9));
        }

        public static ZoomableObjectType valueOf(String str) {
            return (ZoomableObjectType) Enum.valueOf(ZoomableObjectType.class, str);
        }

        public static ZoomableObjectType[] values() {
            return (ZoomableObjectType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new kr00(1)), kotlin.a.b(lazyThreadSafetyMode, new kr00(2))};
    }

    public /* synthetic */ MapRouteParametersDto(int i, m0 m0Var, jsq0 jsq0Var, jsq0 jsq0Var2) {
        this.a = (i & 1) == 0 ? l0.INSTANCE : m0Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = jsq0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jsq0Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapRouteParametersDto)) {
            return false;
        }
        MapRouteParametersDto mapRouteParametersDto = (MapRouteParametersDto) obj;
        return jl40.l(this.a, mapRouteParametersDto.a) && jl40.l(this.b, mapRouteParametersDto.b) && jl40.l(this.c, mapRouteParametersDto.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jsq0 jsq0Var = this.b;
        int hashCode2 = (hashCode + (jsq0Var == null ? 0 : jsq0Var.a.hashCode())) * 31;
        jsq0 jsq0Var2 = this.c;
        return hashCode2 + (jsq0Var2 != null ? jsq0Var2.a.hashCode() : 0);
    }

    public final String toString() {
        return "MapRouteParametersDto(mapRouteType=" + this.a + ", objectsToDisplay=" + this.b + ", objectsToFitOnScreen=" + this.c + Extension.C_BRAKE;
    }

    public MapRouteParametersDto() {
        this.a = l0.INSTANCE;
        this.b = null;
        this.c = null;
    }
}
