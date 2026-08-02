package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.window.e;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.xplat.common.YSError;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.BubblePosition;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a;

/* loaded from: classes5.dex */
public abstract class coa1 {
    public static final void a(hw0 hw0Var, f530 f530Var, wls wlsVar, tls tlsVar, tls tlsVar2, tls tlsVar3, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f530 f530Var2;
        hw0 hw0Var2 = hw0Var;
        String str = hw0Var2.d;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1323790050);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(hw0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar2.e(wlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.e(tlsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar2.e(tlsVar3) ? 131072 : 65536;
        }
        int i4 = i3;
        if (btsVar2.V(i4 & 1, (i4 & 74899) != 74898)) {
            boolean k = btsVar2.k(str);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = f.j(str);
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            l690 l690Var = hw0Var2.h;
            c530 c530Var = c530.a;
            f530 j = an91.j(c530Var, l690Var);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, j);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar2 = d.f;
            qje.W(btsVar2, wlsVar2, a);
            wls wlsVar3 = d.e;
            qje.W(btsVar2, wlsVar3, o);
            wls wlsVar4 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar4);
            }
            wls wlsVar5 = d.d;
            qje.W(btsVar2, wlsVar5, d);
            boolean z = (i4 & 14) == 4;
            Object Q2 = btsVar2.Q();
            if (z || Q2 == o430Var) {
                Q2 = new q(3, wlsVar, hw0Var2, oz40Var);
                btsVar2.o0(Q2);
            }
            tls tlsVar4 = (tls) Q2;
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a2 = khl0.a(lr20.g, x4c.E, btsVar2, 54);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d2 = b.d(btsVar2, c);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar2, a2);
            qje.W(btsVar2, wlsVar3, o2);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar2, hashCode2, wlsVar4);
            }
            qje.W(btsVar2, wlsVar5, d2);
            hw0Var2 = hw0Var;
            bts btsVar3 = btsVar2;
            f530Var2 = c530Var;
            xab1.a(ljs0.c(c530Var, 1.0f).k(new x2y(1.0f, true)), null, wwg.S(-1119048558, true, new r5y(hw0Var2, tlsVar4, tlsVar, oz40Var, 2), btsVar2), btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 6);
            jvs0 jvs0Var = hw0Var2.g;
            if (jvs0Var == null) {
                btsVar3.e0(657332439);
                btsVar3.t(false);
            } else {
                btsVar3.e0(657332440);
                a.a(jvs0Var, false, false, tlsVar3, tlsVar2, btsVar3, ((i4 >> 6) & 7168) | (i4 & HProv.ALG_CLASS_ALL), 6);
                btsVar3 = btsVar3;
                btsVar3.t(false);
            }
            btsVar3.t(true);
            bts btsVar4 = btsVar3;
            dk91.a(0.0f, 0, 7, 0L, btsVar4, null);
            btsVar = btsVar4;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0((Object) hw0Var2, (Object) f530Var2, (Object) wlsVar, (Object) tlsVar, (Object) tlsVar2, (Object) tlsVar3, i, 0);
        }
    }

    public static final void b(f530 f530Var, uv0 uv0Var, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        uo5 uo5Var;
        BubblePosition bubblePosition = uv0Var.b;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1969301075);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = (btsVar2.k(f530Var) ? 4 : 2) | i | (btsVar2.k(uv0Var) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new jc0(3, slsVar);
                btsVar2.o0(Q);
            }
            f530 d = q791.d(f530Var, false, null, null, (sls) Q, 15);
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = new teb(20);
                btsVar2.o0(Q2);
            }
            f530 a = fnq0.a(d, (tls) Q2);
            int i3 = gw0.a[bubblePosition.ordinal()];
            if (i3 == 1) {
                uo5Var = x4c.C;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return;
                }
                uo5Var = x4c.A;
            }
            z910 d2 = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = b.d(btsVar2, a);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, d2);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d3);
            c530 c530Var = c530.a;
            f530 o2 = an91.o(c530Var, 0.0f, 0.0f, 0.0f, 6.0f, 7);
            a7u0 a7u0Var = gl51.a;
            f530 w = ljs0.w(m4m0.b(o2, ((el51) btsVar2.m(a7u0Var)).b(), cyk0.c(12.0f)), 3);
            z910 d4 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o3 = btsVar2.o();
            f530 d5 = b.d(btsVar2, w);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, d4);
            qje.W(btsVar2, wlsVar2, o3);
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar2, hashCode2, wlsVar3);
            }
            qje.W(btsVar2, wlsVar4, d5);
            ymb1.f(uv0Var.a, an91.l(c530Var, 10.0f, 8.0f), ((el51) btsVar2.m(a7u0Var)).m(), null, null, null, 0L, 0L, 0L, null, 0, false, Integer.MAX_VALUE, null, null, btsVar2, 0, HProv.ALG_TYPE_SECURECHANNEL, 57336);
            btsVar = btsVar2;
            btsVar.t(true);
            o4b1.b(mt71.m(ozg0.bubble_tail, 0, btsVar), null, gza1.b(c530Var, bubblePosition == BubblePosition.TOP_RIGHT ? -1.0f : 1.0f, 1.0f), null, null, 0.0f, new c36(((el51) btsVar.m(a7u0Var)).b(), 5), btsVar, 48, 56);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cw0(f530Var, uv0Var, slsVar, i);
        }
    }

    public static final void c(f530 f530Var, boolean z, long j, uv0 uv0Var, sls slsVar, fid fidVar, int i) {
        uo5 uo5Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1940534521);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.d(j) ? 256 : 128) | (btsVar.k(uv0Var) ? 2048 : 1024);
        if (!btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(-203924391);
            int i3 = gw0.a[uv0Var.b.ordinal()];
            if (i3 == 1) {
                uo5Var = x4c.w;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return;
                }
                uo5Var = x4c.b;
            }
            e.b(uo5Var, j, slsVar, null, wwg.S(1689745839, true, new cw0(f530Var, uv0Var, slsVar), btsVar), btsVar, ((i2 >> 3) & 112) | 24960, 8);
            btsVar.t(false);
        } else {
            btsVar.e0(-203584197);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dw0(f530Var, z, j, uv0Var, slsVar, i);
        }
    }

    public static final void d(String str, hw0 hw0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        boolean z;
        androidx.compose.runtime.internal.a aVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-747760943);
        int i2 = 2;
        int i3 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(hw0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean a = btsVar.a(str.length() == 0);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            androidx.compose.runtime.internal.a aVar2 = null;
            if (a || Q == o430Var) {
                Q = str.length() == 0 ? null : hw0Var.c;
                btsVar.o0(Q);
            }
            String str2 = (String) Q;
            boolean a2 = btsVar.a(str2 == null);
            Object Q2 = btsVar.Q();
            if (a2 || Q2 == o430Var) {
                Q2 = str2 == null ? new l690(0.0f, 16.0f, 16.0f, 16.0f) : new l690(0.0f, 20.0f, 16.0f, 10.0f);
                btsVar.o0(Q2);
            }
            j690 j690Var = (j690) Q2;
            f530 c = ljs0.c(c530.a, 1.0f);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new a0(i2, tlsVar2);
                btsVar.o0(Q3);
            }
            f530 f = ci91.f(c, (tls) Q3);
            boolean z2 = (i3 & 112) == 32;
            Object Q4 = btsVar.Q();
            if (z2 || Q4 == o430Var) {
                Q4 = new y4(17, hw0Var);
                btsVar.o0(Q4);
            }
            f530 b = fnq0.b(f, false, (tls) Q4);
            int i4 = hw0Var.e.a;
            long j = ldc.l;
            dmh d = tlb1.d(0L, 0L, j, j, 0L, 0L, btsVar, 14155782, 2097055);
            lkx lkxVar = lkx.f;
            int i5 = 7;
            lkx a3 = lkx.a(7);
            if (str2 == null) {
                btsVar.e0(1450282155);
                btsVar.t(false);
                aVar = null;
                z = true;
            } else {
                btsVar.e0(1450282156);
                z = true;
                androidx.compose.runtime.internal.a S = wwg.S(237735349, true, new q0(str2, 4), btsVar);
                btsVar.t(false);
                aVar = S;
            }
            if (hw0Var.c == null) {
                btsVar.e0(1450392701);
                btsVar.t(false);
            } else {
                btsVar.e0(1450392702);
                aVar2 = wwg.S(190173194, z, new tn1(i5, hw0Var), btsVar);
                btsVar.t(false);
            }
            tlb1.b(str, tlsVar, b, false, false, null, aVar, aVar2, false, null, a3, null, false, i4, null, null, d, j690Var, btsVar, (i3 & 14) | ((i3 >> 3) & 112), 0, 225080);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) str, (Object) hw0Var, (cms) tlsVar, (cms) tlsVar2, i, 2);
        }
    }

    public static final void e(n611 n611Var, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(550590185);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(n611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(152262151);
            g(n611Var, f530Var, null, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            btsVar.e0(152317703);
            f(n611Var, f530Var, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(n611Var, f530Var, z, i, 5);
        }
    }

    public static final void f(n611 n611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1188462368);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(n611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i4 = 0;
        int i5 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            boolean e = btsVar.e(n611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new kar(n611Var, 0);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.a(c, (tls) Q), wwg.S(-310755894, true, new lar(n611Var, i4), btsVar), wwg.S(454026543, true, new lar(n611Var, i5), btsVar), null, wwg.S(99034933, true, new lar(n611Var, i3), btsVar), null, SlotSize.L, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(n611Var, f530Var, i, 23);
        }
    }

    public static final void g(n611 n611Var, f530 f530Var, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        ety0 ety0Var2;
        ety0 ety0Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-986135319);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(n611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                ety0Var3 = xya1.d(btsVar).f.c;
            } else {
                btsVar.Y();
                ety0Var3 = ety0Var;
            }
            btsVar.u();
            String str = n611Var.b;
            boolean e = btsVar.e(n611Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new kar(n611Var, 1);
                btsVar.o0(Q);
            }
            a5l0.d(str, fnq0.a(f530Var, (tls) Q), 0.0f, 0.0f, null, 0.0f, ety0Var3, null, wwg.S(1133350499, true, new lar(n611Var, 3), btsVar), wwg.S(-1512235271, true, new a6n(11, n611Var, ety0Var3), btsVar), btsVar, 905969664, 188);
            ety0Var2 = ety0Var3;
        } else {
            btsVar.Y();
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm((Object) n611Var, f530Var, (Object) ety0Var2, i, 11);
        }
    }

    public static final tyj0 h(YSError ySError) {
        return new tyj0(null, ySError);
    }

    public static final tyj0 i(Object obj) {
        return new tyj0(obj, null);
    }

    public static String j(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder x = unr0.x("<", str2, " threw ");
                    x.append(e.getClass().getName());
                    x.append(">");
                    sb = x.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(Extension.FIX_SPACE);
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
