package com.samsung.android.sdk.samsungpay.v2.service;

import android.os.Bundle;
import defpackage.dt21;
import defpackage.ln21;

/* loaded from: classes11.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ c(int i, int i2, Bundle bundle) {
        this.a = i2;
        this.b = i;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ln21) null).onFail(this.b, this.c);
                break;
            default:
                ((dt21) null).onFail(this.b, this.c);
                break;
        }
    }
}
