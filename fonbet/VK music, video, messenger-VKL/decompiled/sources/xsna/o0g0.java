package xsna;

import androidx.compose.animation.core.RepeatMode;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes11.dex */
public final class o0g0<T> implements phr<T> {
    public final int a;
    public final aoo<T> b;
    public final RepeatMode c;
    public final long d;

    public o0g0() {
        throw null;
    }

    public o0g0(int i, long j, RepeatMode repeatMode, aoo aooVar) {
        this.a = i;
        this.b = aooVar;
        this.c = repeatMode;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0g0) {
            o0g0 o0g0Var = (o0g0) obj;
            if (o0g0Var.a == this.a && epx.f(o0g0Var.b, this.b) && o0g0Var.c == this.c && o0g0Var.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a * 31)) * 31)) * 31);
    }

    @Override // xsna.iq2
    public final <V extends wq2> xlr0<V> a(itp0<T, V> itp0Var) {
        return new dmr0(this.a, this.b.a((itp0) itp0Var), this.c, this.d);
    }
}
