package xsna;

import android.content.Context;
import android.view.View;
import com.vk.bridges.ImageViewer;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.uxd0;
import xsna.xxd0;
import xsna.zxd0;

/* compiled from: GroupProfileDelegate.kt */
/* loaded from: classes2.dex */
public final class amu extends r46 {
    public final b25 o;
    public final kbj0 p;
    public final u9h0 q;
    public final r0n0 r;
    public final com.vk.im.ui.views.avatars.b s;
    public final zzn0 t;
    public final a u;
    public final UserProfileAvatarsInteractor v;

    /* compiled from: GroupProfileDelegate.kt */
    public interface a {
        boolean c();

        boolean f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amu(Context context, DialogExt dialogExt, a1w a1wVar, mxv mxvVar, b25 b25Var, sj90 sj90Var, g3a0 g3a0Var, ImageViewer imageViewer, kbj0 kbj0Var, u9h0 u9h0Var, r0n0 r0n0Var, com.vk.im.ui.views.avatars.b bVar, e8v e8vVar, a aVar, rul rulVar) {
        super(context, dialogExt, a1wVar, sj90Var, g3a0Var, mxvVar, imageViewer, e8vVar, rulVar);
        zzn0 zzn0Var = new zzn0();
        this.o = b25Var;
        this.p = kbj0Var;
        this.q = u9h0Var;
        this.r = r0n0Var;
        this.s = bVar;
        this.t = zzn0Var;
        this.u = aVar;
        this.v = new UserProfileAvatarsInteractor(context, imageViewer);
    }

    @Override // xsna.r46
    public final void E(qxb qxbVar) {
        if (qxbVar instanceof ChatProfileListItem.h) {
            xyv.i(this.g.a(), this.b, this.c.f.b, ChannelHistoryOpenMode.OpenAtUnread.b, null, 8);
        }
    }

    @Override // xsna.r46
    public final void G(xub xubVar) {
        if (xubVar instanceof wvb) {
            J(new wnh(this, 16));
            return;
        }
        if (xubVar instanceof iwb) {
            o0w.x(this.g.b(), this.b, null, this.c.e, this.c, null, null, false, null, null, null, null, null, null, "contact", null, null, null, false, null, null, null, null, null, 1073733618);
            return;
        }
        if (xubVar instanceof nvb) {
            O(false);
            return;
        }
        if (xubVar instanceof cvb) {
            O(true);
            return;
        }
        if (xubVar instanceof ovb) {
            O(true);
            return;
        }
        if (xubVar instanceof svb) {
            String h = h();
            if (drm0.N(h)) {
                h = null;
            }
            String str = h;
            if (str != null) {
                kbj0.c(this.p, this.b, str, false, null, "group_profile", false, 104);
                return;
            }
            return;
        }
        if (xubVar instanceof bwb) {
            this.g.getClass();
            Context context = this.b;
            UserId b = com.vk.dto.common.a.b(this.c.f);
            int i = ReportFragment.a0;
            ReportFragment.a a2 = ReportFragment.b.a();
            a2.K("community");
            a2.C(b);
            a2.k(context);
        }
    }

    @Override // xsna.r46
    public final void H(zxd0 zxd0Var) {
        if (zxd0Var instanceof zxd0.s.b) {
            if (o25.b(this.o)) {
                qtd0 g = g();
                if (g != null) {
                    kbj0.c(this.p, this.b, "https://me.sferum.ru/?p=messages&peerId=" + g.r8(), false, null, "group_profile", false, 104);
                    return;
                }
                return;
            }
            String h = h();
            if (drm0.N(h)) {
                h = null;
            }
            String str = h;
            if (str != null) {
                kbj0.c(this.p, this.b, str, false, null, "user_profile", false, 104);
            }
        }
    }

    public final void O(boolean z) {
        e(this.d.E("GroupProfileInfoModel", new fpu(this.c.f, z)).subscribe(new kl6(new zlu(z, this, 0), 21), new y50(new zqh(this, 18), 29)));
    }

    @Override // xsna.jxb
    public final xxd0 c(DialogExt dialogExt, ImStoryState imStoryState, y6p y6pVar, List<EduAchievement> list, Map<Peer, p6p> map) {
        qtd0 Bb;
        Group group = (Group) dialogExt.b.e.c.get(Long.valueOf(this.c.f.d));
        if (group == null) {
            return xxd0.c.a;
        }
        ProfilesSimpleInfo Ob = dialogExt.b.Ob();
        Dialog Cb = dialogExt.Cb();
        Context context = this.b;
        yxd0 yxd0Var = new yxd0(context, dialogExt, this.d, this.e, this.f);
        yxd0Var.f = this.q.a(Cb, Ob);
        yxd0Var.h = this.r.a(Cb, Ob);
        yxd0Var.j = group.q9();
        ImageList imageList = group.e;
        yxd0Var.k = imageList;
        yxd0Var.o = imageList.Jb() && !xjw.a(imageList);
        com.vk.im.ui.views.avatars.b bVar = this.s;
        bVar.getClass();
        yxd0Var.l = bVar.e(group.name(), group.t8());
        yxd0Var.m = f();
        yxd0Var.p = false;
        yxd0Var.q = BuildInfo.t();
        yxd0Var.r = imStoryState;
        Context context2 = this.b;
        a aVar = this.u;
        if (aVar.f()) {
            yxd0Var.a(new iwb(context2));
        } else {
            yxd0Var.a(new wvb(R.drawable.vk_icon_users_3_outline_28, 12, context.getText(R.string.vkim_chat_profile_action_open_group), null));
        }
        if (!drm0.N(group.m2()) && aVar.c()) {
            yxd0Var.a(new svb(context2));
        }
        yxd0Var.j();
        yxd0Var.s();
        Peer q = this.d.q();
        q.getClass();
        boolean Ab = q.Ab(Peer.Type.GROUP);
        if (!Ab) {
            yxd0Var.l();
        }
        yxd0Var.p();
        if (!Ab) {
            yxd0Var.r(true);
        }
        if (!Cb.Dc()) {
            yxd0Var.k(group.h ? new nvb(R.drawable.vk_icon_block_outline_28, 8, this.b.getText(R.string.vkim_groups_receive_msg_disable), null) : group.i ? new ovb(R.drawable.vk_icon_block_outline_28, 8, this.b.getText(R.string.vkim_groups_receive_notify_disable), null) : new cvb(R.drawable.vk_icon_check_circle_outline_28, 12, this.b.getText(R.string.vkim_groups_receive_msg_enable), null));
        }
        if (!this.d.r().b0.getValue().contains(Long.valueOf(this.c.e))) {
            yxd0Var.k(new bwb(R.drawable.vk_icon_report_outline_28, 8, this.b.getText(R.string.vkim_chat_profile_action_report), null));
        }
        yxd0Var.m();
        if (this.u.f() && this.u.c()) {
            CharSequence text = this.b.getText(R.string.vkim_dialog_option_open_group_profile);
            if (BuildInfo.t() && (Bb = this.c.b.Bb(this.c.f)) != null) {
                qtd0 qtd0Var = drm0.N(Bb.Ra()) ? null : Bb;
                if (qtd0Var != null) {
                    text = BuildInfo.t() ? qtd0Var.Ra() : "@" + qtd0Var.Ra();
                }
            }
            yxd0Var.d(new ChatProfileListItem.h(12, text.toString(), BuildInfo.t() ? R.drawable.vkim_ic_24_open_community : R.drawable.vk_icon_new_logo_vk_outline_28, Integer.valueOf(R.drawable.vk_icon_new_logo_vk_outline_28), false, false, true, 48));
        }
        if (Cb.qc()) {
            List<sxb> i = i();
            ArrayList arrayList = new ArrayList();
            for (Object obj : i) {
                if (!(((sxb) obj).a instanceof yd3)) {
                    arrayList.add(obj);
                }
            }
            yxd0Var.h(arrayList, this.t, !BuildInfo.t());
        }
        return yxd0Var.t();
    }

    @Override // xsna.r46
    public final void x(View view) {
        k(new uxd0.a(new com.vk.movika.sdk.base.logic.processor.d(17, this, view)));
    }
}
