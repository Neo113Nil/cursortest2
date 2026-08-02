package com.ybsdk.feature.kyc.internal.screens.photov2;

import defpackage.ds31;
import defpackage.eox;
import defpackage.gox;
import defpackage.sls;
import defpackage.tje;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class KycPhotoV2Fragment$getViewBinding$1$9 extends FunctionReferenceImpl implements sls {
    public KycPhotoV2Fragment$getViewBinding$1$9(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onStageErrorPrimaryButtonClick", "onStageErrorPrimaryButtonClick()V", 0);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m443invoke() {
        b bVar = (b) this.receiver;
        tje.N(ds31.a(bVar), null, null, new KycPhotoV2ViewModel$onStageErrorPrimaryButtonClick$1(bVar, ((eox) ((gox) bVar.X()).d).b, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m443invoke();
        return zy11.a;
    }
}
