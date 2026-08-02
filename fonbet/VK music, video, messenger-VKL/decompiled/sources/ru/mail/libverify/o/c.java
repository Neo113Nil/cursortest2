package ru.mail.libverify.o;

import com.ironsource.C4217a2;
import org.chromium.base.TimeUtils;

/* loaded from: classes9.dex */
public final class c {
    public static final String a(long j) {
        long j2;
        long j3;
        if (j < 0) {
            return C4217a2.f;
        }
        long j4 = j / 1000;
        String str = "S";
        if (j4 > 10) {
            if (j4 <= 60) {
                j2 = 5;
                j3 = j4 / j2;
            } else {
                str = "M";
                if (j4 <= 600) {
                    j4 /= 60;
                } else if (j4 <= TimeUtils.SECONDS_PER_HOUR) {
                    j2 = 10;
                    j3 = (j4 / 60) / j2;
                } else if (j4 <= TimeUtils.SECONDS_PER_DAY) {
                    j4 /= TimeUtils.SECONDS_PER_HOUR;
                    str = "H";
                } else {
                    j4 /= TimeUtils.SECONDS_PER_DAY;
                    str = "D";
                }
            }
            j4 = j3 * j2;
        }
        return str + j4;
    }
}
