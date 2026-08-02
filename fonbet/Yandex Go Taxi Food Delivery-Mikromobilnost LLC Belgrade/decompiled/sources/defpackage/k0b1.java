package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;

/* loaded from: classes11.dex */
public abstract class k0b1 {
    public static final c83 a(Address address, zzs zzsVar, SourcePicker sourcePicker, ModalViewOrigin modalViewOrigin, boolean z, gzi gziVar) {
        if (address == null) {
            PlainAddress.Companion.getClass();
            address = zgc0.a(zzsVar);
        }
        return new c83(new s80(address), sourcePicker, modalViewOrigin, z, gziVar);
    }

    public static final void b(final ctm0 ctm0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z;
        tls tlsVar2;
        final ctm0 ctm0Var2 = ctm0Var;
        tls tlsVar3 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1296523756);
        int i3 = i | (btsVar.k(ctm0Var2) ? 4 : 2) | (btsVar.e(tlsVar3) ? 32 : 16);
        final int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(c530Var, 8.0f);
            boolean b = btsVar.b(4.0f) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (b || Q == o430Var) {
                Q = new jg0(28);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            CharSequence charSequence = ctm0Var2.f;
            boolean z2 = ctm0Var2.g;
            int i5 = 14;
            if (charSequence == null || charSequence.length() == 0) {
                final int i6 = 0;
                btsVar.e0(808100723);
                boolean z3 = !z2;
                f530 b2 = ofb1.b(c530Var, z2, null, 14);
                boolean z4 = (i3 & 112) == 32;
                Object Q2 = btsVar.Q();
                if (z4 || Q2 == o430Var) {
                    Q2 = new wzl0(12, tlsVar3);
                    btsVar.o0(Q2);
                }
                a S = wwg.S(1547938357, true, new zls() { // from class: tsm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7 = i6;
                        zy11 zy11Var = zy11.a;
                        ctm0 ctm0Var3 = ctm0Var2;
                        switch (i7) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var, ctm0Var3.e, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue & 14, 0, 16382);
                                    break;
                                }
                            case 1:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var2, ctm0Var3.e, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 16382);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var3 = (ebp0) obj;
                                fid fidVar4 = (fid) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar4).k(ebp0Var3) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar4;
                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var3, ctm0Var3.f, null, null, xya1.e(btsVar4).g.b, 0, 0, null, null, null, 0, 0, null, btsVar4, intValue3 & 14, 0, 16374);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar);
                i2 = 0;
                z = true;
                ctm0Var2 = ctm0Var;
                tlsVar3 = tlsVar;
                phb1.b((sls) Q2, b2, z3, null, null, S, null, null, null, btsVar, ImageMetadata.EDGE_MODE, 984);
                btsVar.t(false);
            } else {
                btsVar.e0(808430098);
                boolean z5 = !z2;
                f530 b3 = ofb1.b(c530Var, z2, null, 14);
                int i7 = i3 & 112;
                boolean z6 = i7 == 32;
                Object Q3 = btsVar.Q();
                if (z6 || Q3 == o430Var) {
                    Q3 = new wzl0(13, tlsVar3);
                    btsVar.o0(Q3);
                }
                xlb1.a((sls) Q3, b3, z5, null, null, wwg.S(2130130704, true, new zls() { // from class: tsm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i72 = i4;
                        zy11 zy11Var = zy11.a;
                        ctm0 ctm0Var3 = ctm0Var2;
                        switch (i72) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var, ctm0Var3.e, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue & 14, 0, 16382);
                                    break;
                                }
                            case 1:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var2, ctm0Var3.e, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 16382);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var3 = (ebp0) obj;
                                fid fidVar4 = (fid) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar4).k(ebp0Var3) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar4;
                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var3, ctm0Var3.f, null, null, xya1.e(btsVar4).g.b, 0, 0, null, null, null, 0, 0, null, btsVar4, intValue3 & 14, 0, 16374);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, btsVar, ImageMetadata.EDGE_MODE, 984);
                boolean z7 = !z2;
                f530 b4 = ofb1.b(c530Var, z2, null, 14);
                boolean z8 = i7 == 32;
                Object Q4 = btsVar.Q();
                if (z8 || Q4 == o430Var) {
                    tlsVar2 = tlsVar;
                    Q4 = new wzl0(i5, tlsVar2);
                    btsVar.o0(Q4);
                } else {
                    tlsVar2 = tlsVar;
                }
                final int i8 = 2;
                z = true;
                phb1.b((sls) Q4, b4, z7, null, null, wwg.S(1498222782, true, new zls() { // from class: tsm0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i72 = i8;
                        zy11 zy11Var = zy11.a;
                        ctm0 ctm0Var3 = ctm0Var;
                        switch (i72) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var, ctm0Var3.e, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue & 14, 0, 16382);
                                    break;
                                }
                            case 1:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var2, ctm0Var3.e, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 16382);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var3 = (ebp0) obj;
                                fid fidVar4 = (fid) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar4).k(ebp0Var3) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar4;
                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    m9b1.a(ebp0Var3, ctm0Var3.f, null, null, xya1.e(btsVar4).g.b, 0, 0, null, null, null, 0, 0, null, btsVar4, intValue3 & 14, 0, 16374);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, btsVar, ImageMetadata.EDGE_MODE, 984);
                btsVar.t(false);
                ctm0Var2 = ctm0Var;
                tlsVar3 = tlsVar2;
                i2 = 0;
            }
            btsVar.t(z);
        } else {
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rsm0(ctm0Var2, tlsVar3, i, i2);
        }
    }

    public static final void c(gbe gbeVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1256793716);
        int i2 = (btsVar.k(gbeVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            String str = gbeVar.a;
            String str2 = gbeVar.b;
            if (str2 == null || evu0.J(str2)) {
                str2 = null;
            }
            c530 c530Var = c530.a;
            f530 k = an91.k(c530Var, 16.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            i(str, btsVar, 0);
            if (str2 != null) {
                btsVar.e0(-1438456794);
                oeb1.c(btsVar, ljs0.m(c530Var, 16.0f));
                h(str2, btsVar, 0);
                btsVar.t(false);
            } else {
                btsVar.e0(-1438366460);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bns(gbeVar, i, 6);
        }
    }

    public static final void d(ctm0 ctm0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-682378132);
        int i2 = i | (btsVar.k(ctm0Var) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 m = an91.m(c530.a, 16.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            btm0 btm0Var = ctm0Var.a;
            qgy.b(btm0Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).e.d, null, btsVar, 0, 0, 12286);
            btsVar = btsVar;
            if (btm0Var.b.length() > 0) {
                btsVar.e0(298515020);
                qgy.b(btm0Var.b, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(298663200);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lbb0(ctm0Var, i, 21);
        }
    }

    public static final void e(ctm0 ctm0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2010184968);
        int i2 = (btsVar.k(ctm0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            zsm0 zsm0Var = ctm0Var.c;
            ydb1.a(an91.o(c530.a, 0.0f, 4.0f, 0.0f, 0.0f, 13), wwg.S(1046113330, true, new qsm0(zsm0Var, i3), btsVar), wwg.S(-2099486761, true, new qsm0(zsm0Var, 3), btsVar), null, wwg.S(-1976046243, true, new ls40(ctm0Var, tlsVar, zsm0Var, 15), btsVar), null, null, false, btsVar, 25014, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rsm0(ctm0Var, tlsVar, i, 2);
        }
    }

    public static final void f(ctm0 ctm0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-493211070);
        int i2 = (btsVar.k(ctm0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            atm0 atm0Var = ctm0Var.d;
            f530 o = an91.o(c530.a, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            qbd.a.getClass();
            ydb1.a(o, qbd.b, wwg.S(1182848017, true, new ssm0(atm0Var, i3), btsVar), null, wwg.S(1613580183, true, new ls40(ctm0Var, tlsVar, atm0Var, 14), btsVar), null, null, false, btsVar, 25014, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rsm0(ctm0Var, tlsVar, i, 1);
        }
    }

    public static final void g(ctm0 ctm0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1952769358);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ctm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new ut9(27, ctm0Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(ctm0Var, tlsVar, i, 28);
        }
    }

    public static final void h(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(794793851);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.f(str, null, 0L, null, lzr.D, null, 0L, 0L, 0L, null, 0, false, Integer.MAX_VALUE, null, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, HProv.ALG_TYPE_SECURECHANNEL, 57326);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 29);
        }
    }

    public static final void i(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(425851679);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.j(str, null, 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, HProv.ALG_TYPE_SECURECHANNEL, 57326);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 28);
        }
    }
}
