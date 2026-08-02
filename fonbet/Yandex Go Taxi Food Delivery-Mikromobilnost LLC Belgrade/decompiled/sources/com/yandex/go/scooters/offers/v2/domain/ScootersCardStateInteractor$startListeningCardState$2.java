package com.yandex.go.scooters.offers.v2.domain;

import defpackage.a6n0;
import defpackage.jqr;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$startListeningCardState$2", f = "ScootersCardStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCardStateInteractor$startListeningCardState$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$startListeningCardState$2$1", f = "ScootersCardStateInteractor.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$startListeningCardState$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                e eVar = this.this$0;
                this.label = 1;
                g gVar = eVar.c;
                k kVar = new k(new jqr(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.X(new jqr(kotlinx.coroutines.flow.e.X(gVar.h.d(gVar.j.a().a, false), new ScootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$1(gVar, null)), new ScootersOffersInteractor$listenToScootersOfferResult$2(gVar, null), 3), new ScootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$2(gVar, null)), new ScootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$3(null, gVar.d)), new ScootersOffersInteractor$listenToScootersOfferResult$5(2, gVar, g.class, "notifyRepositories", "notifyRepositories(Lcom/yandex/go/scooters/domain/model/ScootersOfferLoadResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3), new ScootersOffersInteractor$listenToScootersOfferResult$6(gVar, null));
                gVar.a.getClass();
                if (kotlinx.coroutines.flow.e.k(new o(kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.F(kVar, uyj.a), kotlinx.coroutines.flow.e.d(eVar.d.c), new n(kotlinx.coroutines.flow.e.c(eVar.m.a), new ScootersCardStateInteractor$listenToScootersCardState$2(2, null)), new ScootersCardStateInteractor$listenToScootersCardState$3(eVar, null)), new ScootersCardStateInteractor$listenToScootersCardState$4(eVar, null)), new ScootersCardStateInteractor$listenToScootersCardState$5(eVar, null), this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$startListeningCardState$2$2", f = "ScootersCardStateInteractor.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$startListeningCardState$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                e eVar = this.this$0;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(new mth(kotlinx.coroutines.flow.e.d(eVar.h.a), 6), new ScootersCardStateInteractor$listenToBookStateChanges$2(eVar, null), this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$startListeningCardState$2$3", f = "ScootersCardStateInteractor.kt", l = {80}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.offers.v2.domain.ScootersCardStateInteractor$startListeningCardState$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e eVar = this.this$0;
            this.label = 1;
            Object collect = kotlinx.coroutines.flow.e.d(eVar.d.c).a.collect(new h0(new a6n0(eVar, 0)), this);
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardStateInteractor$startListeningCardState$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersCardStateInteractor$startListeningCardState$2 scootersCardStateInteractor$startListeningCardState$2 = new ScootersCardStateInteractor$startListeningCardState$2(this.this$0, continuation);
        scootersCardStateInteractor$startListeningCardState$2.L$0 = obj;
        return scootersCardStateInteractor$startListeningCardState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCardStateInteractor$startListeningCardState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        return tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
    }
}
