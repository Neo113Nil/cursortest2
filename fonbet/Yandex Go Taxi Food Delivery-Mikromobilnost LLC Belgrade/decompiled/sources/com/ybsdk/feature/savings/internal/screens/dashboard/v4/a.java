package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                ((SavingsDashboardFragmentV4$contentRecyclerHelper$2$2) bVar.c).invoke(Boolean.FALSE);
                break;
            default:
                ((SavingsDashboardFragmentV4$contentRecyclerHelper$2$2) bVar.c).invoke(Boolean.TRUE);
                break;
        }
        return zy11Var;
    }
}
