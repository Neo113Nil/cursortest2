package xsna;

/* compiled from: CommunityProfileWallPostsCountState.kt */
/* loaded from: classes5.dex */
public final class jvh {
    public final int a;
    public final int b;
    public final int c;

    public jvh(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvh)) {
            return false;
        }
        jvh jvhVar = (jvh) obj;
        return this.a == jvhVar.a && this.b == jvhVar.b && this.c == jvhVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityProfileWallPostsCountState(postponedCount=");
        sb.append(this.a);
        sb.append(", suggestedCount=");
        sb.append(this.b);
        sb.append(", draftsCount=");
        return vu5.b(sb, this.c, ')');
    }
}
