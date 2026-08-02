package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;

/* compiled from: PhotosLinkProcessorDelegate.kt */
/* loaded from: classes11.dex */
public final class lea0 implements iaz {
    public final pga0 a;
    public final b25 b;

    public lea0(pga0 pga0Var, b25 b25Var) {
        this.a = pga0Var;
        this.b = b25Var;
    }

    @Override // xsna.iaz
    public final boolean a(peq0 peq0Var) {
        boolean m;
        m = peq0Var.m(0, "/photos_archive");
        return m;
    }

    @Override // xsna.iaz
    public final boolean b(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        this.a.d(context, this.b.c(), false);
        return true;
    }
}
