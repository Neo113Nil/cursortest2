package com.yandex.go.logistics.cargo_flow.route_selector;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Animation;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$AnimationType;
import com.yandex.go.zone.repository.o;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.a4l0;
import defpackage.ah00;
import defpackage.b2l0;
import defpackage.b64;
import defpackage.bf60;
import defpackage.c0h0;
import defpackage.cv00;
import defpackage.czo0;
import defpackage.d6w;
import defpackage.et00;
import defpackage.f1h0;
import defpackage.f4c0;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.jst;
import defpackage.leh;
import defpackage.lr00;
import defpackage.lse;
import defpackage.ny61;
import defpackage.pu8;
import defpackage.q6l0;
import defpackage.r8;
import defpackage.ru8;
import defpackage.sbv;
import defpackage.scc;
import defpackage.sgu0;
import defpackage.tt2;
import defpackage.u0c0;
import defpackage.u8b1;
import defpackage.ugu0;
import defpackage.w4e0;
import defpackage.xm00;
import defpackage.y6i0;
import defpackage.yi;
import defpackage.yj2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.preorder.source.points.StopPointsProvider$StopPointPlace;

/* loaded from: classes6.dex */
public final class b extends r8 {
    public final sgu0 A;
    public final lr00 B;
    public final tt2 C;
    public final et00 D;
    public final com.yandex.go.route.interactor.c E;
    public final c F;
    public f4c0 G;
    public f4c0 H;
    public f4c0 I;
    public f4c0 J;
    public w4e0 K;
    public final u0c0 L;
    public ImageProvider M;
    public ImageProvider N;
    public xm00 O;
    public final HashMap P;
    public final HashMap Q;
    public int R;
    public final yj2 S;
    public final ValueAnimator T;
    public PolylinePosition U;
    public final hbp0 V;
    public final Drawable W;
    public final Context c;
    public final leh w;
    public final b2l0 x;
    public final o y;
    public final cv00 z;

    public b(ah00 ah00Var, Context context, leh lehVar, b2l0 b2l0Var, o oVar, cv00 cv00Var, sgu0 sgu0Var, lr00 lr00Var, tt2 tt2Var, et00 et00Var, com.yandex.go.route.interactor.c cVar, c cVar2) {
        super(5, ah00Var);
        this.c = context;
        this.w = lehVar;
        this.x = b2l0Var;
        this.y = oVar;
        this.z = cv00Var;
        this.A = sgu0Var;
        this.B = lr00Var;
        this.C = tt2Var;
        this.D = et00Var;
        this.E = cVar;
        this.F = cVar2;
        this.L = u0c0.d;
        this.P = new HashMap();
        this.Q = new HashMap();
        this.S = new yj2();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
        ofInt.setDuration(OperationProgressView.ROTATION_ANIMATION_DURATION);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new yi(11, this));
        this.T = ofInt;
        this.V = new hbp0(new czo0(14), "cargo-flow-route-overlay", new ru8(lse.a, 0));
        this.W = context.getDrawable(c0h0.ic_order_map_destination_pin);
    }

    public static final void Hg(b bVar, a4l0 a4l0Var, List list) {
        Polyline a;
        Drawable drawable;
        int i;
        f4c0 f4c0Var;
        List list2;
        HashMap hashMap;
        HashMap hashMap2;
        sbv sbvVar;
        f4c0 f4c0Var2;
        xm00 xm00Var = bVar.O;
        hbp0 hbp0Var = bVar.V;
        if (xm00Var == null || (a = a4l0Var.a()) == null) {
            return;
        }
        Drawable drawable2 = bVar.W;
        List<Point> points = a.getPoints();
        List list3 = a4l0Var.c;
        q6l0 q6l0Var = a4l0Var.d;
        if (list3 == null) {
            list3 = EmptyList.a;
        }
        if (points.isEmpty()) {
            jst.e.getClass();
        } else {
            Point point = points.get(0);
            sbv sbvVar2 = list != null ? (sbv) kotlin.collections.a.R(list) : null;
            Drawable drawable3 = bVar.c.getDrawable(f1h0.route_start_point);
            if (sbvVar2 != null) {
                if (drawable2 != null) {
                    bVar.M = ImageProvider.fromBitmap(u8b1.g(drawable2));
                }
            } else if (drawable3 != null) {
                bVar.M = ImageProvider.fromBitmap(u8b1.g(drawable3));
            }
            f4c0 f4c0Var3 = bVar.G;
            if (f4c0Var3 == null) {
                bVar.G = bVar.Ig().r(point);
            } else {
                f4c0Var3.o(point);
            }
            f4c0 f4c0Var4 = bVar.H;
            if (f4c0Var4 != null) {
                bVar.Ig().o(f4c0Var4);
            }
            f4c0 r = bVar.Ig().r(point);
            bVar.H = r;
            r.o(point);
            ImageProvider imageProvider = bVar.M;
            if (imageProvider != null && (f4c0Var2 = bVar.G) != null) {
                f4c0Var2.y(imageProvider);
            }
            hbp0.e(hbp0Var, null, null, new CargoFlowRouteOverlay$setSourcePoint$5(bVar, sbvVar2, null), 3);
            f4c0 f4c0Var5 = bVar.G;
            if (f4c0Var5 != null) {
                f4c0Var5.k(1.0f);
            }
            List J = list != null ? kotlin.collections.a.J(list, 1) : null;
            HashMap hashMap3 = bVar.Q;
            HashMap hashMap4 = bVar.P;
            Iterator it = hashMap4.keySet().iterator();
            while (it.hasNext()) {
                f4c0 f4c0Var6 = (f4c0) hashMap4.get((Point) it.next());
                if (f4c0Var6 != null) {
                    bVar.Ig().o(f4c0Var6);
                }
            }
            Iterator it2 = hashMap3.keySet().iterator();
            while (it2.hasNext()) {
                f4c0 f4c0Var7 = (f4c0) hashMap3.get((Point) it2.next());
                if (f4c0Var7 != null) {
                    bVar.Ig().o(f4c0Var7);
                }
            }
            hashMap4.clear();
            hashMap3.clear();
            d6w n = y6i0.n(0, scc.f(list3));
            int i2 = n.a;
            int i3 = n.b;
            if (i2 <= i3) {
                while (true) {
                    Point point2 = (Point) list3.get(i2);
                    f4c0 r2 = bVar.Ig().r(point2);
                    f4c0 r3 = bVar.Ig().r(point2);
                    hashMap4.put(point2, r2);
                    hashMap3.put(point2, r3);
                    r2.o(point2);
                    r3.o(point2);
                    List list4 = J;
                    if (list4 == null || list4.isEmpty()) {
                        drawable = drawable2;
                        list2 = list3;
                        hashMap = hashMap3;
                        hashMap2 = hashMap4;
                        r2.x(((ugu0) bVar.A).b(i2 + 1, bVar.L.c.a, true, StopPointsProvider$StopPointPlace.MAP));
                    } else {
                        if (drawable2 != null) {
                            r2.y(ImageProvider.fromBitmap(u8b1.g(drawable2)));
                        }
                        drawable = drawable2;
                        list2 = list3;
                        hashMap = hashMap3;
                        hashMap2 = hashMap4;
                    }
                    if (J != null && (sbvVar = (sbv) kotlin.collections.a.S(i2, J)) != null) {
                        hbp0.e(hbp0Var, null, null, new CargoFlowRouteOverlay$setMiddlePoints$4$1(bVar, r3, sbvVar, null), 3);
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2++;
                    drawable2 = drawable;
                    hashMap4 = hashMap2;
                    list3 = list2;
                    hashMap3 = hashMap;
                }
                i = 1;
            } else {
                drawable = drawable2;
                i = 1;
            }
            Point point3 = (Point) b64.c(i, points);
            sbv sbvVar3 = list != null ? (sbv) kotlin.collections.a.b0(list) : null;
            if (drawable != null) {
                bVar.N = ImageProvider.fromBitmap(u8b1.g(drawable));
            }
            f4c0 f4c0Var8 = bVar.I;
            if (f4c0Var8 == null) {
                bVar.I = bVar.Ig().r(point3);
            } else {
                f4c0Var8.o(point3);
            }
            f4c0 f4c0Var9 = bVar.J;
            if (f4c0Var9 != null) {
                bVar.Ig().o(f4c0Var9);
            }
            f4c0 r4 = bVar.Ig().r(point3);
            bVar.J = r4;
            r4.o(point3);
            ImageProvider imageProvider2 = bVar.N;
            if (imageProvider2 != null && (f4c0Var = bVar.I) != null) {
                f4c0Var.y(imageProvider2);
            }
            hbp0.e(hbp0Var, null, null, new CargoFlowRouteOverlay$setDestinationPoint$3(bVar, sbvVar3, null), 3);
            if (a.getPoints().size() < 2) {
                jst.e.getClass();
            } else {
                w4e0 w4e0Var = bVar.K;
                if (w4e0Var == null) {
                    bVar.K = bVar.Ig().s(a);
                } else {
                    w4e0Var.o(a);
                }
                w4e0 w4e0Var2 = bVar.K;
                if (w4e0Var2 != null) {
                    w4e0Var2.k(0.0f);
                }
            }
            et00 et00Var = bVar.D;
            if (q6l0Var != null) {
                et00Var.d();
            } else {
                et00Var.e();
            }
            int size = points.size() - 1;
            w4e0 w4e0Var3 = bVar.K;
            if (w4e0Var3 != null) {
                if (q6l0Var != null) {
                    bVar.x.b(w4e0Var3, q6l0Var.b, q6l0Var.c, q6l0Var.d, q6l0Var.f, q6l0Var.h);
                } else {
                    leh lehVar = bVar.w;
                    o oVar = bVar.y;
                    lehVar.getClass();
                    boolean a2 = leh.a(oVar);
                    b2l0 b2l0Var = bVar.x;
                    if (a2) {
                        b2l0Var.a(w4e0Var3);
                        w4e0Var3.x(a4l0Var.a);
                    } else {
                        ((bf60) b2l0Var.a.getValue()).b(w4e0Var3, size);
                    }
                }
            }
            ValueAnimator valueAnimator = bVar.T;
            w4e0 w4e0Var4 = bVar.K;
            if (w4e0Var4 != null) {
                int size2 = ((Polyline) w4e0Var4.h).getPoints().size();
                PolylinePosition polylinePosition = new PolylinePosition(size2 - 2, 1.0d);
                bVar.U = polylinePosition;
                w4e0Var4.r(Collections.singletonList(new Subpolyline(new PolylinePosition(0, 0.0d), polylinePosition)));
                valueAnimator.setIntValues(0, size2 - 1);
                bVar.R = 0;
            }
            MapRouteAppearance$Animation mapRouteAppearance$Animation = q6l0Var != null ? q6l0Var.e : null;
            if (mapRouteAppearance$Animation != null) {
                valueAnimator.setDuration(mapRouteAppearance$Animation.b);
                valueAnimator.setInterpolator(mapRouteAppearance$Animation.a == MapRouteAppearance$AnimationType.EASY_BOTH ? new AccelerateDecelerateInterpolator() : new LinearInterpolator());
            } else {
                valueAnimator.setDuration(OperationProgressView.ROTATION_ANIMATION_DURATION);
                valueAnimator.setInterpolator(new LinearInterpolator());
            }
            valueAnimator.start();
            bVar.S.a(valueAnimator);
        }
        BoundingBox a3 = k.a(new pu8(a, 0));
        if (a3 != null) {
            ((gh00) ((ah00) bVar.b)).A(a3, null);
        }
    }

    public final xm00 Ig() {
        xm00 xm00Var = this.O;
        if (xm00Var != null) {
            return xm00Var;
        }
        ny61.g("Required value was null.");
        return null;
    }
}
