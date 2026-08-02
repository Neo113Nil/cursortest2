package yads;

import android.webkit.WebView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.drm0;

/* loaded from: classes10.dex */
public final class cp3 {
    public final dk2 a;

    public cp3(dk2 dk2Var) {
        this.a = dk2Var;
    }

    public final void a() {
        String a = this.a.a();
        String g0 = a != null ? drm0.g0(a, StringUtils.PROCESS_POSTFIX_DELIMITER, "") : null;
        if (g0 == null || g0.length() <= 0) {
            return;
        }
        try {
            WebView.setDataDirectorySuffix(g0);
        } catch (Throwable unused) {
        }
    }
}
