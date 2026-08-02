package com.yandex.go.navigator.gas_stations;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.search.FilterCollection;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.SearchType;
import com.yandex.mapkit.search.Snippet;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tus;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/search/SearchOptions;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/search/SearchOptions;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$createSearchOptions$2", f = "GasStationsSearchManager.kt", l = {257}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class GasStationsSearchManager$createSearchOptions$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/search/SearchOptions;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/search/SearchOptions;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$createSearchOptions$2$1", f = "GasStationsSearchManager.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.navigator.gas_stations.GasStationsSearchManager$createSearchOptions$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ SearchOptions $searchOptions;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchOptions searchOptions, b bVar, Continuation continuation) {
            super(2, continuation);
            this.$searchOptions = searchOptions;
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$searchOptions, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Guidance guidance;
            Location location;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            Point point = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            SearchOptions searchOptions = this.$searchOptions;
            Navigation b = this.this$0.j.b();
            if (b != null && (guidance = b.getGuidance()) != null && (location = guidance.getLocation()) != null) {
                point = location.getPosition();
            }
            return searchOptions.setUserPosition(point);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsSearchManager$createSearchOptions$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsSearchManager$createSearchOptions$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsSearchManager$createSearchOptions$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SearchOptions searchOptions = (SearchOptions) this.L$0;
            kotlin.b.b(obj);
            return searchOptions;
        }
        kotlin.b.b(obj);
        SearchOptions searchOptions2 = new SearchOptions();
        searchOptions2.setSearchTypes(SearchType.BIZ.value);
        searchOptions2.setResultPageSize(new Integer(64));
        tus tusVar = this.this$0.g;
        LinkedHashMap linkedHashMap = new LinkedHashMap(tusVar.i);
        List list = tusVar.l;
        linkedHashMap.put("category_id", Collections.singletonList("184105274"));
        searchOptions2.setFilters(new FilterCollection(list, linkedHashMap, kotlin.collections.b.f(), kotlin.collections.b.f()));
        searchOptions2.setSnippets(Snippet.ROUTE_DISTANCES.value | Snippet.BUSINESS_IMAGES.value | Snippet.FUEL.value);
        this.this$0.c.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchOptions2, this.this$0, null);
        this.L$0 = searchOptions2;
        this.label = 1;
        return tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : searchOptions2;
    }
}
