package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.mpo;

/* compiled from: DynamicFiltersViewDelegate.kt */
/* loaded from: classes16.dex */
public final class npo implements iqo<mpo> {
    @Override // xsna.iqo
    public final /* bridge */ /* synthetic */ void a(mpo mpoVar) {
    }

    @Override // xsna.iqo
    public final boolean b(mpo mpoVar) {
        mpo mpoVar2 = mpoVar;
        if (mpoVar2.equals(mpo.a.b) || mpoVar2.equals(mpo.b.b)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
