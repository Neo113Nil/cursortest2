package com.yandex.go.navigator;

import com.yandex.go.navigator.a;
import com.yandex.go.navigator.domain.o;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.Map;
import defpackage.ah00;
import defpackage.d6z;
import defpackage.gh00;
import defpackage.jl40;
import defpackage.lc50;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.s1r;
import defpackage.tls;
import defpackage.uyw;
import defpackage.xk91;
import defpackage.y6i0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final ah00 a;
    public final po21 b;
    public final lc50 c;
    public final o d;
    public final uyw e;
    public float f;
    public float g;

    public a(ah00 ah00Var, po21 po21Var, lc50 lc50Var, o oVar, uyw uywVar) {
        Double speed;
        this.a = ah00Var;
        this.b = po21Var;
        this.c = lc50Var;
        this.d = oVar;
        this.e = uywVar;
        Location a = oVar.a();
        this.f = d((a == null || (speed = a.getSpeed()) == null) ? null : Float.valueOf(xk91.c(speed.doubleValue())));
    }

    public static /* synthetic */ Object c(a aVar, Map.CameraCallback cameraCallback, Continuation continuation, int i) {
        if ((i & 4) != 0) {
            cameraCallback = null;
        }
        return aVar.b(true, true, cameraCallback, continuation);
    }

    public static float d(Float f) {
        if (f != null) {
            return y6i0.c(18.0f - (((f.floatValue() - 20.0f) / 140.0f) * 3.5f), 14.5f, 18.0f);
        }
        return 17.0f;
    }

    public final void a(boolean z, boolean z2, Point point, final Map.CameraCallback cameraCallback) {
        final float azimuth;
        Double heading;
        Point position;
        Location a = this.d.a();
        if (a != null && (position = a.getPosition()) != null) {
            point = position;
        }
        if (point == null) {
            if (cameraCallback != null) {
                cameraCallback.onMoveFinished(false);
                return;
            }
            return;
        }
        CameraPosition cameraPosition = ((gh00) this.a).e.c;
        if (!z) {
            azimuth = cameraPosition.getAzimuth();
        } else if (a == null || (heading = a.getHeading()) == null) {
            android.location.Location M = d6z.M();
            azimuth = M != null ? M.getBearing() : 0.0f;
        } else {
            azimuth = (float) heading.doubleValue();
        }
        float zoom = z2 ? this.f : cameraPosition.getZoom();
        this.e.l(Boolean.FALSE);
        ((gh00) this.a).g.k(new CameraPosition(point, zoom, azimuth, cameraPosition.getTilt()), 500.0f, Animation.Type.SMOOTH, new Map.CameraCallback() { // from class: le2
            @Override // com.yandex.mapkit.map.Map.CameraCallback
            public final void onMoveFinished(boolean z3) {
                a.this.c.b = Float.valueOf(azimuth);
                Map.CameraCallback cameraCallback2 = cameraCallback;
                if (cameraCallback2 != null) {
                    cameraCallback2.onMoveFinished(z3);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, boolean z2, Map.CameraCallback cameraCallback, Continuation continuation) {
        AnimateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1 animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1;
        int i;
        Map.CameraCallback cameraCallback2;
        boolean z3;
        boolean z4;
        a aVar;
        if (continuation instanceof AnimateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1) {
            animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1 = (AnimateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1) continuation;
            int i2 = animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.L$0 = cameraCallback;
                    animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.L$1 = this;
                    animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.L$2 = this;
                    animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.Z$0 = z;
                    animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.Z$1 = z2;
                    animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.Z$2 = z;
                    animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.Z$3 = z2;
                    animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cameraCallback2 = cameraCallback;
                    z3 = z2;
                    z4 = z;
                    aVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z5 = animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.Z$3;
                    boolean z6 = animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.Z$2;
                    a aVar2 = (a) animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.L$2;
                    a aVar3 = (a) animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.L$1;
                    cameraCallback2 = (Map.CameraCallback) animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.L$0;
                    kotlin.b.b(obj);
                    aVar = aVar2;
                    this = aVar3;
                    z3 = z5;
                    z4 = z6;
                }
                mo21 mo21Var = (mo21) obj;
                aVar.getClass();
                this.a(z4, z3, new Point(mo21Var.a, mo21Var.b), cameraCallback2);
                return zy11.a;
            }
        }
        animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1 = new AnimateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1(this, continuation);
        Object obj2 = animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = animateToUserLocationInteractor$animateToCurrentUserLocationWithFallback$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        aVar.getClass();
        this.a(z4, z3, new Point(mo21Var2.a, mo21Var2.b), cameraCallback2);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v17, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Location location, s1r s1rVar, ContinuationImpl continuationImpl) {
        AnimateToUserLocationInteractor$followUserLocation$1 animateToUserLocationInteractor$followUserLocation$1;
        int i;
        android.location.Location M;
        float c;
        Object h;
        android.location.Location location2;
        s1r s1rVar2;
        a aVar;
        Point point;
        Double speed;
        Float f;
        gh00 gh00Var;
        float c2;
        float floatValue;
        Double heading;
        Double heading2;
        if (continuationImpl instanceof AnimateToUserLocationInteractor$followUserLocation$1) {
            animateToUserLocationInteractor$followUserLocation$1 = (AnimateToUserLocationInteractor$followUserLocation$1) continuationImpl;
            int i2 = animateToUserLocationInteractor$followUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                animateToUserLocationInteractor$followUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = animateToUserLocationInteractor$followUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = animateToUserLocationInteractor$followUserLocation$1.label;
                Float f2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    M = d6z.M();
                    c = (location == null || (speed = location.getSpeed()) == null) ? 0.0f : xk91.c(speed.doubleValue());
                    if (location == null || (point = location.getPosition()) == null) {
                        if (M != null) {
                            point = new Point(M.getLatitude(), M.getLongitude());
                        } else {
                            animateToUserLocationInteractor$followUserLocation$1.L$0 = location;
                            animateToUserLocationInteractor$followUserLocation$1.L$1 = s1rVar;
                            animateToUserLocationInteractor$followUserLocation$1.L$2 = M;
                            animateToUserLocationInteractor$followUserLocation$1.L$3 = this;
                            animateToUserLocationInteractor$followUserLocation$1.F$0 = c;
                            animateToUserLocationInteractor$followUserLocation$1.label = 1;
                            h = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).h(animateToUserLocationInteractor$followUserLocation$1);
                            if (h == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            location2 = M;
                            s1rVar2 = s1rVar;
                            aVar = this;
                        }
                    }
                    f = (location != null || (heading2 = location.getHeading()) == null) ? M != null ? new Float(M.getBearing()) : null : new Float((float) heading2.doubleValue());
                    this.f = d(new Float(c));
                    ah00 ah00Var = this.a;
                    this.g = Math.abs(this.f - ((gh00) ah00Var).j()) / 35.0f;
                    gh00Var = (gh00) ah00Var;
                    if (gh00Var.j() > this.f + 0.05f) {
                        c2 = gh00Var.j() - this.g;
                    } else {
                        float j = gh00Var.j();
                        float f3 = this.f;
                        if (j < f3 - 0.05f) {
                            f3 = this.g + gh00Var.j();
                        }
                        c2 = y6i0.c(f3, 14.5f, 18.0f);
                    }
                    lc50 lc50Var = this.c;
                    if (f == null) {
                        lc50Var.getClass();
                    } else {
                        boolean k = jl40.k(f, lc50Var.b);
                        Float f4 = lc50Var.b;
                        if (k) {
                            f2 = f4;
                        } else {
                            if (f4 != null) {
                                floatValue = f4.floatValue();
                            } else {
                                Location a = lc50Var.a.a();
                                if (a != null && (heading = a.getHeading()) != null) {
                                    f2 = Float.valueOf((float) heading.doubleValue());
                                }
                                floatValue = f2 != null ? f2.floatValue() : 0.0f;
                            }
                            float floatValue2 = (((f.floatValue() - floatValue) + 540.0f) % 360.0f) - 180.0f;
                            if (floatValue2 < -180.0f) {
                                floatValue2 += 360.0f;
                            }
                            float min = Math.min(Math.abs(floatValue2), 360.0f - Math.abs(floatValue2)) / 35.0f;
                            Direction direction = floatValue2 >= 0.0f ? Direction.CLOCKWISE : Direction.COUNTER_CLOCKWISE;
                            float floatValue3 = (direction != Direction.CLOCKWISE || Math.abs(floatValue2) <= 0.01f) ? (direction != Direction.COUNTER_CLOCKWISE || Math.abs(floatValue2) <= 0.01f) ? f.floatValue() : floatValue - min : floatValue + min;
                            if (floatValue3 < 0.0f) {
                                floatValue3 += 360.0f;
                            } else if (floatValue3 >= 360.0f) {
                                floatValue3 -= 360.0f;
                            }
                            f2 = Float.valueOf(floatValue3);
                            lc50Var.b = f2;
                        }
                    }
                    gh00Var.H(new CameraPosition(point, c2, f2 != null ? f2.floatValue() : 0.0f, 0.0f));
                    if (s1rVar != null) {
                        s1rVar.invoke(Boolean.TRUE);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f5 = animateToUserLocationInteractor$followUserLocation$1.F$0;
                aVar = (a) animateToUserLocationInteractor$followUserLocation$1.L$3;
                location2 = (android.location.Location) animateToUserLocationInteractor$followUserLocation$1.L$2;
                ?? r2 = (tls) animateToUserLocationInteractor$followUserLocation$1.L$1;
                Location location3 = (Location) animateToUserLocationInteractor$followUserLocation$1.L$0;
                kotlin.b.b(obj);
                c = f5;
                location = location3;
                h = obj;
                s1rVar2 = r2;
                mo21 mo21Var = (mo21) h;
                aVar.getClass();
                point = new Point(mo21Var.a, mo21Var.b);
                s1rVar = s1rVar2;
                M = location2;
                if (location != null) {
                }
                this.f = d(new Float(c));
                ah00 ah00Var2 = this.a;
                this.g = Math.abs(this.f - ((gh00) ah00Var2).j()) / 35.0f;
                gh00Var = (gh00) ah00Var2;
                if (gh00Var.j() > this.f + 0.05f) {
                }
                lc50 lc50Var2 = this.c;
                if (f == null) {
                }
                gh00Var.H(new CameraPosition(point, c2, f2 != null ? f2.floatValue() : 0.0f, 0.0f));
                if (s1rVar != null) {
                }
                return zy11.a;
            }
        }
        animateToUserLocationInteractor$followUserLocation$1 = new AnimateToUserLocationInteractor$followUserLocation$1(this, continuationImpl);
        Object obj2 = animateToUserLocationInteractor$followUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = animateToUserLocationInteractor$followUserLocation$1.label;
        Float f22 = null;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) h;
        aVar.getClass();
        point = new Point(mo21Var2.a, mo21Var2.b);
        s1rVar = s1rVar2;
        M = location2;
        if (location != null) {
        }
        this.f = d(new Float(c));
        ah00 ah00Var22 = this.a;
        this.g = Math.abs(this.f - ((gh00) ah00Var22).j()) / 35.0f;
        gh00Var = (gh00) ah00Var22;
        if (gh00Var.j() > this.f + 0.05f) {
        }
        lc50 lc50Var22 = this.c;
        if (f == null) {
        }
        gh00Var.H(new CameraPosition(point, c2, f22 != null ? f22.floatValue() : 0.0f, 0.0f));
        if (s1rVar != null) {
        }
        return zy11.a;
    }
}
