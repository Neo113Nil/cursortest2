package xsna;

/* compiled from: CommunityRepliesPatch.kt */
/* loaded from: classes18.dex */
public final class swh implements pwh {
    public final int b;

    public swh(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swh) && this.b == ((swh) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ReplyEditDataChanged(replyId="), this.b, ')');
    }
}
