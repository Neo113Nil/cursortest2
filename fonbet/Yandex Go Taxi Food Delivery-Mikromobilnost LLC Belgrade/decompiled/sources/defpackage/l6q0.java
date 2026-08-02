package defpackage;

import core.flex.ui.OrientationAwareRecyclerView;
import core.flex.ui.contentaware.ContentAwareSwipeRefreshLayout;
import flex.engine.section.c;

/* loaded from: classes9.dex */
public final class l6q0 implements t751 {
    public final /* synthetic */ c a;

    public l6q0(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.t751
    public final void a(n751 n751Var) {
        c cVar = this.a;
        nfh nfhVar = cVar.M;
        if (nfhVar != null) {
            cVar.t(n751Var, (OrientationAwareRecyclerView) nfhVar.b, (ContentAwareSwipeRefreshLayout) nfhVar.c);
        }
    }
}
