package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import com.vk.common.links.AwayLink;
import com.vk.common.links.LaunchContext;
import xsna.qjc;

/* compiled from: LinkSpan.kt */
/* loaded from: classes7.dex */
public class qaz extends qjc {
    public raz i;
    public saz j;
    public LaunchContext k;
    public final boolean l;

    public qaz(String str, int i) {
        super(str, null);
        this.i = null;
    }

    @Override // xsna.rku0
    public void a(Context context, View view) {
        String i = i();
        if (!brm0.B(i, "http", false)) {
            String concat = "https://".concat(i);
            if (brm0.B(i, xwk.d().d() + "://", false) || drm0.D(i, a0a.d, false) || !URLUtil.isHttpsUrl(concat)) {
                return;
            } else {
                i = concat;
            }
        }
        xwk.d().e().f(context, i, new q21(this, context, view, 1));
    }

    public void f(Context context, View view) {
        String str;
        if (context == null || jjc.b()) {
            return;
        }
        qjc.a aVar = this.c;
        AwayLink awayLink = this.d;
        if (aVar != null) {
            aVar.I(awayLink);
            return;
        }
        if (awayLink == null || (str = awayLink.b) == null) {
            return;
        }
        if (this.k == null) {
            this.k = this.i != null ? new LaunchContext(false, false, false, this.i.n(), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108848) : new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108863);
        }
        xwk.d().e().l(context, awayLink.b, this.k, awayLink.c, null);
        if (this.l) {
            raz razVar = this.i;
            if (razVar != null) {
                razVar.a(str);
            }
        } else {
            raz razVar2 = this.i;
            if (razVar2 != null) {
                razVar2.b(str);
            }
        }
        saz sazVar = this.j;
        if (sazVar != null) {
            sazVar.I(awayLink);
        }
    }

    public qaz(String str, Bundle bundle, Bundle bundle2) {
        super(str, bundle);
        this.l = bundle2 != null ? bundle2.getBoolean("is_vk_link_key") : false;
    }
}
