package xsna;

import android.view.ViewGroup;
import xsna.x6s;

/* compiled from: VideoRelatedLoaderTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class kbt0 extends p1u0<jbt0> {
    public final x6s a;

    public kbt0(x6s.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends jbt0> b(ViewGroup viewGroup) {
        return new xjf0(this.a.b(viewGroup.getContext(), viewGroup));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof jbt0;
    }
}
