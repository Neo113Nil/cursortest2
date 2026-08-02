package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class jsa1 {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2009587365);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 l = ymb1.l(f530Var, cyk0.a);
            qnm qnmVar = qnm.a;
            qnm.c.getClass();
            f530 b = m4m0.b(ljs0.m(l, 20.0f), qnm.c(btsVar).a(), qke.q);
            btsVar.e0(521280701);
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new zvr(1, slsVar);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            f530 d = q791.d(b, false, null, null, (sls) Q, 15);
            btsVar.e0(521282049);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new xvq(9);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            f530 b2 = fnq0.b(d, false, (tls) Q2);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, b2);
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
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d3);
            o4b1.b(ba91.c(pnb1.a(), btsVar), ohb1.e(btsVar, oyh0.delete_confirm), an91.k(c530.a, 2.0f), null, null, 0.0f, new c36(qnm.c(btsVar).k0(), 5), btsVar, 8, 56);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ve6(slsVar, f530Var, i, i3);
        }
    }

    public static final void b(a aVar, String str, sls slsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1483680255);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 n = ljs0.n(f530Var, 64.0f, 98.0f);
            qnm.d.getClass();
            f530 m = an91.m(n, 0.0f, 8.0f, 1);
            sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(an91.m(c530Var, 8.0f, 0.0f, 2), 1.0f);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            aVar.invoke(btsVar, Integer.valueOf(i2 & 14));
            a((i2 >> 6) & 14, btsVar, slsVar, cj6.a.a(c530Var, x4c.w));
            btsVar.t(true);
            vqy0.c(str, ljs0.c(c530Var, 1.0f), 0L, 0L, null, 0L, new sjy0(3), 0L, 2, false, 2, 0, ltm.b(btsVar).j(btsVar), btsVar, ((i2 >> 3) & 14) | 48, 24960, 109564);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(aVar, str, slsVar, f530Var, i, 26);
        }
    }

    public static final void c(o5f o5fVar, sls slsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(778055696);
        int i2 = (btsVar.k(o5fVar) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            a S = wwg.S(61284064, true, new wc0(o5fVar, 1), btsVar);
            String str = o5fVar.b;
            if (str == null) {
                str = "";
            }
            int i3 = i2 << 3;
            b(S, str, slsVar, f530Var, btsVar, (i3 & 896) | 6 | (i3 & 7168));
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(o5fVar, slsVar, f530Var, i, 9);
        }
    }

    public static final void d(int i, fid fidVar, sls slsVar, f530 f530Var) {
        sls slsVar2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1569178592);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            slsVar2 = slsVar;
            f530Var2 = f530Var;
        } else {
            String e = ohb1.e(btsVar, oyh0.messaging_saved_messages_chat);
            int i3 = i2 << 6;
            slsVar2 = slsVar;
            f530Var2 = f530Var;
            b(wwg.S(629948144, true, new ynm(e, 3), btsVar), e, slsVar2, f530Var2, btsVar, (i3 & 896) | 6 | (i3 & 7168));
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar2, f530Var2, i, 8);
        }
    }

    public static final void e(int i, fid fidVar, sls slsVar, f530 f530Var) {
        sls slsVar2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1345513845);
        int i2 = 4;
        int i3 = (btsVar.e(slsVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if ((i3 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            slsVar2 = slsVar;
            f530Var2 = f530Var;
        } else {
            String e = ohb1.e(btsVar, oyh0.unavailable_chat);
            int i4 = i3 << 6;
            slsVar2 = slsVar;
            f530Var2 = f530Var;
            b(wwg.S(798965925, true, new ynm(e, i2), btsVar), e, slsVar2, f530Var2, btsVar, (i4 & 896) | 6 | (i4 & 7168));
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar2, f530Var2, i, 7);
        }
    }

    public static final void f(f530 f530Var, long j, float f, boolean z, a aVar, fid fidVar, final int i) {
        float f2;
        final f530 f530Var2;
        long j2;
        boolean z2;
        final a aVar2;
        final boolean z3;
        final float f3;
        final long j3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1344377559);
        if (((i | 3222) & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
            j3 = j;
            f3 = f;
            z3 = z;
            aVar2 = aVar;
        } else {
            btsVar.a0();
            int i2 = i & 1;
            f530 f530Var3 = c530.a;
            if (i2 == 0 || btsVar.C()) {
                qnm qnmVar = qnm.a;
                long e = qnm.c(btsVar).e();
                qnm.e.getClass();
                f2 = 24.0f;
                f530Var2 = f530Var3;
                j2 = e;
                z2 = true;
            } else {
                btsVar.Y();
                f530Var2 = f530Var;
                j2 = j;
                f2 = f;
                z2 = z;
            }
            btsVar.u();
            btsVar.e0(2037116865);
            fwi fwiVar = (fwi) btsVar.m(j.h);
            float w0 = fwiVar.w0(f2);
            f530 u = ljs0.u(ljs0.c(f530Var2, 1.0f), null, 3);
            btsVar.e0(1439392163);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new jdk0(27);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            f530 a = androidx.compose.ui.graphics.d.a(u, (tls) Q);
            btsVar.e0(1439393540);
            boolean b = btsVar.b(w0) | btsVar.k(fwiVar) | btsVar.b(f2) | btsVar.d(j2);
            Object Q2 = btsVar.Q();
            if (b || Q2 == o430Var) {
                po7 po7Var = new po7(w0, fwiVar, f2, j2);
                btsVar.o0(po7Var);
                Q2 = po7Var;
            }
            btsVar.t(false);
            f530 g = bb1.g(a, (tls) Q2);
            btsVar.t(false);
            btsVar.e0(-500245302);
            if (z2) {
                WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                f530Var3 = b9a1.e(f530Var3, vuz.o(btsVar).f);
            }
            btsVar.t(false);
            f530 k = g.k(f530Var3);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            aVar2 = aVar;
            aVar2.invoke(cj6.a, btsVar, 54);
            btsVar.t(true);
            z3 = z2;
            f3 = f2;
            j3 = j2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(j3, f3, z3, aVar2, i) { // from class: zxk0
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ a x;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(24577);
                    jsa1.f(f530.this, this.b, this.c, this.w, this.x, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static String h(String str, Object... objArr) {
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

    public abstract String g();
}
