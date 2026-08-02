package xsna;

import xsna.ry90;

/* compiled from: CompositionLocalMap.kt */
/* loaded from: classes11.dex */
public final class tvi {
    public static final <T> T a(sy90 sy90Var, lvi<T> lviVar) {
        xjr0<T> xjr0Var = (xjr0<T>) sy90Var.get(lviVar);
        if (xjr0Var == null) {
            xjr0Var = lviVar.a();
        }
        return (T) xjr0Var.a(sy90Var);
    }

    public static final sy90 b(c9e0<?>[] c9e0VarArr, sy90 sy90Var, sy90 sy90Var2) {
        ry90 ry90Var = ry90.e;
        ry90.a aVar = new ry90.a(ry90Var);
        aVar.h = ry90Var;
        for (c9e0<?> c9e0Var : c9e0VarArr) {
            androidx.compose.runtime.e eVar = c9e0Var.a;
            if (c9e0Var.f || !sy90Var.containsKey(eVar)) {
                aVar.put(eVar, eVar.c(c9e0Var, (xjr0) sy90Var2.get(eVar)));
            }
        }
        return aVar.build();
    }
}
