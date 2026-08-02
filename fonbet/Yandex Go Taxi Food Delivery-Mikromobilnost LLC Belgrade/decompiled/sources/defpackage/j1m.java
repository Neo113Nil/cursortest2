package defpackage;

import java.util.UUID;

/* loaded from: classes9.dex */
public final class j1m implements ku00 {
    public final uu00 a;
    public final wwq b;
    public Long c;
    public Long d;
    public final String e;

    public j1m(uu00 uu00Var, wwq wwqVar) {
        this.a = uu00Var;
        this.b = wwqVar;
        String uuid = UUID.randomUUID().toString();
        this.e = uuid;
        wwqVar.e(uu00Var.a, uuid);
    }
}
