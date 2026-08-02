package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class j93 {
    public final d4 a;
    public final jp2 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ j93(Context context, d4 d4Var, ov2 ov2Var) {
        this(d4Var, cf.a(context, r4.b()));
        mv3 mv3Var = (mv3) ov2Var;
        mv3Var.d();
        tv3 tv3Var = tv3.a;
    }

    public final void a(Map map, qu2 qu2Var) {
        dp2 dp2Var = dp2.c;
        if (qu2Var == null || !qu2Var.z0) {
            return;
        }
        d4 d4Var = this.a;
        Pair pair = new Pair("ad_type", d4Var.a.b);
        String str = d4Var.c.a;
        if (str == null) {
            str = "";
        }
        this.b.a(new fp2("tracking_event", new LinkedHashMap(pn00.n(pn00.k(pair, new Pair("ad_unit_id", str)), map)), null));
    }

    public j93(d4 d4Var, jp2 jp2Var) {
        this.a = d4Var;
        this.b = jp2Var;
    }
}
