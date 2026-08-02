package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.qrcode.QRStatsTracker;
import com.vk.stat.scheme.SchemeStat$TypeEasterEggsItem;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.NarrativeAttachment;
import xsna.pnb0;
import xsna.qpb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class xah implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xah(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                kbj0.e(((yah) obj3).d, (Context) obj2, new NarrativeAttachment((Narrative) obj), false, null, false, null, 60);
                break;
            case 1:
                spb0 spb0Var = (spb0) obj;
                ((izs) obj3).invoke(pnb0.c.b.b);
                if (((PollEditorScreen.ExitPollEditorAlert) ((PollEditorScreen) obj2)).b) {
                    spb0Var.f(qpb0.a.f.a);
                }
                break;
            case 2:
                ((gvo) obj3).a.getClass();
                xuo.a(SchemeStat$TypeEasterEggsItem.EventType.POPUP_ACTION, (muo) obj2, (ouo) obj);
                break;
            case 3:
                m3r m3rVar = (m3r) obj3;
                m3rVar.u.postDelayed(new h3r(m3rVar, (p3h) obj2, (nwk) obj, i2), 50L);
                break;
            case 4:
                FriendsItemListVh friendsItemListVh = (FriendsItemListVh) obj3;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj2;
                UserProfile userProfile = (UserProfile) obj;
                VkCell vkCell = friendsItemListVh.j;
                if (vkCell == null) {
                    vkCell = null;
                }
                friendsItemListVh.c(vkCell.getContext(), uIBlockProfile.y, userProfile);
                break;
            case 5:
                m070 m070Var = (m070) obj3;
                break;
            case 6:
                rwi.d().j().d((Activity) obj2, (ApiApplication) obj, "#checkback?code=" + Uri.encode((String) obj3));
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_CHECK_BACK);
                break;
            case 7:
                ((rhq0) obj3).e.c().f((FragmentActivity) obj2, (ExtendedUserProfile) obj, "limited_modal");
                break;
            default:
                ((UserProfileDialogs) obj3).getClass();
                UserProfileDialogs.c((FragmentActivity) obj2, (qoq0) obj);
                break;
        }
        return s3q0.a;
    }
}
