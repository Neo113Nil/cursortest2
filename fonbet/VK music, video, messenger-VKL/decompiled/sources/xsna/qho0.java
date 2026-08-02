package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import xsna.v4s;

/* compiled from: TextFieldSize.kt */
/* loaded from: classes11.dex */
public final class qho0 {
    public LayoutDirection a;
    public azl b;
    public v4s.a c;
    public nmo0 d;
    public Object e;
    public final wh50 f = androidx.compose.runtime.k.b(Boolean.TRUE);
    public long g;

    public qho0(LayoutDirection layoutDirection, azl azlVar, v4s.a aVar, nmo0 nmo0Var, Object obj) {
        long a;
        this.a = layoutDirection;
        this.b = azlVar;
        this.c = aVar;
        this.d = nmo0Var;
        this.e = obj;
        a = sfo0.a(this.d, this.b, this.c, sfo0.a, 1);
        this.g = a;
    }

    public static void a(qho0 qho0Var, LayoutDirection layoutDirection, azl azlVar, nmo0 nmo0Var, int i) {
        if ((i & 1) != 0) {
            layoutDirection = qho0Var.a;
        }
        if ((i & 2) != 0) {
            azlVar = qho0Var.b;
        }
        v4s.a aVar = qho0Var.c;
        if ((i & 8) != 0) {
            nmo0Var = qho0Var.d;
        }
        Object obj = qho0Var.e;
        LayoutDirection layoutDirection2 = qho0Var.a;
        wh50 wh50Var = qho0Var.f;
        if (layoutDirection == layoutDirection2 && epx.f(azlVar, qho0Var.b) && epx.f(aVar, qho0Var.c) && epx.f(nmo0Var, qho0Var.d)) {
            if (epx.f(obj, qho0Var.e)) {
                return;
            }
            qho0Var.e = obj;
            ((zak0) wh50Var).setValue(Boolean.TRUE);
            return;
        }
        qho0Var.a = layoutDirection;
        qho0Var.b = azlVar;
        qho0Var.c = aVar;
        qho0Var.d = nmo0Var;
        ((zak0) wh50Var).setValue(Boolean.TRUE);
    }
}
