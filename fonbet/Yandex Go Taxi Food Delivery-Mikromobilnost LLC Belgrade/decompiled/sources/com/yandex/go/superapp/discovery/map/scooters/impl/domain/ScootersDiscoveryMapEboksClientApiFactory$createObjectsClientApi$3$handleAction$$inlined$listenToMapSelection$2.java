package com.yandex.go.superapp.discovery.map.scooters.impl.domain;

import defpackage.cin0;
import defpackage.mvg;
import defpackage.mxn0;
import defpackage.ny61;
import defpackage.pxn0;
import defpackage.qxn0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/eboks/objects/api/MapObjectAction;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.scooters.impl.domain.ScootersDiscoveryMapEboksClientApiFactory$createObjectsClientApi$3$handleAction$$inlined$listenToMapSelection$2", f = "ScootersDiscoveryMapEboksClientApiFactory.kt", l = {110}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class ScootersDiscoveryMapEboksClientApiFactory$createObjectsClientApi$3$handleAction$$inlined$listenToMapSelection$2 extends SuspendLambda implements wls {
    final /* synthetic */ pxn0 $action$inlined;
    Object L$0;
    int label;
    final /* synthetic */ cin0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDiscoveryMapEboksClientApiFactory$createObjectsClientApi$3$handleAction$$inlined$listenToMapSelection$2(Continuation continuation, cin0 cin0Var, pxn0 pxn0Var) {
        super(2, continuation);
        this.this$0 = cin0Var;
        this.$action$inlined = pxn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDiscoveryMapEboksClientApiFactory$createObjectsClientApi$3$handleAction$$inlined$listenToMapSelection$2(continuation, this.this$0, this.$action$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDiscoveryMapEboksClientApiFactory$createObjectsClientApi$3$handleAction$$inlined$listenToMapSelection$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qxn0 a = this.this$0.b.a();
            if (a != null) {
                mxn0 mxn0Var = (mxn0) this.$action$inlined;
                this.L$0 = null;
                this.label = 1;
                if (a.b(mxn0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
