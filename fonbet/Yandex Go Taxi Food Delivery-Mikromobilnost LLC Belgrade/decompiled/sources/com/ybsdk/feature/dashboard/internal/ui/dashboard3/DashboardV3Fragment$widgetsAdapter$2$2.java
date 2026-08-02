package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import android.net.Uri;
import defpackage.tls;
import defpackage.uc5;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class DashboardV3Fragment$widgetsAdapter$2$2 extends FunctionReferenceImpl implements tls {
    public DashboardV3Fragment$widgetsAdapter$2$2(uc5 uc5Var) {
        super(1, uc5Var, d.class, "onDivAction", "onDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((d) this.receiver).k0((Uri) obj));
    }
}
