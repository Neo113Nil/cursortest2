package xsna;

import androidx.preference.Preference;
import com.mp4parser.iso14496.part15.HevcConfigurationBox;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.audio.dto.AudioGetDownloadHistoryResponseDto;
import com.vk.api.generated.auth.dto.AuthValidatePhoneConfirmResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.board.dto.BoardGetTopicsExtendedResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.gifts.dto.GiftsCatalogGiftDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlResponseDto;
import com.vk.api.generated.messages.dto.MessagesAddChatUserResponseDto;
import com.vk.api.generated.messages.dto.MessagesDeleteChatPhotoResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsGetUnreadCountersResponseDto;
import com.vk.api.generated.photos.dto.PhotosGetResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAddFavoriteAudioResponseDto;
import com.vk.api.generated.stickers.dto.StickersImageConfigDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.gl.tf.factory.FaceMorphingFactory;
import ru.ok.tensorflow.util.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r11 implements b03, f03, io.reactivex.rxjava3.functions.l, Preference.b, ValueValidator, Function {
    public final /* synthetic */ int b;

    public /* synthetic */ r11(int i) {
        this.b = i;
    }

    public static int a(float f) {
        return com.mbridge.msdk.foundation.tools.v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), f);
    }

    public static String b(StringBuilder sb, long j, char c, int i) {
        sb.append(j);
        sb.append(c);
        sb.append(i);
        return sb.toString();
    }

    public static StringBuilder c(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static void d(n0y n0yVar, HevcConfigurationBox hevcConfigurationBox, HevcConfigurationBox hevcConfigurationBox2) {
        o0y c = whq.c(n0yVar, hevcConfigurationBox, hevcConfigurationBox2);
        w8g0.a();
        w8g0.b(c);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment.jo();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Float lambda$create$0;
        switch (this.b) {
            case 7:
                com.vk.voip.ui.c.b.getClass();
                return Long.valueOf(com.vk.voip.ui.c.K);
            case 10:
                return ((x960) obj).a();
            case 13:
                lambda$create$0 = FaceMorphingFactory.lambda$create$0((Float) obj);
                return lambda$create$0;
            default:
                return EmptyList.b;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 1:
                return (AppsMiniappsCatalogDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsMiniappsCatalogDto.class).getType())).a();
            case 4:
                return (AuthValidatePhoneConfirmResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AuthValidatePhoneConfirmResponseDto.class).getType())).a();
            case 12:
                return (BaseOkResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 16:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, GiftsCatalogGiftDto.class).getType()).getType())).a();
            case 17:
                return (BaseOkResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 19:
                return (MarketGetEditUrlResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetEditUrlResponseDto.class).getType())).a();
            case 21:
                return (MessagesAddChatUserResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesAddChatUserResponseDto.class).getType())).a();
            case 25:
                return (PhotosGetResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PhotosGetResponseDto.class).getType())).a();
            case 26:
                return (ShortVideoAddFavoriteAudioResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ShortVideoAddFavoriteAudioResponseDto.class).getType())).a();
            case 28:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetDownloadHistoryResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BoardGetTopicsExtendedResponseDto.class).getType());
            case 8:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesDeleteChatPhotoResponseDto.class).getType());
            case 23:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsGetUnreadCountersResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StickersImageConfigDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    public /* synthetic */ r11(Object obj, int i) {
        this.b = i;
    }
}
