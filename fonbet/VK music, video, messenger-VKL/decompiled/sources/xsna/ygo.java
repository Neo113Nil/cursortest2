package xsna;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.Pair;
import xsna.q630;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
final class ygo<T> extends d730<bho<T>> {
    public final d12<T> a;
    public final wzs<q9x, o6j, Pair<tgo<T>, T>> b;
    public final Orientation c;

    /* JADX WARN: Multi-variable type inference failed */
    public ygo(d12<T> d12Var, wzs<? super q9x, ? super o6j, ? extends Pair<? extends tgo<T>, ? extends T>> wzsVar, Orientation orientation) {
        this.a = d12Var;
        this.b = wzsVar;
        this.c = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygo)) {
            return false;
        }
        ygo ygoVar = (ygo) obj;
        return epx.f(this.a, ygoVar.a) && this.b == ygoVar.b && this.c == ygoVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // xsna.d730
    public final q630.c r() {
        bho bhoVar = new bho();
        bhoVar.p = this.a;
        bhoVar.q = this.b;
        bhoVar.r = this.c;
        return bhoVar;
    }

    @Override // xsna.d730
    public final void s(q630.c cVar) {
        bho bhoVar = (bho) cVar;
        bhoVar.p = this.a;
        bhoVar.q = this.b;
        bhoVar.r = this.c;
    }
}
