package defpackage;

import androidx.compose.runtime.f;
import com.yandex.go.urbanads.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class ppa1 {
    public static final void a(pc1 pc1Var, b bVar, fid fidVar, int i) {
        int i2;
        vc1 vc1Var = pc1Var.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(138373761);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(pc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(bVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.e0(-166795466);
            b(vc1Var, bVar, btsVar, i2 & 112);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(pc1Var, bVar, i, 11);
        }
    }

    public static final void b(vc1 vc1Var, b bVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(699670891);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(vc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(bVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(null);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(new wu60(0L));
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            int i3 = 3;
            f530 u = ljs0.u(ljs0.c(c530.a, 1.0f), null, 3);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new hc1(oz40Var2, oz40Var, 0);
                btsVar.o0(Q3);
            }
            f530 y = eja1.y(u, (tls) Q3);
            boolean e = btsVar.e(bVar) | ((i2 & 14) == 4);
            Object Q4 = btsVar.Q();
            if (e || Q4 == o430Var) {
                Q4 = new q(6, bVar, vc1Var, oz40Var);
                btsVar.o0(Q4);
            }
            tls tlsVar = (tls) Q4;
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                Q5 = new w5(i3, oz40Var);
                btsVar.o0(Q5);
            }
            androidx.compose.ui.viewinterop.b.b(tlsVar, y, null, (tls) Q5, null, btsVar, 3120, 20);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(vc1Var, bVar, i, 12);
        }
    }

    public static final boolean c(int i, List list) {
        return list.isEmpty() || list.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float d(rx40 rx40Var, rx40 rx40Var2, float f) {
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f).toString());
        }
        Iterator it = y6i0.n(0, rx40Var.b).iterator();
        while (it.hasNext()) {
            int nextInt = ((t5w) it).nextInt();
            float b = rx40Var.b(nextInt);
            int i = nextInt + 1;
            float b2 = rx40Var.b(i % rx40Var.b);
            if (b2 < b) {
                if (f < b && f > b2) {
                }
                int i2 = i % rx40Var.b;
                float d = ex21.d(rx40Var.b(i2) - rx40Var.b(nextInt), 1.0f);
                return ex21.d((ex21.d(rx40Var2.b(i2) - rx40Var2.b(nextInt), 1.0f) * (d >= 0.001f ? 0.5f : ex21.d(f - rx40Var.b(nextInt), 1.0f) / d)) + rx40Var2.b(nextInt), 1.0f);
            }
            if (b <= f && f <= b2) {
                int i22 = i % rx40Var.b;
                float d2 = ex21.d(rx40Var.b(i22) - rx40Var.b(nextInt), 1.0f);
                return ex21.d((ex21.d(rx40Var2.b(i22) - rx40Var2.b(nextInt), 1.0f) * (d2 >= 0.001f ? 0.5f : ex21.d(f - rx40Var.b(nextInt), 1.0f) / d2)) + rx40Var2.b(nextInt), 1.0f);
            }
        }
        w511.i("Collection contains no element matching the predicate.");
        return 0.0f;
    }

    public static final void e(rx40 rx40Var) {
        Boolean bool = Boolean.TRUE;
        float[] fArr = rx40Var.a;
        int i = rx40Var.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= i) {
                break;
            }
            float f = fArr[i3];
            if (!bool.booleanValue() || 0.0f > f || f > 1.0f) {
                z = false;
            }
            bool = Boolean.valueOf(z);
            i3++;
        }
        if (!bool.booleanValue()) {
            w511.f("FloatMapping - Progress outside of range: ".concat(rx40.c(rx40Var, 31)));
            return;
        }
        Iterable n = y6i0.n(1, rx40Var.b);
        if (!(n instanceof Collection) || !((Collection) n).isEmpty()) {
            c6w it = n.iterator();
            while (it.c) {
                int nextInt = it.nextInt();
                if (rx40Var.b(nextInt) < rx40Var.b(nextInt - 1) && (i2 = i2 + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        if (i2 <= 1) {
            return;
        }
        w511.f("FloatMapping - Progress wraps more than once: ".concat(rx40.c(rx40Var, 31)));
    }

    public static String f(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String p;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                p = "null";
            } else {
                try {
                    p = obj.toString();
                } catch (Exception e) {
                    String p2 = g8e.p(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(p2), (Throwable) e);
                    p = unr0.p("<", p2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = p;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(Extension.FIX_SPACE);
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
