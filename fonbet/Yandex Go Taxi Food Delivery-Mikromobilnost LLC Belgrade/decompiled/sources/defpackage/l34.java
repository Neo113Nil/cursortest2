package defpackage;

/* loaded from: classes10.dex */
public final class l34 extends fg3 {
    public final String a;
    public final int b;
    public final jzn c;

    public l34(String str, int i, jzn jznVar) {
        this.a = str;
        this.b = i;
        this.c = jznVar;
    }

    @Override // defpackage.dh20
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dh20
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fg3
    public final jzn c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fg3)) {
            return false;
        }
        fg3 fg3Var = (fg3) obj;
        if (!this.a.equals(fg3Var.a()) || this.b != fg3Var.b()) {
            return false;
        }
        jzn jznVar = this.c;
        return jznVar == null ? fg3Var.c() == null : jznVar.equals(fg3Var.c());
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        jzn jznVar = this.c;
        return (jznVar == null ? 0 : jznVar.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "AudioMimeInfo{mimeType=" + this.a + ", profile=" + this.b + ", compatibleAudioProfile=" + this.c + "}";
    }
}
