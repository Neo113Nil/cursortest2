package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.jgp;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class fh3 {
    public final v9 a;
    public final bu1 b;
    public final dh3 c;
    public v71 d;
    public eh3 e;
    public Map f;

    public fh3(Context context, ov2 ov2Var, v9 v9Var, w5 w5Var) {
        this.a = v9Var;
        mv3 mv3Var = (mv3) ov2Var;
        mv3Var.d();
        tv3 tv3Var = tv3.a;
        this.b = cf.a(context, mv3Var.b());
        this.c = new dh3(w5Var);
    }

    public final void a(Map map) {
        Map map2 = this.f;
        Map map3 = jgp.b;
        if (map2 == null) {
            map2 = map3;
        }
        map.putAll(map2);
        if (this.d != null) {
            if (!ttp0.g(map3)) {
                map3 = null;
            }
            if (map3 == null) {
                map3 = new LinkedHashMap();
            }
            d00 d00Var = e00.c;
            map3.put("ad_type", "instream");
            throw null;
        }
        map.putAll(map3);
        eh3 eh3Var = this.e;
        Map map4 = eh3Var != null ? eh3Var.a().a : null;
        if (map4 != null) {
            map3 = map4;
        }
        map.putAll(map3);
        dp2 dp2Var = dp2.c;
        v9 v9Var = this.a;
        this.b.a(new fp2("video_ad_rendering_result", new LinkedHashMap(map), v9Var != null ? v9Var.i : null));
    }
}
