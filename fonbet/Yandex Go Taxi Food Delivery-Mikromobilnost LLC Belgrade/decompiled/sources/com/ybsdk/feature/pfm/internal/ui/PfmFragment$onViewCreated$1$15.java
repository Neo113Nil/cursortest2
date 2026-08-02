package com.ybsdk.feature.pfm.internal.ui;

import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.bab0;
import defpackage.sls;
import defpackage.uc5;
import defpackage.wlp;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class PfmFragment$onViewCreated$1$15 extends FunctionReferenceImpl implements sls {
    public PfmFragment$onViewCreated$1$15(uc5 uc5Var) {
        super(0, uc5Var, b.class, "isCategoriesSizeAnimationEnabled", "isCategoriesSizeAnimationEnabled()Z", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return Boolean.valueOf(((CommonFeatureFlag) ((bab0) ((b) this.receiver).B).a.d(wlp.h).getData()).isEnabled());
    }
}
