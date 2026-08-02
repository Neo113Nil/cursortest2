package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import kotlin.text.Regex;
import xsna.oap;

/* compiled from: DownloadedLink.kt */
/* loaded from: classes14.dex */
public final class dbo implements kss0 {
    public final /* synthetic */ int a;

    public /* synthetic */ dbo(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        switch (this.a) {
            case 0:
                return jh.h("(/video)?/my/downloaded", peq0Var, null, null, 14) && fxc0.B().s().isEnabled();
            default:
                Uri uri = peq0Var.a;
                String host = uri.getHost();
                if (host == null) {
                    host = "";
                }
                return ((Regex) laz.F.getValue()).f(cqm0.m(host)) && brm0.w((String) j5g.A0(uri.getPathSegments()), "my", true);
        }
    }

    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        switch (this.a) {
            case 0:
                ydt0Var.D(context, false);
                break;
            default:
                if (!BuildInfo.q()) {
                    oap.a aVar = new oap.a(Uri.parse(brm0.y(peq0Var.a.toString(), "/?", "?")));
                    ydt0Var.A(context, (r27 & 2) != 0 ? null : aVar, launchContext.d, (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? false : false, (r27 & 128) == 0, (r27 & 256) != 0 ? false : launchContext.w, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : launchContext.s, (r27 & 2048) != 0 ? null : null);
                    break;
                } else {
                    ydt0Var.getClass();
                    break;
                }
        }
        return null;
    }
}
