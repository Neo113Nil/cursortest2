package defpackage;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonStyle;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class fxa1 {
    public static final void a(e47 e47Var, boolean z, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-203844180);
        int i2 = 2;
        int i3 = i | (btsVar.k(e47Var) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = e47Var.b;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            vcb1.a(slsVar, pfb1.b(an91.k(ljs0.c(c530Var, 1.0f), 8.0f), z, 30), z2 && !z, null, z2 ? ButtonStyle.Main : ButtonStyle.Minor, null, null, wwg.S(1560608446, true, new vj50(e47Var, i2), btsVar), null, null, null, btsVar, ((i3 >> 6) & 14) | 12582912, 0, 3944);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(e47Var, z, slsVar, i, 23);
        }
    }

    public static final long b(lax0 lax0Var) {
        return lax0Var.d() / 1000000;
    }

    public static final TypedValue c(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        kbs.o("%1$s requires a value for the %2$s attribute to be set in your theme.", Arrays.copyOf(new Object[]{context.getClass().getCanonicalName(), context.getResources().getResourceName(i)}, 2));
        return null;
    }

    public static String d(String str, Object... objArr) {
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
