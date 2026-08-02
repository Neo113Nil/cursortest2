package com.ybsdk.feature.kyc.internal.screens.photov2;

import defpackage.aox;
import defpackage.gox;
import defpackage.sls;
import defpackage.uc5;
import defpackage.w511;
import defpackage.ynx;
import defpackage.znx;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class KycPhotoV2Fragment$getViewBinding$1$6 extends FunctionReferenceImpl implements sls {
    public KycPhotoV2Fragment$getViewBinding$1$6(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onErrorPrimaryButtonClick", "onErrorPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        aox aoxVar = ((gox) bVar.X()).g;
        if (aoxVar instanceof znx) {
            bVar.C.e();
        } else if (aoxVar instanceof ynx) {
            bVar.e0();
        } else if (aoxVar != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
