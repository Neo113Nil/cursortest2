package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vkontakte.android.fragments.WebViewFragment;

/* compiled from: VkCxHubLinkProcessorDelegate.kt */
/* loaded from: classes11.dex */
public final class wou0 implements iaz {
    @Override // xsna.iaz
    public final boolean a(peq0 peq0Var) {
        Boolean bool;
        String r = peq0Var.r("to");
        if (r != null) {
            bool = Boolean.valueOf(r.length() > 0);
        } else {
            bool = null;
        }
        return epx.f(bool, Boolean.TRUE);
    }

    @Override // xsna.iaz
    public final boolean b(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        WebViewFragment.c cVar = new WebViewFragment.c(peq0Var.h());
        cVar.A();
        cVar.F(false, true);
        cVar.k(context);
        return true;
    }
}
