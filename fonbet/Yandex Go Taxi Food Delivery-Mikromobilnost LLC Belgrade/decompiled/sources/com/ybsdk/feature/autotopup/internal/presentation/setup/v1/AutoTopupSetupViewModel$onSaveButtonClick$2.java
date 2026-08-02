package com.ybsdk.feature.autotopup.internal.presentation.setup.v1;

import com.ybsdk.core.analytics.generated.delegates.CommonEvents$FullscreenNotificationShownScreen;
import defpackage.f5a0;
import defpackage.h5a0;
import defpackage.j04;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nz3;
import defpackage.nzl0;
import defpackage.pz40;
import defpackage.qz3;
import defpackage.tse;
import defpackage.vou0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupViewModel$onSaveButtonClick$2", f = "AutoTopupSetupViewModel.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupViewModel$onSaveButtonClick$2 extends SuspendLambda implements wls {
    final /* synthetic */ qz3 $autoTopupSetupEntity;
    final /* synthetic */ h5a0 $selectedPaymentMethod;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupViewModel$onSaveButtonClick$2(b bVar, qz3 qz3Var, h5a0 h5a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$autoTopupSetupEntity = qz3Var;
        this.$selectedPaymentMethod = h5a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupSetupViewModel$onSaveButtonClick$2(this.this$0, this.$autoTopupSetupEntity, this.$selectedPaymentMethod, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupViewModel$onSaveButtonClick$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b0;
        nz3 nz3Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            qz3 qz3Var = this.$autoTopupSetupEntity;
            h5a0 h5a0Var = this.$selectedPaymentMethod;
            this.label = 1;
            b0 = b.b0(bVar, qz3Var, h5a0Var, this);
            if (b0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b0 = obj;
        }
        nzl0 nzl0Var = (nzl0) b0;
        zy11 zy11Var = zy11.a;
        if (nzl0Var == null) {
            return zy11Var;
        }
        qz3 qz3Var2 = (qz3) ((j04) this.this$0.X()).a.a();
        vou0 vou0Var = (qz3Var2 == null || (nz3Var = qz3Var2.h) == null) ? null : nz3Var.b.a;
        if (vou0Var == null || (this.$selectedPaymentMethod instanceof f5a0)) {
            this.this$0.U0(null);
            return zy11Var;
        }
        this.this$0.O.a.o.h(CommonEvents$FullscreenNotificationShownScreen.AUTOTOPUP, vou0Var.c, null, null, null, null, null, null);
        pz40 Y = this.this$0.Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            vou0 vou0Var2 = vou0Var;
            if (r0Var.k(value, j04.a((j04) value, null, false, null, null, null, null, null, null, null, null, null, null, null, vou0Var2, null, null, 245755))) {
                this.this$0.I.a.e.a.a("auto_topup.binding.show_instruction", null);
                return zy11Var;
            }
            vou0Var = vou0Var2;
        }
    }
}
