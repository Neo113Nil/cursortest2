package xsna;

import androidx.media3.exoplayer.audio.AudioOutput;
import com.vk.api.generated.account.dto.AccountGetBannedResponseDto;
import com.vk.api.generated.audio.dto.AudioGetFeedPlaylistsBlockResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsDeleteParticipantNameResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsGetRecommendationsResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.market.dto.MarketGetCartResponseDto;
import com.vk.api.generated.market.dto.MarketUpdateCommunityReviewResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetCallTokenResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemAppsCarouselDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetGroupInfoResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoEditResponseDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.api.generated.video.dto.VideoGetVideoForEditResponseDto;
import com.vk.api.generated.wall.dto.WallRestoreThreadResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.factory.BodyPatternMatchingFactory;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.util.Function2;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zq implements b03, f03, ihz.a, Function2, io.reactivex.rxjava3.functions.c, ui20, ValueValidator, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;

    public /* synthetic */ zq(int i) {
        this.b = i;
    }

    public static String a(androidx.compose.runtime.a aVar, int i, int i2, androidx.compose.runtime.a aVar2, int i3) {
        aVar.K(i);
        String N = d370.N(i2, i3, aVar2);
        aVar.j();
        return N;
    }

    public static String b(StringBuilder sb, i0u0 i0u0Var, char c) {
        sb.append(i0u0Var);
        sb.append(c);
        return sb.toString();
    }

    public static lg90 c(androidx.compose.runtime.a aVar, int i, int i2, androidx.compose.runtime.a aVar2) {
        aVar.K(i);
        return fko.a(new gko(i2), aVar2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 19:
                return ((ef00) obj).a;
            default:
                return Collections.singletonList((AboutVideoItem.d) obj);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountGetBannedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountGetBannedResponseDto.class).getType())).a();
            case 9:
                return (ChannelsGetRecommendationsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ChannelsGetRecommendationsResponseDto.class).getType())).a();
            case 18:
                return (MarketUpdateCommunityReviewResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketUpdateCommunityReviewResponseDto.class).getType())).a();
            case 20:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 23:
                return (PodcastsGetGroupInfoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PodcastsGetGroupInfoResponseDto.class).getType())).a();
            case 27:
                return (UtilsDomainResolvedWithDataDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, UtilsDomainResolvedWithDataDto.class).getType())).a();
            default:
                return (VideoGetVideoForEditResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetVideoForEditResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedItemAppsCarouselDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetFeedPlaylistsBlockResponseDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CallsDeleteParticipantNameResponseDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCartResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetCallTokenResponseDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType());
            case 24:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoEditResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((AudioOutput.a) obj).a();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 13:
                return ((String) obj).length() >= 1;
            default:
                double doubleValue = ((Double) obj).doubleValue();
                return doubleValue >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE && doubleValue <= 1.0d;
        }
    }

    @Override // ru.ok.tensorflow.util.Function2
    public Object apply(Object obj, Object obj2) {
        DetectionSmoother lambda$create$0;
        switch (this.b) {
            case 5:
                lambda$create$0 = BodyPatternMatchingFactory.lambda$create$0((Detection) obj, (Long) obj2);
                return lambda$create$0;
            case 10:
                return (WallRestoreThreadResponseDto) obj;
            default:
                return (qma0) obj2;
        }
    }

    @Override // xsna.ui20
    public void k(fi20 fi20Var) {
    }
}
