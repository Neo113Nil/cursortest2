package com.yandex.passport.sloth;

import android.webkit.CookieManager;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.SlothVariant$BiometricVerification;
import defpackage.bvu0;
import defpackage.tje;
import defpackage.w511;
import java.util.Locale;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class k0 {
    public static final Regex g = new Regex("^(?:passport(?:-rc|-test)?|oauth|social)\\.yandex-team\\.(?:ru|az|com\\.am|com\\.ge|co\\.il|kg|lv|lt|md|tj|tm|uz|fr|ee|ua|by|kz|com|com\\.tr)$");
    public final SlothParams a;
    public final com.yandex.passport.internal.sloth.e b;
    public final e c;
    public final z0 d;
    public final v e;
    public final h f;

    public k0(SlothParams slothParams, com.yandex.passport.internal.sloth.e eVar, e eVar2, z0 z0Var, v vVar, h hVar) {
        this.a = slothParams;
        this.b = eVar;
        this.c = eVar2;
        this.d = z0Var;
        this.e = vVar;
        this.f = hVar;
    }

    public final com.yandex.passport.sloth.url.p a(String str) {
        com.yandex.passport.sloth.url.k kVar = com.yandex.passport.sloth.url.k.d;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "WebAm success", 8);
        }
        com.yandex.passport.sloth.data.c0 variant = this.a.getVariant();
        if ((variant instanceof com.yandex.passport.sloth.data.t) || (variant instanceof com.yandex.passport.sloth.data.w) || (variant instanceof com.yandex.passport.sloth.data.z) || (variant instanceof com.yandex.passport.sloth.data.p) || (variant instanceof com.yandex.passport.sloth.data.x) || (variant instanceof com.yandex.passport.sloth.data.y) || (variant instanceof com.yandex.passport.sloth.data.j)) {
            String i = com.yandex.passport.common.url.b.i(str, "location_id");
            b(str, i != null ? bvu0.m(10, i) : null);
            return kVar;
        }
        if (variant instanceof com.yandex.passport.sloth.data.s) {
            b(str, Long.valueOf(((com.yandex.passport.sloth.data.s) variant).b));
            return kVar;
        }
        if ((variant instanceof com.yandex.passport.sloth.data.a0) || (variant instanceof com.yandex.passport.sloth.data.k) || (variant instanceof com.yandex.passport.sloth.data.l) || (variant instanceof com.yandex.passport.sloth.data.u) || (variant instanceof com.yandex.passport.sloth.data.b0) || (variant instanceof com.yandex.passport.sloth.data.o) || (variant instanceof com.yandex.passport.sloth.data.r) || (variant instanceof com.yandex.passport.sloth.data.q) || (variant instanceof SlothVariant$BiometricVerification)) {
            return com.yandex.passport.sloth.url.k.b;
        }
        boolean z = variant instanceof com.yandex.passport.sloth.data.n;
        h hVar = this.f;
        if (z) {
            tje.N(hVar, null, null, new SlothFinishProcessor$finishAuthSdk$1(this, str, null), 3);
            return kVar;
        }
        boolean z2 = variant instanceof com.yandex.passport.sloth.data.m;
        z0 z0Var = this.d;
        if (z2) {
            z0Var.a(s0.c);
            return com.yandex.passport.sloth.url.k.c;
        }
        if (variant instanceof com.yandex.passport.sloth.data.i) {
            z0Var.a(r0.c);
            tje.N(hVar, null, null, new SlothFinishProcessor$finishWithSlothResult$1(this, j0.a, null), 3);
            return kVar;
        }
        if (variant instanceof com.yandex.passport.sloth.data.v) {
            tje.N(hVar, null, null, new SlothFinishProcessor$finishWithSlothResult$1(this, j0.b, null), 3);
            return kVar;
        }
        w511.b();
        return null;
    }

    public final void b(String str, Long l) {
        Environment environment;
        String i = com.yandex.passport.common.url.b.i(str, "from");
        boolean a = g.a(com.yandex.passport.common.url.b.g(str).toLowerCase(Locale.US));
        SlothParams slothParams = this.a;
        if (a) {
            environment = slothParams.getSecondaryEnvironment();
            if (environment == null) {
                environment = slothParams.getEnvironment() == Environment.TESTING ? Environment.TEAM_TESTING : Environment.TEAM_PRODUCTION;
            }
        } else {
            environment = slothParams.getEnvironment();
        }
        e eVar = this.c;
        ((CookieManager) eVar.a.getValue()).flush();
        String cookie = ((CookieManager) eVar.a.getValue()).getCookie(str);
        com.yandex.passport.sloth.data.a aVar = (cookie == null || e.b(cookie, "Session_id") == null) ? null : new com.yandex.passport.sloth.data.a(environment, str, cookie);
        h hVar = this.f;
        z0 z0Var = this.d;
        if (aVar != null) {
            z0Var.a(q0.c);
            tje.N(hVar, null, null, new SlothFinishProcessor$finishWithCookie$1(this, aVar, str, l, i, null), 3);
        } else {
            z0Var.a(p0.c);
            tje.N(hVar, null, null, new SlothFinishProcessor$finishWithCookieParseError$1(this, null), 3);
        }
    }
}
