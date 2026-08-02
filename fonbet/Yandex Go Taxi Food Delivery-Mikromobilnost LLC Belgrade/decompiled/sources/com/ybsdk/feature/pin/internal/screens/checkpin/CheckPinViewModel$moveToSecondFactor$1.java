package com.ybsdk.feature.pin.internal.screens.checkpin;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFinishStrategy;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.dzh0;
import defpackage.khb;
import defpackage.lz70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.phb;
import defpackage.pz40;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel$moveToSecondFactor$1", f = "CheckPinViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckPinViewModel$moveToSecondFactor$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $forgetPinTrackId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$moveToSecondFactor$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$forgetPinTrackId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckPinViewModel$moveToSecondFactor$1(this.this$0, this.$forgetPinTrackId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CheckPinViewModel$moveToSecondFactor$1 checkPinViewModel$moveToSecondFactor$1 = (CheckPinViewModel$moveToSecondFactor$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        checkPinViewModel$moveToSecondFactor$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, phb.a((phb) value, false, false, null, null, khb.d, null, null, null, false, null, 4031)));
        b bVar = this.this$0;
        tfl0 tfl0Var = bVar.N;
        lz70 lz70Var = bVar.H;
        Text.Empty empty = Text.Empty.INSTANCE;
        tfl0Var.h(com.ybsdk.screens.registration.a.e((com.ybsdk.screens.registration.a) lz70Var.b, new CodeConfirmationParams.HeaderText.ConfirmNumber(null, 1, null), this.$forgetPinTrackId, null, null, ((phb) this.this$0.X()).i != null, this.this$0.L.a.n().isEnabled() ? new Integer(dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_account_subtitle) : null, CodeConfirmationFinishStrategy.None.INSTANCE, null, OpenScreenRequirement.WithUid.INSTANCE, false, null, 2316));
        return zy11.a;
    }
}
