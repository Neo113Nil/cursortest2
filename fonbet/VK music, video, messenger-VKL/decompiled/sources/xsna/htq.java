package xsna;

import android.content.Context;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;
import xsna.uxd0;
import xsna.zxd0;

/* compiled from: FavoritesProfileDelegate.kt */
/* loaded from: classes2.dex */
public final class htq extends r46 {
    public final u9h0 o;
    public final zzn0 p;
    public final a q;

    /* compiled from: FavoritesProfileDelegate.kt */
    public interface a {
        boolean a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htq(Context context, DialogExt dialogExt, a1w a1wVar, mxv mxvVar, sj90 sj90Var, g3a0 g3a0Var, ImageViewer imageViewer, u9h0 u9h0Var, e8v e8vVar, a aVar, rul rulVar) {
        super(context, dialogExt, a1wVar, sj90Var, g3a0Var, mxvVar, imageViewer, e8vVar, rulVar);
        zzn0 zzn0Var = new zzn0();
        this.o = u9h0Var;
        this.p = zzn0Var;
        this.q = aVar;
    }

    @Override // xsna.r46
    public final void E(qxb qxbVar) {
        String m2;
        if (qxbVar instanceof ChatProfileListItem.i) {
            if (!this.q.a()) {
                J(new p3h(this, 14));
                return;
            }
            qtd0 Bb = this.c.b.Bb(this.c.f);
            if (Bb == null || (m2 = Bb.m2()) == null) {
                return;
            }
            this.g.d().c(this.b, m2);
        }
    }

    @Override // xsna.r46
    public final void G(xub xubVar) {
        if (xubVar instanceof kvb) {
            k(new uxd0.t(this.c, this.b.getString(R.string.vkim_dialog_with_self_title)));
        } else if (xubVar instanceof iwb) {
            o0w.x(this.g.b(), this.b, null, this.c.e, this.c, null, null, false, null, null, null, null, null, null, "contact", null, null, null, false, null, null, null, null, null, 1073733618);
        }
    }

    @Override // xsna.r46
    public final void H(zxd0 zxd0Var) {
        if (zxd0Var instanceof zxd0.f) {
            o(((zxd0.f) zxd0Var).a, true);
        }
    }

    @Override // xsna.jxb
    public final xxd0 c(DialogExt dialogExt, ImStoryState imStoryState, y6p y6pVar, List<EduAchievement> list, Map<Peer, p6p> map) {
        Dialog Cb = dialogExt.Cb();
        ProfilesSimpleInfo Ob = dialogExt.b.Ob();
        yxd0 yxd0Var = new yxd0(this.b, dialogExt, this.d, this.e, this.f);
        yxd0Var.f = this.o.a(Cb, Ob);
        Context context = this.b;
        yxd0Var.h = context.getString(R.string.vkim_dialog_with_self_subtitle);
        yxd0Var.n = true;
        yxd0Var.p = false;
        yxd0Var.q = false;
        if (BuildInfo.t()) {
            yxd0Var.a(new iwb(context));
        }
        yxd0Var.s();
        yxd0Var.r(false);
        yxd0Var.p();
        if (BuildInfo.t()) {
            yxd0Var.o();
        }
        yxd0Var.k(new kvb(R.drawable.vk_icon_delete_outline_28, 8, context.getText(R.string.vkim_chat_profile_action_delete_favorites_history), null));
        if (!BuildInfo.t()) {
            yxd0Var.d(new ChatProfileListItem.i(6, context.getText(R.string.vkim_chat_profile_action_open_my_profile), R.drawable.vk_icon_user_circle_outline_28, null, false, false, false, 120));
            yxd0Var.i();
        }
        if (Cb.qc()) {
            yxd0Var.h(i(), this.p, true ^ BuildInfo.t());
        }
        return yxd0Var.t();
    }
}
