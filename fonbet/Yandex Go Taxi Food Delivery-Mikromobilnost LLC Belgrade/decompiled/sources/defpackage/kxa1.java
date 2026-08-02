package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.android.gms.internal.play_billing.zzgk;
import com.yandex.go.design.compose.button.ButtonStyle;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;

/* loaded from: classes11.dex */
public abstract class kxa1 {
    public static final void a(f47 f47Var, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-614384892);
        int i2 = i | (btsVar.k(f47Var) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 b = pfb1.b(ljs0.c(c530Var, 1.0f), f47Var.c, 30);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
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
            f530 k = an91.k(ljs0.c(c530Var, 1.0f), 8.0f);
            boolean z = f47Var.c;
            vcb1.a(slsVar, k, !z, null, z ? ButtonStyle.Minor : ButtonStyle.Main, null, null, wwg.S(-1959300458, true, new pdf0(22, f47Var), btsVar), null, null, null, btsVar, ((i2 >> 3) & 14) | 12582960, 0, 3944);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(f47Var, slsVar, i, 10);
        }
    }

    public static final void b(tls tlsVar, ValueAnimator valueAnimator) {
        valueAnimator.addUpdateListener(new nj2(0, tlsVar));
    }

    public static final ObjectAnimator c(View view) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(view);
        objectAnimator.setProperty(View.ALPHA);
        return objectAnimator;
    }

    public static final void d(bev bevVar, int i) {
        if (i >= -1) {
            bev.m(bevVar, "coil#repeat_count", Integer.valueOf(i));
        } else {
            w511.f(oyr.i(i, "Invalid repeatCount: "));
        }
    }

    public static String e(zzgk zzgkVar) {
        StringBuilder sb = new StringBuilder(zzgkVar.f());
        for (int i = 0; i < zzgkVar.f(); i++) {
            byte a = zzgkVar.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append(CSPStore.UNIQUE_SEPARATOR);
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
