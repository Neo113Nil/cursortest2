package xsna;

import android.content.Context;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.network.kbh.state.NetworkState;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;

/* compiled from: ChannelProfileDelegate.kt */
/* loaded from: classes2.dex */
public final class x8b extends r46 {
    public final com.vk.im.ui.views.avatars.b o;
    public final u9h0 p;
    public final r0n0 q;
    public final zzn0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8b(Context context, DialogExt dialogExt, a1w a1wVar, mxv mxvVar, sj90 sj90Var, g3a0 g3a0Var, ImageViewer imageViewer, com.vk.im.ui.views.avatars.b bVar, u9h0 u9h0Var, r0n0 r0n0Var, e8v e8vVar, rul rulVar) {
        super(context, dialogExt, a1wVar, sj90Var, g3a0Var, mxvVar, imageViewer, e8vVar, rulVar);
        zzn0 zzn0Var = new zzn0();
        this.o = bVar;
        this.p = u9h0Var;
        this.q = r0n0Var;
        this.r = zzn0Var;
    }

    @Override // xsna.r46
    public final void E(qxb qxbVar) {
        if (qxbVar instanceof ChatProfileListItem.InviteLink) {
            o0w b = this.g.b();
            Context context = this.b;
            DialogExt dialogExt = this.c;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            b.v(context, dialogExt, false, Peer.Unknown.e);
        }
    }

    @Override // xsna.r46
    public final void G(xub xubVar) {
        if (xubVar instanceof wvb) {
            if (d6q0.t == NetworkState.UNSTABLE) {
                cvk.t();
                return;
            } else {
                J(new ey0(this, 11));
                s3q0 s3q0Var = s3q0.a;
                return;
            }
        }
        if (xubVar instanceof svb) {
            o0w b = this.g.b();
            Context context = this.b;
            DialogExt dialogExt = this.c;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            b.v(context, dialogExt, false, Peer.Unknown.e);
        }
    }

    @Override // xsna.jxb
    public final xxd0 c(DialogExt dialogExt, ImStoryState imStoryState, y6p y6pVar, List<EduAchievement> list, Map<Peer, p6p> map) {
        ChatSettings Hb;
        Dialog Cb = dialogExt.Cb();
        ProfilesSimpleInfo Ob = dialogExt.b.Ob();
        ChatSettings Hb2 = Cb.Hb();
        sj90 sj90Var = this.e;
        g3a0 g3a0Var = this.f;
        Context context = this.b;
        yxd0 yxd0Var = new yxd0(context, dialogExt, this.d, sj90Var, g3a0Var);
        yxd0Var.f = this.p.a(Cb, Ob);
        yxd0Var.h = this.q.a(Cb, Ob);
        yxd0Var.k = Hb2.c;
        yxd0Var.l = this.o.c(Hb2, Cb.Sb().longValue(), Cb.hc());
        yxd0Var.m = f();
        yxd0Var.p = false;
        yxd0Var.q = false;
        yxd0Var.r = imStoryState;
        if (!BuildInfo.t()) {
            yxd0Var.a(new wvb(R.drawable.vk_icon_users_3_outline_28, 12, context.getText(R.string.vkim_chat_profile_action_open_group), null));
        }
        Dialog Cb2 = dialogExt.Cb();
        if (Cb2 != null && (Hb = Cb2.Hb()) != null && Hb.v) {
            yxd0Var.a(new svb(context));
        }
        yxd0Var.j();
        yxd0Var.s();
        yxd0Var.l();
        yxd0Var.p();
        yxd0Var.r(true);
        yxd0Var.q();
        if (!BuildInfo.t()) {
            yxd0Var.m();
        }
        yxd0Var.n();
        yxd0Var.g();
        if (Cb.qc()) {
            yxd0Var.h(i(), this.r, true ^ BuildInfo.t());
        }
        return yxd0Var.t();
    }

    @Override // xsna.r46
    public final void H(zxd0 zxd0Var) {
    }
}
