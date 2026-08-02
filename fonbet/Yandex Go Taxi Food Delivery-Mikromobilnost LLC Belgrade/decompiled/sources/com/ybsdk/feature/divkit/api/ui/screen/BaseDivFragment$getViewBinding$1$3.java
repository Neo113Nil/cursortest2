package com.ybsdk.feature.divkit.api.ui.screen;

import android.net.Uri;
import defpackage.p05;
import defpackage.tls;
import defpackage.uc5;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class BaseDivFragment$getViewBinding$1$3 extends FunctionReferenceImpl implements tls {
    public BaseDivFragment$getViewBinding$1$3(uc5 uc5Var) {
        super(1, uc5Var, p05.class, "onDivAction", "onDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((p05) this.receiver).c0((Uri) obj));
    }
}
