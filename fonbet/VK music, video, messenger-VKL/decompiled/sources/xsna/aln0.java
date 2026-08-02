package xsna;

import com.vk.auth.main.AuthStatSender;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import com.vk.superapp.core.api.models.SendOtpInfo;
import com.vk.superapp.core.api.models.ValidateInfo;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.collections.EmptyList;
import xsna.r25;

/* compiled from: SuspiciousAuthPresenter.kt */
/* loaded from: classes15.dex */
public final class aln0 extends p66<dln0> implements cln0 {
    public final y5k0 A = new y5k0(new g71(new pvh0(this, 8)), this.b);
    public final SendOtpInfo x;
    public final com.vk.auth.suspicious_auth.b y;
    public final ykn0 z;

    public aln0(SendOtpInfo sendOtpInfo, com.vk.auth.suspicious_auth.b bVar, ykn0 ykn0Var) {
        this.x = sendOtpInfo;
        this.y = bVar;
        this.z = ykn0Var;
    }

    @Override // xsna.cln0
    public final void J() {
        q55 q55Var = q55.a;
        String str = null;
        q55.c().a.L = null;
        this.z.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.f(null, SchemeStatSak$EventScreen.DOUBTFUL_AUTH, null, false, null, null, 61);
        this.z.getClass();
        RegistrationStatParamsFactory.AnalyticsFlowSource analyticsFlowSource = RegistrationStatParamsFactory.AnalyticsFlowSource.DOUBTFUL_AUTH;
        String str2 = RegistrationStatParamsFactory.b;
        if (str2 != null && !drm0.N(str2)) {
            str = str2;
        }
        RegistrationStatParamsFactory.b = j5g.g0(izi0.m(str, analyticsFlowSource.h()), StringUtils.COMMA, null, null, 0, null, 62);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(dln0 dln0Var) {
        super.y0(dln0Var);
        this.y.a(this.x);
    }

    @Override // xsna.cln0
    public final void z(ValidateInfo validateInfo, VkAuthCredentials vkAuthCredentials) {
        VkAuthValidateAccountResponse.NextStep.VerificationMethod verificationMethod;
        ValidateInfo.NextStep nextStep = validateInfo.d;
        this.z.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.DOUBTFUL_AUTH_CHECK, null, null, SchemeStatSak$EventScreen.DOUBTFUL_AUTH, null, null, null, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);
        boolean z = validateInfo.b;
        VkAuthValidateAccountResponse.NextStep.VerificationMethod verificationMethod2 = z ? VkAuthValidateAccountResponse.NextStep.VerificationMethod.EMAIL : VkAuthValidateAccountResponse.NextStep.VerificationMethod.SMS;
        VkAuthValidateAccountResponse.NextStep.VerificationMethod.a aVar = VkAuthValidateAccountResponse.NextStep.VerificationMethod.Companion;
        String str = nextStep.b;
        aVar.getClass();
        VkAuthValidateAccountResponse.NextStep.VerificationMethod[] values = VkAuthValidateAccountResponse.NextStep.VerificationMethod.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                verificationMethod = null;
                break;
            }
            verificationMethod = values[i];
            if (epx.f(str, verificationMethod.h())) {
                break;
            } else {
                i++;
            }
        }
        y5k0.b(this.A, new r25(vkAuthCredentials.b, vkAuthCredentials.c, validateInfo.c, !z, EmptyList.b, new r25.a(verificationMethod == null ? verificationMethod2 : verificationMethod, nextStep.c, null, null, null, null)));
    }
}
