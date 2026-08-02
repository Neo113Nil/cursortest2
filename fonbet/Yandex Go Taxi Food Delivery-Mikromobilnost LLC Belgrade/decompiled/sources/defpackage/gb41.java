package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes4.dex */
public final class gb41 {
    public static fc41 a(sbx sbxVar, String str) {
        int i;
        fc41 fc41Var = (fc41) sbxVar.b(fc41.Companion.serializer(), str);
        fc41Var.getClass();
        List g = scc.g(2, 3);
        int i2 = fc41Var.b;
        if (!g.contains(Integer.valueOf(i2))) {
            ny61.g(oyr.j(i2, "Unsupported photo verification contract version: ", ". Supported: 2, 3"));
            return null;
        }
        for (fb41 fb41Var : fc41Var.d) {
            List g2 = scc.g("landscape", "portrait");
            String str2 = fb41Var.d;
            String str3 = fb41Var.f;
            if (!g2.contains(str2)) {
                w511.f(oyr.l(i2, "Contract v", " only supports 'landscape', 'portrait' orientation, got '", fb41Var.d, "'"));
                return null;
            }
            if (!scc.g("front", "back").contains(str3)) {
                w511.f(oyr.l(i2, "Contract v", " only supports 'front' or 'back' camera, got '", str3, "'"));
                return null;
            }
            ec41 ec41Var = fb41Var.h;
            if (ec41Var != null && (i = ec41Var.a) < 0) {
                w511.f(oyr.i(i, "self_timer timeout must be >= 0, got "));
                return null;
            }
        }
        int max = Math.max(2, 2);
        if (max <= i2 && i2 <= 3) {
            return fc41Var;
        }
        ny61.g(oyr.h(max, i2, "Config contract version incompatible: SDK supports v", "-v3, got v"));
        return null;
    }

    public final KSerializer serializer() {
        return cb41.a;
    }
}
