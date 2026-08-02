package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.shortvideo.ClipGridParams;

/* compiled from: HashtagGridLink.kt */
/* loaded from: classes17.dex */
public final class fvu implements pje {
    public final zof a;

    public fvu(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        if (this.a.k()) {
            return jh.h("/clips/hashtag/([\\d\\p{L}_]{2,})", peq0Var, null, null, 14);
        }
        return false;
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        ClipsRouter.j(clipsRouter, context, new ClipGridParams.OnlyId.Hashtag("#".concat(peq0Var.c.group(1))), false, null, launchContext.e, 28);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
        return true;
    }
}
