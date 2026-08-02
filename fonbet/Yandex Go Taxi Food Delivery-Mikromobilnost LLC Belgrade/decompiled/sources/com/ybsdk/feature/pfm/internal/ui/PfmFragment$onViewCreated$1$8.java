package com.ybsdk.feature.pfm.internal.ui;

import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.h791;
import defpackage.j3h;
import defpackage.np41;
import defpackage.oy80;
import defpackage.s8j0;
import defpackage.sls;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.wcb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PfmFragment$onViewCreated$1$8 extends FunctionReferenceImpl implements sls {
    public PfmFragment$onViewCreated$1$8(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onErrorSecondaryButtonClick", "onErrorSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String supportUrl;
        b bVar = (b) this.receiver;
        u8j0 u8j0Var = ((wcb0) bVar.X()).b;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Object obj = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = obj instanceof FailDataException ? (FailDataException) obj : null;
        if (failDataException != null && (supportUrl = failDataException.getSupportUrl()) != null) {
            oy80 oy80Var = bVar.G;
            h791.f((j3h) oy80Var.b, supportUrl, ((com.ybsdk.feature.webview.internal.a) ((np41) oy80Var.c)).f(supportUrl));
        }
        return zy11.a;
    }
}
