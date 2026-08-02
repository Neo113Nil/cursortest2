package com.yandex.go.navigator.gas_stations;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.Session;
import defpackage.g6u;
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
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$searchByRoute$1", f = "GasStationsSearchManager.kt", l = {300, IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, 302, 303}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsSearchManager$searchByRoute$1 extends SuspendLambda implements wls {
    final /* synthetic */ DrivingRoute $drivingRoute;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$searchByRoute$1$1", f = "GasStationsSearchManager.kt", l = {306}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.navigator.gas_stations.GasStationsSearchManager$searchByRoute$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Geometry $geometry;
        final /* synthetic */ SearchOptions $searchOption;
        final /* synthetic */ String $searchQuery;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, String str, Geometry geometry, SearchOptions searchOptions, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$searchQuery = str;
            this.$geometry = geometry;
            this.$searchOption = searchOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$searchQuery, this.$geometry, this.$searchOption, continuation);
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
            bVar.r = ((SearchManager) obj).submit(this.$searchQuery, this.$geometry, this.$searchOption, new a(bVar, GasStationSearchType.ON_ROUTE));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsSearchManager$searchByRoute$1(b bVar, DrivingRoute drivingRoute, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$drivingRoute = drivingRoute;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsSearchManager$searchByRoute$1(this.this$0, this.$drivingRoute, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsSearchManager$searchByRoute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bf, code lost:
    
        if (defpackage.tje.k0(r15, r7, r14) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r15 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Geometry geometry;
        Object k0;
        String str;
        Geometry geometry2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            DrivingRoute drivingRoute = this.$drivingRoute;
            this.label = 1;
            bVar.c.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(o400.a, new GasStationsSearchManager$getUpcomingPartWithDistance$2(drivingRoute, 150000.0d, bVar, null), this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i == 2) {
                geometry = (Geometry) this.L$0;
                kotlin.b.b(obj);
                String str2 = (String) obj;
                b bVar2 = this.this$0;
                this.L$0 = geometry;
                this.L$1 = str2;
                this.label = 3;
                bVar2.c.getClass();
                sjh sjhVar2 = uyj.a;
                k0 = tje.k0(mdh.b, new GasStationsSearchManager$createSearchOptions$2(bVar2, null), this);
                if (k0 != coroutineSingletons) {
                    str = str2;
                    geometry2 = geometry;
                    obj = k0;
                    SearchOptions searchOptions = (SearchOptions) obj;
                    this.this$0.c.getClass();
                    sjh sjhVar3 = uyj.a;
                    g6u g6uVar = o400.a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, str, geometry2, searchOptions, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            String str3 = (String) this.L$1;
            Geometry geometry3 = (Geometry) this.L$0;
            kotlin.b.b(obj);
            str = str3;
            geometry2 = geometry3;
            SearchOptions searchOptions2 = (SearchOptions) obj;
            this.this$0.c.getClass();
            sjh sjhVar32 = uyj.a;
            g6u g6uVar2 = o400.a;
            AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, str, geometry2, searchOptions2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
        }
        Geometry geometry4 = (Geometry) obj;
        b bVar3 = this.this$0;
        this.L$0 = geometry4;
        this.label = 2;
        Object a = b.a(bVar3, this);
        if (a != coroutineSingletons) {
            geometry = geometry4;
            obj = a;
            String str22 = (String) obj;
            b bVar22 = this.this$0;
            this.L$0 = geometry;
            this.L$1 = str22;
            this.label = 3;
            bVar22.c.getClass();
            sjh sjhVar22 = uyj.a;
            k0 = tje.k0(mdh.b, new GasStationsSearchManager$createSearchOptions$2(bVar22, null), this);
            if (k0 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
