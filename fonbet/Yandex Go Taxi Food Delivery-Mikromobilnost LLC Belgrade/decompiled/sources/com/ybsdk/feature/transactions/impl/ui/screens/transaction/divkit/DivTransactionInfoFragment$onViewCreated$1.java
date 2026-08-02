package com.ybsdk.feature.transactions.impl.ui.screens.transaction.divkit;

import android.net.Uri;
import defpackage.h791;
import defpackage.j3h;
import defpackage.tls;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.yvf0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class DivTransactionInfoFragment$onViewCreated$1 extends FunctionReferenceImpl implements tls {
    public DivTransactionInfoFragment$onViewCreated$1(uc5 uc5Var) {
        super(1, uc5Var, a.class, "resolveDeeplink", "resolveDeeplink(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(h791.d((j3h) ((yvf0) ((a) this.receiver).C.a).get(), (Uri) obj, 14) instanceof v0h);
    }
}
