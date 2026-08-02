package xsna;

/* compiled from: ChannelHideInAllFolderCmd.kt */
/* loaded from: classes2.dex */
public final class zza extends le6<s3q0> {
    public final long b;

    public zza(long j) {
        this.b = j;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        uib a = w2wVar.I0().a();
        long j = this.b;
        bdb c = a.c(j);
        if (c != null && !c.G) {
            w2wVar.I0().a().H(j, true);
            w2wVar.S0().H(j);
            ((x6x) w2wVar.M0().a().a).a(new a0b(j));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zza) && this.b == ((zza) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("ChannelHideInAllFolderCmd(channelId="));
    }
}
