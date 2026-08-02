package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.a7y;
import defpackage.an91;
import defpackage.bg30;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dl01;
import defpackage.ec01;
import defpackage.f530;
import defpackage.fao;
import defpackage.fid;
import defpackage.gub1;
import defpackage.h611;
import defpackage.h711;
import defpackage.ia11;
import defpackage.j611;
import defpackage.j690;
import defpackage.ja11;
import defpackage.jub1;
import defpackage.ka11;
import defpackage.kub1;
import defpackage.la11;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ohd;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.r611;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.vqb1;
import defpackage.wg6;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ysa1;
import defpackage.z3z0;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class kub1 {
    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void b(final boolean z, final boolean z2, final la11 la11Var, final tls tlsVar, final tls tlsVar2, final wls wlsVar, fid fidVar, final int i) {
        int i2;
        boolean z3;
        aii0 v;
        wls wlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1884064860);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z2;
            i2 |= btsVar.a(z3) ? 32 : 16;
        } else {
            z3 = z2;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(la11Var) : btsVar.e(la11Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(wlsVar) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            final wg6 a = b.a(false, 0.0f, sb2.K(z ? 0 : Constants.MINIMAL_ERROR_STATUS_CODE, 0, ubn.a, 2), false, null, null, null, null, btsVar, 48, 0, 8157);
            ger.a(a, 400.0f, true, btsVar, 432, 12);
            lg6 c = qab1.c(a, new up2(ldc.l), null, btsVar, 432, 0);
            if (!z && (la11Var instanceof ka11)) {
                btsVar.e0(-1542810410);
                boolean z4 = (i2 & 7168) == 2048;
                Object Q = btsVar.Q();
                if (z4 || Q == did.a) {
                    Q = new fc01(i3, tlsVar);
                    btsVar.o0(Q);
                }
                xqb1.a((sls) Q, btsVar, 0);
                btsVar.t(false);
                v = btsVar.v();
                if (v != null) {
                    final int i4 = 0;
                    final boolean z5 = z3;
                    wlsVar2 = new wls() { // from class: t911
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i6 | 1);
                                    kub1.b(z, z5, la11Var, tlsVar, tlsVar2, wlsVar, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(i6 | 1);
                                    kub1.b(z, z5, la11Var, tlsVar, tlsVar2, wlsVar, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar2;
                }
                return;
            }
            btsVar.e0(-1542710466);
            btsVar.t(false);
            c.a(null, a, c, false, false, null, null, null, wwg.S(294578641, true, new ls40(27, a, la11Var, tlsVar), btsVar), null, null, wwg.S(1562962692, true, new bms() { // from class: com.yandex.go.multimodal_route.ui.transport_tracking.d
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    j690 j690Var = (j690) obj2;
                    fid fidVar2 = (fid) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                    }
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 145) != 144)) {
                        la11 la11Var2 = la11.this;
                        if (la11Var2 instanceof ka11) {
                            btsVar2.e0(-1231403886);
                            jub1.b(btsVar2, 0);
                            btsVar2.t(false);
                        } else {
                            boolean z6 = la11Var2 instanceof ia11;
                            tls tlsVar3 = tlsVar;
                            Object obj5 = did.a;
                            if (z6) {
                                btsVar2.e0(481279316);
                                ia11 ia11Var = (ia11) la11Var2;
                                bg30 bg30Var = ia11Var.e;
                                boolean e = btsVar2.e(la11Var2) | btsVar2.k(tlsVar3);
                                Object Q2 = btsVar2.Q();
                                if (e || Q2 == obj5) {
                                    Q2 = new TransportTrackingCardScreenKt$TransportTrackingCardScreen$4$1$1(la11Var2, tlsVar3, null);
                                    btsVar2.o0(Q2);
                                }
                                zpn.e(btsVar2, (wls) Q2, bg30Var);
                                int i5 = intValue;
                                String str = ia11Var.f;
                                CharSequence charSequence = ia11Var.a;
                                ArrayList arrayList = ia11Var.b;
                                boolean z7 = ia11Var.h;
                                Object obj6 = wlsVar;
                                boolean k = btsVar2.k(obj6) | btsVar2.e(la11Var2);
                                Object Q3 = btsVar2.Q();
                                if (k || Q3 == obj5) {
                                    Q3 = new dl01(14, obj6, la11Var2);
                                    btsVar2.o0(Q3);
                                }
                                kub1.c(str, z2, charSequence, arrayList, z7, tlsVar2, tlsVar3, (tls) Q3, a, j690Var, btsVar2, (i5 << 24) & 1879048192);
                                btsVar2.t(false);
                            } else {
                                if (!(la11Var2 instanceof ja11)) {
                                    throw unr0.y(-1231404721, btsVar2, false);
                                }
                                btsVar2.e0(482264248);
                                fao faoVar = ((ja11) la11Var2).b;
                                boolean k2 = btsVar2.k(tlsVar3) | btsVar2.e(la11Var2);
                                Object Q4 = btsVar2.Q();
                                if (k2 || Q4 == obj5) {
                                    Q4 = new dl01(15, tlsVar3, la11Var2);
                                    btsVar2.o0(Q4);
                                }
                                vqb1.a(faoVar, (tls) Q4, btsVar2, 0);
                                btsVar2.t(false);
                            }
                        }
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 100663296, 48, 1785);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            final int i5 = 1;
            wlsVar2 = new wls() { // from class: t911
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i5;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(i6 | 1);
                            kub1.b(z, z2, la11Var, tlsVar, tlsVar2, wlsVar, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(i6 | 1);
                            kub1.b(z, z2, la11Var, tlsVar, tlsVar2, wlsVar, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar2;
        }
    }

    public static final void c(final String str, final boolean z, final CharSequence charSequence, final ArrayList arrayList, final boolean z2, final tls tlsVar, final tls tlsVar2, final tls tlsVar3, wg6 wg6Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        wg6 wg6Var2;
        final j690 j690Var2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(291771689);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar2.k(arrayList) : btsVar2.e(arrayList) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.a(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar2.e(tlsVar3) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            wg6Var2 = wg6Var;
            i2 |= btsVar2.k(wg6Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        } else {
            wg6Var2 = wg6Var;
        }
        if ((805306368 & i) == 0) {
            j690Var2 = j690Var;
            i2 |= btsVar2.k(j690Var2) ? 536870912 : SelfTester_JCP.IMITA;
        } else {
            j690Var2 = j690Var;
        }
        if (btsVar2.V(i2 & 1, (306783379 & i2) != 306783378)) {
            final wg6 wg6Var3 = wg6Var2;
            btsVar = btsVar2;
            rzo.b(null, "default", wwg.S(224515397, true, new wls() { // from class: com.yandex.go.multimodal_route.ui.transport_tracking.e
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    Throwable th;
                    boolean z4;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar3 = (bts) fidVar2;
                    boolean V = btsVar3.V(intValue & 1, (intValue & 3) != 2);
                    zy11 zy11Var = zy11.a;
                    if (!V) {
                        btsVar3.Y();
                        return zy11Var;
                    }
                    int i3 = 3;
                    androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar3);
                    c530 c530Var = c530.a;
                    f530 u = ljs0.u(ljs0.c(c530Var, 1.0f), null, 3);
                    boolean z5 = z2;
                    f530 j = an91.j(u.k(z5 ? an91.o(c530Var, 0.0f, 16.0f, 0.0f, 0.0f, 13) : c530Var), j690Var2);
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar3, 0);
                    int hashCode = Long.hashCode(btsVar3.T);
                    r1b0 o = btsVar3.o();
                    f530 d = androidx.compose.ui.b.d(btsVar3, j);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, androidx.compose.ui.node.d.f, a2);
                    qje.W(btsVar3, androidx.compose.ui.node.d.e, o);
                    qje.W(btsVar3, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar3, androidx.compose.ui.node.d.h);
                    qje.W(btsVar3, androidx.compose.ui.node.d.d, d);
                    CharSequence charSequence2 = charSequence;
                    if (charSequence2 == null) {
                        btsVar3.e0(-361599275);
                        btsVar3.t(false);
                        z3 = z5;
                        th = null;
                    } else {
                        btsVar3.e0(-361599274);
                        if (z5) {
                            btsVar3.e0(1987800095);
                            z3 = z5;
                            th = null;
                            ysa1.a(charSequence2.toString(), "", null, false, btsVar3, 48);
                            btsVar3.t(false);
                        } else {
                            z3 = z5;
                            th = null;
                            btsVar3.e0(1987942509);
                            qgy.b(charSequence2, null, an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 8.0f, 5), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar3, 384, 0, 16378);
                            btsVar3 = btsVar3;
                            btsVar3.t(false);
                        }
                        btsVar3.t(false);
                    }
                    ArrayList arrayList2 = arrayList;
                    boolean k = btsVar3.k(arrayList2);
                    Object Q = btsVar3.Q();
                    Object obj3 = did.a;
                    if (k || Q == obj3) {
                        if (!arrayList2.isEmpty()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                if (((h711) it.next()) instanceof j611) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                        z4 = false;
                        Q = Boolean.valueOf(z4);
                        btsVar3.o0(Q);
                    }
                    boolean booleanValue = ((Boolean) Q).booleanValue();
                    boolean z6 = ((h711) kotlin.collections.a.R(arrayList2)) instanceof r611;
                    ArrayList arrayList3 = new ArrayList();
                    int i4 = 0;
                    for (Object obj4 : arrayList2) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            scc.m();
                            throw th;
                        }
                        h711 h711Var = (h711) obj4;
                        if (z || ((!booleanValue && z6) || !(h711Var instanceof h611))) {
                            arrayList3.add(obj4);
                        }
                        i4 = i5;
                    }
                    btsVar3.e0(-360679969);
                    tls tlsVar4 = tlsVar2;
                    boolean k2 = btsVar3.k(tlsVar4);
                    Object Q2 = btsVar3.Q();
                    if (k2 || Q2 == obj3) {
                        Q2 = new ec01(i3, tlsVar4);
                        btsVar3.o0(Q2);
                    }
                    tls tlsVar5 = (tls) Q2;
                    boolean k3 = btsVar3.k(tlsVar4);
                    Object Q3 = btsVar3.Q();
                    if (k3 || Q3 == obj3) {
                        Q3 = new ec01(4, tlsVar4);
                        btsVar3.o0(Q3);
                    }
                    tls tlsVar6 = (tls) Q3;
                    boolean k4 = btsVar3.k(tlsVar4);
                    Object Q4 = btsVar3.Q();
                    if (k4 || Q4 == obj3) {
                        Q4 = new ec01(5, tlsVar4);
                        btsVar3.o0(Q4);
                    }
                    tls tlsVar7 = (tls) Q4;
                    boolean k5 = btsVar3.k(tlsVar4);
                    Object Q5 = btsVar3.Q();
                    if (k5 || Q5 == obj3) {
                        Q5 = new ec01(6, tlsVar4);
                        btsVar3.o0(Q5);
                    }
                    tls tlsVar8 = (tls) Q5;
                    boolean k6 = btsVar3.k(tlsVar4);
                    String str2 = str;
                    boolean k7 = k6 | btsVar3.k(str2);
                    Object Q6 = btsVar3.Q();
                    if (k7 || Q6 == obj3) {
                        Q6 = new z3z0(tlsVar4, str2);
                        btsVar3.o0(Q6);
                    }
                    bts btsVar4 = btsVar3;
                    gub1.b(arrayList3, null, tlsVar5, tlsVar6, tlsVar7, tlsVar8, null, tlsVar3, a, false, z3, (tls) Q6, false, btsVar4, 0, 0, 4674);
                    btsVar4.t(false);
                    boolean k8 = btsVar4.k(a);
                    wg6 wg6Var4 = wg6Var3;
                    boolean k9 = k8 | btsVar4.k(wg6Var4) | btsVar4.k(tlsVar4);
                    tls tlsVar9 = tlsVar;
                    boolean k10 = k9 | btsVar4.k(tlsVar9);
                    Object Q7 = btsVar4.Q();
                    if (k10 || Q7 == obj3) {
                        TransportTrackingCardScreenKt$TransportTrackingCardScreenContent$2$1$4$1 transportTrackingCardScreenKt$TransportTrackingCardScreenContent$2$1$4$1 = new TransportTrackingCardScreenKt$TransportTrackingCardScreenContent$2$1$4$1(a, wg6Var4, tlsVar4, tlsVar9, null);
                        btsVar4.o0(transportTrackingCardScreenKt$TransportTrackingCardScreenContent$2$1$4$1);
                        Q7 = transportTrackingCardScreenKt$TransportTrackingCardScreenContent$2$1$4$1;
                    }
                    zpn.e(btsVar4, (wls) Q7, zy11Var);
                    btsVar4.t(true);
                    return zy11Var;
                }
            }, btsVar2), btsVar, 3456, 3);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new x4l0(str, z, charSequence, arrayList, z2, tlsVar, tlsVar2, tlsVar3, wg6Var, j690Var, i);
        }
    }

    public static final String d(xdf xdfVar, ief iefVar, String str) {
        return xdfVar.a(iefVar != null ? gwk0.h(iefVar) : null, str, false, true);
    }

    public static final String e(xdf xdfVar, ief iefVar, String str) {
        return xdfVar.a(iefVar != null ? gwk0.h(iefVar) : null, str, false, false);
    }
}
