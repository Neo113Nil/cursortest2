package com.ybsdk.screens.registration.codeconfirmation.presentation;

import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import defpackage.gao;
import defpackage.i9c;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.r9c;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationViewModel$requestOtp$2", f = "CodeConfirmationViewModel.kt", l = {IDialogId.DIALOG_PIN_WND_IDD_PASSWORD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CodeConfirmationViewModel$requestOtp$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeConfirmationViewModel$requestOtp$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CodeConfirmationViewModel$requestOtp$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CodeConfirmationViewModel$requestOtp$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        r0 r0Var;
        Object value;
        Text.Resource a;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            i9c i9cVar = cVar.C;
            this.label = 1;
            Object f = i9cVar.f(cVar, this);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = f;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        c cVar2 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            OtpResponseDataEntity otpResponseDataEntity = (OtpResponseDataEntity) obj2;
            cVar2.E.b();
            cVar2.K.p(true);
            pz40 Y = cVar2.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, a.a((a) value2, new r8j0(otpResponseDataEntity, null, 14), System.currentTimeMillis(), 0L, 0, null, null, null, otpResponseDataEntity.getNoAttemptsLeft(), CodeConfirmationViewState$CodeState.DEFAULT, 4071)));
            if (otpResponseDataEntity.getNoAttemptsLeft()) {
                c.b0(cVar2, CodeConfirmationViewState$CodeState.ERROR);
            } else {
                Text.Resource a2 = b.a((a) cVar2.X());
                if (a2 != null) {
                    cVar2.Z(new r9c(new n0t0(a2, Text.Empty.INSTANCE)));
                }
            }
        }
        c cVar3 = this.this$0;
        Throwable a3 = Result.a(obj2);
        zy11 zy11Var = zy11.a;
        if (a3 != null) {
            x4c.g("Exception while requestOtp() in CodeConfirmationViewModel", a3, null, null, 12);
            cVar3.K.p(false);
            pz40 Y2 = cVar3.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, a.a((a) value, new s8j0(a3), 0L, 0L, 0, null, null, null, false, null, 16375)));
            if ((!(cVar3.C.getParams() instanceof CodeConfirmationParams.ChangePhone) || !(a3 instanceof FailDataException)) && (a = b.a((a) cVar3.X())) != null) {
                cVar3.Z(new r9c(gao.d(a, Text.Empty.INSTANCE, a3)));
            }
        }
        return zy11Var;
    }
}
