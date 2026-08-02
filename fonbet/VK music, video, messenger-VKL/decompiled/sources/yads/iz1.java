package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class iz1 {
    public final bu1 a;
    public final ij b;

    public iz1(Context context, ov2 ov2Var, o5 o5Var, e00 e00Var, String str) {
        mv3 mv3Var = (mv3) ov2Var;
        mv3Var.d();
        tv3 tv3Var = tv3.a;
        this.a = cf.a(context, mv3Var.b());
        this.b = new ij(o5Var, e00Var, str);
    }

    public final void a(ArrayList arrayList, dp2 dp2Var) {
        gp2 a = this.b.a();
        a.b(arrayList, "assets");
        Map map = a.a;
        this.a.a(new fp2(dp2Var.b, new LinkedHashMap(map), a.b));
    }
}
