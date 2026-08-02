package xsna;

/* compiled from: ClipUserSettings.kt */
/* loaded from: classes18.dex */
public final class ued {
    public final String a;
    public final String b;

    public ued(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ued)) {
            return false;
        }
        ued uedVar = (ued) obj;
        return epx.f(this.a, uedVar.a) && epx.f(this.b, uedVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUserSettings(id=");
        sb.append(this.a);
        sb.append(", value=");
        return ho8.a(sb, this.b, ')');
    }
}
