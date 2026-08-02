package yads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.e43;

/* loaded from: classes10.dex */
public final class id2 {
    public static final List a = e43.l("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");

    public static void a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            ArrayList arrayList = new ArrayList(a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                arrayList.removeAll(xsna.rl3.u0(strArr));
                if (arrayList.isEmpty()) {
                    return;
                }
                String format = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{arrayList}, 1));
                throw new xb1(format, format);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
