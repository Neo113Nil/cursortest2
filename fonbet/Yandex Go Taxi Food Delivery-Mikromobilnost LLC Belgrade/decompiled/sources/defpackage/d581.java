package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import yads.q91;

/* loaded from: classes7.dex */
public final class d581 {
    public static final List a = scc.g("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");

    public static void a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            ArrayList arrayList = new ArrayList(a);
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                arrayList.removeAll(j73.d0(strArr));
                if (arrayList.isEmpty()) {
                } else {
                    throw new q91(String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{arrayList}, 1)));
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
