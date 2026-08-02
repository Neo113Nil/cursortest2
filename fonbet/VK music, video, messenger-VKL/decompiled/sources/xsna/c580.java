package xsna;

/* compiled from: FoldersEvent.kt */
/* loaded from: classes2.dex */
public final class c580 extends a1s {
    public final int b;

    public c580(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c580) && this.b == ((c580) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OnDialogsFolderEditFailed(id="), this.b, ')');
    }
}
