package com.yandex.messaging.internal.calls;

import android.content.Context;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import defpackage.k69;
import defpackage.tf4;
import defpackage.x6f0;
import defpackage.xi3;
import defpackage.y6f0;
import defpackage.ydz;
import defpackage.z83;

/* loaded from: classes15.dex */
public final class a {
    public final Looper a;
    public final TelephonyManager b;

    public a(Context context, Looper looper) {
        z83.g(null, looper, Looper.myLooper());
        this.a = looper;
        this.b = (TelephonyManager) context.getSystemService("phone");
    }

    public final xi3 a(final tf4 tf4Var) {
        y6f0 y6f0Var = tf4Var.b;
        z83.g(null, this.a, Looper.myLooper());
        PhoneStateListener phoneStateListener = new PhoneStateListener() { // from class: com.yandex.messaging.internal.calls.CellularCallObservable$1
            @Override // android.telephony.PhoneStateListener
            public void onCallStateChanged(int i, String str) {
                z83.g(null, a.this.a, Looper.myLooper());
                k69 k69Var = tf4Var;
                a.this.getClass();
                ((x6f0) ((tf4) k69Var).b).d(Boolean.valueOf(i == 2));
            }
        };
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager != null) {
            try {
                telephonyManager.listen(phoneStateListener, 32);
                ((x6f0) y6f0Var).d(Boolean.valueOf(telephonyManager.getCallState() == 2));
            } catch (SecurityException unused) {
                ydz.b("CellularCallObservable", "READ_PHONE_STATE permission is not declared, it is important for video calls");
                ((x6f0) y6f0Var).d(Boolean.FALSE);
            }
        }
        return new xi3(3, this, phoneStateListener);
    }
}
