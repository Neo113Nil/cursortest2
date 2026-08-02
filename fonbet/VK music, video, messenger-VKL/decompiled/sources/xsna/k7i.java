package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.shortvideo.ClipGridParams;

/* compiled from: CompilationGridLink.kt */
/* loaded from: classes17.dex */
public final class k7i implements pje {
    public final zof a;

    public k7i(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        if (this.a.k()) {
            return jh.h("/clips/compilation/([0-9]+)", peq0Var, null, null, 14);
        }
        return false;
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        ClipsRouter.j(clipsRouter, context, new ClipGridParams.OnlyId.ClipCompilation(peq0Var.b(1)), false, null, null, 60);
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
        return true;
    }
}
