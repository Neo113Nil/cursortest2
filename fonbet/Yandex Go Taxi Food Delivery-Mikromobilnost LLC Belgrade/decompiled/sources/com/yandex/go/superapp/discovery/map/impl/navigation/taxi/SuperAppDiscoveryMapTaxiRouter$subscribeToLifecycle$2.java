package com.yandex.go.superapp.discovery.map.impl.navigation.taxi;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.navigation.taxi.SuperAppDiscoveryMapTaxiRouter$subscribeToLifecycle$2", f = "SuperAppDiscoveryMapTaxiRouter.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapTaxiRouter$subscribeToLifecycle$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapTaxiRouter$subscribeToLifecycle$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapTaxiRouter$subscribeToLifecycle$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapTaxiRouter$subscribeToLifecycle$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar2 = this.this$0;
            aVar2.D.a(aVar2);
            this.this$0.D.d(aVar2);
            this.this$0.E.setVisible(true);
            try {
                this.L$0 = aVar2;
                this.label = 1;
                if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = aVar2;
            } catch (Throwable th2) {
                aVar = aVar2;
                th = th2;
                this.this$0.E.setVisible(false);
                this.this$0.D.c(aVar);
                this.this$0.D.b(aVar);
                throw th;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            try {
                b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                this.this$0.E.setVisible(false);
                this.this$0.D.c(aVar);
                this.this$0.D.b(aVar);
                throw th;
            }
        }
        throw new KotlinNothingValueException();
    }
}
