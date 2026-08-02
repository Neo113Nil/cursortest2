package defpackage;

import com.yandex.go.design.compose.platform.statusbar.a;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class cgb1 {
    public static final void a(m8u0 m8u0Var, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2028939898);
        int i2 = (btsVar.k(m8u0Var) ? 4 : 2) | i;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            int i4 = i8u0.a[m8u0Var.a.ordinal()];
            if (i4 == 1) {
                btsVar.e0(-103904287);
                z = ((ry2) btsVar.m(uy2.a)).b;
                btsVar.t(false);
            } else if (i4 == 2) {
                btsVar.e0(-103902766);
                z = !((ry2) btsVar.m(uy2.a)).b;
                btsVar.t(false);
            } else if (i4 == 3) {
                btsVar.e0(1074039734);
                btsVar.t(false);
                z = false;
            } else {
                if (i4 != 4) {
                    throw unr0.y(-103907022, btsVar, false);
                }
                btsVar.e0(1074079377);
                btsVar.t(false);
                z = true;
            }
            a.a(z, btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new but0(m8u0Var, i, i3);
        }
    }

    public static final Locale b(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (jl40.l(forLanguageTag.toLanguageTag(), "und")) {
            System.err.getClass();
        }
        return forLanguageTag;
    }
}
