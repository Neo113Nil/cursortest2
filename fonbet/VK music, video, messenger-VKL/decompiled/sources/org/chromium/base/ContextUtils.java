package org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import com.vk.core.preference.Preference;
import xsna.k50;

/* loaded from: classes11.dex */
public class ContextUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    private static final String TAG = "ContextUtils";
    private static Context sApplicationContext;

    /* loaded from: classes8.dex */
    public static class Holder {
        private static SharedPreferences sSharedPreferences = ContextUtils.fetchAppSharedPreferences();

        private Holder() {
        }
    }

    public static Activity activityFromContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SharedPreferences fetchAppSharedPreferences() {
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            SharedPreferences g = Preference.g(getApplicationContext());
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
            return g;
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static SharedPreferences getAppSharedPreferences() {
        return Holder.sSharedPreferences;
    }

    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    public static String getProcessName() {
        return Application.getProcessName();
    }

    public static void initApplicationContext(Context context) {
        initJavaSideApplicationContext(context);
    }

    public static void initApplicationContextForTests(Context context) {
        Context context2 = sApplicationContext;
        initJavaSideApplicationContext(context);
        SharedPreferences sharedPreferences = Holder.sSharedPreferences;
        Holder.sSharedPreferences = fetchAppSharedPreferences();
        ResettersForTesting.register(new k50(2, context2, sharedPreferences));
    }

    private static void initJavaSideApplicationContext(Context context) {
        sApplicationContext = context;
    }

    public static boolean isIsolatedProcess() {
        return Process.isIsolated();
    }

    public static boolean isProcess64Bit() {
        return Process.is64Bit();
    }

    public static boolean isSdkSandboxProcess() {
        boolean isSdkSandbox;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        isSdkSandbox = Process.isSdkSandbox();
        return isSdkSandbox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initApplicationContextForTests$0(Context context, SharedPreferences sharedPreferences) {
        sApplicationContext = context;
        Holder.sSharedPreferences = sharedPreferences;
    }

    private static Intent registerBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }

    public static Intent registerExportedBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, str, null, 2);
    }

    public static Intent registerNonExportedBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, null, 4);
    }

    public static Intent registerProtectedBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, null, 0);
    }

    public static Intent registerNonExportedBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, handler, 4);
    }

    public static Intent registerProtectedBroadcastReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, handler, 0);
    }
}
