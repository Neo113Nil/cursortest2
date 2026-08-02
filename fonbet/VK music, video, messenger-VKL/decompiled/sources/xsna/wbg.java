package xsna;

/* compiled from: VideoDiscoveryCommentsRepository.kt */
/* loaded from: classes2.dex */
public final class wbg {
    public final String a;
    public final String b;

    public wbg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbg)) {
            return false;
        }
        wbg wbgVar = (wbg) obj;
        return epx.f(this.a, wbgVar.a) && epx.f(this.b, wbgVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentItem(text=");
        sb.append(this.a);
        sb.append(", userPhoto=");
        return ho8.a(sb, this.b, ')');
    }
}
