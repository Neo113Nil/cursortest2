package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class krw {
    public final ew2 a;

    public krw(qh41 qh41Var) {
        this.a = qh41Var.r;
    }

    public final void a(boolean z, String str, Throwable th) {
        String str2 = z ? "wm_error_foreground" : "wm_error_background";
        Pair pair = new Pair("type", str);
        Pair pair2 = new Pair("error", th.getClass().getName());
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        Map i = b.i(pair, pair2, new Pair(Constants.KEY_MESSAGE, message));
        ew2 ew2Var = this.a;
        ew2Var.c(str2, i);
        vx21.b(new t7j(23, ew2Var, str2, th));
    }
}
