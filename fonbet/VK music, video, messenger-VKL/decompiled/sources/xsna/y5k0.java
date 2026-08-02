package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.ValidateAccountRoutingData;
import com.vk.auth.smartflow.api.data.AdditionalVerificationMethods;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.superapp.api.analytics.RegistrationStatFlowType;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SmartflowInValidateAccountRouter.kt */
/* loaded from: classes.dex */
public final class y5k0 {
    public final f71 a;
    public final Context b;

    /* compiled from: SmartflowInValidateAccountRouter.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMethodTypes.values().length];
            try {
                iArr[VerificationMethodTypes.PASSKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationMethodTypes.PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationMethodTypes.CALLRESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationMethodTypes.CODEGEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VerificationMethodTypes.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VerificationMethodTypes.PUSH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VerificationMethodTypes.SMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VerificationMethodTypes.MAX_MESSENGER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VerificationMethodTypes.MAX_OTP_CODE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VerificationMethodTypes.OFFICIAL_MESSENGER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VerificationMethodTypes.RESERVE_CODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y5k0(f71 f71Var, Context context) {
        this.a = f71Var;
        this.b = context;
    }

    public static void b(y5k0 y5k0Var, r25 r25Var) {
        y5k0Var.getClass();
        RegistrationStatParamsFactory.a = RegistrationStatFlowType.TG_FLOW;
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.j();
        n3z.a(r25Var.a());
        f71 f71Var = y5k0Var.a;
        VkEmailForwardingConfig vkEmailForwardingConfig = null;
        ValidateAccountRoutingData.Credentials credentials = r25Var.b() != null ? new ValidateAccountRoutingData.Credentials(r25Var.b()) : null;
        VerificationMethodState a2 = a6k0.a(r25Var.d().f());
        if (!(a2 instanceof VerificationMethodTypes)) {
            if (a2 == AdditionalVerificationMethods.LIBVERIFY) {
                if (r25Var.d().a() == null) {
                    par0.a.getClass();
                    par0.b("[PhoneValidationManager] null external_id for libverify in method selector flow");
                    return;
                } else if (r25Var.d().b() == null) {
                    par0.a.getClass();
                    par0.b("[PhoneValidationManager] null service_code for libverify in method selector flow");
                    return;
                } else if (r25Var.f()) {
                    g3z g3zVar = new g3z(r25Var.c(), r25Var.e(), r25Var.d().c(), r25Var.d().a(), r25Var.d().b(), r25Var.d().d());
                    f71Var.e(LibverifyScreenData.a.a(y5k0Var.a(g3zVar.e(), g3zVar.f(), g3zVar.c(), null), g3zVar.f(), g3zVar.a(), g3zVar.b(), g3zVar.d()), credentials);
                    return;
                } else {
                    par0.a.getClass();
                    par0.b("the libverify method uses a non-phone login");
                    return;
                }
            }
            return;
        }
        VerificationMethodTypes verificationMethodTypes = (VerificationMethodTypes) a2;
        switch (a.$EnumSwitchMapping$0[verificationMethodTypes.ordinal()]) {
            case 1:
                String c = r25Var.c();
                String e = r25Var.e();
                PasskeyAlternative passkeyAlternative = r25Var.d().c() ? PasskeyAlternative.METHOD_SELECTOR : PasskeyAlternative.RESTORE;
                PasskeyWebAuthScreen.a aVar = PasskeyWebAuthScreen.Companion;
                boolean z = !r25Var.d().c();
                aVar.getClass();
                f71Var.a(new PasskeyCheckInfo(c, e, passkeyAlternative, PasskeyWebAuthScreen.a.a(z), r25Var.f(), false, 32, null));
                return;
            case 2:
                f71Var.b(new FullscreenPasswordData(r25Var.c(), r25Var.f(), r25Var.e(), r25Var.d().c(), null, false, 32, null), credentials);
                b.a aVar2 = b.a.a;
                SchemeStatSak$RegistrationFieldItem h = VerificationStatFlow.AUTH.h();
                try {
                    q55 q55Var = q55.a;
                    Bundle bundle = q55.c().a.K;
                    if (bundle != null) {
                        vkEmailForwardingConfig = m63.d(bundle);
                    }
                } catch (Throwable unused) {
                }
                aVar2.getClass();
                b.a.d(h, vkEmailForwardingConfig);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                String c2 = r25Var.c();
                String e2 = r25Var.e();
                boolean c3 = r25Var.d().c();
                f71Var.d(r25Var.f() ? y5k0Var.a(c2, e2, c3, r25Var.d().e()) : new VerificationScreenData.Email(c2, c2, e2, c3, true, null, null, 96, null), verificationMethodTypes, credentials);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final VerificationScreenData.Phone a(String str, String str2, boolean z, VkAuthValidateAccountResponse.NextStep.MaxOptions maxOptions) {
        return new VerificationScreenData.Phone(str, VkPhoneFormatUtils.a(this.b, str, null, VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC, 12), str2, z, null, false, true, false, null, null, maxOptions, null, 2992, null);
    }
}
