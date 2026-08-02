package com.yandex.go.pickup_from_photo.domain;

import defpackage.epb0;
import defpackage.jqr;
import defpackage.tpr;
import defpackage.umb0;
import defpackage.yt11;
import defpackage.zuj0;

/* loaded from: classes13.dex */
public final class s implements yt11 {
    public final epb0 a;
    public final com.yandex.go.pickup_from_photo.experiment.p b;
    public final zuj0 c;
    public final umb0 d;

    public s(epb0 epb0Var, com.yandex.go.pickup_from_photo.experiment.p pVar, zuj0 zuj0Var, umb0 umb0Var) {
        this.a = epb0Var;
        this.b = pVar;
        this.c = zuj0Var;
        this.d = umb0Var;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return new jqr(new r(new p(this.a.a), this), new RecognitionSuccessUiStateInteractor$uiStateFlow$2(this, null), 3);
    }
}
