package defpackage;

import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.navigator.compose.button.CustomButtonStyle;
import java.util.Iterator;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class bqa1 {
    public static final void a(f530 f530Var, el1 el1Var, tls tlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        bts btsVar;
        f530 f530Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1252919423);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(el1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            f530Var3 = i4 != 0 ? c530.a : f530Var2;
            f530 o = an91.o(an91.m(f530Var3, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            CharSequence charSequence = el1Var.a;
            ety0 ety0Var = xya1.c(btsVar2).h.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            boolean z = (i3 & 896) == 256;
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new a0(5, tlsVar);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            qgy.b(charSequence, null, o, appColor$Palette, 0L, 0L, null, 0L, 0, 0, 0, ety0Var, (tls) Q, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 4082);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(f530Var3, (Object) el1Var, (Object) tlsVar, i, i2, 3);
        }
    }

    public static final void b(f530 f530Var, boolean z, ButtonSize buttonSize, CustomButtonStyle customButtonStyle, sls slsVar, zls zlsVar, fid fidVar, int i) {
        int i2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-454738869);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.c(customButtonStyle != null ? customButtonStyle.ordinal() : -1) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.e(slsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar.e(zlsVar) ? 131072 : 65536;
        }
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            ButtonForm buttonForm = ButtonForm.Circle;
            int i4 = (i3 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | (i3 & 112) | (i3 & 896) | (i3 & 7168);
            int i5 = i3 << 3;
            pub1.a(f530Var, buttonSize, customButtonStyle, buttonForm, slsVar, zlsVar, btsVar, i4 | (458752 & i5) | (i5 & 3670016));
            z2 = true;
        } else {
            btsVar.Y();
            z2 = z;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ye5(f530Var, z2, buttonSize, customButtonStyle, slsVar, zlsVar, i, 4);
        }
    }

    public static final void c(f530 f530Var, ButtonSize buttonSize, sls slsVar, fid fidVar, int i) {
        ButtonSize buttonSize2;
        ButtonSize buttonSize3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-214990251);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | 48 | (btsVar.e(slsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                buttonSize3 = ButtonSize.L;
            } else {
                btsVar.Y();
                buttonSize3 = buttonSize;
            }
            btsVar.u();
            CustomButtonStyle customButtonStyle = CustomButtonStyle.Blur80;
            zad.a.getClass();
            y4b1.a(f530Var, customButtonStyle, buttonSize3, slsVar, zad.b, btsVar, ((i2 << 3) & 7168) | (i2 & 14) | 25008, 0);
            buttonSize2 = buttonSize3;
        } else {
            btsVar.Y();
            buttonSize2 = buttonSize;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m050(f530Var, buttonSize2, slsVar, i, 1);
        }
    }

    public static final void d(StringBuilder sb, Iterator it, jzz jzzVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(jzz.k(entry.getKey()));
            sb.append(" : ");
            sb.append(jzz.k(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(jzz.k(entry2.getKey()));
                sb.append(" : ");
                sb.append(jzz.k(entry2.getValue()));
            }
        }
    }
}
