package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.material.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class er41 {
    public static final byk0 a = cyk0.c(16.0f);
    public static final float b = 48.0f;

    public static final void a(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-944166351);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            k3r k3rVar = ljs0.c;
            pa90 m = mt71.m(u0h0.ic_delivery_webview_error, 0, btsVar);
            long j = ldc.m;
            q4v.b(m, null, k3rVar, j, btsVar, 3504, 0);
            q4v.b(mt71.m(u0h0.ic_delivery_webview_exclamation_mark, 0, btsVar), null, ljs0.m(an91.o(c530.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), 41.0f), j, btsVar, 3504, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new orq0(f530Var, i, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
    
        if (defpackage.jl40.l(r10.Q(), java.lang.Integer.valueOf(r12)) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z, x9o x9oVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1780251443);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.k(x9oVar) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            long j2 = z ? cl51.f : cl51.a;
            long j3 = cl51.g;
            long b2 = ldc.b(z ? cl51.b : cl51.d, 0.1f, 0.0f, 0.0f, 0.0f, 14);
            long j4 = cl51.e;
            long j5 = z ? cl51.c : j4;
            Typeface b3 = wuj0.b(y4h0.ya_regular, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b));
            lyy a2 = cwa1.a(Typeface.create(b3, 1));
            lyy a3 = cwa1.a(Typeface.create(b3, 0));
            k3r k3rVar = ljs0.c;
            f530 b4 = m4m0.b(k3rVar, j2, qke.q);
            so5 so5Var = x4c.H;
            m501 m501Var = lr20.e;
            sic a4 = qic.a(m501Var, so5Var, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b4);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a4);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S) {
                j = b2;
            } else {
                j = b2;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 k = an91.m(k3rVar, 16.0f, 0.0f, 2).k(new x2y(1.0f, true));
            sic a5 = qic.a(m501Var, so5Var, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a5);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            c530 c530Var = c530.a;
            a(ljs0.m(c530Var, 96.0f), btsVar, 6);
            long j6 = j5;
            wqy0.b(x9oVar.a, null, j6, uh6.E(32), null, lzr.E, null, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, new ety0(0L, 0L, null, null, a2, null, 0L, 0, 0L, null, null, 16777183), btsVar, 199680, 0, 64978);
            wqy0.b(x9oVar.b, null, j6, uh6.E(16), null, null, null, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, new ety0(0L, 0L, null, null, a3, null, 0L, 0, 0L, null, null, 16777183), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 65010);
            btsVar = btsVar;
            n.y(btsVar, true, c530Var, 24.0f, btsVar);
            float f = b;
            byk0 byk0Var = a;
            a.a(slsVar2, an91.m(ljs0.c(ljs0.e(c530Var, f), 1.0f), 16.0f, 0.0f, 2), false, null, byk0Var, sz6.a(0, 14, j, btsVar), null, wwg.S(-1665954637, true, new dr41(x9oVar, j6, a3, 0), btsVar), btsVar, ((i2 >> 9) & 14) | 805527600, 332);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            a.a(slsVar, an91.m(ljs0.c(ljs0.e(c530Var, f), 1.0f), 16.0f, 0.0f, 2), false, null, byk0Var, sz6.a(6, 14, j3, btsVar), null, wwg.S(1724946986, true, new dr41(x9oVar, j4, a3, 1), btsVar), btsVar, ((i2 >> 6) & 14) | 805527600, 332);
            ly3.B(c530Var, 32.0f, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(z, x9oVar, slsVar, slsVar2, i, 24);
        }
    }
}
