package com.yandex.go.places.map.data.repositories;

import defpackage.g050;
import defpackage.h73;
import defpackage.kn00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qrq0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesMapSocialPinsRepository$cacheLayerMapObjectsIfSuspended$2", f = "PlacesMapSocialPinsRepository.kt", l = {474, 366}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesMapSocialPinsRepository$cacheLayerMapObjectsIfSuspended$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<kn00> $newMapObjects;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesMapSocialPinsRepository$cacheLayerMapObjectsIfSuspended$2(i iVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$newMapObjects = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesMapSocialPinsRepository$cacheLayerMapObjectsIfSuspended$2(this.this$0, this.$newMapObjects, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesMapSocialPinsRepository$cacheLayerMapObjectsIfSuspended$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r1.c(r6, r10) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
    
        if (r11.a(r10) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i iVar;
        kotlinx.coroutines.sync.a aVar;
        List<kn00> list;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                iVar = this.this$0;
                aVar = iVar.d;
                list = this.$newMapObjects;
                this.L$0 = aVar;
                this.L$1 = iVar;
                this.L$2 = list;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        Boolean valueOf = Boolean.valueOf(z);
                        g050Var.d(null);
                        return valueOf;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var.d(null);
                        throw th;
                    }
                }
                list = (List) this.L$2;
                iVar = (i) this.L$1;
                ?? r6 = (g050) this.L$0;
                kotlin.b.b(obj);
                aVar = r6;
            }
            if (iVar.l) {
                qrq0 q = kotlin.sequences.b.q(new h73(1, list), iVar.c);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : q) {
                    linkedHashMap.put(((kn00) obj2).getId(), obj2);
                }
                com.yandex.go.places.impl.data.repositories.map.a aVar2 = iVar.k;
                this.L$0 = aVar;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
            } else {
                z = false;
            }
            g050Var = aVar;
            Boolean valueOf2 = Boolean.valueOf(z);
            g050Var.d(null);
            return valueOf2;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th3;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
    }
}
