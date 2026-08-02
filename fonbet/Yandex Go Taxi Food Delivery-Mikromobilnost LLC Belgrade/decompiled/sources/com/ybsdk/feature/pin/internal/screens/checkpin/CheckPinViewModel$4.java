package com.ybsdk.feature.pin.internal.screens.checkpin;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.phb;
import defpackage.pz40;
import defpackage.qa60;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel$4", f = "CheckPinViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckPinViewModel$4 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$4(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CheckPinViewModel$4 checkPinViewModel$4 = new CheckPinViewModel$4(this.this$0, continuation);
        checkPinViewModel$4.L$0 = obj;
        return checkPinViewModel$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CheckPinViewModel$4 checkPinViewModel$4 = (CheckPinViewModel$4) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        checkPinViewModel$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (this.this$0.B.getCheckType().isEnterOrValidateOnReturn$feature_pin_release()) {
            try {
                qa60 qa60Var = this.this$0.P.a;
                failure = Boolean.FALSE;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj2 = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
                failure = obj2;
            }
            boolean booleanValue = ((Boolean) failure).booleanValue();
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, phb.a((phb) value, false, booleanValue, null, null, null, null, null, null, false, null, 4087)));
        }
        return zy11.a;
    }
}
