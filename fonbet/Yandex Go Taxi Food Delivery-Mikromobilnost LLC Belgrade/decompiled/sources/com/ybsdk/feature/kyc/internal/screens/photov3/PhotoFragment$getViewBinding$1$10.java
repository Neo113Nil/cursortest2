package com.ybsdk.feature.kyc.internal.screens.photov3;

import defpackage.ajb0;
import defpackage.ds31;
import defpackage.sls;
import defpackage.tje;
import defpackage.uc5;
import defpackage.yib0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PhotoFragment$getViewBinding$1$10 extends FunctionReferenceImpl implements sls {
    public PhotoFragment$getViewBinding$1$10(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onStageErrorPrimaryButtonClick", "onStageErrorPrimaryButtonClick()V", 0);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m444invoke() {
        b bVar = (b) this.receiver;
        tje.N(ds31.a(bVar), null, null, new PhotoViewModel$onStageErrorPrimaryButtonClick$1(bVar, ((yib0) ((ajb0) bVar.X()).d).b, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m444invoke();
        return zy11.a;
    }
}
