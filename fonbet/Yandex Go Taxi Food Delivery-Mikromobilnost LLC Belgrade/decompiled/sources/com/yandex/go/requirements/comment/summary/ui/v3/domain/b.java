package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import defpackage.g92;
import defpackage.gci0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zmc;
import defpackage.zuj0;

/* loaded from: classes13.dex */
public final class b {
    public final zuj0 a;
    public final com.yandex.go.requirements.comment.summary.ui.v3.data.c b;
    public final com.yandex.go.requirements.comment.summary.ui.v3.data.h c;
    public final zmc d;

    static {
        int i = zmc.h;
        int i2 = com.yandex.go.requirements.comment.summary.ui.v3.data.c.e;
    }

    public b(zuj0 zuj0Var, tt2 tt2Var, com.yandex.go.requirements.comment.summary.ui.v3.data.c cVar, com.yandex.go.requirements.comment.summary.ui.v3.data.h hVar, zmc zmcVar) {
        this.a = zuj0Var;
        this.b = cVar;
        this.c = hVar;
        this.d = zmcVar;
    }

    public final tpr a() {
        tpr X;
        gci0 gci0Var = this.b.d;
        com.yandex.go.requirements.comment.summary.ui.v3.data.e eVar = new com.yandex.go.requirements.comment.summary.ui.v3.data.e(this.c.a);
        zmc zmcVar = this.d;
        if (zmcVar.g == CommentViewSource.INTERCITY_DASHBOARD) {
            X = new g92(2, zmc.a());
        } else {
            X = kotlinx.coroutines.flow.e.X(ru.yandex.taxi.experiments.d.a(zmcVar.f), new CommentValidationStateInteractor$getCommentValidationStateFlow$$inlined$flatMapLatest$1(zmcVar, null));
        }
        return kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(gci0Var, eVar, X, new AIRequirementsCommentUiStateInteractor$uiStateFlow$1(this, null))), uyj.a);
    }
}
