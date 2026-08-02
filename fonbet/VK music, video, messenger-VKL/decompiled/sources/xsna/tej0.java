package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import java.util.Collections;

/* compiled from: ShopsBlockLink.kt */
/* loaded from: classes17.dex */
public final class tej0 implements pje {
    public final zof a;

    public tej0(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        if (this.a.k()) {
            return jh.h("/clips_shops", peq0Var, null, null, 14);
        }
        return false;
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        ClipFeedTab.ClipsFromShopsSource.Top top = new ClipFeedTab.ClipsFromShopsSource.Top(ClipFeedTab.ClipsFromShopsSource.SourceType.DEEPLINK, null, 2, null);
        if (this.a.I().a) {
            ClipsRouter.b(g620.f().a(), context, top, null, null, fpf0.a(ClipFeedTab.ClipsFromShopsSource.Top.class), null, false, 236);
        } else {
            ClipsRouter.c(g620.f().a(), context, Collections.singletonList(top), null, null, null, null, null, false, null, 2044);
        }
        if (yp80Var == null) {
            return true;
        }
        yp80Var.onSuccess();
        return true;
    }
}
