package io.reactivex.rxjava3.internal.operators.mixed;

import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsCheckInviteFriendResponseDto;
import com.vk.api.generated.artist.dto.ArtistGetArtistPromoResponseDto;
import com.vk.api.generated.audio.dto.AudioRadioStationDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewResponseDto;
import com.vk.api.generated.messages.dto.MessagesDeleteConversationResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingBookWorkDatesCollectionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosResponseDto;
import com.vk.api.generated.stickers.dto.StickersGetUGCPacksResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetUnseenStatusResponseDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.yandex.div.internal.parser.ValueValidator;
import io.reactivex.rxjava3.internal.operators.mixed.l;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import xsna.b03;
import xsna.drm0;
import xsna.f03;
import xsna.hru0;
import xsna.s3q0;
import xsna.wh50;
import xsna.wwx;
import xsna.xtp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class j implements f03, b03, io.reactivex.rxjava3.functions.c, Preference.c, ValueValidator, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;

    public /* synthetic */ j(int i) {
        this.b = i;
    }

    public static int a(CommunityProfileContentItem.State state, int i, int i2) {
        return (state.hashCode() + i) * i2;
    }

    public static String b(char c, StringBuilder sb, ArrayList arrayList) {
        sb.append(arrayList);
        sb.append(c);
        return sb.toString();
    }

    public static String c(StringBuilder sb, ProfilesInfo profilesInfo, char c) {
        sb.append(profilesInfo);
        sb.append(c);
        return sb.toString();
    }

    public static wh50 d(boolean z, androidx.compose.runtime.a aVar) {
        wh50 b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        aVar.R(b);
        return b;
    }

    public static /* synthetic */ boolean f(AtomicReference atomicReference, l.a.C2137a c2137a) {
        while (!atomicReference.compareAndSet(c2137a, null)) {
            if (atomicReference.get() != c2137a) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf((drm0.N((String) obj) && drm0.N((String) obj2)) ? false : true);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 4:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, AudioRadioStationDto.class).getType()).getType())).a();
            case 5:
                return (CallsGetHistoryResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CallsGetHistoryResponseDto.class).getType())).a();
            case 8:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 15:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, UserId.class).getType()).getType())).a();
            case 16:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 20:
                return (MessagesDeleteConversationResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesDeleteConversationResponseDto.class).getType())).a();
            case 22:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (ShortVideoGetGridShortVideosResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, ShortVideoGetGridShortVideosResponseDto.class).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        try {
            Thread.sleep(10000L);
            return true;
        } catch (InterruptedException unused) {
            return true;
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsCheckInviteFriendResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ArtistGetArtistPromoResponseDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCommunityReviewResponseDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingBookWorkDatesCollectionDto.class).getType());
            case 26:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StickersGetUGCPacksResponseDto.class).getType());
            case 27:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesGetUnseenStatusResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, UtilsDomainResolvedDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 13:
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

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return obj instanceof hru0;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return s3q0.a;
    }
}
