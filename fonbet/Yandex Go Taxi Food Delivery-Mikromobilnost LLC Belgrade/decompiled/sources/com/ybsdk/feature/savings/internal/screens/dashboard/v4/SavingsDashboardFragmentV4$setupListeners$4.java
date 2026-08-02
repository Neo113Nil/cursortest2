package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import android.net.Uri;
import defpackage.tls;
import defpackage.uc5;
import defpackage.vcm0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsDashboardFragmentV4$setupListeners$4 extends FunctionReferenceImpl implements tls {
    public SavingsDashboardFragmentV4$setupListeners$4(uc5 uc5Var) {
        super(1, uc5Var, c.class, "onDivClick", "onDivClick(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((vcm0) ((c) this.receiver).E).a(((Uri) obj).toString()));
    }
}
