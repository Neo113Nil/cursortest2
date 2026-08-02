package com.ybsdk.feature.qr.internal.screens.container;

import android.net.Uri;
import defpackage.h791;
import defpackage.tls;
import defpackage.uc5;
import defpackage.x0h;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class QrContainerFragment$getViewBinding$1$4 extends FunctionReferenceImpl implements tls {
    public QrContainerFragment$getViewBinding$1$4(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onDivAction", "onDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(!(h791.d(((a) this.receiver).B, (Uri) obj, 14) instanceof x0h));
    }
}
