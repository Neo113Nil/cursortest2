package xsna;

import android.content.Context;
import com.vk.api.generated.apps.dto.AppsGetAboutScreenResponseDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.auth.dto.AuthGetCredentialsForServiceMultiResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.market.dto.MarketSearchResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetAppearancesResponseDto;
import com.vk.api.generated.money.dto.MoneyGetTransferMethodsResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationGroupSettingsSectionDto;
import com.vk.api.generated.orders.dto.OrdersPersonalDiscountDto;
import com.vk.api.generated.photos.dto.PhotosGetCommentsResponseDto;
import com.vk.api.generated.serverEffects.dto.ServerEffectsGetGeneratedVideoInfoResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoRemoveFavoriteAudioResponseDto;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vkontakte.android.R;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import ru.ok.face.entity.FaceMorphingFigure;
import ru.ok.face.pipeline_frugal.FaceMorphingPipeline;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function2;
import xsna.lta;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class to implements b03, io.reactivex.rxjava3.functions.m, f03, io.reactivex.rxjava3.functions.l, ValueValidator, Function2, h9l, whp {
    public final /* synthetic */ int b;

    public /* synthetic */ to(int i) {
        this.b = i;
    }

    public static void b(StringBuilder sb, BaseBoolIntDto baseBoolIntDto, String str, BaseBoolIntDto baseBoolIntDto2, String str2) {
        sb.append(baseBoolIntDto);
        sb.append(str);
        sb.append(baseBoolIntDto2);
        sb.append(str2);
    }

    @Override // xsna.whp
    public String a() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.catalog_search_empty_list);
    }

    @Override // ru.ok.tensorflow.util.Function2
    public Object apply(Object obj, Object obj2) {
        FaceMorphingFigure lambda$process$10;
        lambda$process$10 = FaceMorphingPipeline.lambda$process$10((Detection) obj, (FaceMorphingFigure) obj2);
        return lambda$process$10;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (com.vk.api.generated.base.dto.BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, com.vk.api.generated.base.dto.BaseBoolIntDto.class).getType())).a();
            case 2:
                return (AppsGetAboutScreenResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsGetAboutScreenResponseDto.class).getType())).a();
            case 6:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 8:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 15:
                return (com.vk.api.generated.base.dto.BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, com.vk.api.generated.base.dto.BaseBoolIntDto.class).getType())).a();
            case 19:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 22:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, NotificationsNotificationGroupSettingsSectionDto.class).getType()).getType())).a();
            case 23:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 24:
                return (OrdersPersonalDiscountDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, OrdersPersonalDiscountDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioAudioDto.class).getType());
            case 5:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthGetCredentialsForServiceMultiResponseDto.class).getType());
            case 13:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, com.vk.api.generated.base.dto.BaseBoolIntDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketSearchResponseDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetAppearancesResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MoneyGetTransferMethodsResponseDto.class).getType());
            case 26:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosGetCommentsResponseDto.class).getType());
            case 28:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServerEffectsGetGeneratedVideoInfoResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoRemoveFavoriteAudioResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new tpl0();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 3:
                int i = AttachDocumentsFragment.R0;
                return obj instanceof h7o0;
            default:
                return m99.m(obj);
        }
    }

    public /* synthetic */ to(Object obj, int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 9:
                return new ArrayList((VKList) obj);
            case 10:
                return lta.a.c.b.a;
            default:
                return ((x960) obj).a();
        }
    }
}
