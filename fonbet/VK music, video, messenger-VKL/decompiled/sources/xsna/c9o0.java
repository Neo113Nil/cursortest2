package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: TemplatesCatalogLink.kt */
/* loaded from: classes17.dex */
public final class c9o0 implements pje {
    public final d9f a;

    public c9o0(d9f d9fVar) {
        this.a = d9fVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        return jh.h("/clips/templates", peq0Var, null, null, 14);
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        this.a.e("templateCatalogLink");
        g620.f().f(context, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.LINK));
        if (yp80Var == null) {
            return true;
        }
        yp80Var.onSuccess();
        return true;
    }
}
