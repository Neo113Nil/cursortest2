package org.chromium.net.impl;

import android.os.SystemProperties;
import java.util.Map;

/* loaded from: classes11.dex */
public final class AndroidOsSystemProperties {
    private static Map<String, String> sOverridesForTesting;

    /* loaded from: classes8.dex */
    public static final class WithOverridesForTesting implements AutoCloseable {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public WithOverridesForTesting(Map<String, String> map) {
            AndroidOsSystemProperties.sOverridesForTesting = map;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            AndroidOsSystemProperties.sOverridesForTesting = null;
        }
    }

    public static String get(String str, String str2) {
        Map<String, String> map = sOverridesForTesting;
        if (map == null) {
            return SystemProperties.get(str, str2);
        }
        String str3 = map.get(str);
        return str3 != null ? str3 : str2;
    }
}
