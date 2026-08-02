package defpackage;

import androidx.compose.animation.core.b;
import androidx.compose.ui.platform.j;
import com.adjust.sdk.Constants;

/* loaded from: classes11.dex */
public abstract class ger {
    public static final ck11 a;

    static {
        sb2.K(Constants.MINIMAL_ERROR_STATUS_CODE, 0, null, 6);
        a = sb2.K(Constants.MINIMAL_ERROR_STATUS_CODE, 0, null, 6);
    }

    public static final int a(wg6 wg6Var, float f, boolean z, fid fidVar, int i, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        boolean z3 = (i2 & 4) != 0;
        m3u0 a2 = b.a(f, a, null, null, fidVar, ((i >> 3) & 14) | ((i >> 9) & 112), 12);
        bts btsVar = (bts) fidVar;
        fwi fwiVar = (fwi) btsVar.m(j.h);
        int i3 = (i & 14) ^ 6;
        boolean z4 = (i3 > 4 && btsVar.k(wg6Var)) || (i & 6) == 4;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (z4 || Q == o430Var) {
            Q = new fer(fwiVar, z3, wg6Var, a2);
            btsVar.o0(Q);
        }
        fer ferVar = (fer) Q;
        boolean z5 = (i3 > 4 && btsVar.k(wg6Var)) || (i & 6) == 4;
        Object Q2 = btsVar.Q();
        if (z5 || Q2 == o430Var) {
            Q2 = new dtr0(wg6Var.e(-1, ferVar));
            btsVar.o0(Q2);
        }
        int i4 = ((dtr0) Q2).a;
        if (z2) {
            wg6Var.f = i4;
        }
        boolean k = btsVar.k(ferVar) | ((i3 > 4 && btsVar.k(wg6Var)) || (i & 6) == 4);
        Object Q3 = btsVar.Q();
        if (k || Q3 == o430Var) {
            Q3 = new sxo(10, wg6Var, ferVar);
            btsVar.o0(Q3);
        }
        zpn.a(wg6Var, (tls) Q3, btsVar);
        return i4;
    }
}
