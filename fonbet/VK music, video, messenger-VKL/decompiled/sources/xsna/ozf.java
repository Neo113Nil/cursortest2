package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.attachpicker.impl.fragment.AchievementsFragment;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Source;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.privacy.ListFriends;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.drafts.DraftsFeedRecyclerPaginatedView;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.hgp;
import xsna.osp;
import xsna.tij;
import xsna.w1g0;
import xsna.wmk;
import xsna.wu1;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ozf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ozf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        jfk jfkVar;
        tnt tntVar;
        jfk jfkVar2;
        tnt tntVar2;
        tnt tntVar3;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                pzf pzfVar = (pzf) obj;
                if (!((Boolean) pzfVar.d.getValue()).booleanValue() && !((Boolean) pzfVar.e.getValue()).booleanValue()) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 1:
                return k3g.b((k3g) obj);
            case 2:
                return (VkText) ((uqg) obj).findViewById(R.id.community_address_info_cell_title);
            case 3:
                return (VkImageSimple) ((cxg) obj).findViewById(R.id.close_button);
            case 4:
                tmh tmhVar = ((vmh) obj).a;
                dw20 dw20Var = tmhVar.g;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                tmhVar.d.invoke(new CommunityProfileAction.e.d.a(true));
                return s3q0.a;
            case 5:
                ((d4h) obj).i.invoke(new CommunityProfileAction.CommunityInternalMenuAction(CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.OPEN_MENU, null, null));
                return s3q0.a;
            case 6:
                int i2 = CommunityNotificationSettingsFragment.b0;
                return ((NotificationsComponent) m7m.d((CommunityNotificationSettingsFragment) obj).a(fpf0.a(NotificationsComponent.class))).b();
            case 7:
                return ((LinksBridgeComponent) ((h7m) obj).a(fpf0.a(LinksBridgeComponent.class))).p().e();
            case 8:
                xn50.a.c((CommunityRepliesFragment) obj, new w1g0.p(false));
                return s3q0.a;
            case 9:
                ((com.vk.im.ui.components.contacts.a) obj).e1(Source.CACHE, false);
                return s3q0.a;
            case 10:
                tij tijVar = (tij) obj;
                if (tijVar.i) {
                    List<ProfileFriendItem> list = tijVar.Z0().c;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ProfileFriendItem) it.next()).b);
                    }
                    List<ListFriends> list2 = tijVar.Z0().d;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((ListFriends) it2.next()).b));
                    }
                    List<ProfileFriendItem> list3 = tijVar.Z0().a;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((ProfileFriendItem) it3.next()).b);
                    }
                    List<ListFriends> list4 = tijVar.Z0().b;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(Integer.valueOf(((ListFriends) it4.next()).b));
                    }
                    tijVar.f1(new tij.a(arrayList, arrayList2, arrayList3, arrayList4));
                } else {
                    tijVar.e1();
                }
                return s3q0.a;
            case 11:
                return new gjl((uvj) obj);
            case 12:
                int i3 = CreateAlbumFragment.Z;
                return (PhotoAlbum) ((CreateAlbumFragment) obj).requireArguments().getParcelable("album");
            case 13:
                uik uikVar = (uik) obj;
                if (uikVar.l) {
                    hfk hfkVar = uikVar.e;
                    float cropWidth = hfkVar.getCropWidth();
                    float x0 = hfkVar.getX0();
                    float y0 = hfkVar.getY0();
                    hfkVar.g(hfkVar.getCropAspectRatio());
                    float cropWidth2 = hfkVar.getCropWidth();
                    float x02 = hfkVar.getX0();
                    float y02 = hfkVar.getY0();
                    if (cropWidth != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f = cropWidth2 / cropWidth;
                        jfk jfkVar3 = uikVar.o;
                        if (jfkVar3 != null && (tntVar3 = jfkVar3.j) != null) {
                            tntVar3.a(f, x0, y0);
                        }
                    }
                    if (x0 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (jfkVar2 = uikVar.o) != null && (tntVar2 = jfkVar2.j) != null) {
                        tntVar2.c(x02 - x0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (y0 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (jfkVar = uikVar.o) != null && (tntVar = jfkVar.j) != null) {
                        tntVar.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, y02 - y0);
                    }
                    jfk jfkVar4 = uikVar.o;
                    if (jfkVar4 != null) {
                        jfkVar4.i();
                    }
                    uikVar.q.removeMessages(0);
                    jfk jfkVar5 = uikVar.o;
                    if (jfkVar5 != null) {
                        jfkVar5.e();
                    }
                    jfk jfkVar6 = uikVar.o;
                    if (jfkVar6 != null) {
                        jfkVar6.h(false, new se0(17));
                    }
                }
                return s3q0.a;
            case 14:
                ((wmk.a) obj).m.p();
                return s3q0.a;
            case 15:
                int i4 = DeprecatedAttachActivity.K0;
                AchievementsFragment.a aVar = new AchievementsFragment.a();
                aVar.j.putLong("peer_id", ((DeprecatedAttachActivity) obj).q0);
                return aVar.f();
            case 16:
                return new com.vk.im.popup.b(((afm) obj).k.B());
            case 17:
                Context context = ((egm) obj).d;
                return new yri(context, e3m.f(R.attr.vk_ui_icon_accent_themed, context));
            case 18:
                return ((DiscoverMediaTabFragment2) obj).n0;
            case 19:
                hbn hbnVar = (hbn) obj;
                Map<String, wan> map = hbnVar.h;
                if (map == null) {
                    return jgp.b;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(map.size()));
                Iterator<T> it5 = map.entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry entry = (Map.Entry) it5.next();
                    linkedHashMap.put(entry.getKey(), hbnVar.a.a((wan) entry.getValue()));
                }
                return linkedHashMap;
            case 20:
                gzs<s3q0> gzsVar = ((DraftsFeedRecyclerPaginatedView) obj).V;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 21:
                ((wfo) obj).d();
                return s3q0.a;
            case 22:
                ((dw20) obj).dismiss();
                return s3q0.a;
            case 23:
                return new hgp.b((hgp) obj);
            case 24:
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) obj;
                return new xzb0(new EntriesListPresenter.u(new EntriesListPresenter.q(entriesListPresenter, EntriesListPresenter.class, "ref", "getRef()Ljava/lang/String;", 0)), new EntriesListPresenter.u(new EntriesListPresenter.r(entriesListPresenter, EntriesListPresenter.class, "listRef", "getListRef()Ljava/lang/String;", 0)), entriesListPresenter.b, new EntriesListPresenter.s(1, entriesListPresenter, EntriesListPresenter.class, "retryLazyLoadEntry", "retryLazyLoadEntry(Lcom/vk/feed/core/models/news/NewsEntry;)V", 0), new jd60());
            case 25:
                osp.a aVar2 = (osp.a) obj;
                ww50 v = s200.v(aVar2.c);
                if (v != null) {
                    v.H(aVar2.k);
                }
                aVar2.h.invoke();
                aVar2.p.dispose();
                return s3q0.a;
            case 26:
                return new itm((a1w) obj);
            case 27:
                wu1.a.b bVar = (wu1.a.b) ((wu1) obj);
                long j = bVar.b;
                long j2 = bVar.a;
                StringBuilder b = fp.b(j, "Not enough space. Available size: ", ". Requested size: ");
                b.append(j2);
                return b.toString();
            case 28:
                ((ipr) obj).b.invalidate();
                return s3q0.a;
            default:
                FriendsFragment friendsFragment = (FriendsFragment) obj;
                return Boolean.valueOf((friendsFragment.X || friendsFragment.c0) ? false : true);
        }
    }

    public /* synthetic */ ozf(hbn hbnVar, gbn gbnVar) {
        this.b = 19;
        this.c = hbnVar;
    }
}
