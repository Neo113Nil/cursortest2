package com.yandex.passport.internal.network.client;

import android.net.Uri;
import com.yandex.passport.api.PassportUrlType;
import com.yandex.passport.common.analytics.f;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.flags.m;
import com.yandex.passport.internal.flags.p;
import com.yandex.passport.internal.j;
import com.yandex.passport.internal.network.h;
import com.yandex.passport.internal.network.l;
import defpackage.ny61;
import defpackage.uza;
import defpackage.yhl;
import java.util.Arrays;
import java.util.Map;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes8.dex */
public final class e {
    public final j a;
    public final Environment b;
    public final com.yandex.passport.internal.network.e c;
    public final com.yandex.passport.common.ui.lang.b d;
    public final f e;
    public final com.yandex.passport.common.common.a f;

    public e(j jVar, Environment environment, com.yandex.passport.internal.network.e eVar, com.yandex.passport.common.ui.lang.b bVar, f fVar, com.yandex.passport.internal.common.j jVar2, com.yandex.passport.common.common.a aVar) {
        this.a = jVar;
        this.b = environment;
        this.c = eVar;
        this.d = bVar;
        this.e = fVar;
        this.f = aVar;
    }

    public final String a() {
        String f;
        f = ((l) this.c).f(this.b, 0L, null);
        return f;
    }

    public final String b(String str, String str2, String str3, Map map) {
        Uri.Builder appendQueryParameter = Uri.parse(e()).buildUpon().appendEncodedPath("broker2/start").appendQueryParameter("consumer", ((com.yandex.passport.internal.common.e) this.f).a()).appendQueryParameter("provider", str).appendQueryParameter("retpath", str2).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("scope", str3).appendQueryParameter("passthrough_errors", "UserDeniedError");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return appendQueryParameter.toString();
    }

    public final byte[] c(String str) {
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("provider_token", str);
        j jVar = this.a;
        String query = appendQueryParameter.appendQueryParameter("client_id", jVar.getDecryptedId()).appendQueryParameter("client_secret", jVar.getDecryptedSecret()).build().getQuery();
        if (query != null) {
            return query.getBytes(uza.a);
        }
        ny61.r("empty query");
        return null;
    }

    public final Uri d() {
        return Uri.parse(a()).buildUpon().appendEncodedPath("closewebview").build();
    }

    public final String e() {
        l lVar = (l) this.c;
        PassportUrlType passportUrlType = PassportUrlType.SOCIAL;
        m mVar = p.d;
        Environment environment = this.b;
        String h = lVar.h(environment, passportUrlType, mVar);
        if (h != null) {
            return h;
        }
        int i = h.a[environment.ordinal()];
        String str = "https://social.yandex.%s";
        if (i != 1) {
            if (i == 2) {
                str = "https://social-test.yandex.%s";
            } else if (i != 3) {
                if (i != 4 && i != 5) {
                    yhl.d(environment, "Unknown environment ");
                    return null;
                }
                str = "";
            }
        }
        return String.format(str, Arrays.copyOf(new Object[]{ClearCryptoProPrefs.COUNTRY}, 1));
    }
}
