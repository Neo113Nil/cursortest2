package com.yandex.go.universal_qr_scanner.domain.torch;

import defpackage.e121;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.universal_qr_scanner.domain.torch.UniversalQrScannerTorchInteractor$switchTorchEnabled$2", f = "UniversalQrScannerTorchInteractor.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UniversalQrScannerTorchInteractor$switchTorchEnabled$2 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalQrScannerTorchInteractor$switchTorchEnabled$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalQrScannerTorchInteractor$switchTorchEnabled$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalQrScannerTorchInteractor$switchTorchEnabled$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UniversalQrScannerTorchState universalQrScannerTorchState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        int i2 = e121.a[((UniversalQrScannerTorchState) this.this$0.b.a.getValue()).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                universalQrScannerTorchState = UniversalQrScannerTorchState.DISABLED;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                universalQrScannerTorchState = UniversalQrScannerTorchState.ENABLED;
            }
            ?? r1 = universalQrScannerTorchState == UniversalQrScannerTorchState.ENABLED ? 1 : 0;
            b bVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = r1;
            this.label = 1;
            if (bVar.c.b(new UniversalQrScannerTorchInteractor$enableTorchWithUpdateState$2(bVar, universalQrScannerTorchState, r1, null), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
