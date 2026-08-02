package xsna;

/* compiled from: DialogsListLoaderUpdate.kt */
/* loaded from: classes18.dex */
public final class h980 implements zsm {
    public final long a;

    public h980(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h980) && this.a == ((h980) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("OnMsgEditUpdate(dialogId="));
    }
}
