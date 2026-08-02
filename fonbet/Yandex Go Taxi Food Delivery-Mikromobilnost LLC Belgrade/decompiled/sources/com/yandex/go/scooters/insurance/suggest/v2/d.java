package com.yandex.go.scooters.insurance.suggest.v2;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersInsuranceUpsaleTappedButtonName;
import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.domain.r;
import defpackage.dtn0;
import defpackage.hun0;
import defpackage.iun0;
import defpackage.jl40;
import defpackage.m950;
import defpackage.n3o0;
import defpackage.ny61;
import defpackage.oun0;
import defpackage.pun0;
import defpackage.qu;
import defpackage.qun0;
import defpackage.qxm0;
import defpackage.stn0;
import defpackage.tse0;
import defpackage.v6n0;
import defpackage.vkn0;
import defpackage.w511;
import defpackage.z7n0;
import defpackage.zgz;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class d {
    public final qxm0 a;
    public final r b;

    public d(qxm0 qxm0Var, r rVar) {
        this.a = qxm0Var;
        this.b = rVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:22|23))(3:24|25|(2:27|28)(2:29|30)))(2:31|(2:33|34)(3:35|(1:37)(2:40|(2:(1:43)(1:49)|(2:45|46)(2:47|48))(2:50|(2:52|53)(2:54|(2:56|57)(2:59|60))))|39))))|65|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (r13 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016a, code lost:
    
        if (r8.a(r9, r0) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0043, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019e, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0040, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0184, code lost:
    
        r9 = r10.a;
        r9.A((defpackage.m950) r9.I.get(), new defpackage.zjn0(r8, (java.util.List) null, 6), new defpackage.fun0(r9, r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qun0 qun0Var, hun0 hun0Var, oun0 oun0Var, n3o0 n3o0Var, ContinuationImpl continuationImpl) {
        ScootersInsuranceSuggestV2UiActionInteractor$handleAction$1 scootersInsuranceSuggestV2UiActionInteractor$handleAction$1;
        int i;
        if (continuationImpl instanceof ScootersInsuranceSuggestV2UiActionInteractor$handleAction$1) {
            scootersInsuranceSuggestV2UiActionInteractor$handleAction$1 = (ScootersInsuranceSuggestV2UiActionInteractor$handleAction$1) continuationImpl;
            int i2 = scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.label;
                zy11 zy11Var = zy11.a;
                int i3 = 1;
                if (i == 0) {
                    if (i == 1) {
                        hun0Var = (hun0) scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$1;
                        kotlin.b.b(obj);
                        String str = (String) obj;
                        if (str == null) {
                            zgz.a(null, new IllegalArgumentException("Promotion id for scooters insurance is not set in experiment"));
                            return zy11Var;
                        }
                        iun0 iun0Var = hun0Var.a;
                        iun0Var.A((m950) iun0Var.J.get(), new z7n0(str, true), new v6n0(iun0Var.H, 10));
                        return zy11Var;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oun0Var = (oun0) scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$2;
                    hun0Var = (hun0) scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$1;
                    try {
                        kotlin.b.b(obj);
                        hun0Var.a.r(new vkn0(23));
                        return zy11Var;
                    } finally {
                        r0 r0Var = oun0Var.a;
                        Boolean bool = Boolean.FALSE;
                        r0Var.getClass();
                        r0Var.m(null, bool);
                    }
                }
                kotlin.b.b(obj);
                boolean l = jl40.l(qun0Var, pun0.e);
                qxm0 qxm0Var = this.a;
                if (l) {
                    qxm0Var.a.a("Scooters.InsuranceUpsale.Shown", tse0.p(qxm0Var), 1, new HashMap());
                    return zy11Var;
                }
                boolean l2 = jl40.l(qun0Var, pun0.b);
                r rVar = this.b;
                if (l2) {
                    scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$0 = null;
                    scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$1 = hun0Var;
                    scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$2 = null;
                    scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$3 = null;
                    scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.label = 1;
                    obj = rVar.c(scootersInsuranceSuggestV2UiActionInteractor$handleAction$1);
                } else {
                    if (jl40.l(qun0Var, pun0.c)) {
                        stn0 stn0Var = n3o0Var != null ? n3o0Var.f : null;
                        if (stn0Var == null) {
                            zgz.a(null, new IllegalStateException("Insurance provider info is null"));
                            return zy11Var;
                        }
                        CharSequence charSequence = stn0Var.a;
                        List list = stn0Var.b;
                        iun0 iun0Var2 = hun0Var.a;
                        iun0Var2.A((m950) iun0Var2.K.get(), new dtn0(charSequence, list), new v6n0(iun0Var2.H, 11));
                        return zy11Var;
                    }
                    if (jl40.l(qun0Var, pun0.d)) {
                        ScootersAnalytics$ScootersInsuranceUpsaleTappedButtonName scootersAnalytics$ScootersInsuranceUpsaleTappedButtonName = ScootersAnalytics$ScootersInsuranceUpsaleTappedButtonName.Disagree;
                        HashMap p = tse0.p(qxm0Var);
                        p.put("button_name", scootersAnalytics$ScootersInsuranceUpsaleTappedButtonName.getEventValue());
                        qxm0Var.a.a("Scooters.InsuranceUpsale.Tapped", p, 1, new HashMap());
                        hun0Var.a.r(new qu(9));
                        return zy11Var;
                    }
                    if (!jl40.l(qun0Var, pun0.a)) {
                        w511.b();
                        return null;
                    }
                    ScootersAnalytics$ScootersInsuranceUpsaleTappedButtonName scootersAnalytics$ScootersInsuranceUpsaleTappedButtonName2 = ScootersAnalytics$ScootersInsuranceUpsaleTappedButtonName.Agree;
                    HashMap p2 = tse0.p(qxm0Var);
                    p2.put("button_name", scootersAnalytics$ScootersInsuranceUpsaleTappedButtonName2.getEventValue());
                    qxm0Var.a.a("Scooters.InsuranceUpsale.Tapped", p2, 1, new HashMap());
                    r0 r0Var2 = oun0Var.a;
                    Boolean bool2 = Boolean.TRUE;
                    r0Var2.getClass();
                    r0Var2.m(null, bool2);
                    ScootersInsuranceType scootersInsuranceType = ScootersInsuranceType.FULL;
                    scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$0 = null;
                    scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$1 = hun0Var;
                    scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$2 = oun0Var;
                    scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.L$3 = null;
                    scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.label = 2;
                }
                return coroutineSingletons;
            }
        }
        scootersInsuranceSuggestV2UiActionInteractor$handleAction$1 = new ScootersInsuranceSuggestV2UiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj2 = scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceSuggestV2UiActionInteractor$handleAction$1.label;
        zy11 zy11Var2 = zy11.a;
        int i32 = 1;
        if (i == 0) {
        }
    }
}
