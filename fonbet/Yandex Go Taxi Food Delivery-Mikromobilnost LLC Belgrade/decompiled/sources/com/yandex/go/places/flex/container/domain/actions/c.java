package com.yandex.go.places.flex.container.domain.actions;

import defpackage.dw;
import defpackage.kr;
import defpackage.n6u;
import defpackage.tje;
import defpackage.tse;
import defpackage.wgr;

/* loaded from: classes13.dex */
public final class c implements dw {
    public final wgr a;
    public final tse b;

    public c(tse tseVar, wgr wgrVar) {
        this.a = wgrVar;
        this.b = tseVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        tje.N(this.b, null, null, new PerformOnParentDocumentActionHandler$handle$1(this, (PerformOnParentDocumentAction) krVar, null), 3);
    }
}
