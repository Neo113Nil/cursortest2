package xsna;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.friends.dto.FriendsFriendsListDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicSignalVh;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.FriendFolder;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonViewRedesign;
import com.vk.music.player.PlayState;
import com.vk.photo.editor.views.zoom.ZoomRootLayout;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import xsna.ikv0;
import xsna.koj0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class v95 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v95(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean z;
        Object obj3;
        FriendFolder friendFolder;
        Object obj4;
        NewsfeedCoowners.CoownerStatus coownerStatus;
        Object obj5;
        Object obj6;
        int i2 = this.b;
        int i3 = 14;
        int i4 = 2;
        String str = null;
        Object obj7 = this.c;
        switch (i2) {
            case 0:
                ((Integer) obj2).intValue();
                ((gzs) obj7).invoke();
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((lw6) obj7).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                dt8 dt8Var = (dt8) obj7;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1665194694, intValue, -1, "com.vk.music.ui.subscription.BuyMusicSubscriptionController.createContentView.<anonymous>.<anonymous> (BuyMusicSubscriptionController.kt:92)");
                    }
                    boolean y = aVar.y(dt8Var);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new w40(dt8Var, i3);
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y2 = aVar.y(dt8Var);
                    Object x2 = aVar.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new com.vk.movika.sdk.base.hooks.p(dt8Var, 17);
                        aVar.R(x2);
                    }
                    sc40.b(0, aVar, gzsVar, (izs) x2, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj).intValue();
                return Boolean.valueOf(epx.f(((i3i) obj2).b.c, ((a.h) obj7).b));
            case 4:
                ((xlb0) obj).a();
                ((wfo) obj7).c(((ov70) obj2).a);
                return s3q0.a;
            case 5:
                int intValue2 = ((Integer) obj).intValue();
                ((Integer) obj2).getClass();
                return Boolean.valueOf(intValue2 < ((MsgSkeletonViewRedesign) obj7).getSkeletonConfig().c);
            case 6:
                MusicSignalVh musicSignalVh = (MusicSignalVh) obj7;
                ((Integer) obj).intValue();
                return Boolean.valueOf(musicSignalVh.b.y0((MusicTrack) obj2) && musicSignalVh.b.m0() != PlayState.STOPPED);
            case 7:
                ((Integer) obj2).getClass();
                ((yl70) obj7).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                hb80 hb80Var = (hb80) obj7;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-69149431, intValue3, -1, "com.vk.catalog2.common.ui.mvp.OnScrollGrowthTrapButtonRenderer.createButton.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnScrollGrowthTrapButtonRenderer.kt:139)");
                    }
                    q630 H = s200.H(q630.a.a, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                    nh3 nh3Var = hb80Var.b;
                    ButtonSize buttonSize = ButtonSize.Medium;
                    ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_chevron_16, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    bhu0.e(nh3Var, buttonSize, buttonStyle, buttonAppearance, H, null, false, false, null, null, null, d370.N(R.string.video_growth_trap_button_text, 0, aVar2), null, a, null, new pco(16), false, null, null, null, aVar2, 48, 1605632, 0, 4108256);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 9:
                ((com.vk.video.ui.discovery.minimizable.related_videos.a) obj7).a.invoke(new com.vk.video.ui.discovery.minimizable.e(((Integer) obj2).intValue(), ((Long) obj).longValue()));
                return s3q0.a;
            case 10:
                List list = (List) obj;
                List list2 = (List) obj2;
                StringBuilder sb = new StringBuilder();
                for (PrivacySetting.PrivacyRule privacyRule : (List) obj7) {
                    sb.append(privacyRule.Ab());
                    if (privacyRule instanceof PrivacyRules.UserListPrivacyRule) {
                        char c = ' ';
                        sb.append(' ');
                        PrivacyRules.UserListPrivacyRule userListPrivacyRule = (PrivacyRules.UserListPrivacyRule) privacyRule;
                        int Db = userListPrivacyRule.Db();
                        int i5 = 0;
                        while (i5 < Db) {
                            UserId Eb = userListPrivacyRule.Eb(i5);
                            long j = Eb.b;
                            if (j < 2000000000) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        if (epx.f(((UsersUserFullDto) obj4).s1(), Eb)) {
                                        }
                                    } else {
                                        obj4 = str;
                                    }
                                }
                                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj4;
                                String a2 = usersUserFullDto != null ? rq.a(usersUserFullDto, new StringBuilder(), c) : str;
                                if (a2 != null) {
                                    sb.append(a2);
                                } else {
                                    sb.append("id");
                                    sb.append(Eb);
                                }
                                i = Db;
                                z = r10;
                            } else {
                                UserId userId = new UserId(j - 2000000000);
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        i = Db;
                                        z = r10;
                                        if (((FriendsFriendsListDto) obj3).getId() != userId.b) {
                                            Db = i;
                                            r10 = z;
                                        }
                                    } else {
                                        i = Db;
                                        z = r10;
                                        obj3 = null;
                                    }
                                }
                                FriendsFriendsListDto friendsFriendsListDto = (FriendsFriendsListDto) obj3;
                                if (friendsFriendsListDto != null) {
                                    friendFolder = new FriendFolder();
                                    friendFolder.b = friendsFriendsListDto.getId();
                                    friendFolder.c = friendsFriendsListDto.d();
                                } else {
                                    friendFolder = null;
                                }
                                if (friendFolder != null) {
                                    sb.append(friendFolder.c);
                                } else {
                                    sb.append("list");
                                    sb.append(userId);
                                }
                            }
                            if (i5 != userListPrivacyRule.Db() - 1) {
                                sb.append(", ");
                            }
                            i5++;
                            Db = i;
                            r10 = z;
                            c = ' ';
                            str = null;
                        }
                    }
                }
                return sb.toString();
            case 11:
                ((Integer) obj2).getClass();
                ((ggd0) obj7).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 12:
                qcy<Object>[] qcyVarArr = PublishFragment.Q;
                ((PublishFragment) obj7).fo().b(new mbe0((PrivacySetting) obj, (DonutLevel) obj2));
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                ((ote0) obj7).b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 14:
                koj0.a aVar3 = (koj0.a) obj7;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(777623483, intValue4, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.SimilarVideoItemDelegate.ViewHolder.<anonymous> (SimilarVideoItemDelegate.kt:55)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(1479844536, new w1(aVar3, 8), aVar4), aVar4, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 15:
                fzk0 fzk0Var = (fzk0) obj7;
                pn60 pn60Var = fzk0Var.c;
                List list3 = (List) obj2;
                int i6 = fzk0Var.b;
                UserId userId2 = fzk0Var.a;
                if (obj instanceof Post) {
                    boolean z2 = i6 == 1 || i6 == 3;
                    if (!epx.f(sni.l((NewsEntry) obj), userId2)) {
                        NewsfeedCoowners newsfeedCoowners = ((Post) obj).f0;
                        if (newsfeedCoowners != null) {
                            Iterator<T> it3 = newsfeedCoowners.f.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj5 = it3.next();
                                    if (epx.f(((NewsfeedCoowners.CoownerStatus) obj5).b.b, userId2)) {
                                    }
                                } else {
                                    obj5 = null;
                                }
                            }
                            coownerStatus = (NewsfeedCoowners.CoownerStatus) obj5;
                        } else {
                            coownerStatus = null;
                        }
                        if (coownerStatus != null) {
                            coownerStatus.b.g(4, z2);
                        }
                        if (coownerStatus != null) {
                            coownerStatus.e = z2;
                        }
                        return pn60.c(pn60Var, obj, null, null, 14);
                    }
                    Post post = (Post) obj;
                    Owner owner = post.o;
                    post.J = i6 == 0;
                    owner.p(i6 == 3);
                    owner.g(4, z2);
                    NewsfeedCoowners newsfeedCoowners2 = post.f0;
                    if (newsfeedCoowners2 != null) {
                        Iterator<T> it4 = newsfeedCoowners2.f.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj6 = it4.next();
                                if (epx.f(((NewsfeedCoowners.CoownerStatus) obj6).b.b, userId2)) {
                                }
                            } else {
                                obj6 = null;
                            }
                        }
                        NewsfeedCoowners.CoownerStatus coownerStatus2 = (NewsfeedCoowners.CoownerStatus) obj6;
                        if (coownerStatus2 != null) {
                            coownerStatus2.e = z2;
                        }
                    }
                    return pn60.c(pn60Var, obj, null, null, 14);
                }
                if (obj instanceof Videos) {
                    if (!epx.f(sni.l((NewsEntry) obj), userId2)) {
                        return list3;
                    }
                    Videos videos = (Videos) obj;
                    videos.x = i6 == 0;
                    Owner owner2 = videos.m;
                    if (owner2 != null) {
                        owner2.p(i6 == 3);
                    }
                    return pn60.c(pn60Var, obj, null, null, 14);
                }
                if (obj instanceof ShitAttachment) {
                    ShitAttachment shitAttachment = (ShitAttachment) obj;
                    if (!shitAttachment.Gb()) {
                        return list3;
                    }
                    VideoAttachment videoAttachment = shitAttachment.I;
                    if (!epx.f(videoAttachment != null ? videoAttachment.k.I0() : null, userId2)) {
                        return list3;
                    }
                    shitAttachment.g0 = i6 == 0;
                    return pn60.c(pn60Var, obj, null, null, 14);
                }
                if (obj instanceof GroupsSuggestions) {
                    Iterator<GroupSuggestion> it5 = ((GroupsSuggestions) obj).l.iterator();
                    while (it5.hasNext()) {
                        Group group = it5.next().b;
                        if (epx.f(group.c, fkq0.e(userId2))) {
                            group.C = i6;
                            return pn60.c(pn60Var, obj, null, null, 14);
                        }
                    }
                    return list3;
                }
                if (!(obj instanceof Digest)) {
                    return list3;
                }
                Object[] objArr = false;
                for (DigestItem digestItem : ((Digest) obj).m) {
                    if (epx.f(digestItem.g.m, userId2)) {
                        digestItem.g.J = i6 == 0;
                        objArr = true;
                    }
                }
                return objArr != false ? pn60.c(pn60Var, obj, null, null, 14) : list3;
            case 16:
                vfm0 vfm0Var = (vfm0) obj7;
                Throwable th = (Throwable) obj;
                izs izsVar = (izs) obj2;
                View view = vfm0Var.b;
                Window window = (Window) vfm0Var.c.invoke();
                if (window == null) {
                    return new kud0(i4);
                }
                Context context = view.getContext();
                lpj lpjVar = context instanceof lpj ? (lpj) context : null;
                Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                int i7 = dhr0.u().c;
                if (valueOf == null || valueOf.intValue() != i7) {
                    context = new l7s(context, dhr0.u().c);
                }
                int i8 = h03.a(th) ? R.string.network_error : R.string.download_error;
                ikv0.a aVar5 = new ikv0.a(context);
                int i9 = 6;
                aVar5.u = new ikv0.d(context.getString(i8), (String) (null == true ? 1 : 0), (ikv0.d.a) (null == true ? 1 : 0), i9);
                aVar5.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.viewer_retry), new v77(izsVar, i9));
                aVar5.e = -1L;
                aVar5.o = 0;
                return new fyd0(aVar5.p(window), 10);
            case 17:
                ((Integer) obj2).getClass();
                ((lnx0) obj7).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                return ZoomRootLayout.d((ZoomRootLayout) obj7, (View) obj, (ZoomRootLayout.a) obj2);
        }
    }

    public /* synthetic */ v95(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }

    public /* synthetic */ v95(jed0 jed0Var, List list) {
        this.b = 10;
        this.c = list;
    }
}
