package com.yandex.go.places.impl.domain.interactors.common;

import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$MapButtonType;
import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.cwa1;
import defpackage.e2t;
import defpackage.f2t;
import defpackage.fi6;
import defpackage.fnb0;
import defpackage.g2t;
import defpackage.gh00;
import defpackage.hac0;
import defpackage.hfc0;
import defpackage.jio;
import defpackage.k0b0;
import defpackage.mo21;
import defpackage.mth;
import defpackage.ny61;
import defpackage.p1j0;
import defpackage.po21;
import defpackage.q3v;
import defpackage.sls;
import defpackage.tbc0;
import defpackage.uo21;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class a implements q3v {
    public final ah00 a;
    public final po21 b;
    public final jio c;
    public final b d;
    public final k0b0 e;
    public final tbc0 f;
    public final e2t g;
    public final hfc0 h;

    public a(ah00 ah00Var, po21 po21Var, jio jioVar, b bVar, k0b0 k0b0Var, tbc0 tbc0Var, e2t e2tVar, atd0 atd0Var, uo21 uo21Var, hfc0 hfc0Var) {
        this.a = ah00Var;
        this.b = po21Var;
        this.c = jioVar;
        this.d = bVar;
        this.e = k0b0Var;
        this.f = tbc0Var;
        this.g = e2tVar;
        this.h = hfc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlacesMapFocusInteractor$focusCurrentPositionAnimated$1 placesMapFocusInteractor$focusCurrentPositionAnimated$1;
        int i;
        Point d;
        Point point;
        if (continuationImpl instanceof PlacesMapFocusInteractor$focusCurrentPositionAnimated$1) {
            placesMapFocusInteractor$focusCurrentPositionAnimated$1 = (PlacesMapFocusInteractor$focusCurrentPositionAnimated$1) continuationImpl;
            int i2 = placesMapFocusInteractor$focusCurrentPositionAnimated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapFocusInteractor$focusCurrentPositionAnimated$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapFocusInteractor$focusCurrentPositionAnimated$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapFocusInteractor$focusCurrentPositionAnimated$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    placesMapFocusInteractor$focusCurrentPositionAnimated$1.label = 1;
                    obj = e(placesMapFocusInteractor$focusCurrentPositionAnimated$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d = (Point) placesMapFocusInteractor$focusCurrentPositionAnimated$1.L$1;
                        kotlin.b.b(obj);
                        point = this.h.a;
                        if (point != null) {
                            fi6 fi6Var = new fi6();
                            fi6Var.c(d);
                            fi6Var.c(point);
                            ((gh00) this.a).A(fi6Var.g(), null);
                        } else {
                            ((gh00) this.a).g.k(new CameraPosition(d, this.f.a, 0.0f, 0.0f), 400.0f, Animation.Type.LINEAR, null);
                        }
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                d = cwa1.d((zzs) obj);
                point = this.h.a;
                if (point != null) {
                }
                return zy11.a;
            }
        }
        placesMapFocusInteractor$focusCurrentPositionAnimated$1 = new PlacesMapFocusInteractor$focusCurrentPositionAnimated$1(this, continuationImpl);
        Object obj3 = placesMapFocusInteractor$focusCurrentPositionAnimated$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapFocusInteractor$focusCurrentPositionAnimated$1.label;
        if (i != 0) {
        }
        d = cwa1.d((zzs) obj3);
        point = this.h.a;
        if (point != null) {
        }
        return zy11.a;
    }

    public final void b(Point point, float f) {
        this.f.a = f;
        ((gh00) this.a).H(new CameraPosition(point, f, 0.0f, 0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(float f, ContinuationImpl continuationImpl) {
        PlacesMapFocusInteractor$focusSelectedPosition$1 placesMapFocusInteractor$focusSelectedPosition$1;
        int i;
        if (continuationImpl instanceof PlacesMapFocusInteractor$focusSelectedPosition$1) {
            placesMapFocusInteractor$focusSelectedPosition$1 = (PlacesMapFocusInteractor$focusSelectedPosition$1) continuationImpl;
            int i2 = placesMapFocusInteractor$focusSelectedPosition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapFocusInteractor$focusSelectedPosition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapFocusInteractor$focusSelectedPosition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapFocusInteractor$focusSelectedPosition$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = ((f2t) this.g).h;
                    placesMapFocusInteractor$focusSelectedPosition$1.F$0 = f;
                    placesMapFocusInteractor$focusSelectedPosition$1.label = 1;
                    obj = e.y(mthVar, placesMapFocusInteractor$focusSelectedPosition$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = placesMapFocusInteractor$focusSelectedPosition$1.F$0;
                    kotlin.b.b(obj);
                }
                b(cwa1.d(((g2t) obj).b.a), f);
                return zy11.a;
            }
        }
        placesMapFocusInteractor$focusSelectedPosition$1 = new PlacesMapFocusInteractor$focusSelectedPosition$1(this, continuationImpl);
        Object obj2 = placesMapFocusInteractor$focusSelectedPosition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapFocusInteractor$focusSelectedPosition$1.label;
        if (i != 0) {
        }
        b(cwa1.d(((g2t) obj2).b.a), f);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sls slsVar, sls slsVar2, ContinuationImpl continuationImpl) {
        PlacesMapFocusInteractor$focusUserGeo$1 placesMapFocusInteractor$focusUserGeo$1;
        int i;
        if (continuationImpl instanceof PlacesMapFocusInteractor$focusUserGeo$1) {
            placesMapFocusInteractor$focusUserGeo$1 = (PlacesMapFocusInteractor$focusUserGeo$1) continuationImpl;
            int i2 = placesMapFocusInteractor$focusUserGeo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapFocusInteractor$focusUserGeo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapFocusInteractor$focusUserGeo$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapFocusInteractor$focusUserGeo$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean b = this.e.b();
                    if (!b) {
                        slsVar.invoke();
                        this.d.m.d(new fnb0(13), zy11Var, new hac0(0, slsVar2), p1j0.a);
                        return zy11Var;
                    }
                    placesMapFocusInteractor$focusUserGeo$1.L$0 = null;
                    placesMapFocusInteractor$focusUserGeo$1.L$1 = null;
                    placesMapFocusInteractor$focusUserGeo$1.Z$0 = b;
                    placesMapFocusInteractor$focusUserGeo$1.label = 1;
                    if (a(placesMapFocusInteractor$focusUserGeo$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.c.d(DiscoveryAnalytics$MapButtonType.MyGeo);
                return zy11Var;
            }
        }
        placesMapFocusInteractor$focusUserGeo$1 = new PlacesMapFocusInteractor$focusUserGeo$1(this, continuationImpl);
        Object obj3 = placesMapFocusInteractor$focusUserGeo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapFocusInteractor$focusUserGeo$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        this.c.d(DiscoveryAnalytics$MapButtonType.MyGeo);
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PlacesMapFocusInteractor$getCurrentGetPoint$1 placesMapFocusInteractor$getCurrentGetPoint$1;
        int i;
        if (continuationImpl instanceof PlacesMapFocusInteractor$getCurrentGetPoint$1) {
            placesMapFocusInteractor$getCurrentGetPoint$1 = (PlacesMapFocusInteractor$getCurrentGetPoint$1) continuationImpl;
            int i2 = placesMapFocusInteractor$getCurrentGetPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapFocusInteractor$getCurrentGetPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapFocusInteractor$getCurrentGetPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapFocusInteractor$getCurrentGetPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    placesMapFocusInteractor$getCurrentGetPoint$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(placesMapFocusInteractor$getCurrentGetPoint$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((mo21) obj).a();
            }
        }
        placesMapFocusInteractor$getCurrentGetPoint$1 = new PlacesMapFocusInteractor$getCurrentGetPoint$1(this, continuationImpl);
        Object obj2 = placesMapFocusInteractor$getCurrentGetPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapFocusInteractor$getCurrentGetPoint$1.label;
        if (i != 0) {
        }
        return ((mo21) obj2).a();
    }

    public final void f() {
        ah00 ah00Var = this.a;
        ((gh00) ah00Var).K(((gh00) ah00Var).j() + 0.5f);
        this.c.d(DiscoveryAnalytics$MapButtonType.ZoomIn);
    }

    public final void g() {
        ah00 ah00Var = this.a;
        ((gh00) ah00Var).K(((gh00) ah00Var).j() - 0.5f);
        this.c.d(DiscoveryAnalytics$MapButtonType.ZoomOut);
    }
}
