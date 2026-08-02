package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes9.dex */
public final class j2t {
    public final Map a = Collections.synchronizedMap(new WeakHashMap());

    public final i2t a(r0t r0tVar) {
        i2t i2tVar = (i2t) this.a.get(r0tVar);
        if (i2tVar != null) {
            return i2tVar;
        }
        jst.e.s(new IllegalStateException(oyr.p("Unknown response id ", r0tVar.a, ", fallback to defaults")));
        return new i2t(7);
    }

    public final void b(g2t g2tVar) {
        rtx0 rtx0Var;
        rtx0 rtx0Var2;
        r0t r0tVar = g2tVar.c;
        u6r u6rVar = g2tVar.a.a;
        sxq0 sxq0Var = u6rVar.d;
        kw11 kw11Var = null;
        Boolean bool = (sxq0Var == null || (rtx0Var2 = sxq0Var.a) == null) ? null : rtx0Var2.a;
        if (sxq0Var != null && (rtx0Var = sxq0Var.a) != null) {
            kw11Var = rtx0Var.c;
        }
        this.a.put(r0tVar, new i2t(bool, kw11Var, u6rVar.f(SimpleBooleanExperiment.SHOULD_ACTIVATE_SHORTCUTS_FOR_UNAVAILABLE_ZONE)));
    }
}
