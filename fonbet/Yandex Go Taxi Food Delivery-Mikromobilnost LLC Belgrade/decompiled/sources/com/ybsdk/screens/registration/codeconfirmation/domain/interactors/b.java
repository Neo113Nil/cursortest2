package com.ybsdk.screens.registration.codeconfirmation.domain.interactors;

import android.content.Context;
import android.os.Bundle;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.ChangePhoneEvents$ChangePhoneConfirmationCodeCheckResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.rconfig.configs.SupportEntryPointsImpl;
import com.ybsdk.screens.changephone.presentation.ChangePhoneStatusScreenParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import defpackage.c9c;
import defpackage.d6v;
import defpackage.dfr;
import defpackage.dzh0;
import defpackage.f42;
import defpackage.gjw0;
import defpackage.i9c;
import defpackage.ny61;
import defpackage.rt1;
import defpackage.tfl0;
import defpackage.ur80;
import defpackage.vqb;
import defpackage.vr80;
import defpackage.w511;
import defpackage.wls;
import defpackage.wr80;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b implements i9c {
    public final CodeConfirmationParams.ChangePhone a;
    public final com.ybsdk.screens.registration.data.a b;
    public final tfl0 c;
    public final com.ybsdk.screens.registration.a d;
    public final AppAnalyticsReporter e;
    public final Context f;
    public final com.ybsdk.rconfig.b g;

    public b(CodeConfirmationParams.ChangePhone changePhone, com.ybsdk.screens.registration.data.a aVar, tfl0 tfl0Var, com.ybsdk.screens.registration.a aVar2, AppAnalyticsReporter appAnalyticsReporter, Context context, com.ybsdk.rconfig.b bVar) {
        this.a = changePhone;
        this.b = aVar;
        this.c = tfl0Var;
        this.d = aVar2;
        this.e = appAnalyticsReporter;
        this.f = context;
        this.g = bVar;
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
        ChangePhoneCodeConfirmationInteractor$validateOtp$1 changePhoneCodeConfirmationInteractor$validateOtp$1;
        int i2;
        Object O;
        ChangePhoneEvents$ChangePhoneConfirmationCodeCheckResult changePhoneEvents$ChangePhoneConfirmationCodeCheckResult;
        Text text;
        CharSequence a;
        if (continuationImpl instanceof ChangePhoneCodeConfirmationInteractor$validateOtp$1) {
            changePhoneCodeConfirmationInteractor$validateOtp$1 = (ChangePhoneCodeConfirmationInteractor$validateOtp$1) continuationImpl;
            int i3 = changePhoneCodeConfirmationInteractor$validateOtp$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                changePhoneCodeConfirmationInteractor$validateOtp$1.label = i3 - Integer.MIN_VALUE;
                Object obj = changePhoneCodeConfirmationInteractor$validateOtp$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = changePhoneCodeConfirmationInteractor$validateOtp$1.label;
                String str2 = null;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    wls changePhoneCodeConfirmationInteractor$validateOtp$2 = new ChangePhoneCodeConfirmationInteractor$validateOtp$2(this, str, null);
                    changePhoneCodeConfirmationInteractor$validateOtp$1.I$0 = i;
                    changePhoneCodeConfirmationInteractor$validateOtp$1.label = 1;
                    O = d6vVar.O(changePhoneCodeConfirmationInteractor$validateOtp$2, str, changePhoneCodeConfirmationInteractor$validateOtp$1);
                    if (O == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = changePhoneCodeConfirmationInteractor$validateOtp$1.I$0;
                    kotlin.b.b(obj);
                    O = ((Result) obj).getValue();
                }
                if (!(O instanceof Result.Failure)) {
                    return O;
                }
                wr80 wr80Var = (wr80) O;
                boolean z = wr80Var instanceof ur80;
                if (z) {
                    changePhoneEvents$ChangePhoneConfirmationCodeCheckResult = ChangePhoneEvents$ChangePhoneConfirmationCodeCheckResult.ERROR;
                } else {
                    if (!(wr80Var instanceof vr80)) {
                        w511.b();
                        return null;
                    }
                    changePhoneEvents$ChangePhoneConfirmationCodeCheckResult = ChangePhoneEvents$ChangePhoneConfirmationCodeCheckResult.OK;
                }
                rt1 rt1Var = this.e.n;
                ur80 ur80Var = z ? (ur80) wr80Var : null;
                if (ur80Var != null && (text = ur80Var.a) != null && (a = d.a(this.f, text)) != null) {
                    str2 = a.toString();
                }
                rt1Var.k(changePhoneEvents$ChangePhoneConfirmationCodeCheckResult, str2, i);
                return O;
            }
        }
        changePhoneCodeConfirmationInteractor$validateOtp$1 = new ChangePhoneCodeConfirmationInteractor$validateOtp$1(this, continuationImpl);
        Object obj3 = changePhoneCodeConfirmationInteractor$validateOtp$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = changePhoneCodeConfirmationInteractor$validateOtp$1.label;
        String str22 = null;
        if (i2 != 0) {
        }
        if (!(O instanceof Result.Failure)) {
        }
    }

    @Override // defpackage.i9c
    public final void b(vr80 vr80Var, vqb vqbVar) {
        i(ChangePhoneStatusScreenParams.Status.INITIAL);
    }

    @Override // defpackage.i9c
    public final Text.Formatted c(OtpResponseDataEntity otpResponseDataEntity, Integer num) {
        String phone;
        com.ybsdk.rconfig.b bVar = this.g;
        if (otpResponseDataEntity == null || (phone = otpResponseDataEntity.getPhone()) == null) {
            com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
            int i = dzh0.ybsdk_change_phone_change_phone_confirmation_screen_default_subtitle;
            com.ybsdk.core.utils.text.c cVar = Text.Formatted.Arg.Companion;
            bVar.getClass();
            dfr b = gjw0.b(bVar.f);
            SupportEntryPointsImpl supportEntryPointsImpl = (SupportEntryPointsImpl) bVar.d(b).getData();
            SupportEntryPointsImpl supportEntryPointsImpl2 = (SupportEntryPointsImpl) b.c.getData();
            String changePhoneConfirmation = supportEntryPointsImpl.getChangePhoneConfirmation();
            if (changePhoneConfirmation.length() == 0) {
                changePhoneConfirmation = supportEntryPointsImpl2.getChangePhoneConfirmation();
            }
            cVar.getClass();
            Text.Formatted.Arg[] argArr = {new Text.Formatted.Arg.StringArg(changePhoneConfirmation)};
            bVar2.getClass();
            return com.ybsdk.core.utils.text.b.b(i, argArr);
        }
        com.ybsdk.core.utils.text.b bVar3 = Text.Companion;
        int i2 = dzh0.ybsdk_change_phone_change_phone_confirmation_screen_subtitle_with_link;
        Text.Formatted.Arg.Companion.getClass();
        Text.Formatted.Arg.StringArg stringArg = new Text.Formatted.Arg.StringArg(phone);
        bVar.getClass();
        dfr b2 = gjw0.b(bVar.f);
        SupportEntryPointsImpl supportEntryPointsImpl3 = (SupportEntryPointsImpl) bVar.d(b2).getData();
        SupportEntryPointsImpl supportEntryPointsImpl4 = (SupportEntryPointsImpl) b2.c.getData();
        String changePhoneConfirmation2 = supportEntryPointsImpl3.getChangePhoneConfirmation();
        if (changePhoneConfirmation2.length() == 0) {
            changePhoneConfirmation2 = supportEntryPointsImpl4.getChangePhoneConfirmation();
        }
        Text.Formatted.Arg[] argArr2 = {stringArg, new Text.Formatted.Arg.StringArg(changePhoneConfirmation2)};
        bVar3.getClass();
        return com.ybsdk.core.utils.text.b.b(i2, argArr2);
    }

    @Override // defpackage.i9c
    public final Bundle d() {
        return new Bundle();
    }

    @Override // defpackage.i9c
    public final OtpResponseDataEntity e() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.i9c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(d6v d6vVar, ContinuationImpl continuationImpl) {
        ChangePhoneCodeConfirmationInteractor$requestOtp$1 changePhoneCodeConfirmationInteractor$requestOtp$1;
        int i;
        if (continuationImpl instanceof ChangePhoneCodeConfirmationInteractor$requestOtp$1) {
            changePhoneCodeConfirmationInteractor$requestOtp$1 = (ChangePhoneCodeConfirmationInteractor$requestOtp$1) continuationImpl;
            int i2 = changePhoneCodeConfirmationInteractor$requestOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePhoneCodeConfirmationInteractor$requestOtp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePhoneCodeConfirmationInteractor$requestOtp$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePhoneCodeConfirmationInteractor$requestOtp$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object applicationId = this.a.getApplicationId();
                wls changePhoneCodeConfirmationInteractor$requestOtp$2 = new ChangePhoneCodeConfirmationInteractor$requestOtp$2(this, null);
                changePhoneCodeConfirmationInteractor$requestOtp$1.label = 1;
                Object O = d6vVar.O(changePhoneCodeConfirmationInteractor$requestOtp$2, applicationId, changePhoneCodeConfirmationInteractor$requestOtp$1);
                return O == obj2 ? obj2 : O;
            }
        }
        changePhoneCodeConfirmationInteractor$requestOtp$1 = new ChangePhoneCodeConfirmationInteractor$requestOtp$1(this, continuationImpl);
        Object obj3 = changePhoneCodeConfirmationInteractor$requestOtp$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePhoneCodeConfirmationInteractor$requestOtp$1.label;
        if (i == 0) {
        }
    }

    @Override // defpackage.i9c
    public final c9c g(AppAnalyticsReporter appAnalyticsReporter) {
        return new f42(appAnalyticsReporter, 3);
    }

    @Override // defpackage.i9c
    public final CodeConfirmationParams getParams() {
        return this.a;
    }

    @Override // defpackage.i9c
    public final boolean h() {
        return true;
    }

    public final void i(ChangePhoneStatusScreenParams.Status status) {
        CodeConfirmationParams.ChangePhone changePhone = this.a;
        this.c.j(this.d.c(changePhone.getApplicationId(), changePhone.getForceNavigateToInitialViewModelOnResult(), status));
    }
}
