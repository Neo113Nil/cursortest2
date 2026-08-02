package defpackage;

import java.util.HashSet;
import java.util.List;
import kotlin.a;

/* loaded from: classes8.dex */
public final class mxf0 {
    public final fxf0 a;
    public final i3y b;

    public mxf0(fxf0 fxf0Var, List list) {
        this.a = fxf0Var;
        this.b = a.a(new oac(list, 2));
    }

    public final String a(ih21 ih21Var, String str) {
        String str2;
        iq20 b;
        pr20 pr20Var;
        lq20 lq20Var;
        String str3;
        String str4;
        return (ih21Var == null || (str2 = ih21Var.a) == null || evu0.J(str2) || !((HashSet) this.b.getValue()).contains(str2) || (b = ((pot) this.a).a.b(str2)) == null || (pr20Var = b.a) == null || (lq20Var = pr20Var.a) == null || (str3 = lq20Var.c) == null || (str4 = ih21Var.b) == null) ? str : str3.concat(str4);
    }
}
