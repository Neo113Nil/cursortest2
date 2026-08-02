package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.UUID;
import kotlin.Result;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ehb1 {
    public static final void a(f530 f530Var, qo9 qo9Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        f530 a;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1521887093);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(qo9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
            long d = rzo.d(s8o.m(qo9Var.c, context));
            byk0 c = cyk0.c(w4a1.b(btsVar2, htg0.chargers_badge_corner_radius));
            kdc kdcVar = qo9Var.d;
            c530 c530Var = c530.a;
            if (kdcVar == null) {
                btsVar2.e0(863975300);
                btsVar2.t(false);
                a = null;
            } else {
                btsVar2.e0(863975301);
                a = aab1.a(w4a1.b(btsVar2, htg0.chargers_badge_border_width), rzo.d(s8o.m(kdcVar, context)), c530Var, c);
                btsVar2.t(false);
            }
            if (a == null) {
                a = c530Var;
            }
            f530 l = ymb1.l(ljs0.e(c530Var, w4a1.b(btsVar2, htg0.chargers_badge_height)), c);
            boolean e = ((i2 & 896) == 256) | btsVar2.e(qo9Var);
            Object Q = btsVar2.Q();
            if (e || Q == did.a) {
                Q = new u08(16, tlsVar, qo9Var);
                btsVar2.o0(Q);
            }
            f530 m = an91.m(m4m0.b(q791.d(l, false, null, null, (sls) Q, 15), d, qke.q).k(a), w4a1.b(btsVar2, htg0.chargers_badge_horizontal_padding), 0.0f, 2);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = b.d(btsVar2, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, d2);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d3);
            f530Var2 = c530Var;
            qgy.b(qo9Var.b, null, cj6.a.a(c530Var, x4c.y), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.a, null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 0, 12274);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) f530Var2, (Object) qo9Var, tlsVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.Result$Failure] */
    public static final String b(String str, UUID uuid) {
        String failure;
        Uri parse;
        try {
            parse = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (parse.getQueryParameterNames().contains("crossSessionId")) {
            return str;
        }
        failure = parse.buildUpon().appendQueryParameter("crossSessionId", uuid.toString()).build().toString();
        if (!(failure instanceof Result.Failure)) {
            str = failure;
        }
        return str;
    }

    public static void c(Throwable th) {
        xby.l(jst.e, "LOTTIE_LOADER_ERROR", null, th, "LOTTIE_LOADER_CLEAR_ANIMATION_CACHE_ERROR", 2);
    }

    public static void d(Throwable th) {
        xby.l(jst.e, "LOTTIE_LOADER_ERROR", null, th, "LOTTIE_LOADER_CLEAR_ERROR", 2);
    }

    public static void e(Throwable th) {
        xby.l(jst.e, "LOTTIE_LOADER_ERROR", null, th, "LOTTIE_LOADER_DOWNLOAD_AND_SAVE_ERROR", 2);
    }
}
