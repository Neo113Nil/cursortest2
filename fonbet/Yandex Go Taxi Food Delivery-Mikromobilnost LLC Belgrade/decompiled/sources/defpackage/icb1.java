package defpackage;

import android.view.KeyEvent;
import com.yandex.go.design.compose.modal.bottomsheet.c;

/* loaded from: classes11.dex */
public abstract class icb1 {
    public static mgv a;

    public static final void a(yv6 yv6Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2065357913);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(yv6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c.a(null, null, null, false, false, null, null, wwg.S(-121466727, true, new wg0(i3, tlsVar), btsVar), null, null, null, wwg.S(29812807, true, new l0(3, yv6Var, tlsVar), btsVar), btsVar, 12582912, 48, 1919);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(yv6Var, tlsVar, i, 10);
        }
    }

    public static final int b(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }
}
