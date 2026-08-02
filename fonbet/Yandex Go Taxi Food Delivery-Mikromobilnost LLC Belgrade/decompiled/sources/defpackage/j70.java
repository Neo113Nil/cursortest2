package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final class j70 {
    public final gko a;
    public final Set b;
    public final boolean c;

    public j70(gko gkoVar, Set set, boolean z) {
        this.a = gkoVar;
        this.b = set;
        this.c = z;
    }

    public final i70 a() {
        i70 i70Var = new i70();
        i70Var.a = this.a;
        i70Var.b = this.b;
        i70Var.c = Boolean.valueOf(this.c);
        return i70Var;
    }

    public final Set b() {
        gko gkoVar = this.a;
        if (gkoVar == null) {
            return EmptySet.a;
        }
        Map map = gkoVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (jl40.l(entry.getValue(), Boolean.FALSE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }
}
