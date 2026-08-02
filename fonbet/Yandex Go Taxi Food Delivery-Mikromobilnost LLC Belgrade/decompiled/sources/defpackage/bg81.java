package defpackage;

import java.util.HashMap;

/* loaded from: classes7.dex */
public final class bg81 {
    public static hn71 a(ij81 ij81Var) {
        hn71 hn71Var = new hn71(3, (HashMap) null);
        hn71Var.j(ij81Var.a.b, "ad_type");
        hn71Var.j(ij81Var.c, "parameters");
        a271 a271Var = ij81Var.b;
        if (a271Var != null) {
            jd81 jd81Var = (jd81) a271Var;
            hn71Var.r(jd81Var.a.b, "size_type");
            hn71Var.r(Integer.valueOf(jd81Var.b), "width");
            hn71Var.r(Integer.valueOf(jd81Var.c), "height");
        }
        return hn71Var;
    }
}
