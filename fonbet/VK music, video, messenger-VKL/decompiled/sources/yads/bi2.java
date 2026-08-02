package yads;

import java.util.Map;

/* loaded from: classes10.dex */
public final class bi2 implements ac3 {
    public final lv a;
    public final s63 b;
    public final be0 c;

    public bi2(lv lvVar, s63 s63Var, be0 be0Var) {
        this.a = lvVar;
        this.b = s63Var;
        this.c = be0Var;
    }

    @Override // yads.ac3
    public final void a(String str, Map map) {
        String a = this.c.a(str, map);
        if (a.length() == 0) {
            return;
        }
        this.b.a(this.a, a);
    }
}
