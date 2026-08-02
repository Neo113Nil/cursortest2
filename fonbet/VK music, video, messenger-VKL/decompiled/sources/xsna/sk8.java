package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BrowserSelector.java */
/* loaded from: classes15.dex */
public final class sk8 {
    public static final Intent a = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("http://www.example.com")).addCategory("android.intent.category.BROWSABLE");

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[SYNTHETIC] */
    @NonNull
    @SuppressLint({"PackageManagerGetSignatures"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(Context context) {
        int i;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        Intent intent = a;
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 131136)) {
            if (resolveInfo.filter.hasAction(CommonConstant.ACTION.HWID_SCHEME_URL) && resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") && resolveInfo.filter.schemesIterator() != null && resolveInfo.filter.authoritiesIterator() == null) {
                Iterator<String> schemesIterator = resolveInfo.filter.schemesIterator();
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (schemesIterator.hasNext()) {
                        String next = schemesIterator.next();
                        z |= "http".equals(next);
                        z2 |= HttpRequest.DEFAULT_SCHEME.equals(next);
                        if (z && z2) {
                            try {
                                PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.packageName, 64);
                                String str2 = resolveInfo.activityInfo.packageName;
                                Intent intent2 = new Intent();
                                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                                intent2.setPackage(str2);
                                if (packageManager.resolveService(intent2, 0) != null) {
                                    i = 1;
                                    nk8 nk8Var = new nk8(packageInfo, true);
                                    if (resolveInfo.activityInfo.packageName.equals(str)) {
                                        arrayList.add(0, nk8Var);
                                        nk8 nk8Var2 = new nk8(packageInfo, false);
                                        if (resolveInfo.activityInfo.packageName.equals(str)) {
                                            arrayList.add(nk8Var2);
                                        } else {
                                            arrayList.add(i, nk8Var2);
                                        }
                                    } else {
                                        arrayList.add(nk8Var);
                                    }
                                }
                                i = 0;
                                nk8 nk8Var22 = new nk8(packageInfo, false);
                                if (resolveInfo.activityInfo.packageName.equals(str)) {
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
