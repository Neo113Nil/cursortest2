package com.samsung.android.sdk.samsungpay.v2.service;

import android.os.Bundle;
import com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback;
import defpackage.dt21;

/* loaded from: classes11.dex */
class ServiceManager$2 extends ISUserInfoCallback.Stub {
    final /* synthetic */ e this$0;
    final /* synthetic */ dt21 val$listener;

    public ServiceManager$2(e eVar, dt21 dt21Var) {
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback.Stub, com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback
    public void onGetUserInfoInitiated(Bundle bundle) {
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback.Stub, com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback
    public void onReceived(int i, Bundle bundle) {
        if (i == 0) {
            e.l(null, new d());
        } else {
            e.m(null, new c(i, 1, bundle));
        }
        e.j(null).I();
    }
}
