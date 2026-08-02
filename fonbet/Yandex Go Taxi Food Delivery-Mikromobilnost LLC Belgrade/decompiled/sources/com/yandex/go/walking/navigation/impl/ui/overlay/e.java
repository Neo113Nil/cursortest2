package com.yandex.go.walking.navigation.impl.ui.overlay;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import com.yandex.go.address.models.Address;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.runtime.image.ImageProvider;
import defpackage.a341;
import defpackage.avj0;
import defpackage.b0c0;
import defpackage.bl00;
import defpackage.g241;
import defpackage.g541;
import defpackage.h3y;
import defpackage.j241;
import defpackage.n541;
import defpackage.ney;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pwy0;
import defpackage.qc5;
import defpackage.qje;
import defpackage.qwc;
import defpackage.sjh;
import defpackage.sq00;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v541;
import defpackage.vng;
import defpackage.wls;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;

/* loaded from: classes14.dex */
public final class e extends qc5 {
    public final tt2 A;
    public final zuj0 B;
    public final pwy0 C;
    public final com.yandex.go.pin.api.widget.b D;
    public final a341 E;
    public final h3y F;
    public final h3y G;
    public final h3y H;
    public final h3y I;
    public final g241 J;
    public ImageProvider K;
    public ImageProvider L;
    public List M;
    public Point N;
    public boolean O;
    public boolean P;

    public e(ney neyVar, tt2 tt2Var, zuj0 zuj0Var, pwy0 pwy0Var, com.yandex.go.pin.api.widget.b bVar, a341 a341Var, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, g241 g241Var) {
        super(g541.class, neyVar);
        this.A = tt2Var;
        this.B = zuj0Var;
        this.C = pwy0Var;
        this.D = bVar;
        this.E = a341Var;
        this.F = h3yVar;
        this.G = h3yVar2;
        this.H = h3yVar3;
        this.I = h3yVar4;
        this.J = g241Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Mg(e eVar, Location location, ContinuationImpl continuationImpl) {
        WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1 walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1;
        int i;
        boolean z;
        eVar.getClass();
        if (continuationImpl instanceof WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1) {
            walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1 = (WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1) continuationImpl;
            int i2 = walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Point point = eVar.N;
                    if (point == null) {
                        List list = eVar.M;
                        point = list != null ? (Point) kotlin.collections.a.P(list) : null;
                    }
                    if (point != null) {
                        zzs zzsVar = new zzs(point.getLatitude(), point.getLongitude(), 0, null, null, 28);
                        Point position = location.getPosition();
                        zzs zzsVar2 = new zzs(position.getLatitude(), position.getLongitude(), 0, null, null, 28);
                        eVar.A.getClass();
                        sjh sjhVar = uyj.a;
                        WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$distance$1 walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$distance$1 = new WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$distance$1(zzsVar2, zzsVar, null);
                        walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1.L$0 = null;
                        walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1.L$1 = null;
                        walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1.L$2 = null;
                        walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1.label = 1;
                        obj = tje.k0(sjhVar, walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$distance$1, walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                z = ((Number) obj).floatValue() > 50.0f;
                if (z != eVar.O) {
                    eVar.O = z;
                    ((g541) eVar.Dg()).o4(WaypointType.START_POINT, !eVar.O);
                }
                return zy11Var;
            }
        }
        walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1 = new WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1(eVar, continuationImpl);
        Object obj2 = walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavPlacemarksPresenter$checkIsLocationNearStartPoint$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Number) obj2).floatValue() > 50.0f) {
        }
        if (z != eVar.O) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Ng(e eVar, int i, int i2, int i3, ImageProvider imageProvider, wls wlsVar, ContinuationImpl continuationImpl) {
        WalkNavPlacemarksPresenter$getPinIcon$1 walkNavPlacemarksPresenter$getPinIcon$1;
        int i4;
        zuj0 zuj0Var = eVar.B;
        if (continuationImpl instanceof WalkNavPlacemarksPresenter$getPinIcon$1) {
            walkNavPlacemarksPresenter$getPinIcon$1 = (WalkNavPlacemarksPresenter$getPinIcon$1) continuationImpl;
            int i5 = walkNavPlacemarksPresenter$getPinIcon$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                walkNavPlacemarksPresenter$getPinIcon$1.label = i5 - Integer.MIN_VALUE;
                Object obj = walkNavPlacemarksPresenter$getPinIcon$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = walkNavPlacemarksPresenter$getPinIcon$1.label;
                if (i4 != 0) {
                    kotlin.b.b(obj);
                    if (imageProvider != null) {
                        return imageProvider;
                    }
                    avj0 avj0Var = (avj0) zuj0Var;
                    ContextThemeWrapper contextThemeWrapper = avj0Var.a;
                    ContextThemeWrapper contextThemeWrapper2 = avj0Var.a;
                    Drawable t = vng.t(i, contextThemeWrapper);
                    Drawable mutate = t != null ? t.mutate() : null;
                    int t2 = qje.t(i2, contextThemeWrapper2);
                    int t3 = qje.t(i3, contextThemeWrapper2);
                    if (mutate == null) {
                        return null;
                    }
                    mutate.setTint(t3);
                    Object sq00Var = new sq00(null, new b0c0(mutate, t2), true, null, null, null, null, false, false, null, null, 0.0f, 8185);
                    walkNavPlacemarksPresenter$getPinIcon$1.L$0 = null;
                    walkNavPlacemarksPresenter$getPinIcon$1.L$1 = null;
                    walkNavPlacemarksPresenter$getPinIcon$1.L$2 = null;
                    walkNavPlacemarksPresenter$getPinIcon$1.L$3 = null;
                    walkNavPlacemarksPresenter$getPinIcon$1.I$0 = i;
                    walkNavPlacemarksPresenter$getPinIcon$1.I$1 = i2;
                    walkNavPlacemarksPresenter$getPinIcon$1.I$2 = i3;
                    walkNavPlacemarksPresenter$getPinIcon$1.I$3 = t2;
                    walkNavPlacemarksPresenter$getPinIcon$1.I$4 = t3;
                    walkNavPlacemarksPresenter$getPinIcon$1.label = 1;
                    obj = wlsVar.invoke(sq00Var, walkNavPlacemarksPresenter$getPinIcon$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i4 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((bl00) obj).a;
            }
        }
        walkNavPlacemarksPresenter$getPinIcon$1 = new WalkNavPlacemarksPresenter$getPinIcon$1(eVar, continuationImpl);
        Object obj3 = walkNavPlacemarksPresenter$getPinIcon$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = walkNavPlacemarksPresenter$getPinIcon$1.label;
        if (i4 != 0) {
        }
        return ((bl00) obj3).a;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        ((g541) Dg()).pause();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        Route c;
        tpr b;
        n541 n541Var;
        Address address;
        zzs B;
        Polyline geometry;
        super.Gg();
        boolean z = this.P;
        a341 a341Var = this.E;
        h3y h3yVar = this.G;
        if (z) {
            c = (Route) kotlin.collections.a.R(((v541) h3yVar.get()).a());
        } else {
            c = a341Var.c();
            if (!a341Var.f()) {
                c = null;
            }
            if (c == null) {
                c = (Route) kotlin.collections.a.R(((v541) h3yVar.get()).a());
            }
        }
        this.M = (c == null || (geometry = c.getGeometry()) == null) ? null : geometry.getPoints();
        this.N = (this.P || !a341Var.f() || (n541Var = (n541) ((j241) this.F.get()).b.a.getValue()) == null || (address = (Address) kotlin.collections.a.P(n541Var.a)) == null || (B = address.B()) == null) ? null : new Point(B.a, B.b);
        tje.N(Kg(), null, null, new WalkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$1(this.C.a(), null, this), 3);
        if (this.P) {
            b = Og();
        } else {
            b = a341Var.f() ? a341Var.b() : null;
            if (b == null) {
                b = Og();
            }
        }
        tje.N(Kg(), null, null, new WalkNavPlacemarksPresenter$onResume$$inlined$safeCollectIn$2(b, null, this), 3);
        ((g541) Dg()).resume();
    }

    public final tpr Og() {
        return kotlinx.coroutines.flow.e.t(new m0(new o(new n(((ru.yandex.taxi.preorder.source.userposition.e) ((po21) this.H.get())).n(), new WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$locationFlow$1(this, null)), new WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$locationFlow$2(3, null)), new b((tpr) ((qwc) this.I.get()).l.getValue()), new WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$1(3, null)));
    }
}
