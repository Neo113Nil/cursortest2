package defpackage;

import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto;
import com.yandex.go.taxi.order.models.api.objects.m0;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Animation;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$AnimationType;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$BezierRoute;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$ShimmeringAnimation;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Type;
import java.util.ArrayList;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class oo5 implements mo5 {
    public final pdc a;

    public oo5(pdc pdcVar) {
        this.a = pdcVar;
    }

    public static ArrayList a(zzs zzsVar, zzs zzsVar2, int i, float f, float f2) {
        zzs zzsVar3;
        if (i < 2) {
            return null;
        }
        double d = zzsVar.a;
        double d2 = zzsVar.b;
        double d3 = zzsVar2.a;
        double d4 = zzsVar2.a;
        double d5 = zzsVar2.b;
        if (d == d3 && d2 == d5) {
            zzsVar3 = zzsVar;
        } else {
            double d6 = d4 - d;
            double d7 = d5 - d2;
            new zzs(d6, d7, 0, null, null, 28);
            double sqrt = Math.sqrt((d7 * d7) + (d6 * d6));
            double sqrt2 = (float) Math.sqrt((f2 * f2) + (f * f));
            double d8 = (d6 / sqrt) * sqrt2;
            double d9 = (d7 / sqrt) * sqrt2;
            new zzs(d8, d9, 0, null, null, 28);
            float abs = Math.abs((float) Math.atan(f2 / f));
            if (d2 > d5) {
                abs = -abs;
            }
            double d10 = abs;
            double sin = (((float) Math.sin(d10)) * d9) + (((float) Math.cos(d10)) * d8);
            double cos = (d9 * ((float) Math.cos(d10))) - (d8 * ((float) Math.sin(d10)));
            new zzs(sin, cos, 0, null, null, 28);
            double d11 = sin * sqrt;
            double d12 = cos * sqrt;
            new zzs(d11, d12, 0, null, null, 28);
            zzsVar3 = new zzs(d11 + d, d12 + d2, 0, null, null, 28);
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = i - 1;
        int i3 = i2;
        while (-1 < i3) {
            double d13 = (i2 - i3) / i2;
            double d14 = d2;
            double d15 = 1.0d - d13;
            double d16 = d15 * d15;
            double d17 = 2.0d * d13 * d15;
            double d18 = d13 * d13;
            arrayList.add(new zzs((d18 * d4) + (zzsVar3.a * d17) + (zzsVar.a * d16), (d18 * d5) + (d17 * zzsVar3.b) + (d16 * d14), 0, null, null, 28));
            i3--;
            d2 = d14;
        }
        return arrayList;
    }

    public final q6l0 b(zzs zzsVar, zzs zzsVar2, MapRouteParametersDto mapRouteParametersDto) {
        ArrayList a;
        MapRouteAppearance$Animation mapRouteAppearance$Animation;
        MapRouteAppearance$ShimmeringAnimation mapRouteAppearance$ShimmeringAnimation;
        MapRouteAppearance$AnimationType mapRouteAppearance$AnimationType;
        MapRouteAppearance$AnimationType mapRouteAppearance$AnimationType2;
        if (mapRouteParametersDto != null) {
            m0 m0Var = mapRouteParametersDto.a;
            if (m0Var instanceof MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto) {
                MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto = (MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto) m0Var;
                MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierControlPoint bezierControlPoint = (MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierControlPoint) a.R(mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.f);
                if (bezierControlPoint != null && (a = a(zzsVar, zzsVar2, mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.c, bezierControlPoint.a, bezierControlPoint.b)) != null) {
                    kdc b = ((ufu) this.a).b(mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.a);
                    MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimation bezierAnimation = mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.g;
                    if (bezierAnimation != null) {
                        int i = no5.a[bezierAnimation.a.ordinal()];
                        if (i == 1) {
                            mapRouteAppearance$AnimationType2 = MapRouteAppearance$AnimationType.UNKNOWN;
                        } else {
                            if (i != 2) {
                                w511.b();
                                return null;
                            }
                            mapRouteAppearance$AnimationType2 = MapRouteAppearance$AnimationType.EASY_BOTH;
                        }
                        mapRouteAppearance$Animation = new MapRouteAppearance$Animation(mapRouteAppearance$AnimationType2, (long) bezierAnimation.b);
                    } else {
                        mapRouteAppearance$Animation = null;
                    }
                    MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation bezierShimmeringAnimation = mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.h;
                    if (bezierShimmeringAnimation != null) {
                        int i2 = no5.a[bezierShimmeringAnimation.a.ordinal()];
                        if (i2 == 1) {
                            mapRouteAppearance$AnimationType = MapRouteAppearance$AnimationType.UNKNOWN;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            mapRouteAppearance$AnimationType = MapRouteAppearance$AnimationType.EASY_BOTH;
                        }
                        MapRouteAppearance$AnimationType mapRouteAppearance$AnimationType3 = mapRouteAppearance$AnimationType;
                        MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation.ShimmeringShowPolicy shimmeringShowPolicy = bezierShimmeringAnimation.f;
                        Integer valueOf = shimmeringShowPolicy != null ? Integer.valueOf(shimmeringShowPolicy.a) : null;
                        mapRouteAppearance$ShimmeringAnimation = new MapRouteAppearance$ShimmeringAnimation((long) bezierShimmeringAnimation.c, (long) bezierShimmeringAnimation.e, mapRouteAppearance$AnimationType3, bezierShimmeringAnimation.b, bezierShimmeringAnimation.g, bezierShimmeringAnimation.d, valueOf != null ? new MapRouteAppearance$ShimmeringAnimation.ShowPolicy(valueOf.intValue()) : null);
                    } else {
                        mapRouteAppearance$ShimmeringAnimation = null;
                    }
                    return new q6l0(a, b, Float.valueOf(mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.b), Float.valueOf(mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.e), mapRouteAppearance$Animation, Float.valueOf(mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.d), mapRouteAppearance$ShimmeringAnimation, false, MapRouteAppearance$Type.BEZIER);
                }
            }
        }
        return null;
    }

    public final q6l0 c(zzs zzsVar, zzs zzsVar2, MapRouteAppearance$BezierRoute mapRouteAppearance$BezierRoute) {
        ArrayList a;
        Float[] fArr = (Float[]) a.R(mapRouteAppearance$BezierRoute.a);
        if (fArr == null || (a = a(zzsVar, zzsVar2, mapRouteAppearance$BezierRoute.d, fArr[0].floatValue(), fArr[1].floatValue())) == null) {
            return null;
        }
        return new q6l0(a, ((ufu) this.a).b(mapRouteAppearance$BezierRoute.b), mapRouteAppearance$BezierRoute.c, mapRouteAppearance$BezierRoute.e, mapRouteAppearance$BezierRoute.f, mapRouteAppearance$BezierRoute.g, mapRouteAppearance$BezierRoute.h, false, MapRouteAppearance$Type.BEZIER);
    }
}
