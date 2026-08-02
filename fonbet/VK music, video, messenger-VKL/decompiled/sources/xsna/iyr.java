package xsna;

/* compiled from: FolderDeleteLpEvent.kt */
/* loaded from: classes2.dex */
public final class iyr implements e900 {
    public final int a;

    public iyr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iyr) && this.a == ((iyr) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("FolderDeleteLpEvent(id="), this.a, ')');
    }
}
