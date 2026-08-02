package com.yandex.go.information.domain;

import defpackage.bvf0;
import defpackage.mth;
import defpackage.nw8;
import defpackage.s4;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vuv;
import defpackage.w4l0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class h {
    public final tt2 a;
    public final s4 b;
    public final j c;
    public final nw8 d;
    public final w4l0 e;
    public final r0 f = bvf0.c(Boolean.FALSE);

    public h(tt2 tt2Var, s4 s4Var, j jVar, nw8 nw8Var, w4l0 w4l0Var) {
        this.a = tt2Var;
        this.b = s4Var;
        this.c = jVar;
        this.d = nw8Var;
        this.e = w4l0Var;
    }

    public final tpr a(vuv vuvVar) {
        e eVar = new e(this.b.a(), this.d);
        this.a.getClass();
        sjh sjhVar = uyj.a;
        tpr n = kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.F(eVar, sjhVar), kotlinx.coroutines.flow.e.X(new g(this.e.f()), new InformationUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(null, this.c)), this.f, new InformationUiStateInteractor$uiStateFlow$1(4, this, h.class, "mapState", "mapState(Lcom/yandex/go/information/presentation/models/AboutUiState;Lcom/yandex/go/information/domain/ServiceInfoRepository$Status;Z)Lcom/yandex/go/information/presentation/models/InformationUiState;", 4));
        if (vuvVar != null && !vuvVar.a) {
            n = com.yandex.go.coroutines.b.d(new mth(n, 4), new InformationUiStateInteractor$uiStateFlow$lambda$1$$inlined$start$1(vuvVar, null));
        }
        return kotlinx.coroutines.flow.e.F(n, sjhVar);
    }
}
