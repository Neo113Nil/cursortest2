package yads;

import java.net.URI;
import kotlin.Result;
import xsna.drm0;
import xsna.go9;

/* loaded from: classes10.dex */
public abstract class bc3 {
    public static String a(String str) {
        Object failure;
        String str2;
        try {
            boolean D = drm0.D(str, "://", false);
            if (!D) {
                str = b(str);
            }
            URI uri = new URI(str);
            if (D) {
                str2 = uri.getScheme() + "://";
            } else {
                str2 = "";
            }
            failure = str2 + uri.getHost();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = "bad_url";
        }
        return (String) failure;
    }

    public static String b(String str) {
        return go9.b("stub://", str);
    }
}
