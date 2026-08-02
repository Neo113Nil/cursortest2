package xsna;

/* compiled from: VideoSubtitlesRepository.kt */
/* loaded from: classes2.dex */
public final class m1n0 {
    public final boolean a;
    public final String b;

    public m1n0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1n0)) {
            return false;
        }
        m1n0 m1n0Var = (m1n0) obj;
        return this.a == m1n0Var.a && epx.f(this.b, m1n0Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitlesState(isEnabled=");
        sb.append(this.a);
        sb.append(", selectedLanguage=");
        return ho8.a(sb, this.b, ')');
    }
}
