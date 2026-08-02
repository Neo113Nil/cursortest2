package com.yandex.go.universal_qr_scanner.presentation.qr.not.supported;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p021;
import defpackage.q021;
import defpackage.qu;
import defpackage.r021;
import defpackage.tse;
import defpackage.v021;
import defpackage.w021;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.universal_qr_scanner.presentation.qr.not.supported.UniversalQrScannerQrNotSupportedRouter$content$1$1$1", f = "UniversalQrScannerQrNotSupportedRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UniversalQrScannerQrNotSupportedRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ q021 $action;
    final /* synthetic */ v021 $navigator;
    int label;
    final /* synthetic */ w021 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalQrScannerQrNotSupportedRouter$content$1$1$1(w021 w021Var, q021 q021Var, v021 v021Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = w021Var;
        this.$action = q021Var;
        this.$navigator = v021Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalQrScannerQrNotSupportedRouter$content$1$1$1(this.this$0, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UniversalQrScannerQrNotSupportedRouter$content$1$1$1 universalQrScannerQrNotSupportedRouter$content$1$1$1 = (UniversalQrScannerQrNotSupportedRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        universalQrScannerQrNotSupportedRouter$content$1$1$1.invokeSuspend(zy11Var);
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
        r021 r021Var = this.this$0.H;
        q021 q021Var = this.$action;
        v021 v021Var = this.$navigator;
        r021Var.getClass();
        if (jl40.l(q021Var, p021.a)) {
            v021Var.a.r(new qu(9));
            return zy11.a;
        }
        w511.b();
        return null;
    }
}
