package xsna;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountGetUserObjectDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.audio.dto.AudioSearchResponseDto;
import com.vk.api.generated.auth.dto.AuthGetAuthCodeStatusResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetBannerResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemReviewResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetMessageReadPeersResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemRecommendedAppBlockDto;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignSettingResponseDto;
import com.vk.api.generated.orders.dto.OrdersSubscriptionDto;
import com.vk.api.generated.photos.dto.PhotosGetRecognitionTagsExtendedResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPopularHashtagsResponseDto;
import com.vk.clips.tool.view.component.video.ClipProgressIndicator;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.widget.tabs.DynamicCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.ihz;
import xsna.uel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ur implements b03, f03, ClipProgressIndicator.a, io.reactivex.rxjava3.functions.l, Preference.b, ihz.a, uel.a.InterfaceC3800a, Div2ImageStubProvider, ValueValidator, HeightCalculatorFactory, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;

    public /* synthetic */ ur(int i) {
        this.b = i;
    }

    public static int b(ProfilesInfo profilesInfo, int i, int i2) {
        return (profilesInfo.hashCode() + i) * i2;
    }

    public static String c(StringBuilder sb, Set set, char c) {
        sb.append(set);
        sb.append(c);
        return sb.toString();
    }

    public static void d(int i, androidx.compose.runtime.a aVar, cri.a.b bVar, androidx.compose.runtime.a aVar2, cri.a.C2678a c2678a) {
        k9q0.w(aVar, Integer.valueOf(i), bVar);
        k9q0.t(aVar2, c2678a);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        ruv0.b(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // xsna.uel.a.InterfaceC3800a
    public Constructor a() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(pgq.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 9:
                return ((ShortVideoGetPopularHashtagsResponseDto) obj).d();
            case 18:
                return i7d.a((h7d) obj);
            default:
                return ((u5r) obj).b;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, AccountGetUserObjectDto.class).getType()).getType())).a();
            case 2:
                return (NewsfeedItemRecommendedAppBlockDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, NewsfeedItemRecommendedAppBlockDto.class).getType())).a();
            case 3:
                return (AudioSearchResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioSearchResponseDto.class).getType())).a();
            case 6:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 22:
                return (MarketGetItemReviewResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetItemReviewResponseDto.class).getType())).a();
            case 23:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 25:
                return (NewsfeedGenericResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NewsfeedGenericResponseDto.class).getType())).a();
            case 26:
                return (NotificationsEditRedesignSettingResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NotificationsEditRedesignSettingResponseDto.class).getType())).a();
            default:
                return (OrdersSubscriptionDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, OrdersSubscriptionDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioPlaylistDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthGetAuthCodeStatusResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetBannerResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetMessageReadPeersResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosGetRecognitionTagsExtendedResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
    public ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        return new DynamicCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // com.yandex.div.core.Div2ImageStubProvider
    public Drawable getImageStubDrawable(int i) {
        return new ColorDrawable(i);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        return doubleValue >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE && doubleValue <= 1.0d;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return bool.booleanValue();
    }

    public /* synthetic */ ur(Object obj, int i) {
        this.b = i;
    }
}
