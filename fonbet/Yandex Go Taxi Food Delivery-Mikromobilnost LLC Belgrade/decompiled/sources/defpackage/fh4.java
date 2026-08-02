package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.span.RoundedBackgroundSpan;
import ru.yandex.taxi.design.span.SlantedRoundedBackgroundSpan;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes10.dex */
public abstract class fh4 {
    public static ExecutorService a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [int] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void a(nh0 nh0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        float f;
        ?? r11;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-147205013);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(nh0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = nh0Var.a;
            c530 c530Var = c530.a;
            f530 f530Var = z2 ? ljs0.c : c530Var;
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 b = m4m0.b(ymb1.l(ljs0.m(an91.o(c530Var, 10.0f, 10.0f, 0.0f, 0.0f, 12), 40.0f), cyk0.a), tje.n(AppColor$Palette.Error, btsVar), qke.q);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, b);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            o4b1.b(vfc.k(y2h0.ic_payment_home_error, 0, -1411607277, btsVar, false), null, ljs0.m(c530Var, 24.0f), null, null, 0.0f, null, btsVar, 440, 56);
            n.y(btsVar, true, c530Var, 8.0f, btsVar);
            jeb1.f(nh0Var.c, an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.a, btsVar, 48, 0, 16380);
            jeb1.f(nh0Var.d, an91.m(n.e(c530Var, 12.0f, btsVar, c530Var, 1.0f), 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 48, 0, 16380);
            btsVar = btsVar;
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            if (nh0Var.a) {
                btsVar.e0(14459213);
                f = 1.0f;
                z = true;
                oeb1.c(btsVar, new x2y(1.0f, true));
                r11 = 0;
                btsVar.t(false);
            } else {
                f = 1.0f;
                r11 = 0;
                z = true;
                btsVar.e0(14509185);
                btsVar.t(false);
            }
            f530 k = an91.k(an91.m(ljs0.c(c530Var, f), 8.0f, 0.0f, 2), 8.0f);
            boolean b2 = btsVar.b(4.0f) | btsVar.c(2);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (b2 || Q == o430Var) {
                Q = new jg0(r11);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d4 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, z910Var);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d4);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32 ? z : r11;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new o0(8, tlsVar);
                btsVar.o0(Q2);
            }
            c2d.a.getClass();
            tlsVar2 = tlsVar;
            ulb1.a(null, false, null, (sls) Q2, c2d.b, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
            boolean z4 = (i4 == 32 ? z : false) | ((i3 & 14) == 4 ? z : false);
            Object Q3 = btsVar.Q();
            if (z4 || Q3 == o430Var) {
                Q3 = new j0(11, tlsVar2, nh0Var);
                btsVar.o0(Q3);
            }
            ohb1.b(null, false, null, (sls) Q3, c2d.c, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
            n.y(btsVar, z, c530Var, 16.0f, btsVar);
            btsVar.t(z);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(nh0Var, tlsVar2, i, 7);
        }
    }

    public static he80 b() {
        return new he80();
    }

    public static cag c(r51 r51Var, ddf ddfVar, m3o m3oVar, i6r i6rVar, aye0 aye0Var, ujt0 ujt0Var) {
        i6rVar.getClass();
        m3oVar.getClass();
        return new cag(r51Var, ddfVar, m3oVar, i6rVar, aye0Var, ujt0Var);
    }

    public static synchronized Executor d() {
        ExecutorService executorService;
        synchronized (fh4.class) {
            try {
                if (a == null) {
                    int i = tw21.a;
                    a = Executors.newSingleThreadExecutor(new ywd("ExoPlayer:BackgroundExecutor", 2));
                }
                executorService = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static final CharSequence e(Context context, String str) {
        if (str.length() == 0) {
            return null;
        }
        return h(context, str, new bdc(xng0.bgInvert), new bdc(xng0.textInvert));
    }

    public static final CharSequence f(Context context, String str, kdc kdcVar, kdc kdcVar2) {
        return j(context, str, kdcVar, kdcVar2, tje.w(120, context));
    }

    public static final void g(TextView textView) {
        int d = c.d(otg0.text_with_rounded_background_vertical_padding, textView);
        textView.setPadding(textView.getPaddingLeft(), d, textView.getPaddingRight(), d);
    }

    public static final CharSequence h(Context context, String str, kdc kdcVar, kdc kdcVar2) {
        return j(context, str, kdcVar, kdcVar2, tje.w(48, context));
    }

    public static final CharSequence i(Context context, String str, kdc kdcVar, bdc bdcVar) {
        float w = tje.w(48, context);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(otg0.text_with_rounded_background_vertical_padding);
        float w2 = tje.w(4, context);
        float x = tje.x(context, 2.0f);
        if (str == null) {
            return "";
        }
        SlantedRoundedBackgroundSpan slantedRoundedBackgroundSpan = new SlantedRoundedBackgroundSpan(kdcVar != null ? s8o.m(kdcVar, context) : 0, s8o.m(bdcVar, context), w2, dimensionPixelSize, x, 8.0f, false, tje.w(20, context), w, 64, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str, slantedRoundedBackgroundSpan, 33);
        return spannableStringBuilder;
    }

    public static final CharSequence j(Context context, String str, kdc kdcVar, kdc kdcVar2, float f) {
        if (str == null) {
            return "";
        }
        RoundedBackgroundSpan roundedBackgroundSpan = new RoundedBackgroundSpan(kdcVar != null ? s8o.m(kdcVar, context) : 0, s8o.m(kdcVar2, context), tje.w(6, context), tje.r(otg0.text_with_rounded_background_vertical_padding, context), tje.w(6, context), false, tje.w(20, context), f, 32, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str, roundedBackgroundSpan, 33);
        return spannableStringBuilder;
    }
}
