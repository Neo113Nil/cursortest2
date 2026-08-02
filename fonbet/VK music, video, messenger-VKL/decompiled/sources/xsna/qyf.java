package xsna;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class qyf {
    public final String a;
    public final String b;

    public qyf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyf)) {
            return false;
        }
        qyf qyfVar = (qyf) obj;
        return epx.f(this.a, qyfVar.a) && epx.f(this.b, qyfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoauthorViewState(name=");
        sb.append(this.a);
        sb.append(", avatarIconUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
