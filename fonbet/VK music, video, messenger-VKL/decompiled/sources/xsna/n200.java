package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;

/* compiled from: LoginLink.kt */
/* loaded from: classes17.dex */
public final class n200 implements pje {
    public final zof a;

    public n200(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        return this.a.k() && jh.h("/clips", peq0Var, null, null, 14) && epx.f(peq0Var.a.getQueryParameter("param"), "login");
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        clipsRouter.i(context, fpf0.a(ClipFeedTab.TopVideo.class), ClipFeedOpenAction.ShowLogin.b);
        if (yp80Var == null) {
            return true;
        }
        yp80Var.onSuccess();
        return true;
    }
}
