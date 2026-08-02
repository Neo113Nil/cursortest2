package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import xsna.up;

@DoNotInline
@TargetApi(28)
/* loaded from: classes8.dex */
public final class G2 {
    public static final G2 a = new G2();

    private G2() {
    }

    public static final J2 a(Context context, C5054o2 c5054o2) {
        return new J2((I2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new xsna.p7(c5054o2, 29)), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new up(14)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I2 a(C5054o2 c5054o2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c5054o2.getClass();
        if (!AndroidUtils.isApiAchieved(28)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
            return I2.RESTRICTED;
        }
        if (appStandbyBucket == 5) {
            return I2.EXEMPTED;
        }
        if (appStandbyBucket == 10) {
            return I2.ACTIVE;
        }
        if (appStandbyBucket == 30) {
            return I2.FREQUENT;
        }
        if (appStandbyBucket == 20) {
            return I2.WORKING_SET;
        }
        if (appStandbyBucket == 40) {
            return I2.RARE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        return Boolean.valueOf(activityManager.isBackgroundRestricted());
    }
}
