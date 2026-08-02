package com.ybsdk.feature.autotopup.internal.presentation.setup.v1;

import defpackage.ds31;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ b a;

    public /* synthetic */ a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = this.a;
        pzt0 pzt0Var = bVar.R;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.R = tje.N(ds31.a(bVar), null, null, new AutoTopupSetupViewModel$5$1(bVar, null), 3);
        return zy11.a;
    }
}
