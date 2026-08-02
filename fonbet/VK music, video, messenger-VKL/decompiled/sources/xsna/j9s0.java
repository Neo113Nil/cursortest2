package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import xsna.oap;

/* compiled from: VideoCatalogLink2.kt */
/* loaded from: classes14.dex */
public final class j9s0 implements kss0 {
    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        String path;
        boolean h = jh.h("/video(s|(/(.*)))?", peq0Var, null, null, 14);
        Uri uri = peq0Var.a;
        String host = uri.getHost();
        return !(host == null || !drm0.D(host, "vkvideo", false) || !jh.h("/.*", peq0Var, null, null, 14) || (path = uri.getPath()) == null || brm0.B(path, "/app", false)) || h;
    }

    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        oap.a aVar = new oap.a(Uri.parse(brm0.y(peq0Var.a.toString(), "/?", "?")));
        ydt0Var.A(context, (r27 & 2) != 0 ? null : aVar, launchContext.d, (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? false : false, (r27 & 128) == 0, (r27 & 256) != 0 ? false : launchContext.w, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : launchContext.s, (r27 & 2048) != 0 ? null : null);
        return null;
    }
}
