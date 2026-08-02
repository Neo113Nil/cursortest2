package xsna;

/* compiled from: AlbumViewedItems.kt */
/* loaded from: classes18.dex */
public final class sl1 {
    public final String a;
    public final boolean b;

    public sl1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl1)) {
            return false;
        }
        sl1 sl1Var = (sl1) obj;
        return epx.f(this.a, sl1Var.a) && this.b == sl1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumViewedItem(imageUrl=");
        sb.append(this.a);
        sb.append(", isBlurred=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
