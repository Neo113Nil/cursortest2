package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.text.Regex;

/* loaded from: classes15.dex */
public abstract class cqy {
    public static final Regex a;
    public static final Regex b;
    public static final Regex c;

    static {
        j73.f0(new String[]{Constants.SCHEME, "telemost"});
        Collections.singleton("http");
        a = new Regex("https://telemost(?:\\.dsp|\\.dst)?\\.yandex\\.ru/j/\\d+(?:[/?].*)?");
        b = new Regex("https://telemost(?:\\.dsp|\\.dst)?\\.360\\.yandex\\.ru/j/\\d+(?:[/?].*)?");
        c = new Regex("^\\d+$");
    }

    public static String a(String str, String str2) {
        String Q = evu0.Q(str2, str);
        String g0 = evu0.g0(Q, "/", Q);
        if (!c.h(g0)) {
            g0 = null;
        }
        return g0 == null ? "" : g0;
    }

    public static String b(String str) {
        String failure;
        try {
            List<String> pathSegments = Uri.parse(str).getPathSegments();
            failure = (pathSegments.size() < 2 || !jl40.l(pathSegments.get(0), CoreConstants.PushMessage.PROCESSING_MIN_TIME)) ? "" : (String) pathSegments.get(1);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (String) (failure instanceof Result.Failure ? "" : failure);
    }

    public static boolean c(String str) {
        boolean h = a.h(str);
        Regex regex = c;
        if ((h || b.h(str)) ? regex.h(b(str)) : cvu0.x(str, "telemost://j/", false) ? regex.h(a(str, "telemost://j/")) : false) {
            return true;
        }
        return cvu0.x(str, "https://telemost.yandex-team.ru/j/", false) ? regex.h(b(str)) : cvu0.x(str, "telemost://yandex-team/", false) ? regex.h(a(str, "telemost://yandex-team/")) : false;
    }
}
