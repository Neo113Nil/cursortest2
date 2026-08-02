package xsna;

import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.market.dto.MarketCommunityReviewFriendDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewFriendsResponseDto;
import com.vk.core.store.entity.models.StoriesEventsStack;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.feature.uxpolls.modalpoll.g;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.media.player.VideoMode;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.SearchDatabaseState;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.e;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.f9k0;
import xsna.jd50;
import xsna.k840;
import xsna.phg0;
import xsna.tj50;
import xsna.wwi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class i0r implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ i0r(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoFile videoFile;
        VideoMode videoMode = null;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return new yzo0((ViewGroup) obj);
            case 2:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 3:
                Attach attach = (Attach) obj;
                AttachVideo attachVideo = attach instanceof AttachVideo ? (AttachVideo) attach : null;
                if (attachVideo == null || (videoFile = attachVideo.b) == null) {
                    return null;
                }
                return videoFile.a1();
            case 4:
                return s3q0.a;
            case 5:
                qgi0.n((tgi0) obj, 0);
                return s3q0.a;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                go20 go20Var = go20.a;
                ((zak0) go20.n).setValue(bool);
                return s3q0.a;
            case 7:
                qgi0.r((tgi0) obj, "ModalTags.ICON_CANCEL");
                return s3q0.a;
            case 8:
                return new int[((Integer) obj).intValue()];
            case 9:
                return new jd50.a.b(((id50) obj).f);
            case 10:
                AudioBook audioBook = (AudioBook) obj;
                qh4 a = k840.a.a();
                bpn0 bpn0Var = o25.a;
                a.B(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c(), audioBook);
                return s3q0.a;
            case 11:
                return new tvf0((NewsEntriesContainer) obj, null);
            case 12:
                VKList<PhotoAlbum> vKList = ((AlbumsRepository.a) obj).a;
                if (vKList == null || !vKList.isEmpty()) {
                    Iterator<PhotoAlbum> it = vKList.iterator();
                    while (it.hasNext()) {
                        if (it.next().b >= 0) {
                            return Boolean.valueOf(r2);
                        }
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 13:
                return Integer.valueOf(((otd0) obj).h);
            case 14:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -1, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
            case 15:
                int i = QuestionsListFragment.f0;
                qgi0.r((tgi0) obj, "back_button");
                return s3q0.a;
            case 16:
                MarketGetCommunityReviewFriendsResponseDto marketGetCommunityReviewFriendsResponseDto = (MarketGetCommunityReviewFriendsResponseDto) obj;
                List<MarketCommunityReviewFriendDto> d = marketGetCommunityReviewFriendsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it2 = d.iterator();
                while (it2.hasNext()) {
                    arrayList.add(bu00.a((MarketCommunityReviewFriendDto) it2.next()));
                }
                int g = marketGetCommunityReviewFriendsResponseDto.g();
                Boolean e = marketGetCommunityReviewFriendsResponseDto.e();
                boolean booleanValue = e != null ? e.booleanValue() : false;
                Integer f = marketGetCommunityReviewFriendsResponseDto.f();
                return new phg0.c(g, f != null ? f.intValue() : 0, arrayList, booleanValue);
            case 17:
                return new u5s(((Integer) obj).intValue());
            case 18:
                return fpf0.a(((g6n0) obj).getClass());
            case 19:
                return ((SearchDatabaseState) ((mph0) obj)).d;
            case 20:
                wwi0.a aVar = ((wwi0) obj).f;
                return new wwi0.a(aVar.a, aVar.b, aVar.c);
            case 21:
                Pair pair = (Pair) obj;
                StoriesEventsStack storiesEventsStack = (StoriesEventsStack) pair.d();
                if (((Boolean) pair.g()).booleanValue()) {
                    cul0.e.onNext(storiesEventsStack);
                }
                return s3q0.a;
            case 22:
                ((Float) obj).floatValue();
                return s3q0.a;
            case 23:
                return "VK_PAY_CHECKOUT_VKPAY_TOKEN/" + ((UserId) obj).b;
            case 24:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, f9k0.c.a, false, false, false, false, -1, 2015);
            case 25:
                return new g.a(((tj50.a) obj).a(new l5r0(r4), ao8.d));
            case 26:
                return ((e.b) obj).b;
            case 27:
                VideoMinimizableState videoMinimizableState = (VideoMinimizableState) obj;
                c63 c63Var = c63.a;
                if (c63.f) {
                    yg5 yg5Var = rts0.c;
                    if (com.vk.libvideo.api.minimizable.a.g(videoMinimizableState)) {
                        videoMode = VideoMode.FULLSCREEN;
                    } else if (videoMinimizableState instanceof VideoMinimizableState.Expanded) {
                        videoMode = VideoMode.EMPTY;
                    } else if (videoMinimizableState instanceof VideoMinimizableState.Collapsed) {
                        videoMode = VideoMode.MINIMIZED;
                    }
                    if (yg5Var != null && videoMode != null) {
                        yg5Var.L(videoMode);
                    }
                }
                return s3q0.a;
            case 28:
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            default:
                return io.reactivex.rxjava3.core.q.B0(5L, TimeUnit.SECONDS);
        }
    }
}
