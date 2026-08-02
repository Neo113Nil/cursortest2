package com.ybsdk.feature.kyc.internal.screens.photov3;

import defpackage.ajb0;
import defpackage.pz40;
import defpackage.sls;
import defpackage.tib0;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PhotoFragment$getViewBinding$1$7 extends FunctionReferenceImpl implements sls {
    public PhotoFragment$getViewBinding$1$7(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onErrorSecondaryButtonClick", "onErrorSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        b bVar = (b) this.receiver;
        if (((ajb0) bVar.X()).h instanceof tib0) {
            pz40 Y = bVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new ajb0(254)));
            bVar.c0();
        }
        return zy11.a;
    }
}
