package com.yandex.go.scooters.offers.v2.newbie_guide;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import com.yandex.go.scooters.data.f;
import com.yandex.go.scooters.data.model.ScootersOnboardingExperiment;
import com.yandex.go.scooters.domain.ScootersBeginnerInteractor$ShowForBeginner;
import com.yandex.go.scooters.domain.c;
import com.yandex.go.scooters.domain.r;
import defpackage.av4;
import defpackage.b4p0;
import defpackage.ehn0;
import defpackage.fee0;
import defpackage.gee0;
import defpackage.gpa;
import defpackage.gxm0;
import defpackage.h55;
import defpackage.hee0;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.kyh0;
import defpackage.l7g;
import defpackage.m950;
import defpackage.n3o0;
import defpackage.ny61;
import defpackage.pzn0;
import defpackage.q150;
import defpackage.qme0;
import defpackage.qu;
import defpackage.qwo0;
import defpackage.r8c0;
import defpackage.sls;
import defpackage.tje;
import defpackage.v1o0;
import defpackage.w030;
import defpackage.w1o0;
import defpackage.w511;
import defpackage.y5p0;
import defpackage.yvf0;
import defpackage.z7n0;
import defpackage.zgz;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final e D;
    public final w030 E;
    public final y5p0 F;
    public final qwo0 G;
    public final c H;
    public final r I;
    public final f J;
    public final yvf0 K;
    public final yvf0 L;
    public final yvf0 M;

    public b(e eVar, w030 w030Var, y5p0 y5p0Var, qwo0 qwo0Var, c cVar, r rVar, f fVar, av4 av4Var, q150 q150Var, l7g l7gVar) {
        super(null);
        this.D = eVar;
        this.E = w030Var;
        this.F = y5p0Var;
        this.G = qwo0Var;
        this.H = cVar;
        this.I = rVar;
        this.J = fVar;
        this.K = av4Var;
        this.L = q150Var;
        this.M = l7gVar;
    }

    public static final void P(b bVar) {
        bVar.H.c.a.g(zy11.a);
        bVar.r(new pzn0(8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        if (r2 == r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(b bVar, v1o0 v1o0Var, ContinuationImpl continuationImpl) {
        ScootersNewbieGuideRouter$showBeginnerGuide$1 scootersNewbieGuideRouter$showBeginnerGuide$1;
        Object obj;
        int i;
        String str;
        ScootersVehicleType scootersVehicleType;
        Object R;
        ScootersVehicleType scootersVehicleType2;
        ScootersOnboardingExperiment scootersOnboardingExperiment;
        String str2;
        Object a;
        hee0 hee0Var;
        ScootersOnboardingExperiment scootersOnboardingExperiment2;
        int i2;
        bVar.getClass();
        if (continuationImpl instanceof ScootersNewbieGuideRouter$showBeginnerGuide$1) {
            scootersNewbieGuideRouter$showBeginnerGuide$1 = (ScootersNewbieGuideRouter$showBeginnerGuide$1) continuationImpl;
            int i3 = scootersNewbieGuideRouter$showBeginnerGuide$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersNewbieGuideRouter$showBeginnerGuide$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = scootersNewbieGuideRouter$showBeginnerGuide$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersNewbieGuideRouter$showBeginnerGuide$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    str = v1o0Var.a;
                    scootersVehicleType = v1o0Var.b;
                    f fVar = bVar.J;
                    scootersNewbieGuideRouter$showBeginnerGuide$1.L$0 = null;
                    scootersNewbieGuideRouter$showBeginnerGuide$1.L$1 = str;
                    scootersNewbieGuideRouter$showBeginnerGuide$1.L$2 = scootersVehicleType;
                    scootersNewbieGuideRouter$showBeginnerGuide$1.label = 1;
                    obj2 = fVar.a(str, scootersNewbieGuideRouter$showBeginnerGuide$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            scootersOnboardingExperiment = (ScootersOnboardingExperiment) scootersNewbieGuideRouter$showBeginnerGuide$1.L$3;
                            scootersVehicleType2 = (ScootersVehicleType) scootersNewbieGuideRouter$showBeginnerGuide$1.L$2;
                            str2 = (String) scootersNewbieGuideRouter$showBeginnerGuide$1.L$1;
                            kotlin.b.b(obj2);
                            hee0 hee0Var2 = (hee0) obj2;
                            c cVar = bVar.H;
                            scootersNewbieGuideRouter$showBeginnerGuide$1.L$0 = null;
                            scootersNewbieGuideRouter$showBeginnerGuide$1.L$1 = str2;
                            scootersNewbieGuideRouter$showBeginnerGuide$1.L$2 = scootersVehicleType2;
                            scootersNewbieGuideRouter$showBeginnerGuide$1.L$3 = scootersOnboardingExperiment;
                            scootersNewbieGuideRouter$showBeginnerGuide$1.L$4 = hee0Var2;
                            scootersNewbieGuideRouter$showBeginnerGuide$1.label = 3;
                            a = cVar.a(str2, scootersNewbieGuideRouter$showBeginnerGuide$1);
                            if (a != obj) {
                                hee0Var = hee0Var2;
                                obj2 = a;
                                scootersOnboardingExperiment2 = scootersOnboardingExperiment;
                                String str3 = str2;
                                ScootersVehicleType scootersVehicleType3 = scootersVehicleType2;
                                i2 = w1o0.a[((ScootersBeginnerInteractor$ShowForBeginner) obj2).ordinal()];
                                if (i2 != 1) {
                                }
                                return zy11.a;
                            }
                            return obj;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hee0 hee0Var3 = (hee0) scootersNewbieGuideRouter$showBeginnerGuide$1.L$4;
                        scootersOnboardingExperiment2 = (ScootersOnboardingExperiment) scootersNewbieGuideRouter$showBeginnerGuide$1.L$3;
                        scootersVehicleType2 = (ScootersVehicleType) scootersNewbieGuideRouter$showBeginnerGuide$1.L$2;
                        str2 = (String) scootersNewbieGuideRouter$showBeginnerGuide$1.L$1;
                        kotlin.b.b(obj2);
                        hee0Var = hee0Var3;
                        String str32 = str2;
                        ScootersVehicleType scootersVehicleType32 = scootersVehicleType2;
                        i2 = w1o0.a[((ScootersBeginnerInteractor$ShowForBeginner) obj2).ordinal()];
                        if (i2 != 1) {
                            bVar.T(scootersOnboardingExperiment2, str32, scootersVehicleType32, new ehn0(11, bVar));
                        } else if (i2 == 2) {
                            bVar.S(str32, hee0Var, scootersOnboardingExperiment2);
                        } else if (i2 == 3) {
                            bVar.T(scootersOnboardingExperiment2, str32, scootersVehicleType32, new r8c0(bVar, str32, hee0Var, scootersOnboardingExperiment2, 5));
                        } else {
                            if (i2 != 4) {
                                w511.b();
                                return null;
                            }
                            zgz.a("Beginner guide is happened when must not be", new IllegalStateException());
                            bVar.r(new qu(9));
                        }
                        return zy11.a;
                    }
                    scootersVehicleType = (ScootersVehicleType) scootersNewbieGuideRouter$showBeginnerGuide$1.L$2;
                    str = (String) scootersNewbieGuideRouter$showBeginnerGuide$1.L$1;
                    kotlin.b.b(obj2);
                }
                ScootersOnboardingExperiment scootersOnboardingExperiment3 = (ScootersOnboardingExperiment) obj2;
                scootersNewbieGuideRouter$showBeginnerGuide$1.L$0 = null;
                scootersNewbieGuideRouter$showBeginnerGuide$1.L$1 = str;
                scootersNewbieGuideRouter$showBeginnerGuide$1.L$2 = scootersVehicleType;
                scootersNewbieGuideRouter$showBeginnerGuide$1.L$3 = scootersOnboardingExperiment3;
                scootersNewbieGuideRouter$showBeginnerGuide$1.label = 2;
                R = bVar.R(scootersNewbieGuideRouter$showBeginnerGuide$1);
                if (R != obj) {
                    String str4 = str;
                    scootersVehicleType2 = scootersVehicleType;
                    scootersOnboardingExperiment = scootersOnboardingExperiment3;
                    obj2 = R;
                    str2 = str4;
                    hee0 hee0Var22 = (hee0) obj2;
                    c cVar2 = bVar.H;
                    scootersNewbieGuideRouter$showBeginnerGuide$1.L$0 = null;
                    scootersNewbieGuideRouter$showBeginnerGuide$1.L$1 = str2;
                    scootersNewbieGuideRouter$showBeginnerGuide$1.L$2 = scootersVehicleType2;
                    scootersNewbieGuideRouter$showBeginnerGuide$1.L$3 = scootersOnboardingExperiment;
                    scootersNewbieGuideRouter$showBeginnerGuide$1.L$4 = hee0Var22;
                    scootersNewbieGuideRouter$showBeginnerGuide$1.label = 3;
                    a = cVar2.a(str2, scootersNewbieGuideRouter$showBeginnerGuide$1);
                    if (a != obj) {
                    }
                }
                return obj;
            }
        }
        scootersNewbieGuideRouter$showBeginnerGuide$1 = new ScootersNewbieGuideRouter$showBeginnerGuide$1(bVar, continuationImpl);
        Object obj22 = scootersNewbieGuideRouter$showBeginnerGuide$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersNewbieGuideRouter$showBeginnerGuide$1.label;
        if (i != 0) {
        }
        ScootersOnboardingExperiment scootersOnboardingExperiment32 = (ScootersOnboardingExperiment) obj22;
        scootersNewbieGuideRouter$showBeginnerGuide$1.L$0 = null;
        scootersNewbieGuideRouter$showBeginnerGuide$1.L$1 = str;
        scootersNewbieGuideRouter$showBeginnerGuide$1.L$2 = scootersVehicleType;
        scootersNewbieGuideRouter$showBeginnerGuide$1.L$3 = scootersOnboardingExperiment32;
        scootersNewbieGuideRouter$showBeginnerGuide$1.label = 2;
        R = bVar.R(scootersNewbieGuideRouter$showBeginnerGuide$1);
        if (R != obj) {
        }
        return obj;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new ScootersNewbieGuideRouter$onLaunch$1(this, (v1o0) obj, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        if (r8 != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005b, code lost:
    
        if (r8 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(ContinuationImpl continuationImpl) {
        ScootersNewbieGuideRouter$getPostAgreementInsuranceAction$1 scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1;
        int i;
        n3o0 n3o0Var;
        String str;
        Object obj;
        ScootersInsuranceType scootersInsuranceType;
        if (continuationImpl instanceof ScootersNewbieGuideRouter$getPostAgreementInsuranceAction$1) {
            scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1 = (ScootersNewbieGuideRouter$getPostAgreementInsuranceAction$1) continuationImpl;
            int i2 = scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.label;
                r rVar = this.I;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    b4p0 a = this.F.a();
                    n3o0Var = a != null ? a.l : null;
                    scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.L$0 = n3o0Var;
                    scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.label = 1;
                    obj2 = rVar.b(n3o0Var, false, scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return ((Boolean) obj2).booleanValue() ? gee0.a : gee0.b;
                    }
                    n3o0Var = (n3o0) scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.L$0;
                    kotlin.b.b(obj2);
                }
                str = (String) obj2;
                if (str == null) {
                    return new fee0(str);
                }
                scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.L$0 = null;
                scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.L$1 = null;
                scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.label = 2;
                rVar.getClass();
                if (n3o0Var != null ? true ^ n3o0Var.d : true) {
                    if (n3o0Var == null || (scootersInsuranceType = n3o0Var.a) == null) {
                        scootersInsuranceType = rVar.d().a;
                    }
                    if (scootersInsuranceType == ScootersInsuranceType.STANDART) {
                        obj = rVar.i(scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1);
                        obj2 = obj;
                    }
                }
                obj = Boolean.FALSE;
                obj2 = obj;
            }
        }
        scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1 = new ScootersNewbieGuideRouter$getPostAgreementInsuranceAction$1(this, continuationImpl);
        Object obj22 = scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersNewbieGuideRouter$getPostAgreementInsuranceAction$1.label;
        r rVar2 = this.I;
        if (i != 0) {
        }
        str = (String) obj22;
        if (str == null) {
        }
    }

    public final void S(String str, hee0 hee0Var, ScootersOnboardingExperiment scootersOnboardingExperiment) {
        String str2;
        if (jl40.l(hee0Var, gee0.b)) {
            str2 = null;
        } else {
            str2 = this.D.a.getString(kyh0.scooters_next);
        }
        A((m950) this.K.get(), new gxm0(str, str2, scootersOnboardingExperiment), new a(hee0Var, this));
    }

    public final void T(ScootersOnboardingExperiment scootersOnboardingExperiment, String str, ScootersVehicleType scootersVehicleType, sls slsVar) {
        qwo0 qwo0Var = this.G;
        qme0 qme0Var = qwo0Var.A;
        kgx[] kgxVarArr = qwo0.B;
        String str2 = null;
        if (((Boolean) qme0Var.getValue(qwo0Var, kgxVarArr[25])).booleanValue()) {
            ScootersOnboardingExperiment.Promotions promotions = scootersOnboardingExperiment.f;
            if (promotions != null) {
                str2 = promotions.b;
            }
        } else if (scootersVehicleType == ScootersVehicleType.SCOOTER && ((Boolean) qwo0Var.y.getValue(qwo0Var, kgxVarArr[23])).booleanValue()) {
            ScootersOnboardingExperiment.Promotions promotions2 = scootersOnboardingExperiment.f;
            if (promotions2 != null) {
                str2 = promotions2.a;
            }
        } else {
            ScootersOnboardingExperiment.Promotions promotions3 = scootersOnboardingExperiment.f;
            if (promotions3 != null) {
                str2 = promotions3.b;
            }
        }
        if (str2 == null && (str2 = scootersOnboardingExperiment.e) == null) {
            return;
        }
        A((m950) this.M.get(), new z7n0(str2, jl40.l(scootersOnboardingExperiment.g, Boolean.TRUE)), new gpa(5, this, str, slsVar));
    }
}
