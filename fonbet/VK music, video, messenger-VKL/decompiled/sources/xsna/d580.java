package xsna;

/* compiled from: FoldersEvent.kt */
/* loaded from: classes2.dex */
public final class d580 extends a1s {
    public final int b;

    public d580(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d580) && this.b == ((d580) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OnDialogsFolderEditStart(id="), this.b, ')');
    }
}
