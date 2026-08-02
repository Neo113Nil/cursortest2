package com.yandex.go.scooters.domain;

import com.yandex.go.scooters.domain.model.ScootersComeFrom;
import defpackage.cpm0;
import defpackage.e3n0;
import defpackage.eer;
import defpackage.gyj0;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sbn0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Le3n0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersBookOfferInteractor$bookMultiorderVehicles$successBookResults$1", f = "ScootersBookOfferInteractor.kt", l = {173}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1 extends SuspendLambda implements wls {
    final /* synthetic */ m6a0 $paymentMethodRef;
    final /* synthetic */ sbn0 $vehiclesState;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Le3n0;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.domain.ScootersBookOfferInteractor$bookMultiorderOffer$1", f = "ScootersBookOfferInteractor.kt", l = {193}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.domain.ScootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ScootersComeFrom $comeFrom;
        final /* synthetic */ m6a0 $paymentMethodRef;
        final /* synthetic */ cpm0 $scooterOffer;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(cpm0 cpm0Var, d dVar, ScootersComeFrom scootersComeFrom, m6a0 m6a0Var, Continuation continuation) {
            super(2, continuation);
            this.$scooterOffer = cpm0Var;
            this.this$0 = dVar;
            this.$comeFrom = scootersComeFrom;
            this.$paymentMethodRef = m6a0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$scooterOffer, this.this$0, this.$comeFrom, this.$paymentMethodRef, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            cpm0 cpm0Var;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    cpm0 cpm0Var2 = this.$scooterOffer;
                    d dVar = this.this$0;
                    ScootersComeFrom scootersComeFrom = this.$comeFrom;
                    m6a0 m6a0Var = this.$paymentMethodRef;
                    gyj0 gyj0Var = Result.a;
                    String str2 = (String) kotlin.collections.b.g(qoi0.a(eer.class), cpm0Var2.e);
                    this.L$0 = cpm0Var2;
                    this.L$1 = gyj0Var;
                    this.L$2 = str2;
                    this.label = 1;
                    if (dVar.c(str2, scootersComeFrom, m6a0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cpm0Var = cpm0Var2;
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.L$2;
                    cpm0Var = (cpm0) this.L$0;
                    kotlin.b.b(obj);
                }
                return new Result(new e3n0(cpm0Var.a, str));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                return new Result(new Result.Failure(th));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1(sbn0 sbn0Var, d dVar, m6a0 m6a0Var, Continuation continuation) {
        super(2, continuation);
        this.$vehiclesState = sbn0Var;
        this.this$0 = dVar;
        this.$paymentMethodRef = m6a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1 scootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1 = new ScootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1(this.$vehiclesState, this.this$0, this.$paymentMethodRef, continuation);
        scootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1.L$0 = obj;
        return scootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersBookOfferInteractor$handleFixTariff$$inlined$bookByTariff$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            sbn0 sbn0Var = this.$vehiclesState;
            List list = sbn0Var.e;
            d dVar = this.this$0;
            m6a0 m6a0Var = this.$paymentMethodRef;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new AnonymousClass1((cpm0) it.next(), dVar, sbn0Var.b, m6a0Var, null), 3));
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
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
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((Iterable) obj).iterator();
        while (it2.hasNext()) {
            Object value = ((Result) it2.next()).getValue();
            if (value instanceof Result.Failure) {
                value = null;
            }
            e3n0 e3n0Var = (e3n0) value;
            if (e3n0Var != null) {
                arrayList2.add(e3n0Var);
            }
        }
        return arrayList2;
    }
}
