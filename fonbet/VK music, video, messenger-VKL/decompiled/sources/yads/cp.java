package yads;

import java.util.Map;

/* loaded from: classes10.dex */
public final class cp {
    public static gp2 a(dp dpVar) {
        e00 e00Var;
        gp2 gp2Var = new gp2((Map) null, 3);
        gp2Var.a((dpVar == null || (e00Var = dpVar.a) == null) ? null : e00Var.b, "ad_type");
        gp2Var.a(dpVar != null ? dpVar.c : null, "parameters");
        e13 e13Var = dpVar != null ? dpVar.b : null;
        if (e13Var != null) {
            gp2Var.b(e13Var.b().b, "size_type");
            gp2Var.b(Integer.valueOf(e13Var.getWidth()), "width");
            gp2Var.b(Integer.valueOf(e13Var.getHeight()), "height");
        }
        return gp2Var;
    }
}
