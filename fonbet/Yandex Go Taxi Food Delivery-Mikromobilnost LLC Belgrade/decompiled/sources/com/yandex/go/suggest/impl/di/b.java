package com.yandex.go.suggest.impl.di;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.flex.common.descriptors.action.d;
import defpackage.n3w;
import defpackage.oag;
import defpackage.umt0;
import defpackage.v7p;
import defpackage.xvf0;

/* loaded from: classes8.dex */
public final class b implements v7p {
    public final oag a;
    public final umt0 b;
    public final xvf0 c;
    public final n3w d;

    public b(oag oagVar, umt0 umt0Var, xvf0 xvf0Var, n3w n3wVar) {
        this.a = oagVar;
        this.b = umt0Var;
        this.c = xvf0Var;
        this.d = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        d dVar = (d) this.a.get();
        com.yandex.go.suggest.impl.data.flex.document.d dVar2 = (com.yandex.go.suggest.impl.data.flex.document.d) this.b.get();
        return dVar.a((Lifecycle) this.d.a, new SuperappSuggestViewModule$Companion$provideFindGoLoadDocumentActionDescriptor$1((com.yandex.go.suggest.impl.data.a) this.c.get(), dVar2, null));
    }
}
