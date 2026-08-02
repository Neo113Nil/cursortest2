package defpackage;

import androidx.compose.animation.m;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class d17 {
    public static final gz6 a = new gz6(AppColor$Palette.Control, AppColor$Palette.TextOnControl);
    public static final gz6 b = new gz6(AppColor$Palette.ControlMinor, AppColor$Palette.TextOnControlMinor);
    public static final gz6 c = new gz6(AppColor$Palette.BgFloating, AppColor$Palette.Text);
    public static final float d = 0.5f;

    public static final void a(final f530 f530Var, jj2 jj2Var, final boolean z, ButtonSize buttonSize, gz6 gz6Var, ButtonForm buttonForm, final sls slsVar, final a aVar, fid fidVar, int i) {
        ButtonSize buttonSize2;
        jj2 jj2Var2;
        yre a2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(917456179);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | 48 | (btsVar.a(z) ? 256 : 128) | (btsVar.k(gz6Var) ? 16384 : 8192) | (btsVar.e(slsVar) ? 1048576 : 524288);
        if (btsVar.V(i2 & 1, (4793491 & i2) != 4793490)) {
            jj2Var2 = sb2.G(0.0f, 0.0f, 7, null);
            final m3u0 a3 = m.a(tje.n(gz6Var.a, btsVar), jj2Var2, null, btsVar, 48, 12);
            m3u0 a4 = m.a(tje.n(gz6Var.b, btsVar), jj2Var2, null, btsVar, 48, 12);
            final float size = buttonSize.getSize();
            int i3 = c17.b[buttonForm.ordinal()];
            if (i3 == 1) {
                buttonSize2 = buttonSize;
                btsVar.e0(1207110155);
                btsVar.t(false);
                a2 = ffx.a(50);
            } else {
                if (i3 != 2) {
                    throw unr0.y(1207109015, btsVar, false);
                }
                btsVar.e0(1207111832);
                buttonSize2 = buttonSize;
                a2 = new z7m(tcb1.c(buttonSize2, btsVar));
                btsVar.t(false);
            }
            byk0 byk0Var = cyk0.a;
            final byk0 byk0Var2 = new byk0(a2, a2, a2, a2);
            final yre yreVar = a2;
            sb2.c(new vvf0[]{k2z.b.a(a3.getValue()), k2z.a.a(a4.getValue())}, wwg.S(1197525491, true, new wls() { // from class: p07
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                        f530 f530Var2 = f530.this;
                        float f = size;
                        f530 a5 = ljs0.a(f530Var2, f, f);
                        boolean z2 = z;
                        f530 c2 = q6a1.c(a5, z2);
                        yre yreVar2 = yreVar;
                        boolean k = btsVar2.k(yreVar2);
                        m3u0 m3u0Var = a3;
                        boolean k2 = k | btsVar2.k(m3u0Var);
                        Object Q = btsVar2.Q();
                        if (k2 || Q == did.a) {
                            Q = new v07(yreVar2, m3u0Var, 0);
                            btsVar2.o0(Q);
                        }
                        f530 d2 = q791.d(ymb1.l(bb1.g(c2, (tls) Q), byk0Var2), z2, null, new awk0(0), slsVar, 10);
                        z910 d3 = pi6.d(x4c.y, false);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d4 = b.d(btsVar2, d2);
                        ohd.G1.getClass();
                        sls slsVar2 = d.b;
                        if (btsVar2.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar2);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, d.f, d3);
                        qje.W(btsVar2, d.e, o);
                        qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, d.h);
                        qje.W(btsVar2, d.d, d4);
                        aVar.invoke(cj6.a, btsVar2, 6);
                        btsVar2.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 48);
        } else {
            buttonSize2 = buttonSize;
            btsVar.Y();
            jj2Var2 = jj2Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fc0(f530Var, jj2Var2, z, buttonSize2, gz6Var, buttonForm, slsVar, aVar, i);
        }
    }

    public static final void b(final f530 f530Var, final boolean z, final gz6 gz6Var, final wp2 wp2Var, final float f, final float f2, final boolean z2, final sls slsVar, final zls zlsVar, fid fidVar, final int i) {
        int i2;
        f530 f530Var2;
        float f3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1450497776);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(gz6Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(wp2Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.b(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.b(f2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.a(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.e(slsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= btsVar.e(zlsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (38347923 & i3) != 38347922)) {
            byk0 c2 = (Float.floatToRawIntBits(f2) & Integer.MAX_VALUE) < 2139095040 ? cyk0.c(f2) : cyk0.a;
            if (gz6Var != null) {
                btsVar.e0(-112869845);
                wp2 wp2Var2 = gz6Var.a;
                wp2 wp2Var3 = gz6Var.b;
                final byk0 byk0Var = c2;
                wls wlsVar = new wls() { // from class: a17
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        fid fidVar2 = (fid) obj;
                        int intValue = ((Integer) obj2).intValue();
                        bts btsVar2 = (bts) fidVar2;
                        if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                            f530 f530Var3 = f530.this;
                            float f4 = f;
                            f530 a2 = ljs0.a(f530Var3, f4, f4);
                            boolean z3 = z;
                            f530 c3 = q6a1.c(hbb1.c(a2, dbb1.b(btsVar2), z3 && z2, f2, null, 8), z3);
                            long j = ((ldc) btsVar2.m(k2z.b)).a;
                            byk0 byk0Var2 = byk0Var;
                            f530 b2 = m4m0.b(c3, j, byk0Var2);
                            wp2 wp2Var4 = wp2Var;
                            if (wp2Var4 != null) {
                                b2 = b.a(b2, androidx.compose.ui.platform.m.a(), new sp5(5, wp2Var4, byk0Var2));
                            }
                            f530 d2 = q791.d(ymb1.l(b2, byk0Var2), z3, null, new awk0(0), slsVar, 10);
                            z910 d3 = pi6.d(x4c.y, false);
                            int hashCode = Long.hashCode(btsVar2.T);
                            r1b0 o = btsVar2.o();
                            f530 d4 = b.d(btsVar2, d2);
                            ohd.G1.getClass();
                            sls slsVar2 = d.b;
                            if (btsVar2.a == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar2.i0();
                            if (btsVar2.S) {
                                btsVar2.n(slsVar2);
                            } else {
                                btsVar2.r0();
                            }
                            qje.W(btsVar2, d.f, d3);
                            qje.W(btsVar2, d.e, o);
                            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                            qje.M(btsVar2, d.h);
                            qje.W(btsVar2, d.d, d4);
                            ly3.x(6, zlsVar, cj6.a, btsVar2, true);
                        } else {
                            btsVar2.Y();
                        }
                        return zy11.a;
                    }
                };
                f530Var2 = f530Var;
                f3 = f;
                k2z.a(wp2Var2, wp2Var3, wwg.S(943451611, true, wlsVar, btsVar), btsVar, 384);
                btsVar.t(false);
            } else {
                f530Var2 = f530Var;
                f3 = f;
                btsVar.e0(-112230935);
                f530 c3 = q6a1.c(ljs0.a(f530Var2, f3, f3), z);
                if (wp2Var != null) {
                    c3 = b.a(c3, androidx.compose.ui.platform.m.a(), new sp5(5, wp2Var, c2));
                }
                f530 d2 = q791.d(ymb1.l(c3, c2), z, null, new awk0(0), slsVar, 10);
                int i4 = ((i3 >> 15) & 7168) | 48;
                z910 d3 = pi6.d(x4c.y, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d4 = b.d(btsVar, d2);
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
                qje.W(btsVar, d.f, d3);
                qje.W(btsVar, d.e, o);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d4);
                ly3.x(((i4 >> 6) & 112) | 6, zlsVar, cj6.a, btsVar, true);
                btsVar.t(false);
            }
        } else {
            f530Var2 = f530Var;
            f3 = f;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final f530 f530Var3 = f530Var2;
            final float f4 = f3;
            v.d = new wls() { // from class: b17
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d17.b(f530.this, z, gz6Var, wp2Var, f4, f2, z2, slsVar, zlsVar, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(f530 f530Var, boolean z, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonForm buttonForm, sls slsVar, zls zlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        bts btsVar;
        ButtonSize buttonSize2;
        ButtonForm buttonForm2;
        f530 f530Var3;
        boolean z3;
        ButtonStyle buttonStyle2;
        aii0 v;
        int i7;
        f530 f530Var4;
        gz6 gz6Var;
        AppColor$Palette appColor$Palette;
        boolean z4;
        float f;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1954106187);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= btsVar2.a(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= btsVar2.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar2.c(buttonStyle == null ? -1 : buttonStyle.ordinal()) ? 2048 : 1024;
            }
            i6 = i2 & 16;
            if (i6 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar2.c(buttonForm != null ? buttonForm.ordinal() : -1) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= btsVar2.e(slsVar) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= btsVar2.e(zlsVar) ? 1048576 : 524288;
            }
            boolean z5 = true;
            if (btsVar2.V(i3 & 1, (599187 & i3) == 599186)) {
                btsVar = btsVar2;
                btsVar.Y();
                buttonSize2 = buttonSize;
                buttonForm2 = buttonForm;
                f530Var3 = f530Var2;
                z3 = z2;
                buttonStyle2 = buttonStyle;
            } else {
                if (i8 != 0) {
                    f530Var4 = c530.a;
                    i7 = i4;
                } else {
                    i7 = i4;
                    f530Var4 = f530Var2;
                }
                boolean z6 = i9 != 0 ? true : z2;
                ButtonSize buttonSize3 = i7 != 0 ? ButtonSize.L : buttonSize;
                buttonStyle2 = i5 != 0 ? ButtonStyle.Minor : buttonStyle;
                ButtonForm buttonForm3 = i6 != 0 ? ButtonForm.Squircle : buttonForm;
                int[] iArr = c17.a;
                int i10 = iArr[buttonStyle2.ordinal()];
                if (i10 == 1) {
                    gz6Var = a;
                } else if (i10 == 2) {
                    gz6Var = b;
                } else if (i10 == 3) {
                    gz6Var = c;
                } else {
                    if (i10 != 4 && i10 != 5) {
                        w511.b();
                        return;
                    }
                    gz6Var = null;
                }
                int i11 = iArr[buttonStyle2.ordinal()];
                if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                    appColor$Palette = null;
                } else {
                    if (i11 != 5) {
                        w511.b();
                        return;
                    }
                    appColor$Palette = AppColor$Palette.Line;
                }
                float size = buttonSize3.getSize();
                int i12 = c17.b[buttonForm3.ordinal()];
                if (i12 == 1) {
                    z4 = false;
                    btsVar2.e0(-995311715);
                    btsVar2.t(false);
                    f = Float.POSITIVE_INFINITY;
                } else {
                    if (i12 != 2) {
                        throw unr0.y(-995313025, btsVar2, false);
                    }
                    btsVar2.e0(-995310489);
                    f = tcb1.c(buttonSize3, btsVar2);
                    z4 = false;
                    btsVar2.t(false);
                }
                int i13 = iArr[buttonStyle2.ordinal()];
                if (i13 != 1 && i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4 && i13 != 5) {
                            w511.b();
                            return;
                        }
                    }
                    int i14 = i3 & HProv.PP_DELETE_SAVED_PASSWD;
                    int i15 = i3 << 6;
                    btsVar = btsVar2;
                    b(f530Var4, z6, gz6Var, appColor$Palette, size, f, z5, slsVar, zlsVar, btsVar, i14 | (29360128 & i15) | (i15 & 234881024));
                    buttonSize2 = buttonSize3;
                    buttonForm2 = buttonForm3;
                    f530Var3 = f530Var4;
                    z3 = z6;
                }
                z5 = z4;
                int i142 = i3 & HProv.PP_DELETE_SAVED_PASSWD;
                int i152 = i3 << 6;
                btsVar = btsVar2;
                b(f530Var4, z6, gz6Var, appColor$Palette, size, f, z5, slsVar, zlsVar, btsVar, i142 | (29360128 & i152) | (i152 & 234881024));
                buttonSize2 = buttonSize3;
                buttonForm2 = buttonForm3;
                f530Var3 = f530Var4;
                z3 = z6;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new u07(f530Var3, z3, buttonSize2, buttonStyle2, buttonForm2, slsVar, zlsVar, i, i2, 1);
                return;
            }
            return;
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        boolean z52 = true;
        if (btsVar2.V(i3 & 1, (599187 & i3) == 599186)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(f530 f530Var, boolean z, ButtonSize buttonSize, gz6 gz6Var, ButtonForm buttonForm, sls slsVar, zls zlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        gz6 gz6Var2;
        int i6;
        bts btsVar;
        ButtonForm buttonForm2;
        f530 f530Var3;
        boolean z3;
        ButtonSize buttonSize2;
        aii0 v;
        float f;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1692528905);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= btsVar2.a(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= btsVar2.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                gz6Var2 = gz6Var;
                i3 |= btsVar2.k(gz6Var2) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i3 |= btsVar2.c(buttonForm != null ? buttonForm.ordinal() : -1) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    i3 |= btsVar2.e(slsVar) ? 131072 : 65536;
                }
                if ((1572864 & i) == 0) {
                    i3 |= btsVar2.e(zlsVar) ? 1048576 : 524288;
                }
                if (btsVar2.V(i3 & 1, (599187 & i3) != 599186)) {
                    f530 f530Var4 = i7 != 0 ? c530.a : f530Var2;
                    boolean z4 = i8 != 0 ? true : z2;
                    buttonSize2 = i4 != 0 ? ButtonSize.L : buttonSize;
                    if (i5 != 0) {
                        gz6Var2 = a;
                    }
                    ButtonForm buttonForm3 = i6 != 0 ? ButtonForm.Squircle : buttonForm;
                    float size = buttonSize2.getSize();
                    int i9 = c17.b[buttonForm3.ordinal()];
                    if (i9 == 1) {
                        btsVar2.e0(-1272312623);
                        btsVar2.t(false);
                        f = Float.POSITIVE_INFINITY;
                    } else {
                        if (i9 != 2) {
                            throw unr0.y(-1272313933, btsVar2, false);
                        }
                        btsVar2.e0(-1272311397);
                        f = tcb1.c(buttonSize2, btsVar2);
                        btsVar2.t(false);
                    }
                    float f2 = f;
                    int i10 = 1575936 | (i3 & 14) | (i3 & 112) | ((i3 >> 3) & 896);
                    int i11 = i3 << 6;
                    btsVar = btsVar2;
                    b(f530Var4, z4, gz6Var2, null, size, f2, false, slsVar, zlsVar, btsVar, i10 | (29360128 & i11) | (i11 & 234881024));
                    buttonForm2 = buttonForm3;
                    f530Var3 = f530Var4;
                    z3 = z4;
                } else {
                    btsVar = btsVar2;
                    btsVar.Y();
                    buttonForm2 = buttonForm;
                    f530Var3 = f530Var2;
                    z3 = z2;
                    buttonSize2 = buttonSize;
                }
                gz6 gz6Var3 = gz6Var2;
                v = btsVar.v();
                if (v != null) {
                    v.d = new u07(f530Var3, z3, buttonSize2, gz6Var3, buttonForm2, slsVar, zlsVar, i, i2, 2);
                    return;
                }
                return;
            }
            gz6Var2 = gz6Var;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (btsVar2.V(i3 & 1, (599187 & i3) != 599186)) {
            }
            gz6 gz6Var32 = gz6Var2;
            v = btsVar.v();
            if (v != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        gz6Var2 = gz6Var;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (btsVar2.V(i3 & 1, (599187 & i3) != 599186)) {
        }
        gz6 gz6Var322 = gz6Var2;
        v = btsVar.v();
        if (v != null) {
        }
    }
}
