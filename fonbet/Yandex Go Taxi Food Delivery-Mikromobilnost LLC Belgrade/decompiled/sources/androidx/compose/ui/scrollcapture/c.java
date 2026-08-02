package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.node.s;
import androidx.compose.ui.semantics.d;
import defpackage.bhp0;
import defpackage.cnq0;
import defpackage.cvw;
import defpackage.f6w;
import defpackage.gwk0;
import defpackage.khp0;
import defpackage.s8o;
import defpackage.tls;
import defpackage.wls;
import defpackage.wz40;
import defpackage.x4e;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class c {
    public static final void a(androidx.compose.ui.semantics.c cVar, int i, tls tlsVar) {
        androidx.compose.ui.semantics.c cVar2;
        wz40 wz40Var = new wz40(new androidx.compose.ui.semantics.c[16]);
        List i2 = cVar.i(false, false);
        while (true) {
            wz40Var.d(wz40Var.c, i2);
            while (true) {
                int i3 = wz40Var.c;
                if (i3 == 0) {
                    return;
                }
                cVar2 = (androidx.compose.ui.semantics.c) wz40Var.k(i3 - 1);
                boolean P = cvw.P(cVar2);
                cnq0 cnq0Var = cVar2.d;
                if (!P) {
                    if (cnq0Var.a.b(d.j)) {
                        continue;
                    } else {
                        s d = cVar2.d();
                        if (d == null) {
                            throw x4e.v("Expected semantics node to have a coordinator.");
                        }
                        f6w P2 = s8o.P(gwk0.j(d, true));
                        if (P2.a < P2.c && P2.b < P2.d) {
                            wls wlsVar = (wls) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.e);
                            bhp0 bhp0Var = (bhp0) androidx.compose.ui.semantics.b.a(cnq0Var, d.w);
                            if (wlsVar != null && bhp0Var != null && ((Number) bhp0Var.b.invoke()).floatValue() > 0.0f) {
                                int i4 = 1 + i;
                                ((ScrollCapture$onScrollCaptureSearch$1) tlsVar).invoke(new khp0(cVar2, i4, P2, d));
                                a(cVar2, i4, tlsVar);
                            }
                        }
                    }
                }
            }
            i2 = cVar2.i(false, false);
        }
    }
}
