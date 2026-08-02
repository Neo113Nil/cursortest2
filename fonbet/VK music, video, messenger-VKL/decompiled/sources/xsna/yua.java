package xsna;

/* compiled from: ChannelCaption.kt */
/* loaded from: classes17.dex */
public final class yua {
    public final String a;
    public final String b;

    public yua(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yua)) {
            return false;
        }
        yua yuaVar = (yua) obj;
        return epx.f(this.a, yuaVar.a) && epx.f(this.b, yuaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCaption(fullCaption=");
        sb.append(this.a);
        sb.append(", shortCaption=");
        return ho8.a(sb, this.b, ')');
    }
}
