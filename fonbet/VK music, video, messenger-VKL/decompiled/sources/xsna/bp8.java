package xsna;

import android.content.Context;
import android.view.View;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.group.MessagesFromGroupType;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;
import xsna.uxd0;
import xsna.xxd0;

/* compiled from: BusinessNotifyProfileDelegate.kt */
/* loaded from: classes2.dex */
public final class bp8 extends r46 {
    public final kbj0 o;
    public final u9h0 p;
    public final com.vk.im.ui.views.avatars.b q;
    public final zzn0 r;
    public final UserProfileAvatarsInteractor s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp8(Context context, DialogExt dialogExt, a1w a1wVar, mxv mxvVar, sj90 sj90Var, g3a0 g3a0Var, ImageViewer imageViewer, kbj0 kbj0Var, u9h0 u9h0Var, com.vk.im.ui.views.avatars.b bVar, e8v e8vVar, rul rulVar) {
        super(context, dialogExt, a1wVar, sj90Var, g3a0Var, mxvVar, imageViewer, e8vVar, rulVar);
        zzn0 zzn0Var = new zzn0();
        this.o = kbj0Var;
        this.p = u9h0Var;
        this.q = bVar;
        this.r = zzn0Var;
        this.s = new UserProfileAvatarsInteractor(context, imageViewer);
    }

    @Override // xsna.r46
    public final void E(qxb qxbVar) {
        qtd0 Bb;
        String m2;
        if (!(qxbVar instanceof ChatProfileListItem.h) || (Bb = this.c.b.Bb(O())) == null || (m2 = Bb.m2()) == null) {
            return;
        }
        if (drm0.N(m2)) {
            m2 = null;
        }
        if (m2 != null) {
            zdw zdwVar = i7o0.b;
            (zdwVar != null ? zdwVar : null).d.q().a();
            this.g.d().c(this.b, m2);
        }
    }

    @Override // xsna.r46
    public final void G(xub xubVar) {
        if (xubVar instanceof wvb) {
            J(new z4(this, 14));
            return;
        }
        boolean z = xubVar instanceof iwb;
        mxv mxvVar = this.g;
        if (z) {
            o0w.x(mxvVar.b(), this.b, null, O().b, null, null, null, false, null, null, null, null, null, null, "contact", null, null, null, false, null, null, null, null, null, 1073733626);
            return;
        }
        if (xubVar instanceof mvb) {
            Q(false);
            return;
        }
        if (xubVar instanceof bvb) {
            Q(true);
            return;
        }
        if (xubVar instanceof svb) {
            String h = h();
            if (drm0.N(h)) {
                h = null;
            }
            String str = h;
            if (str != null) {
                kbj0.c(this.o, this.b, str, false, null, "group_profile", false, 104);
                return;
            }
            return;
        }
        if (xubVar instanceof bwb) {
            mxvVar.getClass();
            UserId b = com.vk.dto.common.a.b(O());
            int i = ReportFragment.a0;
            ReportFragment.a a = ReportFragment.b.a();
            a.K("community");
            a.C(b);
            a.k(this.b);
        }
    }

    public final Peer O() {
        Peer peer;
        ChatSettings Bb = this.c.Bb();
        return (Bb == null || (peer = Bb.d) == null) ? this.c.f : peer;
    }

    public final void Q(boolean z) {
        e(new io.reactivex.rxjava3.internal.operators.single.o(this.d.E("BusinessNotifyProfileInfoModel", new fpu(O(), z, MessagesFromGroupType.BUSINESS_NOTIFY)), new hv(new com.vk.movika.sdk.base.observable.o(this, 10), 7)).subscribe(new jv(new yo8(z, this), 9), new v8(new u8(this, 10), 10)));
    }

    @Override // xsna.jxb
    public final xxd0 c(DialogExt dialogExt, ImStoryState imStoryState, y6p y6pVar, List<EduAchievement> list, Map<Peer, p6p> map) {
        ProfilesInfo profilesInfo = dialogExt.b;
        qtd0 Bb = profilesInfo.Bb(O());
        if (Bb == null) {
            return xxd0.c.a;
        }
        ProfilesSimpleInfo Ob = profilesInfo.Ob();
        Dialog Cb = dialogExt.Cb();
        yxd0 yxd0Var = new yxd0(this.b, dialogExt, this.d, this.e, this.f);
        yxd0Var.f = this.p.a(Cb, Ob);
        Context context = this.b;
        yxd0Var.h = context.getString(R.string.vkim_business_notify_count_default);
        yxd0Var.j = Bb.q9();
        ImageList C8 = Bb.C8();
        yxd0Var.k = C8;
        yxd0Var.o = (!C8.Jb() || xjw.a(C8) || Bb.ka()) ? false : true;
        com.vk.im.ui.views.avatars.b bVar = this.q;
        bVar.getClass();
        yxd0Var.l = bVar.e(Bb.name(), Bb.t8());
        yxd0Var.m = f();
        yxd0Var.p = false;
        yxd0Var.q = false;
        yxd0Var.a(new iwb(context));
        if (!drm0.N(Bb.m2())) {
            yxd0Var.a(new svb(context));
        }
        yxd0Var.j();
        yxd0Var.s();
        Group group = Bb instanceof Group ? (Group) Bb : null;
        if (group != null) {
            yxd0Var.k(group.i ? new mvb(R.drawable.vk_icon_block_outline_28, 8, context.getText(R.string.vkim_business_groups_unsubscribe), null) : new bvb(R.drawable.vk_icon_add_square_outline_28, 12, context.getText(R.string.vkim_business_groups_subscribe), null));
        }
        yxd0Var.m();
        if (Cb.qc()) {
            yxd0Var.h(i(), this.r, !BuildInfo.t());
        }
        return yxd0Var.t();
    }

    @Override // xsna.r46
    public final qtd0 g() {
        return this.c.b.Bb(O());
    }

    @Override // xsna.r46
    public final void x(View view) {
        k(new uxd0.a(new lh(3, this, view)));
    }

    @Override // xsna.r46
    public final void H(zxd0 zxd0Var) {
    }
}
