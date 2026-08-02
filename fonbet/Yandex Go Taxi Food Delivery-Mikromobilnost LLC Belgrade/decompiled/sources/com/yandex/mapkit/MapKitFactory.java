package com.yandex.mapkit;

import android.content.Context;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadInitializer;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadManager;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.i18n.I18nManagerFactory;
import defpackage.ny61;
import defpackage.qke;

/* loaded from: classes8.dex */
public final class MapKitFactory {
    private static String apiKey_;
    private static boolean initialized_;
    private static String locale_;
    private static String userId_;

    private static void checkApiKey() {
        String str = apiKey_;
        if (str == null || str.isEmpty()) {
            ny61.f("You need to set the API key before using MapKit!");
        }
    }

    private static void checkPermission(Context context, String str) {
        if (qke.h(context, str) == 0) {
            return;
        }
        ny61.f(str.concat(" permission must be granted"));
    }

    private static void checkPermissions(Context context) {
        checkPermission(context, "android.permission.ACCESS_NETWORK_STATE");
        checkPermission(context, "android.permission.INTERNET");
    }

    public static native MapKit getInstance();

    public static synchronized void initialize(Context context) {
        synchronized (MapKitFactory.class) {
            try {
                checkPermissions(context);
                checkApiKey();
                Runtime.init(context);
                I18nManagerFactory.setLocale(locale_);
                getInstance().setApiKey(apiKey_);
                String str = userId_;
                if (str != null && !str.isEmpty()) {
                    getInstance().setUserId(userId_);
                }
                initialized_ = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void initializeBackgroundDownload(Context context, BackgroundDownloadInitializer backgroundDownloadInitializer) {
        synchronized (MapKitFactory.class) {
            BackgroundDownloadManager.initialize(backgroundDownloadInitializer, context);
        }
    }

    public static synchronized void setApiKey(String str) {
        synchronized (MapKitFactory.class) {
            if (initialized_) {
                throw new AssertionError("setApiKey() should be called before initialize()!");
            }
            apiKey_ = str;
        }
    }

    public static synchronized void setLocale(String str) {
        synchronized (MapKitFactory.class) {
            if (initialized_) {
                throw new AssertionError("setLocale() should be called before initialize()!");
            }
            locale_ = str;
        }
    }

    public static synchronized void setUserId(String str) {
        synchronized (MapKitFactory.class) {
            if (initialized_) {
                throw new AssertionError("setUserId() should be called before initialize()!");
            }
            userId_ = str;
        }
    }
}
