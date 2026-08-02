package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import kotlin.text.Regex;

/* compiled from: MetaChannelLink.kt */
/* loaded from: classes14.dex */
public final class xh20 implements kss0 {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        String host = peq0Var.a.getHost();
        if (host == null) {
            host = "";
        }
        return ((Regex) laz.F.getValue()).f(cqm0.m(host)) && jh.h("/topic/@.+", peq0Var, null, null, 14);
    }

    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        String str;
        Uri uri = peq0Var.a;
        if (!BuildInfo.q()) {
            return Boolean.FALSE;
        }
        String path = uri.getPath();
        if (path != null) {
            String g0 = drm0.g0(path, "/topic/@", path);
            str = drm0.k0(g0, DomExceptionUtils.SEPARATOR, g0);
        } else {
            str = null;
        }
        if (str == null || drm0.N(str) || !fxc0.B().J().y()) {
            fxc0.B().Y().getClass();
            return null;
        }
        ydt0 Y = fxc0.B().Y();
        uri.toString();
        Y.getClass();
        return null;
    }
}
