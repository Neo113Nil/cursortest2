package com.yandex.go.scooters.offers.v2.domain;

import com.yandex.go.scooters.data.model.ScootersAlternativeOfferExperiment;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferResponse;
import com.yandex.go.scooters.data.model.ScootersOffersPresentationState$LaunchContext;
import defpackage.cpm0;
import defpackage.d3a;
import defpackage.i5n0;
import defpackage.i5p0;
import defpackage.lxm0;
import defpackage.m4b1;
import defpackage.m6a0;
import defpackage.ny61;
import defpackage.ppo0;
import defpackage.q1b1;
import defpackage.q4o0;
import defpackage.qoi0;
import defpackage.qoo0;
import defpackage.qpo0;
import defpackage.y5n0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.scooters.data.a a;
    public final com.yandex.go.scooters.data.mapper.b b;
    public final qoo0 c;
    public final com.yandex.go.scooters.payments.data.c d;
    public final i5n0 e;
    public final q4o0 f;
    public final d3a g;

    public a(com.yandex.go.scooters.data.a aVar, com.yandex.go.scooters.data.mapper.b bVar, qoo0 qoo0Var, com.yandex.go.scooters.payments.data.c cVar, i5n0 i5n0Var, q4o0 q4o0Var, d3a d3aVar) {
        this.a = aVar;
        this.b = bVar;
        this.c = qoo0Var;
        this.d = cVar;
        this.e = i5n0Var;
        this.f = q4o0Var;
        this.g = d3aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(1:(1:(4:13|14|15|16)(2:19|20))(3:21|22|23))(1:26))(1:45)|27|(2:29|(2:35|(2:39|(3:41|(2:43|25)|23))))|44))|51|6|7|8|(0)(0)|27|(0)|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0139, code lost:
    
        if (r12 != r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r12 == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0141, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y5n0 y5n0Var, ContinuationImpl continuationImpl) {
        ScootersAlternativeOfferInteractor$getAlternativeOffer$1 scootersAlternativeOfferInteractor$getAlternativeOffer$1;
        int i;
        ScootersAlternativeOfferExperiment scootersAlternativeOfferExperiment;
        i5p0 b;
        if (continuationImpl instanceof ScootersAlternativeOfferInteractor$getAlternativeOffer$1) {
            scootersAlternativeOfferInteractor$getAlternativeOffer$1 = (ScootersAlternativeOfferInteractor$getAlternativeOffer$1) continuationImpl;
            int i2 = scootersAlternativeOfferInteractor$getAlternativeOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersAlternativeOfferInteractor$getAlternativeOffer$1.label = i2 - Integer.MIN_VALUE;
                ScootersAlternativeOfferInteractor$getAlternativeOffer$1 scootersAlternativeOfferInteractor$getAlternativeOffer$12 = scootersAlternativeOfferInteractor$getAlternativeOffer$1;
                Object obj = scootersAlternativeOfferInteractor$getAlternativeOffer$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersAlternativeOfferInteractor$getAlternativeOffer$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$0 = y5n0Var;
                    scootersAlternativeOfferInteractor$getAlternativeOffer$12.label = 1;
                    obj = this.g.b.b(scootersAlternativeOfferInteractor$getAlternativeOffer$12);
                } else if (i == 1) {
                    y5n0Var = (y5n0) scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (lxm0) obj;
                    }
                    kotlin.b.b(obj);
                    com.yandex.go.scooters.data.mapper.b bVar = this.b;
                    ScootersAlternativeOfferResponse.AlternativeOffer alternativeOffer = ((ScootersAlternativeOfferResponse) obj).a;
                    scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$0 = null;
                    scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$1 = null;
                    scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$2 = null;
                    scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$3 = null;
                    scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$4 = null;
                    scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$5 = null;
                    scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$6 = null;
                    scootersAlternativeOfferInteractor$getAlternativeOffer$12.label = 3;
                    obj = bVar.b(alternativeOffer, scootersAlternativeOfferInteractor$getAlternativeOffer$12);
                }
                scootersAlternativeOfferExperiment = (ScootersAlternativeOfferExperiment) obj;
                if (scootersAlternativeOfferExperiment.b) {
                    qpo0 qpo0Var = (qpo0) ((r0) this.c.b).getValue();
                    boolean z = qpo0Var instanceof ppo0;
                    q4o0 q4o0Var = this.f;
                    if (!z || q4o0Var.a().b != ScootersOffersPresentationState$LaunchContext.ON_CAMERA || ((ppo0) qpo0Var).b.size() <= 1) {
                        cpm0 d = q1b1.d(y5n0Var.j);
                        if (scootersAlternativeOfferExperiment.c.contains(d.a.b.k()) && (b = m4b1.b(y5n0Var.h)) != null) {
                            String str = (String) d.e.get(qoi0.a(b.f.getClass()));
                            if (str != null) {
                                com.yandex.go.scooters.data.a aVar = this.a;
                                String a = this.e.a();
                                q4o0Var.a().getClass();
                                m6a0 c = this.d.c();
                                List c2 = q1b1.c(y5n0Var.j);
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$0 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$1 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$2 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$3 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$4 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$5 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.label = 2;
                                obj = aVar.d(str, a, c, c2, scootersAlternativeOfferInteractor$getAlternativeOffer$12);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                com.yandex.go.scooters.data.mapper.b bVar2 = this.b;
                                ScootersAlternativeOfferResponse.AlternativeOffer alternativeOffer2 = ((ScootersAlternativeOfferResponse) obj).a;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$0 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$1 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$2 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$3 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$4 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$5 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.L$6 = null;
                                scootersAlternativeOfferInteractor$getAlternativeOffer$12.label = 3;
                                obj = bVar2.b(alternativeOffer2, scootersAlternativeOfferInteractor$getAlternativeOffer$12);
                            }
                        }
                    }
                }
                return null;
            }
        }
        scootersAlternativeOfferInteractor$getAlternativeOffer$1 = new ScootersAlternativeOfferInteractor$getAlternativeOffer$1(this, continuationImpl);
        ScootersAlternativeOfferInteractor$getAlternativeOffer$1 scootersAlternativeOfferInteractor$getAlternativeOffer$122 = scootersAlternativeOfferInteractor$getAlternativeOffer$1;
        Object obj2 = scootersAlternativeOfferInteractor$getAlternativeOffer$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersAlternativeOfferInteractor$getAlternativeOffer$122.label;
        if (i != 0) {
        }
        scootersAlternativeOfferExperiment = (ScootersAlternativeOfferExperiment) obj2;
        if (scootersAlternativeOfferExperiment.b) {
        }
        return null;
    }
}
