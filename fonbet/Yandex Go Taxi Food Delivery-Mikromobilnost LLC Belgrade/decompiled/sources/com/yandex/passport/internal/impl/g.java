package com.yandex.passport.internal.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.c0;
import com.yandex.passport.api.c2;
import com.yandex.passport.api.d2;
import com.yandex.passport.api.e1;
import com.yandex.passport.api.e2;
import com.yandex.passport.api.e3;
import com.yandex.passport.api.f1;
import com.yandex.passport.api.i2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.m3;
import com.yandex.passport.api.o0;
import com.yandex.passport.api.t0;
import com.yandex.passport.api.u1;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.AuthByQrProperties;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.passport.internal.properties.BindPhoneProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.SetCurrentAccountPropertiesImpl;
import com.yandex.passport.internal.properties.SocialApplicationBindProperties;
import com.yandex.passport.internal.properties.SocialBindProperties;
import com.yandex.passport.internal.properties.TurboAppAuthProperties;
import com.yandex.passport.internal.properties.UserMenuProperties;
import com.yandex.passport.internal.ui.AccountNotAuthorizedActivity;
import com.yandex.passport.internal.ui.AutoLoginActivity;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.router.RoadSign;
import defpackage.wwg;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class g implements com.yandex.passport.api.e {
    public final a a;

    public g(a aVar) {
        this.a = aVar;
    }

    @Override // com.yandex.passport.api.e
    public final Intent a(Context context, f1 f1Var) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            PassportLogoutPropertiesImpl e0 = a0.e0(f1Var);
            cVar.getClass();
            return com.yandex.passport.internal.ui.router.c.d(context, RoadSign.LOGOUT, e0.toBundle());
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent b(Context context, k2 k2Var) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            PassportUidImpl.Companion.getClass();
            PassportDeleteAccountPropertiesImpl passportDeleteAccountPropertiesImpl = new PassportDeleteAccountPropertiesImpl(l2.a(k2Var), null, null, null, 14, null);
            cVar.getClass();
            return com.yandex.passport.internal.ui.router.c.d(context, RoadSign.DELETE_ACCOUNT, passportDeleteAccountPropertiesImpl.toBundle());
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent c(Context context) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            SetCurrentAccountPropertiesImpl.Companion.getClass();
            throw null;
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent d(Context context, o0 o0Var) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            PassportDeleteAccountPropertiesImpl d0 = a0.d0(o0Var);
            cVar.getClass();
            return com.yandex.passport.internal.ui.router.c.d(context, RoadSign.DELETE_ACCOUNT, d0.toBundle());
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent e(Context context, c0 c0Var) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            PassportTheme theme = c0Var.getTheme();
            com.yandex.passport.internal.entities.f fVar = Filter.Companion;
            Filter.a aVar2 = new Filter.a();
            t0 environment = c0Var.getUid().getEnvironment();
            KPassportEnvironment.Companion.getClass();
            aVar2.a = com.yandex.passport.api.d.a(environment);
            aVar2.c = c0Var.getPartitions();
            fVar.getClass();
            Filter a = com.yandex.passport.internal.entities.f.a(aVar2);
            BindPhoneProperties.Companion.getClass();
            BindPhoneProperties a2 = com.yandex.passport.internal.properties.f.a(c0Var);
            m3 webAmProperties = c0Var.getWebAmProperties();
            return com.yandex.passport.internal.ui.router.c.b(cVar, context, new LoginProperties(null, false, null, a, theme, null, null, false, false, null, null, false, null, null, null, null, a2, null, null, null, webAmProperties != null ? com.yandex.passport.internal.properties.u.Q(webAmProperties) : null, false, null, c0Var.getHeaders(), false, null, null, false, null, false, null, 2137980903, null), "BindPhone", 16);
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent f(Context context, e2 e2Var) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            SocialBindProperties L = com.yandex.passport.internal.properties.u.L(e2Var);
            cVar.getClass();
            return com.yandex.passport.internal.ui.router.c.d(context, RoadSign.SOCIAL_BIND, L.toBundle());
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent g(Context context, d2 d2Var) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            SocialApplicationBindProperties K = com.yandex.passport.internal.properties.u.K(d2Var);
            cVar.getClass();
            return com.yandex.passport.internal.ui.router.c.d(context, RoadSign.SOCIAL_APPLICATION_BIND, K.toBundle());
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent h(Context context, i2 i2Var) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            TurboAppAuthProperties N = com.yandex.passport.internal.properties.u.N(i2Var);
            cVar.getClass();
            Intent d = com.yandex.passport.internal.ui.router.c.d(context, RoadSign.TURBO_APP_AUTH, N.toBundle());
            d.putExtra(AuthSdkActivity.EXTRA_CLIENT_ID, N.getClientId());
            d.putExtra(AuthSdkActivity.EXTRA_THEME, N.getTheme());
            return d;
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent i(Context context, e1 e1Var) {
        a aVar = this.a;
        aVar.x();
        try {
            return com.yandex.passport.internal.ui.router.c.b(GlobalRouterActivity.Companion, context, a0.b0(e1Var), "Login", 16);
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent j(Context context, e3 e3Var) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            UserMenuProperties O = com.yandex.passport.internal.properties.u.O(e3Var);
            cVar.getClass();
            return com.yandex.passport.internal.ui.router.c.d(context, RoadSign.SHOW_USER_MENU, O.toBundle());
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent k(Context context, k2 k2Var, com.yandex.passport.api.a0 a0Var) {
        a aVar = this.a;
        aVar.x();
        try {
            PassportUidImpl.Companion.getClass();
            PassportUidImpl a = l2.a(k2Var);
            AutoLoginProperties.Companion.getClass();
            AutoLoginProperties b = com.yandex.passport.internal.properties.e.b(a0Var);
            aVar.x();
            try {
                Intent intent = new Intent(context, (Class<?>) AutoLoginActivity.class);
                Bundle bundle = new Bundle();
                bundle.putAll(com.yandex.passport.internal.ui.sloth.e.q(a));
                bundle.putAll(b.toBundle());
                intent.putExtras(bundle);
                return intent;
            } catch (RuntimeException e) {
                aVar.k(e);
                throw e;
            }
        } catch (RuntimeException e2) {
            aVar.k(e2);
            throw e2;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent l(Context context, com.yandex.passport.api.p pVar) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            AuthByQrProperties X = a0.X(pVar);
            cVar.getClass();
            Intent d = com.yandex.passport.internal.ui.router.c.d(context, RoadSign.AUTHORIZATION_BY_QR, X.toBundle());
            d.putExtra(GlobalRouterActivity.EXTERNAL_EXTRA, true);
            return d;
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent m(Context context, Uri uri) {
        a aVar = this.a;
        aVar.x();
        try {
            GlobalRouterActivity.Companion.getClass();
            return com.yandex.passport.internal.ui.router.c.d(context, RoadSign.CONFIRM_QR_AUTHORIZATION, wwg.g(new Pair(GlobalRouterActivity.URI, uri)));
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent n(Context context, com.yandex.passport.api.k kVar) {
        a aVar = this.a;
        aVar.x();
        try {
            Intent intent = new Intent(context, (Class<?>) AccountNotAuthorizedActivity.class);
            intent.putExtras(a0.W(kVar).toBundle());
            return intent;
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }

    @Override // com.yandex.passport.api.e
    public final Intent o(Context context, c2 c2Var) {
        a aVar = this.a;
        aVar.x();
        try {
            com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
            SetCurrentAccountPropertiesImpl.Companion.getClass();
            k2 k2Var = c2Var.a;
            if (k2Var == null) {
                k2Var = null;
            }
            PassportUidImpl.Companion.getClass();
            PassportUidImpl a = l2.a(k2Var);
            u1 u1Var = c2Var.b;
            ProgressPropertiesImpl.Companion.getClass();
            SetCurrentAccountPropertiesImpl setCurrentAccountPropertiesImpl = new SetCurrentAccountPropertiesImpl(a, com.yandex.passport.internal.properties.m.b(u1Var), c2Var.c);
            cVar.getClass();
            return com.yandex.passport.internal.ui.router.c.d(context, RoadSign.SET_CURRENT_ACCOUNT, setCurrentAccountPropertiesImpl.toBundle());
        } catch (RuntimeException e) {
            aVar.k(e);
            throw e;
        }
    }
}
