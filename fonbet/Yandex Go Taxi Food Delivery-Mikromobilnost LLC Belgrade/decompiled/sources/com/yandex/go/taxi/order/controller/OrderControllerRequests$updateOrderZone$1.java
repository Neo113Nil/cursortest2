package com.yandex.go.taxi.order.controller;

import com.yandex.go.zone.model.Zone;
import defpackage.g6u;
import defpackage.jl70;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.n721;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.controller.OrderControllerRequests$updateOrderZone$1", f = "OrderControllerRequests.kt", l = {338, 341}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderControllerRequests$updateOrderZone$1 extends SuspendLambda implements wls {
    final /* synthetic */ n721 $callback;
    final /* synthetic */ tls $zoneFetchFunction;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderControllerRequests$updateOrderZone$1(a aVar, tls tlsVar, n721 n721Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$zoneFetchFunction = tlsVar;
        this.$callback = n721Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderControllerRequests$updateOrderZone$1(this.this$0, this.$zoneFetchFunction, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderControllerRequests$updateOrderZone$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (defpackage.tje.k0(r7, r8, r10) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        n721 n721Var;
        Object k0;
        a aVar2;
        n721 n721Var2;
        Throwable th;
        a aVar3;
        n721 n721Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n721Var3 = (n721) this.L$1;
                    aVar3 = (a) this.L$0;
                    try {
                        b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    return zy11.a;
                }
                n721 n721Var4 = (n721) this.L$3;
                a aVar4 = (a) this.L$2;
                n721 n721Var5 = (n721) this.L$1;
                aVar2 = (a) this.L$0;
                try {
                    b.b(obj);
                    k0 = obj;
                    aVar = aVar4;
                    n721Var2 = n721Var5;
                    n721Var = n721Var4;
                } catch (Throwable th3) {
                    th = th3;
                    n721Var3 = n721Var4;
                    aVar3 = aVar4;
                }
                aVar3.G.b("updateOrderZone", th, new jl70(22));
                n721Var3.a();
                return zy11.a;
            }
            b.b(obj);
            aVar = this.this$0;
            tls tlsVar = this.$zoneFetchFunction;
            n721Var = this.$callback;
            try {
                tt2 tt2Var = aVar.b;
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                OrderControllerRequests$updateOrderZone$1$1$zone$1 orderControllerRequests$updateOrderZone$1$1$zone$1 = new OrderControllerRequests$updateOrderZone$1$1$zone$1(tlsVar, null);
                this.L$0 = aVar;
                this.L$1 = n721Var;
                this.L$2 = aVar;
                this.L$3 = n721Var;
                this.label = 1;
                k0 = tje.k0(mdhVar, orderControllerRequests$updateOrderZone$1$1$zone$1, this);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = aVar;
                n721Var2 = n721Var;
            } catch (Throwable th4) {
                a aVar5 = aVar;
                th = th4;
                aVar3 = aVar5;
                n721Var3 = n721Var;
            }
            tt2 tt2Var2 = aVar2.b;
            sjh sjhVar2 = uyj.a;
            g6u g6uVar = o400.a;
            OrderControllerRequests$updateOrderZone$1$1$1 orderControllerRequests$updateOrderZone$1$1$1 = new OrderControllerRequests$updateOrderZone$1$1$1(aVar2, (Zone) k0, n721Var2, null);
            this.L$0 = aVar;
            this.L$1 = n721Var;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
