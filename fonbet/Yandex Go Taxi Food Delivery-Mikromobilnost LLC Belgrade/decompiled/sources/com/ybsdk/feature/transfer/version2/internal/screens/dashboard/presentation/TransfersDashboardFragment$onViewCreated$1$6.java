package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation;

import android.net.Uri;
import defpackage.tls;
import defpackage.uc5;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransfersDashboardFragment$onViewCreated$1$6 extends AdaptedFunctionReference implements tls {
    public TransfersDashboardFragment$onViewCreated$1$6(uc5 uc5Var) {
        super(1, uc5Var, a.class, "handleAction", "handleAction(Landroid/net/Uri;Lcom/ybsdk/core/utils/text/Text;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((a) this.receiver).c0((Uri) obj, null));
    }
}
