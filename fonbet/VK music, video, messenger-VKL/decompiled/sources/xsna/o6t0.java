package xsna;

import android.os.Looper;

/* compiled from: VideoProducerConfig.kt */
/* loaded from: classes3.dex */
public final class o6t0 {
    public final r6t0 a;
    public final int b;
    public final Looper c;

    public o6t0(r6t0 r6t0Var, int i, Looper looper) {
        this.a = r6t0Var;
        this.b = i;
        this.c = looper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6t0)) {
            return false;
        }
        o6t0 o6t0Var = (o6t0) obj;
        return epx.f(this.a, o6t0Var.a) && this.b == o6t0Var.b && epx.f(this.c, o6t0Var.c);
    }

    public final int hashCode() {
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        Looper looper = this.c;
        return a + (looper == null ? 0 : looper.hashCode());
    }

    public final String toString() {
        return "VideoProducerConfig(listener=" + this.a + ", surfaceTextureId=" + this.b + ", looper=" + this.c + ')';
    }
}
