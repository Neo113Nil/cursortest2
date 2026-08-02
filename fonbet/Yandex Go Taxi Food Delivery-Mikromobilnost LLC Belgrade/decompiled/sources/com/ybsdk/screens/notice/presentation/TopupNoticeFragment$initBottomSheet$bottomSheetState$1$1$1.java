package com.ybsdk.screens.notice.presentation;

import android.net.Uri;
import defpackage.h791;
import defpackage.tls;
import defpackage.uc5;
import defpackage.v0h;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TopupNoticeFragment$initBottomSheet$bottomSheetState$1$1$1 extends FunctionReferenceImpl implements tls {
    public TopupNoticeFragment$initBottomSheet$bottomSheetState$1$1$1(uc5 uc5Var) {
        super(1, uc5Var, c.class, "onDivAction", "onDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(h791.e(((c) this.receiver).E, ((Uri) obj).toString(), false, null, 14) instanceof v0h);
    }
}
