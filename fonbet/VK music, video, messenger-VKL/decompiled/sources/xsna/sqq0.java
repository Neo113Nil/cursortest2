package xsna;

/* compiled from: UserProfileLegoAvatarContextMenu.kt */
/* loaded from: classes5.dex */
public final class sqq0 {
    public final jzd a;
    public final tfm0 b;
    public final em00 c;
    public final qkq d;

    public sqq0(jzd jzdVar, tfm0 tfm0Var, em00 em00Var, qkq qkqVar) {
        this.a = jzdVar;
        this.b = tfm0Var;
        this.c = em00Var;
        this.d = qkqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqq0)) {
            return false;
        }
        sqq0 sqq0Var = (sqq0) obj;
        return this.a.equals(sqq0Var.a) && this.b.equals(sqq0Var.b) && this.c.equals(sqq0Var.c) && this.d.equals(sqq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Callbacks(onViewPhotos=" + this.a + ", onChangePhoto=" + this.b + ", onSetAsMainPhoto=" + this.c + ", onDeletePhoto=" + this.d + ')';
    }
}
