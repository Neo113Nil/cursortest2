package com.yandex.alicekit.core.hardware;

import android.content.Context;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import defpackage.z83;

/* loaded from: classes4.dex */
public class SignalLevelListener extends PhoneStateListener {
    private volatile int mSignalStrength;
    private final TelephonyManager mTelephonyManager;

    private SignalLevelListener(Context context) {
        this.mTelephonyManager = (TelephonyManager) context.getSystemService("phone");
    }

    public static SignalLevelListener create(Context context) {
        z83.d(Looper.myLooper(), "PhoneStateListener class requires Looper.myLooper() not return null / be created on HandlerThread");
        return new SignalLevelListener(context);
    }

    public int getSignalStrength() {
        return this.mSignalStrength;
    }

    public void listenUntilRetrieved() {
        TelephonyManager telephonyManager = this.mTelephonyManager;
        if (telephonyManager != null) {
            telephonyManager.listen(this, 2);
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthChanged(int i) {
        TelephonyManager telephonyManager = this.mTelephonyManager;
        if (telephonyManager != null) {
            telephonyManager.listen(this, 0);
        }
        this.mSignalStrength = (i * 2) - 113;
        synchronized (this) {
            notify();
        }
    }
}
