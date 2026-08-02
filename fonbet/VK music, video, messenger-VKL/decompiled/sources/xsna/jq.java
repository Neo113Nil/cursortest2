package xsna;

import androidx.preference.Preference;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.adsint.dto.AdsintSuccessResponseDto;
import com.vk.api.generated.apps.dto.AppsCatalogListDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetAddressesResponseDto;
import com.vk.api.generated.market.dto.MarketGetCheckoutDeliveryPointsResponseDto;
import com.vk.api.generated.messages.dto.MessagesConfigDto;
import com.vk.api.generated.messages.dto.MessagesGetChatOnlineResponseDto;
import com.vk.api.generated.photos.dto.PhotosSaveOwnerPhotoResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.VideoFile;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.search.fragment.RestoreSearchFragment;
import com.yandex.div.histogram.util.Cancelable;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.pyx;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jq implements b03, f03, io.reactivex.rxjava3.functions.l, Cancelable, Preference.b, ValueValidator, ListValidator, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;

    public /* synthetic */ jq(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return (i3 - (i * i2)) / i4;
    }

    public static int b(VideoFile videoFile, int i, int i2) {
        return (videoFile.hashCode() + i) * i2;
    }

    public static String c(StringBuilder sb, tlo0.h hVar, char c) {
        sb.append(hVar);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder d(Integer num, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(num);
        sb.append(str4);
        return sb;
    }

    public static KotlinNothingValueException f(String str) {
        xzw.b(str);
        return new KotlinNothingValueException();
    }

    public static void h(String str, ByteBuffer byteBuffer, byte b) {
        byteBuffer.put(imj0.b(str));
        byteBuffer.put(b);
    }

    public static /* synthetic */ boolean i(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, pyx pyxVar, atw atwVar, pyx.c cVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(pyxVar, atwVar, cVar)) {
            if (atomicReferenceFieldUpdater.get(pyxVar) != atwVar) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l o2lVar = o2l.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o2lVar.getClass();
        o2l.h("__dbg_music_debug_advertisement_player_banner", booleanValue);
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((VkPaginationList) obj).b;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 1:
                return (AdsintSuccessResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AdsintSuccessResponseDto.class).getType())).a();
            case 3:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 8:
                return (BaseUploadServerDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseUploadServerDto.class).getType())).a();
            case 16:
                return (BaseBoolIntDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 19:
                return Integer.valueOf(((Number) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
            case 22:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (MessagesGetChatOnlineResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesGetChatOnlineResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 4:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsCatalogListDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioPlaylistDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetAddressesResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCheckoutDeliveryPointsResponseDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesConfigDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosSaveOwnerPhotoResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 13:
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

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = RestoreSearchFragment.h0;
        return obj instanceof fru0;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 2;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
    }
}
