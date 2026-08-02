package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class bq6 {
    public static final double b = 30.0d;
    public final Map a;

    public bq6(pm5 pm5Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        we6[] we6VarArr = (we6[]) pm5Var.b;
        for (int i = 0; i < 2; i++) {
            we6 we6Var = we6VarArr[i];
            linkedHashMap.put(Integer.valueOf(we6Var.b), (cq6[]) we6Var.c);
        }
        this.a = linkedHashMap;
    }
}
