package com.vungle.ads.internal.platform;

import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes7.dex */
public abstract class a {
    public static String a(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
    }
}
