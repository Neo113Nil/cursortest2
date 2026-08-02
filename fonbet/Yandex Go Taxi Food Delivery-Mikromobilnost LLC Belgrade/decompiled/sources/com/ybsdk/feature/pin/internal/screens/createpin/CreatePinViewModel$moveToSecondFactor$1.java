package com.ybsdk.feature.pin.internal.screens.createpin;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pin.api.entities.ReissueActionType;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFinishStrategy;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.dzh0;
import defpackage.lz70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.createpin.CreatePinViewModel$moveToSecondFactor$1", f = "CreatePinViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreatePinViewModel$moveToSecondFactor$1 extends SuspendLambda implements wls {
    final /* synthetic */ ReissueActionType $newActionType;
    final /* synthetic */ String $trackId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePinViewModel$moveToSecondFactor$1(ReissueActionType reissueActionType, a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$newActionType = reissueActionType;
        this.this$0 = aVar;
        this.$trackId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreatePinViewModel$moveToSecondFactor$1(this.$newActionType, this.this$0, this.$trackId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CreatePinViewModel$moveToSecondFactor$1 createPinViewModel$moveToSecondFactor$1 = (CreatePinViewModel$moveToSecondFactor$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        createPinViewModel$moveToSecondFactor$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CreatePinScreenParams createPinScreenParams;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ReissueActionType reissueActionType = this.$newActionType;
        if (reissueActionType == null || (createPinScreenParams = CreatePinScreenParams.copy$default(this.this$0.B, null, reissueActionType, null, null, false, null, null, HProv.PP_DELETE_KEYSET, null)) == null) {
            createPinScreenParams = this.this$0.B;
        }
        a aVar = this.this$0;
        tfl0 tfl0Var = aVar.J;
        lz70 lz70Var = aVar.G;
        Text.Empty empty = Text.Empty.INSTANCE;
        tfl0Var.l(com.ybsdk.screens.registration.a.e((com.ybsdk.screens.registration.a) lz70Var.b, new CodeConfirmationParams.HeaderText.ConfirmNumber(null, 1, null), this.$trackId, null, null, this.this$0.B.getShow2faLogoutButton() && this.this$0.I.a, new Integer(aVar.K.a.n().isEnabled() ? dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_account_subtitle : dzh0.ybsdk_common_pin_request_sms_phone_info_title), new CodeConfirmationFinishStrategy.CreatePin(createPinScreenParams), null, OpenScreenRequirement.WithUid.INSTANCE, true, null, 2316));
        return zy11.a;
    }
}
