package com.yandex.go.domain.interactor;

import defpackage.fr21;
import defpackage.jy60;
import defpackage.oep0;
import defpackage.tje;
import defpackage.tse;
import defpackage.yvf0;

/* loaded from: classes.dex */
public final class e implements jy60 {
    public final tse a;
    public final yvf0 b;
    public final oep0 c;
    public final fr21 d;

    public e(tse tseVar, yvf0 yvf0Var, oep0 oep0Var, fr21 fr21Var) {
        this.a = tseVar;
        this.b = yvf0Var;
        this.c = oep0Var;
        this.d = fr21Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "UserPhotoUploadingRestoringInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new UserPhotoUploadingRestoringInteractor$onFirstContentfulPaint$1(this, null), 3);
    }
}
