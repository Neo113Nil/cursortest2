package com.ybsdk.feature.kyc.internal.screens.photo;

import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class KycPhotoFragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public KycPhotoFragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onBackPress", "onBackPress()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        bVar.I.F.a.a("kyc_online.photo.click.close", null);
        bVar.C.e();
        return zy11.a;
    }
}
