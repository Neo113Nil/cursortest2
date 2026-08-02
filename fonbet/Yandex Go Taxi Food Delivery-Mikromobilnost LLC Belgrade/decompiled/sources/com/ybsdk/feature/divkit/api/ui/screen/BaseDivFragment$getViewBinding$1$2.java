package com.ybsdk.feature.divkit.api.ui.screen;

import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.a05;
import defpackage.p05;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class BaseDivFragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public BaseDivFragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, p05.class, "onErrorSecondaryButtonClick", "onErrorSecondaryButtonClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String supportUrl;
        p05 p05Var = (p05) this.receiver;
        Throwable error = ((a05) p05Var.X()).getError();
        FailDataException failDataException = error instanceof FailDataException ? (FailDataException) error : null;
        if (failDataException != null && (supportUrl = failDataException.getSupportUrl()) != null) {
            p05Var.e0(supportUrl);
        }
        return zy11.a;
    }
}
