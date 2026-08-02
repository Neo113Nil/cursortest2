package xsna;

/* compiled from: ChannelCommentRestoreCmd.kt */
/* loaded from: classes2.dex */
public final class mva extends le6<Boolean> {
    public final long b;
    public final int c;
    public final int d;

    public mva(long j, int i, int i2) {
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        return (Boolean) bz2.c(new lva(this.b, this.c, this.d), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mva)) {
            return false;
        }
        mva mvaVar = (mva) obj;
        return this.b == mvaVar.b && this.c == mvaVar.c && this.d == mvaVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, Long.hashCode(this.b) * 31, 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCommentRestoreCmd(channelId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", commentId=");
        return vu5.b(sb, this.d, ')');
    }
}
