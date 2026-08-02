package com.ybsdk.screens.registration.codeconfirmation.domain.interactors;

import android.os.Bundle;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.utils.d;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinFragment;
import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinScreenParams;
import com.ybsdk.network.CorpCardPciDssApi;
import com.ybsdk.rconfig.configs.SupportEntryPointsImpl;
import com.ybsdk.screens.initial.InitialFragmentScreenParams;
import com.ybsdk.screens.registration.RegistrationFeature$Result;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFinishStrategy;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationTarget;
import com.ybsdk.screens.registration.data.auth.MkkCashout2faApi;
import com.ybsdk.screens.registration.data.auth.e;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import defpackage.ari0;
import defpackage.c9c;
import defpackage.d6v;
import defpackage.dfr;
import defpackage.gjw0;
import defpackage.i9c;
import defpackage.jl40;
import defpackage.ln3;
import defpackage.mn3;
import defpackage.nvd;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tfl0;
import defpackage.us3;
import defpackage.vqb;
import defpackage.vr80;
import defpackage.w511;
import defpackage.ycp0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements i9c {
    public final CodeConfirmationParams.Authorization a;
    public final DeviceIdProvider b;
    public final tfl0 c;
    public final com.ybsdk.feature.pin.internal.a d;
    public final nvd e;
    public final com.ybsdk.rconfig.b f;
    public final com.ybsdk.screens.initial.a g;
    public final ln3 h;
    public final boolean i;

    public a(CodeConfirmationParams.Authorization authorization, mn3 mn3Var, DeviceIdProvider deviceIdProvider, tfl0 tfl0Var, com.ybsdk.feature.pin.internal.a aVar, nvd nvdVar, com.ybsdk.rconfig.b bVar, com.ybsdk.screens.initial.a aVar2) {
        ln3 bVar2;
        this.a = authorization;
        this.b = deviceIdProvider;
        this.c = tfl0Var;
        this.d = aVar;
        this.e = nvdVar;
        this.f = bVar;
        this.g = aVar2;
        CodeConfirmationTarget confirmationTarget = authorization.getConfirmationTarget();
        ari0 ari0Var = (ari0) mn3Var;
        if (confirmationTarget.equals(CodeConfirmationTarget.YbAuthorization.INSTANCE)) {
            bVar2 = new e(ari0Var.a);
        } else if (confirmationTarget.equals(CodeConfirmationTarget.CorpCardAuthorization.INSTANCE)) {
            bVar2 = new com.ybsdk.screens.registration.data.auth.a((CorpCardPciDssApi) ari0Var.b.get());
        } else {
            if (!confirmationTarget.equals(CodeConfirmationTarget.MkkCashoutAuthorization.INSTANCE)) {
                w511.b();
                throw null;
            }
            bVar2 = new com.ybsdk.screens.registration.data.auth.b((MkkCashout2faApi) ari0Var.c.get());
        }
        this.h = bVar2;
        this.i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.i9c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, int i, d6v d6vVar, ContinuationImpl continuationImpl) {
        AuthorizationCodeConfirmationInteractor$validateOtp$1 authorizationCodeConfirmationInteractor$validateOtp$1;
        int i2;
        if (continuationImpl instanceof AuthorizationCodeConfirmationInteractor$validateOtp$1) {
            authorizationCodeConfirmationInteractor$validateOtp$1 = (AuthorizationCodeConfirmationInteractor$validateOtp$1) continuationImpl;
            int i3 = authorizationCodeConfirmationInteractor$validateOtp$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                authorizationCodeConfirmationInteractor$validateOtp$1.label = i3 - Integer.MIN_VALUE;
                Object obj = authorizationCodeConfirmationInteractor$validateOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = authorizationCodeConfirmationInteractor$validateOtp$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                String trackId = this.a.getTrackId();
                authorizationCodeConfirmationInteractor$validateOtp$1.label = 1;
                Object b = this.h.b(trackId, str, authorizationCodeConfirmationInteractor$validateOtp$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        authorizationCodeConfirmationInteractor$validateOtp$1 = new AuthorizationCodeConfirmationInteractor$validateOtp$1(this, continuationImpl);
        Object obj2 = authorizationCodeConfirmationInteractor$validateOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = authorizationCodeConfirmationInteractor$validateOtp$1.label;
        if (i2 == 0) {
        }
    }

    @Override // defpackage.i9c
    public final void b(vr80 vr80Var, vqb vqbVar) {
        String str = vr80Var.a;
        if (str == null) {
            ny61.r("Don't call onValidationSuccess with empty verification token");
            return;
        }
        CodeConfirmationFinishStrategy finishStrategy = this.a.getFinishStrategy();
        if (jl40.l(finishStrategy, CodeConfirmationFinishStrategy.None.INSTANCE)) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(TarifficatorScenarioActivity.RESULT_KEY, new RegistrationFeature$Result.VerificationToken(str));
            vqbVar.invoke(bundle);
            return;
        }
        boolean z = finishStrategy instanceof CodeConfirmationFinishStrategy.CreatePin;
        tfl0 tfl0Var = this.c;
        if (z) {
            CreatePinScreenParams copy$default = CreatePinScreenParams.copy$default(((CodeConfirmationFinishStrategy.CreatePin) finishStrategy).getScreenParams(), null, null, null, null, false, vr80Var.a, null, 95, null);
            ycp0 ycp0Var = this.d.b;
            tfl0Var.l(new FragmentScreen(CreatePinFragment.SCREEN_KEY, false, copy$default, null, qoi0.a(CreatePinFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null));
            return;
        }
        if (jl40.l(finishStrategy, CodeConfirmationFinishStrategy.Initial.INSTANCE)) {
            InitialFragmentScreenParams.VerificationToken verificationToken = new InitialFragmentScreenParams.VerificationToken(str);
            this.g.getClass();
            tfl0Var.l(com.ybsdk.screens.initial.a.b(verificationToken));
        } else if (!jl40.l(finishStrategy, CodeConfirmationFinishStrategy.StandAlone.INSTANCE)) {
            w511.b();
        } else {
            this.e.k(str);
            tfl0Var.e();
        }
    }

    @Override // defpackage.i9c
    public final Text.Formatted c(OtpResponseDataEntity otpResponseDataEntity, Integer num) {
        String phone;
        Text.Formatted formatted;
        String phone2;
        Integer message = this.a.getMessage();
        if (message != null) {
            int intValue = message.intValue();
            if (otpResponseDataEntity == null || (phone2 = otpResponseDataEntity.getPhone()) == null) {
                formatted = null;
            } else {
                com.ybsdk.rconfig.b bVar = this.f;
                if (bVar.n().isEnabled()) {
                    com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
                    Text.Formatted.Arg.Companion.getClass();
                    Text.Formatted.Arg.StringArg stringArg = new Text.Formatted.Arg.StringArg(phone2);
                    dfr b = gjw0.b(bVar.f);
                    SupportEntryPointsImpl supportEntryPointsImpl = (SupportEntryPointsImpl) bVar.d(b).getData();
                    SupportEntryPointsImpl supportEntryPointsImpl2 = (SupportEntryPointsImpl) b.c.getData();
                    String accountAuthorizationConfirmation = supportEntryPointsImpl.getAccountAuthorizationConfirmation();
                    if (accountAuthorizationConfirmation.length() == 0) {
                        accountAuthorizationConfirmation = supportEntryPointsImpl2.getAccountAuthorizationConfirmation();
                    }
                    Text.Formatted.Arg[] argArr = {stringArg, new Text.Formatted.Arg.StringArg(accountAuthorizationConfirmation)};
                    bVar2.getClass();
                    formatted = com.ybsdk.core.utils.text.b.b(intValue, argArr);
                } else {
                    com.ybsdk.core.utils.text.b bVar3 = Text.Companion;
                    int intValue2 = num.intValue();
                    Text.Formatted.Arg.Companion.getClass();
                    Text.Formatted.Arg[] argArr2 = {new Text.Formatted.Arg.StringArg(phone2)};
                    bVar3.getClass();
                    formatted = com.ybsdk.core.utils.text.b.b(intValue2, argArr2);
                }
            }
            if (formatted != null) {
                return formatted;
            }
        }
        if (otpResponseDataEntity == null || (phone = otpResponseDataEntity.getPhone()) == null) {
            return null;
        }
        com.ybsdk.core.utils.text.b bVar4 = Text.Companion;
        int intValue3 = num.intValue();
        Text.Formatted.Arg.Companion.getClass();
        Text.Formatted.Arg[] argArr3 = {new Text.Formatted.Arg.StringArg(phone)};
        bVar4.getClass();
        return com.ybsdk.core.utils.text.b.b(intValue3, argArr3);
    }

    @Override // defpackage.i9c
    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(TarifficatorScenarioActivity.RESULT_KEY, RegistrationFeature$Result.Cancel.INSTANCE);
        return bundle;
    }

    @Override // defpackage.i9c
    public final OtpResponseDataEntity e() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.i9c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(d6v d6vVar, ContinuationImpl continuationImpl) {
        AuthorizationCodeConfirmationInteractor$requestOtp$1 authorizationCodeConfirmationInteractor$requestOtp$1;
        int i;
        if (continuationImpl instanceof AuthorizationCodeConfirmationInteractor$requestOtp$1) {
            authorizationCodeConfirmationInteractor$requestOtp$1 = (AuthorizationCodeConfirmationInteractor$requestOtp$1) continuationImpl;
            int i2 = authorizationCodeConfirmationInteractor$requestOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizationCodeConfirmationInteractor$requestOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizationCodeConfirmationInteractor$requestOtp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizationCodeConfirmationInteractor$requestOtp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    authorizationCodeConfirmationInteractor$requestOtp$1.L$0 = d6vVar;
                    authorizationCodeConfirmationInteractor$requestOtp$1.label = 1;
                    obj = this.b.d(authorizationCodeConfirmationInteractor$requestOtp$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d6vVar = (d6v) authorizationCodeConfirmationInteractor$requestOtp$1.L$0;
                    kotlin.b.b(obj);
                }
                AuthorizationCodeConfirmationInteractor$requestOtp$2 authorizationCodeConfirmationInteractor$requestOtp$2 = new AuthorizationCodeConfirmationInteractor$requestOtp$2(this, (String) obj, null);
                authorizationCodeConfirmationInteractor$requestOtp$1.L$0 = null;
                authorizationCodeConfirmationInteractor$requestOtp$1.label = 2;
                Object a = d.a(d6vVar, authorizationCodeConfirmationInteractor$requestOtp$2, authorizationCodeConfirmationInteractor$requestOtp$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        authorizationCodeConfirmationInteractor$requestOtp$1 = new AuthorizationCodeConfirmationInteractor$requestOtp$1(this, continuationImpl);
        Object obj2 = authorizationCodeConfirmationInteractor$requestOtp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizationCodeConfirmationInteractor$requestOtp$1.label;
        if (i != 0) {
        }
        AuthorizationCodeConfirmationInteractor$requestOtp$2 authorizationCodeConfirmationInteractor$requestOtp$22 = new AuthorizationCodeConfirmationInteractor$requestOtp$2(this, (String) obj2, null);
        authorizationCodeConfirmationInteractor$requestOtp$1.L$0 = null;
        authorizationCodeConfirmationInteractor$requestOtp$1.label = 2;
        Object a2 = d.a(d6vVar, authorizationCodeConfirmationInteractor$requestOtp$22, authorizationCodeConfirmationInteractor$requestOtp$1);
        if (a2 != coroutineSingletons2) {
        }
    }

    @Override // defpackage.i9c
    public final c9c g(AppAnalyticsReporter appAnalyticsReporter) {
        return new us3(appAnalyticsReporter);
    }

    @Override // defpackage.i9c
    public final CodeConfirmationParams getParams() {
        return this.a;
    }

    @Override // defpackage.i9c
    public final boolean h() {
        return this.i;
    }
}
