package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class l0b1 {
    public static c0m a;
    public static boolean b;

    public static final void a(final pum0 pum0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(683603969);
        int i2 = 16;
        int i3 = (btsVar.k(pum0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(c530Var, 8.0f);
            boolean b2 = btsVar.b(4.0f) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (b2 || Q == o430Var) {
                Q = new jg0(29);
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
            boolean z = pum0Var.a;
            boolean z2 = !z;
            f530 b3 = ofb1.b(c530Var, z, null, 14);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new wzl0(i2, tlsVar);
                btsVar.o0(Q2);
            }
            final int i5 = 0;
            ulb1.a(b3, z2, null, (sls) Q2, wwg.S(85286257, true, new zls() { // from class: jum0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    pum0 pum0Var2 = pum0Var;
                    switch (i6) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                qgy.b(pum0Var2.h, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar2, 0, 0, 16382);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                qgy.b(pum0Var2.i, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.b, null, btsVar3, 0, 0, 12286);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 4);
            boolean z4 = pum0Var.a;
            boolean z5 = !z4;
            f530 b4 = ofb1.b(c530Var, z4, null, 14);
            boolean z6 = i4 == 32;
            Object Q3 = btsVar.Q();
            if (z6 || Q3 == o430Var) {
                Q3 = new wzl0(17, tlsVar);
                btsVar.o0(Q3);
            }
            final int i6 = 1;
            ohb1.b(b4, z5, null, (sls) Q3, wwg.S(1010143775, true, new zls() { // from class: jum0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i62 = i6;
                    zy11 zy11Var = zy11.a;
                    pum0 pum0Var2 = pum0Var;
                    switch (i62) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                qgy.b(pum0Var2.h, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar2, 0, 0, 16382);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                qgy.b(pum0Var2.i, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar3).g.b, null, btsVar3, 0, 0, 12286);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 4);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(pum0Var, tlsVar, i, 20);
        }
    }

    public static final void b(xau xauVar, final tls tlsVar, final tls tlsVar2, fid fidVar, int i) {
        int i2;
        a aVar;
        final jvs0 jvs0Var;
        final jvs0 jvs0Var2;
        a aVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1577624442);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xauVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            v4v v4vVar = xauVar.c;
            CharSequence charSequence = xauVar.d;
            bcu bcuVar = xauVar.e;
            jvs0 jvs0Var3 = xauVar.f;
            jvs0 jvs0Var4 = xauVar.g;
            d9u d9uVar = xauVar.h;
            a aVar3 = null;
            if (v4vVar == null) {
                btsVar.e0(-817109376);
                btsVar.t(false);
                aVar = null;
            } else {
                btsVar.e0(-817109375);
                a S = wwg.S(-1073192253, true, new mb(v4vVar, 12), btsVar);
                btsVar.t(false);
                aVar = S;
            }
            a S2 = wwg.S(1198396510, true, new wzr(charSequence, bcuVar, tlsVar2, d9uVar), btsVar);
            if (jvs0Var3 == null) {
                btsVar.e0(-816710437);
                btsVar.t(false);
                jvs0Var = jvs0Var3;
                jvs0Var2 = jvs0Var4;
                aVar2 = null;
            } else {
                btsVar.e0(-816710436);
                jvs0Var = jvs0Var3;
                final int i3 = 0;
                jvs0Var2 = jvs0Var4;
                a S3 = wwg.S(245166927, true, new wls() { // from class: mau
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        zy11 zy11Var = zy11.a;
                        jvs0 jvs0Var5 = jvs0Var2;
                        switch (i4) {
                            case 0:
                                fid fidVar2 = (fid) obj;
                                int intValue = ((Integer) obj2).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.a(jvs0Var, true, jvs0Var5 == null, tlsVar, tlsVar2, btsVar2, 48, 0);
                                    break;
                                }
                            default:
                                fid fidVar3 = (fid) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.a(jvs0Var, jvs0Var5 == null, true, tlsVar, tlsVar2, btsVar3, 384, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar);
                btsVar.t(false);
                aVar2 = S3;
            }
            if (jvs0Var2 == null) {
                btsVar.e0(-816386084);
                btsVar.t(false);
            } else {
                btsVar.e0(-816386083);
                final int i4 = 1;
                final jvs0 jvs0Var5 = jvs0Var2;
                final jvs0 jvs0Var6 = jvs0Var;
                aVar3 = wwg.S(937061249, true, new wls() { // from class: mau
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i42 = i4;
                        zy11 zy11Var = zy11.a;
                        jvs0 jvs0Var52 = jvs0Var6;
                        switch (i42) {
                            case 0:
                                fid fidVar2 = (fid) obj;
                                int intValue = ((Integer) obj2).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.a(jvs0Var5, true, jvs0Var52 == null, tlsVar, tlsVar2, btsVar2, 48, 0);
                                    break;
                                }
                            default:
                                fid fidVar3 = (fid) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.a(jvs0Var5, jvs0Var52 == null, true, tlsVar, tlsVar2, btsVar3, 384, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar);
                btsVar.t(false);
            }
            web1.c(null, 64.0f, false, 0.0f, null, aVar, S2, null, null, aVar2, aVar3, oa01.d, false, btsVar, 1572864, 0, 4509);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(xauVar, tlsVar, tlsVar2, i, 22);
        }
    }

    public static final void c(CharSequence charSequence, fid fidVar, int i) {
        CharSequence charSequence2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-845589503);
        int i2 = (btsVar.e(charSequence) ? 4 : 2) | i;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 d = hi91.d(c530.a, false, null, 3);
            boolean e = btsVar.e(charSequence);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new oau(i3, charSequence);
                btsVar.o0(Q);
            }
            f530 a2 = fnq0.a(d, (tls) Q);
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a2);
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
            qje.W(btsVar, d.f, a3);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            charSequence2 = charSequence;
            zgb1.a(charSequence2, null, 0, false, null, null, false, null, btsVar, i2 & 14, 254);
            btsVar.t(true);
        } else {
            charSequence2 = charSequence;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 11, charSequence2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [f530] */
    public static final void d(CharSequence charSequence, bcu bcuVar, sls slsVar, fid fidVar, int i) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1368207984);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(charSequence) ? 4 : 2) | (btsVar.k(bcuVar) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object m = btsVar.m(j.n);
            LayoutDirection layoutDirection = LayoutDirection.Rtl;
            c530 c530Var = c530.a;
            c530 b2 = m == layoutDirection ? gza1.b(c530Var, -1.0f, 1.0f) : c530Var;
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530Var);
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
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c(charSequence, btsVar, i2 & 14);
            if (bcuVar != null) {
                dty0 dty0Var = bcuVar.b;
                ldc ldcVar = dty0Var.c;
                btsVar.e0(165414245);
                boolean z3 = (i2 & 896) == 256;
                Object Q = btsVar.Q();
                if (z3 || Q == did.a) {
                    Q = new zvr(4, slsVar);
                    btsVar.o0(Q);
                }
                f530 d2 = q791.d(c530Var, false, null, null, (sls) Q, 15);
                lhl0 a3 = khl0.a(lr20.a, x4c.E, btsVar, 54);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d3 = b.d(btsVar, d2);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar2);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a3);
                qje.W(btsVar, wlsVar2, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
                }
                qje.W(btsVar, wlsVar4, d3);
                String str = bcuVar.a;
                sty0 sty0Var = dty0Var.a;
                long j3 = sty0Var != null ? sty0Var.a : sty0.c;
                lzr lzrVar = dty0Var.b;
                if (ldcVar == null) {
                    btsVar.e0(1904995619);
                    j = ((el51) btsVar.m(gl51.a)).n();
                    z2 = false;
                    btsVar.t(false);
                } else {
                    z2 = false;
                    btsVar.e0(1904994286);
                    btsVar.t(false);
                    j = ldcVar.a;
                }
                boolean z4 = z2;
                wqy0.b(str, null, j, j3, null, lzrVar, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, btsVar, 0, 3120, 120786);
                btsVar = btsVar;
                int i3 = wzg0.ic_chevron_right_text_nav;
                if (ldcVar == null) {
                    btsVar.e0(1905008996);
                    j2 = ((el51) btsVar.m(gl51.a)).o();
                    btsVar.t(z4);
                } else {
                    btsVar.e0(1905007663);
                    btsVar.t(z4);
                    j2 = ldcVar.a;
                }
                s3b1.f(new cuj0(i3, null, null, new zez0(j2), 22), an91.o(b2, 1.0f, 0.0f, 0.0f, 0.0f, 14), null, btsVar, 0, 4);
                z = true;
                btsVar.t(true);
                btsVar.t(z4);
            } else {
                z = true;
                btsVar.e0(166441864);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm((Object) charSequence, (Object) bcuVar, slsVar, i, 15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r3 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(pum0 pum0Var, fid fidVar, int i) {
        bts btsVar;
        kum0 kum0Var;
        aii0 aii0Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1102988421);
        int i2 = (btsVar2.k(pum0Var) ? 4 : 2) | i;
        int i3 = 0;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            f530 m = an91.m(c530.a, 16.0f, 0.0f, 2);
            CharSequence charSequence = pum0Var.g;
            if (charSequence != null) {
                if (charSequence.length() <= 0) {
                    charSequence = null;
                }
            }
            charSequence = pum0Var.e;
            if (charSequence == null) {
                aii0Var = btsVar2.v();
                if (aii0Var != null) {
                    kum0Var = new kum0(pum0Var, i, i3);
                    aii0Var.d = kum0Var;
                }
                return;
            }
            btsVar = btsVar2;
            qgy.b(charSequence, null, m, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).g.a, null, btsVar, 3456, 0, 12274);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0Var = btsVar.v();
        if (aii0Var != null) {
            kum0Var = new kum0(pum0Var, i, 1);
            aii0Var.d = kum0Var;
        }
    }

    public static final void f(pum0 pum0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(759158998);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(pum0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 29;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new ut9(i3, pum0Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(pum0Var, tlsVar, i, i3);
        }
    }

    public static final void g(pum0 pum0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2119198371);
        int i2 = 2;
        int i3 = (btsVar.k(pum0Var) ? 4 : 2) | i;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            z3b1.a(null, true ^ pum0Var.a, pum0Var.b, pum0Var.c, pum0Var.d, null, pum0Var.f, null, btsVar, 0, 161);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kum0(pum0Var, i, i2);
        }
    }

    public static final void h(Throwable th) {
        c0m c0mVar = a;
        if (c0mVar == null) {
            c0mVar = null;
        }
        c0mVar.invoke(th);
    }
}
