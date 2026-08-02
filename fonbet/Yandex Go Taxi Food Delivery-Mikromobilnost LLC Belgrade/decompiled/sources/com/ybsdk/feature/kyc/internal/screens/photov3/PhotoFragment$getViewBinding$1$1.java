package com.ybsdk.feature.kyc.internal.screens.photov3;

import defpackage.ajb0;
import defpackage.g8e;
import defpackage.sls;
import defpackage.sr7;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PhotoFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements sls {
    public PhotoFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onInfoClick", "onInfoClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String str;
        b bVar = (b) this.receiver;
        sr7 sr7Var = ((ajb0) bVar.X()).c;
        if (sr7Var != null && (str = sr7Var.a.a) != null) {
            bVar.H.j.a.a("camera_flow.photo.help.click", g8e.w(1, "document_type", str));
        }
        sr7 sr7Var2 = ((ajb0) bVar.X()).c;
        bVar.G.a(sr7Var2 != null ? sr7Var2.f : null);
        return zy11.a;
    }
}
