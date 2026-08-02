package xsna;

/* compiled from: FolderFlags.kt */
@vby
/* loaded from: classes2.dex */
public final class ryr {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ryr) {
            return this.a == ((ryr) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("FolderFlags(flags=", this.a, ')');
    }
}
