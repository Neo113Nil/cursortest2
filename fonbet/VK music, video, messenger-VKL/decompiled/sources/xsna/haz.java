package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.vk.core.activity.BaseActivity;
import com.vk.stat.scheme.SchemeStat$TypeOpenWithUrl;

/* compiled from: LinkProcessorAnalytics.kt */
/* loaded from: classes17.dex */
public final class haz {
    public static void a(Context context, Uri uri) {
        Uri uri2;
        Exception exc;
        Activity h = e3m.h(context);
        if ((h != null ? h.getIntent() : null) != null) {
            uri2 = h.getReferrer();
        } else {
            BaseActivity baseActivity = h instanceof BaseActivity ? (BaseActivity) h : null;
            if (baseActivity != null && (exc = baseActivity.f) != null) {
                com.vk.metrics.eventtracking.b.a.a(exc);
            }
            uri2 = null;
        }
        String uri3 = uri2 != null ? uri2.toString() : null;
        String str = (uri3 == null || uri3.equals("android-app://com.vkontakte.android")) ? null : uri3;
        String uri4 = uri != null ? uri.toString() : null;
        if (str == null && uri4 == null) {
            return;
        }
        kx6 kx6Var = new kx6();
        kx6Var.f = new SchemeStat$TypeOpenWithUrl(str, uri4, null, 4, null);
        kx6Var.q();
    }

    public static void b(Context context, String str) {
        a(context, Uri.parse(str));
        s3q0 s3q0Var = s3q0.a;
    }
}
