package com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation;

import androidx.compose.runtime.f;
import com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState;
import defpackage.aik0;
import defpackage.bik0;
import defpackage.cik0;
import defpackage.dik0;
import defpackage.egk0;
import defpackage.eik0;
import defpackage.fgk0;
import defpackage.fik0;
import defpackage.hgk0;
import defpackage.ja30;
import defpackage.jl40;
import defpackage.lik0;
import defpackage.mik0;
import defpackage.ngd0;
import defpackage.nik0;
import defpackage.ny61;
import defpackage.ogk0;
import defpackage.oik0;
import defpackage.oz40;
import defpackage.qgk0;
import defpackage.qhk0;
import defpackage.rgk0;
import defpackage.rhk0;
import defpackage.s9k0;
import defpackage.sgk0;
import defpackage.shk0;
import defpackage.tgk0;
import defpackage.thk0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ugk0;
import defpackage.vgk0;
import defpackage.w511;
import defpackage.xgk0;
import defpackage.ygk0;
import defpackage.zuc0;
import defpackage.zy11;
import defpackage.zy2;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class RideCardDriverSectionOrchestrator {
    public final thk0 a = new thk0();
    public final qhk0 b = new qhk0(new RideCardDriverSectionOrchestrator$animationQueue$1(3, this, RideCardDriverSectionOrchestrator.class, "handleUiStateChange", "handleUiStateChange(Lcom/yandex/go/taxi/order/details/v2/state/elements/driver/RideCardDriverItemUiState;Lcom/yandex/go/taxi/order/details/v2/state/elements/driver/RideCardDriverItemUiState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
    public final oz40 c;
    public final oz40 d;
    public final oz40 e;
    public final oz40 f;
    public final oz40 g;
    public final oz40 h;

    public RideCardDriverSectionOrchestrator() {
        s9k0 s9k0Var = s9k0.a;
        this.c = f.j(new egk0("", s9k0Var));
        this.d = f.j(new qgk0(0L, 1.0f, false, 0L));
        this.e = f.j(new fgk0(400L, 100L, false));
        this.f = f.j(ogk0.b);
        this.g = f.j(hgk0.c);
        this.h = f.j(new oik0(new nik0(null, 0L, false), new mik0(null, 0L, false), new lik0(null, 0L, s9k0Var)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0086, code lost:
    
        if (r11 == r3) goto L172;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(RideCardDriverSectionOrchestrator rideCardDriverSectionOrchestrator, ygk0 ygk0Var, ygk0 ygk0Var2, Continuation continuation) {
        RideCardDriverSectionOrchestrator$handleUiStateChange$1 rideCardDriverSectionOrchestrator$handleUiStateChange$1;
        int i;
        ygk0 ygk0Var3;
        ygk0 ygk0Var4;
        Object valueOf;
        boolean z;
        boolean z2;
        fik0 eik0Var;
        Object i2;
        RideCardDriverSectionUpdate$Animated$AnimationType rideCardDriverSectionUpdate$Animated$AnimationType;
        aik0 aik0Var;
        rideCardDriverSectionOrchestrator.getClass();
        if (continuation instanceof RideCardDriverSectionOrchestrator$handleUiStateChange$1) {
            rideCardDriverSectionOrchestrator$handleUiStateChange$1 = (RideCardDriverSectionOrchestrator$handleUiStateChange$1) continuation;
            int i3 = rideCardDriverSectionOrchestrator$handleUiStateChange$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rideCardDriverSectionOrchestrator$handleUiStateChange$1.label = i3 - Integer.MIN_VALUE;
                Object obj = rideCardDriverSectionOrchestrator$handleUiStateChange$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverSectionOrchestrator$handleUiStateChange$1.label;
                if (i != 0) {
                    b.b(obj);
                    ygk0Var3 = ygk0Var;
                    rideCardDriverSectionOrchestrator$handleUiStateChange$1.L$0 = ygk0Var3;
                    ygk0Var4 = ygk0Var2;
                    rideCardDriverSectionOrchestrator$handleUiStateChange$1.L$1 = ygk0Var4;
                    rideCardDriverSectionOrchestrator$handleUiStateChange$1.label = 1;
                    ja30 ja30Var = (ja30) rideCardDriverSectionOrchestrator$handleUiStateChange$1.get_context().get(ngd0.C);
                    valueOf = Boolean.valueOf((ja30Var != null ? ja30Var.getScaleFactor() : 1.0f) > 0.0f);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    ygk0Var4 = (ygk0) rideCardDriverSectionOrchestrator$handleUiStateChange$1.L$1;
                    ygk0 ygk0Var5 = (ygk0) rideCardDriverSectionOrchestrator$handleUiStateChange$1.L$0;
                    b.b(obj);
                    valueOf = obj;
                    ygk0Var3 = ygk0Var5;
                }
                boolean booleanValue = ((Boolean) valueOf).booleanValue();
                rideCardDriverSectionOrchestrator.a.getClass();
                ugk0 ugk0Var = ygk0Var4.k;
                zuc0 zuc0Var = ygk0Var4.h;
                CharSequence charSequence = ygk0Var4.d;
                xgk0 xgk0Var = ygk0Var4.c;
                ugk0 ugk0Var2 = ygk0Var3.k;
                z = ugk0Var instanceof tgk0;
                if (!z && (ugk0Var2 instanceof tgk0) && booleanValue) {
                    tgk0 tgk0Var = (tgk0) ugk0Var2;
                    RideCardDriverState rideCardDriverState = tgk0Var.a;
                    tgk0 tgk0Var2 = (tgk0) ugk0Var;
                    RideCardDriverState rideCardDriverState2 = tgk0Var2.a;
                    String str = tgk0Var.b;
                    String str2 = tgk0Var2.b;
                    if (rideCardDriverState == rideCardDriverState2 && jl40.l(str, str2)) {
                        rideCardDriverSectionUpdate$Animated$AnimationType = null;
                    } else {
                        RideCardDriverState rideCardDriverState3 = RideCardDriverState.SEARCHING;
                        if (rideCardDriverState == rideCardDriverState3) {
                            rideCardDriverSectionUpdate$Animated$AnimationType = RideCardDriverSectionUpdate$Animated$AnimationType.FROM_SEARCHING;
                        } else if (rideCardDriverState2 == rideCardDriverState3) {
                            rideCardDriverSectionUpdate$Animated$AnimationType = RideCardDriverSectionUpdate$Animated$AnimationType.TO_SEARCHING;
                        } else {
                            RideCardDriverState rideCardDriverState4 = RideCardDriverState.WAITING_RESPONSE;
                            rideCardDriverSectionUpdate$Animated$AnimationType = (rideCardDriverState == rideCardDriverState4 && rideCardDriverState2 == RideCardDriverState.REJECTED) ? RideCardDriverSectionUpdate$Animated$AnimationType.WAITING_RESPONSE_TO_REJECTED : (rideCardDriverState == rideCardDriverState4 && rideCardDriverState2 == RideCardDriverState.ASSIGNED_DRIVER) ? RideCardDriverSectionUpdate$Animated$AnimationType.WAITING_RESPONSE_TO_ASSIGNED_DRIVER : RideCardDriverSectionUpdate$Animated$AnimationType.THROUGH_COLLAPSE;
                        }
                    }
                    if (rideCardDriverSectionUpdate$Animated$AnimationType == null) {
                        RideCardDriverState rideCardDriverState5 = RideCardDriverState.SEARCHING;
                        boolean z3 = rideCardDriverState != rideCardDriverState5;
                        RideCardDriverState rideCardDriverState6 = RideCardDriverState.REJECTED;
                        boolean z4 = rideCardDriverState == rideCardDriverState6 || rideCardDriverState == rideCardDriverState5;
                        boolean z5 = rideCardDriverState2 != rideCardDriverState5;
                        boolean z6 = rideCardDriverState2 == rideCardDriverState6 || rideCardDriverState2 == rideCardDriverState5;
                        eik0Var = new dik0(new cik0(z5, z6, z4 != z6, z3 != z5, (jl40.l(ygk0Var3.c, xgk0Var) && jl40.l(ygk0Var3.d, charSequence) && ygk0Var3.h.equals(zuc0Var)) ? false : true));
                    } else {
                        int i4 = shk0.a[rideCardDriverState2.ordinal()];
                        if (i4 == 1) {
                            aik0Var = new aik0(true);
                        } else if (i4 == 2) {
                            aik0Var = new aik0(true);
                        } else {
                            if (i4 != 3 && i4 != 4) {
                                w511.b();
                                return null;
                            }
                            aik0Var = new aik0(false);
                        }
                        eik0Var = new bik0(rideCardDriverSectionUpdate$Animated$AnimationType, aik0Var);
                    }
                } else {
                    if (z) {
                        if (jl40.l(ugk0Var, sgk0.a)) {
                            z2 = false;
                            eik0Var = new eik0(new zy2(true, false));
                        } else {
                            z2 = false;
                            if (!jl40.l(ugk0Var, rgk0.a)) {
                                w511.b();
                                return null;
                            }
                            eik0Var = new eik0(new zy2(false, true));
                        }
                        if (!(eik0Var instanceof eik0)) {
                            zy2 zy2Var = ((eik0) eik0Var).a;
                            rideCardDriverSectionOrchestrator.f(new qgk0(0L, zy2Var.b ? 0.5f : 1.0f, zy2Var.a, 0L));
                            rideCardDriverSectionOrchestrator.c.setValue(new egk0(ygk0Var4.e, ygk0Var4.i));
                            boolean z7 = charSequence != null ? true : z2;
                            boolean equals = zuc0Var.equals(zuc0.f);
                            boolean z8 = !equals;
                            CharSequence charSequence2 = (!(xgk0Var instanceof vgk0) || ((vgk0) xgk0Var).a == null) ? z2 : true ? ((vgk0) xgk0Var).a : null;
                            if (!equals || z7) {
                                z2 = true;
                            }
                            rideCardDriverSectionOrchestrator.h.setValue(new oik0(new nik0(charSequence2, 0L, z2), new mik0(charSequence, 0L, z8), new lik0(zuc0Var, 0L, ygk0Var4.j)));
                            rideCardDriverSectionOrchestrator.f.setValue(ygk0Var4.f);
                            rideCardDriverSectionOrchestrator.g.setValue(ygk0Var4.g);
                            return zy11.a;
                        }
                        if (eik0Var instanceof dik0) {
                            rideCardDriverSectionOrchestrator$handleUiStateChange$1.L$0 = null;
                            rideCardDriverSectionOrchestrator$handleUiStateChange$1.L$1 = null;
                            rideCardDriverSectionOrchestrator$handleUiStateChange$1.L$2 = null;
                            rideCardDriverSectionOrchestrator$handleUiStateChange$1.Z$0 = booleanValue;
                            rideCardDriverSectionOrchestrator$handleUiStateChange$1.label = 2;
                            Object e = rideCardDriverSectionOrchestrator.e(((dik0) eik0Var).a, ygk0Var3, ygk0Var4, rideCardDriverSectionOrchestrator$handleUiStateChange$1);
                            if (e != obj2) {
                                return e;
                            }
                        } else {
                            if (!(eik0Var instanceof bik0)) {
                                w511.b();
                                return null;
                            }
                            bik0 bik0Var = (bik0) eik0Var;
                            rideCardDriverSectionOrchestrator$handleUiStateChange$1.L$0 = null;
                            rideCardDriverSectionOrchestrator$handleUiStateChange$1.L$1 = null;
                            rideCardDriverSectionOrchestrator$handleUiStateChange$1.L$2 = null;
                            rideCardDriverSectionOrchestrator$handleUiStateChange$1.Z$0 = booleanValue;
                            rideCardDriverSectionOrchestrator$handleUiStateChange$1.label = 3;
                            int i5 = rhk0.a[bik0Var.a.ordinal()];
                            aik0 aik0Var2 = bik0Var.b;
                            if (i5 == 1) {
                                i2 = rideCardDriverSectionOrchestrator.i(aik0Var2, ygk0Var3, ygk0Var4, rideCardDriverSectionOrchestrator$handleUiStateChange$1);
                            } else if (i5 == 2) {
                                i2 = rideCardDriverSectionOrchestrator.k(ygk0Var3, ygk0Var4, rideCardDriverSectionOrchestrator$handleUiStateChange$1);
                            } else if (i5 == 3) {
                                i2 = rideCardDriverSectionOrchestrator.j(aik0Var2, ygk0Var3, ygk0Var4, rideCardDriverSectionOrchestrator$handleUiStateChange$1);
                            } else if (i5 == 4) {
                                i2 = rideCardDriverSectionOrchestrator.m(ygk0Var3, ygk0Var4, rideCardDriverSectionOrchestrator$handleUiStateChange$1);
                            } else {
                                if (i5 != 5) {
                                    w511.b();
                                    return null;
                                }
                                i2 = rideCardDriverSectionOrchestrator.l(ygk0Var3, ygk0Var4, rideCardDriverSectionOrchestrator$handleUiStateChange$1);
                            }
                            if (i2 != obj2) {
                                return i2;
                            }
                        }
                        return obj2;
                    }
                    RideCardDriverState rideCardDriverState7 = ((tgk0) ugk0Var).a;
                    eik0Var = new eik0(new zy2(rideCardDriverState7 != RideCardDriverState.SEARCHING, rideCardDriverState7 == RideCardDriverState.REJECTED));
                }
                z2 = false;
                if (!(eik0Var instanceof eik0)) {
                }
            }
        }
        rideCardDriverSectionOrchestrator$handleUiStateChange$1 = new RideCardDriverSectionOrchestrator$handleUiStateChange$1(rideCardDriverSectionOrchestrator, continuation);
        Object obj3 = rideCardDriverSectionOrchestrator$handleUiStateChange$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverSectionOrchestrator$handleUiStateChange$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) valueOf).booleanValue();
        rideCardDriverSectionOrchestrator.a.getClass();
        ugk0 ugk0Var3 = ygk0Var4.k;
        zuc0 zuc0Var2 = ygk0Var4.h;
        CharSequence charSequence3 = ygk0Var4.d;
        xgk0 xgk0Var2 = ygk0Var4.c;
        ugk0 ugk0Var22 = ygk0Var3.k;
        z = ugk0Var3 instanceof tgk0;
        if (!z) {
        }
        if (z) {
        }
    }

    public static Object b(long j, ContinuationImpl continuationImpl) {
        ja30 ja30Var = (ja30) continuationImpl.get_context().get(ngd0.C);
        long scaleFactor = (long) (j * (ja30Var != null ? ja30Var.getScaleFactor() : 1.0f));
        return scaleFactor <= 0 ? zy11.a : kotlinx.coroutines.a.i(scaleFactor, continuationImpl);
    }

    public static boolean d(ygk0 ygk0Var, ygk0 ygk0Var2) {
        return (jl40.l(ygk0Var.c, ygk0Var2.c) && jl40.l(ygk0Var.d, ygk0Var2.d) && ygk0Var.h.equals(ygk0Var2.h)) ? false : true;
    }

    public final qgk0 c() {
        return (qgk0) this.d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cik0 cik0Var, ygk0 ygk0Var, ygk0 ygk0Var2, ContinuationImpl continuationImpl) {
        RideCardDriverSectionOrchestrator$plainContentChange$1 rideCardDriverSectionOrchestrator$plainContentChange$1;
        int i;
        long j;
        float f;
        long j2;
        boolean z;
        long j3;
        if (continuationImpl instanceof RideCardDriverSectionOrchestrator$plainContentChange$1) {
            rideCardDriverSectionOrchestrator$plainContentChange$1 = (RideCardDriverSectionOrchestrator$plainContentChange$1) continuationImpl;
            int i2 = rideCardDriverSectionOrchestrator$plainContentChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverSectionOrchestrator$plainContentChange$1.label = i2 - Integer.MIN_VALUE;
                RideCardDriverSectionOrchestrator$plainContentChange$1 rideCardDriverSectionOrchestrator$plainContentChange$12 = rideCardDriverSectionOrchestrator$plainContentChange$1;
                Object obj = rideCardDriverSectionOrchestrator$plainContentChange$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverSectionOrchestrator$plainContentChange$12.label;
                if (i != 0) {
                    b.b(obj);
                    long j4 = cik0Var.e ? 300L : 0L;
                    boolean z2 = cik0Var.a;
                    long j5 = cik0Var.d ? 300L : 0L;
                    long j6 = cik0Var.c ? 300L : 0L;
                    float f2 = cik0Var.b ? 0.5f : 1.0f;
                    qgk0 qgk0Var = new qgk0(j5, f2, z2, j6);
                    long j7 = j6;
                    f(qgk0Var);
                    oz40 oz40Var = this.e;
                    oz40Var.setValue(fgk0.a((fgk0) oz40Var.getValue(), false, 0L, 6));
                    rideCardDriverSectionOrchestrator$plainContentChange$12.L$0 = null;
                    rideCardDriverSectionOrchestrator$plainContentChange$12.L$1 = null;
                    rideCardDriverSectionOrchestrator$plainContentChange$12.L$2 = null;
                    rideCardDriverSectionOrchestrator$plainContentChange$12.J$0 = j4;
                    rideCardDriverSectionOrchestrator$plainContentChange$12.Z$0 = z2;
                    j = j5;
                    rideCardDriverSectionOrchestrator$plainContentChange$12.J$1 = j;
                    rideCardDriverSectionOrchestrator$plainContentChange$12.J$2 = j7;
                    rideCardDriverSectionOrchestrator$plainContentChange$12.F$0 = f2;
                    rideCardDriverSectionOrchestrator$plainContentChange$12.label = 1;
                    long j8 = j4;
                    if (h(j8, ygk0Var, ygk0Var2, rideCardDriverSectionOrchestrator$plainContentChange$12) != obj2) {
                        f = f2;
                        j2 = j7;
                        z = z2;
                        j3 = j8;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                f = rideCardDriverSectionOrchestrator$plainContentChange$12.F$0;
                j2 = rideCardDriverSectionOrchestrator$plainContentChange$12.J$2;
                j = rideCardDriverSectionOrchestrator$plainContentChange$12.J$1;
                z = rideCardDriverSectionOrchestrator$plainContentChange$12.Z$0;
                j3 = rideCardDriverSectionOrchestrator$plainContentChange$12.J$0;
                b.b(obj);
                long max = Math.max(j3, Math.max(j, j2));
                rideCardDriverSectionOrchestrator$plainContentChange$12.L$0 = null;
                rideCardDriverSectionOrchestrator$plainContentChange$12.L$1 = null;
                rideCardDriverSectionOrchestrator$plainContentChange$12.L$2 = null;
                rideCardDriverSectionOrchestrator$plainContentChange$12.J$0 = j3;
                rideCardDriverSectionOrchestrator$plainContentChange$12.Z$0 = z;
                rideCardDriverSectionOrchestrator$plainContentChange$12.J$1 = j;
                rideCardDriverSectionOrchestrator$plainContentChange$12.J$2 = j2;
                rideCardDriverSectionOrchestrator$plainContentChange$12.F$0 = f;
                rideCardDriverSectionOrchestrator$plainContentChange$12.label = 2;
                Object b = b(max, rideCardDriverSectionOrchestrator$plainContentChange$12);
                return b != obj2 ? obj2 : b;
            }
        }
        rideCardDriverSectionOrchestrator$plainContentChange$1 = new RideCardDriverSectionOrchestrator$plainContentChange$1(this, continuationImpl);
        RideCardDriverSectionOrchestrator$plainContentChange$1 rideCardDriverSectionOrchestrator$plainContentChange$122 = rideCardDriverSectionOrchestrator$plainContentChange$1;
        Object obj3 = rideCardDriverSectionOrchestrator$plainContentChange$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverSectionOrchestrator$plainContentChange$122.label;
        if (i != 0) {
        }
        long max2 = Math.max(j3, Math.max(j, j2));
        rideCardDriverSectionOrchestrator$plainContentChange$122.L$0 = null;
        rideCardDriverSectionOrchestrator$plainContentChange$122.L$1 = null;
        rideCardDriverSectionOrchestrator$plainContentChange$122.L$2 = null;
        rideCardDriverSectionOrchestrator$plainContentChange$122.J$0 = j3;
        rideCardDriverSectionOrchestrator$plainContentChange$122.Z$0 = z;
        rideCardDriverSectionOrchestrator$plainContentChange$122.J$1 = j;
        rideCardDriverSectionOrchestrator$plainContentChange$122.J$2 = j2;
        rideCardDriverSectionOrchestrator$plainContentChange$122.F$0 = f;
        rideCardDriverSectionOrchestrator$plainContentChange$122.label = 2;
        Object b2 = b(max2, rideCardDriverSectionOrchestrator$plainContentChange$122);
        if (b2 != obj22) {
        }
    }

    public final void f(qgk0 qgk0Var) {
        this.d.setValue(qgk0Var);
    }

    public final void g(tse tseVar) {
        qhk0 qhk0Var = this.b;
        qhk0Var.getClass();
        tje.N(tseVar, null, null, new RideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1(qhk0Var, null), 3);
    }

    public final Object h(long j, ygk0 ygk0Var, ygk0 ygk0Var2, ContinuationImpl continuationImpl) {
        boolean z;
        boolean z2;
        xgk0 xgk0Var = ygk0Var2.c;
        zuc0 zuc0Var = ygk0Var2.h;
        CharSequence charSequence = ygk0Var2.d;
        boolean z3 = (xgk0Var instanceof vgk0) && ((vgk0) xgk0Var).a != null;
        long j2 = z3 ? j : 0L;
        this.c.setValue(new egk0(ygk0Var2.e, ygk0Var2.i));
        boolean z4 = charSequence != null;
        CharSequence charSequence2 = ygk0Var.d;
        zuc0 zuc0Var2 = ygk0Var.h;
        boolean z5 = charSequence2 != null;
        zuc0 zuc0Var3 = zuc0.f;
        boolean equals = zuc0Var.equals(zuc0Var3);
        boolean z6 = !equals;
        boolean equals2 = zuc0Var2.equals(zuc0Var3);
        boolean z7 = !equals2;
        boolean l = jl40.l(charSequence, ygk0Var.d);
        boolean equals3 = zuc0Var.equals(zuc0Var2);
        boolean z8 = z6 != z7;
        long j3 = (z5 || !equals2) != (z4 || !equals) ? j2 : 0L;
        long j4 = (!l || z8) ? j2 : 0L;
        long j5 = !equals3 ? j2 : 0L;
        boolean z9 = z4;
        CharSequence charSequence3 = z3 ? ((vgk0) ygk0Var2.c).a : null;
        if (!equals || z9) {
            z = equals2;
            z2 = true;
        } else {
            z = equals2;
            z2 = false;
        }
        this.h.setValue(new oik0(new nik0(charSequence3, j3, z2), new mik0(charSequence, j4, (z && equals) ? false : true), new lik0(zuc0Var, j5, ygk0Var2.j)));
        this.f.setValue(ygk0Var2.f);
        this.g.setValue(ygk0Var2.g);
        return b(j2, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(aik0 aik0Var, ygk0 ygk0Var, ygk0 ygk0Var2, ContinuationImpl continuationImpl) {
        RideCardDriverSectionOrchestrator$updateFromSearching$1 rideCardDriverSectionOrchestrator$updateFromSearching$1;
        int i;
        long j;
        long j2;
        aik0 aik0Var2;
        if (continuationImpl instanceof RideCardDriverSectionOrchestrator$updateFromSearching$1) {
            rideCardDriverSectionOrchestrator$updateFromSearching$1 = (RideCardDriverSectionOrchestrator$updateFromSearching$1) continuationImpl;
            int i2 = rideCardDriverSectionOrchestrator$updateFromSearching$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverSectionOrchestrator$updateFromSearching$1.label = i2 - Integer.MIN_VALUE;
                RideCardDriverSectionOrchestrator$updateFromSearching$1 rideCardDriverSectionOrchestrator$updateFromSearching$12 = rideCardDriverSectionOrchestrator$updateFromSearching$1;
                Object obj = rideCardDriverSectionOrchestrator$updateFromSearching$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverSectionOrchestrator$updateFromSearching$12.label;
                if (i != 0) {
                    b.b(obj);
                    rideCardDriverSectionOrchestrator$updateFromSearching$12.L$0 = aik0Var;
                    rideCardDriverSectionOrchestrator$updateFromSearching$12.L$1 = null;
                    rideCardDriverSectionOrchestrator$updateFromSearching$12.L$2 = null;
                    j = 0;
                    rideCardDriverSectionOrchestrator$updateFromSearching$12.J$0 = 0L;
                    j2 = 300;
                    rideCardDriverSectionOrchestrator$updateFromSearching$12.J$1 = 300L;
                    rideCardDriverSectionOrchestrator$updateFromSearching$12.label = 1;
                    if (h(0L, ygk0Var, ygk0Var2, rideCardDriverSectionOrchestrator$updateFromSearching$12) != obj2) {
                        aik0Var2 = aik0Var;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                long j3 = rideCardDriverSectionOrchestrator$updateFromSearching$12.J$1;
                long j4 = rideCardDriverSectionOrchestrator$updateFromSearching$12.J$0;
                aik0Var2 = (aik0) rideCardDriverSectionOrchestrator$updateFromSearching$12.L$0;
                b.b(obj);
                j2 = j3;
                j = j4;
                float f = !aik0Var2.a ? 0.5f : 1.0f;
                f(new qgk0(j2, f, true, j2));
                rideCardDriverSectionOrchestrator$updateFromSearching$12.L$0 = null;
                rideCardDriverSectionOrchestrator$updateFromSearching$12.L$1 = null;
                rideCardDriverSectionOrchestrator$updateFromSearching$12.L$2 = null;
                rideCardDriverSectionOrchestrator$updateFromSearching$12.J$0 = j;
                rideCardDriverSectionOrchestrator$updateFromSearching$12.J$1 = j2;
                rideCardDriverSectionOrchestrator$updateFromSearching$12.F$0 = f;
                rideCardDriverSectionOrchestrator$updateFromSearching$12.label = 2;
                Object b = b(j2, rideCardDriverSectionOrchestrator$updateFromSearching$12);
                return b != obj2 ? obj2 : b;
            }
        }
        rideCardDriverSectionOrchestrator$updateFromSearching$1 = new RideCardDriverSectionOrchestrator$updateFromSearching$1(this, continuationImpl);
        RideCardDriverSectionOrchestrator$updateFromSearching$1 rideCardDriverSectionOrchestrator$updateFromSearching$122 = rideCardDriverSectionOrchestrator$updateFromSearching$1;
        Object obj3 = rideCardDriverSectionOrchestrator$updateFromSearching$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverSectionOrchestrator$updateFromSearching$122.label;
        if (i != 0) {
        }
        float f2 = !aik0Var2.a ? 0.5f : 1.0f;
        f(new qgk0(j2, f2, true, j2));
        rideCardDriverSectionOrchestrator$updateFromSearching$122.L$0 = null;
        rideCardDriverSectionOrchestrator$updateFromSearching$122.L$1 = null;
        rideCardDriverSectionOrchestrator$updateFromSearching$122.L$2 = null;
        rideCardDriverSectionOrchestrator$updateFromSearching$122.J$0 = j;
        rideCardDriverSectionOrchestrator$updateFromSearching$122.J$1 = j2;
        rideCardDriverSectionOrchestrator$updateFromSearching$122.F$0 = f2;
        rideCardDriverSectionOrchestrator$updateFromSearching$122.label = 2;
        Object b2 = b(j2, rideCardDriverSectionOrchestrator$updateFromSearching$122);
        if (b2 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(aik0 aik0Var, ygk0 ygk0Var, ygk0 ygk0Var2, ContinuationImpl continuationImpl) {
        RideCardDriverSectionOrchestrator$updateThroughCollapse$1 rideCardDriverSectionOrchestrator$updateThroughCollapse$1;
        RideCardDriverSectionOrchestrator$updateThroughCollapse$1 rideCardDriverSectionOrchestrator$updateThroughCollapse$12;
        Object obj;
        int i;
        ygk0 ygk0Var3;
        ygk0 ygk0Var4;
        aik0 aik0Var2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        aik0 aik0Var3;
        long j7;
        if (continuationImpl instanceof RideCardDriverSectionOrchestrator$updateThroughCollapse$1) {
            rideCardDriverSectionOrchestrator$updateThroughCollapse$1 = (RideCardDriverSectionOrchestrator$updateThroughCollapse$1) continuationImpl;
            int i2 = rideCardDriverSectionOrchestrator$updateThroughCollapse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverSectionOrchestrator$updateThroughCollapse$1.label = i2 - Integer.MIN_VALUE;
                rideCardDriverSectionOrchestrator$updateThroughCollapse$12 = rideCardDriverSectionOrchestrator$updateThroughCollapse$1;
                Object obj2 = rideCardDriverSectionOrchestrator$updateThroughCollapse$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverSectionOrchestrator$updateThroughCollapse$12.label;
                if (i != 0) {
                    b.b(obj2);
                    c().getClass();
                    f(new qgk0(300L, 0.0f, false, 300L));
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$0 = aik0Var;
                    ygk0Var3 = ygk0Var;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$1 = ygk0Var3;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$2 = ygk0Var2;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$0 = 300L;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$1 = 0L;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$2 = 300L;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.label = 1;
                    if (b(300L, rideCardDriverSectionOrchestrator$updateThroughCollapse$12) != obj) {
                        ygk0Var4 = ygk0Var2;
                        aik0Var2 = aik0Var;
                        j = 300;
                        j2 = 0;
                        j3 = 300;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj2);
                        return obj2;
                    }
                    long j8 = rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$2;
                    j7 = rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$1;
                    j6 = rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$0;
                    aik0Var3 = (aik0) rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$0;
                    b.b(obj2);
                    j5 = j8;
                    float f = !aik0Var3.a ? 0.5f : 1.0f;
                    c().getClass();
                    long j9 = j5;
                    f(new qgk0(j5, f, true, j5));
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$0 = null;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$1 = null;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$2 = null;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$0 = j6;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$1 = j7;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$2 = j9;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.F$0 = f;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.label = 3;
                    Object b = b(j9, rideCardDriverSectionOrchestrator$updateThroughCollapse$12);
                    return b != obj ? obj : b;
                }
                j3 = rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$2;
                j2 = rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$1;
                j = rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$0;
                ygk0 ygk0Var5 = (ygk0) rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$2;
                ygk0 ygk0Var6 = (ygk0) rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$1;
                aik0Var2 = (aik0) rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$0;
                b.b(obj2);
                ygk0Var4 = ygk0Var5;
                ygk0Var3 = ygk0Var6;
                rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$0 = aik0Var2;
                rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$1 = null;
                rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$2 = null;
                rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$0 = j;
                rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$1 = j2;
                rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$2 = j3;
                rideCardDriverSectionOrchestrator$updateThroughCollapse$12.label = 2;
                j4 = j2;
                if (h(j4, ygk0Var3, ygk0Var4, rideCardDriverSectionOrchestrator$updateThroughCollapse$12) != obj) {
                    j5 = j3;
                    j6 = j;
                    aik0Var3 = aik0Var2;
                    j7 = j4;
                    float f2 = !aik0Var3.a ? 0.5f : 1.0f;
                    c().getClass();
                    long j92 = j5;
                    f(new qgk0(j5, f2, true, j5));
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$0 = null;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$1 = null;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$2 = null;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$0 = j6;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$1 = j7;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$2 = j92;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.F$0 = f2;
                    rideCardDriverSectionOrchestrator$updateThroughCollapse$12.label = 3;
                    Object b2 = b(j92, rideCardDriverSectionOrchestrator$updateThroughCollapse$12);
                    if (b2 != obj) {
                    }
                }
            }
        }
        rideCardDriverSectionOrchestrator$updateThroughCollapse$1 = new RideCardDriverSectionOrchestrator$updateThroughCollapse$1(this, continuationImpl);
        rideCardDriverSectionOrchestrator$updateThroughCollapse$12 = rideCardDriverSectionOrchestrator$updateThroughCollapse$1;
        Object obj22 = rideCardDriverSectionOrchestrator$updateThroughCollapse$12.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverSectionOrchestrator$updateThroughCollapse$12.label;
        if (i != 0) {
        }
        rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$0 = aik0Var2;
        rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$1 = null;
        rideCardDriverSectionOrchestrator$updateThroughCollapse$12.L$2 = null;
        rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$0 = j;
        rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$1 = j2;
        rideCardDriverSectionOrchestrator$updateThroughCollapse$12.J$2 = j3;
        rideCardDriverSectionOrchestrator$updateThroughCollapse$12.label = 2;
        j4 = j2;
        if (h(j4, ygk0Var3, ygk0Var4, rideCardDriverSectionOrchestrator$updateThroughCollapse$12) != obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ygk0 ygk0Var, ygk0 ygk0Var2, ContinuationImpl continuationImpl) {
        RideCardDriverSectionOrchestrator$updateToSearching$1 rideCardDriverSectionOrchestrator$updateToSearching$1;
        int i;
        ygk0 ygk0Var3;
        ygk0 ygk0Var4;
        long j;
        if (continuationImpl instanceof RideCardDriverSectionOrchestrator$updateToSearching$1) {
            rideCardDriverSectionOrchestrator$updateToSearching$1 = (RideCardDriverSectionOrchestrator$updateToSearching$1) continuationImpl;
            int i2 = rideCardDriverSectionOrchestrator$updateToSearching$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverSectionOrchestrator$updateToSearching$1.label = i2 - Integer.MIN_VALUE;
                RideCardDriverSectionOrchestrator$updateToSearching$1 rideCardDriverSectionOrchestrator$updateToSearching$12 = rideCardDriverSectionOrchestrator$updateToSearching$1;
                Object obj = rideCardDriverSectionOrchestrator$updateToSearching$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverSectionOrchestrator$updateToSearching$12.label;
                if (i != 0) {
                    b.b(obj);
                    f(qgk0.a(c(), 12));
                    rideCardDriverSectionOrchestrator$updateToSearching$12.L$0 = ygk0Var;
                    rideCardDriverSectionOrchestrator$updateToSearching$12.L$1 = ygk0Var2;
                    rideCardDriverSectionOrchestrator$updateToSearching$12.J$0 = 300L;
                    rideCardDriverSectionOrchestrator$updateToSearching$12.label = 1;
                    if (b(300L, rideCardDriverSectionOrchestrator$updateToSearching$12) != obj2) {
                        ygk0Var3 = ygk0Var;
                        ygk0Var4 = ygk0Var2;
                        j = 300;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                j = rideCardDriverSectionOrchestrator$updateToSearching$12.J$0;
                ygk0 ygk0Var5 = (ygk0) rideCardDriverSectionOrchestrator$updateToSearching$12.L$1;
                ygk0Var3 = (ygk0) rideCardDriverSectionOrchestrator$updateToSearching$12.L$0;
                b.b(obj);
                ygk0Var4 = ygk0Var5;
                rideCardDriverSectionOrchestrator$updateToSearching$12.L$0 = null;
                rideCardDriverSectionOrchestrator$updateToSearching$12.L$1 = null;
                rideCardDriverSectionOrchestrator$updateToSearching$12.J$0 = j;
                rideCardDriverSectionOrchestrator$updateToSearching$12.label = 2;
                Object h = h(0L, ygk0Var3, ygk0Var4, rideCardDriverSectionOrchestrator$updateToSearching$12);
                return h != obj2 ? obj2 : h;
            }
        }
        rideCardDriverSectionOrchestrator$updateToSearching$1 = new RideCardDriverSectionOrchestrator$updateToSearching$1(this, continuationImpl);
        RideCardDriverSectionOrchestrator$updateToSearching$1 rideCardDriverSectionOrchestrator$updateToSearching$122 = rideCardDriverSectionOrchestrator$updateToSearching$1;
        Object obj3 = rideCardDriverSectionOrchestrator$updateToSearching$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverSectionOrchestrator$updateToSearching$122.label;
        if (i != 0) {
        }
        rideCardDriverSectionOrchestrator$updateToSearching$122.L$0 = null;
        rideCardDriverSectionOrchestrator$updateToSearching$122.L$1 = null;
        rideCardDriverSectionOrchestrator$updateToSearching$122.J$0 = j;
        rideCardDriverSectionOrchestrator$updateToSearching$122.label = 2;
        Object h2 = h(0L, ygk0Var3, ygk0Var4, rideCardDriverSectionOrchestrator$updateToSearching$122);
        if (h2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        if (b(100, r5) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (b(r3, r5) != r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (h(r1, r18, r19, r5) == r6) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(ygk0 ygk0Var, ygk0 ygk0Var2, ContinuationImpl continuationImpl) {
        RideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1 rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1;
        int i;
        long j;
        long j2;
        Object obj;
        if (continuationImpl instanceof RideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1) {
            rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1 = (RideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1) continuationImpl;
            int i2 = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1.label = i2 - Integer.MIN_VALUE;
                RideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1 rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12 = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1;
                Object obj2 = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.label;
                oz40 oz40Var = this.e;
                if (i != 0) {
                    b.b(obj2);
                    long j3 = d(ygk0Var2, ygk0Var) ? 250L : 0L;
                    rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.L$0 = null;
                    rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.L$1 = null;
                    rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$0 = j3;
                    j = 400;
                    rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$1 = 400L;
                    rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.label = 1;
                    j2 = j3;
                    obj = null;
                } else if (i == 1) {
                    long j4 = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$1;
                    long j5 = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$0;
                    b.b(obj2);
                    j2 = j5;
                    j = j4;
                    obj = null;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj2);
                            return obj2;
                        }
                        j = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$1;
                        long j6 = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$0;
                        b.b(obj2);
                        j2 = j6;
                        obj = null;
                        oz40Var.setValue(fgk0.a((fgk0) oz40Var.getValue(), false, 0L, 2));
                        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.L$0 = obj;
                        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.L$1 = obj;
                        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$0 = j2;
                        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$1 = j;
                        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$2 = 100L;
                        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.label = 4;
                        Object b = b(100L, rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12);
                        return b == obj3 ? obj3 : b;
                    }
                    long j7 = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$1;
                    long j8 = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$0;
                    b.b(obj2);
                    j2 = j8;
                    j = j7;
                    obj = null;
                    rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.L$0 = obj;
                    rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.L$1 = obj;
                    rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$0 = j2;
                    rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$1 = j;
                    rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.label = 3;
                }
                oz40Var.setValue(fgk0.a((fgk0) oz40Var.getValue(), true, j, 4));
                long max = Math.max(j2, j);
                rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.L$0 = obj;
                rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.L$1 = obj;
                rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$0 = j2;
                rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.J$1 = j;
                rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$12.label = 2;
            }
        }
        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1 = new RideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1(this, continuationImpl);
        RideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1 rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$122 = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$1;
        Object obj22 = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$122.label;
        oz40 oz40Var2 = this.e;
        if (i != 0) {
        }
        oz40Var2.setValue(fgk0.a((fgk0) oz40Var2.getValue(), true, j, 4));
        long max2 = Math.max(j2, j);
        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$122.L$0 = obj;
        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$122.L$1 = obj;
        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$122.J$0 = j2;
        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$122.J$1 = j;
        rideCardDriverSectionOrchestrator$waitingResponseToAssignedDriver$122.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ygk0 ygk0Var, ygk0 ygk0Var2, ContinuationImpl continuationImpl) {
        RideCardDriverSectionOrchestrator$waitingResponseToRejected$1 rideCardDriverSectionOrchestrator$waitingResponseToRejected$1;
        int i;
        long j;
        long j2;
        if (continuationImpl instanceof RideCardDriverSectionOrchestrator$waitingResponseToRejected$1) {
            rideCardDriverSectionOrchestrator$waitingResponseToRejected$1 = (RideCardDriverSectionOrchestrator$waitingResponseToRejected$1) continuationImpl;
            int i2 = rideCardDriverSectionOrchestrator$waitingResponseToRejected$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverSectionOrchestrator$waitingResponseToRejected$1.label = i2 - Integer.MIN_VALUE;
                RideCardDriverSectionOrchestrator$waitingResponseToRejected$1 rideCardDriverSectionOrchestrator$waitingResponseToRejected$12 = rideCardDriverSectionOrchestrator$waitingResponseToRejected$1;
                Object obj = rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.label;
                if (i != 0) {
                    b.b(obj);
                    long j3 = d(ygk0Var2, ygk0Var) ? 300L : 0L;
                    f(qgk0.a(c(), 3));
                    rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.L$0 = null;
                    rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.L$1 = null;
                    rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.J$0 = 300L;
                    rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.J$1 = j3;
                    rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.label = 1;
                    long j4 = j3;
                    if (h(j4, ygk0Var, ygk0Var2, rideCardDriverSectionOrchestrator$waitingResponseToRejected$12) != obj2) {
                        j = j4;
                        j2 = 300;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                j = rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.J$1;
                j2 = rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.J$0;
                b.b(obj);
                long max = Math.max(j2, j);
                rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.L$0 = null;
                rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.L$1 = null;
                rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.J$0 = j2;
                rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.J$1 = j;
                rideCardDriverSectionOrchestrator$waitingResponseToRejected$12.label = 2;
                Object b = b(max, rideCardDriverSectionOrchestrator$waitingResponseToRejected$12);
                return b != obj2 ? obj2 : b;
            }
        }
        rideCardDriverSectionOrchestrator$waitingResponseToRejected$1 = new RideCardDriverSectionOrchestrator$waitingResponseToRejected$1(this, continuationImpl);
        RideCardDriverSectionOrchestrator$waitingResponseToRejected$1 rideCardDriverSectionOrchestrator$waitingResponseToRejected$122 = rideCardDriverSectionOrchestrator$waitingResponseToRejected$1;
        Object obj3 = rideCardDriverSectionOrchestrator$waitingResponseToRejected$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverSectionOrchestrator$waitingResponseToRejected$122.label;
        if (i != 0) {
        }
        long max2 = Math.max(j2, j);
        rideCardDriverSectionOrchestrator$waitingResponseToRejected$122.L$0 = null;
        rideCardDriverSectionOrchestrator$waitingResponseToRejected$122.L$1 = null;
        rideCardDriverSectionOrchestrator$waitingResponseToRejected$122.J$0 = j2;
        rideCardDriverSectionOrchestrator$waitingResponseToRejected$122.J$1 = j;
        rideCardDriverSectionOrchestrator$waitingResponseToRejected$122.label = 2;
        Object b2 = b(max2, rideCardDriverSectionOrchestrator$waitingResponseToRejected$122);
        if (b2 != obj22) {
        }
    }
}
