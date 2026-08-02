package xsna;

/* compiled from: MarketEditAlbumCoverViewState.kt */
/* loaded from: classes18.dex */
public final class zzo0 {
    public final String a;
    public final int b;
    public final boolean c;

    public zzo0() {
        this(null, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo0)) {
            return false;
        }
        zzo0 zzo0Var = (zzo0) obj;
        return epx.f(this.a, zzo0Var.a) && this.b == zzo0Var.b && this.c == zzo0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleViewState(title=");
        sb.append(this.a);
        sb.append(", titleCursorPosition=");
        sb.append(this.b);
        sb.append(", isError=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public zzo0(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
