package ru.mail.libverify.a0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import ru.mail.libverify.n0.e;
import ru.mail.verify.core.utils.FileLog;
import xsna.anj;
import xsna.drm0;

/* loaded from: classes9.dex */
public final class b extends a {
    private final TelephonyManager g;
    private final Context h;

    public b(int i, int i2, String str, int i3, TelephonyManager telephonyManager, Context context) {
        super(i, i2, str, i3, telephonyManager, context);
        this.g = telephonyManager;
        this.h = context;
    }

    @Override // ru.mail.libverify.a0.a
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public final String a(String str) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return this.g.getSimSerialNumber();
            }
            String simOperator = this.g.getSimOperator();
            int b = b();
            if (!drm0.N(str) && !drm0.N(simOperator)) {
                return e.f(str + simOperator + b);
            }
            return "";
        } catch (Exception e) {
            FileLog.e("NotReflectionTelephonyManager", "get fist sim card unqiue number exception: ", e);
            return "";
        }
    }

    @Override // ru.mail.libverify.a0.a
    public final String c() {
        return this.g.getNetworkCountryIso();
    }

    @Override // ru.mail.libverify.a0.a
    public final String d() {
        return this.g.getNetworkOperator();
    }

    @Override // ru.mail.libverify.a0.a
    public final String e() {
        return this.g.getNetworkOperatorName();
    }

    @Override // ru.mail.libverify.a0.a
    public final int f() {
        return this.g.getSimState();
    }

    @Override // ru.mail.libverify.a0.a
    public final String h() {
        return this.g.getSimCountryIso();
    }

    @Override // ru.mail.libverify.a0.a
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public final String i() {
        try {
            return Build.VERSION.SDK_INT < 29 ? this.g.getDeviceId() : "";
        } catch (SecurityException e) {
            FileLog.e("NotReflectionTelephonyManager", "getSimImei exception: ", e);
            return "";
        }
    }

    @Override // ru.mail.libverify.a0.a
    public final String j() {
        return this.g.getSimOperator();
    }

    @Override // ru.mail.libverify.a0.a
    public final String k() {
        return this.g.getSimOperatorName();
    }

    @Override // ru.mail.libverify.a0.a
    @SuppressLint({"MissingPermission", "HardwareIds"})
    public final String m() {
        if (Build.VERSION.SDK_INT < 29) {
            return this.g.getSubscriberId();
        }
        return null;
    }

    @Override // ru.mail.libverify.a0.a
    public final boolean o() {
        return this.g.isNetworkRoaming();
    }

    @Override // ru.mail.libverify.a0.a
    public final boolean p() {
        boolean isDataRoamingEnabled;
        if (anj.a(this.h, "android.permission.READ_PHONE_STATE") != 0 || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isDataRoamingEnabled = this.g.isDataRoamingEnabled();
        return isDataRoamingEnabled;
    }
}
