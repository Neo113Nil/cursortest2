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
import xsna.xxd0;

/* compiled from: ContactProfileDelegate.kt */
/* loaded from: classes2.dex */
public final class o9j extends r46 {
    public final u9h0 o;
    public final com.vk.im.ui.views.avatars.b p;
    public final u90 q;

    public o9j(Context context, DialogExt dialogExt, a1w a1wVar, mxv mxvVar, sj90 sj90Var, g3a0 g3a0Var, ImageViewer imageViewer, u9h0 u9h0Var, com.vk.im.ui.views.avatars.b bVar, u90 u90Var, e8v e8vVar, rul rulVar) {
        super(context, dialogExt, a1wVar, sj90Var, g3a0Var, mxvVar, imageViewer, e8vVar, rulVar);
        this.o = u9h0Var;
        this.p = bVar;
        this.q = u90Var;
    }

    @Override // xsna.r46
    public final void E(qxb qxbVar) {
        if (qxbVar instanceof ChatProfileListItem.p) {
            o0w.x(this.g.b(), this.b, null, this.c.e, this.c, null, null, false, null, null, null, null, null, null, "contact", null, null, null, false, null, null, null, null, null, 1073733618);
        } else if (qxbVar instanceof ChatProfileListItem.f) {
            this.g.b().O(this.q, "dialog_actions", this.c.f, null);
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
        yxd0Var.h = this.b.getString(R.string.vkim_from_contact_list);
        yxd0Var.k = Bb.C8();
        com.vk.im.ui.views.avatars.b bVar = this.p;
        bVar.getClass();
        yxd0Var.l = bVar.e(Bb.name(), Bb.t8());
        yxd0Var.p = false;
        yxd0Var.q = false;
        yxd0Var.r = imStoryState;
        Context context = this.b;
        yxd0Var.f();
        if (!BuildInfo.t()) {
            yxd0Var.c();
        }
        if (Cb.Gb()) {
            yxd0Var.d(new ChatProfileListItem.p(7, context.getText(R.string.vkim_chat_profile_action_write), R.drawable.vk_icon_message_outline_28, null, false, false, false, 120));
        }
        if (Bb.r5() && !bu00.l(Bb)) {
            yxd0Var.d(new ChatProfileListItem.f(8, context.getText(R.string.vkim_chat_profile_action_invite_to_group_chat), R.drawable.vk_icon_message_add_badge_outline_28, null, false, false, false, 120));
        }
        return yxd0Var.t();
    }

    @Override // xsna.r46
    public final void G(xub xubVar) {
    }

    @Override // xsna.r46
    public final void H(zxd0 zxd0Var) {
    }
}
