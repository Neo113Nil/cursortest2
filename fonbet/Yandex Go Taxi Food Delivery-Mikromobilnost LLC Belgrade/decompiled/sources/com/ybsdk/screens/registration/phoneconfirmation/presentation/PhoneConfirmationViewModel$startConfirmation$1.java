package com.ybsdk.screens.registration.phoneconfirmation.presentation;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationPhoneCheckLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationPhoneConfirmationCodeSendResult;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import com.ybsdk.screens.registration.domain.RegistrationPhone;
import defpackage.dzh0;
import defpackage.geb0;
import defpackage.heb0;
import defpackage.hri0;
import defpackage.meb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.z94;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationViewModel$startConfirmation$1", f = "PhoneConfirmationViewModel.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PhoneConfirmationViewModel$startConfirmation$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ RegistrationPhone $targetPhoneNumber;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneConfirmationViewModel$startConfirmation$1(a aVar, String str, RegistrationPhone registrationPhone, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$applicationId = str;
        this.$targetPhoneNumber = registrationPhone;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhoneConfirmationViewModel$startConfirmation$1(this.this$0, this.$applicationId, this.$targetPhoneNumber, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhoneConfirmationViewModel$startConfirmation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x014c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object obj2;
        geb0 geb0Var;
        Throwable a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        heb0 heb0Var;
        Text hint;
        CharSequence a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, heb0.a((heb0) value, null, new t8j0(), null, false, null, false, 253)));
            com.ybsdk.screens.registration.phoneconfirmation.domain.interactors.a aVar = this.this$0.C;
            String str2 = this.$applicationId;
            RegistrationPhone registrationPhone = this.$targetPhoneNumber;
            this.label = 1;
            Object a3 = aVar.a(str2, registrationPhone, this);
            if (a3 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = a3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        String str3 = this.$applicationId;
        RegistrationPhone registrationPhone2 = this.$targetPhoneNumber;
        boolean z = obj2 instanceof Result.Failure;
        geb0 geb0Var2 = geb0.a;
        if (!z) {
            OtpResponseDataEntity otpResponseDataEntity = (OtpResponseDataEntity) obj2;
            AppAnalyticsReporter appAnalyticsReporter = aVar2.F;
            PhoneConfirmationParams phoneConfirmationParams = aVar2.B;
            int i2 = meb0.a[otpResponseDataEntity.getStatus().ordinal()];
            if (i2 == 1) {
                appAnalyticsReporter.b0.s(RegistrationEvents$RegistrationPhoneCheckLoadedResult.OK, null);
                z94 z94Var = appAnalyticsReporter.b0;
                RegistrationEvents$RegistrationPhoneConfirmationCodeSendResult registrationEvents$RegistrationPhoneConfirmationCodeSendResult = RegistrationEvents$RegistrationPhoneConfirmationCodeSendResult.OK;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, registrationEvents$RegistrationPhoneConfirmationCodeSendResult.getOriginalValue());
                z94Var.a.a("registration.phone.confirmation_code.send", linkedHashMap);
                hri0 hri0Var = aVar2.G;
                geb0Var = geb0Var2;
                CodeConfirmationParams.Registration registration = new CodeConfirmationParams.Registration(str3, registrationPhone2, otpResponseDataEntity, phoneConfirmationParams.getStandAloneRegistration(), phoneConfirmationParams.getProduct(), phoneConfirmationParams.getOngoingOperation(), null, phoneConfirmationParams.getRegistrationDeeplink(), 64, null);
                OpenScreenRequirement.WithUid withUid = OpenScreenRequirement.WithUid.INSTANCE;
                hri0Var.getClass();
                FragmentScreen a4 = hri0.a(registration, withUid);
                boolean z2 = registrationPhone2 instanceof RegistrationPhone.PredefinedPhoneEntity;
                tfl0 tfl0Var = aVar2.I;
                if (z2) {
                    tfl0Var.l(a4);
                } else {
                    tfl0Var.h(a4);
                }
                pz40 Y2 = aVar2.Y();
                do {
                    r0Var3 = (r0) Y2;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, heb0.a((heb0) value3, null, null, null, false, null, false, 252)));
                a aVar3 = this.this$0;
                a = Result.a(obj2);
                if (a != null) {
                    aVar3.F.b0.s(RegistrationEvents$RegistrationPhoneCheckLoadedResult.ERROR, a.getMessage());
                    pz40 Y3 = aVar3.Y();
                    do {
                        r0Var2 = (r0) Y3;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, heb0.a((heb0) value2, null, null, unr0.h(Text.Companion, dzh0.ybsdk_card_card_error_title), false, null, false, HProv.PP_NK_SYNC)));
                    aVar3.Z(geb0Var);
                }
                return zy11.a;
            }
            if (i2 != 2) {
                w511.b();
                return null;
            }
            z94 z94Var2 = appAnalyticsReporter.b0;
            RegistrationEvents$RegistrationPhoneCheckLoadedResult registrationEvents$RegistrationPhoneCheckLoadedResult = RegistrationEvents$RegistrationPhoneCheckLoadedResult.ERROR;
            Text hint2 = otpResponseDataEntity.getHint();
            if (hint2 != null && (a2 = d.a(aVar2.H, hint2)) != null) {
                str = a2.toString();
            }
            z94Var2.s(registrationEvents$RegistrationPhoneCheckLoadedResult, str);
            pz40 Y4 = aVar2.Y();
            do {
                r0Var4 = (r0) Y4;
                value4 = r0Var4.getValue();
                heb0Var = (heb0) value4;
                hint = otpResponseDataEntity.getHint();
                if (hint == null) {
                    hint = unr0.h(Text.Companion, dzh0.ybsdk_card_card_error_title);
                }
            } while (!r0Var4.k(value4, heb0.a(heb0Var, null, null, hint, false, null, false, HProv.PP_NK_SYNC)));
            aVar2.Z(geb0Var2);
        }
        geb0Var = geb0Var2;
        a aVar32 = this.this$0;
        a = Result.a(obj2);
        if (a != null) {
        }
        return zy11.a;
    }
}
