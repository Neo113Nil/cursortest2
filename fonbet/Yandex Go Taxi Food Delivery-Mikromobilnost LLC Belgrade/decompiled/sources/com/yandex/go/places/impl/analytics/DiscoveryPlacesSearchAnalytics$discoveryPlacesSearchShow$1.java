package com.yandex.go.places.impl.analytics;

import defpackage.kup0;
import defpackage.lx4;
import defpackage.mvg;
import defpackage.nwj;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vy;
import defpackage.wbc0;
import defpackage.wls;
import defpackage.wwp0;
import defpackage.zsp0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.analytics.DiscoveryPlacesSearchAnalytics$discoveryPlacesSearchShow$1", f = "DiscoveryPlacesSearchAnalytics.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscoveryPlacesSearchAnalytics$discoveryPlacesSearchShow$1 extends SuspendLambda implements wls {
    final /* synthetic */ wwp0 $searchState;
    final /* synthetic */ String $userInput;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryPlacesSearchAnalytics$discoveryPlacesSearchShow$1(wwp0 wwp0Var, a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$searchState = wwp0Var;
        this.this$0 = aVar;
        this.$userInput = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscoveryPlacesSearchAnalytics$discoveryPlacesSearchShow$1(this.$searchState, this.this$0, this.$userInput, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DiscoveryPlacesSearchAnalytics$discoveryPlacesSearchShow$1 discoveryPlacesSearchAnalytics$discoveryPlacesSearchShow$1 = (DiscoveryPlacesSearchAnalytics$discoveryPlacesSearchShow$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        discoveryPlacesSearchAnalytics$discoveryPlacesSearchShow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List list = this.$searchState.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof kup0) {
                arrayList.add(obj2);
            }
        }
        a aVar = this.this$0;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kup0 kup0Var = (kup0) it.next();
            vy vyVar = aVar.x;
            zsp0 zsp0Var = kup0Var.d;
            vyVar.getClass();
            nwj a = vy.a(zsp0Var);
            if (a != null) {
                arrayList2.add(a);
            }
        }
        a aVar2 = this.this$0;
        String str = this.$userInput;
        aVar2.getClass();
        String n = a.n(str);
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            nwj nwjVar = (nwj) it2.next();
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("type", nwjVar.a);
            String str2 = nwjVar.b;
            if (str2 != null) {
            }
            String str3 = nwjVar.c;
            if (str3 != null) {
            }
            String str4 = nwjVar.d;
            if (str4 != null) {
            }
            String str5 = nwjVar.e;
            if (str5 != null) {
                mapBuilder.put("query", str5);
            }
            arrayList3.add(mapBuilder.j());
        }
        a aVar3 = this.this$0;
        String str6 = this.$userInput;
        i d = ((j) ((lx4) aVar3.a)).d("Discovery.PlacesSearch.Shown");
        d.d("type", n);
        d.d("search_query", str6);
        d.e("items_list", arrayList3);
        d.d("source", ((wbc0) aVar3.b).a().a());
        d.m();
        return zy11.a;
    }
}
