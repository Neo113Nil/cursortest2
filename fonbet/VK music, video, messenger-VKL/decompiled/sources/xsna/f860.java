package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;

/* compiled from: PhotosLinkProcessorDelegate.kt */
/* loaded from: classes11.dex */
public final class f860 implements iaz {
    @Override // xsna.iaz
    public final boolean a(peq0 peq0Var) {
        boolean m;
        m = peq0Var.m(0, "/photos_new_tags");
        return m;
    }

    @Override // xsna.iaz
    public final boolean b(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        new lca0(o25.a().c(), Integer.MAX_VALUE, Integer.MAX_VALUE).k(context);
        return true;
    }
}
