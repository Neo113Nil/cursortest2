package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.shortvideo.ClipGridParams;

/* compiled from: GeoPlaceGridLink.kt */
/* loaded from: classes17.dex */
public final class clt implements pje {
    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        return jh.h("/clips/place/([0-9]+)", peq0Var, null, null, 14);
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        ClipsRouter.j(clipsRouter, context, new ClipGridParams.OnlyId.GeoPlace(peq0Var.b(1)), false, null, null, 60);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
        return true;
    }
}
