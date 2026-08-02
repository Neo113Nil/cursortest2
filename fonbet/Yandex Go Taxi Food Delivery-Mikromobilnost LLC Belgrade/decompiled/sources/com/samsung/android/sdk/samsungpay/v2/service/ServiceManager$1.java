package com.samsung.android.sdk.samsungpay.v2.service;

import android.content.ComponentName;
import android.os.Bundle;
import com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback;
import defpackage.jn21;
import defpackage.ln21;

/* loaded from: classes11.dex */
class ServiceManager$1 extends ISUserInfoCallback.Stub {
    final /* synthetic */ e this$0;
    final /* synthetic */ ln21 val$listener;

    public ServiceManager$1(e eVar, ln21 ln21Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGetUserInfoInitiated$0(ComponentName componentName, Bundle bundle, ln21 ln21Var) {
        e.k(null, componentName, bundle, ln21Var);
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback.Stub, com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback
    public void onGetUserInfoInitiated(final Bundle bundle) {
        final ComponentName componentName = new ComponentName(bundle.getString("packageName"), bundle.getString("className"));
        e.g(null, new Runnable() { // from class: com.samsung.android.sdk.samsungpay.v2.service.a
            @Override // java.lang.Runnable
            public final void run() {
                ServiceManager$1.this.lambda$onGetUserInfoInitiated$0(componentName, bundle, null);
            }
        });
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback.Stub, com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback
    public void onReceived(int i, Bundle bundle) {
        if (i == 0) {
            final jn21 jn21Var = new jn21(bundle);
            e.h(null, new Runnable() { // from class: com.samsung.android.sdk.samsungpay.v2.service.b
                @Override // java.lang.Runnable
                public final void run() {
                    ((ln21) null).a(jn21.this);
                }
            });
        } else {
            e.i(null, new c(i, 0, bundle));
        }
        e.j(null).I();
    }
}
