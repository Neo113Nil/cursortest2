package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;

/* compiled from: TrendsBlockLink.kt */
/* loaded from: classes17.dex */
public final class bqp0 implements pje {
    public final zof a;

    public bqp0(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        zof zofVar = this.a;
        if (zofVar.k() && zofVar.I().a) {
            return jh.h("/clips_trends", peq0Var, null, null, 14);
        }
        return false;
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        ClipsRouter.b(g620.f().a(), context, new ClipFeedTab.ClipsFromTrendsSource.Top(ClipFeedTab.ClipsFromTrendsSource.SourceType.DEEPLINK, null, 2, null), null, null, fpf0.a(ClipFeedTab.ClipsFromTrendsSource.Top.class), null, false, 236);
        if (yp80Var == null) {
            return true;
        }
        yp80Var.onSuccess();
        return true;
    }
}
