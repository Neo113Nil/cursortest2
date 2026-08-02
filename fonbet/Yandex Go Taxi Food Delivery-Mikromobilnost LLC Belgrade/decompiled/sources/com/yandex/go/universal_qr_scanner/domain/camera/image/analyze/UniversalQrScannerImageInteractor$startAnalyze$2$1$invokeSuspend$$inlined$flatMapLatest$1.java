package com.yandex.go.universal_qr_scanner.domain.camera.image.analyze;

import androidx.camera.core.f;
import defpackage.di9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wz11;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.UniversalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$flatMapLatest$1", f = "UniversalQrScannerImageInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class UniversalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$flatMapLatest$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UniversalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$flatMapLatest$1 universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$flatMapLatest$1 = new UniversalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return universalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr di9Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            d dVar = this.this$0;
            if (booleanValue) {
                ((f) dVar.d.e.getValue()).H();
                di9Var = pvn.a;
            } else {
                wz11 wz11Var = dVar.d;
                ((f) wz11Var.e.getValue()).N((ExecutorService) wz11Var.f.getValue(), wz11Var.b);
                di9Var = new di9(this.this$0.c.a);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(di9Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
