package defpackage;

import java.util.Objects;

/* loaded from: classes15.dex */
public abstract class bn3 extends cn3 {
    @Override // defpackage.cn3
    public final t4j0 a(t4j0 t4j0Var) {
        t4j0Var.a("Authorization", j());
        return t4j0Var;
    }

    @Override // defpackage.cn3
    public final bn3 b() {
        return this;
    }

    @Override // defpackage.cn3
    public final boolean c(String str) {
        return j().equals(str);
    }

    @Override // defpackage.cn3
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        return obj instanceof cn3 ? ((cn3) obj).c(j()) : this == obj;
    }

    public final int hashCode() {
        return Objects.hash(k());
    }

    public abstract String j();

    public abstract String k();

    public boolean l() {
        return this instanceof zm3;
    }
}
