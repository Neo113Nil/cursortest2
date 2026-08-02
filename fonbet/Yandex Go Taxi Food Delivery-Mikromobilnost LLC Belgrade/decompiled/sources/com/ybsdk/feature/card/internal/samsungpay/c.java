package com.ybsdk.feature.card.internal.samsungpay;

import android.os.Bundle;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import defpackage.kol0;
import defpackage.r8u0;

/* loaded from: classes3.dex */
public final class c implements r8u0 {
    public final /* synthetic */ kol0 a;
    public final /* synthetic */ d b;

    public c(kol0 kol0Var, d dVar) {
        this.a = kol0Var;
        this.b = dVar;
    }

    @Override // defpackage.r8u0
    public final void onFail(int i, Bundle bundle) {
        d.b(this.b, "Failed getting SamsungPay status", Integer.valueOf(i), bundle, null, null, 24);
        this.a.resumeWith(SamsungPayState.InitializationResult.NOT_SUPPORTED);
    }

    @Override // defpackage.r8u0
    public final void onSuccess(int i, Bundle bundle) {
        SamsungPayState.InitializationResult initializationResult;
        if (i == 0) {
            initializationResult = SamsungPayState.InitializationResult.NOT_SUPPORTED;
        } else if (i != 1) {
            initializationResult = i != 2 ? SamsungPayState.InitializationResult.NOT_SUPPORTED : SamsungPayState.InitializationResult.READY;
        } else {
            Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("errorReason")) : null;
            initializationResult = (valueOf != null && valueOf.intValue() == -356) ? SamsungPayState.InitializationResult.NEED_ACTIVATION : (valueOf != null && valueOf.intValue() == -357) ? SamsungPayState.InitializationResult.NEED_UPDATE : SamsungPayState.InitializationResult.NOT_SUPPORTED;
        }
        this.a.resumeWith(initializationResult);
    }
}
