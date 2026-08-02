package com.ybsdk.feature.pfm.internal.ui;

import android.net.Uri;
import defpackage.tls;
import defpackage.uc5;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PfmFragment$onViewCreated$1$22 extends FunctionReferenceImpl implements tls {
    public PfmFragment$onViewCreated$1$22(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onDivAction", "onDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((b) this.receiver).m0((Uri) obj));
    }
}
