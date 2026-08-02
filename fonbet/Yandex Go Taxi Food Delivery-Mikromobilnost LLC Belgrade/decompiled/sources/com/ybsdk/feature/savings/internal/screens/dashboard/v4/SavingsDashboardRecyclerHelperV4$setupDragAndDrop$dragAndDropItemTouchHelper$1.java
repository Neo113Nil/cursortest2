package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import defpackage.ftr0;
import defpackage.j0v;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SavingsDashboardRecyclerHelperV4$setupDragAndDrop$dragAndDropItemTouchHelper$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        c cVar = (c) ((ftr0) this.receiver);
        cVar.getClass();
        if (intValue != intValue2) {
            cVar.a0(new j0v(cVar, intValue, intValue2, 2));
        }
        return zy11.a;
    }
}
