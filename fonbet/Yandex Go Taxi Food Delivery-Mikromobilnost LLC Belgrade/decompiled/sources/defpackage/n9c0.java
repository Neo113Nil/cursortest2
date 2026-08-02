package defpackage;

import java.util.List;

/* loaded from: classes13.dex */
public final class n9c0 implements i3m {
    public final /* synthetic */ kzo a;

    public n9c0(kzo kzoVar) {
        this.a = kzoVar;
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list) {
        this.a.b = true;
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, long j, List list) {
        super.onRenderingFinished(l1oVar, u1mVar, xzlVar, j, list);
        if (xzlVar.a.a instanceof aks0) {
            return;
        }
        this.a.b = false;
    }
}
