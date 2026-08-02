package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.ybsdk.core.utils.date.YbDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Result;
import ru.yandex.taxi.masstransit.tickets.c;

/* loaded from: classes11.dex */
public abstract class mpb1 {
    public static j1b1 a;

    public static final void a(lja0 lja0Var, f530 f530Var, c cVar, tls tlsVar, fid fidVar, int i) {
        wls wlsVar;
        f530 f530Var2;
        boolean z;
        c cVar2 = cVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-289788440);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(lja0Var) ? 4 : 2) | (btsVar.k(cVar2) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 3;
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
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
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, a2);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar4 = d.g;
            qje.W(btsVar, wlsVar4, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d);
            ydb1.a(null, null, wwg.S(833083375, true, new wg30(11, lja0Var), btsVar), null, null, null, SlotSize.M, false, btsVar, 1573248, 187);
            c530 c530Var = c530.a;
            f530 l = ymb1.l(ljs0.c(an91.m(c530Var, 12.0f, 0.0f, 2), 1.0f), cyk0.c(20.0f));
            long n = tje.n(AppColor$Palette.BgMinor, btsVar);
            gji0 gji0Var = qke.q;
            f530 b = m4m0.b(l, n, gji0Var);
            sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a3);
            qje.W(btsVar, wlsVar3, o2);
            vfc.v(hashCode2, btsVar, wlsVar4, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar5, d2);
            t510 t510Var = lja0Var.b;
            if (t510Var == null) {
                btsVar.e0(-148832206);
                btsVar.t(false);
                wlsVar = wlsVar5;
                f530Var2 = null;
            } else {
                btsVar.e0(-148832205);
                wlsVar = wlsVar5;
                f530Var2 = null;
                npb1.b(i3 & 896, btsVar, tlsVar, t510Var, null);
                btsVar.t(false);
            }
            yte0 yte0Var = lja0Var.c;
            if (yte0Var == null) {
                btsVar.e0(-148664093);
                btsVar.t(false);
                cVar2 = cVar;
                z = true;
            } else {
                btsVar.e0(-148664092);
                f530 m = an91.m(ljs0.c(c530Var, 1.0f), 12.0f, 0.0f, 2);
                wls wlsVar6 = wlsVar;
                f530 b2 = m4m0.b(ymb1.l(an91.o(m, 0.0f, 0.0f, 0.0f, 12.0f, 7), cyk0.c(16.0f)), tje.n(AppColor$Palette.Background, btsVar), gji0Var);
                z910 d3 = pi6.d(x4c.b, false);
                int hashCode3 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d4 = b.d(btsVar, b2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar2, d3);
                qje.W(btsVar, wlsVar3, o3);
                vfc.v(hashCode3, btsVar, wlsVar4, btsVar, tlsVar2);
                qje.W(btsVar, wlsVar6, d4);
                cVar2 = cVar;
                npb1.a(f530Var2, yte0Var, cVar2, btsVar, i2 & 896);
                z = true;
                btsVar.t(true);
                btsVar.t(false);
            }
            btsVar.t(z);
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(lja0Var, f530Var, cVar2, tlsVar, i);
        }
    }

    public static final String b(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YbDateFormat.ISO_8601_Z.getPattern(), Locale.ROOT);
        simpleDateFormat.setTimeZone(vqg.a);
        try {
            return simpleDateFormat.format(new Date(j));
        } catch (Exception e) {
            x4c.g("Failed to get current time", e, null, null, 12);
            return "0";
        }
    }

    public static final String c(long j) {
        try {
            return new SimpleDateFormat(YbDateFormat.ISO_8601.getPattern(), Locale.ROOT).format(new Date(j));
        } catch (Exception e) {
            x4c.g("Failed to get current time", e, null, null, 12);
            return "0";
        }
    }

    public static Date d(String str) {
        Object failure;
        try {
            failure = new SimpleDateFormat(YbDateFormat.SHORT_SERVER_DATE_ONLY.getPattern(), Locale.getDefault()).parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            x4c.g("Failed to parse date with SHORT_SERVER_DATE_ONLY format", a2, str, null, 8);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Date) failure;
    }

    public static final void e(wjd wjdVar, f1k f1kVar) {
        wjdVar.a(f1kVar);
    }

    public static synchronized void f() {
        synchronized (mpb1.class) {
            dmb1 dmb1Var = new dmb1();
            dmb1Var.a = "common";
            dmb1Var.b = true;
            byte b = (byte) (dmb1Var.d | 1);
            dmb1Var.c = 1;
            int i = 2;
            dmb1Var.d = (byte) (b | 2);
            mmb1 a2 = dmb1Var.a();
            synchronized (mpb1.class) {
                try {
                    if (a == null) {
                        a = new j1b1(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
