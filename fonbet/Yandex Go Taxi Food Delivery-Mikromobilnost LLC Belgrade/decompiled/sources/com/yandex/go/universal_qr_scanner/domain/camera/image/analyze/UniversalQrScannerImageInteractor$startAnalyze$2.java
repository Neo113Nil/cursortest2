package com.yandex.go.universal_qr_scanner.domain.camera.image.analyze;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.UniversalQrScannerImageInteractor$startAnalyze$2", f = "UniversalQrScannerImageInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UniversalQrScannerImageInteractor$startAnalyze$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.UniversalQrScannerImageInteractor$startAnalyze$2$1", f = "UniversalQrScannerImageInteractor.kt", l = {52}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.UniversalQrScannerImageInteractor$startAnalyze$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                k N = e.N(e.X(e.t(new c(this.this$0.e)), new UniversalQrScannerImageInteractor$startAnalyze$2$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, null)), 100L);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (N.collect(aVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalQrScannerImageInteractor$startAnalyze$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UniversalQrScannerImageInteractor$startAnalyze$2 universalQrScannerImageInteractor$startAnalyze$2 = new UniversalQrScannerImageInteractor$startAnalyze$2(this.this$0, continuation);
        universalQrScannerImageInteractor$startAnalyze$2.L$0 = obj;
        return universalQrScannerImageInteractor$startAnalyze$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UniversalQrScannerImageInteractor$startAnalyze$2 universalQrScannerImageInteractor$startAnalyze$2 = (UniversalQrScannerImageInteractor$startAnalyze$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        universalQrScannerImageInteractor$startAnalyze$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        dVar.a.getClass();
        dVar.f = tje.N(tseVar, uyj.a, null, new AnonymousClass1(this.this$0, null), 2);
        return zy11.a;
    }
}
