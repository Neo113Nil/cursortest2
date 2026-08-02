package com.ybsdk.screens.registration.codeconfirmation.domain.interactors;

import android.content.Context;
import android.os.Bundle;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.api.pro.entities.RegistrationType$OngoingOperation;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationPhoneConfirmationCodeCheckResult;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusFragment;
import com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusScreenParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import com.ybsdk.screens.registration.domain.RegistrationPhone;
import defpackage.c9c;
import defpackage.d6v;
import defpackage.f42;
import defpackage.hri0;
import defpackage.i9c;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tfl0;
import defpackage.ur80;
import defpackage.vqb;
import defpackage.vr80;
import defpackage.w511;
import defpackage.wlp;
import defpackage.wls;
import defpackage.wr80;
import defpackage.xi91;
import defpackage.z94;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c implements i9c {
    public final CodeConfirmationParams.Registration a;
    public final com.ybsdk.screens.registration.data.c b;
    public final tfl0 c;
    public final AppAnalyticsReporter d;
    public final Context e;
    public final com.ybsdk.screens.registration.a f;

    public c(CodeConfirmationParams.Registration registration, com.ybsdk.screens.registration.data.c cVar, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, Context context, com.ybsdk.screens.registration.a aVar) {
        this.a = registration;
        this.b = cVar;
        this.c = tfl0Var;
        this.d = appAnalyticsReporter;
        this.e = context;
        this.f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.i9c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, int i, d6v d6vVar, ContinuationImpl continuationImpl) {
        RegistrationCodeConfirmationInteractor$validateOtp$1 registrationCodeConfirmationInteractor$validateOtp$1;
        int i2;
        Object O;
        RegistrationEvents$RegistrationPhoneConfirmationCodeCheckResult registrationEvents$RegistrationPhoneConfirmationCodeCheckResult;
        Text text;
        CharSequence a;
        if (continuationImpl instanceof RegistrationCodeConfirmationInteractor$validateOtp$1) {
            registrationCodeConfirmationInteractor$validateOtp$1 = (RegistrationCodeConfirmationInteractor$validateOtp$1) continuationImpl;
            int i3 = registrationCodeConfirmationInteractor$validateOtp$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                registrationCodeConfirmationInteractor$validateOtp$1.label = i3 - Integer.MIN_VALUE;
                Object obj = registrationCodeConfirmationInteractor$validateOtp$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = registrationCodeConfirmationInteractor$validateOtp$1.label;
                String str2 = null;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    wls registrationCodeConfirmationInteractor$validateOtp$2 = new RegistrationCodeConfirmationInteractor$validateOtp$2(this, str, null);
                    registrationCodeConfirmationInteractor$validateOtp$1.I$0 = i;
                    registrationCodeConfirmationInteractor$validateOtp$1.label = 1;
                    O = d6vVar.O(registrationCodeConfirmationInteractor$validateOtp$2, str, registrationCodeConfirmationInteractor$validateOtp$1);
                    if (O == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = registrationCodeConfirmationInteractor$validateOtp$1.I$0;
                    kotlin.b.b(obj);
                    O = ((Result) obj).getValue();
                }
                if (!(O instanceof Result.Failure)) {
                    return O;
                }
                wr80 wr80Var = (wr80) O;
                boolean z = wr80Var instanceof ur80;
                if (z) {
                    registrationEvents$RegistrationPhoneConfirmationCodeCheckResult = RegistrationEvents$RegistrationPhoneConfirmationCodeCheckResult.ERROR;
                } else {
                    if (!(wr80Var instanceof vr80)) {
                        w511.b();
                        return null;
                    }
                    registrationEvents$RegistrationPhoneConfirmationCodeCheckResult = RegistrationEvents$RegistrationPhoneConfirmationCodeCheckResult.OK;
                }
                z94 z94Var = this.d.b0;
                ur80 ur80Var = z ? (ur80) wr80Var : null;
                if (ur80Var != null && (text = ur80Var.a) != null && (a = d.a(this.e, text)) != null) {
                    str2 = a.toString();
                }
                z94Var.t(registrationEvents$RegistrationPhoneConfirmationCodeCheckResult, str2, i);
                return O;
            }
        }
        registrationCodeConfirmationInteractor$validateOtp$1 = new RegistrationCodeConfirmationInteractor$validateOtp$1(this, continuationImpl);
        Object obj3 = registrationCodeConfirmationInteractor$validateOtp$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = registrationCodeConfirmationInteractor$validateOtp$1.label;
        String str22 = null;
        if (i2 != 0) {
        }
        if (!(O instanceof Result.Failure)) {
        }
    }

    @Override // defpackage.i9c
    public final void b(vr80 vr80Var, vqb vqbVar) {
        CodeConfirmationParams.Registration registration = this.a;
        YBProduct product = registration.getProduct();
        String applicationId = registration.getApplicationId();
        RegistrationType$OngoingOperation ongoingOperation = registration.getOngoingOperation();
        String registrationDeeplink = registration.getRegistrationDeeplink();
        com.ybsdk.screens.registration.a aVar = this.f;
        hri0 hri0Var = aVar.b;
        com.ybsdk.rconfig.b bVar = aVar.e;
        bVar.getClass();
        RegistrationApplicationStatusScreenParams.StatusPolling statusPolling = new RegistrationApplicationStatusScreenParams.StatusPolling(applicationId, ((CommonFeatureFlag) bVar.d(wlp.K0).getData()).isEnabled(), ongoingOperation, product, registrationDeeplink);
        hri0Var.getClass();
        this.c.j(new FragmentScreen("RegistrationApplicationStatusScreen", false, statusPolling, null, qoi0.a(RegistrationApplicationStatusFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null));
    }

    @Override // defpackage.i9c
    public final Text.Formatted c(OtpResponseDataEntity otpResponseDataEntity, Integer num) {
        CodeConfirmationParams.Registration registration = this.a;
        String phone = registration.getPhone().getPhone();
        String maskedPhone = registration.getPhone().getMaskedPhone();
        int intValue = num.intValue();
        if (phone != null) {
            com.ybsdk.core.utils.text.b bVar = Text.Companion;
            com.ybsdk.core.utils.text.c cVar = Text.Formatted.Arg.Companion;
            String c = xi91.c(phone);
            cVar.getClass();
            Text.Formatted.Arg[] argArr = {new Text.Formatted.Arg.StringArg(c)};
            bVar.getClass();
            return com.ybsdk.core.utils.text.b.b(intValue, argArr);
        }
        if (maskedPhone == null) {
            return null;
        }
        com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
        com.ybsdk.core.utils.text.c cVar2 = Text.Formatted.Arg.Companion;
        String c2 = xi91.c(maskedPhone);
        cVar2.getClass();
        Text.Formatted.Arg[] argArr2 = {new Text.Formatted.Arg.StringArg(c2)};
        bVar2.getClass();
        return com.ybsdk.core.utils.text.b.b(intValue, argArr2);
    }

    @Override // defpackage.i9c
    public final Bundle d() {
        return new Bundle();
    }

    @Override // defpackage.i9c
    public final OtpResponseDataEntity e() {
        return this.a.getOtpRequestEntity();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.i9c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(d6v d6vVar, ContinuationImpl continuationImpl) {
        RegistrationCodeConfirmationInteractor$requestOtp$1 registrationCodeConfirmationInteractor$requestOtp$1;
        int i;
        if (continuationImpl instanceof RegistrationCodeConfirmationInteractor$requestOtp$1) {
            registrationCodeConfirmationInteractor$requestOtp$1 = (RegistrationCodeConfirmationInteractor$requestOtp$1) continuationImpl;
            int i2 = registrationCodeConfirmationInteractor$requestOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                registrationCodeConfirmationInteractor$requestOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = registrationCodeConfirmationInteractor$requestOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = registrationCodeConfirmationInteractor$requestOtp$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CodeConfirmationParams.Registration registration = this.a;
                String applicationId = registration.getApplicationId();
                RegistrationPhone phone = registration.getPhone();
                registrationCodeConfirmationInteractor$requestOtp$1.label = 1;
                Object a = this.b.a(applicationId, phone, registrationCodeConfirmationInteractor$requestOtp$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        registrationCodeConfirmationInteractor$requestOtp$1 = new RegistrationCodeConfirmationInteractor$requestOtp$1(this, continuationImpl);
        Object obj2 = registrationCodeConfirmationInteractor$requestOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = registrationCodeConfirmationInteractor$requestOtp$1.label;
        if (i == 0) {
        }
    }

    @Override // defpackage.i9c
    public final c9c g(AppAnalyticsReporter appAnalyticsReporter) {
        return new f42(appAnalyticsReporter, 10);
    }

    @Override // defpackage.i9c
    public final CodeConfirmationParams getParams() {
        return this.a;
    }

    @Override // defpackage.i9c
    public final boolean h() {
        return true;
    }
}
