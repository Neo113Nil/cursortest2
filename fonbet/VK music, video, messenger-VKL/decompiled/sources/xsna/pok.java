package xsna;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;
import xsna.mok;

/* compiled from: CustomTabsUtils.kt */
/* loaded from: classes17.dex */
public final class pok {
    public static final bpn0 a = new bpn0(new f20(11));

    public static Set a() {
        return (Set) a.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        if (r5.contains("com.chrome.beta") != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(Context context, Uri uri) {
        PackageManager packageManager = context.getPackageManager();
        Intent addCategory = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri).addCategory("android.intent.category.BROWSABLE");
        ResolveInfo f = xk8.f(packageManager);
        String str = null;
        String str2 = f != null ? f.activityInfo.packageName : null;
        ListBuilder d = xk8.d(packageManager);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = d.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                break;
            }
            ResolveInfo resolveInfo = (ResolveInfo) aVar.next();
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            String str3 = packageManager.resolveService(intent, 0) == null ? null : resolveInfo.activityInfo.packageName;
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                str = (String) j5g.Y(arrayList);
            } else {
                if (!arrayList.isEmpty()) {
                    try {
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(addCategory, 64);
                        if (queryIntentActivities.size() != 0) {
                            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ResolveInfo next = it.next();
                                IntentFilter intentFilter = next.filter;
                                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next.activityInfo != null) {
                                    if (j5g.P(arrayList, str2)) {
                                        str = str2;
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        L.i(e);
                    }
                }
                String str4 = "com.android.chrome";
                if (!arrayList.contains("com.android.chrome")) {
                    str4 = "com.chrome.dev";
                    if (!arrayList.contains("com.chrome.dev")) {
                        str4 = "com.google.android.apps.chrome";
                        if (!arrayList.contains("com.google.android.apps.chrome")) {
                            str4 = "com.chrome.beta";
                        }
                    }
                }
                str = str4;
            }
        }
        if (str == null) {
            return false;
        }
        abg0 abg0Var = dhr0.t;
        Bitmap f2 = kd7.f(abg0Var.b(R.drawable.vk_icon_back_24, R.attr.vk_ui_icon_accent_themed));
        try {
            mok.a aVar2 = new mok.a();
            Intent intent2 = aVar2.a;
            intent2.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
            int c = abg0Var.c(R.attr.vk_ui_header_background) | (-16777216);
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", c);
            aVar2.d = bundle;
            aVar2.c = ActivityOptions.makeCustomAnimation(context, android.R.anim.fade_in, android.R.anim.fade_out).toBundle();
            intent2.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            if (f2 != null) {
                intent2.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", f2);
            }
            mok a2 = aVar2.a();
            Intent intent3 = a2.a;
            intent3.setPackage(str);
            intent3.addFlags(268435457);
            Intent intent4 = a2.a;
            intent4.setData(uri);
            context.startActivity(intent4, a2.b);
            return true;
        } catch (Throwable th) {
            L.e("An error occurred " + th.getMessage() + " \n url: " + uri);
            com.vk.metrics.eventtracking.b.a.q(th);
            return false;
        }
    }
}
