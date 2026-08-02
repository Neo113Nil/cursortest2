package com.yandex.payment.sdk.nfcscanner.tools;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.nfcscanner.tools.NfcEnableReceiver$onReceive$3", f = "NfcEnableReceiver.kt", l = {37}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class NfcEnableReceiver$onReceive$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ NfcEnableReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcEnableReceiver$onReceive$3(NfcEnableReceiver nfcEnableReceiver, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nfcEnableReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NfcEnableReceiver$onReceive$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NfcEnableReceiver$onReceive$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            pz40Var = this.this$0._isEnable;
            Boolean bool = Boolean.TRUE;
            this.label = 1;
            ((r0) pz40Var).emit(bool, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
