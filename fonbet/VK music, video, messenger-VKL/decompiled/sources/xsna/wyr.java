package xsna;

/* compiled from: FolderInvalidateLpEvent.kt */
/* loaded from: classes2.dex */
public final class wyr implements e900 {
    public final int a;

    public wyr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyr) && this.a == ((wyr) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("FolderInvalidateLpEvent(id="), this.a, ')');
    }
}
