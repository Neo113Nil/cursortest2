package com.yandex.go.diagnostic_qr;

import com.yandex.go.diagnostic_qr.experiment.QrDiagnosticExperiment;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.x6g0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.diagnostic_qr.QrDiagnosticDataInteractorImpl$screenCaptured$1", f = "QrDiagnosticDataInteractorImpl.kt", l = {28, 31}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class QrDiagnosticDataInteractorImpl$screenCaptured$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $type;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrDiagnosticDataInteractorImpl$screenCaptured$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$type = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrDiagnosticDataInteractorImpl$screenCaptured$1(this.this$0, this.$type, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrDiagnosticDataInteractorImpl$screenCaptured$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (com.yandex.go.diagnostic_qr.a.a(r6, r1, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            unr0.C(new Object[]{th}, 1, "screen capture event log failed", jst.e);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            x6g0 x6g0Var = this.this$0.b;
            this.label = 1;
            obj = x6g0Var.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        if (((QrDiagnosticExperiment) obj).b) {
            a aVar = this.this$0;
            String str = this.$type;
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
