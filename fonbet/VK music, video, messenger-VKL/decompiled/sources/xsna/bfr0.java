package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.preference.Preference;
import com.vk.webapp.fragments.NeedChangePasswordFragment;
import xsna.ext;

/* compiled from: VKSessionDataHandler.java */
/* loaded from: classes7.dex */
public final class bfr0 implements Runnable {
    public final /* synthetic */ ext.b b;

    public bfr0(ext.b bVar) {
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.b.c;
        int i = NeedChangePasswordFragment.a0;
        NeedChangePasswordFragment.a aVar = new NeedChangePasswordFragment.a(NeedChangePasswordFragment.class, null, null);
        Bundle bundle = aVar.j;
        Uri.Builder a = er.a(HttpRequest.DEFAULT_SCHEME);
        Context context = e43.a;
        bundle.putString("key_url", a.authority(Preference.g(context != null ? context : null).getString("vkUiHostUri", "static.".concat(a0a.d))).appendPath("security").appendQueryParameter("security_issue", str).build().toString());
        bundle.putBoolean("key_no_close", epx.f(str, "suspicious_login"));
        aVar.k(e43.a);
    }
}
