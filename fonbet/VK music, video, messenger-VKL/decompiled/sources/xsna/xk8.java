package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vkontakte.android.LinkRedirActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;
import kotlin.random.Random;

/* compiled from: BrowsersResolver.kt */
/* loaded from: classes17.dex */
public final class xk8 {
    public static final Set<String> a = rl3.y0(new String[]{"com.vkontakte.android", "com.vk.im", "com.vk.calls"});

    public static Uri a() {
        Random.b.getClass();
        int l = Random.c.l(10, 20);
        char[] cArr = new char[l];
        for (int i = 0; i < l; i++) {
            Random.b.getClass();
            cArr[i] = (char) (Random.c.k(26) + 97);
        }
        return Uri.parse("https://" + new String(cArr) + '/');
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e3, code lost:
    
        if (r8 != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ResolveInfo b(Context context, Uri uri) {
        String authority;
        boolean z;
        boolean z2;
        boolean z3;
        ActivityInfo activityInfo;
        String path;
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo f = f(packageManager);
        ListBuilder d = d(packageManager);
        boolean z4 = f != null;
        String uri2 = uri.toString();
        String authority2 = uri.getAuthority();
        if (((authority2 == null || !brm0.v(cqm0.m(authority2), ".".concat(a0a.d), false)) && ((authority = uri.getAuthority()) == null || !authority.equalsIgnoreCase(a0a.d))) || (path = uri.getPath()) == null || !drm0.D(path, "/away", false) || uri.getQueryParameter("to") == null || uri.getQueryParameter("to") == null) {
            z = false;
        } else {
            uri2 = uri.getQueryParameter("to");
            z = true;
        }
        ResolveInfo resolveInfo = ((z || !z4) && !d.isEmpty()) ? (ResolveInfo) j5g.Y(d) : null;
        Uri parse = Uri.parse(uri2);
        PackageManager packageManager2 = context.getPackageManager();
        ResolveInfo resolveActivity = packageManager2.resolveActivity(jeq0.f(parse).addCategory("android.intent.category.BROWSABLE"), 65600);
        if (resolveActivity != null) {
            ResolveInfo f2 = f(packageManager2);
            ActivityInfo activityInfo2 = resolveActivity.activityInfo;
            if (!epx.f(activityInfo2 != null ? activityInfo2.name : null, fpf0.a(LinkRedirActivity.class).l())) {
                ActivityInfo activityInfo3 = resolveActivity.activityInfo;
                if (!epx.f(activityInfo3 != null ? activityInfo3.packageName : null, context.getPackageName())) {
                    z2 = true;
                    z3 = resolveActivity.filter == null;
                    ActivityInfo activityInfo4 = resolveActivity.activityInfo;
                    boolean f3 = epx.f(activityInfo4 == null ? activityInfo4.packageName : null, (f2 != null || (activityInfo = f2.activityInfo) == null) ? null : activityInfo.packageName);
                    if (z3) {
                        if (!f3) {
                        }
                    }
                }
            }
            z2 = false;
            if (resolveActivity.filter == null) {
            }
            ActivityInfo activityInfo42 = resolveActivity.activityInfo;
            boolean f32 = epx.f(activityInfo42 == null ? activityInfo42.packageName : null, (f2 != null || (activityInfo = f2.activityInfo) == null) ? null : activityInfo.packageName);
            if (z3) {
            }
        }
        resolveActivity = null;
        boolean z5 = resolveInfo != null;
        if (resolveActivity == null || z5) {
            return resolveActivity == null ? resolveInfo : resolveActivity;
        }
        return null;
    }

    public static ListBuilder c(PackageManager packageManager, Uri uri) {
        ActivityInfo activityInfo;
        Intent addCategory = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri).addCategory("android.intent.category.BROWSABLE");
        ResolveInfo resolveActivity = packageManager.resolveActivity(addCategory, 65536);
        String str = (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) ? null : activityInfo.packageName;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(addCategory, 131136);
        ListBuilder e = e43.e();
        int i = 0;
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (!a.contains(str2)) {
                IntentFilter intentFilter = resolveInfo.filter;
                boolean[] zArr = {intentFilter != null, intentFilter.hasAction(CommonConstant.ACTION.HWID_SCHEME_URL), intentFilter.hasCategory("android.intent.category.BROWSABLE")};
                int i2 = 0;
                while (true) {
                    if (i2 >= 3) {
                        break;
                    }
                    if (zArr[i2]) {
                        Iterator<String> schemesIterator = intentFilter.schemesIterator();
                        boolean z = false;
                        boolean z2 = false;
                        while (schemesIterator.hasNext()) {
                            String next = schemesIterator.next();
                            z = z || "http".equals(next);
                            z2 = z2 || HttpRequest.DEFAULT_SCHEME.equals(next);
                            if (z && z2) {
                                break;
                            }
                        }
                        boolean z3 = z && z2;
                        if (intentFilter.hasCategory("android.intent.category.APP_BROWSER") || (z3 && intentFilter.countDataAuthorities() == 0)) {
                            boolean z4 = packageManager.resolveService(new Intent("android.support.customtabs.action.CustomTabsService").setPackage(str2), 0) != null;
                            boolean f = epx.f(str2, str);
                            if (f && z4) {
                                e.add(i, resolveInfo);
                                i++;
                            } else if (f) {
                                e.add(i, resolveInfo);
                            } else {
                                e.add(resolveInfo);
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
        return e.g();
    }

    public static /* synthetic */ ListBuilder d(PackageManager packageManager) {
        return c(packageManager, a());
    }

    public static ResolveInfo e(PackageManager packageManager, Uri uri, boolean z) {
        ActivityInfo activityInfo;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri).addCategory("android.intent.category.BROWSABLE"), 65536);
        if (resolveActivity != null) {
            ListBuilder c = c(packageManager, uri);
            if (z) {
                return (ResolveInfo) j5g.a0(c);
            }
            ResolveInfo resolveInfo = (ResolveInfo) j5g.a0(c);
            if (epx.f((resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) ? null : activityInfo.packageName, resolveActivity.activityInfo.packageName)) {
                return resolveActivity;
            }
        }
        return null;
    }

    public static /* synthetic */ ResolveInfo f(PackageManager packageManager) {
        return e(packageManager, a(), false);
    }
}
