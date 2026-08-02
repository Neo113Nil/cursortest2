package com.ybsdk.feature.transactions.impl.ui.screens.feed;

import android.net.Uri;
import defpackage.tls;
import defpackage.uc5;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransactionsFeedFragment$onViewCreated$1$5 extends FunctionReferenceImpl implements tls {
    public TransactionsFeedFragment$onViewCreated$1$5(uc5 uc5Var) {
        super(1, uc5Var, c.class, "onDivAction", "onDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((c) this.receiver).f0((Uri) obj));
    }
}
