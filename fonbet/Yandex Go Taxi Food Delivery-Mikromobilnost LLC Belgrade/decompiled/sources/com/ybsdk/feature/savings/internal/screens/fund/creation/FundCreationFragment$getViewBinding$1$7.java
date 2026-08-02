package com.ybsdk.feature.savings.internal.screens.fund.creation;

import android.net.Uri;
import defpackage.tls;
import defpackage.uc5;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FundCreationFragment$getViewBinding$1$7 extends FunctionReferenceImpl implements tls {
    public FundCreationFragment$getViewBinding$1$7(uc5 uc5Var) {
        super(1, uc5Var, a.class, "resolveDivAction", "resolveDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((a) this.receiver).D.b(((Uri) obj).toString()));
    }
}
