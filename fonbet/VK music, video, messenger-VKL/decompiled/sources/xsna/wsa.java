package xsna;

import java.util.Iterator;
import xsna.axp;
import xsna.xup;

/* compiled from: ChangeSourceScenario.kt */
/* loaded from: classes8.dex */
public final class wsa<T extends axp> implements m5h0<T> {
    public final xds0 a;

    public wsa(xds0 xds0Var) {
        this.a = xds0Var;
    }

    @Override // xsna.m5h0
    public final xup a(T t, sht0 sht0Var) {
        if (sht0Var != null) {
            xds0 xds0Var = this.a;
            Iterator<sht0> it = xds0Var.a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (epx.f(sht0Var.b, it.next().b)) {
                    break;
                }
                i++;
            }
            Integer valueOf = Integer.valueOf(i);
            if (i == -1) {
                valueOf = null;
            }
            sht0 sht0Var2 = valueOf != null ? (sht0) j5g.b0(valueOf.intValue() + 1, xds0Var.a) : null;
            if (sht0Var2 != null) {
                return new xup.c(sht0Var2);
            }
        }
        return new xup.i();
    }
}
