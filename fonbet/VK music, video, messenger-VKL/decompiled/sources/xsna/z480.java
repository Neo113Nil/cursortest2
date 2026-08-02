package xsna;

/* compiled from: FoldersEvent.kt */
/* loaded from: classes2.dex */
public final class z480 extends a1s {
    public final int b;

    public z480(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z480) && this.b == ((z480) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OnDialogsFolderDeleteFailed(id="), this.b, ')');
    }
}
