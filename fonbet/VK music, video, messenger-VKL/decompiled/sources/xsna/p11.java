package xsna;

import android.content.Context;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsInviteMultipleFriendResponseDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksBoolResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.gifts.dto.GiftsGetResponseDto;
import com.vk.api.generated.market.dto.MarketGetServicesSectionResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetBackgroundsResponseDto;
import com.vk.api.generated.messages.dto.MessagesSearchConversationsExtendedResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignPushSettingResponseDto;
import com.vk.api.generated.orders.dto.OrdersAppOrderItemDto;
import com.vk.api.generated.photos.dto.PhotosGetLutImagesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.api.generated.tags.dto.TagsGetListResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vkontakte.android.R;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.ssd.Util;
import ru.ok.tensorflow.util.Function;
import xsna.by1;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p11 implements f03, b03, whp, io.reactivex.rxjava3.functions.l, Preference.b, ihz.a, ListValidator, ValueValidator, h9l, io.reactivex.rxjava3.functions.m, Function {
    public final /* synthetic */ int b;

    public /* synthetic */ p11(int i) {
        this.b = i;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment.jo();
        return true;
    }

    @Override // xsna.whp
    public String a() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.catalog_search_empty_list);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Float lambda$nms$1;
        switch (this.b) {
            case 7:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.T0;
            case 14:
                return jee.a((ShortVideoGetGridShortVideosResponseDto) obj);
            default:
                lambda$nms$1 = Util.lambda$nms$1((Detection) obj);
                return lambda$nms$1;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AppsMiniappsCatalogDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsMiniappsCatalogDto.class).getType())).a();
            case 13:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 15:
                return (GiftsGetResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GiftsGetResponseDto.class).getType())).a();
            case 16:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 19:
                return (MessagesSearchConversationsExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesSearchConversationsExtendedResponseDto.class).getType())).a();
            case 27:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (TagsGetListResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, TagsGetListResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsInviteMultipleFriendResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioBooksBoolResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 8:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 18:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetServicesSectionResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetBackgroundsResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsEditRedesignPushSettingResponseDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OrdersAppOrderItemDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosGetLutImagesResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetTemplateExtendedResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new x860();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return obj instanceof zrb0;
    }

    public /* synthetic */ p11(Object obj, int i) {
        this.b = i;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }

    public /* synthetic */ p11(by1.a aVar, AudioSink.a aVar2) {
        this.b = 10;
    }
}
