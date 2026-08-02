package xsna;

import androidx.recyclerview.widget.m;
import xsna.ifz;

/* compiled from: ListItemAdapterDiffCallback.kt */
/* loaded from: classes7.dex */
public final class lfz extends m.e<ifz> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(ifz ifzVar, ifz ifzVar2) {
        return ifzVar.equals(ifzVar2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(ifz ifzVar, ifz ifzVar2) {
        ifz ifzVar3 = ifzVar;
        ifz ifzVar4 = ifzVar2;
        if ((ifzVar3 instanceof ifz.b) && (ifzVar4 instanceof ifz.b)) {
            return true;
        }
        if ((ifzVar3 instanceof ifz.a) && (ifzVar4 instanceof ifz.a)) {
            return epx.f(((ifz.a) ifzVar3).a, ((ifz.a) ifzVar4).a);
        }
        if ((ifzVar3 instanceof ifz.e) && (ifzVar4 instanceof ifz.e)) {
            return epx.f(((ifz.e) ifzVar3).a, ((ifz.e) ifzVar4).a);
        }
        if ((ifzVar3 instanceof ifz.f) && (ifzVar4 instanceof ifz.f)) {
            return true;
        }
        return ((ifzVar3 instanceof ifz.c) && (ifzVar4 instanceof ifz.c)) ? epx.f(((ifz.c) ifzVar3).a, ((ifz.c) ifzVar4).a) : (ifzVar3 instanceof ifz.d) && (ifzVar4 instanceof ifz.d);
    }
}
