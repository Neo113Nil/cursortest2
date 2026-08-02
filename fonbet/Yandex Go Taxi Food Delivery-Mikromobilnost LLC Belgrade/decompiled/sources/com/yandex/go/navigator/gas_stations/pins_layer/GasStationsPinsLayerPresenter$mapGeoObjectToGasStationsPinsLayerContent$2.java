package com.yandex.go.navigator.gas_stations.pins_layer;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.mapkit.GeoObject;
import defpackage.cws;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uts;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcws;", "<anonymous>", "(Ltse;)Lcws;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.pins_layer.GasStationsPinsLayerPresenter$mapGeoObjectToGasStationsPinsLayerContent$2", f = "GasStationsPinsLayerPresenter.kt", l = {245, 357, 251}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsPinsLayerPresenter$mapGeoObjectToGasStationsPinsLayerContent$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<GeoObject> $gasStations;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsPinsLayerPresenter$mapGeoObjectToGasStationsPinsLayerContent$2(List list, h hVar, Continuation continuation) {
        super(2, continuation);
        this.$gasStations = list;
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsPinsLayerPresenter$mapGeoObjectToGasStationsPinsLayerContent$2(this.$gasStations, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsPinsLayerPresenter$mapGeoObjectToGasStationsPinsLayerContent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        if (r10 == r0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:10:0x0121, B:31:0x00e0, B:33:0x00ea, B:39:0x010d), top: B:30:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00a6 -> B:41:0x00a9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        h hVar;
        Iterator it;
        List list;
        ArrayList arrayList2;
        Set set;
        h hVar2;
        g050 g050Var;
        h hVar3;
        g050 g050Var2;
        Set set2;
        List list2;
        ArrayList arrayList3;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<GeoObject> list3 = this.$gasStations;
            h hVar4 = this.this$0;
            arrayList = new ArrayList();
            hVar = hVar4;
            it = list3.iterator();
            if (it.hasNext()) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            it = (Iterator) this.L$5;
            arrayList = (Collection) this.L$3;
            hVar = (h) this.L$1;
            kotlin.b.b(obj);
            uts utsVar = (uts) obj;
            if (utsVar != null) {
                arrayList.add(utsVar);
            }
            if (it.hasNext()) {
                list = (List) arrayList;
                arrayList2 = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                h hVar5 = this.this$0;
                kotlinx.coroutines.sync.a aVar = hVar5.M;
                this.L$0 = list;
                this.L$1 = arrayList2;
                this.L$2 = linkedHashSet;
                this.L$3 = aVar;
                this.L$4 = hVar5;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.label = 2;
                if (aVar.a(this) != coroutineSingletons) {
                    set = linkedHashSet;
                    hVar2 = hVar5;
                    g050Var = aVar;
                    if (hVar2.B.a() == GasStationSearchType.ON_AREA) {
                    }
                    h.Lg(hVar2, list, arrayList2, set);
                    g050Var.d(null);
                    if (arrayList2.isEmpty()) {
                    }
                    return new cws(set, arrayList2);
                }
            } else {
                GeoObject geoObject = (GeoObject) it.next();
                this.L$0 = null;
                this.L$1 = hVar;
                this.L$2 = null;
                this.L$3 = arrayList;
                this.L$4 = null;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.label = 1;
                obj = hVar.Og(geoObject, false, this);
            }
            return coroutineSingletons;
        }
        if (i != 2) {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hVar3 = (h) this.L$4;
            g050Var2 = (g050) this.L$3;
            set2 = (Set) this.L$2;
            ?? r3 = (List) this.L$1;
            list2 = (List) this.L$0;
            try {
                kotlin.b.b(obj);
                arrayList3 = r3;
                list = list2;
                set = set2;
                arrayList2 = arrayList3;
                g050Var = g050Var2;
                hVar2 = hVar3;
                h.Lg(hVar2, list, arrayList2, set);
                g050Var.d(null);
                if (arrayList2.isEmpty() || !set.isEmpty()) {
                    return new cws(set, arrayList2);
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                g050Var2.d(null);
                throw th;
            }
        }
        hVar2 = (h) this.L$4;
        g050Var = (g050) this.L$3;
        set = (Set) this.L$2;
        ?? r6 = (List) this.L$1;
        List list4 = (List) this.L$0;
        kotlin.b.b(obj);
        arrayList2 = r6;
        list = list4;
        try {
            if (hVar2.B.a() == GasStationSearchType.ON_AREA) {
                this.L$0 = list;
                this.L$1 = arrayList2;
                this.L$2 = set;
                this.L$3 = g050Var;
                this.L$4 = hVar2;
                this.label = 3;
                hVar2.E.getClass();
                sjh sjhVar = uyj.a;
                Object k0 = tje.k0(o400.a, new GasStationsPinsLayerPresenter$removePinsOutsideVisibleRect$2(hVar2, set, null), this);
                if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    k0 = zy11.a;
                }
                if (k0 != coroutineSingletons) {
                    hVar3 = hVar2;
                    g050Var2 = g050Var;
                    set2 = set;
                    list2 = list;
                    arrayList3 = arrayList2;
                    list = list2;
                    set = set2;
                    arrayList2 = arrayList3;
                    g050Var = g050Var2;
                    hVar2 = hVar3;
                }
                return coroutineSingletons;
            }
            h.Lg(hVar2, list, arrayList2, set);
            g050Var.d(null);
            if (arrayList2.isEmpty()) {
            }
            return new cws(set, arrayList2);
        } catch (Throwable th3) {
            th = th3;
            g050Var2 = g050Var;
            g050Var2.d(null);
            throw th;
        }
    }
}
