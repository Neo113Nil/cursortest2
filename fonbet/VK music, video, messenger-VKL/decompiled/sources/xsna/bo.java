package xsna;

import android.os.Parcel;
import com.vk.api.generated.apps.dto.AppsGetCollectionAppsResponseDto;
import com.vk.api.generated.assets.dto.AssetsItemDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.auth.dto.AuthSetAuthCodeStatusResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.combo.dto.ComboAvailableOfferResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import com.vk.api.generated.market.dto.MarketGetFavesForAttachResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemReviewsResponseDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import com.vk.api.generated.messages.dto.MessagesGetRankedSharingPeersResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsGetRedesignSettingsResponseDto;
import com.vk.api.generated.orders.dto.OrdersGetAutoBuyStatusResponseDto;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class bo implements f03, b03, io.reactivex.rxjava3.functions.l, ValueValidator, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;

    public /* synthetic */ bo(int i) {
        this.b = i;
    }

    public static int a(AttachSyncState attachSyncState, int i, int i2) {
        return (attachSyncState.hashCode() + i) * i2;
    }

    public static int b(Class cls, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i + i2;
    }

    public static String c(char c, StringBuilder sb, ArrayList arrayList) {
        sb.append((Object) wow.c(arrayList));
        sb.append(c);
        return sb.toString();
    }

    public static String d(ChannelsDb.Column column, StringBuilder sb, String str) {
        sb.append(column.getKey());
        sb.append(str);
        return xqm0.g(sb.toString());
    }

    public static wh50 f(int i, long j, androidx.compose.runtime.a aVar) {
        return androidx.compose.runtime.k.c(new l5g(j), aVar, i);
    }

    public static boolean h() {
        return fxc0.B().J().Y1();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 12:
                lyd.a.b((Throwable) obj);
                return EmptyList.b;
            case 14:
                return s3q0.a;
            case 18:
                return ((u5r) obj).c;
            default:
                return "";
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, AssetsItemDto.class).getType()).getType())).a();
            case 8:
                return (MediaPopupDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MediaPopupDto.class).getType())).a();
            case 17:
                return (DonutGroupSettingsDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, DonutGroupSettingsDto.class).getType())).a();
            case 20:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 24:
                return (MessagesFoldersInfoDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesFoldersInfoDto.class).getType())).a();
            default:
                return (OrdersGetAutoBuyStatusResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, OrdersGetAutoBuyStatusResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetCollectionAppsResponseDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AudioArtistDto.class).getType()).getType());
            case 9:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthSetAuthCodeStatusResponseDto.class).getType());
            case 10:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 13:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ComboAvailableOfferResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetFavesForAttachResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetItemReviewsResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetRankedSharingPeersResponseDto.class).getType());
            case 27:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedGenericResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsGetRedesignSettingsResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Double) obj).doubleValue() > ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }
}
