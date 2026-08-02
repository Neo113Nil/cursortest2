package xsna;

import android.content.Context;
import android.location.Location;
import android.view.ViewGroup;
import com.vk.dto.common.data.VkAppsList;
import com.vk.dto.music.Playlist;
import com.vk.dto.profile.Address;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.profile.community.members.impl.ui.MembersState;
import com.vk.search.params.api.domain.model.geo.Coordinate;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.b;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.video.ui.upload.impl.settings.presentation.feature.entity.SettingsState;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.bi40;
import xsna.goh0;
import xsna.ij20;
import xsna.loh0;
import xsna.mmh0;
import xsna.qr60;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class k220 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ k220(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new MembersState(false, EmptyList.b, true, null, null, null, 48, null);
            case 1:
                VkAppsList vkAppsList = (VkAppsList) obj;
                wmi0 wmi0Var = wmi0.a;
                wmi0Var.m("key_menu_fav_vk_games_list", vkAppsList.d());
                wmi0Var.a("key_menu_fea_vk_games", vkAppsList.c);
                return s3q0.a;
            case 2:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 3:
                com.vk.core.view.components.group.header.f fVar = new com.vk.core.view.components.group.header.f((Context) obj);
                fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return fVar;
            case 4:
                return ((Playlist) obj).y;
            case 5:
                ij20.a aVar = (ij20.a) obj;
                aVar.p(10);
                aVar.l(true);
                return s3q0.a;
            case 6:
                qgi0.r((tgi0) obj, "MusicPickerPreviewCellDeleteButton");
                return s3q0.a;
            case 7:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 8:
                NewsfeedGetResponse newsfeedGetResponse = (NewsfeedGetResponse) obj;
                return new ew60(newsfeedGetResponse, newsfeedGetResponse.i(), newsfeedGetResponse.isSmartNews, newsfeedGetResponse.lists, newsfeedGetResponse.reactionSets);
            case 9:
                return new tvf0((NewsEntriesContainer) obj, null);
            case 10:
                qgi0.r((tgi0) obj, "order_list_help_button");
                return s3q0.a;
            case 11:
                bi40 bi40Var = (bi40) obj;
                if (bi40Var.equals(bi40.c.a)) {
                    return Integer.valueOf(R.string.music_talkback_download_podcast_episode);
                }
                if (bi40Var instanceof bi40.b) {
                    return Integer.valueOf(R.string.music_talkback_downloaded_podcast_episode);
                }
                if (bi40Var.equals(bi40.d.a)) {
                    return Integer.valueOf(R.string.music_talkback_downloading_podcast_episode);
                }
                if (bi40Var.equals(bi40.a.a)) {
                    return Integer.valueOf(R.string.music_talkback_pending_downloading_podcast_episode);
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                L.j((Throwable) obj, "Offline:PostInteractorWithOfflineSupport", "Like action error.");
                return s3q0.a;
            case 13:
                Boolean invoke = ((com.vk.newsfeed.impl.items.posting.item.modals.a) obj).b().invoke();
                invoke.getClass();
                return invoke;
            case 14:
                return ((PostingState.Editing) obj).i.g;
            case 15:
                gtc0 gtc0Var = (gtc0) obj;
                return new ksc0(new qr60.a.f(gtc0Var.a, gtc0Var.b, gtc0Var.d));
            case 16:
                qgi0.r((tgi0) obj, "product_card_top_bar_back");
                return s3q0.a;
            case 17:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -1, 2044);
            case 18:
                return Boolean.valueOf(((sy40) obj).e.d);
            case 19:
                return new mmh0.c(((tj50.a) obj).a(new pey(26), ao8.d));
            case 20:
                goh0.a aVar2 = (goh0.a) obj;
                ExtendedCommunityProfile extendedCommunityProfile = aVar2.b;
                Address address = aVar2.c;
                ListBuilder listBuilder = new ListBuilder(4);
                int b = extendedCommunityProfile.b("members");
                int b2 = extendedCommunityProfile.b("friends_members");
                List A = rli0.A(rli0.y(rli0.t(new i5g(extendedCommunityProfile.I), new xpt(27)), 3));
                int i = extendedCommunityProfile.a1;
                listBuilder.add(new loh0.d.b(b, b2, i == 1 || i == 2 || i == 4, A));
                if (address != null) {
                    listBuilder.add(new loh0.d.a(nt0.d(address)));
                    int i2 = address.m;
                    if (i2 != 0 && i2 != 5) {
                        listBuilder.add(new loh0.d.C3281d(address));
                    }
                }
                listBuilder.add(loh0.d.c.a);
                return listBuilder.g();
            case 21:
                return b.a.C1767b.a;
            case 22:
                Location location = (Location) obj;
                return Optional.of(new Coordinate(location.getLatitude(), location.getLongitude()));
            case 23:
                int i3 = dbi0.r1;
                return s3q0.a;
            case 24:
                ov70 ov70Var = (ov70) obj;
                long j = ov70Var.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new tq2(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (ov70Var.a & 4294967295L))) : sdi0.a;
            case 25:
                return SettingsState.a((SettingsState) obj, null, false, null, null, null, null, null, null, null, 255);
            case 26:
                return new SimpleAttachListItem((HistoryAttach) obj);
            case 27:
                Throwable th = (Throwable) obj;
                j03.l(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 28:
                Boolean bool = (Boolean) ((Pair) obj).g();
                bool.booleanValue();
                return bool;
            default:
                return Boolean.valueOf(((vg6) obj) instanceof pgq0);
        }
    }

    public /* synthetic */ k220(eoh0 eoh0Var) {
        this.b = 20;
    }
}
