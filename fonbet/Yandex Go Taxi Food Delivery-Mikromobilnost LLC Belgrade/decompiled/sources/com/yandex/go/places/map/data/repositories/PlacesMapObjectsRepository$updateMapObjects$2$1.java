package com.yandex.go.places.map.data.repositories;

import defpackage.g050;
import defpackage.hq00;
import defpackage.kn00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Lkotlin/Pair;", "Lhq00;", "", "Lkn00;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesMapObjectsRepository$updateMapObjects$2$1", f = "PlacesMapObjectsRepository.kt", l = {224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMapObjectsRepository$updateMapObjects$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<kn00> $newMapObjects;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMapObjectsRepository$updateMapObjects$2$1(h hVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$newMapObjects = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMapObjectsRepository$updateMapObjects$2$1(this.this$0, this.$newMapObjects, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMapObjectsRepository$updateMapObjects$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h hVar;
        g050 g050Var;
        List<kn00> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hVar = this.this$0;
            kotlinx.coroutines.sync.a aVar = hVar.d;
            List<kn00> list2 = this.$newMapObjects;
            this.L$0 = aVar;
            this.L$1 = hVar;
            this.L$2 = list2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar;
            list = list2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.L$2;
            hVar = (h) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int min = Math.min(hVar.c, list.size());
            for (int i2 = 0; i2 < min; i2++) {
                h.x(hVar, list.get(i2), arrayList, linkedHashSet);
            }
            Triple triple = new Triple(arrayList, linkedHashSet, kotlin.collections.a.J0(hVar.e.values()));
            g050Var.d(null);
            List list3 = (List) triple.getFirst();
            Set set = (Set) triple.getSecond();
            return new Pair((list3.isEmpty() && set.isEmpty()) ? null : new hq00((List) triple.getThird(), set), list3);
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
