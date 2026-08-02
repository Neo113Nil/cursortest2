package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountInfoDto;
import com.vk.api.generated.apps.dto.AppsJoinAndGetResponseDto;
import com.vk.api.generated.apps.dto.AppsNeedToShowActionResponseDto;
import com.vk.api.generated.audio.dto.AudioRestrictionInfoDto;
import com.vk.api.generated.audio.dto.AudioStandaloneMigrationStateResponseDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksBoolResponseDto;
import com.vk.api.generated.auth.dto.AuthExchangeTokenInfoDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.gifts.dto.GiftsMessagesConversationCardConfigDto;
import com.vk.api.generated.messages.dto.MessagesCreateFolderResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetChatPreviewResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignSettingsSectionResponseDto;
import com.vk.api.generated.photos.dto.PhotosAgreeBlurRestrictionResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetAudioMetaResponseDto;
import com.vk.api.generated.statEvents.dto.StatEventsBaseResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.voip.dto.call_member.CallMemberId;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.gl.tf.factory.FaceDetectionFactory;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.util.Function2;
import xsna.by1;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xr implements f03, b03, io.reactivex.rxjava3.functions.l, Preference.b, ihz.a, ValueValidator, Function2 {
    public final /* synthetic */ int b;

    public /* synthetic */ xr(int i) {
        this.b = i;
    }

    public static void a(String str, String str2) {
        ahn.F(str + str2);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        o260Var.d(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // ru.ok.tensorflow.util.Function2
    public Object apply(Object obj, Object obj2) {
        DetectionSmoother lambda$create$0;
        lambda$create$0 = FaceDetectionFactory.lambda$create$0((Detection) obj, (Long) obj2);
        return lambda$create$0;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (AppsNeedToShowActionResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsNeedToShowActionResponseDto.class).getType())).a();
            case 3:
                return (AudioBooksBoolResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioBooksBoolResponseDto.class).getType())).a();
            case 5:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, AudioRestrictionInfoDto.class).getType()).getType())).a();
            case 6:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, AuthExchangeTokenInfoDto.class).getType()).getType())).a();
            case 20:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 23:
                return (MessagesGetChatPreviewResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetChatPreviewResponseDto.class).getType())).a();
            case 27:
                return (PhotosAgreeBlurRestrictionResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, PhotosAgreeBlurRestrictionResponseDto.class).getType())).a();
            case 28:
                return (ShortVideoGetAudioMetaResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ShortVideoGetAudioMetaResponseDto.class).getType())).a();
            default:
                return (StatEventsBaseResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StatEventsBaseResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountInfoDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsJoinAndGetResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioStandaloneMigrationStateResponseDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 9:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, GiftsMessagesConversationCardConfigDto.class).getType()).getType());
            case 19:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesCreateFolderResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedGenericResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsEditRedesignSettingsSectionResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 14:
                if (l.longValue() >= 0) {
                }
                break;
            case 15:
                if (l.longValue() > 0) {
                }
                break;
            default:
                if (l.longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    public /* synthetic */ xr(int i, long j, by1.a aVar) {
        this.b = 13;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 8:
                dhw0 L = com.vk.voip.ui.c.b.L();
                Map<CallMemberId, MediaOptionState> map = L != null ? L.u : null;
                return map == null ? jgp.b : map;
            default:
                return EmptyList.b;
        }
    }

    public /* synthetic */ xr(boolean z) {
        this.b = 0;
    }
}
