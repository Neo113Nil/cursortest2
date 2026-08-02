package xsna;

/* compiled from: OnJoiningToChannelSuccessEvent.kt */
/* loaded from: classes2.dex */
public final class w680 extends sxp {
    public final long b;

    public w680(long j) {
        this.b = j;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w680) && this.b == ((w680) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) * 31;
    }

    public final String toString() {
        return efz.b(this.b, ", changerTag=null)", new StringBuilder("OnJoiningToChannelSuccessEvent(channelId="));
    }
}
