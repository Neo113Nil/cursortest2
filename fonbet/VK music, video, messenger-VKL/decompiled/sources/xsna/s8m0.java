package xsna;

/* compiled from: StoryPollInfo.kt */
/* loaded from: classes5.dex */
public final class s8m0 {
    public final boolean a;
    public final v2l0 b;

    public s8m0(boolean z, v2l0 v2l0Var) {
        this.a = z;
        this.b = v2l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8m0)) {
            return false;
        }
        s8m0 s8m0Var = (s8m0) obj;
        s8m0Var.getClass();
        return this.a == s8m0Var.a && epx.f(this.b, s8m0Var.b);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(true) * 31, 31, this.a);
        v2l0 v2l0Var = this.b;
        return b + (v2l0Var == null ? 0 : v2l0Var.hashCode());
    }

    public final String toString() {
        return "StoryPollStickerConfig(isDynamicPollEnabled=true, isContentColorStickersEnabled=" + this.a + ", stickerColors=" + this.b + ')';
    }
}
