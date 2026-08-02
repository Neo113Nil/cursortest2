package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class lry0 {
    public final dyr a;
    public final fwi b;
    public final LayoutDirection c;
    public final ary0 d = new ary0(0);

    public lry0(dyr dyrVar, fwi fwiVar, LayoutDirection layoutDirection) {
        this.a = dyrVar;
        this.b = fwiVar;
        this.c = layoutDirection;
    }

    public static dry0 a(lry0 lry0Var, String str, ety0 ety0Var, LayoutDirection layoutDirection, int i) {
        int i2 = (i & 16) != 0 ? Integer.MAX_VALUE : 1;
        long b = p8e.b(0, 0, 0, 0, 15);
        if ((i & 64) != 0) {
            layoutDirection = lry0Var.c;
        }
        fwi fwiVar = lry0Var.b;
        dyr dyrVar = lry0Var.a;
        lry0Var.getClass();
        return b(lry0Var, new kk2(str), ety0Var, i2, b, layoutDirection, fwiVar, dyrVar, 32);
    }

    public static dry0 b(lry0 lry0Var, kk2 kk2Var, ety0 ety0Var, int i, long j, LayoutDirection layoutDirection, fwi fwiVar, dyr dyrVar, int i2) {
        dry0 dry0Var;
        int i3 = (i2 & 16) != 0 ? Integer.MAX_VALUE : i;
        long b = (i2 & 64) != 0 ? p8e.b(0, 0, 0, 0, 15) : j;
        LayoutDirection layoutDirection2 = (i2 & 128) != 0 ? lry0Var.c : layoutDirection;
        fwi fwiVar2 = (i2 & 256) != 0 ? lry0Var.b : fwiVar;
        dyr dyrVar2 = (i2 & 512) != 0 ? lry0Var.a : dyrVar;
        ary0 ary0Var = lry0Var.d;
        EmptyList emptyList = EmptyList.a;
        cry0 cry0Var = new cry0(kk2Var, ety0Var, emptyList, i3, true, 1, fwiVar2, layoutDirection2, dyrVar2, b);
        dry0 dry0Var2 = null;
        if (ary0Var != null) {
            sc7 sc7Var = new sc7(cry0Var);
            mzz mzzVar = ary0Var.a;
            if (mzzVar != null) {
                dry0Var = (dry0) mzzVar.c(sc7Var);
            } else if (jl40.l(ary0Var.b, sc7Var)) {
                dry0Var = ary0Var.c;
            }
            if (dry0Var != null && !dry0Var.b.a.a()) {
                dry0Var2 = dry0Var;
            }
        }
        if (dry0Var2 != null) {
            return new dry0(cry0Var, dry0Var2.b, p8e.d(b, (((int) Math.ceil(r0.e)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) Math.ceil(r0.d)) << 32)));
        }
        xv10 xv10Var = new xv10(kk2Var, bb1.I(ety0Var, layoutDirection2), (List) emptyList, fwiVar2, dyrVar2);
        int k = n8e.k(b);
        int i4 = n8e.e(b) ? n8e.i(b) : Integer.MAX_VALUE;
        if (k != i4) {
            i4 = y6i0.d((int) Math.ceil(xv10Var.d()), k, i4);
        }
        dry0 dry0Var3 = new dry0(cry0Var, new hm40(xv10Var, qje.m(0, i4, 0, n8e.h(b)), i3, 1), p8e.d(b, (((int) Math.ceil(r6.e)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) Math.ceil(r6.d)) << 32)));
        if (ary0Var != null) {
            mzz mzzVar2 = ary0Var.a;
            if (mzzVar2 != null) {
                mzzVar2.d(new sc7(cry0Var), dry0Var3);
                return dry0Var3;
            }
            ary0Var.b = new sc7(cry0Var);
            ary0Var.c = dry0Var3;
        }
        return dry0Var3;
    }
}
