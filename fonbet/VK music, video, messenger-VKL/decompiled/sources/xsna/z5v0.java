package xsna;

/* compiled from: VkMusicOldAudioBookPublisherEntity.kt */
/* loaded from: classes3.dex */
public final class z5v0 {
    public final int a;
    public final String b;

    public z5v0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5v0)) {
            return false;
        }
        z5v0 z5v0Var = (z5v0) obj;
        return this.a == z5v0Var.a && epx.f(this.b, z5v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkMusicOldAudioBookPublisherEntity(serverId=");
        sb.append(this.a);
        sb.append(", name=");
        return ho8.a(sb, this.b, ')');
    }
}
