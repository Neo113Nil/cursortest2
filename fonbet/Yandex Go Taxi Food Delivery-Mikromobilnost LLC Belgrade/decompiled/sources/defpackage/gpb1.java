package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.MtPerforationEdge;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class gpb1 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, float f, float f2, a aVar, fid fidVar, final int i, final int i2) {
        float f3;
        int i3;
        float f4;
        a aVar2;
        final f530 f530Var2;
        final float f5;
        final float f6;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1080068428);
        int i4 = i | 6;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i | 54;
        } else if ((i & 48) == 0) {
            f3 = f;
            i4 |= btsVar.b(f3) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                f4 = f2;
                i4 |= btsVar.b(f4) ? 256 : 128;
                if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
                    if (i5 != 0) {
                        f3 = 4.0f;
                    }
                    float f7 = i3 == 0 ? f4 : 4.0f;
                    long b = ldc.b(rzo.f(4286019447L), 0.5f, 0.0f, 0.0f, 0.0f, 14);
                    byk0 c = cyk0.c(25.0f);
                    c530 c530Var = c530.a;
                    f530 n = an91.n(m4m0.b(c530Var, b, c), f3, 2.0f, f7, 2.0f);
                    lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, n);
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
                    aVar2 = aVar;
                    nnm.p(6, aVar2, btsVar, true);
                    f5 = f3;
                    f6 = f7;
                    f530Var2 = c530Var;
                } else {
                    aVar2 = aVar;
                    btsVar.Y();
                    f530Var2 = f530Var;
                    f5 = f3;
                    f6 = f4;
                }
                v = btsVar.v();
                if (v != null) {
                    final a aVar3 = aVar2;
                    v.d = new wls() { // from class: j2z0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            gpb1.a(f530.this, f5, f6, aVar3, (fid) obj, vng.O(i | 1), i2);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            f4 = f2;
            if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f3 = f;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        f4 = f2;
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void b(f530 f530Var, long j, zls zlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1757687361);
        if ((i & 48) == 0) {
            i2 = (btsVar.d(j) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 k = an91.k(m4m0.b(ymb1.l(ljs0.e(ljs0.c(f530Var, 1.0f), 126.0f), cyk0.c(16.0f)), j, qke.q), 14.0f);
            z910 d = pi6.d(x4c.y, false);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            ly3.x(54, zlsVar, cj6.a, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lq7(f530Var, j, zlsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005e  */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.runtime.internal.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(f530 f530Var, boolean z, float f, a aVar, zls zlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7;
        zls zlsVar2;
        a aVar2;
        boolean z3;
        float f3;
        zls zlsVar3;
        aii0 v;
        float f4;
        boolean z4;
        zls zlsVar4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1354195605);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i4 = i3 | 48;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (btsVar.a(z2) ? 32 : 16);
        }
        if ((i2 & 4) == 0) {
            f2 = f;
            if (btsVar.b(f2)) {
                i5 = 256;
                i6 = i4 | i5;
                i7 = i2 & 16;
                if (i7 == 0) {
                    i6 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    zlsVar2 = zlsVar;
                    i6 |= btsVar.e(zlsVar2) ? 16384 : 8192;
                    if (btsVar.V(i6 & 1, (i6 & 9363) != 9362)) {
                        btsVar.a0();
                        int i10 = i & 1;
                        c530 c530Var = c530.a;
                        if (i10 == 0 || btsVar.C()) {
                            if (i8 != 0) {
                                f530Var2 = c530Var;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 4) != 0) {
                                f4 = z2 ? 298.0f : 314.0f;
                                i6 &= -897;
                            } else {
                                f4 = f2;
                            }
                            if (i7 != 0) {
                                m9d.a.getClass();
                                zlsVar4 = m9d.b;
                                z4 = z2;
                                btsVar.u();
                                f530 k = ipb1.g(m4m0.b(ymb1.l(ljs0.e(ljs0.c(c530Var, 1.0f), f4), cyk0.e(0.0f, 0.0f, 32.0f, 32.0f, 3)), ldc.b(tje.n(AppColor$Palette.ControlMinor, btsVar), 0.1f, 0.0f, 0.0f, 0.0f, 14), qke.q), MtPerforationEdge.Top, z4, false, btsVar, ((i6 << 3) & 896) | 48, 508).k(f530Var2);
                                z910 d = pi6.d(x4c.c, false);
                                int hashCode = Long.hashCode(btsVar.T);
                                r1b0 o = btsVar.o();
                                f530 d2 = b.d(btsVar, k);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar.a != null) {
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
                                cj6 cj6Var = cj6.a;
                                ?? r7 = aVar;
                                r7.invoke(cj6Var, btsVar, 54);
                                ly3.x(((i6 >> 9) & 112) | 6, zlsVar4, cj6Var, btsVar, true);
                                zlsVar3 = zlsVar4;
                                z3 = z4;
                                f3 = f4;
                                aVar2 = r7;
                            } else {
                                z4 = z2;
                            }
                        } else {
                            btsVar.Y();
                            if ((i2 & 4) != 0) {
                                i6 &= -897;
                            }
                            z4 = z2;
                            f4 = f2;
                        }
                        zlsVar4 = zlsVar2;
                        btsVar.u();
                        f530 k2 = ipb1.g(m4m0.b(ymb1.l(ljs0.e(ljs0.c(c530Var, 1.0f), f4), cyk0.e(0.0f, 0.0f, 32.0f, 32.0f, 3)), ldc.b(tje.n(AppColor$Palette.ControlMinor, btsVar), 0.1f, 0.0f, 0.0f, 0.0f, 14), qke.q), MtPerforationEdge.Top, z4, false, btsVar, ((i6 << 3) & 896) | 48, 508).k(f530Var2);
                        z910 d3 = pi6.d(x4c.c, false);
                        int hashCode2 = Long.hashCode(btsVar.T);
                        r1b0 o2 = btsVar.o();
                        f530 d22 = b.d(btsVar, k2);
                        ohd.G1.getClass();
                        sls slsVar2 = d.b;
                        if (btsVar.a != null) {
                        }
                    } else {
                        aVar2 = aVar;
                        btsVar.Y();
                        z3 = z2;
                        f3 = f2;
                        zlsVar3 = zlsVar2;
                    }
                    v = btsVar.v();
                    if (v != null) {
                        v.d = new z640(f530Var2, z3, f3, aVar2, zlsVar3, i, i2);
                        return;
                    }
                    return;
                }
                zlsVar2 = zlsVar;
                if (btsVar.V(i6 & 1, (i6 & 9363) != 9362)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
        } else {
            f2 = f;
        }
        i5 = 128;
        i6 = i4 | i5;
        i7 = i2 & 16;
        if (i7 == 0) {
        }
        zlsVar2 = zlsVar;
        if (btsVar.V(i6 & 1, (i6 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void d(f530 f530Var, long j, a aVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1546106449);
        int i2 = i | 6 | (btsVar.d(j) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            uo5 uo5Var = x4c.y;
            f530Var2 = c530.a;
            f530 k = an91.k(m4m0.b(ymb1.l(ljs0.m(f530Var2, 200.0f), cyk0.c(24.0f)), j, qke.q), 14.0f);
            z910 d = pi6.d(uo5Var, false);
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
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            aVar.invoke(cj6.a, btsVar, 54);
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a92(f530Var2, j, aVar, i);
        }
    }

    public static final void e(final f530 f530Var, final iqx iqxVar, final sls slsVar, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        final AppColor$Palette appColor$Palette;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1465837433);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.e(iqxVar) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            String str = iqxVar.b;
            final String str2 = iqxVar.a;
            if (str == null && str2 == null) {
                v = btsVar.v();
                if (v != null) {
                    final int i5 = 0;
                    wlsVar = new wls(f530Var, iqxVar, slsVar, i, i5) { // from class: h2z0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ f530 b;
                        public final /* synthetic */ iqx c;
                        public final /* synthetic */ sls w;

                        {
                            this.a = i5;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.a;
                            zy11 zy11Var = zy11.a;
                            sls slsVar2 = this.w;
                            iqx iqxVar2 = this.c;
                            f530 f530Var2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    gpb1.e(f530Var2, iqxVar2, slsVar2, fidVar2, vng.O(385));
                                    break;
                                default:
                                    gpb1.e(f530Var2, iqxVar2, slsVar2, fidVar2, vng.O(385));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            final AppColor$Palette appColor$Palette2 = AppColor$Palette.EverFront;
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar);
            }
            f530 b = q791.b(f530Var, (zx40) Q, null, false, null, null, slsVar, 28);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            final String str3 = iqxVar.b;
            if (str3 == null) {
                btsVar.e0(-984274956);
                btsVar.t(false);
                appColor$Palette = appColor$Palette2;
            } else {
                btsVar.e0(-984274955);
                appColor$Palette = appColor$Palette2;
                a(null, 0.0f, 0.0f, wwg.S(-194234405, true, new wls() { // from class: i2z0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i3;
                        zy11 zy11Var = zy11.a;
                        switch (i6) {
                            case 0:
                                fid fidVar2 = (fid) obj;
                                int intValue = ((Integer) obj2).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    jeb1.f(str3, null, appColor$Palette2, uh6.E(10), 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar2, 3456, 0, 32754);
                                    break;
                                }
                            default:
                                fid fidVar3 = (fid) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(1 & intValue2, (intValue2 & 3) != 2)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    long E = uh6.E(10);
                                    String str4 = str3;
                                    AppColor$Palette appColor$Palette3 = appColor$Palette2;
                                    jeb1.f(str4, null, appColor$Palette3, E, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar3, 3456, 0, 32754);
                                    c530 c530Var = c530.a;
                                    oeb1.c(btsVar3, ljs0.q(c530Var, 2.0f));
                                    o4b1.b(mt71.m(dzg0.more_vertical, 0, btsVar3), null, ljs0.q(c530Var, 8.0f), null, null, 0.0f, new c36(tje.n(appColor$Palette3, btsVar3), 5), btsVar3, 440, 56);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 7);
                btsVar.t(false);
            }
            if (str2 == null) {
                btsVar.e0(-984148507);
                btsVar.t(false);
            } else {
                btsVar.e0(-984148506);
                oeb1.c(btsVar, ljs0.q(c530.a, 4.0f));
                a(null, 5.0f, 3.0f, wwg.S(-1502250478, true, new wls() { // from class: i2z0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i4;
                        zy11 zy11Var = zy11.a;
                        switch (i6) {
                            case 0:
                                fid fidVar2 = (fid) obj;
                                int intValue = ((Integer) obj2).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    jeb1.f(str2, null, appColor$Palette, uh6.E(10), 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar2, 3456, 0, 32754);
                                    break;
                                }
                            default:
                                fid fidVar3 = (fid) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(1 & intValue2, (intValue2 & 3) != 2)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    long E = uh6.E(10);
                                    String str4 = str2;
                                    AppColor$Palette appColor$Palette3 = appColor$Palette;
                                    jeb1.f(str4, null, appColor$Palette3, E, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar3, 3456, 0, 32754);
                                    c530 c530Var = c530.a;
                                    oeb1.c(btsVar3, ljs0.q(c530Var, 2.0f));
                                    o4b1.b(mt71.m(dzg0.more_vertical, 0, btsVar3), null, ljs0.q(c530Var, 8.0f), null, null, 0.0f, new c36(tje.n(appColor$Palette3, btsVar3), 5), btsVar3, 440, 56);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, 3504, 1);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            final int i6 = 1;
            wlsVar = new wls(f530Var, iqxVar, slsVar, i, i6) { // from class: h2z0
                public final /* synthetic */ int a;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ iqx c;
                public final /* synthetic */ sls w;

                {
                    this.a = i6;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.a;
                    zy11 zy11Var = zy11.a;
                    sls slsVar22 = this.w;
                    iqx iqxVar2 = this.c;
                    f530 f530Var2 = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            gpb1.e(f530Var2, iqxVar2, slsVar22, fidVar2, vng.O(385));
                            break;
                        default:
                            gpb1.e(f530Var2, iqxVar2, slsVar22, fidVar2, vng.O(385));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final f530 f(fid fidVar, f530 f530Var) {
        return ((bts) fidVar).m(j.n) == LayoutDirection.Rtl ? gza1.b(f530Var, -1.0f, 1.0f) : f530Var;
    }
}
