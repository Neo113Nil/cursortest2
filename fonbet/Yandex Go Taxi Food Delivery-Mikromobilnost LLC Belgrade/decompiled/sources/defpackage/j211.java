package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class j211 implements i211 {
    public final Set a;
    public final v111 b;
    public final z811 c;

    public j211(Set set, v111 v111Var, z811 z811Var) {
        this.a = set;
        this.b = v111Var;
        this.c = z811Var;
    }

    public final z211 a(String str, pzn pznVar, ww01 ww01Var) {
        Set set = this.a;
        if (set.contains(pznVar)) {
            return new z211(this.b, str, pznVar, ww01Var, this.c);
        }
        kbs.o("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{pznVar, set});
        return null;
    }
}
