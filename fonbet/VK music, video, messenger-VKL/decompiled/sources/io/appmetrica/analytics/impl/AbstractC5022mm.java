package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import xsna.gzs;
import xsna.rl3;

/* renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5022mm {
    public static final Set a = rl3.y0(new String[]{"appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID});
    public static final SystemTimeProvider b = new SystemTimeProvider();
    public static final O3 c = new O3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(C5100pm c5100pm, Collection collection, Map map, gzs gzsVar) {
        boolean a2;
        if (collection != null && !collection.isEmpty() && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case -1367801046:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                            break;
                        } else {
                            a2 = a(c5100pm.d);
                            if (a2) {
                                return false;
                            }
                        }
                    case 155670667:
                        if (!str.equals("appmetrica_get_ad_url")) {
                            break;
                        } else {
                            a2 = a(c5100pm.i);
                            if (a2) {
                            }
                        }
                        break;
                    case 299713912:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                            break;
                        } else {
                            a2 = a(c5100pm.b);
                            if (a2) {
                            }
                        }
                        break;
                    case 530949152:
                        if (!str.equals("appmetrica_clids")) {
                            break;
                        } else {
                            O3 o3 = c;
                            L3 l3 = (L3) gzsVar.invoke();
                            o3.getClass();
                            a2 = O3.a(map, c5100pm, l3);
                            if (a2) {
                            }
                        }
                        break;
                    case 703740463:
                        if (!str.equals("appmetrica_report_ad_url")) {
                            break;
                        } else {
                            a2 = a(c5100pm.j);
                            if (a2) {
                            }
                        }
                        break;
                    case 1117383061:
                        if (!str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                            break;
                        } else {
                            a2 = a(c5100pm.a);
                            if (a2) {
                            }
                        }
                        break;
                }
                if (c5100pm.w) {
                    return false;
                }
                if (b.currentTimeSeconds() > c5100pm.o + c5100pm.z.a) {
                    return false;
                }
            }
        }
        return true;
    }
}
