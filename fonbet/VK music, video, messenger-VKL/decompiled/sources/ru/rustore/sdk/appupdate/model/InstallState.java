package ru.rustore.sdk.appupdate.model;

import android.os.Bundle;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class InstallState {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_BYTES_DOWNLOADED = "BYTES_DOWNLOADED";
    private static final String KEY_INSTALL_ERROR_CODE = "INSTALL_ERROR_CODE";
    private static final String KEY_INSTALL_STATUS = "INSTALL_STATUS";
    private static final String KEY_PACKAGE_NAME = "PACKAGE_NAME";
    private static final String KEY_TOTAL_BYTES_TO_DOWNLOAD = "TOTAL_BYTES_TO_DOWNLOAD";
    private final long bytesDownloaded;
    private final int installErrorCode;
    private final int installStatus;
    private final String packageName;
    private final long totalBytesToDownload;

    public static final class Companion {
        private Companion() {
        }

        public final InstallState empty$sdk_public_appupdate_release() {
            return new InstallState(0, "", 0L, 0L, 0, null);
        }

        public final InstallState of$sdk_public_appupdate_release(Bundle bundle) {
            int i = bundle.getInt(InstallState.KEY_INSTALL_STATUS, 0);
            String string = bundle.getString(InstallState.KEY_PACKAGE_NAME);
            if (string == null) {
                string = "";
            }
            return new InstallState(i, string, bundle.getLong(InstallState.KEY_BYTES_DOWNLOADED, 0L), bundle.getLong(InstallState.KEY_TOTAL_BYTES_TO_DOWNLOAD, 0L), bundle.getInt(InstallState.KEY_INSTALL_ERROR_CODE, 0), null);
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }
    }

    private InstallState(int i, String str, long j, long j2, int i2) {
        this.installStatus = i;
        this.packageName = str;
        this.bytesDownloaded = j;
        this.totalBytesToDownload = j2;
        this.installErrorCode = i2;
    }

    public final long getBytesDownloaded() {
        return this.bytesDownloaded;
    }

    public final int getInstallErrorCode() {
        return this.installErrorCode;
    }

    public final int getInstallStatus() {
        return this.installStatus;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getTotalBytesToDownload() {
        return this.totalBytesToDownload;
    }

    public /* synthetic */ InstallState(int i, String str, long j, long j2, int i2, zcl zclVar) {
        this(i, str, j, j2, i2);
    }
}
