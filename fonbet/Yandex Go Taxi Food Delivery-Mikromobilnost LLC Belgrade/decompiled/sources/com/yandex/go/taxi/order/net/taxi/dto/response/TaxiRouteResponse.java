package com.yandex.go.taxi.order.net.taxi.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.xvz;
import defpackage.y6y0;
import defpackage.zzs;
import java.util.Date;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse;", "", "Companion", "com/yandex/go/taxi/order/net/taxi/dto/response/h", "aay0", "DriverRouteGeometryPolyline", "DriverInfo", "DriverPath", "TrackPoint", "$serializer", "com/yandex/go/taxi/order/net/taxi/dto/response/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiRouteResponse {
    public static final a Companion = new a();
    public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(4)), null, null};
    public final DriverInfo a;
    public final DriverPath b;
    public final List c;
    public final boolean d;
    public final h e;

    public /* synthetic */ TaxiRouteResponse(int i, DriverInfo driverInfo, DriverPath driverPath, List list, boolean z, h hVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = driverInfo;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = driverPath;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = hVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse$DriverPath;", "", "Companion", "ActiveRoute", "$serializer", "com/yandex/go/taxi/order/net/taxi/dto/response/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DriverPath {
        public static final d Companion = new d();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(5))};
        public final ActiveRoute a;
        public final List b;

        public /* synthetic */ DriverPath(int i, ActiveRoute activeRoute, List list) {
            this.a = (i & 1) == 0 ? null : activeRoute;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public DriverPath() {
            this.a = null;
            this.b = EmptyList.a;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse$DriverPath$ActiveRoute;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/net/taxi/dto/response/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ActiveRoute {
            public static final c Companion = new c();
            public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(6)), null};
            public final String a;
            public final List b;
            public final Date c;

            public /* synthetic */ ActiveRoute(int i, String str, List list, Date date) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = EmptyList.a;
                } else {
                    this.b = list;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = date;
                }
            }

            public ActiveRoute() {
                this.a = null;
                this.b = EmptyList.a;
                this.c = null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse$DriverRouteGeometryPolyline;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/net/taxi/dto/response/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class DriverRouteGeometryPolyline {
        public static final i Companion = new i();
        public static final i3y[] c;
        public final List a;
        public final List b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new y6y0(9)), kotlin.a.b(lazyThreadSafetyMode, new y6y0(10))};
        }

        public /* synthetic */ DriverRouteGeometryPolyline(List list, List list2, int i) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DriverRouteGeometryPolyline)) {
                return false;
            }
            DriverRouteGeometryPolyline driverRouteGeometryPolyline = (DriverRouteGeometryPolyline) obj;
            return jl40.l(this.a, driverRouteGeometryPolyline.a) && jl40.l(this.b, driverRouteGeometryPolyline.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.l("DriverRouteGeometryPolyline(longitudes=", this.a, ", latitudes=", this.b, Extension.C_BRAKE);
        }

        public DriverRouteGeometryPolyline(int i) {
            EmptyList emptyList = EmptyList.a;
            this.a = emptyList;
            this.b = emptyList;
        }

        public DriverRouteGeometryPolyline() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse$TrackPoint;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/net/taxi/dto/response/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TrackPoint {
        public static final j Companion = new j();
        public final zzs a;
        public final double b;
        public final Date c;

        public /* synthetic */ TrackPoint(int i, zzs zzsVar, double d, Date date) {
            this.a = (i & 1) == 0 ? zzs.f : zzsVar;
            if ((i & 2) == 0) {
                this.b = 0.0d;
            } else {
                this.b = d;
            }
            if ((i & 4) == 0) {
                this.c = new Date();
            } else {
                this.c = date;
            }
        }

        public TrackPoint() {
            zzs zzsVar = zzs.f;
            Date date = new Date();
            this.a = zzsVar;
            this.b = 0.0d;
            this.c = date;
        }
    }

    public TaxiRouteResponse() {
        this.a = null;
        this.b = null;
        this.c = EmptyList.a;
        this.d = false;
        this.e = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse$DriverInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/net/taxi/dto/response/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DriverInfo {
        public static final b Companion = new b();
        public final Double a;
        public final Double b;
        public final zzs c;
        public final Double d;
        public final Date e;
        public final boolean f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final int k;

        public /* synthetic */ DriverInfo(int i, Double d, Double d2, zzs zzsVar, Double d3, Date date, boolean z, String str, String str2, String str3, String str4, int i2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = d;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = d2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = zzsVar;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = d3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = date;
            }
            if ((i & 32) == 0) {
                this.f = false;
            } else {
                this.f = z;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = str2;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str3;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = str4;
            }
            if ((i & 1024) == 0) {
                this.k = 0;
            } else {
                this.k = i2;
            }
        }

        public DriverInfo() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = false;
            this.g = "";
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = 0;
        }
    }
}
