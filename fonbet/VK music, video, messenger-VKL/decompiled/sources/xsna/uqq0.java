package xsna;

/* compiled from: UserProfileLegoAvatarContextMenu.kt */
/* loaded from: classes5.dex */
public final class uqq0 {
    public final boolean a;
    public final boolean b;
    public final sqq0 c;
    public final tqq0 d;

    public uqq0(boolean z, boolean z2, sqq0 sqq0Var, tqq0 tqq0Var) {
        this.a = z;
        this.b = z2;
        this.c = sqq0Var;
        this.d = tqq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqq0)) {
            return false;
        }
        uqq0 uqq0Var = (uqq0) obj;
        return this.a == uqq0Var.a && this.b == uqq0Var.b && epx.f(this.c, uqq0Var.c) && epx.f(this.d, uqq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "Params(hasPhoto=" + this.a + ", isMainPhoto=" + this.b + ", callbacks=" + this.c + ", menuLifecycle=" + this.d + ')';
    }
}
