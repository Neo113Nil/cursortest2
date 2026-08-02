package org.chromium.base;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.Serializable;
import java.util.ArrayList;
import xsna.qax;

/* loaded from: classes8.dex */
public class IntentUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String ANDROID_APP_REFERRER_SCHEME = "android-app";
    private static final Object COMPONENT_NAME_LOCK = new Object();
    private static final String TAG = "IntentUtils";
    public static final String TRUSTED_APPLICATION_CODE_EXTRA = "trusted_application_code_extra";
    private static ComponentName sFakeComponentName;
    private static boolean sForceTrustedIntentForTesting;

    public static void addTrustedIntentExtras(Intent intent) {
        if (intentTargetsSelf(intent)) {
            intent.putExtra(TRUSTED_APPLICATION_CODE_EXTRA, getAuthenticationToken());
        }
    }

    private static PendingIntent getAuthenticationToken() {
        Intent intent = new Intent();
        Context applicationContext = ContextUtils.getApplicationContext();
        intent.setComponent(getFakeComponentName(applicationContext.getPackageName()));
        return PendingIntent.getActivity(applicationContext, 0, intent, getPendingIntentMutabilityFlag(false));
    }

    private static ComponentName getFakeComponentName(String str) {
        synchronized (COMPONENT_NAME_LOCK) {
            try {
                if (sFakeComponentName == null) {
                    sFakeComponentName = new ComponentName(str, "FakeClass");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sFakeComponentName;
    }

    public static <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(Intent intent, String str) {
        try {
            return intent.getParcelableArrayListExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getParcelableArrayListExtra failed on intent ".concat(String.valueOf(intent)));
            return null;
        }
    }

    public static int getParceledIntentSize(Intent intent) {
        Parcel obtain = Parcel.obtain();
        intent.writeToParcel(obtain, 0);
        return obtain.dataSize();
    }

    public static int getPendingIntentMutabilityFlag(boolean z) {
        if (z) {
            return (!z || Build.VERSION.SDK_INT < 31) ? 0 : 33554432;
        }
        return 67108864;
    }

    public static boolean intentTargetsSelf(Intent intent) {
        boolean isEmpty = TextUtils.isEmpty(intent.getPackage());
        String str = BuildInfo.getInstance().hostPackageName;
        boolean z = !isEmpty && str.equals(intent.getPackage());
        ComponentName component = intent.getComponent();
        if (component == null || !str.equals(component.getPackageName())) {
            return z;
        }
        if (isEmpty) {
            return true;
        }
        return z;
    }

    public static boolean isIntentForNewTaskOrNewDocument(Intent intent) {
        return (intent.getFlags() & 268959744) != 0;
    }

    public static boolean isMainIntentFromLauncher(Intent intent) {
        return intent != null && TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER") && (intent.getFlags() & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0;
    }

    public static boolean isTrustedIntentFromSelf(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (sForceTrustedIntentForTesting) {
            return true;
        }
        PendingIntent pendingIntent = (PendingIntent) safeGetParcelableExtra(intent, TRUSTED_APPLICATION_CODE_EXTRA);
        if (pendingIntent == null) {
            return false;
        }
        return getAuthenticationToken().equals(pendingIntent);
    }

    private static Intent logInvalidIntent(Intent intent, Exception exc) {
        Log.e(TAG, "Invalid incoming intent.", (Throwable) exc);
        return intent.replaceExtras((Bundle) null);
    }

    public static void logTransactionTooLargeOrRethrow(RuntimeException runtimeException, Intent intent) {
        if (!(runtimeException.getCause() instanceof TransactionTooLargeException)) {
            throw runtimeException;
        }
        Log.e(TAG, "Could not resolve Activity for intent " + intent.toString(), (Throwable) runtimeException);
    }

    public static IBinder safeGetBinder(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getBinder(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getBinder failed on bundle ".concat(String.valueOf(bundle)));
            return null;
        }
    }

    public static IBinder safeGetBinderExtra(Intent intent, String str) {
        if (intent.hasExtra(str)) {
            return safeGetBinder(intent.getExtras(), str);
        }
        return null;
    }

    public static boolean safeGetBoolean(Bundle bundle, String str, boolean z) {
        try {
            return bundle.getBoolean(str, z);
        } catch (Throwable unused) {
            Log.e(TAG, "getBoolean failed on bundle ".concat(String.valueOf(bundle)));
            return z;
        }
    }

    public static boolean safeGetBooleanExtra(Intent intent, String str, boolean z) {
        try {
            return intent.getBooleanExtra(str, z);
        } catch (Throwable unused) {
            Log.e(TAG, "getBooleanExtra failed on intent ".concat(String.valueOf(intent)));
            return z;
        }
    }

    public static Bundle safeGetBundle(Bundle bundle, String str) {
        try {
            return bundle.getBundle(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getBundle failed on bundle ".concat(String.valueOf(bundle)));
            return null;
        }
    }

    public static Bundle safeGetBundleExtra(Intent intent, String str) {
        try {
            return intent.getBundleExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getBundleExtra failed on intent ".concat(String.valueOf(intent)));
            return null;
        }
    }

    public static byte[] safeGetByteArrayExtra(Intent intent, String str) {
        try {
            return intent.getByteArrayExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getByteArrayExtra failed on intent ".concat(String.valueOf(intent)));
            return null;
        }
    }

    public static float[] safeGetFloatArray(Bundle bundle, String str) {
        try {
            return bundle.getFloatArray(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getFloatArray failed on bundle ".concat(String.valueOf(bundle)));
            return null;
        }
    }

    public static int safeGetInt(Bundle bundle, String str, int i) {
        try {
            return bundle.getInt(str, i);
        } catch (Throwable unused) {
            Log.e(TAG, "getInt failed on bundle ".concat(String.valueOf(bundle)));
            return i;
        }
    }

    public static int[] safeGetIntArray(Bundle bundle, String str) {
        try {
            return bundle.getIntArray(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getIntArray failed on bundle ".concat(String.valueOf(bundle)));
            return null;
        }
    }

    public static int[] safeGetIntArrayExtra(Intent intent, String str) {
        try {
            return intent.getIntArrayExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getIntArrayExtra failed on intent ".concat(String.valueOf(intent)));
            return null;
        }
    }

    public static int safeGetIntExtra(Intent intent, String str, int i) {
        try {
            return intent.getIntExtra(str, i);
        } catch (Throwable unused) {
            Log.e(TAG, "getIntExtra failed on intent ".concat(String.valueOf(intent)));
            return i;
        }
    }

    public static long safeGetLong(Bundle bundle, String str, long j) {
        try {
            return bundle.getLong(str, j);
        } catch (Throwable unused) {
            Log.e(TAG, "getLong failed on bundle ".concat(String.valueOf(bundle)));
            return j;
        }
    }

    public static long safeGetLongExtra(Intent intent, String str, long j) {
        try {
            return intent.getLongExtra(str, j);
        } catch (Throwable unused) {
            Log.e(TAG, "getLongExtra failed on intent ".concat(String.valueOf(intent)));
            return j;
        }
    }

    public static <T extends Parcelable> T safeGetParcelable(Bundle bundle, String str) {
        try {
            return (T) bundle.getParcelable(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getParcelable failed on bundle ".concat(String.valueOf(bundle)));
            return null;
        }
    }

    public static Parcelable[] safeGetParcelableArrayExtra(Intent intent, String str) {
        try {
            return intent.getParcelableArrayExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getParcelableArrayExtra failed on intent ".concat(String.valueOf(intent)));
            return null;
        }
    }

    public static <T extends Parcelable> ArrayList<T> safeGetParcelableArrayList(Bundle bundle, String str) {
        try {
            return bundle.getParcelableArrayList(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getParcelableArrayList failed on bundle ".concat(String.valueOf(bundle)));
            return null;
        }
    }

    public static <T extends Parcelable> T safeGetParcelableExtra(Intent intent, String str) {
        try {
            return (T) intent.getParcelableExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getParcelableExtra failed on intent ".concat(String.valueOf(intent)));
            return null;
        }
    }

    public static <T extends Serializable> T safeGetSerializableExtra(Intent intent, String str) {
        try {
            return (T) intent.getSerializableExtra(str);
        } catch (ClassCastException e) {
            Log.e(TAG, "Invalide class for Serializable: " + str, (Throwable) e);
            return null;
        } catch (Throwable unused) {
            Log.e(TAG, "getSerializableExtra failed on intent ".concat(String.valueOf(intent)));
            return null;
        }
    }

    public static String safeGetString(Bundle bundle, String str) {
        try {
            return bundle.getString(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getString failed on bundle ".concat(String.valueOf(bundle)));
            return null;
        }
    }

    public static ArrayList<String> safeGetStringArrayListExtra(Intent intent, String str) {
        try {
            return intent.getStringArrayListExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getStringArrayListExtra failed on intent ".concat(String.valueOf(intent)));
            return null;
        }
    }

    public static String safeGetStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "getStringExtra failed on intent ".concat(String.valueOf(intent)));
            return null;
        }
    }

    public static boolean safeHasExtra(Intent intent, String str) {
        try {
            return intent.hasExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "hasExtra failed on intent ".concat(String.valueOf(intent)));
            return false;
        }
    }

    public static void safePutBinderExtra(Intent intent, String str, IBinder iBinder) {
        if (intent == null) {
            return;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putBinder(str, iBinder);
        } catch (Throwable unused) {
            Log.e(TAG, "putBinder failed on bundle ".concat(String.valueOf(bundle)));
        }
        intent.putExtras(bundle);
    }

    public static void safeRemoveExtra(Intent intent, String str) {
        try {
            intent.removeExtra(str);
        } catch (Throwable unused) {
            Log.e(TAG, "removeExtra failed on intent ".concat(String.valueOf(intent)));
        }
    }

    public static boolean safeStartActivity(Context context, Intent intent) {
        return safeStartActivity(context, intent, null);
    }

    public static Intent sanitizeIntent(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            return intent;
        }
        if (intent == null) {
            return null;
        }
        try {
            intent.getBooleanExtra("TriggerUnparcel", false);
            return intent;
        } catch (BadParcelableException e) {
            return logInvalidIntent(intent, e);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof ClassNotFoundException) {
                return logInvalidIntent(intent, e2);
            }
            throw e2;
        }
    }

    public static void setForceIsTrustedIntentForTesting(boolean z) {
        sForceTrustedIntentForTesting = z;
        ResettersForTesting.register(new qax());
    }

    public static boolean safeStartActivity(Context context, Intent intent, Bundle bundle) {
        try {
            context.startActivity(intent, bundle);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
