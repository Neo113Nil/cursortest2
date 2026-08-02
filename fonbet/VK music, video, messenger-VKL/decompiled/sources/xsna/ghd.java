package xsna;

/* compiled from: ClipsAuthorSelectorAuthorData.kt */
/* loaded from: classes14.dex */
public final class ghd {
    public final dhd a;
    public final boolean b;

    public ghd(dhd dhdVar, boolean z) {
        this.a = dhdVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghd)) {
            return false;
        }
        ghd ghdVar = (ghd) obj;
        return epx.f(this.a, ghdVar.a) && this.b == ghdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsAuthorSelectorAuthorData(author=");
        sb.append(this.a);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
