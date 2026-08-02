package xsna;

import android.content.ContentResolver;
import android.provider.Settings;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: DeviceSettingsProvider.kt */
/* loaded from: classes.dex */
public final class p6m {
    public final ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();

    public static void a(p6m p6mVar, ContentResolver contentResolver, String str) {
        p6mVar.getClass();
        try {
            String string = Settings.Global.getString(contentResolver, str);
            if (string == null) {
                string = null;
            }
            if (string != null) {
                p6mVar.a.put(str, string);
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(p6m p6mVar, ContentResolver contentResolver, String str) {
        p6mVar.getClass();
        try {
            String string = Settings.Secure.getString(contentResolver, str);
            if (string == null) {
                string = null;
            }
            if (string != null) {
                p6mVar.a.put(str, string);
            }
        } catch (Throwable unused) {
        }
    }
}
