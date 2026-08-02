package defpackage;

import java.util.Map;

/* loaded from: classes7.dex */
public final class nb71 {
    public final tse a;
    public final Map b;
    public final hm71 c;
    public final rm71 d;
    public final jk81 e;

    public nb71(tse tseVar, Map map) {
        hm71 hm71Var = hm71.a;
        rm71 rm71Var = new rm71();
        if (jk81.d == null) {
            synchronized (jk81.c) {
                if (jk81.d == null) {
                    jk81.d = new jk81();
                }
            }
        }
        jk81 jk81Var = jk81.d;
        if (jk81Var == null) {
            ny61.g("Required value was null.");
            throw null;
        }
        this.a = tseVar;
        this.b = map;
        this.c = hm71Var;
        this.d = rm71Var;
        this.e = jk81Var;
    }
}
