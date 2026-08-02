package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class phb1 {
    public static final void a(aw9 aw9Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        c530 c530Var;
        float f;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-458649872);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(aw9Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & HProv.PP_FAST_CODE) != 130)) {
            c530 c530Var2 = c530.a;
            f530 o = an91.o(bzk0.c(ljs0.c(c530Var2, 1.0f), AppColor$Palette.Background, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            rhb1.a(aw9Var.a, btsVar, 0);
            so5 so5Var = x4c.H;
            f530 c = ljs0.c(ljs0.g(c530Var2, 200.0f, 0.0f, 2), 1.0f);
            sic a2 = qic.a(lr20.e, so5Var, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d2);
            nvi0 nvi0Var = aw9Var.b;
            if (nvi0Var == null) {
                btsVar.e0(1104339040);
                btsVar.t(false);
                c530Var = c530Var2;
                z = false;
                f = 1.0f;
            } else {
                btsVar.e0(1104339041);
                c530Var = c530Var2;
                f = 1.0f;
                z = false;
                v0b1.a(nvi0Var, null, null, null, null, null, null, null, 0.0f, 0, btsVar, 384, 1018);
                btsVar.t(false);
            }
            CharSequence charSequence = aw9Var.c;
            if (charSequence == null) {
                btsVar.e0(1104436535);
                btsVar.t(z);
            } else {
                btsVar.e0(1104436536);
                c530 c530Var3 = c530Var;
                c530Var = c530Var3;
                qgy.b(charSequence, null, an91.o(ljs0.c(c530Var3, f), 32.0f, 12.0f, 32.0f, 0.0f, 8), null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar).g.b, null, btsVar, 0, 0, 12154);
                btsVar = btsVar;
                btsVar.t(z);
            }
            btsVar.t(true);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09(aw9Var, tlsVar, f530Var2, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(sls slsVar, f530 f530Var, boolean z, ButtonSize buttonSize, zls zlsVar, zls zlsVar2, zls zlsVar3, zls zlsVar4, to5 to5Var, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        ButtonSize buttonSize2;
        zls zlsVar5;
        zls zlsVar6;
        zls zlsVar7;
        to5 to5Var2;
        f530 f530Var3;
        boolean z3;
        aii0 v;
        f530 f530Var4;
        int i6;
        zls zlsVar8;
        to5 to5Var3;
        zls zlsVar9;
        zls zlsVar10;
        ButtonSize buttonSize3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1397297394);
        int i7 = i | (btsVar.e(slsVar) ? 4 : 2);
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i7 |= btsVar.k(f530Var2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 = i7 | 384;
                z2 = z;
            } else {
                z2 = z;
                i4 = i7 | (btsVar.a(z2) ? 256 : 128);
            }
            i5 = i4 | 910699520;
            if (btsVar.V(i5 & 1, (306783379 & i5) == 306783378)) {
                btsVar.Y();
                buttonSize2 = buttonSize;
                zlsVar5 = zlsVar;
                zlsVar6 = zlsVar3;
                zlsVar7 = zlsVar4;
                to5Var2 = to5Var;
                f530Var3 = f530Var2;
                z3 = z2;
            } else {
                btsVar.a0();
                if ((i & 1) == 0 || btsVar.C()) {
                    f530Var4 = i8 != 0 ? c530.a : f530Var2;
                    if (i3 != 0) {
                        z2 = true;
                    }
                    ButtonSize buttonSize4 = ButtonSize.L;
                    a aVar = p8y.a;
                    a aVar2 = x901.a;
                    a aVar3 = ka01.a;
                    i6 = i5 & (-33087489);
                    zlsVar8 = aVar2;
                    to5Var3 = x4c.E;
                    zlsVar9 = aVar3;
                    zlsVar10 = aVar;
                    buttonSize3 = buttonSize4;
                } else {
                    btsVar.Y();
                    i6 = i5 & (-33087489);
                    buttonSize3 = buttonSize;
                    zlsVar10 = zlsVar;
                    zlsVar8 = zlsVar3;
                    zlsVar9 = zlsVar4;
                    to5Var3 = to5Var;
                    f530Var4 = f530Var2;
                }
                boolean z4 = z2;
                btsVar.u();
                vcb1.a(slsVar, f530Var4, z4, buttonSize3, ButtonStyle.Main, ButtonForm.Squircle, zlsVar10, zlsVar2, zlsVar8, zlsVar9, to5Var3, btsVar, (i6 & 896) | (i6 & 14) | 221184 | (i6 & 112) | 12585984, 54, 0);
                f530Var3 = f530Var4;
                z3 = z4;
                buttonSize2 = buttonSize3;
                zlsVar5 = zlsVar10;
                zlsVar6 = zlsVar8;
                zlsVar7 = zlsVar9;
                to5Var2 = to5Var3;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new f400(slsVar, f530Var3, z3, buttonSize2, zlsVar5, zlsVar2, zlsVar6, zlsVar7, to5Var2, i, i2, 0);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        i5 = i4 | 910699520;
        if (btsVar.V(i5 & 1, (306783379 & i5) == 306783378)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static String c(char c, int i, String str) {
        int length = i - str.length();
        if (length > 0) {
            if (length <= 8192) {
                char[] cArr = new char[length];
                for (int i2 = length - 1; -1 < i2; i2--) {
                    cArr[i2] = c;
                }
                return new String(cArr).concat(str);
            }
            String valueOf = String.valueOf(c);
            if (valueOf.length() == 0) {
                valueOf = " ";
            }
            int length2 = valueOf.length();
            int length3 = i - str.length();
            if (length3 > 0) {
                if (length2 == 1 && length3 <= 8192) {
                    return c(valueOf.charAt(0), i, str);
                }
                if (length3 == length2) {
                    return valueOf.concat(str);
                }
                if (length3 < length2) {
                    return valueOf.substring(0, length3).concat(str);
                }
                char[] cArr2 = new char[length3];
                char[] charArray = valueOf.toCharArray();
                for (int i3 = 0; i3 < length3; i3++) {
                    cArr2[i3] = charArray[i3 % length2];
                }
                return new String(cArr2).concat(str);
            }
        }
        return str;
    }
}
