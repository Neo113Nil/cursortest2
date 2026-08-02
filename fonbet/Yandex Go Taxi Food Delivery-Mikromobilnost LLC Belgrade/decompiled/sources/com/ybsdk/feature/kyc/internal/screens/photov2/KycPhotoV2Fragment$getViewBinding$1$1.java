package com.ybsdk.feature.kyc.internal.screens.photov2;

import defpackage.enx;
import defpackage.g8e;
import defpackage.gox;
import defpackage.iox;
import defpackage.lrp0;
import defpackage.sls;
import defpackage.tnx;
import defpackage.uc5;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class KycPhotoV2Fragment$getViewBinding$1$1 extends FunctionReferenceImpl implements sls {
    public KycPhotoV2Fragment$getViewBinding$1$1(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onInfoClick", "onInfoClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        bVar.H.F.a.a("kyc_online_2.photo.help.click", g8e.w(1, "page_index", b.m0(((gox) bVar.X()).c)));
        tnx tnxVar = ((gox) bVar.X()).c;
        enx a = tnxVar != null ? bVar.I.a(tnxVar) : null;
        if (a == null) {
            x4c.g("[KYC_Online] Can't show info in KYC online", null, "photo: " + tnxVar, Collections.singletonList(lrp0.o), 2);
        } else {
            bVar.Z(new iox(a));
        }
        return zy11.a;
    }
}
