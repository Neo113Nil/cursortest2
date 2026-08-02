package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;

/* compiled from: PhotosLinkProcessorDelegate.kt */
/* loaded from: classes11.dex */
public final class cha0 implements iaz {
    public final pga0 a;

    public cha0(pga0 pga0Var) {
        this.a = pga0Var;
    }

    @Override // xsna.iaz
    public final boolean a(peq0 peq0Var) {
        boolean m;
        m = peq0Var.m(0, "/photos_settings");
        return m;
    }

    @Override // xsna.iaz
    public final boolean b(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        this.a.l(context);
        return true;
    }
}
