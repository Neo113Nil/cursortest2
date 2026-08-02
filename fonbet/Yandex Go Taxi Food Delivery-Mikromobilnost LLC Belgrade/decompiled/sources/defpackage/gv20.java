package defpackage;

import io.appmetrica.analytics.impl.Wf;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class gv20 {
    public final fv20 a;
    public final HashMap b = new HashMap();
    public final ph1 c;

    public gv20(fv20 fv20Var) {
        ph1 ph1Var = new ph1();
        ph1Var.b = "cold";
        this.c = ph1Var;
        this.a = fv20Var;
    }

    public final ev20 a(Wf wf) {
        HashMap hashMap = this.b;
        ev20 ev20Var = (ev20) hashMap.get(wf);
        if (ev20Var != null) {
            return ev20Var;
        }
        ev20 ev20Var2 = new ev20(wf, this.c, this.a);
        hashMap.put(wf, ev20Var2);
        return ev20Var2;
    }
}
