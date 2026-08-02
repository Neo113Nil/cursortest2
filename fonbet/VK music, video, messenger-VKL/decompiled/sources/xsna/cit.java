package xsna;

import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vk.api.generated.accountVerification.dto.AccountVerificationCreateLinkPlatformDto;
import com.vk.api.generated.accountVerification.dto.AccountVerificationCreateLinkProviderDto;
import com.vk.api.generated.accountVerification.dto.AccountVerificationGetSessionInfoPlatformDto;
import com.vk.api.generated.accountVerification.dto.AccountVerificationGetSessionInfoProviderDto;
import com.vk.api.generated.accountVerification.dto.AccountVerificationLinkWithVerifyPlatformDto;
import com.vk.api.generated.accountVerification.dto.AccountVerificationLinkWithVerifyProviderDto;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class cit implements xen0 {
    @Override // xsna.xen0
    public final io.reactivex.rxjava3.internal.operators.single.y a(String str, String str2, String str3) {
        AccountVerificationLinkWithVerifyProviderDto accountVerificationLinkWithVerifyProviderDto;
        AccountVerificationLinkWithVerifyProviderDto[] values = AccountVerificationLinkWithVerifyProviderDto.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                accountVerificationLinkWithVerifyProviderDto = null;
                break;
            }
            accountVerificationLinkWithVerifyProviderDto = values[i];
            if (epx.f(accountVerificationLinkWithVerifyProviderDto.i(), str3)) {
                break;
            }
            i++;
        }
        AccountVerificationLinkWithVerifyPlatformDto accountVerificationLinkWithVerifyPlatformDto = AccountVerificationLinkWithVerifyPlatformDto.MOBILE;
        ufx ufxVar = new ufx("accountVerification.linkWithVerify", new et(0), new gp(1));
        ufxVar.g(1, 512, O6.e1, str);
        if (str2 != null) {
            ufxVar.g(1, 512, "cua_token", str2);
        }
        if (accountVerificationLinkWithVerifyProviderDto != null) {
            ufx.n(ufxVar, IronSourceConstants.EVENTS_PROVIDER, accountVerificationLinkWithVerifyProviderDto.i(), 0, 12);
        }
        if (accountVerificationLinkWithVerifyPlatformDto != null) {
            ufx.n(ufxVar, "platform", accountVerificationLinkWithVerifyPlatformDto.i(), 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new do3(new com.vk.movika.sdk.base.observable.e0(22), 17));
    }

    @Override // xsna.xen0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 b(String str, String str2, String str3, String str4, AccountVerificationGetSessionInfoPlatformDto accountVerificationGetSessionInfoPlatformDto) {
        AccountVerificationGetSessionInfoProviderDto accountVerificationGetSessionInfoProviderDto;
        AccountVerificationGetSessionInfoProviderDto[] values = AccountVerificationGetSessionInfoProviderDto.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                accountVerificationGetSessionInfoProviderDto = null;
                break;
            }
            accountVerificationGetSessionInfoProviderDto = values[i];
            if (epx.f(accountVerificationGetSessionInfoProviderDto.i(), str3)) {
                break;
            }
            i++;
        }
        ufx ufxVar = new ufx("accountVerification.getSessionInfo", new at(0), new bt(0));
        ufxVar.g(1, 512, "code", str);
        if (str2 != null) {
            ufxVar.g(1, 512, "code_verifier", str2);
        }
        if (accountVerificationGetSessionInfoProviderDto != null) {
            ufx.n(ufxVar, IronSourceConstants.EVENTS_PROVIDER, accountVerificationGetSessionInfoProviderDto.i(), 0, 12);
        }
        ufxVar.g(1, 512, "provider_client_id", str4);
        ufx.n(ufxVar, "platform", accountVerificationGetSessionInfoPlatformDto.i(), 0, 12);
        return rdx0.B(e370.e(ufxVar));
    }

    @Override // xsna.xen0
    public final io.reactivex.rxjava3.internal.operators.single.y c(String str, String str2, String str3) {
        AccountVerificationCreateLinkProviderDto accountVerificationCreateLinkProviderDto;
        AccountVerificationCreateLinkProviderDto[] values = AccountVerificationCreateLinkProviderDto.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                accountVerificationCreateLinkProviderDto = null;
                break;
            }
            accountVerificationCreateLinkProviderDto = values[i];
            if (epx.f(accountVerificationCreateLinkProviderDto.i(), str3)) {
                break;
            }
            i++;
        }
        AccountVerificationCreateLinkPlatformDto accountVerificationCreateLinkPlatformDto = AccountVerificationCreateLinkPlatformDto.MOBILE;
        ufx ufxVar = new ufx("accountVerification.createLink", new ct(0), new dt(0));
        ufxVar.g(1, 512, O6.e1, str);
        if (str2 != null) {
            ufxVar.g(1, 512, "cua_token", str2);
        }
        if (accountVerificationCreateLinkProviderDto != null) {
            ufx.n(ufxVar, IronSourceConstants.EVENTS_PROVIDER, accountVerificationCreateLinkProviderDto.i(), 0, 12);
        }
        if (accountVerificationCreateLinkPlatformDto != null) {
            ufx.n(ufxVar, "platform", accountVerificationCreateLinkPlatformDto.i(), 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new e40(new d40(29), 14));
    }
}
