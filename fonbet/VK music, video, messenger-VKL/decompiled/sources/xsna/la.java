package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityPerson;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchEntityAnswerAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.search.SearchEntityPersonAnswerVh;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityPerson;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;
import xsna.sw50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class la implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ la(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = AbsFollowersListFragment.Y;
                h3p0.b((AbsFollowersListFragment) obj);
                return;
            case 1:
                com.vk.newsfeed.common.recycler.holders.clips.a aVar = (com.vk.newsfeed.common.recycler.holders.clips.a) obj;
                ClipVideoFile clipVideoFile = aVar.J;
                if (clipVideoFile != null) {
                    g620.f().k(clipVideoFile.b, aVar.itemView.getContext(), ClipsRouter.GridForcedTab.NONE);
                    return;
                }
                return;
            case 2:
                ((dw20) obj).hide();
                return;
            case 3:
                yfg yfgVar = ((ngg) obj).F;
                if (yfgVar != null) {
                    yfgVar.e.invoke((String) view.getTag(), yfgVar);
                    return;
                }
                return;
            case 4:
                int i3 = CommunityInviteLinkFragment.e0;
                h3p0.b((CommunityInviteLinkFragment) obj);
                return;
            case 5:
                ((CommunityNotificationSettingsFragment.c) ((whp) obj)).j().invoke();
                return;
            case 6:
                s3u s3uVar = (s3u) obj;
                Good good = s3uVar.p;
                if (good != null) {
                    xqg.b((xqg) ((cxo) s3uVar.n.b).a.w.getValue(), s3uVar.itemView.getContext(), fkq0.e(good.c), null, null, null, false, Long.valueOf(good.b), 60);
                    return;
                }
                return;
            case 7:
                ((xlu) obj).getPresenter().i2();
                return;
            case 8:
                ((wo1) obj).invoke();
                return;
            case 9:
                int i4 = PhotoAlbumFragment.r0;
                rwi.d().g().d((PhotoAlbumFragment) obj, 3890, 0, new sw50.f.a(null, 0 == true ? 1 : 0, 30));
                return;
            case 10:
                SearchEntityPersonAnswerVh searchEntityPersonAnswerVh = (SearchEntityPersonAnswerVh) obj;
                UIBlockSearchEntityPerson uIBlockSearchEntityPerson = searchEntityPersonAnswerVh.r;
                if (uIBlockSearchEntityPerson == null) {
                    return;
                }
                CatalogSearchEntityPerson catalogSearchEntityPerson = uIBlockSearchEntityPerson.y;
                oap<UserProfile, Group> oapVar = uIBlockSearchEntityPerson.C;
                if (oapVar instanceof oap.b) {
                    Group group = (Group) ((oap.b) oapVar).a;
                    if (group.j || group.C == 4) {
                        z = true;
                    }
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = ((UserProfile) ((oap.a) oapVar).a).M();
                }
                boolean z2 = z;
                boolean b = fkq0.b(catalogSearchEntityPerson.c);
                searchEntityPersonAnswerVh.c((b && z2) ? SearchEntityAnswerAnalyticsInfo.ClickTarget.Leave : b ? SearchEntityAnswerAnalyticsInfo.ClickTarget.Join : z2 ? SearchEntityAnswerAnalyticsInfo.ClickTarget.Unfollow : SearchEntityAnswerAnalyticsInfo.ClickTarget.Follow);
                io.reactivex.rxjava3.disposables.c cVar = searchEntityPersonAnswerVh.s;
                if (cVar != null) {
                    cVar.dispose();
                }
                io.reactivex.rxjava3.disposables.c subscribe = o0r0.i(xwk.e(), catalogSearchEntityPerson.c, z2, null, false, null, 116).subscribe();
                searchEntityPersonAnswerVh.f.a(subscribe);
                searchEntityPersonAnswerVh.s = subscribe;
                return;
            default:
                mbz0 mbz0Var = (mbz0) obj;
                suy0 suy0Var = mbz0Var.h;
                if (suy0Var != null) {
                    suy0Var.d();
                }
                mbz0Var.c.f(mbz0Var.d);
                return;
        }
    }
}
