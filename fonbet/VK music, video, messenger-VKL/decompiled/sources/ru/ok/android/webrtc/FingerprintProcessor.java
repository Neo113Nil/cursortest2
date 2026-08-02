package ru.ok.android.webrtc;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.or;

/* loaded from: classes9.dex */
public class FingerprintProcessor {
    public boolean a = false;
    public final FingerprintChangedListener b;
    public long localFp;
    public long remoteFp;

    public interface FingerprintChangedListener {
        void onFingerprintChanged(long j);
    }

    public FingerprintProcessor(FingerprintChangedListener fingerprintChangedListener) {
        if (fingerprintChangedListener != null) {
            this.b = fingerprintChangedListener;
        } else {
            this.b = new or(13);
        }
    }

    public static /* synthetic */ void a(long j) {
    }

    public static long a(String str) {
        String str2 = null;
        for (String str3 : str.split("\n")) {
            if (str3.startsWith("a=fingerprint")) {
                String[] split = str3.split(" ");
                if (split.length == 2) {
                    str2 = split[1];
                }
            }
        }
        if (str2 == null) {
            return -1L;
        }
        long j = 0;
        for (int min = Math.min(7, str2.split(StringUtils.PROCESS_POSTFIX_DELIMITER).length - 1); min >= 0; min--) {
            j = (j << 8) | Integer.parseInt(r7[min], 16);
        }
        return j;
    }
}
