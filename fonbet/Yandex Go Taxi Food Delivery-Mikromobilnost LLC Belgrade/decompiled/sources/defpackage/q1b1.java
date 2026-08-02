package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public abstract class q1b1 {
    public static final void a(f530 f530Var, final m7k0 m7k0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-737552727);
        int i2 = i | (btsVar.k(m7k0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new mw2(4, tlsVar, m7k0Var);
                btsVar.o0(Q);
            }
            ydb1.a(q791.b(f530Var, null, null, false, null, new awk0(0), (sls) Q, 12), null, wwg.S(2139223288, true, new zls() { // from class: bp3
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    m7k0 m7k0Var2 = m7k0Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                lhl0 a = khl0.a(lr20.a, x4c.E, btsVar2, 48);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d = b.d(btsVar2, c530.a);
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
                                qje.W(btsVar2, d.f, a);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d);
                                au2 au2Var = bjb1.a;
                                if (au2Var == null) {
                                    lgv lgvVar = new lgv("SurgeM", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                    a6t0 a6t0Var = new a6t0(iq2.g);
                                    uq90 g = tse0.g(12.73f, 10.52f, 13.92f, 4.0f);
                                    g.i(-8.05f, 9.48f);
                                    g.g(4.46f);
                                    g.h(8.75f, 20.0f);
                                    g.i(8.62f, -9.48f);
                                    g.c();
                                    lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", g.a);
                                    au2Var = rya1.a(lgvVar.d(), true);
                                    bjb1.a = au2Var;
                                }
                                sya1.a(au2Var, null, null, null, btsVar2, 0, 14);
                                jeb1.f(m7k0Var2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).g.a, btsVar2, 0, 0, 16382);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(1 & intValue2, (intValue2 & 19) != 18)) {
                                ijb1.b(m7k0Var2.b, an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() != SlotSize.XS ? 16.0f : 4.0f, 0.0f, 10), null, null, null, null, true, btsVar3, 0, 28);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, wwg.S(294702462, true, new zls() { // from class: bp3
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    m7k0 m7k0Var2 = m7k0Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                lhl0 a = khl0.a(lr20.a, x4c.E, btsVar2, 48);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d = b.d(btsVar2, c530.a);
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
                                qje.W(btsVar2, d.f, a);
                                qje.W(btsVar2, d.e, o);
                                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                qje.M(btsVar2, d.h);
                                qje.W(btsVar2, d.d, d);
                                au2 au2Var = bjb1.a;
                                if (au2Var == null) {
                                    lgv lgvVar = new lgv("SurgeM", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                    a6t0 a6t0Var = new a6t0(iq2.g);
                                    uq90 g = tse0.g(12.73f, 10.52f, 13.92f, 4.0f);
                                    g.i(-8.05f, 9.48f);
                                    g.g(4.46f);
                                    g.h(8.75f, 20.0f);
                                    g.i(8.62f, -9.48f);
                                    g.c();
                                    lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", g.a);
                                    au2Var = rya1.a(lgvVar.d(), true);
                                    bjb1.a = au2Var;
                                }
                                sya1.a(au2Var, null, null, null, btsVar2, 0, 14);
                                jeb1.f(m7k0Var2.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).g.a, btsVar2, 0, 0, 16382);
                                btsVar2.t(true);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (btsVar3.V(1 & intValue2, (intValue2 & 19) != 18)) {
                                ijb1.b(m7k0Var2.b, an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() != SlotSize.XS ? 16.0f : 4.0f, 0.0f, 10), null, null, null, null, true, btsVar3, 0, 28);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), null, null, false, btsVar, 24960, MSException.ERROR_MORE_DATA);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(f530Var, m7k0Var, tlsVar, i, 15);
        }
    }

    public static byte[] b(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Mac mac = (Mac) s1o.c.a.n("HMACSHA256");
        if (i > mac.getMacLength() * 255) {
            kbs.v("size too large");
            return null;
        }
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], "HMACSHA256"));
        } else {
            mac.init(new SecretKeySpec(bArr2, "HMACSHA256"));
        }
        byte[] bArr4 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(bArr), "HMACSHA256"));
        byte[] bArr5 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArr5);
            mac.update(bArr3);
            mac.update((byte) i2);
            bArr5 = mac.doFinal();
            if (bArr5.length + i3 >= i) {
                System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                return bArr4;
            }
            System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
            i3 += bArr5.length;
            i2++;
        }
    }

    public static final List c(vbn0 vbn0Var) {
        if (vbn0Var instanceof rbn0) {
            return Collections.singletonList(((rbn0) vbn0Var).e.a);
        }
        if (!(vbn0Var instanceof sbn0)) {
            if (vbn0Var instanceof ubn0) {
                return Collections.singletonList(((ubn0) vbn0Var).e.a);
            }
            w511.b();
            return null;
        }
        List list = ((sbn0) vbn0Var).e;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((cpm0) it.next()).a);
        }
        return arrayList;
    }

    public static final cpm0 d(vbn0 vbn0Var) {
        if (vbn0Var instanceof rbn0) {
            return ((rbn0) vbn0Var).e;
        }
        if (vbn0Var instanceof sbn0) {
            return (cpm0) a.P(((sbn0) vbn0Var).e);
        }
        if (vbn0Var instanceof ubn0) {
            return ((ubn0) vbn0Var).e;
        }
        w511.b();
        return null;
    }
}
