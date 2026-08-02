package xsna;

import android.os.Bundle;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes9.dex */
public final class pzy0 {
    public final AppUpdateInfo.Factory a;
    public final aiy0 b;

    public pzy0(AppUpdateInfo.Factory factory, aiy0 aiy0Var) {
        this.a = factory;
        this.b = aiy0Var;
    }

    public static Bundle a(AppUpdateInfo appUpdateInfo) {
        Bundle bundle = new Bundle();
        bundle.putLong("APPLICATION_ID", appUpdateInfo.getAppId$sdk_public_appupdate_release());
        bundle.putString("PACKAGE_NAME", appUpdateInfo.getPackageName());
        bundle.putString("APP_NAME", appUpdateInfo.getAppName$sdk_public_appupdate_release());
        bundle.putString("ICON_URL", appUpdateInfo.getIconUrl$sdk_public_appupdate_release());
        bundle.putLong("FILE_SIZE", appUpdateInfo.getFileSize());
        bundle.putString("AVAILABLE_VERSION_NAME", appUpdateInfo.getAvailableVersionName());
        long availableVersionCode = appUpdateInfo.getAvailableVersionCode();
        bundle.putInt("AVAILABLE_VERSION_CODE", (-2147483648L > availableVersionCode || availableVersionCode > 2147483647L) ? 0 : (int) availableVersionCode);
        bundle.putLong("AVAILABLE_VERSION_CODE_LONG", appUpdateInfo.getAvailableVersionCode());
        bundle.putString("whatsNew", appUpdateInfo.getWhatsNew());
        return bundle;
    }
}
