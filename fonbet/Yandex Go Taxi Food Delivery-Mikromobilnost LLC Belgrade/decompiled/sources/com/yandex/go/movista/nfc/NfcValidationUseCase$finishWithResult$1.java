package com.yandex.go.movista.nfc;

import defpackage.ctb1;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nyj0;
import defpackage.t960;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.movista.nfc.NfcValidationUseCase$finishWithResult$1", f = "NfcValidationUseCase.kt", l = {178}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NfcValidationUseCase$finishWithResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ nyj0 $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcValidationUseCase$finishWithResult$1(nyj0 nyj0Var, Continuation continuation) {
        super(2, continuation);
        this.$result = nyj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NfcValidationUseCase$finishWithResult$1(this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NfcValidationUseCase$finishWithResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            i3y i3yVar = t960.d;
            t960 b = ctb1.b();
            nyj0 nyj0Var = this.$result;
            this.label = 1;
            if (b.b.emit(nyj0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
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
