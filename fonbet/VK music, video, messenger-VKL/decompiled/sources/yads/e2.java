package yads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* loaded from: classes10.dex */
public final class e2 {
    public static final String b = "com.yandex.mobile.ads.common.AdActivity";
    public static final String c = "There is no presence of com.yandex.mobile.ads.common.AdActivity activity in AndroidManifest file.";
    public final v1 a = new v1();

    public final void a(Context context) {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), b), 0);
            this.a.getClass();
            v1.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = c;
            throw new xb1(str, str);
        }
    }
}
