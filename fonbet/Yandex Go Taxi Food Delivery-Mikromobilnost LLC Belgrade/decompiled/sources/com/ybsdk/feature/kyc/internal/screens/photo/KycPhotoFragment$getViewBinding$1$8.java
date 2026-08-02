package com.ybsdk.feature.kyc.internal.screens.photo;

import defpackage.onx;
import defpackage.pz40;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class KycPhotoFragment$getViewBinding$1$8 extends FunctionReferenceImpl implements sls {
    public KycPhotoFragment$getViewBinding$1$8(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onPreviewSecondaryButtonClick", "onPreviewSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        b bVar = (b) this.receiver;
        bVar.I.F.a.a("kyc_online.photo.click.retake", null);
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, onx.a((onx) value, null, null, null, null, false, 0, false, 251)));
        return zy11.a;
    }
}
