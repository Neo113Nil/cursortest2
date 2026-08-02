package com.yandex.passport.internal.properties;

import android.os.Bundle;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.m3;
import com.yandex.passport.api.z0;
import com.yandex.passport.internal.AnimationTheme;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.entities.TurboAuthParams;
import defpackage.ny61;
import defpackage.oo31;
import java.util.Map;

/* loaded from: classes8.dex */
public final class i {
    public static LoginProperties a(Bundle bundle) {
        LoginProperties loginProperties = (LoginProperties) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-login-properties");
        if (loginProperties != null) {
            return loginProperties;
        }
        ny61.r("Bundle has no LoginProperties");
        return null;
    }

    public static LoginProperties b(com.yandex.passport.api.limited.a aVar) {
        AnimationTheme animationTheme;
        PassportUidImpl passportUidImpl;
        String applicationPackageName = aVar.getApplicationPackageName();
        com.yandex.passport.internal.entities.f fVar = Filter.Companion;
        z0 filter = aVar.getFilter();
        fVar.getClass();
        Filter a = com.yandex.passport.internal.entities.f.a(filter);
        PassportTheme theme = aVar.getTheme();
        com.yandex.passport.api.o animationTheme2 = aVar.getAnimationTheme();
        if (animationTheme2 != null) {
            AnimationTheme.Companion.getClass();
            animationTheme = com.yandex.passport.internal.c.a(animationTheme2);
        } else {
            animationTheme = null;
        }
        k2 selectedUid = aVar.getSelectedUid();
        if (selectedUid != null) {
            PassportUidImpl.Companion.getClass();
            passportUidImpl = l2.a(selectedUid);
        } else {
            passportUidImpl = null;
        }
        boolean isAdditionOnlyRequired = aVar.isAdditionOnlyRequired();
        boolean isRegistrationOnlyRequired = aVar.isRegistrationOnlyRequired();
        PassportSocialConfiguration socialConfiguration = aVar.getSocialConfiguration();
        String loginHint = aVar.getLoginHint();
        SocialRegistrationProperties M = u.M(aVar.getSocialRegistrationProperties());
        VisualProperties P = u.P(aVar.getVisualProperties());
        com.yandex.passport.api.c0 bindPhoneProperties = aVar.getBindPhoneProperties();
        BindPhoneProperties Y = bindPhoneProperties != null ? com.yandex.passport.internal.a0.Y(bindPhoneProperties) : null;
        String source = aVar.getSource();
        Map analyticsParams = aVar.getAnalyticsParams();
        j2 turboAuthParams = aVar.getTurboAuthParams();
        TurboAuthParams turboAuthParams2 = turboAuthParams != null ? new TurboAuthParams(turboAuthParams) : null;
        m3 webAmProperties = aVar.getWebAmProperties();
        return new LoginProperties(applicationPackageName, false, null, a, theme, animationTheme, passportUidImpl, isAdditionOnlyRequired, isRegistrationOnlyRequired, socialConfiguration, loginHint, false, null, null, M, P, Y, source, analyticsParams, turboAuthParams2, webAmProperties != null ? u.Q(webAmProperties) : null, aVar.getSetAsCurrent(), aVar.mo243getAdditionalActionRequestJWfNWPw(), aVar.getHeaders(), aVar.isUpgradePhonish(), aVar.getOrigin(), aVar.getCusLocation(), false, null, aVar.getCreateMasterEnterPhoneNumberOption(), aVar.getLockScreenOrientation(), 402667526, null);
    }
}
