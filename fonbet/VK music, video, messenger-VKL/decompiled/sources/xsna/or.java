package xsna;

import com.vk.api.generated.account.dto.AccountGetEmailResponseDto;
import com.vk.api.generated.apps.dto.AppsAdsSlotsDto;
import com.vk.api.generated.audio.dto.AudioGetStreamMixSettingsResponseDto;
import com.vk.api.generated.auth.dto.AuthGetExchangeTokenResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsGetAsrTranscriptionsResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsResumeResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutGetSubscriptionsResponseDto;
import com.vk.api.generated.friends.dto.FriendsSearchResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetBannedResponseDto;
import com.vk.api.generated.likes.dto.LikesGetListExtendedResponseDto;
import com.vk.api.generated.market.dto.MarketSettingsDto;
import com.vk.api.generated.messages.dto.MessagesGetReactionsAssetsResponseDto;
import com.vk.api.generated.photos.dto.PhotosVerticalizeCheckStatusResponseDto;
import com.vk.api.generated.questions.dto.QuestionsDeleteFromAuthorResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.webrtc.HardwareVideoEncoderExceptionHandler;
import org.webrtc.HardwareVideoEncoderV2;
import ru.ok.android.webrtc.FingerprintProcessor;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.k840;
import xsna.ugw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class or implements b03, f03, ValueValidator, FingerprintProcessor.FingerprintChangedListener, HardwareVideoEncoderExceptionHandler, f0t, mba, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ or(int i) {
        this.b = i;
    }

    public static wh50 a(String str, long j, int i, androidx.compose.runtime.a aVar) {
        wh50 b = androidx.compose.runtime.k.b(new tho0(str, j, i));
        aVar.R(b);
        return b;
    }

    public static lg90 b(androidx.compose.runtime.a aVar, int i, int i2, androidx.compose.runtime.a aVar2, int i3) {
        aVar.K(i);
        lg90 a = pg90.a(i2, i3, aVar2);
        aVar.j();
        return a;
    }

    @Override // xsna.f0t
    public Object apply(Object obj) {
        ugw.f fVar = ugw.z;
        return null;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountGetEmailResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountGetEmailResponseDto.class).getType())).a();
            case 1:
                return (AppsAdsSlotsDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsAdsSlotsDto.class).getType())).a();
            case 3:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 6:
                return (CallsGetAsrTranscriptionsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CallsGetAsrTranscriptionsResponseDto.class).getType())).a();
            case 7:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 8:
                return (CommunitySubscriptionsResumeResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CommunitySubscriptionsResumeResponseDto.class).getType())).a();
            case 11:
                return (DonutGetSubscriptionsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, DonutGetSubscriptionsResponseDto.class).getType())).a();
            case 14:
                return (FriendsSearchResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, FriendsSearchResponseDto.class).getType())).a();
            case 21:
                return (MarketSettingsDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketSettingsDto.class).getType())).a();
            case 22:
                return (MessagesGetReactionsAssetsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetReactionsAssetsResponseDto.class).getType())).a();
            case 26:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            default:
                return (QuestionsDeleteFromAuthorResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, QuestionsDeleteFromAuthorResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetStreamMixSettingsResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthGetExchangeTokenResponseDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetBannedResponseDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, LikesGetListExtendedResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosVerticalizeCheckStatusResponseDto.class).getType());
        }
    }

    @Override // org.webrtc.HardwareVideoEncoderExceptionHandler
    public void handle(Throwable th) {
        HardwareVideoEncoderV2.lambda$new$0(th);
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

    @Override // ru.ok.android.webrtc.FingerprintProcessor.FingerprintChangedListener
    public void onFingerprintChanged(long j) {
        FingerprintProcessor.a(j);
    }

    @Override // xsna.mba
    public void z(int i, UIBlock uIBlock) {
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        if (aVar == null) {
            aVar = null;
        }
        MusicRestrictionPopupDisplayer.d(aVar, "audio_download_library", MusicPlaybackLaunchContext.e, "audio_download_library", null, 8);
    }

    public /* synthetic */ or(vv7 vv7Var) {
        this.b = 29;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (rtt) obj;
    }
}
