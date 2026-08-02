package ru.rustore.sdk.appupdate.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import xsna.aiy0;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class AppUpdateInfo {
    private final long appId;
    private final String appName;
    private final long availableVersionCode;
    private final String availableVersionName;
    private final long fileSize;
    private final boolean forceUpdateAvailable;
    private final String iconUrl;
    private final int installStatus;
    private boolean isUsed;
    private final String packageName;
    private final int updateAvailability;
    private final int updatePriority;
    private final String updatedAt;
    private final String whatsNew;

    public static final class Factory {
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final int DAYS_BETWEEN_10 = 10;

        @Deprecated
        public static final int DAYS_BETWEEN_20 = 20;

        @Deprecated
        public static final int DAYS_BETWEEN_3 = 3;

        @Deprecated
        public static final int DAYS_BETWEEN_30 = 30;

        @Deprecated
        public static final String UPDATED_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        private final aiy0 timeProvider;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }
        }

        public Factory(aiy0 aiy0Var) {
            this.timeProvider = aiy0Var;
        }

        private final int calcDayBetween(Date date, Date date2) {
            return (int) TimeUnit.DAYS.convert(date.getTime() - date2.getTime(), TimeUnit.MILLISECONDS);
        }

        private final boolean getForceUpdateAvailable(int i, String str) {
            this.timeProvider.getClass();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(UPDATED_FORMAT, aiy0.b);
            simpleDateFormat.setTimeZone(aiy0.c);
            int calcDayBetween = calcDayBetween(this.timeProvider.a.getTime(), simpleDateFormat.parse(str));
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                        } else if (calcDayBetween < 3) {
                            return false;
                        }
                    } else if (calcDayBetween < 10) {
                        return false;
                    }
                } else if (calcDayBetween < 20) {
                    return false;
                }
            } else if (calcDayBetween < 30) {
                return false;
            }
            return true;
        }

        public final AppUpdateInfo create$sdk_public_appupdate_release(long j, String str, String str2, long j2, String str3, String str4, long j3, int i, int i2, int i3, String str5, String str6) {
            return new AppUpdateInfo(j, str, str2, j2, str3, str4, j3, i, i2, i3, str5, getForceUpdateAvailable(i3, str5), str6, null);
        }
    }

    private AppUpdateInfo(long j, String str, String str2, long j2, String str3, String str4, long j3, int i, int i2, int i3, String str5, boolean z, String str6) {
        this.appId = j;
        this.appName = str;
        this.iconUrl = str2;
        this.fileSize = j2;
        this.packageName = str3;
        this.availableVersionName = str4;
        this.availableVersionCode = j3;
        this.installStatus = i;
        this.updateAvailability = i2;
        this.updatePriority = i3;
        this.updatedAt = str5;
        this.forceUpdateAvailable = z;
        this.whatsNew = str6;
    }

    public final long getAppId$sdk_public_appupdate_release() {
        return this.appId;
    }

    public final String getAppName$sdk_public_appupdate_release() {
        return this.appName;
    }

    public final long getAvailableVersionCode() {
        return this.availableVersionCode;
    }

    public final String getAvailableVersionName() {
        return this.availableVersionName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getIconUrl$sdk_public_appupdate_release() {
        return this.iconUrl;
    }

    public final int getInstallStatus() {
        return this.installStatus;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getUpdateAvailability() {
        return this.updateAvailability;
    }

    public final int getUpdatePriority() {
        return this.updatePriority;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getWhatsNew() {
        return this.whatsNew;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isUpdateTypeAllowed(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.updateAvailability == 2 && this.forceUpdateAvailable;
            }
            if (i != 2) {
                return false;
            }
        }
        if (this.updateAvailability != 2) {
            return false;
        }
    }

    public final boolean isUsed$sdk_public_appupdate_release() {
        return this.isUsed;
    }

    public final void markIsUsed$sdk_public_appupdate_release() {
        this.isUsed = true;
    }

    public /* synthetic */ AppUpdateInfo(long j, String str, String str2, long j2, String str3, String str4, long j3, int i, int i2, int i3, String str5, boolean z, String str6, zcl zclVar) {
        this(j, str, str2, j2, str3, str4, j3, i, i2, i3, str5, z, str6);
    }
}
