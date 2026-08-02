package com.ybsdk.screens.spoilerOnboarding;

import defpackage.cwt0;
import defpackage.g8e;
import defpackage.h791;
import defpackage.rt1;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class SpoilerOnboardingFragment$render$1$1 extends FunctionReferenceImpl implements tls {
    public SpoilerOnboardingFragment$render$1$1(uc5 uc5Var) {
        super(1, uc5Var, cwt0.class, "onLinkClick", "onLinkClick(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        cwt0 cwt0Var = (cwt0) this.receiver;
        rt1 rt1Var = cwt0Var.B.C;
        rt1Var.a.a("hiding_balances.fullscreen.hyperlink.click", g8e.w(1, "hyperlink", str));
        h791.e(cwt0Var.E, str, false, null, 14);
        return zy11.a;
    }
}
