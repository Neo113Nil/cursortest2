package xsna;

/* compiled from: ContentViewState.kt */
/* loaded from: classes17.dex */
public final class ylj {
    public final String a;
    public final float b;

    public ylj(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylj)) {
            return false;
        }
        ylj yljVar = (ylj) obj;
        return epx.f(this.a, yljVar.a) && Float.compare(this.b, yljVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentViewState(contentUrl=");
        sb.append(this.a);
        sb.append(", contentRatio=");
        return xq.c(')', this.b, sb);
    }
}
