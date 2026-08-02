package com.ybsdk.screens.registration.applicationstatus.presentation;

import defpackage.eqi0;
import defpackage.gqi0;
import defpackage.h791;
import defpackage.lao;
import defpackage.np41;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zpi0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class RegistrationApplicationStatusFragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public RegistrationApplicationStatusFragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, c.class, "onErrorSecondaryButtonClick", "onErrorSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        lao laoVar;
        c cVar = (c) this.receiver;
        np41 np41Var = cVar.G;
        gqi0 gqi0Var = (gqi0) cVar.X();
        if (gqi0Var instanceof zpi0) {
            List list = ((zpi0) gqi0Var).h;
            if (list != null && (laoVar = (lao) kotlin.collections.a.S(1, list)) != null) {
                String str = laoVar.b;
                h791.f(cVar.J, str, ((com.ybsdk.feature.webview.internal.a) np41Var).f(str));
            }
        } else if (gqi0Var instanceof eqi0) {
            cVar.E.h(((com.ybsdk.feature.webview.internal.a) np41Var).f(((eqi0) gqi0Var).a()));
        }
        return zy11.a;
    }
}
