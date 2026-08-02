package yads;

import java.util.Map;

/* loaded from: classes10.dex */
public abstract class g4 {
    public static h4 a(g92 g92Var) {
        m4 m4Var;
        int i = g92Var != null ? g92Var.a : -1;
        if (204 == i) {
            m4Var = m4.d;
        } else {
            Map map = g92Var != null ? g92Var.c : null;
            Integer valueOf = g92Var != null ? Integer.valueOf(g92Var.a) : null;
            m4Var = (valueOf != null && 400 == valueOf.intValue() && map != null && u01.b(map, w11.N)) ? m4.h : 403 == i ? m4.g : 404 == i ? m4.b : (500 > i || i > 599) ? -1 == i ? m4.l : m4.e : m4.f;
        }
        return new h4(m4Var, g92Var);
    }
}
