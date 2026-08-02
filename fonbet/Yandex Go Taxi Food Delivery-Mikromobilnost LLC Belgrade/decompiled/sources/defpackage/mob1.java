package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.compose.animation.core.b;
import androidx.compose.ui.node.d;
import com.ybsdk.core.common.utils.theme.ThemedBooleanParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class mob1 {
    public static final void a(String str, String str2, boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(753243970);
        int i2 = 4;
        int i3 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            m3u0 b = b.b(z ? 1.0f : 0.0f, sb2.K(200, 0, null, 6), "dividerAlpha", null, btsVar, 3120, 20);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                List g = scc.g(str, str2);
                ArrayList arrayList = new ArrayList();
                for (Object obj : g) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                Q = a.X(arrayList, ". ", null, null, null, 62);
                btsVar.o0(Q);
            }
            String str3 = (String) Q;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            boolean k = btsVar.k(str3);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new vsq(str3, 28);
                btsVar.o0(Q2);
            }
            f530 a2 = fnq0.a(c530Var, (tls) Q2);
            androidx.compose.runtime.internal.a S = wwg.S(-1467441719, true, new i0(str, str2, i2), btsVar);
            btsVar = btsVar;
            ydb1.a(a2, null, S, null, null, null, null, false, btsVar, 384, 250);
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            yrl.c(tra1.b(c530Var, ((Number) b.getValue()).floatValue()), null, btsVar, 0, 6);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(str, str2, z, i, 13);
        }
    }

    public static int b(String str) {
        if (str.charAt(0) == '#') {
            if (str.length() == 5) {
                char charAt = str.charAt(1);
                char charAt2 = str.charAt(2);
                char charAt3 = str.charAt(3);
                char charAt4 = str.charAt(4);
                str = new String(new char[]{'#', charAt, charAt, charAt2, charAt2, charAt3, charAt3, charAt4, charAt4});
            } else if (str.length() == 4) {
                char charAt5 = str.charAt(1);
                char charAt6 = str.charAt(2);
                char charAt7 = str.charAt(3);
                str = new String(new char[]{'#', charAt5, charAt5, charAt6, charAt6, charAt7, charAt7});
            }
        }
        return Color.parseColor(str);
    }

    public static final ThemedBooleanParams c(boolean z, boolean z2) {
        return new ThemedBooleanParams(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            z83.j("Invalid color string");
            return 0;
        }
    }
}
