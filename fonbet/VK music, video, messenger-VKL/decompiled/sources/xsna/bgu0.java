package xsna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptySet;

/* compiled from: VkBrowserUtils.kt */
/* loaded from: classes6.dex */
public final class bgu0 {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);

    public static ArrayList a(PackageManager packageManager, Intent intent) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.packageName;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    public static boolean b(Context context, xgn0 xgn0Var, String str) {
        Object obj;
        ResolveInfo resolveInfo;
        try {
            Uri parse = Uri.parse(str);
            EmptySet emptySet = EmptySet.b;
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(jeq0.f(parse), 65536);
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                String str2 = it.next().activityInfo.packageName;
                emptySet.getClass();
            }
            List<ResolveInfo> list = queryIntentActivities;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (epx.f(((ResolveInfo) obj).activityInfo.packageName, "com.vkontakte.android")) {
                    break;
                }
            }
            ResolveInfo resolveInfo2 = (ResolveInfo) obj;
            if (resolveInfo2 == null) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        resolveInfo = 0;
                        break;
                    }
                    resolveInfo = it3.next();
                    if (epx.f(((ResolveInfo) resolveInfo).activityInfo.packageName, "com.vk.im")) {
                        break;
                    }
                }
                resolveInfo2 = resolveInfo;
            }
            if (resolveInfo2 != null) {
                Intent f = jeq0.f(parse);
                ActivityInfo activityInfo = resolveInfo2.activityInfo;
                try {
                    enj.p(context, f.setClassName(activityInfo.packageName, activityInfo.name));
                    return true;
                } catch (Exception unused) {
                }
            }
            if (gz80.a(30)) {
                try {
                    enj.p(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, parse).addCategory("android.intent.category.BROWSABLE").addFlags(1024));
                } catch (ActivityNotFoundException unused2) {
                }
            } else {
                PackageManager packageManager = context.getPackageManager();
                ArrayList a2 = a(packageManager, new Intent().setAction(CommonConstant.ACTION.HWID_SCHEME_URL).addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null)));
                Intent addCategory = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, parse).addCategory("android.intent.category.BROWSABLE");
                if (!j5g.t0(a(packageManager, addCategory), a2).isEmpty()) {
                    enj.p(context, addCategory);
                }
                xgn0Var.b(context, parse);
            }
            return true;
        } catch (Exception unused3) {
            return false;
        }
    }
}
