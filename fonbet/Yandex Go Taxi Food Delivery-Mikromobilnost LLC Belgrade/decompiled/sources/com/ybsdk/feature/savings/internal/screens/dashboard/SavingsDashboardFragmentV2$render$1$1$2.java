package com.ybsdk.feature.savings.internal.screens.dashboard;

import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsDashboardFragmentV2$render$1$1$2 extends FunctionReferenceImpl implements wls {
    public SavingsDashboardFragmentV2$render$1$1$2(SavingsDashboardFragmentV2 savingsDashboardFragmentV2) {
        super(2, savingsDashboardFragmentV2, SavingsDashboardFragmentV2.class, "changeCellPosition", "changeCellPosition(II)V", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((SavingsDashboardFragmentV2) this.receiver).changeCellPosition(((Number) obj).intValue(), ((Number) obj2).intValue());
        return zy11.a;
    }
}
