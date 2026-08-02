package com.yandex.go.taxi.order.models.api.route;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.t5z;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/route/MapRouteAppearance$BezierRoute", "Lcom/yandex/go/taxi/order/models/api/route/g;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/route/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MapRouteAppearance$BezierRoute extends g {
    public static final b Companion = new b();
    public static final i3y[] i = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(20)), null, null, null, null, null, null, null};
    public final List a;
    public final String b;
    public final Float c;
    public final int d;
    public final Float e;
    public final MapRouteAppearance$Animation f;
    public final Float g;
    public final MapRouteAppearance$ShimmeringAnimation h;

    public MapRouteAppearance$BezierRoute(int i2, List list, String str, Float f, int i3, Float f2, MapRouteAppearance$Animation mapRouteAppearance$Animation, Float f3, MapRouteAppearance$ShimmeringAnimation mapRouteAppearance$ShimmeringAnimation) {
        this.a = (i2 & 1) == 0 ? EmptyList.a : list;
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
        if ((i2 & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = f2;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = mapRouteAppearance$Animation;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = f3;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = mapRouteAppearance$ShimmeringAnimation;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapRouteAppearance$BezierRoute)) {
            return false;
        }
        MapRouteAppearance$BezierRoute mapRouteAppearance$BezierRoute = (MapRouteAppearance$BezierRoute) obj;
        return jl40.l(this.a, mapRouteAppearance$BezierRoute.a) && jl40.l(this.b, mapRouteAppearance$BezierRoute.b) && jl40.l(this.c, mapRouteAppearance$BezierRoute.c) && this.d == mapRouteAppearance$BezierRoute.d && jl40.l(this.e, mapRouteAppearance$BezierRoute.e) && jl40.l(this.f, mapRouteAppearance$BezierRoute.f) && jl40.l(this.g, mapRouteAppearance$BezierRoute.g) && jl40.l(this.h, mapRouteAppearance$BezierRoute.h);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Float f = this.c;
        int b2 = oyr.b(this.d, (b + (f == null ? 0 : f.hashCode())) * 31, 31);
        Float f2 = this.e;
        int hashCode = (b2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        MapRouteAppearance$Animation mapRouteAppearance$Animation = this.f;
        int hashCode2 = (hashCode + (mapRouteAppearance$Animation == null ? 0 : mapRouteAppearance$Animation.hashCode())) * 31;
        Float f3 = this.g;
        int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        MapRouteAppearance$ShimmeringAnimation mapRouteAppearance$ShimmeringAnimation = this.h;
        return hashCode3 + (mapRouteAppearance$ShimmeringAnimation != null ? mapRouteAppearance$ShimmeringAnimation.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = xvz.s("BezierRoute(controlPoints=", this.a, ", color=", this.b, ", width=");
        s.append(this.c);
        s.append(", precision=");
        s.append(this.d);
        s.append(", arcApproximation=");
        s.append(this.e);
        s.append(", animation=");
        s.append(this.f);
        s.append(", turnRadius=");
        s.append(this.g);
        s.append(", shimmeringAnimation=");
        s.append(this.h);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    public MapRouteAppearance$BezierRoute(List list, String str, Float f, int i2, Float f2, MapRouteAppearance$Animation mapRouteAppearance$Animation, Float f3) {
        this.a = list;
        this.b = str;
        this.c = f;
        this.d = i2;
        this.e = f2;
        this.f = mapRouteAppearance$Animation;
        this.g = f3;
        this.h = null;
    }

    public MapRouteAppearance$BezierRoute() {
        this(EmptyList.a, "", null, 0, null, null, null);
    }
}
