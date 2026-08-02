package ru.mail.verify.core.utils.network;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4217a2;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.libverify.p0.e;
import ru.mail.libverify.r0.a;
import ru.mail.libverify.r0.b;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    private static final AtomicReference<b> a = new AtomicReference<>(b.a());

    @Nullable
    private static NetworkStateReceiver b = null;
    public static final /* synthetic */ int c = 0;

    @NonNull
    public static Boolean a(@NonNull Context context) {
        a(context, false);
        return Boolean.valueOf(a.get().a == a.ROAMING);
    }

    public static boolean b(@NonNull Context context) {
        a(context, false);
        return a.get().a == a.WIFI;
    }

    public static void c(@NonNull Context context) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) NetworkStateReceiver.class), 2, 1);
            synchronized (NetworkStateReceiver.class) {
                try {
                    NetworkStateReceiver networkStateReceiver = b;
                    if (networkStateReceiver != null) {
                        context.unregisterReceiver(networkStateReceiver);
                        b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            FileLog.v("NetworkStateReceiver", C4217a2.e);
        } catch (Throwable th2) {
            FileLog.e("NetworkStateReceiver", "failed to disable", th2);
        }
    }

    public static void d(@NonNull Context context) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) NetworkStateReceiver.class), 1, 1);
            int i = Build.VERSION.SDK_INT;
            synchronized (NetworkStateReceiver.class) {
                try {
                    if (b == null) {
                        a(context, false);
                        b = new NetworkStateReceiver();
                        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                        if (i >= 33) {
                            context.registerReceiver(b, intentFilter, 4);
                        } else {
                            context.registerReceiver(b, intentFilter);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            FileLog.v("NetworkStateReceiver", "enabled");
        } catch (Throwable th2) {
            FileLog.e("NetworkStateReceiver", "failed to enable", th2);
        }
    }

    public static boolean e(@NonNull Context context) {
        a(context, false);
        return a();
    }

    public static boolean f(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            FileLog.e("NetworkStateReceiver", "no available network found (ConnectivityManager is null)");
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return false;
        }
        return networkCapabilities.hasTransport(4);
    }

    public static boolean g(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        return connectivityManager.isActiveNetworkMetered();
    }

    public static void h(@NonNull Context context) {
        a(context, true);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (context == null || intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        a(context, true);
    }

    public static boolean a() {
        return a.get().a != a.NONE;
    }

    private static void a(@NonNull Context context, boolean z) {
        b a2;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            FileLog.e("NetworkStateReceiver", "no available network found (ConnectivityManager is null)");
            a2 = b.a(context, a.NONE);
        } else {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    a2 = b.a(context, a.WIFI);
                } else if (activeNetworkInfo.isRoaming()) {
                    a2 = b.a(context, a.ROAMING);
                } else {
                    a2 = b.a(context, a.CELLULAR);
                }
            } else if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                a2 = b.a(context, a.CONNECTING);
            } else {
                FileLog.d("NetworkStateReceiver", "no available network found (%s)", activeNetworkInfo);
                a2 = b.a(context, a.NONE);
            }
        }
        AtomicReference<b> atomicReference = a;
        FileLog.d("NetworkStateReceiver", "check network: %s (current: %s, fire event: %s)", a2, atomicReference.get(), Boolean.valueOf(z));
        if (atomicReference.getAndSet(a2) == a2 || !ru.mail.libverify.d0.a.e(context)) {
            return;
        }
        FileLog.v("NetworkStateReceiver", "state changed to %s on %s", a2.a, a2.b);
        if (z) {
            try {
                ru.mail.libverify.p0.a aVar = ru.mail.libverify.p0.a.NETWORK_STATE_CHANGED;
                a(context, false);
                ru.mail.libverify.d0.a.a(context, e.a(aVar, Boolean.valueOf(a())));
            } catch (Throwable th) {
                FileLog.e("NetworkStateReceiver", "failed to process network state change", th);
            }
        }
    }
}
