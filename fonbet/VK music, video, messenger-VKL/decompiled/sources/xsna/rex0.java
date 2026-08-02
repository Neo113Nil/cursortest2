package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vkontakte.android.fragments.WebViewFragment;

/* compiled from: WebAppLinksBridge.kt */
/* loaded from: classes11.dex */
public final class rex0 implements xgn0 {
    public static final rex0 a = new rex0();

    @Override // xsna.xgn0
    public final void a(long j, Context context, Integer num, String str) {
        WebViewFragment.c cVar = new WebViewFragment.c(str);
        cVar.E();
        cVar.C();
        cVar.G(j);
        cVar.B();
        cVar.I(false);
        cVar.A();
        if (num != null) {
            cVar.i(xa4.L(context), num.intValue());
        } else {
            cVar.k(context);
        }
    }

    @Override // xsna.xgn0
    public final void b(Context context, Uri uri) {
        xwk.d().getBrowser().i(context, uri, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108863), null);
    }

    public final boolean c(Context context, String str) {
        return xwk.d().e().a(context, str);
    }
}
