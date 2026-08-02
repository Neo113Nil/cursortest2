package com.yandex.mobile.drive.scan.ui;

import com.yandex.mobile.drive.scan.service.f;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ScanPresenter$processPictureAndVideo$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        f fVar = (f) this.receiver;
        int i = fVar.c;
        if (i != 0) {
            fVar.c = i - 1;
            fVar.a.b(fVar.a().getMode());
        }
        return zy11.a;
    }
}
