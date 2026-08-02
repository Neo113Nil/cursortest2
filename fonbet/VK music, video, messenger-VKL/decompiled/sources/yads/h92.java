package yads;

import java.util.Map;
import org.json.JSONException;
import xsna.emb;

/* loaded from: classes10.dex */
public final class h92 {
    public final gn2 a;
    public final in2 b;

    public /* synthetic */ h92() {
        this(new gn2(), in2.b.a());
    }

    public final g92 a(qp2 qp2Var) {
        String str;
        in2 in2Var = this.b;
        in2Var.getClass();
        synchronized (in2.c) {
            str = (String) in2Var.a.get(qp2Var);
            in2Var.a.remove(qp2Var);
        }
        if (str == null) {
            return null;
        }
        try {
            this.a.getClass();
            en2 a = gn2.a(str);
            byte[] bytes = a.b.getBytes(emb.b);
            Map map = a.a;
            return new g92(200, bytes, map, g92.a(map), false);
        } catch (JSONException unused) {
            return null;
        }
    }

    public h92(gn2 gn2Var, in2 in2Var) {
        this.a = gn2Var;
        this.b = in2Var;
    }
}
