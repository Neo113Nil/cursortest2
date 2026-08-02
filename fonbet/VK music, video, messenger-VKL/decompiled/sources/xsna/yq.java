package xsna;

import android.graphics.Rect;
import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsCheckInviteFriendResponseDto;
import com.vk.api.generated.artist.dto.ArtistGetArtistPromoResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsCreateCommentResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetRecommendationsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetChatsResponseDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetReactedPeersResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingBookWorkDatesCollectionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetRecomResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthErrorType;
import com.vk.auth.modal.qrwithcode.c;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.Peer;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.d0q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yq implements b03, f03, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.functions.c, Preference.c, ValueValidator, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;

    public /* synthetic */ yq(int i) {
        this.b = i;
    }

    public static float a(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static String b(Peer peer, String str) {
        return str + peer;
    }

    public static String c(StringBuilder sb, Rect rect, char c) {
        sb.append(rect);
        sb.append(c);
        return sb.toString();
    }

    public static JSONObject d(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, str2);
        return jSONObject;
    }

    public static dlv0 f(androidx.compose.runtime.a aVar) {
        dlv0 dlv0Var = new dlv0();
        aVar.R(dlv0Var);
        return dlv0Var;
    }

    public static /* synthetic */ void h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, d0q d0qVar, d0q.d dVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(d0qVar, null, dVar) && atomicReferenceFieldUpdater.get(d0qVar) == null) {
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 16:
                return EmptyList.b;
            case 26:
                Throwable th = (Throwable) obj;
                xgx0.a.getClass();
                xgx0.d(th);
                boolean z = th instanceof VKApiExecutionException;
                if (z && ((VKApiExecutionException) th).s() == 104) {
                    return c.a.a;
                }
                return new c.b((z && ((VKApiExecutionException) th).s() == -1) ? QrWithCodeAuthErrorType.NoInternet : QrWithCodeAuthErrorType.Generic);
            default:
                return (io.reactivex.rxjava3.core.p) obj;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 1:
                return (AppsCheckInviteFriendResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsCheckInviteFriendResponseDto.class).getType())).a();
            case 2:
                return (ArtistGetArtistPromoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ArtistGetArtistPromoResponseDto.class).getType())).a();
            case 5:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 19:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 20:
                return (MarketGetCommunityReviewResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetCommunityReviewResponseDto.class).getType())).a();
            case 21:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (ServiceBookingBookWorkDatesCollectionDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ServiceBookingBookWorkDatesCollectionDto.class).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        throw new RuntimeException("Test crash");
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsCreateCommentResponseDto.class).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsGetRecommendationsResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetChatsResponseDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetReactedPeersResponseDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetRecomResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 11:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            default:
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        mz mzVar = new mz(yVar, 28);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(mzVar);
    }

    public /* synthetic */ yq(Object obj, int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (ShortVideoGetPlaylistsResponseDto) obj;
    }
}
