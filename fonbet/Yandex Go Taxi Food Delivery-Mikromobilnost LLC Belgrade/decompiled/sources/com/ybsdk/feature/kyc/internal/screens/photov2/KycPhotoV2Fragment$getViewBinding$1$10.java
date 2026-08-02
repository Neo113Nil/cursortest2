package com.ybsdk.feature.kyc.internal.screens.photov2;

import defpackage.cox;
import defpackage.gox;
import defpackage.pz40;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class KycPhotoV2Fragment$getViewBinding$1$10 extends FunctionReferenceImpl implements sls {
    public KycPhotoV2Fragment$getViewBinding$1$10(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onStageErrorSecondaryButtonClick", "onStageErrorSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        pz40 Y = ((b) this.receiver).Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, gox.a((gox) value, false, null, cox.a, null, false, null, 119)));
        return zy11.a;
    }
}
