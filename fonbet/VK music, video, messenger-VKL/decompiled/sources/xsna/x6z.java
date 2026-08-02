package xsna;

/* compiled from: LikesContentState.kt */
/* loaded from: classes16.dex */
public final class x6z {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final String d;

    public x6z() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6z)) {
            return false;
        }
        x6z x6zVar = (x6z) obj;
        return this.a == x6zVar.a && this.b == x6zVar.b && this.c == x6zVar.c && epx.f(this.d, x6zVar.d);
    }

    public final int hashCode() {
        int a = shy.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikesContentState(isAvailable=");
        sb.append(this.a);
        sb.append(", isLiked=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", countString=");
        return ho8.a(sb, this.d, ')');
    }

    public /* synthetic */ x6z(int i) {
        this(null, 0, true, false);
    }

    public x6z(String str, int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = str;
    }
}
