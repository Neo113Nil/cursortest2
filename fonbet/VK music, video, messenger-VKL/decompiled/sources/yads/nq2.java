package yads;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

/* loaded from: classes10.dex */
public final class nq2 implements Parcelable {
    public static final Parcelable.Creator<nq2> CREATOR = new mq2();
    public final int b;

    public nq2(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r3.hasCapability(16) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Context context) {
        int i;
        Intent a;
        int intExtra;
        if ((this.b & 1) != 0) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (mc3.a >= 24) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        try {
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities != null) {
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                }
                if ((this.b & 2) != 0 && connectivityManager.isActiveNetworkMetered()) {
                    i = 2;
                    if ((this.b & 8) != 0 && ((a = xsna.fp.a("android.intent.action.BATTERY_CHANGED", context, null)) == null || ((intExtra = a.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
                        i |= 8;
                    }
                    if ((this.b & 4) != 0) {
                        Object systemService2 = context.getSystemService("power");
                        systemService2.getClass();
                        PowerManager powerManager = (PowerManager) systemService2;
                        int i2 = mc3.a;
                        if (i2 < 23 ? i2 < 20 ? powerManager.isScreenOn() : powerManager.isInteractive() : !powerManager.isDeviceIdleMode()) {
                            i |= 4;
                        }
                    }
                    return ((this.b & 16) != 0 || xsna.fp.a("android.intent.action.DEVICE_STORAGE_LOW", context, null) == null) ? i : i | 16;
                }
            }
            i = this.b & 3;
            if ((this.b & 8) != 0) {
                i |= 8;
            }
            if ((this.b & 4) != 0) {
            }
            if ((this.b & 16) != 0) {
                return i;
            }
        }
        i = 0;
        if ((this.b & 8) != 0) {
        }
        if ((this.b & 4) != 0) {
        }
        if ((this.b & 16) != 0) {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && nq2.class == obj.getClass() && this.b == ((nq2) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
