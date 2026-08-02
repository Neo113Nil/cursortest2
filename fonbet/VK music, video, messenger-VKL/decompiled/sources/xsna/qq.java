package xsna;

import android.net.Uri;
import android.os.Process;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountGetModelsResponseDto;
import com.vk.api.generated.apps.dto.AppsGetLeaderboardByAppResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.market.dto.MarketGetButtonsResponseDto;
import com.vk.api.generated.market.dto.MarketGetRecommendsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationsResponseDto;
import com.vk.api.generated.photos.dto.PhotosSaveOwnerCoverPhotoResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingActivitySearchServicesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetChallengeResponseDto;
import com.vk.api.generated.stickers.dto.StickersGetSettingsResponseDto;
import com.vk.api.generated.stories.dto.StoriesSearchGifResponseDto;
import com.vk.core.tips.Tooltip;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.text.Regex;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.i9r0;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qq implements f03, b03, io.reactivex.rxjava3.functions.l, Tooltip.c, Preference.c, ValueValidator, androidx.media3.exoplayer.mediacodec.e, ScreenModeVideoStatMapper.a {
    public final /* synthetic */ int b;

    public /* synthetic */ qq(int i) {
        this.b = i;
    }

    public static int a(char c, boolean z, StringBuilder sb, int i, int i2) {
        sb.append(blk.W(c, z));
        return i + i2;
    }

    public static String b(String str, Uri uri, String str2, String str3, String str4) {
        return str + uri + str2 + str3 + str4;
    }

    public static String f(StringBuilder sb, qtd0 qtd0Var, char c) {
        sb.append(qtd0Var);
        sb.append(c);
        return sb.toString();
    }

    public static wh50 h(int i, androidx.compose.runtime.a aVar) {
        wh50 b = androidx.compose.runtime.k.b(Integer.valueOf(i));
        aVar.R(b);
        return b;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                com.vk.voip.ui.c.b.getClass();
                return Boolean.valueOf(com.vk.voip.ui.c.Y.e());
            default:
                return s3q0.a;
        }
    }

    @Override // com.vk.libvideo.tracker.ScreenModeVideoStatMapper.a
    public Object d(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        return com.vk.libvideo.tracker.a.b(unifiedStatScreenMode);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return Integer.valueOf(((Number) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
            case 4:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 5:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 12:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 13:
                return (MarketGetButtonsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetButtonsResponseDto.class).getType())).a();
            case 17:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 19:
                return (PhotosSaveOwnerCoverPhotoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PhotosSaveOwnerCoverPhotoResponseDto.class).getType())).a();
            case 20:
                return (ServiceBookingActivitySearchServicesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ServiceBookingActivitySearchServicesResponseDto.class).getType())).a();
            case 22:
                return (ShortVideoGetChallengeResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, ShortVideoGetChallengeResponseDto.class).getType())).a();
            case 23:
                return (StickersGetSettingsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StickersGetSettingsResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        i9r0.a aVar = i9r0.a;
        for (UserId userId : o25.a().g()) {
            aVar.e(userId);
            File a = i9r0.a.a(userId);
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(a);
        }
        i9r0.a.c();
        k840.a.i.clear();
        try {
            Process.killProcess(Process.myPid());
            System.exit(0);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetModelsResponseDto.class).getType());
            case 1:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetLeaderboardByAppResponseDto.class).getType());
            case 14:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetRecommendsResponseDto.class).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetConversationsResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesSearchGifResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.e
    public List getDecoderInfos(String str, boolean z, boolean z2) {
        return MediaCodecUtil.e(str, z, z2);
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 9:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            default:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
        }
        return false;
    }

    public /* synthetic */ qq(Object obj, int i) {
        this.b = i;
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
    }
}
