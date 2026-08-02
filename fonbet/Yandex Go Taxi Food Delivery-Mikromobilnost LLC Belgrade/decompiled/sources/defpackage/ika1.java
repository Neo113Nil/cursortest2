package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class ika1 {
    public static final void a(uep uepVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(174721586);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(uepVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            qy20.a(null, null, null, false, wwg.S(1443519696, true, new ota(29, uepVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(uepVar, i, 18);
        }
    }

    public static final void b(u771 u771Var, zj71 zj71Var) {
        String str;
        try {
            no61 no61Var = zj71Var.c;
            if (no61Var == null || (str = no61Var.a) == null) {
                str = "";
            }
            Set set = no61Var != null ? no61Var.b : EmptySet.a;
            if (u771Var.b.c()) {
                xh61 xh61Var = u771Var.a;
                xh61Var.getClass();
                try {
                    tr81 tr81Var = (tr81) xh61Var.a.getValue(xh61Var, xh61.b[0]);
                    if (tr81Var != null) {
                        tr81Var.a(str);
                    }
                } catch (Throwable unused) {
                }
            }
            if (u771Var.b.c()) {
                xh61 xh61Var2 = u771Var.a;
                xh61Var2.getClass();
                try {
                    tr81 tr81Var2 = (tr81) xh61Var2.a.getValue(xh61Var2, xh61.b[0]);
                    if (tr81Var2 != null) {
                        tr81Var2.e(set);
                    }
                } catch (Throwable unused2) {
                    set.toString();
                }
            }
            set.toString();
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static final Enum c(k4o k4oVar, int i, Enum r6) {
        if (i >= 0 && i < k4oVar.size()) {
            return (Enum) k4oVar.get(i);
        }
        xby.d.j(new IndexOutOfBoundsException(oyr.h(i, k4oVar.size(), "Index: ", ", Size: ")));
        return r6;
    }

    public static final void d(x22 x22Var, String str) {
        x22Var.c("tech_ignoring_auth_operation", "tag", str);
    }
}
