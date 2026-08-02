package xsna;

/* compiled from: FoldersEvent.kt */
/* loaded from: classes2.dex */
public final class b580 extends a1s {
    public final int b;

    public b580(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b580) && this.b == ((b580) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OnDialogsFolderDeleted(id="), this.b, ')');
    }
}
