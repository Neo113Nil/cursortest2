package xsna;

/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes11.dex */
public final class nup0 {
    public final v4s a;
    public final b6s b;
    public final int c;
    public final int d;
    public final Object e;

    public nup0(v4s v4sVar, b6s b6sVar, int i, int i2, Object obj) {
        this.a = v4sVar;
        this.b = b6sVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nup0)) {
            return false;
        }
        nup0 nup0Var = (nup0) obj;
        return epx.f(this.a, nup0Var.a) && epx.f(this.b, nup0Var.b) && this.c == nup0Var.c && this.d == nup0Var.d && epx.f(this.e, nup0Var.e);
    }

    public final int hashCode() {
        v4s v4sVar = this.a;
        int a = shy.a(this.d, shy.a(this.c, (((v4sVar == null ? 0 : v4sVar.hashCode()) * 31) + this.b.b) * 31, 31), 31);
        Object obj = this.e;
        return a + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        return k73.c(sb, this.e, ')');
    }
}
