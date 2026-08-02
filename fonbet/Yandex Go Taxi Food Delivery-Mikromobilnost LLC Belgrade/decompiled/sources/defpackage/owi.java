package defpackage;

/* loaded from: classes12.dex */
public final class owi implements qwi {
    public final String a;
    public final String b;
    public final String c;

    public owi(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owi)) {
            return false;
        }
        owi owiVar = (owi) obj;
        return jl40.l(this.a, owiVar.a) && jl40.l(this.b, owiVar.b) && jl40.l(this.c, owiVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
