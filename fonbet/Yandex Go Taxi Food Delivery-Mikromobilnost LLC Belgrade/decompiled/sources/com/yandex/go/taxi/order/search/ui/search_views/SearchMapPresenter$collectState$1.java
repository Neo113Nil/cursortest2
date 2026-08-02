package com.yandex.go.taxi.order.search.ui.search_views;

import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.k380;
import defpackage.mvg;
import defpackage.n380;
import defpackage.ny61;
import defpackage.o380;
import defpackage.s380;
import defpackage.tse;
import defpackage.txp0;
import defpackage.uup0;
import defpackage.vpr;
import defpackage.vup0;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.ui.search_views.SearchMapPresenter$collectState$1", f = "SearchMapPresenter.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SearchMapPresenter$collectState$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ vup0 this$0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/taxi/order/state/search/SearchState;", ClidProvider.STATE, "Ls380;", "pinV2State", "Lkotlin/Pair;", "Luxp0;", "Lm380;", "<anonymous>", "(Lcom/yandex/go/taxi/order/state/search/SearchState;Ls380;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.search.ui.search_views.SearchMapPresenter$collectState$1$1", f = "SearchMapPresenter.kt", l = {71}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.search.ui.search_views.SearchMapPresenter$collectState$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ vup0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(vup0 vup0Var, Continuation continuation) {
            super(3, continuation);
            this.this$0 = vup0Var;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Continuation) obj3);
            anonymousClass1.L$0 = (SearchState) obj;
            anonymousClass1.L$1 = (s380) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SearchState searchState = (SearchState) this.L$0;
            s380 s380Var = (s380) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.taxi.order.search.domain.entity.mapper.a aVar = this.this$0.y;
                n380 n380Var = s380Var.a;
                this.L$0 = null;
                this.L$1 = s380Var;
                this.label = 1;
                obj = aVar.a(searchState, n380Var, this);
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
            return new Pair(obj, s380Var.b);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lkotlin/Pair;", "Luxp0;", "Lm380;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.search.ui.search_views.SearchMapPresenter$collectState$1$2", f = "SearchMapPresenter.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.search.ui.search_views.SearchMapPresenter$collectState$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            vpr vprVar = (vpr) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                Pair pair = new Pair(new txp0(ServiceLevel.SearchingPulsarDTO.SearchingPulsar.NONE, null, 0), k380.c);
                this.L$0 = null;
                this.label = 1;
                if (vprVar.emit(pair, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMapPresenter$collectState$1(vup0 vup0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vup0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchMapPresenter$collectState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchMapPresenter$collectState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g e = ((n) this.this$0.x).e();
            o380 o380Var = this.this$0.E;
            kotlinx.coroutines.flow.n nVar = new kotlinx.coroutines.flow.n(new m0(e, e.t(e.p(new com.yandex.go.taxi.order.pin.d(o380Var.a, o380Var), 50L)), new AnonymousClass1(this.this$0, null)), new AnonymousClass2(2, null));
            vup0 vup0Var = this.this$0;
            b bVar = new b(nVar, vup0Var);
            uup0 uup0Var = new uup0(vup0Var, 1);
            this.label = 1;
            if (bVar.collect(uup0Var, this) == coroutineSingletons) {
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
