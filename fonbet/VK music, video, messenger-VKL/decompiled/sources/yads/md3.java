package yads;

import android.content.Context;
import java.util.Map;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class md3 {
    public final rn3 a;
    public final ie3 b;

    public /* synthetic */ md3(Context context, bu1 bu1Var) {
        this(f92.a(), new ie3(context, bu1Var));
    }

    public final id3 a(g92 g92Var) {
        String c;
        rn3 rn3Var = this.a;
        rn3Var.a.getClass();
        int i = g92Var.a;
        yq2 yq2Var = new yq2(g92Var.b);
        Map map = g92Var.c;
        Map map2 = jgp.b;
        if (map == null) {
            map = map2;
        }
        String a = ((j92) rn3Var.b).a(new xq2(i, yq2Var, map));
        Map map3 = g92Var.c;
        if (map3 != null) {
            map2 = map3;
        }
        kn knVar = new kn(map2);
        if (a != null && a.length() != 0) {
            try {
                dd3 a2 = this.b.a(a, knVar);
                if (a2 != null) {
                    Map map4 = g92Var.c;
                    if (map4 != null && (c = u01.c(map4, w11.B)) != null && Boolean.parseBoolean(c)) {
                        return new id3(a2, a);
                    }
                    a = null;
                    return new id3(a2, a);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public md3(rn3 rn3Var, ie3 ie3Var) {
        this.a = rn3Var;
        this.b = ie3Var;
    }
}
