package xsna;

import android.content.Context;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import xsna.o0r0;

/* compiled from: ProfileGridLink.kt */
/* loaded from: classes17.dex */
public final class nxd0 implements pje {
    public final zof a;

    public nxd0(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        return jh.h("/clips(/id|/public)?([-0-9]+)", peq0Var, null, null, 14);
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        if (this.a.k()) {
            UserId userId = new UserId(peq0Var.c(2));
            ClipsRouter.j(clipsRouter, context, new ClipGridParams.OnlyId.Profile(userId), o25.a().a(userId), null, null, 56);
        } else {
            xwk.e().m(context, new UserId(peq0Var.c(2)), new o0r0.a(false, launchContext.d, launchContext.h, null, null, null, null, false, false, false, false, null, null, null, 65529));
        }
        if (peq0Var.t("qr") == 1) {
            new iof(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.PROFILE, SchemeStat$TypeClipViewerItem.EventType.SHOW_PROFILE_FROM_QR_CODE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null)).q();
        }
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
        return true;
    }
}
