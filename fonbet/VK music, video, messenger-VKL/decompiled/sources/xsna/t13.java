package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.common.links.LaunchContext;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.ValidationActivity;
import java.util.Set;
import kotlin.text.Regex;

/* compiled from: AppBrowserRouter.kt */
/* loaded from: classes.dex */
public final class t13 extends h76 {
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xsna.rk8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Context context, Uri uri, LaunchContext launchContext, Bundle bundle) {
        ResolveInfo f;
        boolean z;
        Intent intent;
        if (launchContext.s()) {
            return;
        }
        if (launchContext.h()) {
            Intent intent2 = new Intent(context, (Class<?>) ValidationActivity.class);
            intent2.putExtra("url", uri.toString());
            Context context2 = context;
            while (true) {
                z = context2 instanceof Activity;
                if (z || !(context2 instanceof ContextWrapper)) {
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            Activity activity = z ? (Activity) context2 : null;
            if (activity != null && (intent = activity.getIntent()) != null && intent.hasExtra("device_token")) {
                intent2.putExtra("device_token", activity.getIntent().getStringExtra("device_token"));
            }
            try {
                context.startActivity(intent2);
                return;
            } catch (Throwable th) {
                L.l(ms9.b("error: ", th));
                cvk.u(R.string.error_browser, false);
                return;
            }
        }
        L.l(i6n0.a(uri, "unrecognized link: "));
        String uri2 = uri.toString();
        Uri parse = !naz.g(uri2) ? Uri.parse(naz.a(uri2)) : uri;
        if (naz.u(parse)) {
            if (!epx.f("m.".concat(a0a.d), parse.getAuthority()) && !"m.vk.com".equals(parse.getAuthority())) {
                return;
            } else {
                parse = parse.buildUpon().scheme("http").build();
            }
        }
        if (naz.p(parse)) {
            Regex regex = this.a;
            String authority = parse.getAuthority();
            if (authority == null) {
                authority = "";
            }
            if (!regex.f(authority)) {
                parse = parse.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build();
                if (Preference.j().getBoolean("useChromeCustomTabs", true) || launchContext.p() || !pok.b(context, uri)) {
                    Intent addCategory = jeq0.f(parse).addCategory("android.intent.category.BROWSABLE");
                    Set<String> set = xk8.a;
                    f = xk8.f(context.getPackageManager());
                    if (f != null) {
                        try {
                            ActivityInfo activityInfo = f.activityInfo;
                            addCategory.setClassName(activityInfo.packageName, activityInfo.name);
                            if (!launchContext.p()) {
                                h76.l(context, addCategory, false);
                            }
                            fdi.f(context, addCategory);
                            context.startActivity(addCategory);
                            h76.n(addCategory, String.valueOf(addCategory.getData()), launchContext);
                            return;
                        } catch (Throwable th2) {
                            com.vk.metrics.eventtracking.b.a.a(th2);
                        }
                    }
                    if (h76.o(context, parse)) {
                        cvk.u(R.string.error_browser, false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (launchContext.j()) {
            parse = b(parse, null, bundle);
        }
        if (Preference.j().getBoolean("useChromeCustomTabs", true)) {
        }
        Intent addCategory2 = jeq0.f(parse).addCategory("android.intent.category.BROWSABLE");
        Set<String> set2 = xk8.a;
        f = xk8.f(context.getPackageManager());
        if (f != null) {
        }
        if (h76.o(context, parse)) {
        }
    }
}
