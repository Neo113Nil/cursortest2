package xsna;

import android.graphics.drawable.Drawable;
import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountGetProfileNavigationInfoResponseDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadListDto;
import com.vk.api.generated.apps.dto.AppsSearchResponseDto;
import com.vk.api.generated.audio.dto.AudioAudioIdDto;
import com.vk.api.generated.auth.dto.AuthOnSuccessValidationResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutGetInfoResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetResponseDto;
import com.vk.api.generated.market.dto.MarketGetAlbumsResponseDto;
import com.vk.api.generated.market.dto.MarketGetServicesResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetActivitiesResponseDto;
import com.vk.api.generated.orders.dto.OrdersGetAutoBuyStatusResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.sdk.api.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.factory.CatMeshFactory;
import ru.ok.tensorflow.smoothing.filter.IFilter;
import ru.ok.tensorflow.util.Function2;
import xsna.dug0;
import xsna.ky6;
import xsna.t6k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zn implements f03, b03, Function2, io.reactivex.rxjava3.functions.l, Preference.b, ValueValidator, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ zn(int i) {
        this.b = i;
    }

    public static Shimmer.b a(boolean z) {
        return new Shimmer.c().c(z);
    }

    public static String b(StringBuilder sb, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, String str) {
        sb.append(newsfeedItemWallpostFeedbackDto);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder c(int i, String str, String str2, String str3, List list) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ boolean d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, nm8 nm8Var, n4i0 n4i0Var, qbb qbbVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(nm8Var, n4i0Var, qbbVar)) {
            if (atomicReferenceFieldUpdater.get(nm8Var) != n4i0Var) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            feh0.e();
        } else {
            feh0.h.e();
            c63 c63Var = c63.a;
            c63.c(feh0.i);
        }
        ky6.a aVar = (ky6.a) com.vk.core.preference.Preference.j().edit();
        aVar.putBoolean("__dbg_screenshot_marker_new", bool.booleanValue());
        aVar.a();
        cvk.w("Настройки изменены", false);
        return true;
    }

    @Override // ru.ok.tensorflow.util.Function2
    public Object apply(Object obj, Object obj2) {
        IFilter lambda$create$1;
        Long l = (Long) obj;
        switch (this.b) {
            case 8:
                lambda$create$1 = CatMeshFactory.lambda$create$1(l, (Float) obj2);
                return lambda$create$1;
            default:
                return (Drawable) obj2;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (AppsMiniappsCatalogItemPayloadListDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsMiniappsCatalogItemPayloadListDto.class).getType())).a();
            case 5:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 9:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 13:
                return (DonutGetInfoResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, DonutGetInfoResponseDto.class).getType())).a();
            case 15:
                return (GroupsGetResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GroupsGetResponseDto.class).getType())).a();
            case 17:
                return (MarketGetAlbumsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetAlbumsResponseDto.class).getType())).a();
            case 18:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 23:
                return (NewsfeedGetActivitiesResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NewsfeedGetActivitiesResponseDto.class).getType())).a();
            case 25:
                return (OrdersGetAutoBuyStatusResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, OrdersGetAutoBuyStatusResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetProfileNavigationInfoResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsSearchResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AudioAudioIdDto.class).getType()).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthOnSuccessValidationResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetServicesResponseDto.class).getType());
            case 19:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 26:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        return doubleValue >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE && doubleValue <= 1.0d;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 10:
                return s3q0.a;
            case 21:
                return ((dug0.c) obj).c;
            default:
                par0.a.getClass();
                par0.d((Throwable) obj);
                return t6k0.c.a;
        }
    }
}
