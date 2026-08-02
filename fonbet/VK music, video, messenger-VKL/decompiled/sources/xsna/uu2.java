package xsna;

import android.net.Uri;
import okhttp3.p;
import ru.ok.android.commons.http.Http;
import xsna.tu2;

/* compiled from: AnonymousOkHttpExecutor.kt */
/* loaded from: classes.dex */
public final class uu2 {
    public static final tu2.a a(vx70 vx70Var, alv alvVar, zqa zqaVar) {
        String str;
        String str2;
        String str3 = alvVar.a;
        if (zqaVar == null || !zqaVar.a()) {
            str = str3;
        } else {
            Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
            if (zqaVar.c.length() > 0) {
                buildUpon.appendQueryParameter("success_token", zqaVar.c);
            } else {
                buildUpon.appendQueryParameter("captcha_key", zqaVar.b);
            }
            buildUpon.appendQueryParameter("captcha_sid", zqaVar.a);
            Integer num = zqaVar.i;
            if (num != null) {
                buildUpon.appendQueryParameter("captcha_attempt", String.valueOf(num.intValue()));
            }
            Double d = zqaVar.j;
            if (d != null) {
                buildUpon.appendQueryParameter("captcha_ts", String.valueOf(d.doubleValue()));
            }
            Boolean bool = zqaVar.h;
            if (bool != null) {
                buildUpon.appendQueryParameter("is_sound_captcha", bool.booleanValue() ? "1" : "0");
            }
            str = buildUpon.build().toString();
        }
        p.a aVar = new p.a();
        aVar.f("POST", alvVar.e.invoke());
        aVar.c(okhttp3.c.n);
        aVar.i(str);
        if (zqaVar != null && (str2 = zqaVar.g) != null) {
            aVar.c.b(Http.Header.X_CHALLENGE_SOLUTION, str2);
        }
        for (gnk gnkVar : alvVar.f) {
            aVar.a(gnkVar.a(), gnkVar.b());
        }
        okhttp3.u g = vx70Var.g(aVar.b());
        a9v.b(zqaVar, g.s(), a9v.a(str3));
        return new tu2.a(vx70Var.o(g), g.s(), g.o(), g.A().a.i);
    }
}
