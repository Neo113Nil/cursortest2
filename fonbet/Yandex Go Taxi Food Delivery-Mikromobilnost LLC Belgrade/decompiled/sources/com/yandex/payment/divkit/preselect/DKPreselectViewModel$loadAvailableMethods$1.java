package com.yandex.payment.divkit.preselect;

import defpackage.a8a0;
import defpackage.bwe0;
import defpackage.hyj0;
import defpackage.kyj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qyj0;
import defpackage.tse;
import defpackage.tyh0;
import defpackage.w511;
import defpackage.wls;
import defpackage.yv90;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.preselect.DKPreselectViewModel$loadAvailableMethods$1", f = "DKPreselectViewModel.kt", l = {156, 161}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DKPreselectViewModel$loadAvailableMethods$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKPreselectViewModel$loadAvailableMethods$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKPreselectViewModel$loadAvailableMethods$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKPreselectViewModel$loadAvailableMethods$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        qyj0 g = ((yv90) this.this$0.x).g();
        if (g instanceof hyj0) {
            r0 r0Var = this.this$0.D;
            bwe0 bwe0Var = new bwe0(((hyj0) g).a, tyh0.paymentsdk_error);
            this.L$0 = null;
            this.label = 1;
            r0Var.emit(bwe0Var, this);
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (!(g instanceof kyj0)) {
            w511.b();
            return null;
        }
        List a = a8a0.a((List) ((kyj0) g).a);
        n0 n0Var = this.this$0.L;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (n0Var.emit(a, this) == coroutineSingletons) {
        }
    }
}
