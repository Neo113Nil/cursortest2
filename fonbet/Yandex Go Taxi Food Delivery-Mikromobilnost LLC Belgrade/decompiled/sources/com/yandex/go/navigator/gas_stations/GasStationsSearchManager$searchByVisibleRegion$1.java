package com.yandex.go.navigator.gas_stations;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.mapkit.map.VisibleRegionUtils;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.Session;
import defpackage.g6u;
import defpackage.gh00;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$searchByVisibleRegion$1", f = "GasStationsSearchManager.kt", l = {275, 276, 277}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsSearchManager$searchByVisibleRegion$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$searchByVisibleRegion$1$1", f = "GasStationsSearchManager.kt", l = {280}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.navigator.gas_stations.GasStationsSearchManager$searchByVisibleRegion$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ SearchOptions $searchOption;
        final /* synthetic */ String $searchQuery;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, String str, SearchOptions searchOptions, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$searchQuery = str;
            this.$searchOption = searchOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$searchQuery, this.$searchOption, continuation);
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
                this.this$0.m.a(5000L);
                Session session = this.this$0.r;
                if (session != null) {
                    session.cancel();
                }
                com.yandex.go.navigator.search.a aVar = this.this$0.b;
                this.label = 1;
                obj = aVar.a(this);
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
            b bVar = this.this$0;
            bVar.r = ((SearchManager) obj).submit(this.$searchQuery, VisibleRegionUtils.toPolygon(((gh00) bVar.a).e.f()), this.$searchOption, new a(this.this$0, GasStationSearchType.ON_AREA));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsSearchManager$searchByVisibleRegion$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsSearchManager$searchByVisibleRegion$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsSearchManager$searchByVisibleRegion$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (defpackage.tje.k0(r3, r4, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            this.label = 1;
            obj = b.a(bVar, this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            str = (String) this.L$0;
            kotlin.b.b(obj);
            this.this$0.c.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, str, (SearchOptions) obj, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        str = (String) obj;
        b bVar2 = this.this$0;
        this.L$0 = str;
        this.label = 2;
        bVar2.c.getClass();
        sjh sjhVar2 = uyj.a;
        obj = tje.k0(mdh.b, new GasStationsSearchManager$createSearchOptions$2(bVar2, null), this);
    }
}
