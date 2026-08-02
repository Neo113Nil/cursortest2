package xsna;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.common.links.LaunchContext;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.LinkRedirActivity;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vkontakte.android.fragments.AwayWebViewFragment;
import com.vkontakte.android.fragments.WebViewFragment;
import com.vkontakte.android.sharing.SharingExternalActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import xsna.y390;

/* compiled from: BaseBrowserRouter.kt */
/* loaded from: classes.dex */
public abstract class h76 implements rk8 {
    public static LaunchContext b;
    public final Regex a = new Regex("^(away|m)\\.vk\\.com$");

    public static void l(Context context, Intent intent, boolean z) {
        Uri data;
        ResolveInfo resolveInfo;
        if (Preference.j().getBoolean("useChromeCustomTabs", true) && (data = intent.getData()) != null) {
            if (z) {
                Set<String> set = xk8.a;
                resolveInfo = xk8.b(context, data);
            } else {
                resolveInfo = null;
            }
            if (resolveInfo != null) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                intent.putExtra("auto_choose_browser", true);
            }
            intent.putExtra("android.support.customtabs.extra.SESSION", (Parcelable) null);
            intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", dhr0.t.c(R.attr.vk_ui_header_background));
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
            Intent intent2 = new Intent(context, (Class<?>) LinkRedirActivity.class);
            intent2.setAction("android.intent.action.SEND");
            Bitmap f = kd7.f(enj.e(R.drawable.vk_icon_share_external_24, R.attr.vk_ui_icon_primary, context));
            if (f == null) {
                tv4.b("Share icon is null!", com.vk.metrics.eventtracking.b.a);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.customaction.ICON", f);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", t2i0.a(context, 0, intent2, 33554432));
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", context.getString(R.string.sys_share_link));
            intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        }
    }

    public static void n(Intent intent, String str, LaunchContext launchContext) {
        UiTracker.h.e = new UiTracker.AwayParams(UiTracker.AwayParams.Type.EXTERNAL_LINK, str, launchContext != null ? launchContext.q() : null);
        boolean hasExtra = intent.hasExtra("auto_choose_browser");
        ComponentName component = intent.getComponent();
        String packageName = component != null ? component.getPackageName() : null;
        b.d a = io.reactivex.rxjava3.processors.b.a("ui_click_link", "url", str);
        a.b(Integer.valueOf(!Preference.j().getBoolean("useChromeCustomTabs", true) ? 1 : 0), "browser_type");
        a.b(Boolean.valueOf(hasExtra), "auto");
        if (hasExtra) {
            a.b(packageName, "auto_browser_name");
        }
        a.e();
    }

    public static boolean o(Context context, Uri uri) {
        Intent addCategory = jeq0.f(uri).addCategory("android.intent.category.BROWSABLE");
        Set<String> set = xk8.a;
        ListBuilder d = xk8.d(context.getPackageManager());
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = d.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                break;
            }
            ResolveInfo resolveInfo = (ResolveInfo) aVar.next();
            Intent intent = new Intent(addCategory);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            arrayList.add(intent.setClassName(activityInfo.packageName, activityInfo.name));
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        try {
            context.startActivity(Intent.createChooser((Intent) arrayList.remove(0), null).putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0])));
            return true;
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            return false;
        }
    }

    public static boolean p(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || scheme.length() == 0) {
            uri = Uri.parse("https://" + uri);
        }
        Set<String> set = xk8.a;
        ResolveInfo f = xk8.f(context.getPackageManager());
        if (f == null) {
            return false;
        }
        Intent addCategory = jeq0.f(uri).addCategory("android.intent.category.BROWSABLE");
        try {
            ActivityInfo activityInfo = f.activityInfo;
            addCategory.setClassName(activityInfo.packageName, activityInfo.name);
            context.startActivity(addCategory);
            return true;
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            return false;
        }
    }

    @Override // xsna.rk8
    public final void a(Context context, Uri uri) {
        LaunchContext launchContext = b;
        if (launchContext != null) {
            m(context, uri, launchContext, true);
        }
    }

    @Override // xsna.rk8
    public final Uri b(Uri uri, Map<String, String> map, Bundle bundle) {
        Object failure;
        Iterable iterable;
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        if (!o260Var.h().isEnabled()) {
            dsw<UserId, v390> dswVar = y390.a;
            v390 a = y390.a.a();
            boolean z = a.l;
            if (!a.a()) {
                z = false;
            }
            if (!z) {
                try {
                    failure = uri.getHost();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                String str = (String) (failure instanceof Result.Failure ? null : failure);
                if (str == null) {
                    str = uri.toString();
                }
                uvn uvnVar = a.j;
                if (!a.a()) {
                    iterable = EmptySet.b;
                } else if (uvnVar == null || (iterable = uvnVar.a) == null) {
                    iterable = EmptySet.b;
                }
                Iterable<String> iterable2 = iterable;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    for (String str2 : iterable2) {
                        if (!str.equals(str2)) {
                            if (brm0.v(str, "." + str2, false)) {
                            }
                        }
                    }
                }
                HashSet<String> hashSet = ju5.a;
                String string = Preference.j().getString("awayPhpDomain", ju5.f());
                if (string == null) {
                    string = ju5.f();
                }
                Uri.Builder d = ju5.d(string);
                ju5.a(d, bundle);
                Uri build = d.build();
                if (!naz.q(build) || !build.getQueryParameterNames().containsAll(rl3.y0(new String[]{"m_puad", "m_puad_expire"}))) {
                    Uri.Builder buildUpon = build.buildUpon();
                    t31 a2 = pc0.a();
                    if (a2 != null) {
                        long b2 = a2.b();
                        xuo0.a.getClass();
                        if (b2 - xuo0.c() > 0) {
                            buildUpon.appendQueryParameter("m_puad", a2.a());
                            buildUpon.appendQueryParameter("m_puad_expire", String.valueOf(a2.b()));
                            build = buildUpon.build();
                        }
                    }
                    pc0.c(true);
                    build = buildUpon.build();
                }
                Uri.Builder buildUpon2 = build.buildUpon();
                ju5.c(buildUpon2, map);
                ju5.b(buildUpon2, uri);
                return Uri.parse(v390.b(buildUpon2.build().toString(), a.c(a.i)));
            }
        }
        return uri;
    }

    @Override // xsna.rk8
    public final void c(Context context, Bundle bundle, LaunchContext launchContext, String str) {
        Uri parse = Uri.parse(naz.a(str));
        if (parse == null) {
            return;
        }
        e(context, parse, launchContext, bundle, true);
    }

    @Override // xsna.rk8
    public final void d(Context context, Uri uri, boolean z) {
        WebViewFragment.c cVar = new WebViewFragment.c(uri);
        cVar.E();
        if (z) {
            cVar.A();
        }
        if (naz.t(uri)) {
            cVar.M();
            cVar.N(true);
            cVar.K();
            cVar.J(uri.toString());
            cVar.y();
            cVar.s(true);
        }
        cVar.k(context);
    }

    @Override // xsna.rk8
    public final void e(Context context, Uri uri, LaunchContext launchContext, Bundle bundle, boolean z) {
        String str;
        ActivityInfo activityInfo;
        HashSet<String> hashSet = ju5.a;
        Uri e = ju5.g(uri.getHost()) ? ju5.e(uri) : uri;
        Uri b2 = b(e, null, bundle);
        CoreFeatures coreFeatures = CoreFeatures.AWAY_THROUGH_WEB_VIEW;
        coreFeatures.getClass();
        if (!com.vk.toggle.b.A.a(coreFeatures)) {
            m(context, b2, launchContext, z);
            return;
        }
        Set<String> set = xk8.a;
        ResolveInfo b3 = xk8.b(context, b2);
        if ((b3 != null ? b3.match : 0) >= 3145728) {
            m(context, uri, launchContext, z);
            return;
        }
        Set a = pok.a();
        if (b3 == null || (activityInfo = b3.activityInfo) == null || (str = activityInfo.packageName) == null) {
            str = "";
        }
        if (a.contains(str)) {
            m(context, b2, launchContext, z);
        } else {
            b = launchContext;
            context.startActivity(new AwayWebViewFragment.a(b2.toString(), e.toString()).n(context));
        }
    }

    @Override // xsna.rk8
    public final void f(Context context, Bundle bundle, LaunchContext launchContext, String str) {
        Uri parse = Uri.parse(str);
        if (launchContext.s() && (p(context, parse) || o(context, parse))) {
            return;
        }
        ((t13) this).i(context, parse, launchContext, bundle);
    }

    @Override // xsna.rk8
    public final void h(Context context, String str) {
        try {
            if ((context instanceof Activity) && ((Activity) context).isTaskRoot()) {
                ((Activity) context).startActivity(new Intent(context, (Class<?>) MainActivity.class));
            }
            Intent intent = new Intent(context, (Class<?>) SharingExternalActivity.class);
            context.startActivity(intent.putExtra("android.intent.extra.TEXT", str).putExtra("_internal", true).setType("text/plain"));
            n(intent, str, null);
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }

    @Override // xsna.rk8
    public final void k(Context context, String str, int i, String str2) {
        WebViewFragment.c cVar = new WebViewFragment.c(str);
        cVar.H(str2);
        cVar.F(false, true);
        cVar.w(dhr0.C().c);
        cVar.s(true);
        cVar.h(e3m.h(context), i);
    }

    public final void m(Context context, Uri uri, LaunchContext launchContext, boolean z) {
        Intent f = jeq0.f(uri);
        boolean z2 = false;
        f.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", new Parcelable[]{new ComponentName(context, (Class<?>) LinkRedirActivity.class)});
        f.addCategory("android.intent.category.BROWSABLE");
        if (launchContext != null && launchContext.p()) {
            z2 = true;
        }
        try {
            if ((Preference.j().getBoolean("useChromeCustomTabs", true) && !z2) || (!p(context, uri) && !o(context, uri))) {
                l(context, f, z);
                context.startActivity(f);
            }
            n(f, uri.toString(), launchContext);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
            cvk.u(R.string.error_browser, false);
        }
    }
}
