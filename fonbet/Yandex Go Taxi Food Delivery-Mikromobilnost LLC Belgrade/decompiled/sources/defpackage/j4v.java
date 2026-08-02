package defpackage;

/* loaded from: classes5.dex */
public final class j4v extends ome {
    public final ky b;
    public final ra90 c;

    public j4v(ky kyVar, ra90 ra90Var) {
        super(null);
        this.b = kyVar;
        this.c = ra90Var;
    }

    @Override // defpackage.ome
    public final Object a() {
        return null;
    }

    @Override // defpackage.ome
    public final String b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4v)) {
            return false;
        }
        j4v j4vVar = (j4v) obj;
        return this.b.equals(j4vVar.b) && this.c.equals(j4vVar.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() + (this.b.hashCode() * 31)) * 961;
    }

    public final String toString() {
        return "IconButtonState(action=" + this.b + ", iconModel=" + this.c + ", metricaLabel=null, meta=null)";
    }
}
