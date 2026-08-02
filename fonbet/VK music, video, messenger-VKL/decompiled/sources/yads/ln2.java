package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ln2 {
    public final v9 a;
    public final jp2 b;
    public final ij c;
    public boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ln2(Context context, ov2 ov2Var, o5 o5Var, e00 e00Var, v9 v9Var, String str) {
        this(o5Var, e00Var, v9Var, str, cf.a(context, r8.b()));
        mv3 mv3Var = (mv3) ov2Var;
        mv3Var.d();
        tv3 tv3Var = tv3.a;
    }

    public final void a() {
        if (this.d) {
            this.d = false;
            return;
        }
        gp2 a = this.c.a();
        Map map = this.a.u;
        if (map != null) {
            a.a.putAll(map);
        }
        c cVar = this.a.i;
        a.b = cVar;
        this.b.a(new fp2(dp2.z.a(), new LinkedHashMap(a.a), cVar));
    }

    public ln2(o5 o5Var, e00 e00Var, v9 v9Var, String str, jp2 jp2Var) {
        this.a = v9Var;
        this.b = jp2Var;
        this.c = new ij(o5Var, e00Var, str);
        this.d = true;
    }
}
