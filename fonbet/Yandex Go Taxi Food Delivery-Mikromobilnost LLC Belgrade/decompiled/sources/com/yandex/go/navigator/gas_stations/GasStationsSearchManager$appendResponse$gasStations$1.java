package com.yandex.go.navigator.gas_stations;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.GeoObjectCollection;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import defpackage.bwa1;
import defpackage.g6u;
import defpackage.gh00;
import defpackage.jcb1;
import defpackage.mvg;
import defpackage.mws;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tyw;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/mapkit/GeoObject;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$appendResponse$gasStations$1", f = "GasStationsSearchManager.kt", l = {HProv.PP_VERSION_TIMESTAMP, 128}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsSearchManager$appendResponse$gasStations$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $currentSegmentIndex;
    final /* synthetic */ List<GeoObjectCollection.Item> $items;
    final /* synthetic */ GasStationSearchType $searchType;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/mapkit/GeoObject;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$appendResponse$gasStations$1$1", f = "GasStationsSearchManager.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.navigator.gas_stations.GasStationsSearchManager$appendResponse$gasStations$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<GeoObject> $openedGeoObjects;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, b bVar, Continuation continuation) {
            super(2, continuation);
            this.$openedGeoObjects = list;
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$openedGeoObjects, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            List<GeoObject> list = this.$openedGeoObjects;
            b bVar = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Point e = bwa1.e((GeoObject) obj2);
                boolean z = false;
                if (e != null) {
                    tyw tywVar = bVar.k;
                    ScreenPoint e2 = ((gh00) tywVar.a).e.e(e);
                    if (e2 != null) {
                        z = ru.yandex.taxi.map.utils.a.q(e2, (ScreenRect) tywVar.c.getValue());
                    }
                }
                if (z) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsSearchManager$appendResponse$gasStations$1(List list, GasStationSearchType gasStationSearchType, b bVar, int i, Continuation continuation) {
        super(2, continuation);
        this.$items = list;
        this.$searchType = gasStationSearchType;
        this.this$0 = bVar;
        this.$currentSegmentIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsSearchManager$appendResponse$gasStations$1(this.$items, this.$searchType, this.this$0, this.$currentSegmentIndex, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsSearchManager$appendResponse$gasStations$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if ((r6 != null ? r6.getClosed() : null) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r8 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (r8 == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (List) obj;
            }
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return (List) obj;
        }
        kotlin.b.b(obj);
        List<GeoObjectCollection.Item> list = this.$items;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            GeoObject obj2 = ((GeoObjectCollection.Item) it.next()).getObj();
            if (obj2 != null) {
                BusinessObjectMetadata b = jcb1.b(obj2);
            }
            obj2 = null;
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        int i2 = mws.a[this.$searchType.ordinal()];
        if (i2 == 1) {
            b bVar = this.this$0;
            int i3 = this.$currentSegmentIndex;
            this.L$0 = null;
            this.label = 1;
            obj = b.b(bVar, arrayList, i3, this);
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            this.this$0.c.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(arrayList, this.this$0, null);
            this.L$0 = null;
            this.label = 2;
            obj = tje.k0(g6uVar, anonymousClass1, this);
        }
        return coroutineSingletons;
    }
}
