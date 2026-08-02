package com.yandex.go.geosharing.net;

import defpackage.gsq0;
import defpackage.qje;
import java.util.Calendar;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/geosharing/net/LocationDataParam;", "", "Companion", "GeoPosition", "$serializer", "com/yandex/go/geosharing/net/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LocationDataParam {
    public static final a Companion = new a();
    public final String a;
    public final GeoPosition b;

    public /* synthetic */ LocationDataParam(int i, String str, GeoPosition geoPosition) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, LocationDataParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = geoPosition;
    }

    public LocationDataParam(String str, GeoPosition geoPosition) {
        this.a = str;
        this.b = geoPosition;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/geosharing/net/LocationDataParam$GeoPosition;", "", "Companion", "$serializer", "com/yandex/go/geosharing/net/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class GeoPosition {
        public static final b Companion = new b();
        public final String a;
        public final double b;
        public final double c;
        public final double d;
        public final Calendar e;

        public /* synthetic */ GeoPosition(int i, String str, double d, double d2, double d3, Calendar calendar) {
            if (31 != (i & 31)) {
                qje.Z(i, 31, LocationDataParam$GeoPosition$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = d;
            this.c = d2;
            this.d = d3;
            this.e = calendar;
        }

        public GeoPosition(String str, double d, double d2, double d3, Calendar calendar) {
            this.a = str;
            this.b = d;
            this.c = d2;
            this.d = d3;
            this.e = calendar;
        }
    }
}
