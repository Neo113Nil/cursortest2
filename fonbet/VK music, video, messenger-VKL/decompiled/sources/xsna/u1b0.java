package xsna;

import kotlin.LazyThreadSafetyMode;
import xsna.sht0;

/* compiled from: PlayerHolderWrapper.kt */
/* loaded from: classes17.dex */
public final class u1b0<T extends sht0> implements t1b0 {
    public final int b;
    public final t1b0 c;
    public final w0d0<T> d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new r010(this, 18));

    public u1b0(int i, t1b0 t1b0Var, w0d0<T> w0d0Var) {
        this.b = i;
        this.c = t1b0Var;
        this.d = w0d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (u1b0.class.equals(obj != null ? obj.getClass() : null)) {
            return epx.f(this.c, ((u1b0) obj).c);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t1b0
    public final o0f getAttachedPlayer() {
        return (o0f) this.e.getValue();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
