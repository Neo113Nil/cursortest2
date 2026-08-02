package yads;

import com.ironsource.O6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import xsna.pn00;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class lv {
    public final v9 a;
    public final d4 b;
    public final b02 c;
    public final jp2 d;
    public final sx e;
    public final we f;

    public lv(v9 v9Var, d4 d4Var, b02 b02Var, jp2 jp2Var, sx sxVar, we weVar) {
        this.a = v9Var;
        this.b = d4Var;
        this.c = b02Var;
        this.d = jp2Var;
        this.e = sxVar;
        this.f = weVar;
    }

    public final fp2 a(dp2 dp2Var, Map map) {
        if (!ttp0.g(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String str = cp2.a;
        if (str == null) {
            map.put(O6.G1, StringUtils.UNDEFINED);
        } else {
            map.put(O6.G1, str);
        }
        gp2 a = this.e.a(this.a, this.b);
        c cVar = a.b;
        LinkedHashMap n = pn00.n(map, a.a);
        LinkedHashMap linkedHashMap = ttp0.g(n) ? n : null;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        e13 e13Var = this.b.d.a;
        if (e13Var != null) {
            String str2 = e13Var.b().b;
            if (str2 == null) {
                linkedHashMap.put("size_type", StringUtils.UNDEFINED);
            } else {
                linkedHashMap.put("size_type", str2);
            }
            linkedHashMap.put("width", Integer.valueOf(e13Var.getWidth()));
            linkedHashMap.put("height", Integer.valueOf(e13Var.getHeight()));
        }
        b02 b02Var = this.c;
        if (b02Var != null) {
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("asset_name", b02Var.a);
            mapBuilder.put("action_type", b02Var.b);
            j32 j32Var = b02Var.c;
            if (j32Var != null) {
                mapBuilder.putAll(j32Var.a().a);
            }
            Map map2 = b02Var.d.a;
            if (map2 != null) {
                mapBuilder.putAll(map2);
            }
            linkedHashMap.putAll(mapBuilder.h());
        }
        return new fp2(dp2Var.b, new LinkedHashMap(linkedHashMap), cVar);
    }
}
