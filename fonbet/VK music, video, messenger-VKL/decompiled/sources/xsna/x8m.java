package xsna;

import android.content.Context;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetBannedExtendedResponseDto;
import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment;
import com.vk.feed.design.view.newsfeed.link.EnhancedFeedLinkCard;
import com.vk.feed.design.view.newsfeed.link.FeedLinkCard;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.pushes.receivers.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.co20;
import xsna.kit0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x8m implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ x8m(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                break;
            case 1:
                dnm d = ((xgl0) obj).b().d();
                InfoBar b = d.b();
                if (!d.c()) {
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                qgi0.r((tgi0) obj, "edit_storefront_album_top_bar_back");
                break;
            case 4:
                vgg vggVar = (vgg) obj;
                par0 par0Var = par0.a;
                Throwable th = vggVar.a;
                par0Var.getClass();
                par0.d(th);
                vggVar.c();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                EnhancedFeedLinkCard enhancedFeedLinkCard = new EnhancedFeedLinkCard((Context) obj, null, 6);
                enhancedFeedLinkCard.setContent(new FeedLinkCard.b.C1054b(null, oq.d(tlo0.Companion, "Изображение временно недоступно")));
                enhancedFeedLinkCard.setOverlayContent(new FeedLinkCard.OverlayContent.ActionButtonWithTitle("Очень длинный заголовок на столько, что должен не вмещаться в одну строку и, возможно, даже в три строки", "Открыть", FeedLinkCard.OverlayContent.ActionButtonWithTitle.Appearance.Primary));
                break;
            case 8:
                break;
            case 9:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.u(tgi0Var);
                qgi0.v(tgi0Var, -1.0f);
                break;
            case 10:
                break;
            case 11:
                int i = HighlightEditFragment.h0;
                qgi0.r((tgi0) obj, "edit_done_button");
                break;
            case 12:
                break;
            case 13:
                int i2 = ImSelectContactsFragment.v0;
                qgi0.r((tgi0) obj, "select_contacts_toolbar_icon_search");
                break;
            case 14:
                VideoFileOld videoFileOld = ((kit0.a) obj).b;
                videoFileOld.B = true;
                videoFileOld.C0 = true;
                break;
            case 15:
                int i3 = MarketEditAlbumGoodVariantsFragment.M0;
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                qgi0.r((tgi0) obj, "topBarLeftIcon");
                break;
            case 19:
                ((zak0) co20.h).setValue((co20.d) obj);
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                qgi0.r((tgi0) obj, "vk_top_bar_filter_btn");
                break;
            case 23:
                qcy<Object>[] qcyVarArr = MusicPlaceholderVh.o;
                qgi0.r((tgi0) obj, "MusicUiHolderPlaceholderDescription");
                break;
            case 24:
                dy40 dy40Var = ((sy40) obj).e;
                break;
            case 25:
                NewsfeedGetBannedExtendedResponseDto newsfeedGetBannedExtendedResponseDto = (NewsfeedGetBannedExtendedResponseDto) obj;
                List<GroupsGroupFullDto> d2 = newsfeedGetBannedExtendedResponseDto.d();
                if (d2 == null) {
                    d2 = EmptyList.b;
                }
                new dqu();
                Integer g = newsfeedGetBannedExtendedResponseDto.g();
                int intValue = g != null ? g.intValue() : d2.size();
                String e = newsfeedGetBannedExtendedResponseDto.e();
                List<GroupsGroupFullDto> list = d2;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(dqu.a((GroupsGroupFullDto) it.next()));
                }
                break;
            case 26:
                c.a aVar = com.vk.pushes.receivers.c.b;
                z4g.d().n(false);
                break;
            case 27:
                qba0 qba0Var = (qba0) obj;
                Photo photo = qba0Var.a;
                break;
            case 28:
                int i4 = PodcastEpisodeFragment.u0;
                qgi0.r((tgi0) obj, "toolbar_back_button");
                break;
            default:
                xo9.y((RequestUserProfile) obj, false);
                break;
        }
        return s3q0.a;
    }
}
