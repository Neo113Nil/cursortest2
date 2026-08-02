package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation;

import android.os.Bundle;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersSelectionResult;
import defpackage.bgc;
import defpackage.jl40;
import defpackage.sls;
import defpackage.uj01;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final class b implements wls {
    public final wls a;
    public final sls b;

    public /* synthetic */ b(uj01 uj01Var) {
        this(uj01Var, new bgc(12));
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MobileProvidersSelectionResult.Companion.getClass();
        MobileProvidersSelectionResult mobileProvidersSelectionResult = (MobileProvidersSelectionResult) ((Bundle) obj2).getParcelable("MobileProvidersSelectionResult");
        if (jl40.l(mobileProvidersSelectionResult, MobileProvidersSelectionResult.Close.INSTANCE)) {
            this.b.invoke();
        } else if (mobileProvidersSelectionResult instanceof MobileProvidersSelectionResult.Success) {
            MobileProvidersSelectionResult.Success success = (MobileProvidersSelectionResult.Success) mobileProvidersSelectionResult;
            this.a.invoke(success.getProvider(), success.getPhone());
        } else if (mobileProvidersSelectionResult != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    public b(wls wlsVar, sls slsVar) {
        this.a = wlsVar;
        this.b = slsVar;
    }
}
