package xsna;

import androidx.constraintlayout.motion.widget.a;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.generated.auth.dto.AuthInitPasswordCheckResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCodeMessageDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemGetVerificationMethodsResponseDto;
import com.vk.api.generated.identity.dto.IdentityGetCardResponseDto;
import com.vk.api.generated.market.dto.MarketGetOrderPaymentURLResponseDto;
import com.vk.api.generated.market.dto.MarketSearchResponseDto;
import com.vk.api.generated.messages.dto.MessagesCountersDto;
import com.vk.api.generated.owners.dto.OwnersGetContentTabsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoDeletePlaylistsResponseDto;
import com.vk.api.generated.splashscreens.dto.SplashscreensSplashscreenDto;
import com.vk.api.generated.stories.dto.StoriesGetInterestingBlockResponseDto;
import com.vk.api.generated.wall.dto.WallLastPostingInfoExtendedResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.webrtc.animoji.AnimojiNativeControl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.hov;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dt implements f03, io.reactivex.rxjava3.functions.l, NativeDoubleArrayConsumer.Consumer, b03, ValueValidator, h9l, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ dt(int i) {
        this.b = i;
    }

    public static Integer a(kdy kdyVar, ddy ddyVar, a.b bVar, kdy kdyVar2, int i) {
        kdyVar.b(ddyVar);
        bVar.a(kdyVar2);
        return Integer.valueOf(i);
    }

    public static Map b(String str, String str2) {
        return on00.f(new Pair(str, str2));
    }

    public static boolean c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        ja8.a(q630Var, aVar, i);
        aVar.G();
        return androidx.compose.runtime.b.d();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return ((WallLastPostingInfoExtendedResponseDto) obj).d();
            case 20:
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            default:
                return Boolean.FALSE;
        }
    }

    @Override // org.webrtc.NativeDoubleArrayConsumer.Consumer
    public void consume(Double[] dArr) {
        AnimojiNativeControl.a(dArr);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 5:
                return (AuthInitPasswordCheckResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthInitPasswordCheckResponseDto.class).getType())).a();
            case 16:
                return (MarketGetOrderPaymentURLResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetOrderPaymentURLResponseDto.class).getType())).a();
            case 18:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 19:
                return (MessagesCountersDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesCountersDto.class).getType())).a();
            case 22:
                return (OwnersGetContentTabsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, OwnersGetContentTabsResponseDto.class).getType())).a();
            case 23:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType())).a();
            case 25:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 26:
                return (ShortVideoDeletePlaylistsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ShortVideoDeletePlaylistsResponseDto.class).getType())).a();
            default:
                return (StoriesGetInterestingBlockResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, StoriesGetInterestingBlockResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetResponseDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseCodeMessageDto.class).getType());
            case 11:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EcosystemGetVerificationMethodsResponseDto.class).getType());
            case 13:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, IdentityGetCardResponseDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketSearchResponseDto.class).getType());
            case 21:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, SplashscreensSplashscreenDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 9:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
            default:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new h860();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        MenuApiApplicationsCache menuApiApplicationsCache = MenuApiApplicationsCache.b;
        return MenuApiApplicationsCache.b((List) obj, new it80(((hov.a) obj2).a));
    }
}
