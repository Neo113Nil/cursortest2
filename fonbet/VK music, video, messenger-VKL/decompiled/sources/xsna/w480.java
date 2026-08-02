package xsna;

/* compiled from: FoldersEvent.kt */
/* loaded from: classes2.dex */
public final class w480 extends a1s {
    public final int b;

    public w480(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w480) && this.b == ((w480) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OnDialogsFolderCreated(id="), this.b, ')');
    }
}
