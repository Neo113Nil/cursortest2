package xsna;

import xsna.q630;

/* compiled from: Crossfade.kt */
/* loaded from: classes18.dex */
public final class njk {
    public static final void a(Object obj, izs izsVar, q630 q630Var, phr phrVar, String str, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        phr phrVar2;
        androidx.compose.runtime.a M = aVar.M(965850053);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(obj) : M.y(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            i3 |= M.J(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            dtp0 d = jq2.d(0, 0, null, 7);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(965850053, i3, -1, "com.vk.ecomm.tool.compose.utils.Crossfade (Crossfade.kt:21)");
            }
            int i4 = i3 >> 3;
            q630.a aVar2 = q630.a.a;
            ijk.b(ump0.e(obj, str, M, (i3 & 14) | ((i3 >> 9) & 112), 0), aVar2, d, izsVar, jaiVar, M, ((i3 << 6) & 7168) | (i4 & 1008) | (i4 & 57344), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
            phrVar2 = d;
        } else {
            M.h();
            q630Var2 = q630Var;
            phrVar2 = phrVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k1a(obj, izsVar, q630Var2, phrVar2, str, jaiVar, i);
        }
    }
}
