package xsna;

import android.content.Context;
import com.vk.api.generated.account.dto.AccountInfoDto;
import com.vk.api.generated.account.dto.AccountInfoMarketAdult18plusDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.reviews.impl.allreviews.presentation.e;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.link.EnhancedFeedLinkCard;
import com.vk.feed.design.view.newsfeed.link.FeedLinkCard;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.ImCreateChatFastFragment;
import com.vk.log.L;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import xsna.atb0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tuq implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ tuq(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MusicPickerLoadingState l7;
        boolean z = false;
        switch (this.b) {
            case 0:
                return EmptyList.b;
            case 1:
                EnhancedFeedLinkCard enhancedFeedLinkCard = new EnhancedFeedLinkCard((Context) obj, null, 6);
                enhancedFeedLinkCard.setContent(new FeedLinkCard.b.a("https://sun9-16.userapi.com/s/v1/ig2/C16DtmtNbwTY7LP95rHkQBWEQYvN352fIARx-LfyCzry79HMHg8zk-lcXIW6m-LdKWj32S9fn3-5ew1CxkvE645W.jpg?quality=95&as=32x18,48x27,72x40,108x61,160x90,240x135,360x202,480x270,540x304,640x360,720x405,1080x607,1280x720,1440x810,1920x1080&from=bu&cs=1920x0", null, true, "H,2:1"));
                enhancedFeedLinkCard.setOverlayContent(new FeedLinkCard.OverlayContent.ActionButtonWithTitle("Очень длинный заголовок на столько, что должен не вмещаться в одну строку и, возможно, даже в три строки", "Смотреть", FeedLinkCard.OverlayContent.ActionButtonWithTitle.Appearance.Contrast));
                return enhancedFeedLinkCard;
            case 2:
                DialogsHistory dialogsHistory = (DialogsHistory) obj;
                return new utk(new xrm(dialogsHistory, null, fsk.l(dialogsHistory), null, 10), dialogsHistory.j());
            case 3:
                L.i((Throwable) obj);
                return s3q0.a;
            case 4:
                List<UsersUserFullDto> d = ((FriendsGetFieldsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (UsersUserFullDto usersUserFullDto : d) {
                    Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                    arrayList.add(ProfileFriendItem.a.b(usersUserFullDto));
                }
                EmptyList emptyList = EmptyList.b;
                return new kqs(arrayList, emptyList, emptyList, emptyList);
            case 5:
                return ((jet) obj).d;
            case 6:
                int i = ImCreateChatFastFragment.y0;
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 7:
                v7w v7wVar = (v7w) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(v7wVar.a.a);
                sb.append('-');
                sb.append(com.vk.im.engine.models.im_item.b.a(v7wVar.b));
                return sb.toString();
            case 8:
                BaseUploadServerDto baseUploadServerDto = (BaseUploadServerDto) obj;
                return new ncq0(baseUploadServerDto.e(), baseUploadServerDto.d(), null, null, null, 28);
            case 9:
                return e.d.a;
            case 10:
                return Boolean.valueOf(((x410) obj).m);
            case 11:
                return s3q0.a;
            case 12:
                AccountInfoMarketAdult18plusDto l = ((AccountInfoDto) obj).l();
                boolean z2 = l != null && l.d();
                if (l != null && l.e()) {
                    z = true;
                }
                return new or00(z2, z);
            case 13:
                return Long.valueOf(((Peer) obj).b);
            case 14:
                return Integer.valueOf(((Msg) obj).b);
            case 15:
                return new tt70(5, 0L, rli0.A(rli0.y(rli0.t(new i5g((List) obj), new gvs(11)), 2)));
            case 16:
                MusicOfflineSyncServiceHelper.h("audio.getPlaylistById", (Throwable) obj);
                return s3q0.a;
            case 17:
                MusicPickerList musicPickerList = (MusicPickerList) j5g.k0(((MusicPickerState) obj).j);
                return (musicPickerList == null || (l7 = musicPickerList.l7()) == null) ? MusicPickerLoadingState.None : l7;
            case 18:
                Set<String> set = MusicTrackCellVh.A;
                return s3q0.a;
            case 19:
                return s3q0.a;
            case 20:
                qgi0.r((tgi0) obj, "podcastEpisodeName");
                return s3q0.a;
            case 21:
                L.A("PictureInPictureOverlayManager", "finish");
                com.vk.voip.ui.c.C(com.vk.voip.ui.c.b, null, 0L, false, false, true, null, 207);
                return s3q0.a;
            case 22:
                return s3q0.a;
            case 23:
                int i2 = PodcastEpisodeFragment.u0;
                qgi0.r((tgi0) obj, "toolbar_icon_more");
                return s3q0.a;
            case 24:
                return new atb0.b(((tj50.a) obj).a(rsb0.b, ao8.d));
            case 25:
                Post R = di60.R((NewsEntry) obj);
                if (R != null && !R.pc()) {
                    ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                    jt50.a(SingleEvent.POST);
                }
                return s3q0.a;
            case 26:
                qgi0.r((tgi0) obj, "priority_block_empty_add_btn");
                return s3q0.a;
            case 27:
                L.l(new String[0]);
                return s3q0.a;
            case 28:
                return Boolean.valueOf(!((List) obj).isEmpty());
            default:
                qgi0.r((tgi0) obj, "ScreenTags.TOOLBAR_ICON_BACK");
                return s3q0.a;
        }
    }

    public /* synthetic */ tuq(Object obj, int i) {
        this.b = i;
    }
}
