package com.google.ar.core;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import defpackage.ny61;
import defpackage.yx61;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Objects;
import java.util.function.Consumer;

/* loaded from: classes11.dex */
public final class q extends ArCoreApk {
    public static final q m = new q();
    public Exception b;
    public boolean c;
    public int e;
    public long f;
    public ArCoreApk.Availability g;
    public boolean h;
    public d0 i;
    public boolean j;
    public boolean k;
    public int l;
    public final Handler a = new Handler(Looper.getMainLooper());
    public boolean d = true;

    public static int d(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i != 0) {
                return i;
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                if (serviceInfoArr.length != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public final synchronized d0 a(Context context) {
        try {
            if (this.i == null) {
                d0 d0Var = new d0();
                d0Var.a(context.getApplicationContext());
                this.i = d0Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.i;
    }

    public final synchronized void b() {
        try {
            if (this.b == null) {
                this.e = 0;
            }
            this.c = false;
            d0 d0Var = this.i;
            if (d0Var != null) {
                d0Var.b();
                this.i = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031 A[Catch: FatalException -> 0x0029, TryCatch #1 {FatalException -> 0x0029, blocks: (B:2:0x0000, B:4:0x0009, B:9:0x0017, B:15:0x002d, B:21:0x0026, B:20:0x002b, B:22:0x0031, B:24:0x0038, B:26:0x003e, B:28:0x0045, B:30:0x004b, B:11:0x001a, B:13:0x0020, B:19:0x0023), top: B:1:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017 A[Catch: FatalException -> 0x0029, TRY_LEAVE, TryCatch #1 {FatalException -> 0x0029, blocks: (B:2:0x0000, B:4:0x0009, B:9:0x0017, B:15:0x002d, B:21:0x0026, B:20:0x002b, B:22:0x0031, B:24:0x0038, B:26:0x003e, B:28:0x0045, B:30:0x004b, B:11:0x001a, B:13:0x0020, B:19:0x0023), top: B:1:0x0000, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context, l lVar) {
        boolean z;
        ArCoreApk.Availability availability;
        try {
            e(context);
            if (d(context) != 0 && d(context) < this.l) {
                z = false;
                if (!z) {
                    b();
                    try {
                        availability = j.a(context) != null ? ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD : ArCoreApk.Availability.SUPPORTED_INSTALLED;
                    } catch (UnavailableDeviceNotCompatibleException unused) {
                        availability = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
                    } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
                        availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                    }
                    lVar.a(availability);
                    return;
                }
                if (d(context) != -1) {
                    lVar.a(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
                    return;
                }
                e(context);
                if (this.k) {
                    lVar.a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                    return;
                } else {
                    a(context).c(context, lVar);
                    return;
                }
            }
            z = true;
            if (!z) {
            }
        } catch (FatalException e) {
            Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e);
            lVar.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x001d, B:10:0x0021, B:12:0x0027, B:13:0x002a, B:16:0x002c, B:18:0x0030, B:19:0x0032, B:21:0x0034, B:22:0x003d, B:24:0x000e, B:26:0x0012), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x001d, B:10:0x0021, B:12:0x0027, B:13:0x002a, B:16:0x002c, B:18:0x0030, B:19:0x0032, B:21:0x0034, B:22:0x003d, B:24:0x000e, B:26:0x0012), top: B:2:0x0001 }] */
    @Override // com.google.ar.core.ArCoreApk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArCoreApk.Availability checkAvailability(Context context) {
        ArCoreApk.Availability availability;
        synchronized (this) {
            try {
                ArCoreApk.Availability availability2 = this.g;
                if (availability2 != null) {
                    if (availability2.isUnknown()) {
                    }
                    availability = this.g;
                    if (availability == null) {
                        if (!availability.isUnsupported()) {
                            this.g = null;
                        }
                        return availability;
                    }
                    if (this.h) {
                        return ArCoreApk.Availability.UNKNOWN_CHECKING;
                    }
                    Log.e("ARCore-ArCoreApk", "request not running but result is null?");
                    return ArCoreApk.Availability.UNKNOWN_ERROR;
                }
                if (!this.h) {
                    this.h = true;
                    c(context, new m(this));
                }
                availability = this.g;
                if (availability == null) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final void checkAvailabilityAsync(Context context, Consumer consumer) {
        c(context, new p(this, consumer));
    }

    public final synchronized void e(Context context) {
        if (this.j) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            Bundle bundle = packageManager.getApplicationInfo(packageName, 128).metaData;
            if (!bundle.containsKey("com.google.ar.core")) {
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
            }
            String string = bundle.getString("com.google.ar.core");
            Objects.requireNonNull(string);
            this.k = string.equals("required");
            if (!bundle.containsKey("com.google.ar.core.min_apk_version")) {
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
            }
            this.l = bundle.getInt("com.google.ar.core.min_apk_version");
            try {
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                String canonicalName = InstallActivity.class.getCanonicalName();
                for (ActivityInfo activityInfo : activityInfoArr) {
                    if (canonicalName.equals(activityInfo.name)) {
                        this.j = true;
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43);
                sb.append("Application manifest must contain activity ");
                sb.append(canonicalName);
                throw new FatalException(sb.toString());
            } catch (PackageManager.NameNotFoundException e) {
                throw new FatalException("Could not load application package info", e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new FatalException("Could not load application package metadata", e2);
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) {
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        e(activity);
        Bundle bundle = null;
        if (d(activity) == 0 || d(activity) >= this.l) {
            b();
            PendingIntent a = j.a(activity);
            if (a != null) {
                try {
                    Log.i("ARCore-ArCoreApk", "Starting setup activity");
                    if (Build.VERSION.SDK_INT > 33) {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        bundle = pendingIntentBackgroundActivityStartMode.toBundle();
                    }
                    activity.startIntentSender(a.getIntentSender(), null, 0, 0, 0, bundle);
                    return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                } catch (IntentSender.SendIntentException | RuntimeException unused) {
                }
            }
            return ArCoreApk.InstallStatus.INSTALLED;
        }
        if (this.c) {
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        }
        Exception exc = this.b;
        if (exc != null) {
            if (!z) {
                if (exc instanceof UnavailableDeviceNotCompatibleException) {
                    Log.e("ARCore-ArCoreApk", "Throwing UnavailableDeviceNotCompatibleException");
                    throw ((UnavailableDeviceNotCompatibleException) exc);
                }
                if (exc instanceof UnavailableUserDeclinedInstallationException) {
                    Log.e("ARCore-ArCoreApk", "Throwing UnavailableUserDeclinedInstallationException");
                    throw ((UnavailableUserDeclinedInstallationException) exc);
                }
                if (exc instanceof RuntimeException) {
                    Log.e("ARCore-ArCoreApk", "Throwing RuntimeException.");
                    throw ((RuntimeException) exc);
                }
                ny61.n("Unexpected exception type", exc);
                return null;
            }
            this.b = null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f > 5000) {
            this.e = 0;
        }
        int i = this.e + 1;
        this.e = i;
        this.f = uptimeMillis;
        if (i > 2) {
            yx61.f("Requesting ARCore installation too rapidly.");
            return null;
        }
        try {
            activity.startActivity(new Intent(activity, (Class<?>) InstallActivity.class).putExtra(Constants.KEY_MESSAGE, userMessageType).putExtra("behavior", installBehavior));
            this.c = true;
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        } catch (ActivityNotFoundException e) {
            throw new FatalException("Failed to launch InstallActivity.", e);
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z) {
        ArCoreApk.UserMessageType userMessageType;
        e(activity);
        ArCoreApk.InstallBehavior installBehavior = this.k ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL;
        e(activity);
        if (this.k) {
            userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        } else {
            userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
        }
        return requestInstall(activity, z, installBehavior, userMessageType);
    }
}
