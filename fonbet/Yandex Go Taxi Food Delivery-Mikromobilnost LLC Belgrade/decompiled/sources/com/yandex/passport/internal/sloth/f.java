package com.yandex.passport.internal.sloth;

import android.net.Uri;
import com.yandex.passport.common.core.Environment;

/* loaded from: classes2.dex */
public final class f {
    public final com.yandex.passport.internal.network.e a;

    public f(com.yandex.passport.internal.network.e eVar) {
        this.a = eVar;
    }

    public final String a(Environment environment, long j) {
        com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) this.a;
        lVar.getClass();
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri build = Uri.parse(com.yandex.passport.internal.network.m.c(lVar, environment, j)).buildUpon().appendEncodedPath("iframe").appendEncodedPath("personal").appendEncodedPath("delete-account").build();
        aVar.getClass();
        return build.toString();
    }

    public final String b(Environment environment, long j) {
        com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) this.a;
        lVar.getClass();
        Uri.Builder buildUpon = Uri.parse(lVar.f(environment, Long.valueOf(j), null)).buildUpon();
        com.yandex.passport.internal.network.l.b(buildUpon, lVar.k().a);
        Uri build = buildUpon.appendQueryParameter("backpath", lVar.i(environment, j, false)).build();
        com.yandex.passport.common.url.b.Companion.getClass();
        return build.toString();
    }

    public final String c(Environment environment, Long l) {
        return ((com.yandex.passport.internal.network.l) this.a).m(environment, l);
    }

    public final String d(Environment environment, long j) {
        com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) this.a;
        lVar.getClass();
        Uri.Builder buildUpon = Uri.parse(lVar.f(environment, Long.valueOf(j), null)).buildUpon();
        com.yandex.passport.internal.network.l.b(buildUpon, lVar.k().b);
        Uri build = buildUpon.appendQueryParameter("retpath", lVar.i(environment, j, true)).appendQueryParameter("backpath", lVar.i(environment, j, false)).build();
        com.yandex.passport.common.url.b.Companion.getClass();
        return build.toString();
    }

    public final String e(Environment environment, long j) {
        com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) this.a;
        lVar.getClass();
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri build = Uri.parse(com.yandex.passport.internal.network.m.c(lVar, environment, j)).buildUpon().appendEncodedPath("account-manager").appendEncodedPath("plus-devices").build();
        aVar.getClass();
        return build.toString();
    }

    public final String f(Environment environment, long j) {
        com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) this.a;
        lVar.getClass();
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri build = Uri.parse(lVar.f(environment, Long.valueOf(j), null)).buildUpon().appendEncodedPath("pwl-yandex").appendEncodedPath("am").appendEncodedPath("webauthn").appendEncodedPath("reg").build();
        aVar.getClass();
        return build.toString();
    }

    public final String g(Environment environment) {
        com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) this.a;
        lVar.getClass();
        Uri build = Uri.parse(com.yandex.passport.internal.network.m.c(lVar, environment, 0L)).buildUpon().appendPath("account-manager").appendPath("ebs-age-confirm").build();
        com.yandex.passport.common.url.b.Companion.getClass();
        return build.toString();
    }
}
