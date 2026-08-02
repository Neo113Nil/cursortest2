package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class o4b1 {
    public static final void a(mgv mgvVar, String str, f530 f530Var, c36 c36Var, fid fidVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            f530Var = c530.a;
        }
        f530 f530Var2 = f530Var;
        uo5 uo5Var = x4c.y;
        if ((i2 & 64) != 0) {
            c36Var = null;
        }
        b(ba91.c(mgvVar, fidVar), str, f530Var2, uo5Var, mhe.b, 1.0f, c36Var, fidVar, (i & 112) | 8 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final pa90 pa90Var, final String str, f530 f530Var, jt1 jt1Var, nhe nheVar, float f, wec wecVar, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        int i5;
        nhe nheVar2;
        int i6;
        float f2;
        int i7;
        wec wecVar2;
        int i8;
        final f530 f530Var3;
        final nhe nheVar3;
        final float f3;
        final wec wecVar3;
        final jt1 jt1Var2;
        aii0 v;
        jt1 jt1Var3;
        nhe nheVar4;
        jt1 jt1Var4;
        float f4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1142754848);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar.k(pa90Var) : btsVar.e(pa90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.k(jt1Var) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    nheVar2 = nheVar;
                    i3 |= btsVar.k(nheVar2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ImageMetadata.EDGE_MODE;
                    } else if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= btsVar.b(f2) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            wecVar2 = wecVar;
                            i3 |= btsVar.k(wecVar2) ? 1048576 : 524288;
                            i8 = i3;
                            if (btsVar.V(i8 & 1, (i3 & 599187) == 599186)) {
                                btsVar.Y();
                                f530Var3 = f530Var2;
                                nheVar3 = nheVar2;
                                f3 = f2;
                                wecVar3 = wecVar2;
                                jt1Var2 = jt1Var;
                            } else {
                                f530 f530Var4 = c530.a;
                                f530 f530Var5 = i9 != 0 ? f530Var4 : f530Var2;
                                jt1 jt1Var5 = i4 != 0 ? x4c.y : jt1Var;
                                if (i5 != 0) {
                                    jt1Var3 = jt1Var5;
                                    nheVar4 = mhe.b;
                                } else {
                                    jt1Var3 = jt1Var5;
                                    nheVar4 = nheVar2;
                                }
                                if (i6 != 0) {
                                    jt1Var4 = jt1Var3;
                                    f4 = 1.0f;
                                } else {
                                    jt1Var4 = jt1Var3;
                                    f4 = f2;
                                }
                                jt1 jt1Var6 = jt1Var4;
                                wec wecVar4 = i7 != 0 ? null : wecVar2;
                                o430 o430Var = did.a;
                                if (str != null) {
                                    btsVar.e0(1899222916);
                                    boolean z = (i8 & 112) == 32;
                                    Object Q = btsVar.Q();
                                    if (z || Q == o430Var) {
                                        Q = new vsq(str, 12);
                                        btsVar.o0(Q);
                                    }
                                    f530Var4 = fnq0.b(f530Var4, false, (tls) Q);
                                    btsVar.t(false);
                                } else {
                                    btsVar.e0(1899381698);
                                    btsVar.t(false);
                                }
                                f530 f530Var6 = f530Var5;
                                f530 j0 = cma1.j0(ymb1.m(f530Var5.k(f530Var4)), pa90Var, jt1Var6, nheVar4, f4, wecVar4, 2);
                                Object Q2 = btsVar.Q();
                                if (Q2 == o430Var) {
                                    Q2 = hav.a;
                                    btsVar.o0(Q2);
                                }
                                z910 z910Var = (z910) Q2;
                                int hashCode = Long.hashCode(btsVar.T);
                                f530 d = b.d(btsVar, j0);
                                r1b0 o = btsVar.o();
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
                                qje.M(btsVar, d.h);
                                qje.W(btsVar, d.d, d);
                                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                                btsVar.t(true);
                                f3 = f4;
                                wecVar3 = wecVar4;
                                jt1Var2 = jt1Var6;
                                nheVar3 = nheVar4;
                                f530Var3 = f530Var6;
                            }
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new wls() { // from class: gav
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        o4b1.b(pa90.this, str, f530Var3, jt1Var2, nheVar3, f3, wecVar3, (fid) obj, vng.O(i | 1), i2);
                                        return zy11.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        wecVar2 = wecVar;
                        i8 = i3;
                        if (btsVar.V(i8 & 1, (i3 & 599187) == 599186)) {
                        }
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    f2 = f;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    wecVar2 = wecVar;
                    i8 = i3;
                    if (btsVar.V(i8 & 1, (i3 & 599187) == 599186)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                nheVar2 = nheVar;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                f2 = f;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                wecVar2 = wecVar;
                i8 = i3;
                if (btsVar.V(i8 & 1, (i3 & 599187) == 599186)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            nheVar2 = nheVar;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            wecVar2 = wecVar;
            i8 = i3;
            if (btsVar.V(i8 & 1, (i3 & 599187) == 599186)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        nheVar2 = nheVar;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        wecVar2 = wecVar;
        i8 = i3;
        if (btsVar.V(i8 & 1, (i3 & 599187) == 599186)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void c(l8v l8vVar, String str, f530 f530Var, jt1 jt1Var, nhe nheVar, float f, c36 c36Var, int i, fid fidVar, int i2, int i3) {
        f530 f530Var2 = (i3 & 4) != 0 ? c530.a : f530Var;
        jt1 jt1Var2 = (i3 & 8) != 0 ? x4c.y : jt1Var;
        nhe nheVar2 = (i3 & 16) != 0 ? mhe.b : nheVar;
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        c36 c36Var2 = (i3 & 64) != 0 ? null : c36Var;
        int i4 = (i3 & 128) != 0 ? 1 : i;
        bts btsVar = (bts) fidVar;
        boolean k = btsVar.k(l8vVar);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = r7b1.a(l8vVar, i4);
            btsVar.o0(Q);
        }
        b((a16) Q, str, f530Var2, jt1Var2, nheVar2, f2, c36Var2, btsVar, (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (i2 & 3670016), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(CharSequence charSequence, f530 f530Var, boolean z, wp2 wp2Var, wp2 wp2Var2, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        wp2 wp2Var3;
        f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1947063118);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar.a(z) ? 256 : 128;
            }
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.k(wp2Var) ? 2048 : 1024;
            }
            i4 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
            if ((196608 & i) == 0) {
                i4 |= btsVar.e(slsVar) ? 131072 : 65536;
            }
            if (btsVar.V(i4 & 1, (74899 & i4) == 74898)) {
                btsVar.Y();
                wp2Var3 = wp2Var2;
                f530Var3 = f530Var2;
            } else {
                f530Var3 = i5 != 0 ? c530.a : f530Var2;
                AppColor$Palette appColor$Palette = AppColor$Palette.TextOnControlMinor;
                d17.d(ymb1.l(f530Var3, cyk0.a), z, ButtonSize.XS, new gz6(wp2Var, AppColor$Palette.Text), null, slsVar, wwg.S(-923085157, true, new y740(23, charSequence, appColor$Palette), btsVar), btsVar, ((i4 >> 3) & 112) | 1573248 | (i4 & ImageMetadata.JPEG_GPS_COORDINATES), 16);
                wp2Var3 = appColor$Palette;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new rpm(charSequence, f530Var3, z, wp2Var, wp2Var3, slsVar, i, i2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i & 384) == 0) {
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        i4 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if ((196608 & i) == 0) {
        }
        if (btsVar.V(i4 & 1, (74899 & i4) == 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
