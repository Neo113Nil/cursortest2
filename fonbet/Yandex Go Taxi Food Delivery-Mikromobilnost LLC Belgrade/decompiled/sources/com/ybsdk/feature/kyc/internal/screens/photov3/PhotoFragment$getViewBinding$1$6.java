package com.ybsdk.feature.kyc.internal.screens.photov3;

import defpackage.ajb0;
import defpackage.rib0;
import defpackage.sib0;
import defpackage.sls;
import defpackage.tfl0;
import defpackage.tib0;
import defpackage.uc5;
import defpackage.uib0;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PhotoFragment$getViewBinding$1$6 extends FunctionReferenceImpl implements sls {
    public PhotoFragment$getViewBinding$1$6(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onErrorPrimaryButtonClick", "onErrorPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        tfl0 tfl0Var = bVar.C;
        uib0 uib0Var = ((ajb0) bVar.X()).h;
        if (uib0Var instanceof sib0) {
            tfl0Var.e();
        } else if (uib0Var instanceof rib0) {
            bVar.c0();
        } else if (uib0Var instanceof tib0) {
            tfl0Var.e();
        } else if (uib0Var != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
