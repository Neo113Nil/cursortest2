package com.yandex.passport.internal.ui.social.gimap;

import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.ui.social.gimap.GimapIdentifierFragment;

/* loaded from: classes2.dex */
public final class g extends a {
    public final com.yandex.passport.internal.ui.util.l D;
    public final com.yandex.passport.internal.account.c E;

    public g(o oVar, c0 c0Var, com.yandex.passport.internal.account.c cVar) {
        super(oVar, c0Var);
        this.D = new com.yandex.passport.internal.ui.util.l();
        this.E = cVar;
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.a
    public final ModernAccount a0(GimapTrack gimapTrack) {
        AnalyticsFromValue analyticsFromValue;
        Environment environment = gimapTrack.getEnvironment();
        String email = gimapTrack.getEmail();
        email.getClass();
        String password = gimapTrack.getPassword();
        password.getClass();
        PassportSocialProviderCode passportSocialProviderCode = PassportSocialProviderCode.OTHER;
        AnalyticsFromValue.Companion.getClass();
        analyticsFromValue = AnalyticsFromValue.MAILISH_GIMAP;
        return this.E.b(environment, email, password, passportSocialProviderCode, analyticsFromValue);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.a
    public final void b0(GimapError gimapError) {
        super.b0(gimapError);
        this.D.m(GimapIdentifierFragment.State.ERROR);
    }
}
