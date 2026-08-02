package com.ybsdk.feature.resolver.internal.screens.empty;

import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.c9v;
import defpackage.h791;
import defpackage.j3h;
import defpackage.np41;
import defpackage.sls;
import defpackage.uc5;
import defpackage.wvn;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class EmptyLinkResolverFragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public EmptyLinkResolverFragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onErrorSecondaryButtonClick", "onErrorSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        c9v c9vVar = aVar.E;
        Throwable th = ((wvn) aVar.X()).a;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        String supportUrl = failDataException != null ? failDataException.getSupportUrl() : null;
        if (supportUrl != null) {
            h791.f((j3h) c9vVar.b, supportUrl, ((com.ybsdk.feature.webview.internal.a) ((np41) c9vVar.c)).f(supportUrl));
        } else {
            c9vVar.getClass();
        }
        return zy11.a;
    }
}
