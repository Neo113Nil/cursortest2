package xsna;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import com.ironsource.EnumC4650y5;
import com.vk.api.generated.apps.dto.AppsGamesCatalogDto;
import com.vk.api.generated.audio.dto.AudioLyricsDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.businessGroups.dto.BusinessGroupsGetShieldSettingsResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsMessageDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.market.dto.MarketGetProductLinkedContentResponseDto;
import com.vk.api.generated.memories.dto.MemoriesIsNewMemoriesAvailableResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetJoinLinkResponseDto;
import com.vk.api.generated.owners.dto.OwnersGetBannerResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoUploadDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFeedClipsBlockItemsGroupsFullResultDto;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.core.tips.Tooltip;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.voip.dto.AudioDevice;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.o0u;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class wp implements io.reactivex.rxjava3.functions.l, b03, f03, o0u.a, ValueValidator, Tooltip.c {
    public final /* synthetic */ int b;

    public /* synthetic */ wp(int i) {
        this.b = i;
    }

    public static int b(BaseBoolIntDto baseBoolIntDto, int i, int i2) {
        return (baseBoolIntDto.hashCode() + i) * i2;
    }

    public static Integer d(Context context, String str, String str2, String str3) {
        return znk0.p(context, str + str2 + str3);
    }

    public static void f(EnumC4650y5 enumC4650y5, Set set) {
        set.add(Integer.valueOf(enumC4650y5.b()));
    }

    @Override // xsna.o0u.a
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        ahn.o("DebugViewShaderProgram", "Exception caught by errorListener.", videoFrameProcessingException);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return "";
            case 7:
                return new Result(new Result.Failure(new ClipsCoauthorsException.CoauthorsNetworkException()));
            case 14:
                return y6u.a.c.b;
            case 16:
                return j5g.O0((List) obj);
            default:
                return AudioDevice.NONE;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (AppsGamesCatalogDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsGamesCatalogDto.class).getType())).a();
            case 3:
                return (AudioLyricsDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioLyricsDto.class).getType())).a();
            case 5:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 12:
                return (EcosystemSendOtpResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, EcosystemSendOtpResponseDto.class).getType())).a();
            case 15:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 17:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, Object.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BusinessGroupsGetShieldSettingsResponseDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsMessageDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetProductLinkedContentResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MemoriesIsNewMemoriesAvailableResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetJoinLinkResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OwnersGetBannerResponseDto.class).getType());
            case 26:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosPhotoUploadDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoFeedClipsBlockItemsGroupsFullResultDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 9:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
            case 10:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            default:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
    }
}
