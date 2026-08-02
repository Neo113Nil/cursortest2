package com.yandex.go.ui;

import defpackage.d7;
import defpackage.fse;
import defpackage.gr21;
import defpackage.hst;
import defpackage.jst;
import defpackage.lse;
import defpackage.mse;
import defpackage.qr21;
import defpackage.xby;

/* loaded from: classes14.dex */
public final class b extends d7 implements mse {
    public final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(lse.a);
        this.a = dVar;
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        d dVar = this.a;
        ((gr21) dVar.Dg()).G7(new qr21(new UserPhotoUploadingPresenter$createExceptionHandler$1$1(0, dVar, d.class, "onRetryButtonClicked", "onRetryButtonClicked()V", 0)));
        dVar.G.f();
        hst hstVar = jst.e;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        xby.l(hstVar, "USER_PHOTO_UPLOAD:USER_PHOTO_UPLOADING_PRESENTER", null, th, message, 2);
    }
}
