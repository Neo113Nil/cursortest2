package xsna;

/* compiled from: CoauthorVS.kt */
/* loaded from: classes17.dex */
public final class pyf {
    public final String a;
    public final String b;

    public pyf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyf)) {
            return false;
        }
        pyf pyfVar = (pyf) obj;
        return epx.f(this.a, pyfVar.a) && epx.f(this.b, pyfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoauthorVS(name=");
        sb.append(this.a);
        sb.append(", avatar=");
        return ho8.a(sb, this.b, ')');
    }
}
