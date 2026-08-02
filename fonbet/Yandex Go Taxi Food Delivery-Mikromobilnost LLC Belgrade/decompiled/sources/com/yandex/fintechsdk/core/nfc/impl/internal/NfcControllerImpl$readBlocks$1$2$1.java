package com.yandex.fintechsdk.core.nfc.impl.internal;

import defpackage.gbi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.core.nfc.impl.internal.NfcControllerImpl$readBlocks$1$2$1", f = "NfcControllerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class NfcControllerImpl$readBlocks$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onSuccess;
    final /* synthetic */ gbi0 $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcControllerImpl$readBlocks$1$2$1(tls tlsVar, gbi0 gbi0Var, Continuation continuation) {
        super(2, continuation);
        this.$onSuccess = tlsVar;
        this.$result = gbi0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NfcControllerImpl$readBlocks$1$2$1(this.$onSuccess, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NfcControllerImpl$readBlocks$1$2$1 nfcControllerImpl$readBlocks$1$2$1 = (NfcControllerImpl$readBlocks$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nfcControllerImpl$readBlocks$1$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.$onSuccess.invoke(this.$result);
        return zy11.a;
    }
}
