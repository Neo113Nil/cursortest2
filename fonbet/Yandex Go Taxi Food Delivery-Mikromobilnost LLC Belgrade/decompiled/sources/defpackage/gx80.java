package defpackage;

/* loaded from: classes.dex */
public final class gx80 extends ix80 {
    public final zii0 a;

    public gx80(zii0 zii0Var) {
        this.a = zii0Var;
    }

    @Override // defpackage.ix80
    public final zii0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gx80) {
            return this.a.equals(((gx80) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
