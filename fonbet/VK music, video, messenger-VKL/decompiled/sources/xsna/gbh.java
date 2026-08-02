package xsna;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.attachpicker.impl.fragment.AttachMusicFragment;
import com.vk.catalog2.common.ui.holders.HeaderVh;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.picture.VkImage;
import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.friends.api.presentation.FriendsListType;
import com.vk.friends.impl.friends.presentation.fragment.PaginatedFriendsListFragment;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.notifications.list.impl.presentation.base.fragment.grouped.GroupedNotificationListFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.f6u;
import xsna.g5u;
import xsna.hzp0;
import xsna.vkw;
import xsna.wu1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gbh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gbh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$27;
        gvv0 view;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = CommunityNotificationSettingsFragment.b0;
                ((CommunityNotificationSettingsFragment) obj).finish();
                break;
            case 1:
                wjh wjhVar = (wjh) obj;
                CommunityProfileContentItem communityProfileContentItem = wjhVar.t;
                if (communityProfileContentItem != null) {
                    wjhVar.q.invoke(communityProfileContentItem);
                }
                break;
            case 2:
                ((com.vk.im.ui.components.contacts.a) obj).e1(Source.CACHE, false);
                break;
            case 3:
                break;
            case 4:
                CreateAlbumFragment createAlbumFragment = (CreateAlbumFragment) obj;
                int i3 = CreateAlbumFragment.Z;
                PhotoAlbum photoAlbum = (PhotoAlbum) createAlbumFragment.Q.getValue();
                if (photoAlbum == null || (r1 = photoAlbum.c) == null) {
                    UserId userId = (UserId) createAlbumFragment.requireArguments().getParcelable("owner_id");
                    if (userId == null) {
                        break;
                    }
                }
                break;
            case 5:
                ((DebugDevImageFragment.a) obj).b.invoke();
                break;
            case 6:
                break;
            case 7:
                DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) obj;
                com.vk.attachpicker.c cVar = deprecatedAttachActivity.v;
                AttachMusicFragment.a aVar = new AttachMusicFragment.a();
                long j = deprecatedAttachActivity.q0;
                Bundle bundle = aVar.j;
                bundle.putLong("peer_id", j);
                String str = deprecatedAttachActivity.r0;
                if (str == null) {
                    str = "";
                }
                bundle.putString("peer_title", str);
                bundle.putBoolean("can_pin_attachment", deprecatedAttachActivity.s0);
                aVar.z(cVar.a);
                aVar.A(cVar.a);
                bundle.putParcelable("uid", deprecatedAttachActivity.u0);
                bundle.putBoolean("closeBtn", false);
                break;
            case 8:
                break;
            case 9:
                ArrayList arrayList = (ArrayList) obj;
                StringBuilder sb = new StringBuilder("DialogPinMoveCmd, old pinned: ");
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((com.vk.im.engine.models.dialogs.b) it.next()).b));
                }
                sb.append(arrayList2);
                break;
            case 10:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                break;
            case 11:
                FragmentManager fragmentManager = (FragmentManager) obj;
                int i4 = DiscoverSearchFragment.s0;
                break;
            case 12:
                ((wfo) obj).d();
                break;
            case 13:
                break;
            case 14:
                String message = ((wu1.a.C3958a) ((wu1) obj)).a.getMessage();
                if (message == null) {
                }
                break;
            case 15:
                int i5 = FriendsCatalogFragment.V;
                break;
            case 16:
                FriendsFragment friendsFragment = (FriendsFragment) obj;
                int i6 = FriendsFragment.q0;
                gqs gqsVar = (gqs) friendsFragment.h0.getValue();
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_MUTUAL;
                FragmentImpl a = gqsVar.a(new iqs(friendsFragment.V, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen), mobileOfficialAppsCoreNavStat$EventScreen, FriendsListType.MUTUAL, friendsFragment.a0));
                if (a instanceof PaginatedFriendsListFragment) {
                    ((PaginatedFriendsListFragment) a).n0 = true;
                }
                break;
            case 17:
                break;
            case 18:
                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null);
                CommonVasStat$TypeIvasItemViews.ItemType itemType = CommonVasStat$TypeIvasItemViews.ItemType.ENTRYPOINT;
                int i7 = 1;
                List singletonList = Collections.singletonList(1);
                CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = new CommonStat$TypeTrackCodeItem("sugg_msg_direct");
                CommonVasStat$TypeIvasItemViews.BlockType blockType = CommonVasStat$TypeIvasItemViews.BlockType.SUGGESTION;
                mj0 mj0Var = ((zzt) obj).l;
                UserId p = mj0Var.p();
                new hzp0.w(schemeStat$EventItem, new CommonVasStat$TypeIvasItemViews(itemType, singletonList, i7, blockType, null, null, commonStat$TypeTrackCodeItem, i7, p != null ? Long.valueOf(p.b) : null, null, mj0Var.b(), null, 2608, null)).a();
                break;
            case 19:
                ((jp5) obj).invoke(g5u.a.a);
                break;
            case 20:
                ((i7u) obj).c.invoke(f6u.a.a);
                break;
            case 21:
                GroupedNotificationListFragment groupedNotificationListFragment = (GroupedNotificationListFragment) obj;
                break;
            case 22:
                invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27((HandleInvocationsFromAdViewer) obj);
                break;
            case 23:
                HeaderVh headerVh = (HeaderVh) obj;
                View view2 = headerVh.f;
                if (view2 == null) {
                    view2 = null;
                }
                Drawable drawable = view2.getContext().getDrawable(R.drawable.vk_icon_chevron_outline_16);
                View view3 = headerVh.f;
                break;
            case 24:
                int i8 = HighlightEditFragment.h0;
                break;
            case 25:
                bcv bcvVar = (bcv) obj;
                int i9 = bcvVar.k.getAfterExtraRect().left;
                int i10 = bcvVar.k.getAfterMainRect().bottom;
                wzs<Integer, Integer, s3q0> wzsVar = bcvVar.a.j;
                if (wzsVar != null) {
                    wzsVar.invoke(Integer.valueOf(i9), Integer.valueOf(i10));
                }
                break;
            case 26:
                break;
            case 27:
                ((vkw.a) obj).b = true;
                break;
            case 28:
                fvv0 M = ((r6y) obj).M();
                if (M != null && (view = M.getView()) != null) {
                    view.n9();
                }
                break;
            default:
                ((VkImage) obj).setVisibility(4);
                break;
        }
        return s3q0.a;
    }
}
