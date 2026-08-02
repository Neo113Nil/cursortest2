package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class eob1 {
    public static final void a(ea30 ea30Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(685384302);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ea30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            qy20.a(null, null, null, false, wwg.S(-1439855988, true, new nfj(21, ea30Var, tlsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(ea30Var, tlsVar, i, 12);
        }
    }

    public static final TypedValue b(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        return typedValue;
    }

    public static final int c(double d) {
        if (d >= 0.0d && d <= 1.0d) {
            return (int) ((d * 255.0d) + 0.5d);
        }
        w511.q();
        return 0;
    }
}
