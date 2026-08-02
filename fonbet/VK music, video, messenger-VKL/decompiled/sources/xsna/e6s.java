package xsna;

/* compiled from: AlbumDetailsFooter.kt */
/* loaded from: classes4.dex */
public final class e6s {
    public final int a;

    public e6s(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6s) && this.a == ((e6s) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("Footer(photosCount="), this.a, ')');
    }
}
