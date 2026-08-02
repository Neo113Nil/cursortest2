package com.yandex.go.preorder.navigation;

import defpackage.bov0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vld0;
import defpackage.wls;
import defpackage.wse0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.navigation.PreorderSummaryNavigationRouter$onSourceAddressConfirmed$1", f = "PreorderSummaryNavigationRouter.kt", l = {250}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreorderSummaryNavigationRouter$onSourceAddressConfirmed$1 extends SuspendLambda implements wls {
    final /* synthetic */ bov0 $revealParams;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ wse0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderSummaryNavigationRouter$onSourceAddressConfirmed$1(wse0 wse0Var, bov0 bov0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wse0Var;
        this.$revealParams = bov0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreorderSummaryNavigationRouter$onSourceAddressConfirmed$1(this.this$0, this.$revealParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreorderSummaryNavigationRouter$onSourceAddressConfirmed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bov0 bov0Var;
        wse0 wse0Var;
        wse0 wse0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                wse0 wse0Var3 = this.this$0;
                bov0Var = this.$revealParams;
                try {
                    com.yandex.go.preorder.summary.c cVar = wse0Var3.Z;
                    this.L$0 = wse0Var3;
                    this.L$1 = bov0Var;
                    this.L$2 = wse0Var3;
                    this.label = 1;
                    if (cVar.a(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    wse0Var2 = wse0Var3;
                    wse0Var = wse0Var2;
                } catch (Throwable unused) {
                    wse0Var = wse0Var3;
                    wse0Var.r(new vld0(21));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wse0Var = (wse0) this.L$2;
                bov0Var = (bov0) this.L$1;
                wse0Var2 = (wse0) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    wse0Var.r(new vld0(21));
                    return zy11.a;
                }
            }
            wse0Var2.S.c(bov0Var);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
