package com.ybsdk.di.modules.features.nfc;

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
@mvg(c = "com.ybsdk.di.modules.features.nfc.NfcShortcutInteractorImpl$createShortcut$1", f = "NfcShortcutInteractorImpl.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class NfcShortcutInteractorImpl$createShortcut$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onResult;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcShortcutInteractorImpl$createShortcut$1(a aVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$onResult = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NfcShortcutInteractorImpl$createShortcut$1(this.this$0, this.$onResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NfcShortcutInteractorImpl$createShortcut$1 nfcShortcutInteractorImpl$createShortcut$1 = (NfcShortcutInteractorImpl$createShortcut$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nfcShortcutInteractorImpl$createShortcut$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.a.getClass();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tls tlsVar = (tls) this.L$0;
            b.b(obj);
            tlsVar.invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
        }
        return zy11.a;
    }
}
