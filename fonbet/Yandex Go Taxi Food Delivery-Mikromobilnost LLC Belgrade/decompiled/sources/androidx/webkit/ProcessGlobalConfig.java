package androidx.webkit;

import defpackage.kbs;
import defpackage.ny61;
import defpackage.qp41;
import defpackage.qxa1;
import defpackage.tse0;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* loaded from: classes.dex */
public class ProcessGlobalConfig {
    public String a;
    public String b;
    public String c;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();
    public static final Object d = new Object();
    public static boolean e = false;

    public static void a(ProcessGlobalConfig processGlobalConfig) {
        synchronized (d) {
            if (e) {
                throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
            e = true;
        }
        HashMap hashMap = new HashMap();
        try {
            Field declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
            if (declaredField.get(null) != null) {
                ny61.r("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
                return;
            }
        } catch (Exception unused) {
        }
        if (processGlobalConfig.a != null) {
            qp41.A.getClass();
            qxa1.c(processGlobalConfig.a);
        }
        String str = processGlobalConfig.b;
        if (str != null) {
            hashMap.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, str);
        }
        String str2 = processGlobalConfig.c;
        if (str2 != null) {
            hashMap.put(ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, str2);
        }
        if (tse0.C(sProcessGlobalConfig, hashMap)) {
            return;
        }
        kbs.g("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
    }
}
