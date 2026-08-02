package xsna;

import android.content.Context;
import com.ironsource.C4504q2;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;

/* compiled from: NotificationsLink.kt */
/* loaded from: classes17.dex */
public final class tj70 implements pje {
    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        return jh.h("/clips", peq0Var, null, null, 14) && epx.f(peq0Var.d, C4504q2.x);
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        rwi.d().d().a(context);
        if (yp80Var == null) {
            return true;
        }
        yp80Var.onSuccess();
        return true;
    }
}
