package com.ybsdk.feature.autotopup.internal.domain;

import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupPaymentStatusEntity;
import defpackage.bqg;
import defpackage.c04;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldqg;", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusEntity;", "", "<anonymous>", "(Ldqg;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.domain.AutoTopupSetupInteractor$getAutotopupPaymentStatus$2", f = "AutoTopupSetupInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupInteractor$getAutotopupPaymentStatus$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupInteractor$getAutotopupPaymentStatus$2 autoTopupSetupInteractor$getAutotopupPaymentStatus$2 = new AutoTopupSetupInteractor$getAutotopupPaymentStatus$2(2, continuation);
        autoTopupSetupInteractor$getAutotopupPaymentStatus$2.L$0 = obj;
        return autoTopupSetupInteractor$getAutotopupPaymentStatus$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupInteractor$getAutotopupPaymentStatus$2) create((dqg) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (((com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupPaymentStatusEntity) r3).getResultData() != null) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        dqg dqgVar = (dqg) this.L$0;
        boolean z = true;
        if (dqgVar instanceof cqg) {
            Object obj2 = ((cqg) dqgVar).a;
            int i = c04.a[((AutotopupPaymentStatusEntity) obj2).getStatus().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    w511.b();
                    return null;
                }
            }
            z = false;
        } else if (!(dqgVar instanceof bqg)) {
            w511.b();
            return null;
        }
        return Boolean.valueOf(z);
    }
}
