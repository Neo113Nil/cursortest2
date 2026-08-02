package com.ybsdk.feature.transfer.version2.internal.screens.fund;

import android.net.Uri;
import defpackage.dj01;
import defpackage.nu01;
import defpackage.tls;
import defpackage.uc5;
import defpackage.v0h;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FundDocsNoticeFragment$renderContent$1$1$1 extends FunctionReferenceImpl implements tls {
    public FundDocsNoticeFragment$renderContent$1$1$1(uc5 uc5Var) {
        super(1, uc5Var, a.class, "resolve", "resolve(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        dj01 dj01Var = ((a) this.receiver).D;
        return Boolean.valueOf(((nu01) dj01Var).a.c(((Uri) obj).toString()).a instanceof v0h);
    }
}
