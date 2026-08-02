package com.yandex.go.taxi.order.domain.repositories;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$CompanionsSearch;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$DisplayBanners;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$DisplaySettings;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.models.api.response.r7;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.go.zone.model.Zone;
import defpackage.a3y0;
import defpackage.hst;
import defpackage.jqr;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qvp0;
import defpackage.rtp0;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wpp0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$collectStatusInfo$2", f = "SearchInfoStateRepositoryImpl.kt", l = {HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SearchInfoStateRepositoryImpl$collectStatusInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $orderHolder;
    final /* synthetic */ String $orderId;
    final /* synthetic */ Set<DriveState> $processingStates;
    int label;
    final /* synthetic */ n this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$collectStatusInfo$2$1", f = "SearchInfoStateRepositoryImpl.kt", l = {128}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$collectStatusInfo$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $orderId;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(n nVar, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = nVar;
            this.$orderId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$orderId, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                n nVar = this.this$0;
                String str = this.$orderId;
                this.label = 1;
                if (n.c(nVar, str, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "order", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$collectStatusInfo$2$2", f = "SearchInfoStateRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$collectStatusInfo$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ Set<DriveState> $processingStates;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Set set, Continuation continuation) {
            super(2, continuation);
            this.$processingStates = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$processingStates, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(this.$processingStates.contains(taxiOrder.h.getB()));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$collectStatusInfo$2$3", f = "SearchInfoStateRepositoryImpl.kt", l = {130}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$collectStatusInfo$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(n nVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Zone zone;
            TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
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
            n nVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            nVar.getClass();
            a3y0 a3y0Var = nVar.m;
            r7 r7Var = taxiOrder.V().l0;
            a3y0Var.getClass();
            a3y0.h(new String[]{"processOrderUpdate"});
            hst hstVar = jst.e;
            if (r7Var != null ? r7Var instanceof SearchInfoResponse$TaxiSearch : true) {
                obj2 = nVar.o(taxiOrder, (SearchInfoResponse$TaxiSearch) r7Var, this);
            } else if (r7Var instanceof SearchInfoResponse$CompanionsSearch) {
                obj2 = nVar.n(taxiOrder, (SearchInfoResponse$CompanionsSearch) r7Var, this);
            } else if (r7Var instanceof SearchInfoResponse$DisplayBanners) {
                obj2 = nVar.l(taxiOrder, (SearchInfoResponse$DisplayBanners) r7Var, this);
            } else if (r7Var instanceof SearchInfoResponse$QueueSearch) {
                SearchInfoResponse$QueueSearch searchInfoResponse$QueueSearch = (SearchInfoResponse$QueueSearch) r7Var;
                String str = taxiOrder.a;
                ZoneAddress zoneAddress = taxiOrder.t().a;
                String str2 = (zoneAddress == null || (zone = zoneAddress.b) == null) ? null : zone.a;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                SearchState searchState = (SearchState) ((Map) nVar.o.getValue()).get(str);
                if (searchState == null) {
                    SearchState.Companion.getClass();
                    searchState = SearchState.A;
                }
                SearchState searchState2 = searchState;
                SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings = searchInfoResponse$QueueSearch.b;
                obj2 = nVar.p(SearchState.a(searchState2, str, str3, null, SearchOverlayType.QUEUE, null, false, null, false, null, null, false, null, n.j(taxiOrder, searchInfoResponse$DisplaySettings != null ? searchInfoResponse$DisplaySettings.b : null, searchInfoResponse$QueueSearch), true, 0, null, true, null, null, false, null, null, null, null, null, 33476436), this);
            } else {
                a3y0.d(a3y0Var, "processOrderUpdate", null, new wpp0(9), 2);
                obj2 = zy11Var;
            }
            return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$collectStatusInfo$2$4", f = "SearchInfoStateRepositoryImpl.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.domain.repositories.SearchInfoStateRepositoryImpl$collectStatusInfo$2$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements zls {
        final /* synthetic */ String $orderId;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(n nVar, String str, Continuation continuation) {
            super(3, continuation);
            this.this$0 = nVar;
            this.$orderId = str;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return new AnonymousClass4(this.this$0, this.$orderId, (Continuation) obj3).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                n nVar = this.this$0;
                String str = this.$orderId;
                this.label = 1;
                if (n.d(nVar, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            qvp0 qvp0Var = this.this$0.c;
            qvp0Var.d.remove(this.$orderId);
            qvp0Var.c.getClass();
            a3y0.h(new String[]{"clearSearchOverlayType"});
            hst hstVar = jst.e;
            rtp0 rtp0Var = this.this$0.g;
            rtp0Var.d.remove(this.$orderId);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInfoStateRepositoryImpl$collectStatusInfo$2(o2y0 o2y0Var, n nVar, String str, Set set, Continuation continuation) {
        super(2, continuation);
        this.$orderHolder = o2y0Var;
        this.this$0 = nVar;
        this.$orderId = str;
        this.$processingStates = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchInfoStateRepositoryImpl$collectStatusInfo$2(this.$orderHolder, this.this$0, this.$orderId, this.$processingStates, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchInfoStateRepositoryImpl$collectStatusInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.k kVar = new kotlinx.coroutines.flow.k(new jqr(new kotlinx.coroutines.flow.v(new kotlinx.coroutines.flow.n(this.$orderHolder.a(), new AnonymousClass1(this.this$0, this.$orderId, null)), new AnonymousClass2(this.$processingStates, null)), new AnonymousClass3(this.this$0, null), 3), new AnonymousClass4(this.this$0, this.$orderId, null));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.j(kVar, this) == coroutineSingletons) {
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
