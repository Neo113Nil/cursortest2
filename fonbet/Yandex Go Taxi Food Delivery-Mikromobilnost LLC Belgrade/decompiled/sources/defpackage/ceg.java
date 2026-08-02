package defpackage;

/* loaded from: classes2.dex */
public final class ceg {
    public final String a;
    public final String b;
    public final beg c;
    public final aeg d;

    public ceg(String str, String str2, beg begVar, aeg aegVar) {
        this.a = str;
        this.b = str2;
        this.c = begVar;
        this.d = aegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ceg)) {
            return false;
        }
        ceg cegVar = (ceg) obj;
        return jl40.l(this.a, cegVar.a) && jl40.l(this.b, cegVar.b) && jl40.l(this.c, cegVar.c) && jl40.l(this.d, cegVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        beg begVar = this.c;
        int hashCode3 = (hashCode2 + (begVar == null ? 0 : begVar.hashCode())) * 31;
        aeg aegVar = this.d;
        return hashCode3 + (aegVar != null ? aegVar.hashCode() : 0);
    }

    public final String toString() {
        return "DarkConfigurationOverlayFragment(shape=" + this.a + ", textColor=" + this.b + ", textColors=" + this.c + ", background=" + this.d + ')';
    }
}
