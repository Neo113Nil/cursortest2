package com.ybsdk.feature.split.deposit.internal.ui.payment.status;

import android.net.Uri;
import defpackage.tls;
import defpackage.uc5;
import defpackage.v0h;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SplitDepositPaymentStatusFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements tls {
    public SplitDepositPaymentStatusFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(1, uc5Var, c.class, "onDivAction", "onDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((c) this.receiver).C.c(((Uri) obj).toString()).a instanceof v0h);
    }
}
