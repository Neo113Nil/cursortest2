package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import defpackage.qlf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class g {
    public final ICustomTabsService a;
    public final ComponentName b;

    public g(ICustomTabsService iCustomTabsService, ComponentName componentName) {
        this.a = iCustomTabsService;
        this.b = componentName;
    }

    public static String a(Context context, List list, boolean z) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public final k b(qlf qlfVar) {
        ICustomTabsService iCustomTabsService = this.a;
        CustomTabsClient$3 customTabsClient$3 = new CustomTabsClient$3(this, qlfVar);
        try {
            if (iCustomTabsService.newSession(customTabsClient$3)) {
                return new k(iCustomTabsService, customTabsClient$3, this.b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
