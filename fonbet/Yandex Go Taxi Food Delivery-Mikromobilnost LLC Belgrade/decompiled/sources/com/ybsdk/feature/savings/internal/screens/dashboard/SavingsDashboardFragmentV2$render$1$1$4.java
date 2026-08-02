package com.ybsdk.feature.savings.internal.screens.dashboard;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsDashboardFragmentV2$render$1$1$4 extends FunctionReferenceImpl implements tls {
    public SavingsDashboardFragmentV2$render$1$1$4(SavingsDashboardFragmentV2 savingsDashboardFragmentV2) {
        super(1, savingsDashboardFragmentV2, SavingsDashboardFragmentV2.class, "onChangeCellPositionInitiated", "onChangeCellPositionInitiated(I)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((SavingsDashboardFragmentV2) this.receiver).onChangeCellPositionInitiated(((Number) obj).intValue());
        return zy11.a;
    }
}
