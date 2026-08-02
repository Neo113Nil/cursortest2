package yads;

import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class c9 implements rd2 {
    public final qd2 a;

    public /* synthetic */ c9(w5 w5Var) {
        this(new qd2(w5Var));
    }

    @Override // yads.rd2
    public final LinkedHashMap a() {
        return this.a.a(Collections.singleton(v5.f));
    }

    public c9(qd2 qd2Var) {
        this.a = qd2Var;
    }
}
