package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.base.view.PostingContentView;
import java.util.List;
import xsna.wpc0;

/* compiled from: PostingContentView.kt */
/* loaded from: classes4.dex */
public final class pdc0 implements izs<?, s3q0> {
    public final /* synthetic */ List<n0u0<? extends wpc0<? extends PostingState>>> b;
    public final /* synthetic */ n0u0<? extends wpc0<? extends PostingState>> c;
    public final /* synthetic */ PostingContentView d;
    public final /* synthetic */ List<n0u0<? extends wpc0.a>> e;
    public final /* synthetic */ xqi<wpc0<?>> f;

    /* JADX WARN: Multi-variable type inference failed */
    public pdc0(List<? extends n0u0<? extends wpc0<? extends PostingState>>> list, n0u0<? extends wpc0<? extends PostingState>> n0u0Var, PostingContentView postingContentView, List<? extends n0u0<? extends wpc0.a>> list2, xqi<wpc0<?>> xqiVar) {
        this.b = list;
        this.c = n0u0Var;
        this.d = postingContentView;
        this.e = list2;
        this.f = xqiVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Object obj) {
        wpc0 wpc0Var = (wpc0) obj;
        List<n0u0<? extends wpc0<? extends PostingState>>> list = this.b;
        n0u0<? extends wpc0<? extends PostingState>> n0u0Var = this.c;
        if (list.contains(n0u0Var)) {
            this.d.l.c.invoke(wpc0Var);
        }
        if (j5g.P(this.e, n0u0Var)) {
            this.f.c.invoke(wpc0Var);
        }
        return s3q0.a;
    }
}
