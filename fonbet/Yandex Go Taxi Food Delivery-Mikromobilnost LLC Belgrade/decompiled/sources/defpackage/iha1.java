package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

/* loaded from: classes11.dex */
public abstract class iha1 {
    public static final void a(e6 e6Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-607725892);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(e6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, qy20.c, qy20.d, false, wwg.S(-1174561190, true, new u5(i3, e6Var, tlsVar), btsVar), btsVar, 27648, 1);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(e6Var, tlsVar, i, i4);
        }
    }

    public static final void b(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-208889685);
        int i2 = (btsVar.k(str) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 c = bzk0.c(an91.k(ljs0.m(c530Var, 56.0f), 8.0f), AppColor$Palette.ControlMinor, cyk0.c(12.0f));
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            f530 m = ljs0.m(c530Var, 24.0f);
            pvi0 b = mja1.b(str, null, 6);
            g7d.a.getClass();
            v0b1.a(b, m, null, null, g7d.c, null, null, null, 0.0f, 0, btsVar, 24624, 1004);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 23);
        }
    }

    public static final void c(final nxo nxoVar, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1450168794);
        int i2 = (btsVar.k(nxoVar) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            SlotSize slotSize = SlotSize.L;
            f530 m = an91.m(c530.a, 8.0f, 0.0f, 2);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new jc0(29, slsVar);
                btsVar.o0(Q);
            }
            f530 d = q791.d(m, false, null, null, (sls) Q, 15);
            a S = wwg.S(892882308, true, new zls() { // from class: rxo
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    nxo nxoVar2 = nxoVar;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                jeb1.f(nxoVar2.a, an91.o(c530.a, 8.0f, 0.0f, 0.0f, 0.0f, 14), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.a, btsVar2, 432, 0, 16376);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(1 & intValue2, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                String str = nxoVar2.b;
                                if (str == null) {
                                    btsVar3.e0(1124396379);
                                } else {
                                    btsVar3.e0(1124396380);
                                    iha1.b(str, btsVar3, 0);
                                }
                                btsVar3.t(false);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            a S2 = wwg.S(1273142121, true, new zls() { // from class: rxo
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    nxo nxoVar2 = nxoVar;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                jeb1.f(nxoVar2.a, an91.o(c530.a, 8.0f, 0.0f, 0.0f, 0.0f, 14), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.a, btsVar2, 432, 0, 16376);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(1 & intValue2, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                String str = nxoVar2.b;
                                if (str == null) {
                                    btsVar3.e0(1124396379);
                                } else {
                                    btsVar3.e0(1124396380);
                                    iha1.b(str, btsVar3, 0);
                                }
                                btsVar3.t(false);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            g7d.a.getClass();
            ydb1.a(d, S, S2, null, g7d.b, null, slotSize, false, btsVar, 1597872, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(nxoVar, slsVar, i, 7);
        }
    }

    public static final void d(xxo xxoVar, j690 j690Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        float f;
        c530 c530Var;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1339440875);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xxoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(j690Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var2 = c530.a;
            f530 j = an91.j(ljs0.c(c530Var2, 1.0f), j690Var);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, j);
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
            String str = xxoVar.b;
            if (str == null) {
                btsVar.e0(-1596940536);
                btsVar.t(false);
                f = 1.0f;
                i3 = 0;
                c530Var = c530Var2;
            } else {
                btsVar.e0(-1596940535);
                f = 1.0f;
                c530Var = c530Var2;
                i3 = 0;
                jeb1.f(str, an91.k(ljs0.c(c530Var2, 1.0f), 16.0f), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.d, btsVar, 432, 0, 16376);
                btsVar = btsVar;
                btsVar.t(false);
            }
            f530 c = ljs0.c(c530Var, f);
            int i4 = ((i2 & 896) == 256 ? 1 : i3) | ((i2 & 14) == 4 ? 1 : i3);
            Object Q = btsVar.Q();
            if (i4 != 0 || Q == did.a) {
                Q = new sxo(i3, xxoVar, tlsVar);
                btsVar.o0(Q);
            }
            adb1.a(c, null, null, null, null, null, false, null, (tls) Q, btsVar, 6, 510);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(xxoVar, j690Var, tlsVar, i, 8);
        }
    }

    public static final void e(xxo xxoVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        xxo xxoVar2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-912653715);
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(xxoVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new azd(14, tlsVar);
                btsVar2.o0(Q);
            }
            sls slsVar = (sls) Q;
            boolean z2 = i4 == 32;
            Object Q2 = btsVar2.Q();
            int i5 = 15;
            if (z2 || Q2 == o430Var) {
                Q2 = new azd(i5, tlsVar);
                btsVar2.o0(Q2);
            }
            sls slsVar2 = (sls) Q2;
            boolean z3 = i4 == 32;
            Object Q3 = btsVar2.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new azd(i3, tlsVar);
                btsVar2.o0(Q3);
            }
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, slsVar, slsVar2, (sls) Q3, btsVar2, 0, 0, 1023);
            boolean z4 = i4 == 32;
            Object Q4 = btsVar2.Q();
            if (z4 || Q4 == o430Var) {
                Q4 = new azd(17, tlsVar);
                btsVar2.o0(Q4);
            }
            xxoVar2 = xxoVar;
            c.a(null, a, qab1.c(a, null, (sls) Q4, btsVar2, 0, 2), false, false, null, null, null, null, null, null, wwg.S(-1998282291, true, new l0(15, xxoVar2, tlsVar), btsVar2), btsVar2, 0, 48, 2041);
            btsVar = btsVar2;
        } else {
            xxoVar2 = xxoVar;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(xxoVar2, tlsVar, i, 20);
        }
    }

    public static String f(String str, Object... objArr) {
        int indexOf;
        String sb;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder x = unr0.x("<", str2, " threw ");
                    x.append(e.getClass().getName());
                    x.append(">");
                    sb = x.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
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

    public static final com.yandex.go.sdk_registry.runtime.b g(ike ikeVar, tls tlsVar) {
        unp0 unp0Var = new unp0(ikeVar);
        tlsVar.invoke(unp0Var);
        com.yandex.go.sdk_registry.runtime.b bVar = new com.yandex.go.sdk_registry.runtime.b(new fwf0(unp0Var.b.a), ikeVar);
        Iterator it = unp0Var.a.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(bVar);
        }
        return bVar;
    }
}
