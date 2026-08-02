package com.yandex.go.ui;

import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class UserPhotoUploadingPresenter$mapScreenContent$3 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m205invoke() {
        d dVar = (d) this.receiver;
        String str = dVar.O;
        if (str != null) {
            ((com.yandex.go.agreement.photoupload.a) dVar.I).c(str);
        }
        tje.N(dVar.Jg(), null, null, new UserPhotoUploadingPresenter$requestCameraPhoto$1(dVar, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m205invoke();
        return zy11.a;
    }
}
