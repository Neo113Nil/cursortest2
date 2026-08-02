package defpackage;

/* loaded from: classes2.dex */
public final class cfg {
    public final String a;
    public final String b;
    public final afg c;

    public cfg(String str, String str2, afg afgVar) {
        this.a = str;
        this.b = str2;
        this.c = afgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfg)) {
            return false;
        }
        cfg cfgVar = (cfg) obj;
        return jl40.l(this.a, cfgVar.a) && jl40.l(this.b, cfgVar.b) && jl40.l(this.c, cfgVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        afg afgVar = this.c;
        return hashCode2 + (afgVar != null ? afgVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "Button(textColor=" + this.a + ", backgroundColor=" + this.b + ", action=" + this.c + ')';
    }
}
