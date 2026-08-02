package xsna;

/* compiled from: MusicDynamicPopupButton.kt */
/* loaded from: classes3.dex */
public final class rj40 {
    public final String a;
    public final String b;
    public final gzs<s3q0> c;

    public rj40() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj40)) {
            return false;
        }
        rj40 rj40Var = (rj40) obj;
        return epx.f(this.a, rj40Var.a) && epx.f(this.b, rj40Var.b) && epx.f(this.c, rj40Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        gzs<s3q0> gzsVar = this.c;
        return hashCode2 + (gzsVar != null ? gzsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicDynamicPopupButton(text=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", onClick=");
        return uf3.d(sb, this.c, ')');
    }

    public rj40(String str, String str2, sw1 sw1Var, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        sw1Var = (i & 4) != 0 ? null : sw1Var;
        this.a = str;
        this.b = str2;
        this.c = sw1Var;
    }
}
