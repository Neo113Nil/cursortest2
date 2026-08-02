package defpackage;

import com.yandex.div.evaluable.b;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.navigator.compose.button.CustomButtonStyle;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class pub1 {
    public static final void a(f530 f530Var, ButtonSize buttonSize, CustomButtonStyle customButtonStyle, ButtonForm buttonForm, sls slsVar, zls zlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        float f;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(833478685);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.a(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.c(buttonSize == null ? -1 : buttonSize.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.c(customButtonStyle == null ? -1 : customButtonStyle.ordinal()) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.c(buttonForm != null ? buttonForm.ordinal() : -1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.e(slsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.e(zlsVar) ? 1048576 : 524288;
        }
        if (btsVar2.V(i2 & 1, (599187 & i2) != 599186)) {
            gz6 buttonColors = customButtonStyle.getButtonColors();
            float size = buttonSize.getSize();
            int i3 = zif.a[buttonForm.ordinal()];
            if (i3 == 1) {
                btsVar2.e0(2109115013);
                btsVar2.t(false);
                f = Float.POSITIVE_INFINITY;
            } else {
                if (i3 != 2) {
                    throw unr0.y(2109113703, btsVar2, false);
                }
                btsVar2.e0(2109116239);
                f = tcb1.c(buttonSize, btsVar2);
                btsVar2.t(false);
            }
            float f2 = f;
            int i4 = 1575936 | (i2 & 14) | (i2 & 112);
            int i5 = i2 << 6;
            btsVar = btsVar2;
            d17.b(f530Var, true, buttonColors, null, size, f2, true, slsVar, zlsVar, btsVar, i4 | (29360128 & i5) | (i5 & 234881024));
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ew0(f530Var, buttonSize, customButtonStyle, buttonForm, slsVar, zlsVar, i);
        }
    }

    public static final Double b(String str, double d, double d2) {
        String str2;
        if (!Double.isNaN(d) && Math.abs(d) <= 1.0E10d) {
            return Double.valueOf(d);
        }
        int hashCode = str.hashCode();
        if (hashCode == 98696) {
            if (str.equals("cot")) {
                str2 = "Cotangent";
            }
            str2 = str;
        } else if (hashCode != 2988422) {
            if (hashCode == 3003607 && str.equals("asin")) {
                str2 = "Arcsine";
            }
            str2 = str;
        } else {
            if (str.equals("acos")) {
                str2 = "Arccosine";
            }
            str2 = str;
        }
        b.c(null, str + '(' + d2 + ')', str2.concat(" is undefined for the given value."));
        throw null;
    }

    public static final qc c(qx60 qx60Var, pey peyVar, tls tlsVar) {
        qc qcVar = new qc(15, tlsVar);
        if (peyVar != null) {
            qx60Var.a(peyVar, qcVar);
            return qcVar;
        }
        qx60Var.b(qcVar);
        return qcVar;
    }
}
