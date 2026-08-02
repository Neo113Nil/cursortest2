package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.m;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class pmb1 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1905618932);
        if (btsVar.V(i & 1, i != 0)) {
            final long d = ((el51) btsVar.m(gl51.a)).d();
            final long j = ((Boolean) btsVar.m(qti.e)).booleanValue() ? dl51.l : dl51.g;
            r3b1.a(ljs0.e(ljs0.v(c530.a, null, 3), 619.0f), new xhc(d, null), null, null, wwg.S(807915042, true, new zls() { // from class: xj20
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    bj6 bj6Var = (bj6) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((bts) fidVar2).k(bj6Var) ? 4 : 2;
                    }
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                        so5 so5Var = x4c.H;
                        uo5 uo5Var = x4c.B;
                        c530 c530Var = c530.a;
                        f530 a = bj6Var.a(c530Var, uo5Var);
                        sic a2 = qic.a(lr20.c, so5Var, btsVar2, 48);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = b.d(btsVar2, a);
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
                        qje.W(btsVar2, d.f, a2);
                        qje.W(btsVar2, d.e, o);
                        wls wlsVar = d.g;
                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                            b64.z(hashCode, btsVar2, hashCode, wlsVar);
                        }
                        qje.W(btsVar2, d.d, d2);
                        oeb1.c(btsVar2, ljs0.e(c530Var, 38.0f));
                        long j2 = j;
                        long j3 = d;
                        pmb1.c(148.0f, j2, j3, btsVar2, 6, 0);
                        oeb1.c(btsVar2, ljs0.e(c530Var, 14.0f));
                        pmb1.b(328.0f, 54, 4, j2, j3, btsVar2, null);
                        oeb1.c(btsVar2, ljs0.e(c530Var, 58.0f));
                        kj20.c(btsVar2, 0);
                        btsVar2.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 24582, 12);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final float f, final int i, final int i2, long j, long j2, fid fidVar, f530 f530Var) {
        int i3;
        long j3;
        int i4;
        long j4;
        int i5;
        int i6;
        final f530 f530Var2;
        final long j5;
        final long j6;
        aii0 v;
        long j7;
        int i7;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(449970994);
        if ((i & 48) == 0) {
            i3 = i | (btsVar.b(f) ? 32 : 16);
        } else {
            i3 = i;
        }
        int i8 = i3 | 384;
        if ((i2 & 8) == 0) {
            j3 = j;
            if (btsVar.d(j3)) {
                i4 = 2048;
                int i9 = i8 | i4;
                if ((i2 & 16) != 0) {
                    j4 = j2;
                    if (btsVar.d(j4)) {
                        i5 = 16384;
                        i6 = i9 | i5;
                        if (btsVar.V(i6 & 1, (i6 & 9363) != 9362)) {
                            btsVar.a0();
                            if ((i & 1) == 0 || btsVar.C()) {
                                if ((i2 & 8) != 0) {
                                    j3 = ((el51) btsVar.m(gl51.a)).d();
                                    i6 &= -7169;
                                }
                                int i10 = i2 & 16;
                                c530 c530Var = c530.a;
                                if (i10 != 0) {
                                    j4 = ((el51) btsVar.m(gl51.a)).c();
                                    i6 &= -57345;
                                }
                                j7 = j3;
                                i7 = i6;
                                f530Var3 = c530Var;
                            } else {
                                btsVar.Y();
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                }
                                j7 = j3;
                                i7 = i6;
                                f530Var3 = f530Var;
                            }
                            btsVar.u();
                            ocb1.b(ljs0.n(f530Var3, f, 16.0f), 0.0f, j4, j7, ((YandexShapes) btsVar.m(qm51.a)).b(), 0, null, btsVar, ((i7 >> 6) & 896) | (i7 & 7168), 98);
                            long j8 = j7;
                            j5 = j4;
                            j6 = j8;
                            f530Var2 = f530Var3;
                        } else {
                            btsVar.Y();
                            f530Var2 = f530Var;
                            j5 = j4;
                            j6 = j3;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: zj20
                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(i | 1);
                                    pmb1.b(f, O, i2, j6, j5, (fid) obj, f530Var2);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                } else {
                    j4 = j2;
                }
                i5 = 8192;
                i6 = i9 | i5;
                if (btsVar.V(i6 & 1, (i6 & 9363) != 9362)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
        } else {
            j3 = j;
        }
        i4 = 1024;
        int i92 = i8 | i4;
        if ((i2 & 16) != 0) {
        }
        i5 = 8192;
        i6 = i92 | i5;
        if (btsVar.V(i6 & 1, (i6 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if ((r27 & 4) != 0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(float f, long j, long j2, fid fidVar, final int i, final int i2) {
        long j3;
        int i3;
        long j4;
        int i4;
        int i5;
        float f2;
        final long j5;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-939438292);
        if ((i2 & 2) == 0) {
            j3 = j;
            if (btsVar.d(j3)) {
                i3 = 32;
                int i6 = i | i3;
                if ((i2 & 4) != 0) {
                    j4 = j2;
                    if (btsVar.d(j4)) {
                        i4 = 256;
                        i5 = i6 | i4;
                        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
                            btsVar.a0();
                            if ((i & 1) == 0 || btsVar.C()) {
                                if ((i2 & 2) != 0) {
                                    j3 = ((el51) btsVar.m(gl51.a)).d();
                                    i5 &= -113;
                                }
                                if ((i2 & 4) != 0) {
                                    j4 = ((el51) btsVar.m(gl51.a)).c();
                                    i5 &= -897;
                                }
                                long j6 = j3;
                                int i7 = i5;
                                long j7 = j4;
                                btsVar.u();
                                f2 = f;
                                ocb1.b(ljs0.m(c530.a, f2), 0.0f, j7, j6, cyk0.a, 0, null, btsVar, (i7 & 896) | ((i7 << 6) & 7168), 98);
                                j5 = j7;
                                j3 = j6;
                            } else {
                                btsVar.Y();
                                if ((i2 & 2) != 0) {
                                    i5 &= -113;
                                }
                            }
                        } else {
                            f2 = f;
                            btsVar.Y();
                            j5 = j4;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            final float f3 = f2;
                            final long j8 = j3;
                            v.d = new wls(f3, j8, j5, i, i2) { // from class: yj20
                                public final /* synthetic */ float a;
                                public final /* synthetic */ long b;
                                public final /* synthetic */ long c;
                                public final /* synthetic */ int w;

                                {
                                    this.w = i2;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(7);
                                    pmb1.c(this.a, this.b, this.c, (fid) obj, O, this.w);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                } else {
                    j4 = j2;
                }
                i4 = 128;
                i5 = i6 | i4;
                if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
        } else {
            j3 = j;
        }
        i3 = 16;
        int i62 = i | i3;
        if ((i2 & 4) != 0) {
        }
        i4 = 128;
        i5 = i62 | i4;
        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void d(int i, int i2, fid fidVar, f530 f530Var) {
        f530 f530Var2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1397386032);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            f530Var2 = f530Var;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 32 : 16) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 f530Var3 = i4 != 0 ? c530.a : f530Var2;
            f530 m = an91.m(f530Var3, 8.0f, 0.0f, 2);
            l8d.a.getClass();
            web1.c(m, 0.0f, false, 0.0f, null, l8d.b, wwg.S(-1658082868, true, new i0z(6), btsVar), null, null, null, null, null, false, btsVar, 1769472, 0, 8094);
            f530Var2 = f530Var3;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pta(f530Var2, i, i2, 2);
        }
    }

    public static f530 e(f530 f530Var) {
        f530 a;
        a = b.a(f530Var, m.a(), new j2d(5));
        return a;
    }

    public static final soy0 f(soy0 soy0Var, soy0 soy0Var2, float f) {
        return new soy0(cjb1.d(soy0Var.a, soy0Var2.a, f), cjb1.d(soy0Var.b, soy0Var2.b, f));
    }
}
