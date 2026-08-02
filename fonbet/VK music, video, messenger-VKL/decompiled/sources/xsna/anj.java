package xsna;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import xsna.dbg0;

/* compiled from: ContextCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class anj {

    /* compiled from: ContextCompat.java */
    /* loaded from: classes11.dex */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        
            if (xsna.d02.n(r6, r9) == 0) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
            String opPackageName;
            if ((i & 4) == 0 || str != null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str, null, 0);
            }
            String str2 = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (d02.n(context, str2) != 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    StringBuilder sb = new StringBuilder();
                    opPackageName = context.getOpPackageName();
                    sb.append(opPackageName);
                    sb.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
                    str2 = sb.toString();
                }
                throw new RuntimeException(zr.a("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, null);
        }

        public static void b(Context context, Intent intent) {
            context.startForegroundService(intent);
        }
    }

    /* compiled from: ContextCompat.java */
    public static class b {
        public static String a(Context context) {
            return context.getAttributionTag();
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new dd70(context).b.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r5.c == r9.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(int i, Context context) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        dbg0.a aVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        dbg0.b bVar = new dbg0.b(resources, theme);
        synchronized (dbg0.c) {
            try {
                SparseArray<dbg0.a> sparseArray = dbg0.b.get(bVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i)) != null) {
                    if (aVar.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (aVar.c != 0) {
                            }
                            colorStateList2 = aVar.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = dbg0.a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = i8g.a(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (dbg0.c) {
            try {
                WeakHashMap<dbg0.b, SparseArray<dbg0.a>> weakHashMap = dbg0.b;
                SparseArray<dbg0.a> sparseArray2 = weakHashMap.get(bVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(bVar, sparseArray2);
                }
                sparseArray2.append(i, new dbg0.a(colorStateList, bVar.a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static String c(int i, Context context) {
        mwz a2 = pwz.a(context);
        if (Build.VERSION.SDK_INT <= 32 && !a2.a.a.isEmpty()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocales(a2.a.a);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i);
    }

    public static Intent d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i2 == 0 || (i & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, null, i) : a.a(context, broadcastReceiver, intentFilter, str, i);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }
}
