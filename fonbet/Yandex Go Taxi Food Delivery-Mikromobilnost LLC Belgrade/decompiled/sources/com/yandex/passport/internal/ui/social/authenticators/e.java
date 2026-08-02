package com.yandex.passport.internal.ui.social.authenticators;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.cb;
import com.yandex.passport.internal.report.db;
import com.yandex.passport.internal.report.fb;
import com.yandex.passport.internal.report.gb;
import com.yandex.passport.internal.report.hb;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.base.l;
import com.yandex.passport.internal.ui.social.k;
import com.yandex.passport.internal.ui.social.m;
import com.yandex.passport.internal.ui.social.o;
import com.yandex.passport.internal.ui.social.p;
import com.yandex.passport.internal.ui.social.r;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;
import com.yandex.passport.internal.util.j;
import defpackage.jl40;
import defpackage.w511;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class e extends f {
    public final j C;
    public final com.yandex.passport.internal.network.client.c D;
    public final ModernAccount E;
    public final MasterToken F;

    public e(m mVar, j jVar, com.yandex.passport.internal.network.client.c cVar, w0 w0Var, ModernAccount modernAccount, LoginProperties loginProperties, SocialConfiguration socialConfiguration, Bundle bundle) {
        super(loginProperties, socialConfiguration, bundle, false, mVar, w0Var);
        this.C = jVar;
        this.D = cVar;
        this.E = modernAccount;
        this.F = modernAccount.getMasterToken();
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void W(int i, int i2, Intent intent) {
        w0 w0Var = this.y;
        w0Var.getClass();
        cb cbVar = cb.w;
        SocialConfiguration socialConfiguration = this.c;
        w0Var.f(cbVar, new yd(w0.j(socialConfiguration), 5, false), new md(i, 14), new md(i2, 16), new md(w0Var.c, 21));
        switch (i) {
            case 108:
                if (i2 == -1) {
                    if (intent != null) {
                        String stringExtra = intent.getStringExtra("social-token");
                        if (stringExtra != null) {
                            c0(new l(new b(this, stringExtra, intent.getStringExtra("application-id"), 1), 109));
                            break;
                        } else {
                            w0Var.l(socialConfiguration, new RuntimeException("Social token is null"));
                            break;
                        }
                    } else {
                        w0Var.l(socialConfiguration, new RuntimeException("Intent data is null"));
                        break;
                    }
                } else if (i2 == 100) {
                    a0();
                    break;
                } else {
                    if ((intent != null ? intent.getSerializableExtra(Constants.KEY_EXCEPTION) : null) == null) {
                        b0();
                        break;
                    } else {
                        w0Var.l(socialConfiguration, (Throwable) intent.getSerializableExtra(Constants.KEY_EXCEPTION));
                        break;
                    }
                }
            case 109:
            case 110:
                if (i2 != -1) {
                    b0();
                    break;
                } else {
                    ModernAccount modernAccount = this.E;
                    w0Var.f(db.w, new yd(w0.j(socialConfiguration), 5, false), new jd(String.valueOf(modernAccount.getUid().getValue()), 3), new md(w0Var.c, 21));
                    o oVar = new o(modernAccount);
                    r0 r0Var = this.A;
                    r0Var.getClass();
                    r0Var.m(null, oVar);
                    break;
                }
        }
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void X() {
        l lVar;
        w0 w0Var = this.y;
        w0Var.getClass();
        final int i = 0;
        final int i2 = 1;
        w0Var.f(gb.w, new yd(w0.j(this.c), 5, false), new md(w0Var.c, 21));
        m mVar = (m) this.x;
        if (jl40.l(mVar, k.b)) {
            lVar = new l(new com.yandex.passport.legacy.lx.j(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.d
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.j
                public final Object a(Object obj) {
                    int i3 = i;
                    e eVar = this.b;
                    switch (i3) {
                        case 0:
                            Context context = (Context) obj;
                            com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
                            LoginProperties loginProperties = eVar.b;
                            PassportEnvironmentImpl primaryEnvironment = loginProperties.getFilter().getPrimaryEnvironment();
                            PassportTheme theme = loginProperties.getTheme();
                            WebCaseType webCaseType = WebCaseType.BIND_SOCIAL_WEB;
                            SocialConfiguration socialConfiguration = eVar.c;
                            MasterToken masterToken = eVar.F;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", socialConfiguration);
                            bundle.putString("master-token", masterToken.getRawValue());
                            return com.yandex.passport.internal.ui.webview.b.b(bVar, primaryEnvironment, context, theme, webCaseType, bundle);
                        default:
                            return ((com.yandex.passport.internal.ui.social.l) eVar.x).a;
                    }
                }
            }, 109);
        } else if (jl40.l(mVar, k.a)) {
            lVar = new l(new com.yandex.passport.internal.ui.o(6, this, com.yandex.passport.internal.util.b.b()), 110);
        } else {
            if (!(mVar instanceof com.yandex.passport.internal.ui.social.l)) {
                w511.b();
                return;
            }
            lVar = new l(new com.yandex.passport.legacy.lx.j(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.d
                public final /* synthetic */ e b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.j
                public final Object a(Object obj) {
                    int i3 = i2;
                    e eVar = this.b;
                    switch (i3) {
                        case 0:
                            Context context = (Context) obj;
                            com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
                            LoginProperties loginProperties = eVar.b;
                            PassportEnvironmentImpl primaryEnvironment = loginProperties.getFilter().getPrimaryEnvironment();
                            PassportTheme theme = loginProperties.getTheme();
                            WebCaseType webCaseType = WebCaseType.BIND_SOCIAL_WEB;
                            SocialConfiguration socialConfiguration = eVar.c;
                            MasterToken masterToken = eVar.F;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", socialConfiguration);
                            bundle.putString("master-token", masterToken.getRawValue());
                            return com.yandex.passport.internal.ui.webview.b.b(bVar, primaryEnvironment, context, theme, webCaseType, bundle);
                        default:
                            return ((com.yandex.passport.internal.ui.social.l) eVar.x).a;
                    }
                }
            }, 108);
        }
        c0(lVar);
    }

    public final void b0() {
        w0 w0Var = this.y;
        w0Var.getClass();
        w0Var.f(hb.w, new yd(w0.j(this.c), 5, false), new md(w0Var.c, 21));
        p pVar = p.a;
        r0 r0Var = this.A;
        r0Var.getClass();
        r0Var.m(null, pVar);
    }

    public final void c0(l lVar) {
        int i = lVar.b;
        w0 w0Var = this.y;
        w0Var.getClass();
        w0Var.f(fb.w, new yd(w0.j(this.c), 5, false), new md(i, 14), new md(w0Var.c, 21));
        r rVar = new r(lVar);
        r0 r0Var = this.A;
        r0Var.getClass();
        r0Var.m(null, rVar);
    }
}
