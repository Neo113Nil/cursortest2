package com.ybsdk.feature.autotopup.internal.presentation.saver;

import defpackage.h791;
import defpackage.sv3;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class AutoTopupRegularFragment$getViewBinding$1$14 extends FunctionReferenceImpl implements tls {
    public AutoTopupRegularFragment$getViewBinding$1$14(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onLegalLinkClick", "onLegalLinkClick(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        sv3 sv3Var = (sv3) ((a) this.receiver).J;
        h791.f(sv3Var.b, str, ((com.ybsdk.feature.webview.internal.a) sv3Var.c).f(str));
        return zy11.a;
    }
}
