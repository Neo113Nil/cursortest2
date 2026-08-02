package com.yandex.payment.sdk.nfcscanner;

import com.yandex.payment.sdk.nfcscanner.tools.c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o960;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.nfcscanner.NfcScannerFragment$onCreate$1", f = "NfcScannerFragment.kt", l = {30}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class NfcScannerFragment$onCreate$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ NfcScannerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcScannerFragment$onCreate$1(NfcScannerFragment nfcScannerFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nfcScannerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NfcScannerFragment$onCreate$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NfcScannerFragment$onCreate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c requestController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            requestController = this.this$0.requestController();
            n0 n0Var = requestController.C;
            o960 o960Var = new o960(this.this$0, 1);
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, o960Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ny61.A();
        return null;
    }
}
