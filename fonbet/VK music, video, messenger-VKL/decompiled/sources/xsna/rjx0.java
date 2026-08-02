package xsna;

import android.webkit.WebView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.text.Regex;

/* compiled from: WebviewAccessTokenClient.kt */
/* loaded from: classes15.dex */
public class rjx0 extends dir0 {
    public final sjx0 d;
    public int e;

    public rjx0(sjx0 sjx0Var) {
        this.d = sjx0Var;
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Regex regex = ujx0.g;
        if (!epx.f(str, "https://" + a0a.d + "/client_auth?refresh_token=1")) {
            return false;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.d;
            StringBuilder a = t33.a("shouldOverrideUrlLoading(url=", str, ") watUpdateCounter=");
            a.append(this.e);
            L.u(l, logType, new Object[]{a.toString()});
        }
        if (this.e > 1) {
            return true;
        }
        this.d.a();
        this.e++;
        return true;
    }
}
