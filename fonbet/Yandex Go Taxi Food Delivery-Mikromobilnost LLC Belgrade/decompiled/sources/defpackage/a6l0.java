package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.random.XorWowRandom;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class a6l0 extends yr31 {
    public final gci0 A;
    public final w5l0 b;
    public final u5l0 c;
    public final f4l0 w;
    public final ucl0 x;
    public final yuj0 y;
    public final ij20 z;

    public a6l0(w5l0 w5l0Var, u5l0 u5l0Var, f4l0 f4l0Var, ucl0 ucl0Var, yuj0 yuj0Var, ij20 ij20Var) {
        this.b = w5l0Var;
        this.c = u5l0Var;
        this.w = f4l0Var;
        this.x = ucl0Var;
        this.y = yuj0Var;
        this.z = ij20Var;
        fzw fzwVar = new fzw(22, f4l0Var.d(), this);
        tse tseVar = w5l0Var.c;
        xsr0.a.getClass();
        this.A = e.R(fzwVar, tseVar, wsr0.c, W(f4l0Var.getRoute()));
        ij20Var.a(w5l0Var.b, "Shown");
    }

    public final z5l0 W(e0l0 e0l0Var) {
        String str;
        int i = 0;
        yuj0 yuj0Var = this.y;
        String a = yuj0Var.a(rzh0.cargo_intercity_route, new Object[0]);
        String a2 = yuj0Var.a(rzh0.cargo_intercity_done, new Object[0]);
        w5l0 w5l0Var = this.b;
        w5l0Var.getClass();
        boolean z = w5l0Var.a;
        this.x.getClass();
        ArrayList arrayList = new ArrayList();
        List list = e0l0Var.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            oo0 oo0Var = ((qv0) obj).a;
            if (oo0Var == null || (str = oo0Var.a) == null) {
                str = "";
            }
            if (z) {
                String str2 = oo0Var != null ? oo0Var.g : null;
                if (str2 != null && str2.length() != 0 && str.length() > 0) {
                    str = g8e.p(str2, Extension.FIX_SPACE, str);
                }
            }
            int hashCode = str.hashCode();
            if (arrayList.contains(Integer.valueOf(hashCode))) {
                hashCode = new XorWowRandom(i, i >> 31).b();
            }
            arrayList.add(Integer.valueOf(hashCode));
            arrayList2.add(new dcl0(hashCode, str, true, 4));
            i = i2;
        }
        return new z5l0(a, arrayList2, a2);
    }
}
