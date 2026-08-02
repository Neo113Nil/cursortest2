package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class cy1 {
    public final v9 a;
    public final bu1 b;
    public boolean c;
    public boolean d;
    public boolean e;

    public cy1(Context context, v9 v9Var, ov2 ov2Var) {
        this.a = v9Var;
        mv3 mv3Var = (mv3) ov2Var;
        mv3Var.d();
        tv3 tv3Var = tv3.a;
        this.b = cf.a(context, mv3Var.b());
        this.c = true;
        this.d = true;
        this.e = true;
    }

    public final void a(String str) {
        dp2 dp2Var = dp2.c;
        HashMap i = pn00.i(new Pair("event_type", str));
        this.b.a(new fp2("multibanner_event", new LinkedHashMap(i), this.a.i));
    }
}
