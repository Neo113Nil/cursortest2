package xsna;

import com.vk.music.player.LoopMode;

/* compiled from: PlayerParamsMeta.kt */
/* loaded from: classes3.dex */
public final class a3b0 {
    public final float a;
    public final boolean b;
    public final LoopMode c;

    public a3b0(float f, boolean z, LoopMode loopMode) {
        this.a = f;
        this.b = z;
        this.c = loopMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3b0)) {
            return false;
        }
        a3b0 a3b0Var = (a3b0) obj;
        return Float.compare(this.a, a3b0Var.a) == 0 && this.b == a3b0Var.b && this.c == a3b0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "PlayerParamsMeta(speed=" + this.a + ", isShuffleOn=" + this.b + ", loopMode=" + this.c + ')';
    }
}
