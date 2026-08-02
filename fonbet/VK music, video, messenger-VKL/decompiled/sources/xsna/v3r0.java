package xsna;

import android.os.Build;
import android.os.ext.SdkExtensions;
import io.jsonwebtoken.JwtParser;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Utils.kt */
/* loaded from: classes12.dex */
public final class v3r0 {
    public static final boolean a() {
        int extensionVersion;
        extensionVersion = SdkExtensions.getExtensionVersion(34);
        return extensionVersion >= 13;
    }

    public static final boolean b() {
        int extensionVersion;
        extensionVersion = SdkExtensions.getExtensionVersion(34);
        return extensionVersion >= 15;
    }

    public static final boolean c() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT >= 36) {
            return true;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(34);
        return extensionVersion >= 16;
    }

    public static final void d(double d, String str) {
        if (d < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            throw new IllegalArgumentException(str.concat(" must not be negative").toString());
        }
    }

    public static final <T extends Comparable<? super T>> void e(T t, T t2, String str) {
        if (t.compareTo(t2) >= 0) {
            return;
        }
        throw new IllegalArgumentException((str + " must not be less than " + t2 + ", currently " + t + JwtParser.SEPARATOR_CHAR).toString());
    }

    public static final <T extends Comparable<? super T>> void f(T t, T t2, String str) {
        if (t.compareTo(t2) <= 0) {
            return;
        }
        throw new IllegalArgumentException((str + " must not be more than " + t2 + ", currently " + t + JwtParser.SEPARATOR_CHAR).toString());
    }

    public static final LinkedHashMap g(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
        return linkedHashMap;
    }
}
