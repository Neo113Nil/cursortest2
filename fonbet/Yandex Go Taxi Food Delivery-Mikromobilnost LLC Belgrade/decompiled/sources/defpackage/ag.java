package defpackage;

/* loaded from: classes10.dex */
public final class ag {
    public final String a;
    public final cms b;

    public ag(String str, cms cmsVar) {
        this.a = str;
        this.b = cmsVar;
    }

    public final cms a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return jl40.l(this.a, agVar.a) && jl40.l(this.b, agVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        cms cmsVar = this.b;
        return hashCode + (cmsVar != null ? cmsVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
