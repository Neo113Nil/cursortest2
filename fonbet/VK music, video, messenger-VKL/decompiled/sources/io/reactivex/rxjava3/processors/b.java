package io.reactivex.rxjava3.processors;

import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsGetAppLaunchParamsResponseDto;
import com.vk.api.generated.apps.dto.AppsNeedToShowActionResponseDto;
import com.vk.api.generated.audio.dto.AudioGetReactionsConfigResponseDto;
import com.vk.api.generated.audio.dto.AudioRestrictionInfoDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksBoolResponseDto;
import com.vk.api.generated.auth.dto.AuthExchangeTokenInfoDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.docs.dto.DocsGetResponseDto;
import com.vk.api.generated.esia.dto.EsiaCheckEsiaLinkResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.gifts.dto.GiftsCatalogGiftDto;
import com.vk.api.generated.messages.dto.MessagesGetChatPreviewResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetIncognitoMembersByIdsResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsGetRedesignSettingResponseDto;
import com.vk.api.generated.orders.dto.OrdersAppSubscriptionItemDto;
import com.vk.api.generated.photos.dto.PhotosAgreeBlurRestrictionResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetAudioMetaResponseDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.VideoFile;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vkontakte.android.data.b;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.maybe.i;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import xsna.b03;
import xsna.f03;
import xsna.k15;
import xsna.szs;
import xsna.wkk;
import xsna.wwx;
import xsna.xtp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class b implements b03, f03, l, Preference.b, ValueValidator, ListValidator, szs {
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    public static b.d a(String str, String str2, String str3) {
        b.d dVar = new b.d(str, null);
        dVar.b(str3, str2);
        return dVar;
    }

    public static void b(StringBuilder sb, String str, String str2) {
        sb.append((Object) BlockId.Simple.e(str));
        sb.append(str2);
    }

    public static /* synthetic */ boolean c(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment.jo();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 9:
                return i.b;
            case 14:
                return Optional.of((DocsGetResponseDto) obj);
            case 16:
                return k15.B((VideoFile) obj);
            default:
                return Long.valueOf(((wkk) obj).b);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AppsGetAppLaunchParamsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsGetAppLaunchParamsResponseDto.class).getType())).a();
            case 7:
                return (FriendsGetFieldsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, FriendsGetFieldsResponseDto.class).getType())).a();
            case 8:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 15:
                return (EsiaCheckEsiaLinkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, EsiaCheckEsiaLinkResponseDto.class).getType())).a();
            case 17:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, GiftsCatalogGiftDto.class).getType()).getType())).a();
            case 18:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 21:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 23:
                return (MessagesGetIncognitoMembersByIdsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetIncognitoMembersByIdsResponseDto.class).getType())).a();
            case 25:
                return (NotificationsGetRedesignSettingResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NotificationsGetRedesignSettingResponseDto.class).getType())).a();
            default:
                return (OrdersAppSubscriptionItemDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, OrdersAppSubscriptionItemDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsNeedToShowActionResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioBooksBoolResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetReactionsConfigResponseDto.class).getType());
            case 5:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AudioRestrictionInfoDto.class).getType()).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AuthExchangeTokenInfoDto.class).getType()).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetChatPreviewResponseDto.class).getType());
            case 27:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosAgreeBlurRestrictionResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetAudioMetaResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 11:
                if (l.longValue() >= 0) {
                }
                break;
            default:
                if (l.longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    public /* synthetic */ b(Object obj, int i) {
        this.b = i;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
