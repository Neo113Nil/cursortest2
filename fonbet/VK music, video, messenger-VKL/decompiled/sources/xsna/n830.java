package xsna;

import android.content.Context;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosGridTypeDto;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.lgj0;

/* compiled from: MonotopicGridLink.kt */
/* loaded from: classes17.dex */
public final class n830 implements pje {
    public final zof a;

    public n830(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        if (this.a.k()) {
            return jh.h("/clips/monotopic/([a-zA-Z0-9-]+)", peq0Var, null, null, 14);
        }
        return false;
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        String group = peq0Var.c.group(1);
        io.reactivex.rxjava3.internal.operators.single.y l = rsg0.W(yfb.x(lgj0.a.e(ShortVideoGetGridShortVideosGridTypeDto.NEWS_MONOTHEME, group, 1, null, "clips_monotheme", drm0.c0(e7d.t, new String[]{StringUtils.COMMA}, 0, 6))), 5).l(new sj4(new vd1(28), 21));
        asu0 asu0Var = asu0.a;
        ver0.a(l.q(asu0Var.c()).m(asu0Var.d()).subscribe(new t520(new m830(clipsRouter, context, group, yp80Var), 4), new bf2(new l2e(this, clipsRouter, context, yp80Var), 27)));
        return true;
    }
}
