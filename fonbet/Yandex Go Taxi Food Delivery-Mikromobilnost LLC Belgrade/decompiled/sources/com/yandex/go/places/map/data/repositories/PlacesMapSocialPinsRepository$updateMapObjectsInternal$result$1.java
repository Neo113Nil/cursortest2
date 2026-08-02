package com.yandex.go.places.map.data.repositories;

import defpackage.g050;
import defpackage.i5t0;
import defpackage.kn00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qbc0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lqbc0;", "<anonymous>", "(Ltse;)Lqbc0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesMapSocialPinsRepository$updateMapObjectsInternal$result$1", f = "PlacesMapSocialPinsRepository.kt", l = {474}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMapSocialPinsRepository$updateMapObjectsInternal$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<kn00> $newMapObjects;
    final /* synthetic */ boolean $shouldSkipWhenSuspended;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMapSocialPinsRepository$updateMapObjectsInternal$result$1(i iVar, boolean z, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$shouldSkipWhenSuspended = z;
        this.$newMapObjects = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMapSocialPinsRepository$updateMapObjectsInternal$result$1(this.this$0, this.$shouldSkipWhenSuspended, this.$newMapObjects, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMapSocialPinsRepository$updateMapObjectsInternal$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i iVar;
        g050 g050Var;
        boolean z;
        List<kn00> list;
        qbc0 qbc0Var;
        i5t0 i5t0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar = iVar2.d;
            boolean z2 = this.$shouldSkipWhenSuspended;
            List<kn00> list2 = this.$newMapObjects;
            this.L$0 = aVar;
            this.L$1 = iVar2;
            this.L$2 = list2;
            this.Z$0 = z2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            iVar = iVar2;
            g050Var = aVar;
            z = z2;
            list = list2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            list = (List) this.L$2;
            iVar = (i) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        if (z) {
            try {
                if (iVar.l) {
                    qbc0Var = new qbc0(null, EmptyList.a, EmptySet.a);
                    g050Var.d(null);
                    return qbc0Var;
                }
            } catch (Throwable th) {
                g050Var.d(null);
                throw th;
            }
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int min = Math.min(iVar.c, list.size());
        for (int i2 = 0; i2 < min; i2++) {
            i.x(iVar, list.get(i2), arrayList, linkedHashSet);
        }
        if (arrayList.isEmpty() && linkedHashSet.isEmpty()) {
            i5t0Var = null;
            qbc0Var = new qbc0(i5t0Var, arrayList, linkedHashSet);
            g050Var.d(null);
            return qbc0Var;
        }
        i5t0Var = new i5t0(kotlin.collections.a.J0(iVar.e.values()), linkedHashSet);
        qbc0Var = new qbc0(i5t0Var, arrayList, linkedHashSet);
        g050Var.d(null);
        return qbc0Var;
    }
}
