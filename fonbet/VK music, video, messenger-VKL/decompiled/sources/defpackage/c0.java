package defpackage;

import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.superapp.bridges.dto.VkAlertData;
import defpackage.l0;
import java.util.ArrayList;
import java.util.Iterator;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.RepeatMode;
import one.video.player.j;
import xsna.bi20;
import xsna.fd5;
import xsna.gce0;
import xsna.gxj0;
import xsna.gzs;
import xsna.izs;
import xsna.k6t;
import xsna.l6t;
import xsna.m6t;
import xsna.o9t;
import xsna.q7v0;
import xsna.qqa0;
import xsna.rdi;
import xsna.s3q0;
import xsna.vtu;
import xsna.yiw0;
import xsna.zhw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class c0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                l0 l0Var = (l0) this.c;
                l0Var.g.a((VkAlertData.b) this.d, (l0.a) this.e);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                bi20 bi20Var = (bi20) this.d;
                break;
            case 2:
                j jVar = (j) this.c;
                BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) this.d;
                RepeatMode repeatMode = (RepeatMode) this.e;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().u(baseVideoPlayer, repeatMode);
                }
                break;
            case 3:
                FriendsItemListVh friendsItemListVh = (FriendsItemListVh) this.c;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) this.d;
                UserProfile userProfile = (UserProfile) this.e;
                VkCell vkCell = friendsItemListVh.j;
                if (vkCell == null) {
                    vkCell = null;
                }
                friendsItemListVh.c(vkCell.getContext(), uIBlockProfile.y, userProfile);
                break;
            case 4:
                ((izs) this.c).invoke(new o9t.m(m6t.a((l6t) this.d, ((k6t) this.e).c)));
                break;
            case 5:
                q7v0 q7v0Var = (q7v0) this.c;
                String str = (String) this.d;
                gce0 gce0Var = (gce0) this.e;
                VkOnboardingCampaign e = q7v0Var.e(str);
                if (e == null || !q7v0Var.d(e) || !q7v0Var.b(e, false)) {
                    break;
                } else {
                    rdi.y(gce0Var, new fd5(e, gce0Var, str, 4));
                    break;
                }
                break;
            case 6:
                izs izsVar = (izs) this.c;
                qqa0 qqa0Var = (qqa0) this.d;
                vtu vtuVar = (vtu) this.e;
                izsVar.invoke(new PostingAction.Editing.Attach.SetPlace(qqa0Var.b, true));
                vtuVar.a(0);
                break;
            default:
                ((zhw0) this.c).c0((UserId) this.d, (yiw0) this.e, new gxj0(13));
                break;
        }
        return s3q0.a;
    }
}
