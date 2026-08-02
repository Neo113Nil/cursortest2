package xsna;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.Pair;
import xsna.q630;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes17.dex */
final class xgo<T> extends d730<aho<T>> {
    public final e12<T> a;
    public final wzs<q9x, o6j, Pair<ugo<T>, T>> b;
    public final Orientation c;

    /* JADX WARN: Multi-variable type inference failed */
    public xgo(e12<T> e12Var, wzs<? super q9x, ? super o6j, ? extends Pair<? extends ugo<T>, ? extends T>> wzsVar, Orientation orientation) {
        this.a = e12Var;
        this.b = wzsVar;
        this.c = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgo)) {
            return false;
        }
        xgo xgoVar = (xgo) obj;
        return epx.f(this.a, xgoVar.a) && this.b == xgoVar.b && this.c == xgoVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // xsna.d730
    public final q630.c r() {
        aho ahoVar = new aho();
        ahoVar.p = this.a;
        ahoVar.q = this.b;
        ahoVar.r = this.c;
        return ahoVar;
    }

    @Override // xsna.d730
    public final void s(q630.c cVar) {
        aho ahoVar = (aho) cVar;
        ahoVar.p = this.a;
        ahoVar.q = this.b;
        ahoVar.r = this.c;
    }
}
