package com.yandex.passport.internal.ui.social.factory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.social.authenticators.f;
import com.yandex.passport.internal.ui.social.d;
import com.yandex.passport.internal.ui.social.e;
import com.yandex.passport.internal.ui.social.g;
import com.yandex.passport.internal.ui.social.h;
import com.yandex.passport.internal.ui.social.k;
import com.yandex.passport.internal.ui.social.l;
import com.yandex.passport.internal.ui.social.m;
import com.yandex.passport.internal.util.j;

/* loaded from: classes2.dex */
public final class a extends c {
    public final /* synthetic */ int e = 1;
    public final Bundle f;
    public final PassportProcessGlobalComponent g;
    public final Parcelable h;
    public final Object i;

    public a(LoginProperties loginProperties, Bundle bundle, ModernAccount modernAccount, SocialConfiguration socialConfiguration, Context context, boolean z) {
        super(socialConfiguration, context, z, null);
        this.h = loginProperties;
        this.f = bundle;
        this.i = modernAccount;
        this.g = com.yandex.passport.internal.di.a.a();
    }

    @Override // com.yandex.passport.internal.ui.social.factory.c
    public final f b() {
        switch (this.e) {
            case 0:
                return i(com.yandex.passport.internal.ui.social.b.b);
            default:
                throw new IllegalStateException("Mailish accounts can't be used in social binding");
        }
    }

    @Override // com.yandex.passport.internal.ui.social.factory.c
    public final f c() {
        switch (this.e) {
            case 0:
                return i(new com.yandex.passport.internal.ui.social.c((String) this.i));
            default:
                return j(k.a);
        }
    }

    @Override // com.yandex.passport.internal.ui.social.factory.c
    public final f d(Intent intent) {
        switch (this.e) {
            case 0:
                return i(new d(intent));
            default:
                throw new IllegalStateException("Mailish accounts can't be used in social binding");
        }
    }

    @Override // com.yandex.passport.internal.ui.social.factory.c
    public final f e() {
        switch (this.e) {
            case 0:
                ModernAccount modernAccount = this.d;
                return i(new e(modernAccount != null ? modernAccount.getPrimaryDisplayName() : null));
            default:
                throw new IllegalStateException("Mailish accounts can't be used in social binding");
        }
    }

    @Override // com.yandex.passport.internal.ui.social.factory.c
    public final f f(Intent intent) {
        switch (this.e) {
            case 0:
                return i(new com.yandex.passport.internal.ui.social.f(intent));
            default:
                return j(new l(intent));
        }
    }

    @Override // com.yandex.passport.internal.ui.social.factory.c
    public final f g() {
        switch (this.e) {
            case 0:
                return i(com.yandex.passport.internal.ui.social.b.c);
            default:
                throw new IllegalStateException("Mailish accounts can't be used in social binding");
        }
    }

    @Override // com.yandex.passport.internal.ui.social.factory.c
    public final f h() {
        switch (this.e) {
            case 0:
                return i(new g((String) this.i, ((AuthTrack) this.h).getTrackId()));
            default:
                return j(k.b);
        }
    }

    public com.yandex.passport.internal.ui.social.authenticators.c i(h hVar) {
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.g;
        j hashEncoder = passportProcessGlobalComponent.getHashEncoder();
        com.yandex.passport.internal.usecase.authorize.d authByCodeUseCase = passportProcessGlobalComponent.getAuthByCodeUseCase();
        com.yandex.passport.internal.usecase.ui.l authorizeByMailOAuthTaskIdUseCase = passportProcessGlobalComponent.getAuthorizeByMailOAuthTaskIdUseCase();
        com.yandex.passport.internal.usecase.authorize.b authByCookieUseCase = passportProcessGlobalComponent.getAuthByCookieUseCase();
        com.yandex.passport.internal.core.accounts.d accountsRetriever = passportProcessGlobalComponent.getAccountsRetriever();
        com.yandex.passport.internal.account.c loginController = passportProcessGlobalComponent.getLoginController();
        w0 socialReporter = passportProcessGlobalComponent.getSocialReporter();
        socialReporter.c = passportProcessGlobalComponent.getStatefulReporter().w;
        return new com.yandex.passport.internal.ui.social.authenticators.c(hVar, hashEncoder, authByCodeUseCase, authorizeByMailOAuthTaskIdUseCase, authByCookieUseCase, accountsRetriever, loginController, socialReporter, passportProcessGlobalComponent.getClientChooser(), passportProcessGlobalComponent.getProperties(), ((AuthTrack) this.h).getProperties(), this.a, this.f, this.d != null);
    }

    public com.yandex.passport.internal.ui.social.authenticators.e j(m mVar) {
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.g;
        return new com.yandex.passport.internal.ui.social.authenticators.e(mVar, passportProcessGlobalComponent.getHashEncoder(), passportProcessGlobalComponent.getClientChooser(), passportProcessGlobalComponent.getSocialReporter(), (ModernAccount) this.i, (LoginProperties) this.h, this.a, this.f);
    }

    public a(AuthTrack authTrack, String str, Bundle bundle, SocialConfiguration socialConfiguration, Context context, boolean z, ModernAccount modernAccount) {
        super(socialConfiguration, context, z, modernAccount);
        this.h = authTrack;
        this.i = str;
        this.f = bundle;
        this.g = com.yandex.passport.internal.di.a.a();
    }
}
