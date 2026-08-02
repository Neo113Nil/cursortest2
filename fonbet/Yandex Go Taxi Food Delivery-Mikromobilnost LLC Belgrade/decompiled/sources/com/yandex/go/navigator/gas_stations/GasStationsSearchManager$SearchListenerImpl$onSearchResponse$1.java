package com.yandex.go.navigator.gas_stations;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.mapkit.GeoObjectCollection;
import com.yandex.mapkit.search.BusinessFilter;
import com.yandex.mapkit.search.BusinessResultMetadata;
import com.yandex.mapkit.search.Response;
import com.yandex.mapkit.search.SearchMetadata;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rts;
import defpackage.tse;
import defpackage.tus;
import defpackage.vts;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$SearchListenerImpl$onSearchResponse$1", f = "GasStationsSearchManager.kt", l = {371, 372}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class GasStationsSearchManager$SearchListenerImpl$onSearchResponse$1 extends SuspendLambda implements wls {
    final /* synthetic */ Response $response;
    int label;
    final /* synthetic */ b this$0;
    final /* synthetic */ a this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsSearchManager$SearchListenerImpl$onSearchResponse$1(b bVar, Response response, a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$response = response;
        this.this$1 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsSearchManager$SearchListenerImpl$onSearchResponse$1(this.this$0, this.$response, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsSearchManager$SearchListenerImpl$onSearchResponse$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
    
        if (r2 == r0) goto L48;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<BusinessFilter> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            tus tusVar = this.this$0.g;
            SearchMetadata metadata = this.$response.getMetadata();
            this.label = 1;
            r0 r0Var = tusVar.e;
            BusinessResultMetadata businessResultMetadata = metadata.getBusinessResultMetadata();
            if (businessResultMetadata == null || (list = businessResultMetadata.getBusinessFilters()) == null) {
                list = EmptyList.a;
            }
            HashMap hashMap = tusVar.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!jl40.l(((BusinessFilter) obj2).getId(), "category_id")) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                BusinessFilter businessFilter = (BusinessFilter) it.next();
                vts vtsVar = (vts) hashMap.get(businessFilter.getId());
                if (vtsVar == null) {
                    String id = businessFilter.getId();
                    String id2 = businessFilter.getId();
                    String name = businessFilter.getName();
                    if (name == null) {
                        name = "";
                    }
                    MapBuilder mapBuilder = new MapBuilder();
                    List<BusinessFilter.EnumValue> enums = businessFilter.getValues().getEnums();
                    if (enums != null) {
                        for (BusinessFilter.EnumValue enumValue : enums) {
                            mapBuilder.put(enumValue.getValue().getId(), new rts(enumValue.getValue().getId(), enumValue.getValue().getName()));
                        }
                    }
                    hashMap.put(id, new vts(id2, name, new LinkedHashMap(mapBuilder.j())));
                } else {
                    List<BusinessFilter.EnumValue> enums2 = businessFilter.getValues().getEnums();
                    if (enums2 != null) {
                        for (BusinessFilter.EnumValue enumValue2 : enums2) {
                            vtsVar.c.put(enumValue2.getValue().getId(), new rts(enumValue2.getValue().getId(), enumValue2.getValue().getName()));
                        }
                    }
                }
            }
            r0Var.emit(hashMap.values(), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        b bVar = this.this$0;
        List<GeoObjectCollection.Item> children = this.$response.getCollection().getChildren();
        GasStationSearchType gasStationSearchType = this.this$1.a;
        this.label = 2;
        return bVar.c(children, gasStationSearchType, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
