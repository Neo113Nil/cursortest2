package com.yandex.go.places.map.data.mappers;

import com.yandex.go.places.models.data.entities.network.map.e;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.hbc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lkn00;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.mappers.MapObjectItemMapper$mapModels$2", f = "MapObjectItemMapper.kt", l = {HProv.PROV_GOST_2001_DH, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MapObjectItemMapper$mapModels$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<e> $dtos;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectItemMapper$mapModels$2(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dtos = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectItemMapper$mapModels$2 mapObjectItemMapper$mapModels$2 = new MapObjectItemMapper$mapModels$2(this.this$0, this.$dtos, continuation);
        mapObjectItemMapper$mapModels$2.L$0 = obj;
        return mapObjectItemMapper$mapModels$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectItemMapper$mapModels$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r10 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r10 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.places.impl.data.repositories.a aVar = this.this$0.j;
            PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
            this.L$0 = tseVar;
            this.label = 1;
            obj = aVar.a(placesMapConfig$PlacesMapScreenName, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return kotlin.collections.a.M((Iterable) obj);
            }
            b.b(obj);
        }
        hbc0 hbc0Var = (hbc0) obj;
        List<e> list = this.$dtos;
        a aVar2 = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new MapObjectItemMapper$mapModels$2$1$1(hbc0Var, aVar2, (e) it.next(), null), 3));
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = kotlinx.coroutines.a.b(arrayList, this);
    }
}
