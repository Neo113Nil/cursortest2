package xsna;

/* compiled from: EditorImageState.kt */
/* loaded from: classes4.dex */
public final class i4p {
    public final e4p a;
    public final e4p b;
    public final Float c;

    public /* synthetic */ i4p(e4p e4pVar, e4p e4pVar2, int i) {
        this(e4pVar, (i & 2) != 0 ? e4pVar : e4pVar2, (Float) null);
    }

    public static i4p a(i4p i4pVar, Float f) {
        e4p e4pVar = i4pVar.a;
        e4p e4pVar2 = i4pVar.b;
        i4pVar.getClass();
        return new i4p(e4pVar, e4pVar2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4p)) {
            return false;
        }
        i4p i4pVar = (i4p) obj;
        return epx.f(this.a, i4pVar.a) && epx.f(this.b, i4pVar.b) && epx.f(this.c, i4pVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Float f = this.c;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "EditorImageState(defaultLink=" + this.a + ", currentLink=" + this.b + ", ratio=" + this.c + ")";
    }

    public i4p(e4p e4pVar, e4p e4pVar2, Float f) {
        this.a = e4pVar;
        this.b = e4pVar2;
        this.c = f;
    }
}
