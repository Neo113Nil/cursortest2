package androidx.compose.runtime;

import defpackage.bvf0;
import defpackage.dui0;
import defpackage.tse;

/* loaded from: classes10.dex */
public final class a implements dui0 {
    public final tse a;

    public a(tse tseVar) {
        this.a = tseVar;
    }

    @Override // defpackage.dui0
    public final void b() {
    }

    @Override // defpackage.dui0
    public final void d() {
        tse tseVar = this.a;
        if (tseVar instanceof l) {
            ((l) tseVar).a();
        } else {
            bvf0.j(tseVar, new LeftCompositionCancellationException());
        }
    }

    @Override // defpackage.dui0
    public final void e() {
        tse tseVar = this.a;
        if (tseVar instanceof l) {
            ((l) tseVar).a();
        } else {
            bvf0.j(tseVar, new LeftCompositionCancellationException());
        }
    }
}
