package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.vk.api.generated.account.dto.AccountGetProfileNavigationInfoResponseDto;
import com.vk.api.generated.apps.dto.AppsSearchResponseDto;
import com.vk.api.generated.audio.dto.AudioAudioIdDto;
import com.vk.api.generated.audio.dto.AudioMoosicPlaylistDto;
import com.vk.api.generated.auth.dto.AuthOnSuccessValidationResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.channels.dto.ChannelsGetReactionsMappingResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutGetLevelsResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.market.dto.MarketGetServicesResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetCallTokenResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsUnsubscribeActionsResponseDto;
import com.vk.api.generated.orders.dto.OrdersGetAllUserSubscriptionsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.questions.dto.QuestionsDeleteFromAuthorResponseDto;
import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.dto.common.Image;
import com.vk.log.L;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.factory.CatMeshFactory;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.util.Function2;
import xsna.by1;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rr implements b03, io.reactivex.rxjava3.functions.l, f03, io.reactivex.rxjava3.functions.m, Function2, ihz.a, ValueValidator, ListValidator {
    public final /* synthetic */ int b;

    public /* synthetic */ rr(int i) {
        this.b = i;
    }

    @Override // ru.ok.tensorflow.util.Function2
    public Object apply(Object obj, Object obj2) {
        DetectionSmoother lambda$create$0;
        lambda$create$0 = CatMeshFactory.lambda$create$0((Detection) obj, (Long) obj2);
        return lambda$create$0;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountGetProfileNavigationInfoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountGetProfileNavigationInfoResponseDto.class).getType())).a();
            case 3:
                return (AppsSearchResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsSearchResponseDto.class).getType())).a();
            case 4:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, AudioAudioIdDto.class).getType()).getType())).a();
            case 5:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, AudioMoosicPlaylistDto.class).getType()).getType())).a();
            case 6:
                return (AuthOnSuccessValidationResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthOnSuccessValidationResponseDto.class).getType())).a();
            case 18:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 19:
                return (MarketGetServicesResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetServicesResponseDto.class).getType())).a();
            case 22:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 23:
                return (NewsfeedGenericResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NewsfeedGenericResponseDto.class).getType())).a();
            case 26:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType())).a();
            default:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 9:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsGetReactionsMappingResponseDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DonutGetLevelsResponseDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsGetFieldsResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetCallTokenResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsUnsubscribeActionsResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OrdersGetAllUserSubscriptionsResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, QuestionsDeleteFromAuthorResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Double) obj).doubleValue() > ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return Boolean.valueOf(obj instanceof c860).booleanValue();
    }

    public /* synthetic */ rr(ve0 ve0Var) {
        this.b = 7;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Map createSettingsSource$lambda$0;
        switch (this.b) {
            case 1:
                L.i((Throwable) obj);
                return Image.d;
            case 10:
                e05 e05Var = new e05(new tl0(new AtomicInteger(0), 26), 9);
                int i = io.reactivex.rxjava3.core.g.b;
                return ((io.reactivex.rxjava3.core.g) obj).f(e05Var, i, i);
            case 11:
                int i2 = DebugDevImageFragment.U;
                return EmptyList.b;
            case 16:
                return new BitmapDrawable(e43.a.getResources(), (Bitmap) obj);
            default:
                createSettingsSource$lambda$0 = RemoteSettingsShared.createSettingsSource$lambda$0((Throwable) obj);
                return createSettingsSource$lambda$0;
        }
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }

    public /* synthetic */ rr(by1.a aVar, ukk ukkVar) {
        this.b = 12;
    }
}
