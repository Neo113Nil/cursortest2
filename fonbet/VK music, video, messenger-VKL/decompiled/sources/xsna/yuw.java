package xsna;

import androidx.compose.animation.core.RepeatMode;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes11.dex */
public final class yuw<T> implements iq2<T> {
    public final aoo<T> a;
    public final RepeatMode b;
    public final long c;

    public yuw() {
        throw null;
    }

    public yuw(aoo aooVar, RepeatMode repeatMode, long j) {
        this.a = aooVar;
        this.b = repeatMode;
        this.c = j;
        if (aooVar instanceof dtp0) {
            dtp0 dtp0Var = (dtp0) aooVar;
            if (dtp0Var.a != 0 || dtp0Var.b != 0) {
                return;
            }
        } else if (!(aooVar instanceof aak0)) {
            if (aooVar instanceof thy) {
                if (((thy) aooVar).a.a != 0) {
                    return;
                }
            } else {
                if (aooVar instanceof vhy) {
                    throw null;
                }
                if (!(aooVar instanceof ag3)) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Animation to be infinitely repeated cannot have a 0-duration");
    }

    @Override // xsna.iq2
    public final <V extends wq2> tlr0<V> a(itp0<T, V> itp0Var) {
        return new amr0(this.a.a((itp0) itp0Var), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yuw) {
            yuw yuwVar = (yuw) obj;
            if (epx.f(yuwVar.a, this.a) && yuwVar.b == this.b && yuwVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
