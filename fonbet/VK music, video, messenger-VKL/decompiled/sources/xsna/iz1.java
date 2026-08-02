package xsna;

import androidx.compose.foundation.gestures.Orientation;
import xsna.q630;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
final class iz1<T> extends d730<androidx.compose.foundation.gestures.c<T>> {
    public final f12<T> a;
    public final Orientation b;
    public final boolean c;

    public iz1() {
        throw null;
    }

    public iz1(f12 f12Var, Orientation orientation, boolean z) {
        this.a = f12Var;
        this.b = orientation;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz1)) {
            return false;
        }
        iz1 iz1Var = (iz1) obj;
        return epx.f(this.a, iz1Var.a) && this.b == iz1Var.b && this.c == iz1Var.c;
    }

    public final int hashCode() {
        return qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 28629151, this.c);
    }

    @Override // xsna.d730
    public final q630.c r() {
        qm0 qm0Var = lz1.a;
        boolean z = this.c;
        Orientation orientation = this.b;
        androidx.compose.foundation.gestures.c cVar = new androidx.compose.foundation.gestures.c(qm0Var, z, null, orientation);
        cVar.K = this.a;
        cVar.L = orientation;
        return cVar;
    }

    @Override // xsna.d730
    public final void s(q630.c cVar) {
        boolean z;
        boolean z2;
        androidx.compose.foundation.gestures.c cVar2 = (androidx.compose.foundation.gestures.c) cVar;
        cVar2.getClass();
        f12<T> f12Var = cVar2.K;
        f12<T> f12Var2 = this.a;
        if (epx.f(f12Var, f12Var2)) {
            z = false;
        } else {
            cVar2.K = f12Var2;
            cVar2.E2();
            z = true;
        }
        Orientation orientation = cVar2.L;
        Orientation orientation2 = this.b;
        if (orientation != orientation2) {
            cVar2.L = orientation2;
            z2 = true;
        } else {
            z2 = z;
        }
        cVar2.C2(cVar2.s, this.c, null, orientation2, z2);
    }
}
