package xsna;

import java.net.URL;
import ru.ok.android.commons.http.Http;

/* compiled from: HitmanChallenge.kt */
/* loaded from: classes.dex */
public final class a9v {
    public static final String a(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://" + url.getHost();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void b(zqa zqaVar, okhttp3.k kVar, String str) {
        if (zqaVar != null) {
            zqaVar.f = str;
        }
        boolean f = epx.f(kVar.a(Http.Header.X_CHALLENGE), "required");
        String a = kVar.a(Http.Header.X_CHALLENGE_URL);
        if (!f || a == null) {
            return;
        }
        if (zqaVar != null) {
            zqaVar.d = a;
        }
        if (zqaVar != null) {
            zqaVar.e = str;
        }
    }
}
