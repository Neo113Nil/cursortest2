package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsGetTrackBridgeCallHandlersResponseDto;
import com.vk.api.generated.audio.dto.AudioGetAudioPreviewUrlResponseDto;
import com.vk.api.generated.auth.dto.AuthGetCredentialsForServiceMultiResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.market.dto.MarketSearchResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetAppearancesResponseDto;
import com.vk.api.generated.money.dto.MoneyGetTransferMethodsResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsGetSettingsNewResponseDto;
import com.vk.api.generated.orders.dto.OrdersOrderDto;
import com.vk.api.generated.owners.dto.OwnersGetContentSectionsResponseDto;
import com.vk.api.generated.photos.dto.PhotosGetCommentsResponseDto;
import com.vk.api.generated.serverEffects.dto.ServerEffectsGetGeneratedVideoInfoResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoRemoveFavoriteAudioResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.medianative.NativeLogger;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.Pair;
import xsna.dug0;
import xsna.zrv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s11 implements f03, b03, io.reactivex.rxjava3.functions.l, Preference.b, ValueValidator, zrv.a, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ s11(int i) {
        this.b = i;
    }

    public static void a(int i, int i2, int i3, int i4, int i5) {
        x1o0.b(i);
        x1o0.b(i2);
        x1o0.b(i3);
        x1o0.b(i4);
        x1o0.b(i5);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        switch (this.b) {
            case 7:
                String[] strArr = DebugDevSettingsFragment.t0;
                asu0.a.getClass();
                asu0.q().execute(new i3l(0));
                break;
            default:
                String[] strArr2 = DebugDevSettingsFragment.t0;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                NativeLogger.a = booleanValue;
                o2l.a.getClass();
                o2l.h("__dbg_log_native_exceptions", booleanValue);
                break;
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 6:
                return ((dug0.c) obj).c;
            case 24:
                return (Post) ((NewsEntry) obj);
            default:
                return (io.reactivex.rxjava3.core.q) obj;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (AuthGetCredentialsForServiceMultiResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthGetCredentialsForServiceMultiResponseDto.class).getType())).a();
            case 10:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 12:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 14:
                return (MarketSearchResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketSearchResponseDto.class).getType())).a();
            case 16:
                return (MessagesGetAppearancesResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetAppearancesResponseDto.class).getType())).a();
            case 17:
                return (MoneyGetTransferMethodsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MoneyGetTransferMethodsResponseDto.class).getType())).a();
            case 22:
                return (OwnersGetContentSectionsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, OwnersGetContentSectionsResponseDto.class).getType())).a();
            case 23:
                return (PhotosGetCommentsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, PhotosGetCommentsResponseDto.class).getType())).a();
            case 26:
                return (ServerEffectsGetGeneratedVideoInfoResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ServerEffectsGetGeneratedVideoInfoResponseDto.class).getType())).a();
            default:
                return (ShortVideoRemoveFavoriteAudioResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ShortVideoRemoveFavoriteAudioResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.zrv.a
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetTrackBridgeCallHandlersResponseDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetAudioPreviewUrlResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 5:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogSectionResponseObjectDto.class).getType());
            case 11:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseUploadServerDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsGetSettingsNewResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, OrdersOrderDto.class).getType()).getType());
            case 28:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesGetVideoUploadServerResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    public /* synthetic */ s11(izs izsVar, int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        num.intValue();
        return new Pair((hy30) obj, num);
    }
}
