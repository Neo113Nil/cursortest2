package yads;

import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class de2 implements oo {
    public final qu2 a;
    public final j93 b;
    public final o93 c;

    public de2(String str, qu2 qu2Var, j93 j93Var, o93 o93Var) {
        this.a = qu2Var;
        this.b = j93Var;
        this.c = o93Var;
    }

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
        mn3Var.getClass();
        Pair pair = new Pair("tracking_result", "failure");
        Pair pair2 = new Pair("tracking_url_type", this.c.name().toLowerCase(Locale.ROOT));
        String message = mn3Var.getMessage();
        if (message == null) {
            message = "Unknown Volley error";
        }
        LinkedHashMap m = pn00.m(pair, pair2, new Pair("error_message", message));
        j93 j93Var = this.b;
        dp2 dp2Var = dp2.c;
        j93Var.a(m, this.a);
    }

    @Override // yads.vq2
    public final void a(Object obj) {
        LinkedHashMap m = pn00.m(new Pair("tracking_result", "success"), new Pair("tracking_url_type", this.c.name().toLowerCase(Locale.ROOT)), new Pair("code", Integer.valueOf(((g92) obj).a)));
        j93 j93Var = this.b;
        dp2 dp2Var = dp2.c;
        j93Var.a(m, this.a);
    }
}
