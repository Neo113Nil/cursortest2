package ru.mail.libverify.r0;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.n0.e;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class b {
    private static final b c = new b(ru.mail.libverify.r0.a.NONE);
    private static final b d = new b(ru.mail.libverify.r0.a.CELLULAR);
    private static final b e = new b(ru.mail.libverify.r0.a.ROAMING);
    private static final b f = new b(ru.mail.libverify.r0.a.CONNECTING);
    private static final LruCache<String, b> g = new LruCache<>(256);

    @NonNull
    public final ru.mail.libverify.r0.a a;

    @Nullable
    public final String b;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ru.mail.libverify.r0.a.values().length];
            a = iArr;
            try {
                iArr[ru.mail.libverify.r0.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ru.mail.libverify.r0.a.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ru.mail.libverify.r0.a.CELLULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ru.mail.libverify.r0.a.ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ru.mail.libverify.r0.a.CONNECTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private b(@NonNull ru.mail.libverify.r0.a aVar) {
        this.a = aVar;
        this.b = null;
    }

    @NonNull
    public static b a(@NonNull Context context, @NonNull ru.mail.libverify.r0.a aVar) {
        WifiInfo connectionInfo;
        b bVar;
        String str = "Unknown Wi-Fi network";
        int i = a.a[aVar.ordinal()];
        if (i == 1) {
            return c;
        }
        if (i != 2) {
            if (i == 3) {
                return d;
            }
            if (i == 4) {
                return e;
            }
            if (i == 5) {
                return f;
            }
            ru.mail.libverify.n0.b.a("NetworkStateDescriptor", "failed to get connection type", new IllegalArgumentException("unknown connection type"));
            return c;
        }
        if (e.b(context, "android.permission.ACCESS_WIFI_STATE")) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    String ssid = connectionInfo.getSSID();
                    if (!TextUtils.isEmpty(ssid)) {
                        str = ssid;
                    }
                }
            } catch (Throwable unused) {
                str = "Unknown Wi-Fi network";
            }
        } else {
            str = "Unknown Wi-Fi network";
        }
        LruCache<String, b> lruCache = g;
        synchronized (lruCache) {
            try {
                bVar = lruCache.get(str);
                if (bVar == null) {
                    bVar = new b(ru.mail.libverify.r0.a.WIFI, str);
                    lruCache.put(str, bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkStateDescriptor{state=");
        sb.append(this.a);
        sb.append(", name='");
        return i5s.a(sb, this.b, "'}");
    }

    private b(@NonNull ru.mail.libverify.r0.a aVar, @Nullable String str) {
        this.a = aVar;
        this.b = str;
    }

    @NonNull
    public static b a() {
        return c;
    }
}
