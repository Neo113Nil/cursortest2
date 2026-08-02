package com.yandex.go.universal_qr_scanner.domain.torch;

import defpackage.co7;
import defpackage.euy;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lco7;", "Lzy11;", "<anonymous>", "(Lco7;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.universal_qr_scanner.domain.torch.UniversalQrScannerTorchInteractor$enableTorchWithUpdateState$2", f = "UniversalQrScannerTorchInteractor.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UniversalQrScannerTorchInteractor$enableTorchWithUpdateState$2 extends SuspendLambda implements wls {
    final /* synthetic */ UniversalQrScannerTorchState $newTorchState;
    final /* synthetic */ boolean $torchEnabled;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalQrScannerTorchInteractor$enableTorchWithUpdateState$2(b bVar, UniversalQrScannerTorchState universalQrScannerTorchState, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$newTorchState = universalQrScannerTorchState;
        this.$torchEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UniversalQrScannerTorchInteractor$enableTorchWithUpdateState$2 universalQrScannerTorchInteractor$enableTorchWithUpdateState$2 = new UniversalQrScannerTorchInteractor$enableTorchWithUpdateState$2(this.this$0, this.$newTorchState, this.$torchEnabled, continuation);
        universalQrScannerTorchInteractor$enableTorchWithUpdateState$2.L$0 = obj;
        return universalQrScannerTorchInteractor$enableTorchWithUpdateState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalQrScannerTorchInteractor$enableTorchWithUpdateState$2) create((co7) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        co7 co7Var = (co7) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                UniversalQrScannerTorchState universalQrScannerTorchState = this.$newTorchState;
                boolean z = this.$torchEnabled;
                bVar.b.a.l(universalQrScannerTorchState);
                euy f = co7Var.b().f(z);
                this.L$0 = null;
                this.label = 1;
                if (ooc.e(f, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.j(th);
        }
        return zy11.a;
    }
}
