package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;

/* compiled from: TemplatePreviewLink.kt */
/* loaded from: classes17.dex */
public final class w8o0 implements pje {
    public final d9f a;

    public w8o0(d9f d9fVar) {
        this.a = d9fVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        return jh.h("/clips/templates/([-0-9]+)_([0-9]+)", peq0Var, null, null, 14);
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        this.a.e("templatePreviewLink");
        g620.f().a().k(context, peq0Var.c.group(1) + '_' + peq0Var.c.group(2));
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
        return true;
    }
}
