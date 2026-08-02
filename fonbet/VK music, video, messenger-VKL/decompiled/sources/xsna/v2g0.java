package xsna;

/* compiled from: RepliesViewEvents.kt */
/* loaded from: classes18.dex */
public final class v2g0 implements t2g0 {
    public final int a;

    public v2g0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2g0) && this.a == ((v2g0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("OnRestoreItemClick(replyId="), this.a, ')');
    }
}
