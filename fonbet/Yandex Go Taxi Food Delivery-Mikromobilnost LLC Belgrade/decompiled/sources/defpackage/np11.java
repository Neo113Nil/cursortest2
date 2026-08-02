package defpackage;

/* loaded from: classes10.dex */
public final class np11 {
    public final eyr a;
    public final lzr b;
    public final int c;
    public final int d;

    public np11(eyr eyrVar, lzr lzrVar, int i, int i2) {
        this.a = eyrVar;
        this.b = lzrVar;
        this.c = i;
        this.d = i2;
    }

    public static np11 a(np11 np11Var) {
        lzr lzrVar = np11Var.b;
        int i = np11Var.c;
        int i2 = np11Var.d;
        np11Var.getClass();
        np11Var.getClass();
        return new np11(null, lzrVar, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np11)) {
            return false;
        }
        np11 np11Var = (np11) obj;
        return jl40.l(this.a, np11Var.a) && jl40.l(this.b, np11Var.b) && this.c == np11Var.c && this.d == np11Var.d;
    }

    public final int hashCode() {
        eyr eyrVar = this.a;
        return oyr.b(this.d, oyr.b(this.c, (((eyrVar == null ? 0 : eyrVar.hashCode()) * 31) + this.b.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        sb.append((Object) hzr.a(this.c));
        sb.append(", fontSynthesis=");
        int i = this.d;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid"));
        sb.append(", resourceLoaderCacheKey=null)");
        return sb.toString();
    }
}
