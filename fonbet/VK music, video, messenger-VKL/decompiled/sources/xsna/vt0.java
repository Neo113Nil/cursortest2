package xsna;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;
import xsna.xxd0;

/* compiled from: AdministrationProfileDelegate.kt */
/* loaded from: classes2.dex */
public final class vt0 extends r46 {
    public final u9h0 o;
    public final com.vk.im.ui.views.avatars.b p;
    public final zzn0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt0(Context context, DialogExt dialogExt, a1w a1wVar, mxv mxvVar, sj90 sj90Var, g3a0 g3a0Var, ImageViewer imageViewer, u9h0 u9h0Var, com.vk.im.ui.views.avatars.b bVar, e8v e8vVar, rul rulVar) {
        super(context, dialogExt, a1wVar, sj90Var, g3a0Var, mxvVar, imageViewer, e8vVar, rulVar);
        zzn0 zzn0Var = new zzn0();
        this.o = u9h0Var;
        this.p = bVar;
        this.q = zzn0Var;
    }

    @Override // xsna.r46
    public final void G(xub xubVar) {
        if (xubVar instanceof pvb) {
            b7u0 k = this.g.k();
            Context context = this.b;
            String str = (String) q6r0.f().b(m6r0.w, AndroidWebViewClient.BLANK_PAGE);
            if (drm0.N(str) || str.equalsIgnoreCase(AndroidWebViewClient.BLANK_PAGE)) {
                str = null;
            }
            if (str == null) {
                str = i5s.a(new StringBuilder("https://"), a0a.d, "/support?act=home");
            }
            k.b(context, str);
        }
    }

    @Override // xsna.jxb
    public final xxd0 c(DialogExt dialogExt, ImStoryState imStoryState, y6p y6pVar, List<EduAchievement> list, Map<Peer, p6p> map) {
        qtd0 Bb = dialogExt.b.Bb(this.c.f);
        if (Bb == null) {
            return xxd0.c.a;
        }
        ProfilesSimpleInfo Ob = dialogExt.b.Ob();
        Dialog Cb = dialogExt.Cb();
        yxd0 yxd0Var = new yxd0(this.b, dialogExt, this.d, this.e, this.f);
        yxd0Var.f = this.o.a(Cb, Ob);
        yxd0Var.j = Bb.q9();
        yxd0Var.k = Bb.C8();
        com.vk.im.ui.views.avatars.b bVar = this.p;
        bVar.getClass();
        yxd0Var.l = bVar.e(Bb.name(), Bb.t8());
        yxd0Var.m = f();
        yxd0Var.p = false;
        yxd0Var.q = false;
        yxd0Var.a(new pvb(R.drawable.vk_icon_lifebuoy_outline_28, 12, this.b.getText(R.string.vkim_chat_profile_action_help), null));
        yxd0Var.j();
        yxd0Var.s();
        yxd0Var.p();
        yxd0Var.r(true);
        yxd0Var.m();
        if (Cb.qc()) {
            yxd0Var.h(i(), this.q, true ^ BuildInfo.t());
        }
        return yxd0Var.t();
    }

    @Override // xsna.r46
    public final void E(qxb qxbVar) {
    }

    @Override // xsna.r46
    public final void H(zxd0 zxd0Var) {
    }
}
