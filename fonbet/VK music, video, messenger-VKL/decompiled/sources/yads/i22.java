package yads;

import android.content.Context;
import java.util.Map;
import org.json.JSONException;
import xsna.jgp;
import xsna.mnh0;

/* loaded from: classes10.dex */
public final class i22 implements fr2 {
    public final rn3 a;
    public final b52 b;

    public /* synthetic */ i22(Context context, bu1 bu1Var) {
        this(f92.a(), new b52(context, bu1Var));
    }

    @Override // yads.fr2
    public final Object a(g92 g92Var) {
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
        if (a == null || a.length() == 0) {
            return null;
        }
        Map map3 = g92Var.c;
        if (map3 != null) {
            map2 = map3;
        }
        try {
            return this.b.a(a, new kn(map2));
        } catch (JSONException e) {
            mnh0.A(e);
            return null;
        } catch (a22 e2) {
            mnh0.A(e2);
            return null;
        }
    }

    public i22(rn3 rn3Var, b52 b52Var) {
        this.a = rn3Var;
        this.b = b52Var;
    }
}
