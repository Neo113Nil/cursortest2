package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;

/* loaded from: classes11.dex */
final class ArCoreApkJniAdapter {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(ah.b.G));
        hashMap.put(ResourceExhaustedException.class, Integer.valueOf(ah.n.G));
        hashMap.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(ah.B.G));
        hashMap.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(ah.C.G));
        hashMap.put(UnavailableApkTooOldException.class, Integer.valueOf(ah.D.G));
        hashMap.put(UnavailableSdkTooOldException.class, Integer.valueOf(ah.E.G));
        hashMap.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(ah.F.G));
    }

    public static int b(Throwable th) {
        Log.e("ARCore-ArCoreApkJniAdap", "Exception details:", th);
        Class<?> cls = th.getClass();
        HashMap hashMap = a;
        return hashMap.containsKey(cls) ? ((Integer) hashMap.get(cls)).intValue() : ah.c.G;
    }

    public static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            b(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    public static void checkAvailabilityAsync(Context context, long j, long j2) {
        final x xVar = new x(j, j2);
        try {
            ArCoreApk.getInstance().checkAvailabilityAsync(context, xVar);
        } catch (Throwable th) {
            b(th);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.ar.core.v
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    HashMap hashMap = ArCoreApkJniAdapter.a;
                    x.this.accept(ArCoreApk.Availability.UNKNOWN_ERROR);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeInvokeAvailabilityCallback(long j, long j2, int i);

    public static int requestInstall(Activity activity, boolean z, int[] iArr) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z).nativeCode;
            return ah.a.G;
        } catch (Throwable th) {
            return b(th);
        }
    }

    public static int requestInstallCustom(Activity activity, boolean z, int i, int i2, int[] iArr) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z, ArCoreApk.InstallBehavior.forNumber(i), ArCoreApk.UserMessageType.forNumber(i2)).nativeCode;
            return ah.a.G;
        } catch (Throwable th) {
            return b(th);
        }
    }
}
