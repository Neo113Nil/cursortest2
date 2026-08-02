package com.yandex.go.places.impl.navigation.common.navigator.internal;

import defpackage.acc0;
import defpackage.iac0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.w411;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.navigator.internal.PlacesInternalNavigatorImpl$openTransportNative$1", f = "PlacesInternalNavigatorImpl.kt", l = {369}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesInternalNavigatorImpl$openTransportNative$1 extends SuspendLambda implements wls {
    final /* synthetic */ w411 $transportPoints;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesInternalNavigatorImpl$openTransportNative$1(b bVar, w411 w411Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$transportPoints = w411Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesInternalNavigatorImpl$openTransportNative$1(this.this$0, this.$transportPoints, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesInternalNavigatorImpl$openTransportNative$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar2 = this.this$0;
                w411 w411Var = this.$transportPoints;
                bVar2.d.b();
                acc0 acc0Var = bVar2.i;
                this.L$0 = bVar2;
                this.label = 1;
                if (((com.yandex.go.places.impl.navigation.summary.a) acc0Var).c(w411Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar = bVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (b) this.L$0;
                kotlin.b.b(obj);
            }
            int i2 = iac0.a[bVar.c.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.m.a.r(new qu(9));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "TRANSPORT_ROUTE_DEEPLINK", null, th, "Failed to open transport native from Places", 2);
        }
        return zy11.a;
    }
}
