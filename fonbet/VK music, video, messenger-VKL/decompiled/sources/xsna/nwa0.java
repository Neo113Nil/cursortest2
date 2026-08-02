package xsna;

/* compiled from: PlaybackProgress.kt */
/* loaded from: classes17.dex */
public final class nwa0 {
    public final long a;
    public final float b;
    public final boolean c;

    public nwa0(long j, float f, boolean z) {
        this.a = j;
        this.b = f;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwa0)) {
            return false;
        }
        nwa0 nwa0Var = (nwa0) obj;
        return this.a == nwa0Var.a && Float.compare(this.b, nwa0Var.b) == 0 && this.c == nwa0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackProgress(playerPosition=");
        sb.append(this.a);
        sb.append(", playbackProgress=");
        sb.append(this.b);
        sb.append(", needsPlayerSeek=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
