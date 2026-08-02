package xsna;

import android.view.ViewGroup;
import xsna.rdm0;

/* compiled from: StoryShareCreationDelegate.kt */
/* loaded from: classes16.dex */
public final class sdm0 extends p1u0<rdm0.a> {
    public final izs<x7j0, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public sdm0(izs<? super x7j0, s3q0> izsVar) {
        this.a = izsVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends rdm0.a> b(ViewGroup viewGroup) {
        return new tdm0(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof rdm0.a;
    }
}
