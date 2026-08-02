package defpackage;

/* loaded from: classes5.dex */
public final class abc extends ome {
    public final String b;
    public final ky c;
    public final lzr d;

    public abc(String str, ky kyVar, lzr lzrVar) {
        super(null);
        this.b = str;
        this.c = kyVar;
        this.d = lzrVar;
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
        if (!(obj instanceof abc)) {
            return false;
        }
        abc abcVar = (abc) obj;
        return jl40.l(this.b, abcVar.b) && this.c.equals(abcVar.c) && jl40.l(this.d, abcVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        lzr lzrVar = this.d;
        return (hashCode + (lzrVar == null ? 0 : lzrVar.a)) * 961;
    }

    public final String toString() {
        return "CollapseButtonState(text=" + this.b + ", action=" + this.c + ", fontWeight=" + this.d + ", metricaLabel=null, meta=null)";
    }
}
