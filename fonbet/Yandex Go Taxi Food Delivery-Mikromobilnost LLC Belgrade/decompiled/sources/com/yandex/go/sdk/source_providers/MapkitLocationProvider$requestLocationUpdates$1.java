package com.yandex.go.sdk.source_providers;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r9;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lk7z;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sdk.source_providers.MapkitLocationProvider$requestLocationUpdates$1", f = "MapkitLocationProvider.kt", l = {23, 25}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MapkitLocationProvider$requestLocationUpdates$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapkitLocationProvider$requestLocationUpdates$1(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapkitLocationProvider$requestLocationUpdates$1 mapkitLocationProvider$requestLocationUpdates$1 = new MapkitLocationProvider$requestLocationUpdates$1(this.this$0, continuation);
        mapkitLocationProvider$requestLocationUpdates$1.L$0 = obj;
        return mapkitLocationProvider$requestLocationUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapkitLocationProvider$requestLocationUpdates$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r5.collect(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r7 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.preorder.source.userposition.repository.f fVar = (ru.yandex.taxi.preorder.source.userposition.repository.f) this.this$0.a.get();
            this.L$0 = vprVar;
            this.label = 1;
            obj = fVar.a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        m mVar = new m((tpr) obj, this.this$0);
        r9 r9Var = new r9(vprVar, 6);
        this.L$0 = null;
        this.label = 2;
    }
}
