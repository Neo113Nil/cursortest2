package xsna;

/* compiled from: ClipsSuggestedHashtag.kt */
/* loaded from: classes16.dex */
public final class o5f {
    public final String a;
    public final boolean b;

    public o5f(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5f)) {
            return false;
        }
        o5f o5fVar = (o5f) obj;
        return epx.f(this.a, o5fVar.a) && this.b == o5fVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsSuggestedHashtag(hashtag=");
        sb.append(this.a);
        sb.append(", isTrend=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
