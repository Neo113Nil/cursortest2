package xsna;

/* compiled from: AttachedClipsViewState.kt */
/* loaded from: classes7.dex */
public final class s44 {
    public final String a;
    public final String b;

    public s44(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s44)) {
            return false;
        }
        s44 s44Var = (s44) obj;
        return epx.f(this.a, s44Var.a) && epx.f(this.b, s44Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedClipViewState(id=");
        sb.append(this.a);
        sb.append(", coverUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
