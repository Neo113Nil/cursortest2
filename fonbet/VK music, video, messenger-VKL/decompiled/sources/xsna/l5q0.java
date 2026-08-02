package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.unknown.NotFoundClipsFragment;
import com.vk.common.links.LaunchContext;

/* compiled from: UnresolvedClipsLink.kt */
/* loaded from: classes17.dex */
public final class l5q0 implements pje {
    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        if (g620.f().getExperiments().k()) {
            return jh.h("/clip(s([-0-9]+)|(s/).*|s|/|([-0-9]+).*)", peq0Var, null, null, 14) || jh.h("/show(s([-0-9]+)|(s/).*|s|/|([-0-9]+).*)", peq0Var, null, null, 14);
        }
        return false;
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        new NotFoundClipsFragment.a(NotFoundClipsFragment.Type.UNKNOWN).k(context);
        if (yp80Var == null) {
            return true;
        }
        yp80Var.onSuccess();
        return true;
    }
}
