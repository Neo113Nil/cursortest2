package xsna;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import kotlin.NoWhenBranchMatchedException;
import xsna.dtm;
import xsna.iwv;

/* compiled from: DialogsListRouter.kt */
/* loaded from: classes18.dex */
public final class qtm implements hm50<dtm> {
    public final Activity a;
    public final mxv b;
    public final mo8 c;
    public final g6o0 d;
    public final k9q0 e;

    public qtm(FragmentActivity fragmentActivity, mxv mxvVar, mo8 mo8Var, g6o0 g6o0Var, k9q0 k9q0Var) {
        this.a = fragmentActivity;
        this.b = mxvVar;
        this.c = mo8Var;
        this.d = g6o0Var;
        this.e = k9q0Var;
    }

    @Override // xsna.hm50
    public final void a(dtm dtmVar) {
        dtm dtmVar2 = dtmVar;
        boolean z = dtmVar2 instanceof dtm.e;
        mxv mxvVar = this.b;
        if (z) {
            o0w b = mxvVar.b();
            dtm.e eVar = (dtm.e) dtmVar2;
            Peer peer = eVar.a;
            b.k(this.a, peer.b, Long.valueOf(eVar.b.b), new DialogExt(peer.b, eVar.c, eVar.d), MsgListOpenAtUnreadMode.b, eVar.e);
            return;
        }
        boolean equals = dtmVar2.equals(dtm.a.a);
        Activity activity = this.a;
        if (equals) {
            ((mxv) this.c.b).b().S(activity, "conversations");
            return;
        }
        if (dtmVar2.equals(dtm.j.a)) {
            ((mxv) this.d.b).b().l(activity);
            return;
        }
        if (dtmVar2 instanceof dtm.c) {
            dtm.c cVar = (dtm.c) dtmVar2;
            Peer peer2 = cVar.a;
            peer2.getClass();
            if (peer2.Ab(Peer.Type.GROUP)) {
                o0w.P(mxvVar.b(), xa4.L(activity), null, null, cVar.a, 14);
                return;
            } else {
                mxvVar.b().m(xa4.L(activity), false, false);
                return;
            }
        }
        if (dtmVar2 instanceof dtm.i) {
            mxvVar.k().b(activity, ((dtm.i) dtmVar2).a);
            return;
        }
        if (dtmVar2.equals(dtm.f.a)) {
            mxvVar.k();
            iwv.a aVar = iwv.a;
            return;
        }
        if (dtmVar2 instanceof dtm.g) {
            iid0 iid0Var = new iid0();
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("go_to_messenger", MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK, null, 4, null), 3);
            iid0Var.f = c;
            iid0Var.g = b2;
            iid0Var.q();
            this.e.getClass();
            return;
        }
        if (dtmVar2 instanceof dtm.h) {
            int i = InfoModalBottomSheet.g1;
            InfoModalBottomSheet.b.a(activity, ((dtm.h) dtmVar2).a);
            return;
        }
        if (dtmVar2 instanceof dtm.k) {
            iwv.f(mxvVar.k(), this.a, 51464551, null, "", null, null, 48);
            return;
        }
        if (dtmVar2.equals(dtm.d.a)) {
            iid0 iid0Var2 = new iid0();
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            SchemeStat$TypeAction b3 = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("edu_joining_ejd_chats", MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK, null, 4, null), 3);
            iid0Var2.f = c2;
            iid0Var2.g = b3;
            iid0Var2.q();
            mxvVar.k();
            return;
        }
        if (!(dtmVar2 instanceof dtm.l)) {
            if (!dtmVar2.equals(dtm.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            mxvVar.i().c(activity);
        } else {
            dtm.l lVar = (dtm.l) dtmVar2;
            View view = lVar.c.get();
            if (view == null) {
                return;
            }
            mxvVar.g().a(view, lVar.a, lVar.b, MobileOfficialAppsConStoriesStat$ViewEntryPoint.IM_DIALOGS, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT, new l9(14));
        }
    }
}
