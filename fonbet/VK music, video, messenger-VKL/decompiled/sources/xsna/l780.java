package xsna;

/* compiled from: OnMediaAudioAttachmentViewHolderState.kt */
/* loaded from: classes4.dex */
public final class l780 {
    public final int a;
    public final long b;
    public boolean c;

    public l780(int i, long j, boolean z) {
        this.a = i;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l780)) {
            return false;
        }
        l780 l780Var = (l780) obj;
        return this.a == l780Var.a && this.b == l780Var.b && this.c == l780Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMediaAudioAttachmentViewHolderState(currentTrackNumber=");
        sb.append(this.a);
        sb.append(", currentTrackPosition=");
        sb.append(this.b);
        sb.append(", isPlaylistAttachmentAnimated=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
