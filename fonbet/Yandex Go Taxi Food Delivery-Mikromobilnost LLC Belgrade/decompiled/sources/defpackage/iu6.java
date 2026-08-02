package defpackage;

import kotlin.time.DurationUnit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class iu6 {
    public final cne0 a;
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public ntv c;

    public iu6(dne0 dne0Var) {
        this.a = dne0Var.a("bullets_order_popup_prefs");
    }

    public final boolean a(int i, String str, boolean z, int i2) {
        boolean z2;
        if (!z) {
            cne0 cne0Var = this.a;
            boolean z3 = qv10.d("bullets_order_popup_show_count", str, cne0Var, 0) < i;
            long currentTimeMillis = System.currentTimeMillis();
            if (i2 > 0) {
                long j = currentTimeMillis - cne0Var.j(str, 0L);
                o430 o430Var = e3n.b;
                if (j <= e3n.e(kp50.U(i2, DurationUnit.DAYS))) {
                    z2 = false;
                    if (z3 || !z2) {
                        return false;
                    }
                }
            }
            z2 = true;
            if (z3) {
            }
            return false;
        }
        return true;
    }
}
