package com.ybsdk.feature.kyc.internal.screens.photov3;

import defpackage.ajb0;
import defpackage.g8e;
import defpackage.qq7;
import defpackage.sls;
import defpackage.sr7;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PhotoFragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public PhotoFragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onBackPress", "onBackPress()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        sr7 sr7Var = ((ajb0) bVar.X()).c;
        if (sr7Var != null) {
            qq7 qq7Var = bVar.H.j;
            qq7Var.a.a("camera_flow.photo.exit.click", g8e.w(1, "document_type", sr7Var.a.a));
            bVar.G.a(sr7Var.g);
        } else {
            bVar.C.e();
        }
        return zy11.a;
    }
}
