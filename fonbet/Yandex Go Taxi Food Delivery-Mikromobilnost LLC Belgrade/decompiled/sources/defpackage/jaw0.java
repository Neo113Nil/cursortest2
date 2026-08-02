package defpackage;

import java.util.List;

/* loaded from: classes14.dex */
public final class jaw0 implements i3m {
    public final kaw0 a;

    public jaw0(kaw0 kaw0Var) {
        this.a = kaw0Var;
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        if (jl40.l(u1mVar.a, "bdui/v1/superapp/favorites")) {
            this.a.a = null;
        }
    }
}
