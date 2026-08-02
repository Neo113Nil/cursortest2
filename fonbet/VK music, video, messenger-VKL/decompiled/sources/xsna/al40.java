package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.shortvideo.ClipGridParams;

/* compiled from: MusicGridLink.kt */
/* loaded from: classes17.dex */
public final class al40 implements pje {
    public final zof a;

    public al40(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        if (this.a.k()) {
            return jh.h("/clips/music/([-0-9]+)_([0-9]+)", peq0Var, null, null, 14);
        }
        return false;
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(peq0Var.b(1));
        sb.append('_');
        sb.append(peq0Var.b(2));
        ClipsRouter.j(clipsRouter, context, new ClipGridParams.OnlyId.Audio(sb.toString()), false, null, launchContext.e, 28);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
        return true;
    }
}
