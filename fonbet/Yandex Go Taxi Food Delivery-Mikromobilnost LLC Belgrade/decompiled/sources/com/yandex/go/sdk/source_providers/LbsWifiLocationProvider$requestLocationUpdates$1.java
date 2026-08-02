package com.yandex.go.sdk.source_providers;

import defpackage.f8y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p7y;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lk7z;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sdk.source_providers.LbsWifiLocationProvider$requestLocationUpdates$1", f = "LbsLocationProvider.kt", l = {53, 56}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class LbsWifiLocationProvider$requestLocationUpdates$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LbsWifiLocationProvider$requestLocationUpdates$1(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LbsWifiLocationProvider$requestLocationUpdates$1 lbsWifiLocationProvider$requestLocationUpdates$1 = new LbsWifiLocationProvider$requestLocationUpdates$1(this.this$0, continuation);
        lbsWifiLocationProvider$requestLocationUpdates$1.L$0 = obj;
        return lbsWifiLocationProvider$requestLocationUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LbsWifiLocationProvider$requestLocationUpdates$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (r6.collect(r8, r7) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r8 == r1) goto L15;
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
            f8y f8yVar = (f8y) this.this$0.a.get();
            this.L$0 = vprVar;
            this.label = 1;
            ru.yandex.taxi.location.g gVar = (ru.yandex.taxi.location.g) f8yVar;
            gVar.getClass();
            obj = ru.yandex.taxi.location.g.b(gVar, "locationSDK/wifi", this);
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
        j jVar = new j(new h((tpr) obj), this.this$0);
        p7y p7yVar = new p7y(vprVar, 1);
        this.L$0 = null;
        this.label = 2;
    }
}
