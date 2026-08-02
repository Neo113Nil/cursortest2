package xsna;

import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetGroupInfoResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetSubscriptionsExtendedResponseDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.id.UserId;
import com.vk.dto.podcast.ExtendedPodcast;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.domain.model.ItemsForReviewViewTypeModel;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.music.podcast.impl.ui.list.PodcastEpisodesListFragment;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.fragments.NewsfeedFeedbackPollFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.ModalPostRepostsTabFragment;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.media.ReachabilityServiceImpl;
import xsna.c610;
import xsna.cf70;
import xsna.gm50;
import xsna.ixd0;
import xsna.oox0;
import xsna.p810;
import xsna.q1b0;
import xsna.ro90;
import xsna.tj50;
import xsna.u3e0;
import xsna.wpc0;
import xsna.z510;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class d410 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d410(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj2;
        UserProfile userProfile;
        Object obj3;
        BaseBoolIntDto I3;
        s3q0 pollTimer$lambda$0;
        int i = this.b;
        int i2 = 15;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                int i3 = MarketItemReviewsFragment.w0;
                ((n310) ((MarketItemReviewsFragment) obj4).V.getValue()).setItems((List) obj);
                return s3q0.a;
            case 1:
                x510 x510Var = (x510) obj4;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    z510 z510Var = x510Var.m;
                    ItemsForReviewViewTypeModel itemsForReviewViewTypeModel = x510Var.g;
                    z510Var.getClass();
                    if (z510.a.$EnumSwitchMapping$0[itemsForReviewViewTypeModel.ordinal()] == 1) {
                        z510Var.b.e().edit().putLong("date_of_last_showing_offers_to_user_from_community", new Date().getTime()).apply();
                    }
                }
                return new c610.c(list);
            case 2:
                ((f810) obj4).T(new p810.p((Throwable) obj));
                return s3q0.a;
            case 3:
                su10 su10Var = (su10) obj4;
                ((zak0) su10Var.p).setValue((MediaPickerConfiguration.MediaType) su10Var.e.get((String) obj));
                return s3q0.a;
            case 4:
                nj0 nj0Var = ((eg20) obj4).b;
                List<j0l0> O0 = j5g.O0(((xb80) obj).b);
                ArrayList arrayList3 = new ArrayList(c5g.u(O0, 10));
                for (j0l0 j0l0Var : O0) {
                    arrayList3.add(new e0l0(j0l0Var.a, j0l0Var.b));
                }
                nj0Var.a.K(arrayList3);
                return s3q0.a;
            case 5:
                int i4 = ModalPostRepostsTabFragment.Y;
                ((ModalPostRepostsTabFragment) obj4).io();
                return s3q0.a;
            case 6:
                is30 is30Var = (is30) obj4;
                pk30 pk30Var = is30Var.k;
                js30 js30Var = is30Var.l;
                Msg msg = js30Var != null ? js30Var.m : null;
                Parcelable parcelable = js30Var != null ? js30Var.o : null;
                AttachWithTranscription attachWithTranscription = parcelable instanceof AttachWithTranscription ? (AttachWithTranscription) parcelable : null;
                if (pk30Var != null && msg != null && attachWithTranscription != null) {
                    pk30Var.q(msg, attachWithTranscription, true);
                }
                return s3q0.a;
            case 7:
                int i5 = zur0.o;
                return new zur0((DialogItemView) bwt0.I(R.layout.vkim_dialogs_list_item_dialog, (ViewGroup) obj, false), ((rx30) obj4).h);
            case 8:
                kz30 kz30Var = (kz30) obj4;
                int i6 = GiftsCatalogFragment.c0;
                GiftsCatalogFragment.b.b(kz30Var.i, Collections.singletonList(Integer.valueOf(((dqt) obj).b.b.c)), j5g.O0(kz30Var.l), null, "sticker_longtap_keyboard", 40);
                return s3q0.a;
            case 9:
                return (io.reactivex.rxjava3.internal.operators.single.d0) obj4;
            case 10:
                com.vk.superapp.widget_settings.p004new.a aVar = (com.vk.superapp.widget_settings.p004new.a) obj4;
                int i7 = com.vk.superapp.widget_settings.p004new.a.n1;
                gm50.a.a(aVar, ((oox0.a) obj).a, new bgy(aVar, i2));
                return s3q0.a;
            case 11:
                sg60 sg60Var = (sg60) obj4;
                x960 x960Var = (x960) obj;
                String str = x960Var.a().b.l;
                if (str == null || str.length() == 0) {
                    sg60Var.g.reset();
                }
                if (!x960Var.a().b.n && sg60Var.g.a(x960Var.a().c, x960Var.a().b.l, x960Var.a().b.b, x960Var.a().b.j, x960Var.a().b.k, null)) {
                    x960Var.a().c.clear();
                }
                return x960Var;
            case 12:
                NewsfeedFeedbackPollFragment newsfeedFeedbackPollFragment = (NewsfeedFeedbackPollFragment) obj4;
                int i8 = NewsfeedFeedbackPollFragment.g0;
                if (newsfeedFeedbackPollFragment.mo()) {
                    newsfeedFeedbackPollFragment.no();
                } else {
                    newsfeedFeedbackPollFragment.finish();
                }
                return s3q0.a;
            case 13:
                qe70 qe70Var = (qe70) obj4;
                Gson gson = qe70Var.m;
                StoriesGetSubscriptionsExtendedResponseDto storiesGetSubscriptionsExtendedResponseDto = (StoriesGetSubscriptionsExtendedResponseDto) obj;
                List<UsersUserDto> f = storiesGetSubscriptionsExtendedResponseDto.f();
                if (f != null) {
                    List<UsersUserDto> list2 = f;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new UserProfile(new JSONObject(gson.toJson((UsersUserDto) it.next()))));
                    }
                } else {
                    arrayList = null;
                }
                List<GroupsGroupFullDto> d = storiesGetSubscriptionsExtendedResponseDto.d();
                if (d != null) {
                    List<GroupsGroupFullDto> list3 = d;
                    arrayList2 = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new UserProfile(new JSONObject(gson.toJson((GroupsGroupFullDto) it2.next()))));
                    }
                } else {
                    arrayList2 = null;
                }
                ArrayList arrayList4 = new ArrayList();
                for (UserId userId : storiesGetSubscriptionsExtendedResponseDto.e()) {
                    if (fkq0.b(userId)) {
                        if (arrayList2 != null) {
                            Iterator it3 = arrayList2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj3 = it3.next();
                                    if (epx.f(((UserProfile) obj3).c, userId)) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            userProfile = (UserProfile) obj3;
                        }
                        userProfile = null;
                    } else {
                        if (arrayList != null) {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj2 = it4.next();
                                    if (epx.f(((UserProfile) obj2).c, userId)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            userProfile = (UserProfile) obj2;
                        }
                        userProfile = null;
                    }
                    if (userProfile != null) {
                        arrayList4.add(userProfile);
                    }
                }
                qe70Var.T(new cf70.h(arrayList4));
                return s3q0.a;
            case 14:
                ((hg70) obj4).T(sg70.b);
                return s3q0.a;
            case 15:
                int i9 = bl70.f1;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.B0.g();
                ((bl70) obj4).tn();
                return s3q0.a;
            case 16:
                ((PastBroadcastsFragment) obj4).R.a(ro90.e.a);
                return s3q0.a;
            case 17:
                q1b0 q1b0Var = (q1b0) obj4;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                if (q1b0Var instanceof q1b0.a) {
                    ((q1b0.a) q1b0Var).c.setVisibility(booleanValue ? 0 : 8);
                } else {
                    if (!(q1b0Var instanceof q1b0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((q1b0.b) q1b0Var).e.invoke(bool);
                }
                return s3q0.a;
            case 18:
                return hgb0.a(bi20.a((bi20) obj4, CatalogDataType.DATA_TYPE_PODCASTS, null, null, null, null, null, 33554427), ((ExtendedPodcast) obj).f, null);
            case 19:
                int i10 = PodcastEpisodesListFragment.d0;
                ((PodcastEpisodesListFragment) obj4).s();
                return s3q0.a;
            case 20:
                nib0 nib0Var = (nib0) obj4;
                StringBuffer stringBuffer = nib0Var.f;
                stringBuffer.setLength(0);
                nib0Var.h.format((((Integer) obj).intValue() + 5) * 0.1d, stringBuffer, nib0Var.g);
                return stringBuffer.toString();
            case 21:
                PodcastsGetGroupInfoResponseDto podcastsGetGroupInfoResponseDto = (PodcastsGetGroupInfoResponseDto) obj4;
                List<GroupsGroupFullDto> d2 = ((GroupsGetByIdObjectResponseDto) obj).d();
                GroupsGroupFullDto groupsGroupFullDto = d2 != null ? (GroupsGroupFullDto) j5g.a0(d2) : null;
                return PodcastsGetGroupInfoResponseDto.a(podcastsGetGroupInfoResponseDto, Integer.valueOf(((groupsGroupFullDto == null || (I3 = groupsGroupFullDto.I3()) == null || I3.i() != 1) ? 0 : 1) ^ 1), Integer.valueOf(groupsGroupFullDto != null ? epx.f(groupsGroupFullDto.p(), Boolean.TRUE) : 0), Integer.valueOf(groupsGroupFullDto != null ? epx.f(groupsGroupFullDto.Q3(), Boolean.TRUE) : 0), null, 65468);
            case 22:
                ((Integer) obj).getClass();
                ((com.vk.im.popup.b) obj4).dismiss();
                return s3q0.a;
            case 23:
                qkc0 qkc0Var = (qkc0) obj4;
                tj50.a aVar2 = (tj50.a) obj;
                vpc0 vpc0Var = qkc0Var.d;
                sec secVar = new sec(vpc0Var, 7);
                ao8 ao8Var = ao8.d;
                int i11 = 19;
                int i12 = 17;
                return new wpc0.a.b(aVar2.a(secVar, ao8Var), aVar2.a(new u19(vpc0Var, 6), ao8Var), aVar2.a(new w110(qkc0Var, i2), ao8Var), aVar2.a(new gky(i11), ao8Var), aVar2.a(new f6w(i11), ao8Var), aVar2.a(new l140(r4), ao8Var), aVar2.a(new oqu(25), ao8Var), aVar2.a(new bqt(20), ao8Var), aVar2.a(zkc0.b, ao8Var), aVar2.a(new mf8(vpc0Var, 10), ao8Var), aVar2.a(new jnb(vpc0Var, 11), ao8Var), aVar2.a(new kf8(vpc0Var, 7), ao8Var), aVar2.a(new pf8(vpc0Var, 11), ao8Var), aVar2.a(new b95(vpc0Var, 9), ao8Var), aVar2.a(new c95(vpc0Var, 7), ao8Var), aVar2.a(xkc0.b, ao8Var), aVar2.a(new ykc0(1, vpc0Var, vpc0.class, "mapCrops", "mapCrops(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState$Editing;)Lcom/vk/newsfeed/posting/impl/domain/model/PostingCropsForRatio;", 0), ao8Var), aVar2.a(new k220(14), ao8Var), aVar2.a(new oey(i12), ao8Var), aVar2.a(new com.vk.repository.internal.repos.stickers.suggests.a(vpc0Var, 10), ao8Var), aVar2.a(new p2u(i11), ao8Var), aVar2.a(new zos(i12), ao8Var), aVar2.a(new pey(i11), ao8Var), aVar2.a(new quz(i12), ao8Var), aVar2.a(new qi00(qkc0Var, 26), ao8Var), aVar2.a(new xpt(i12), ao8Var), aVar2.a(new foh(vpc0Var, 5), ao8Var));
            case 24:
                ((h4d0) obj4).a.r(new u3e0.b(true));
                return s3q0.a;
            case 25:
                return new vod0((ViewGroup) obj, ((aod0) obj4).j);
            case 26:
                ((bqd0) obj4).b((com.vk.ecomm.product_list.presentation.e) obj);
                return s3q0.a;
            case 27:
                cts ctsVar = (cts) obj;
                int i13 = ((exd0) obj4).d instanceof FriendsListParams.HiddenFriendsList ? R.string.users_header_title : R.string.best_friends_header_friends;
                List<ox6> list4 = ctsVar.a;
                List<ProfileFriendItem> list5 = ctsVar.b;
                boolean isEmpty = list4.isEmpty();
                boolean z = !isEmpty;
                rmk0 rmk0Var = new rmk0(4);
                rmk0Var.a(!isEmpty ? new axd0(y8g0.e(R.string.best_friends_header_conversations), false) : null);
                List<ox6> list6 = ctsVar.a;
                ArrayList arrayList5 = new ArrayList(c5g.u(list6, 10));
                Iterator<T> it5 = list6.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(new px6((ox6) it5.next(), true, EmptyList.b, false));
                }
                rmk0Var.b(arrayList5.toArray(new px6[0]));
                rmk0Var.a(list5.isEmpty() ? null : new axd0(y8g0.e(i13), z));
                List<ProfileFriendItem> list7 = list5;
                ArrayList arrayList6 = new ArrayList(c5g.u(list7, 10));
                Iterator<T> it6 = list7.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(new jqs((ProfileFriendItem) it6.next(), false, false, false));
                }
                rmk0Var.b(arrayList6.toArray(new jqs[0]));
                ArrayList<Object> arrayList7 = rmk0Var.a;
                return new ixd0.d(rl3.I(arrayList7.toArray(new hfz[arrayList7.size()])));
            case 28:
                pollTimer$lambda$0 = ReachabilityServiceImpl.pollTimer$lambda$0((ReachabilityServiceImpl) obj4, (qox) obj);
                return pollTimer$lambda$0;
            default:
                ((a2e0) obj4).a();
                return s3q0.a;
        }
    }
}
