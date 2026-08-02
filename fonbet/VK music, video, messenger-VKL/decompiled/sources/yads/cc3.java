package yads;

import android.net.Uri;
import android.webkit.URLUtil;
import kotlin.Result;
import xsna.go9;

/* loaded from: classes10.dex */
public abstract class cc3 {
    public static String a(String str) {
        Object failure;
        try {
            failure = Uri.parse(b(str)).getHost();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static String b(String str) {
        return (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) ? str : go9.b("https://", str);
    }
}
