package xsna;

import android.content.Context;
import com.vk.webapp.fragments.HelpFragment;
import com.vkontakte.android.fragments.WebViewFragment;
import xsna.sw50;

/* compiled from: CommonMoneyTransferBridge.kt */
/* loaded from: classes7.dex */
public final class blg implements sw50.g {
    @Override // xsna.sw50.g
    public final void a(Context context, String str) {
        WebViewFragment.c cVar = new WebViewFragment.c(str);
        cVar.A();
        cVar.k(context);
    }

    @Override // xsna.sw50.g
    public final void b(Context context, String str) {
        int i = HelpFragment.a0;
        HelpFragment.b.d(context, null, null, str);
    }
}
