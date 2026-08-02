package com.yandex.go.scooters.offers.v2.domain;

import com.yandex.go.scooters.domain.model.ScootersComeFrom;
import com.yandex.go.scooters.domain.x;
import defpackage.cpm0;
import defpackage.d4o0;
import defpackage.hbn0;
import defpackage.m3o0;
import defpackage.m4o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r7p0;
import defpackage.rbn0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lp3o0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCreateOfferInteractor$loadSingleScooterOffer$1", f = "ScootersCreateOfferInteractor.kt", l = {74, 74, HProv.ALG_SID_SHA3_384, 80, HProv.PP_CIPHEROID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCreateOfferInteractor$loadSingleScooterOffer$1 extends SuspendLambda implements wls {
    final /* synthetic */ m4o0 $presentationState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCreateOfferInteractor$loadSingleScooterOffer$1(f fVar, m4o0 m4o0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$presentationState = m4o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCreateOfferInteractor$loadSingleScooterOffer$1 scootersCreateOfferInteractor$loadSingleScooterOffer$1 = new ScootersCreateOfferInteractor$loadSingleScooterOffer$1(this.this$0, this.$presentationState, continuation);
        scootersCreateOfferInteractor$loadSingleScooterOffer$1.L$0 = obj;
        return scootersCreateOfferInteractor$loadSingleScooterOffer$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCreateOfferInteractor$loadSingleScooterOffer$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x010f, code lost:
    
        if (r2.emit(r5, r16) != r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f0, code lost:
    
        if (r2.emit(r0, r16) != r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        if (r8.emit(r0, r16) == r3) goto L44;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        vpr vprVar;
        ScootersComeFrom b;
        f fVar;
        f fVar2;
        Object a2;
        f fVar3;
        vpr vprVar2 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                x xVar = this.this$0.f;
                this.L$0 = vprVar2;
                this.L$1 = vprVar2;
                this.label = 1;
                a = xVar.a(this);
                if (a != coroutineSingletons) {
                    vprVar = vprVar2;
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                vpr vprVar3 = (vpr) this.L$1;
                kotlin.b.b(obj);
                vprVar = vprVar3;
                a = obj;
            } else {
                if (i == 2) {
                    kotlin.b.b(obj);
                    r7p0 r7p0Var = this.$presentationState.d;
                    b = f.b(this.this$0);
                    fVar = this.this$0;
                    try {
                        this.L$0 = vprVar2;
                        this.L$1 = null;
                        this.L$2 = b;
                        this.L$3 = fVar;
                        this.L$4 = fVar;
                        this.label = 3;
                        a2 = f.a(fVar, r7p0Var, this);
                        if (a2 != coroutineSingletons) {
                            fVar3 = fVar;
                            hbn0 hbn0Var = (hbn0) a2;
                            d4o0 b2 = fVar.f.b(new rbn0(hbn0Var.a, b, hbn0Var.d, hbn0Var.e, (cpm0) kotlin.collections.a.P(hbn0Var.c)), hbn0Var.b);
                            this.L$0 = vprVar2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = fVar3;
                            this.L$4 = null;
                            this.label = 4;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fVar2 = fVar;
                        fVar2.f.getClass();
                        m3o0 m3o0Var = new m3o0(th);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 5;
                    }
                    return coroutineSingletons;
                }
                if (i != 3) {
                    if (i == 4) {
                        fVar2 = (f) this.L$3;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            fVar2.f.getClass();
                            m3o0 m3o0Var2 = new m3o0(th);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 5;
                        }
                    } else {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
                fVar3 = (f) this.L$4;
                f fVar4 = (f) this.L$3;
                b = (ScootersComeFrom) this.L$2;
                try {
                    kotlin.b.b(obj);
                    fVar = fVar4;
                    a2 = obj;
                    hbn0 hbn0Var2 = (hbn0) a2;
                    d4o0 b22 = fVar.f.b(new rbn0(hbn0Var2.a, b, hbn0Var2.d, hbn0Var2.e, (cpm0) kotlin.collections.a.P(hbn0Var2.c)), hbn0Var2.b);
                    this.L$0 = vprVar2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = fVar3;
                    this.L$4 = null;
                    this.label = 4;
                } catch (Throwable th3) {
                    th = th3;
                    fVar2 = fVar3;
                    fVar2.f.getClass();
                    m3o0 m3o0Var22 = new m3o0(th);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 5;
                }
            }
            this.L$0 = vprVar2;
            this.L$1 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
