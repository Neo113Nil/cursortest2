package com.ybsdk.feature.resolver.internal.screens.empty;

import defpackage.pz40;
import defpackage.sls;
import defpackage.uc5;
import defpackage.wvn;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class EmptyLinkResolverFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements sls {
    public EmptyLinkResolverFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onErrorPrimaryButtonClick", "onErrorPrimaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        a aVar = (a) this.receiver;
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new wvn(null)));
        aVar.b0();
        return zy11.a;
    }
}
