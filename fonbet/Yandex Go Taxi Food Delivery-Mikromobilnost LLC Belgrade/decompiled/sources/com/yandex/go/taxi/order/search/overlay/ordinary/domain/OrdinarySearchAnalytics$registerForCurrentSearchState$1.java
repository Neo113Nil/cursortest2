package com.yandex.go.taxi.order.search.overlay.ordinary.domain;

import com.yandex.go.taxi.order.domain.repositories.h;
import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pho;
import defpackage.td80;
import defpackage.tse;
import defpackage.u8w;
import defpackage.ud80;
import defpackage.wls;
import defpackage.x4e;
import defpackage.ye60;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.i0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.am.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchAnalytics$registerForCurrentSearchState$1", f = "OrdinarySearchAnalytics.kt", l = {169}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrdinarySearchAnalytics$registerForCurrentSearchState$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $candidatesCache;
    final /* synthetic */ Map<String, SearchInfoResponse$TaxiSearch.CandidateSearchState> $statesCache;
    int label;
    final /* synthetic */ ud80 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/state/search/SearchState;", "searchState", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/state/search/SearchState;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchAnalytics$registerForCurrentSearchState$1$2", f = "OrdinarySearchAnalytics.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchAnalytics$registerForCurrentSearchState$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ Map<String, String> $candidatesCache;
        final /* synthetic */ Map<String, SearchInfoResponse$TaxiSearch.CandidateSearchState> $statesCache;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ud80 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ud80 ud80Var, Map map, Map map2, Continuation continuation) {
            super(2, continuation);
            this.$candidatesCache = map;
            this.$statesCache = map2;
            this.this$0 = ud80Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$candidatesCache, this.$statesCache, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((SearchState) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SearchState k;
            SearchState searchState = (SearchState) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            String str = searchState.a;
            SearchInfoResponse$TaxiSearch.CandidateSearchState candidateSearchState = searchState.e;
            DriverCandidate driverCandidate = searchState.l;
            String str2 = driverCandidate != null ? driverCandidate.a : null;
            if (str2 == null) {
                str2 = "";
            }
            boolean z = !jl40.l(this.$candidatesCache.get(str), str2) && str2.length() > 0;
            boolean z2 = this.$statesCache.get(str) != candidateSearchState;
            if (z || z2) {
                this.$candidatesCache.put(str, str2);
                this.$statesCache.put(str, candidateSearchState);
                int i = td80.a[candidateSearchState.ordinal()];
                if (i == 1) {
                    ud80 ud80Var = this.this$0;
                    g gVar = ud80Var.c;
                    SimpleDateFormat simpleDateFormat = ud80Var.g;
                    u8w u8wVar = ud80Var.e;
                    n nVar = (n) ud80Var.d;
                    SearchState k2 = nVar.k(str);
                    if (k2 != null) {
                        String str3 = k2.a;
                        String str4 = k2.b;
                        String format = simpleDateFormat.format(new Date());
                        String Hg = gVar.b.Hg();
                        u8wVar.getClass();
                        pho phoVar = u8wVar.a;
                        HashMap hashMap = new HashMap();
                        if (str3 != null) {
                            hashMap.put("order_id", str3);
                        }
                        if (str4 != null) {
                            hashMap.put("tariff_zone", str4);
                        }
                        if (format != null) {
                            hashMap.put(ClidProvider.TIMESTAMP, format);
                        }
                        if (Hg != null) {
                            hashMap.put("user_phone_id", Hg);
                        }
                        x4e.B(phoVar, "SearchAnimation.WaitForDriverResponse", hashMap, 1);
                        SearchState k3 = nVar.k(str);
                        if (k3 != null) {
                            Integer valueOf = Integer.valueOf(k3.o);
                            String str5 = k3.a;
                            String str6 = k3.b;
                            String format2 = simpleDateFormat.format(new Date());
                            String Hg2 = gVar.b.Hg();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("order", valueOf);
                            if (str5 != null) {
                                hashMap2.put("order_id", str5);
                            }
                            if (str6 != null) {
                                hashMap2.put("tariff_zone", str6);
                            }
                            if (format2 != null) {
                                hashMap2.put(ClidProvider.TIMESTAMP, format2);
                            }
                            if (Hg2 != null) {
                                hashMap2.put("user_phone_id", Hg2);
                            }
                            x4e.B(phoVar, "SearchAnimation.CandidateSeq", hashMap2, 1);
                        }
                    }
                } else if (i == 2) {
                    ud80 ud80Var2 = this.this$0;
                    SearchState k4 = ((n) ud80Var2.d).k(str);
                    if (k4 != null) {
                        u8w u8wVar2 = ud80Var2.e;
                        String str7 = k4.a;
                        String str8 = k4.b;
                        String format3 = ud80Var2.g.format(new Date());
                        String Hg3 = ud80Var2.c.b.Hg();
                        u8wVar2.getClass();
                        HashMap hashMap3 = new HashMap();
                        if (str7 != null) {
                            hashMap3.put("order_id", str7);
                        }
                        if (str8 != null) {
                            hashMap3.put("tariff_zone", str8);
                        }
                        if (format3 != null) {
                            hashMap3.put(ClidProvider.TIMESTAMP, format3);
                        }
                        if (Hg3 != null) {
                            hashMap3.put("user_phone_id", Hg3);
                        }
                        u8wVar2.a.a("SearchAnimation.DriverRejectedShown", hashMap3, 1, new HashMap());
                    }
                }
            }
            Integer num = searchState.j;
            if (num != null) {
                ud80 ud80Var3 = this.this$0;
                int intValue = num.intValue();
                LinkedHashMap linkedHashMap = ud80Var3.j;
                Integer num2 = (Integer) linkedHashMap.get(str);
                if ((num2 == null || num2.intValue() != intValue) && (k = ((n) ud80Var3.d).k(str)) != null) {
                    linkedHashMap.put(str, Integer.valueOf(intValue));
                    u8w u8wVar3 = ud80Var3.e;
                    Integer valueOf2 = Integer.valueOf(intValue);
                    String str9 = k.a;
                    String str10 = k.b;
                    String format4 = ud80Var3.g.format(new Date());
                    String Hg4 = ud80Var3.c.b.Hg();
                    u8wVar3.getClass();
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("count", valueOf2);
                    if (str9 != null) {
                        hashMap4.put("order_id", str9);
                    }
                    if (str10 != null) {
                        hashMap4.put("tariff_zone", str10);
                    }
                    if (format4 != null) {
                        hashMap4.put(ClidProvider.TIMESTAMP, format4);
                    }
                    if (Hg4 != null) {
                        hashMap4.put("user_phone_id", Hg4);
                    }
                    u8wVar3.a.a("SearchAnimation.CarsCntShown", hashMap4, 1, new HashMap());
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrdinarySearchAnalytics$registerForCurrentSearchState$1(ud80 ud80Var, Map map, Map map2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ud80Var;
        this.$candidatesCache = map;
        this.$statesCache = map2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrdinarySearchAnalytics$registerForCurrentSearchState$1(this.this$0, this.$candidatesCache, this.$statesCache, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrdinarySearchAnalytics$registerForCurrentSearchState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        kotlinx.coroutines.flow.internal.g X = e.X(e.t(new h(((n) this.this$0.d).o)), new OrdinarySearchAnalytics$registerForCurrentSearchState$1$invokeSuspend$$inlined$flatMapLatest$1(3, null));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$candidatesCache, this.$statesCache, null);
        this.label = 1;
        Object collect = X.collect(new i0(ye60.a, anonymousClass2), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
