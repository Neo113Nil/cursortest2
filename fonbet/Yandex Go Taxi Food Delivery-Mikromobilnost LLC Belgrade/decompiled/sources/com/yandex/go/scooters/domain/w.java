package com.yandex.go.scooters.domain;

import com.yandex.go.coroutines.CoroutinesCompatKt$ignore$$inlined$transform$1;
import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.dvw;
import defpackage.fi6;
import defpackage.gh00;
import defpackage.j18;
import defpackage.ny61;
import defpackage.obn0;
import defpackage.q2o0;
import defpackage.r2o0;
import defpackage.rol0;
import defpackage.s2o0;
import defpackage.t2o0;
import defpackage.w511;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class w {
    public final ah00 a;
    public final ru.yandex.taxi.scooters.domain.c b;
    public final obn0 c;
    public final t2o0 d;

    public w(ah00 ah00Var, ru.yandex.taxi.scooters.domain.c cVar, obn0 obn0Var, t2o0 t2o0Var) {
        this.a = ah00Var;
        this.b = cVar;
        this.c = obn0Var;
        this.d = t2o0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if ((r10 == null ? r4 : c(r10, r0)) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r8.b.a(r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        ScootersOfferCardFocusInteractor$handleFocus$1 scootersOfferCardFocusInteractor$handleFocus$1;
        int i;
        if (continuationImpl instanceof ScootersOfferCardFocusInteractor$handleFocus$1) {
            scootersOfferCardFocusInteractor$handleFocus$1 = (ScootersOfferCardFocusInteractor$handleFocus$1) continuationImpl;
            int i2 = scootersOfferCardFocusInteractor$handleFocus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOfferCardFocusInteractor$handleFocus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOfferCardFocusInteractor$handleFocus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOfferCardFocusInteractor$handleFocus$1.label;
                Object obj3 = zy11.a;
                t2o0 t2o0Var = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = q2o0.a[((ScootersOfferCardFocusInteractor$FocusType) t2o0Var.a.getValue()).ordinal()];
                    if (i3 == 1) {
                        scootersOfferCardFocusInteractor$handleFocus$1.Z$0 = z;
                        scootersOfferCardFocusInteractor$handleFocus$1.label = 1;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        scootersOfferCardFocusInteractor$handleFocus$1.Z$0 = z;
                        scootersOfferCardFocusInteractor$handleFocus$1.label = 2;
                        List list = (List) this.c.b.getValue();
                    }
                    return obj2;
                }
                if (i == 1) {
                    z = scootersOfferCardFocusInteractor$handleFocus$1.Z$0;
                    kotlin.b.b(obj);
                    if (z) {
                        t2o0Var.a(ScootersOfferCardFocusInteractor$FocusType.FOCUS_ON_ROUTE);
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = scootersOfferCardFocusInteractor$handleFocus$1.Z$0;
                    kotlin.b.b(obj);
                    if (z) {
                        t2o0Var.a(ScootersOfferCardFocusInteractor$FocusType.FOCUS_ON_USER);
                        return obj3;
                    }
                }
                return obj3;
            }
        }
        scootersOfferCardFocusInteractor$handleFocus$1 = new ScootersOfferCardFocusInteractor$handleFocus$1(this, continuationImpl);
        Object obj4 = scootersOfferCardFocusInteractor$handleFocus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOfferCardFocusInteractor$handleFocus$1.label;
        Object obj32 = zy11.a;
        t2o0 t2o0Var2 = this.d;
        if (i != 0) {
        }
        return obj32;
    }

    public final kotlinx.coroutines.flow.k b() {
        return new kotlinx.coroutines.flow.k(kotlinx.coroutines.flow.e.K(this.d.a, new rol0(new CoroutinesCompatKt$ignore$$inlined$transform$1(new rol0(new ScootersOfferCardFocusInteractor$listenAndHandleFirstRoute$1(this, null)), null))), new ScootersOfferCardFocusInteractor$listenToFocusType$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        ScootersOfferCardFocusInteractor$positionOnPoints$1 scootersOfferCardFocusInteractor$positionOnPoints$1;
        int i;
        if (continuationImpl instanceof ScootersOfferCardFocusInteractor$positionOnPoints$1) {
            scootersOfferCardFocusInteractor$positionOnPoints$1 = (ScootersOfferCardFocusInteractor$positionOnPoints$1) continuationImpl;
            int i2 = scootersOfferCardFocusInteractor$positionOnPoints$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOfferCardFocusInteractor$positionOnPoints$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOfferCardFocusInteractor$positionOnPoints$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOfferCardFocusInteractor$positionOnPoints$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersOfferCardFocusInteractor$positionOnPoints$1.L$0 = list;
                    scootersOfferCardFocusInteractor$positionOnPoints$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(scootersOfferCardFocusInteractor$positionOnPoints$1));
                    j18Var.u();
                    int size = list.size();
                    ah00 ah00Var = this.a;
                    if (size == 2) {
                        ((gh00) ah00Var).g.j((Point) kotlin.collections.a.Z(list), 200.0f, new r2o0(j18Var));
                    } else {
                        fi6 fi6Var = new fi6();
                        fi6Var.e(list);
                        ((gh00) ah00Var).A(fi6Var.g(), new s2o0(j18Var));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersOfferCardFocusInteractor$positionOnPoints$1 = new ScootersOfferCardFocusInteractor$positionOnPoints$1(this, continuationImpl);
        Object obj2 = scootersOfferCardFocusInteractor$positionOnPoints$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOfferCardFocusInteractor$positionOnPoints$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
