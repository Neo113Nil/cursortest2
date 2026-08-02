package xsna;

/* compiled from: VkMusicOldAudioBookGenreEntity.kt */
/* loaded from: classes3.dex */
public final class y5v0 {
    public final int a;
    public final String b;

    public y5v0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5v0)) {
            return false;
        }
        y5v0 y5v0Var = (y5v0) obj;
        return this.a == y5v0Var.a && epx.f(this.b, y5v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMusicOldAudioBookGenreEntity(genreServerId=");
        sb.append(this.a);
        sb.append(", genreName=");
        return ho8.a(sb, this.b, ')');
    }
}
