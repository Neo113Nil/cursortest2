package defpackage;

import java.util.List;

/* loaded from: classes13.dex */
public final class a9c0 implements i3m {
    public final /* synthetic */ b9c0 a;
    public final /* synthetic */ kfc0 b;

    public a9c0(b9c0 b9c0Var, kfc0 kfc0Var) {
        this.a = b9c0Var;
        this.b = kfc0Var;
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFailed(l1o l1oVar, u1m u1mVar, Throwable th, List list) {
        this.a.C.c();
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        super.onDocumentLoadingFinished(l1oVar, u1mVar, xzlVar, list);
        this.a.C.a();
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list) {
        this.a.C.d();
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, long j, List list) {
        super.onRenderingFinished(l1oVar, u1mVar, xzlVar, j, list);
        ywl ywlVar = xzlVar.a;
        b9c0 b9c0Var = this.a;
        b9c0Var.K = ywlVar;
        b9c0Var.C.b();
    }

    @Override // defpackage.i3m
    public final void onRenderingStarted(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        super.onRenderingStarted(l1oVar, u1mVar, xzlVar, list);
        cnr0 cnr0Var = xzlVar.a.c;
        this.b.getClass();
    }
}
