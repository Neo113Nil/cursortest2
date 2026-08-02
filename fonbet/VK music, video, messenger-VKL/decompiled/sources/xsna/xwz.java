package xsna;

import java.util.ArrayList;
import xsna.hxz;

/* compiled from: LocalizedParamsDescriptionBuilder.kt */
/* loaded from: classes5.dex */
public final class xwz {
    public static final exz b = new exz(", ");
    public static final exz c = new exz(" ");
    public final ArrayList a = new ArrayList();

    public static gxz c(wwz wwzVar) {
        if (wwzVar instanceof gxz) {
            gxz gxzVar = (gxz) wwzVar;
            if (gxzVar.b.equals(hxz.b.a)) {
                wwzVar = gxzVar.a;
            }
        }
        return new gxz(wwzVar, hxz.a.a);
    }

    public static gxz d(wwz wwzVar) {
        if (wwzVar instanceof gxz) {
            gxz gxzVar = (gxz) wwzVar;
            if (gxzVar.b.equals(hxz.a.a)) {
                wwzVar = gxzVar.a;
            }
        }
        return new gxz(wwzVar, hxz.b.a);
    }

    public static fxz e(int i) {
        return new fxz(i, null);
    }

    public final void a(wwz wwzVar) {
        this.a.add(wwzVar);
    }

    public final void b(wwz wwzVar, boolean z) {
        if (this.a.isEmpty()) {
            if (z) {
                wwzVar = c(wwzVar);
            }
            a(wwzVar);
        } else {
            a(b);
            if (z) {
                wwzVar = d(wwzVar);
            }
            a(wwzVar);
        }
    }
}
