package xsna;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class dp01 {
    public static final lq01 c = new lq01("SplitInstallInfoProvider");
    public final Context a;
    public final String b;

    public dp01(Context context) {
        this.a = context;
        this.b = context.getPackageName();
    }

    public static boolean c(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final HashSet d(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        Iterator it = e(packageInfo).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!c(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final HashSet e(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        lq01 lq01Var = c;
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                lq01Var.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(StringUtils.COMMA, -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            lq01Var.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            lq01Var.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        wn01 wn01Var = (wn01) mo01.a.get();
        if (wn01Var != null) {
            hashSet.addAll(wn01Var.zza());
        }
        return hashSet;
    }

    @Nullable
    public final ti01 a(@Nullable Bundle bundle) {
        lq01 lq01Var = c;
        if (bundle == null) {
            lq01Var.e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = bundle.getInt("com.android.vending.splits");
        if (i == 0) {
            lq01Var.e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            ti01 q = kn4.q(this.a.getResources().getXml(i), new nf01());
            if (q == null) {
                lq01Var.e("Can't parse languages metadata.", new Object[0]);
            }
            return q;
        } catch (Resources.NotFoundException unused) {
            lq01Var.e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final HashSet b() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.a.getPackageManager().getPackageInfo(this.b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            c.b("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        return (packageInfo == null || packageInfo.applicationInfo == null) ? new HashSet() : d(packageInfo);
    }
}
