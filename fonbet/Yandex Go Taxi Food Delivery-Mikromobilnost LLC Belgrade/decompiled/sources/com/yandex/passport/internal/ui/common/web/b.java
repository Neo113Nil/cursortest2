package com.yandex.passport.internal.ui.common.web;

import android.content.SharedPreferences;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.passport.internal.config.q;
import com.yandex.passport.internal.sloth.k;
import defpackage.cvu0;
import defpackage.jl40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.text.Regex;

/* loaded from: classes8.dex */
public final class b {
    public static final Regex d = new Regex("^(?:sso\\.|)?(?:passport(?:-rc|-test|)?|id(?:-rc|-test|)|oauth(?:-rc|-test|)|social)\\.(?:yandex(?:-team)?|yango)\\.(?:ru|az|com\\.am|com\\.ge|co\\.il|kg|lv|lt|md|tj|tm|uz|fr|ee|ua|by|kz|com|com\\.tr)$");
    public static final Regex e = new Regex("sso(?:\\.rc|\\.test|)?\\.ya\\.(?:ru|az|com\\.am|com\\.ge|co\\.il|kg|lv|lt|md|tj|tm|uz|fr|ee|ua|by|kz|com|com\\.tr)");
    public final q a;
    public final k b;
    public final com.yandex.passport.internal.network.e c;

    public b(q qVar, k kVar, com.yandex.passport.internal.network.e eVar) {
        this.a = qVar;
        this.b = kVar;
        this.c = eVar;
    }

    public final boolean a(String str) {
        if (d.a(str) || e.a(str)) {
            return true;
        }
        String string = ((SharedPreferences) this.a.b.getValue()).getString("white_list_key", null);
        return string != null ? new Regex(string).a(str) : false;
    }

    public final boolean b(String str) {
        String j = com.yandex.passport.common.url.b.j(str);
        Locale locale = Locale.US;
        String lowerCase = j.toLowerCase(locale);
        if (lowerCase.equals(Constants.SCHEME) || lowerCase.equals("http")) {
            String lowerCase2 = com.yandex.passport.common.url.b.g(str).toLowerCase(locale);
            if (new Regex("^(?:[a-z0-9]\\.)*youtube\\.[a-z]+$").a(lowerCase2)) {
                return true;
            }
            String h = com.yandex.passport.common.url.b.h(str);
            if (h != null) {
                String lowerCase3 = h.toLowerCase(locale);
                if (new Regex("^(?:yandex(?:-team)?|yango)\\.(?:ru|az|com\\.am|com\\.ge|co\\.il|kg|lv|lt|md|tj|tm|uz|fr|ee|ua|by|kz|com|com\\.tr)$").a(lowerCase2) && (cvu0.x(lowerCase3, "/legal/", false) || cvu0.x(lowerCase3, "/support/", false))) {
                    return true;
                }
                if (new Regex("^id.(?:yandex(?:-team)?|yango)\\.(?:ru|az|com\\.am|com\\.ge|co\\.il|kg|lv|lt|md|tj|tm|uz|fr|ee|ua|by|kz|com|com\\.tr)$").a(lowerCase2) && cvu0.x(lowerCase3, "/about", false)) {
                    return true;
                }
                k kVar = this.b;
                kVar.getClass();
                Uri a = k.a(Uri.parse(str));
                ArrayList m0 = kotlin.collections.a.m0(kVar.c, kVar.d.values());
                if (!m0.isEmpty()) {
                    Iterator it = m0.iterator();
                    while (it.hasNext()) {
                        Uri a2 = k.a(Uri.parse((String) it.next()));
                        if (jl40.l(a2.getScheme(), a.getScheme()) && jl40.l(a2.getAuthority(), a.getAuthority()) && jl40.l(a2.getPath(), a.getPath()) && (jl40.l(a2.getQuery(), a.getQuery()) || jl40.l(a2.getEncodedQuery(), a.getEncodedQuery()))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean c(String str) {
        String j = com.yandex.passport.common.url.b.j(str);
        Locale locale = Locale.US;
        String lowerCase = j.toLowerCase(locale);
        if (lowerCase.equals("http") || lowerCase.equals(Constants.SCHEME)) {
            String lowerCase2 = com.yandex.passport.common.url.b.g(str).toLowerCase(locale);
            String h = com.yandex.passport.common.url.b.h(str);
            if (h != null) {
                String lowerCase3 = h.toLowerCase(locale);
                if (a(lowerCase2) && (cvu0.x(lowerCase3, "/restoration/semi_auto", false) || cvu0.x(lowerCase3, "/restoration/twofa ", false))) {
                    return true;
                }
            }
        }
        return false;
    }
}
