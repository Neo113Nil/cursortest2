package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import defpackage.nkv;

/* loaded from: classes10.dex */
final class zzav extends ResultReceiver {
    final /* synthetic */ nkv zza;

    public zzav(a aVar, Handler handler, nkv nkvVar) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        int i2 = com.google.android.gms.internal.play_billing.g.a;
        if (bundle != null) {
            bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
            bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        }
        throw null;
    }
}
