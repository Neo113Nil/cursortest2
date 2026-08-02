package com.google.android.gms.wallet.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import defpackage.atx0;
import defpackage.ima1;
import defpackage.ukt;
import defpackage.wst;
import defpackage.xst;
import defpackage.y2c;

/* loaded from: classes.dex */
public final class a extends ukt {
    public final Context a0;
    public final int b0;
    public final String c0;
    public final int d0;
    public final boolean e0;
    public final String f0;

    public a(Context context, Looper looper, y2c y2cVar, wst wstVar, xst xstVar, int i, String str) {
        super(context, looper, 4, y2cVar, wstVar, xstVar);
        this.a0 = context;
        this.b0 = i;
        this.c0 = null;
        this.d0 = 1;
        this.e0 = true;
        this.f0 = str;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof IOwService ? (IOwService) queryLocalInterface : new zza(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Feature[] f() {
        return ima1.b;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean p() {
        return true;
    }

    public final void s(IsReadyToPayRequest isReadyToPayRequest, atx0 atx0Var) {
        zze zzeVar = new zze(atx0Var);
        try {
            ((IOwService) i()).isReadyToPay(isReadyToPayRequest, u(), zzeVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            zzeVar.onIsReadyToPayDetermined(Status.RESULT_INTERNAL_ERROR, false, Bundle.EMPTY);
        }
    }

    public final void t(PaymentDataRequest paymentDataRequest, atx0 atx0Var) {
        Bundle u = u();
        u.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        zzo zzoVar = new zzo(atx0Var);
        try {
            ((IOwService) i()).loadPaymentData(paymentDataRequest, u, zzoVar);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            zzoVar.onPaymentDataLoaded(Status.RESULT_INTERNAL_ERROR, null, Bundle.EMPTY);
        }
    }

    public final Bundle u() {
        String packageName = this.a0.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.b0);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.e0);
        bundle.putString("androidPackageName", packageName);
        String str = this.c0;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.d0);
        bundle.putString("com.google.android.gms.wallet.EXTRA_WALLET_CLIENT_ID", this.f0);
        return bundle;
    }
}
