package com.yandex.go.taxi.order.provider;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.zsg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.provider.ActiveOrdersProvider$deactivateOrderInternal$2", f = "ActiveOrdersProvider.kt", l = {252, 255}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ActiveOrdersProvider$deactivateOrderInternal$2 extends SuspendLambda implements tls {
    final /* synthetic */ boolean $deactivatedByError;
    final /* synthetic */ o2y0 $orderHolder;
    final /* synthetic */ boolean $redirectWasConsumed;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveOrdersProvider$deactivateOrderInternal$2(a aVar, o2y0 o2y0Var, boolean z, boolean z2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$orderHolder = o2y0Var;
        this.$redirectWasConsumed = z;
        this.$deactivatedByError = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ActiveOrdersProvider$deactivateOrderInternal$2(this.this$0, this.$orderHolder, this.$redirectWasConsumed, this.$deactivatedByError, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ActiveOrdersProvider$deactivateOrderInternal$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            this.label = 1;
            obj = aVar.q(this);
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
        if (((Boolean) obj).booleanValue() && !this.this$0.b.a.get()) {
            ((ru.yandex.taxi.startup.launch.c) this.this$0.c.get()).b("ActiveOrdersProvider.deactivate", true);
        }
        n0 n0Var = this.this$0.k;
        zsg zsgVar = new zsg(this.$orderHolder, true ^ this.$redirectWasConsumed, this.$deactivatedByError);
        this.label = 2;
    }
}
