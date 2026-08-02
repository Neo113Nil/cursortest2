package xsna;

/* compiled from: ClipsAvatarConfig.kt */
/* loaded from: classes14.dex */
public final class jjd {
    public final String a;
    public final boolean b;

    public jjd(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjd)) {
            return false;
        }
        jjd jjdVar = (jjd) obj;
        return epx.f(this.a, jjdVar.a) && this.b == jjdVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsAvatarConfig(url=");
        sb.append(this.a);
        sb.append(", isNft=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
