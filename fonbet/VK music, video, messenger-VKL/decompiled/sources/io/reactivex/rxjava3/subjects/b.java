package io.reactivex.rxjava3.subjects;

import android.os.Parcel;
import com.vk.api.generated.apps.dto.AppsGamesCatalogDto;
import com.vk.api.generated.apps.dto.AppsGetAppLaunchParamsResponseDto;
import com.vk.api.generated.audio.dto.AudioMoosicPlaylistDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksGetAudioBookByIdResponseDto;
import com.vk.api.generated.auth.dto.AuthExternalFlowOutResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.esia.dto.EsiaCheckEsiaLinkResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.gifts.dto.GiftsCatalogGiftDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.market.dto.MarketGetCommentsResponseDto;
import com.vk.api.generated.messages.dto.MessagesEnumerateBackgroundsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetIncognitoMembersByIdsResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsGetRedesignSettingResponseDto;
import com.vk.api.generated.orders.dto.OrdersAppSubscriptionItemDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import io.reactivex.rxjava3.functions.l;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import xsna.b03;
import xsna.by1;
import xsna.f03;
import xsna.g9l;
import xsna.h9l;
import xsna.ihz;
import xsna.jfa0;
import xsna.s3q0;
import xsna.szs;
import xsna.vr10;
import xsna.wkk;
import xsna.wwx;
import xsna.xtp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class b implements f03, b03, l, ihz.a, ValueValidator, h9l, szs {
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(CatalogBlockVariant catalogBlockVariant, int i, int i2) {
        return (catalogBlockVariant.hashCode() + i) * i2;
    }

    public static String c(StringBuilder sb, CommunityProfileContentItem communityProfileContentItem, char c) {
        sb.append(communityProfileContentItem);
        sb.append(c);
        return sb.toString();
    }

    public static void d(Parcel parcel, int i, Float f) {
        parcel.writeInt(i);
        parcel.writeFloat(f.floatValue());
    }

    public static void f(Parcel parcel, int i, Long l) {
        parcel.writeInt(i);
        parcel.writeLong(l.longValue());
    }

    public static /* synthetic */ boolean h(AtomicReference atomicReference, Throwable th) {
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 10:
                return s3q0.a;
            default:
                return Long.valueOf(((wkk) obj).c);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (AppsGamesCatalogDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsGamesCatalogDto.class).getType())).a();
            case 4:
                return (AudioBooksGetAudioBookByIdResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioBooksGetAudioBookByIdResponseDto.class).getType())).a();
            case 5:
                return (AudioPhotoDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioPhotoDto.class).getType())).a();
            case 7:
                return (AuthExternalFlowOutResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthExternalFlowOutResponseDto.class).getType())).a();
            case 20:
                return (GroupsGetByIdObjectResponseDto) ((com.vk.common.api.generated.SingleRootResponseDto) com.vk.common.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.common.api.generated.SingleRootResponseDto.class, GroupsGetByIdObjectResponseDto.class).getType())).a();
            case 23:
                return (MarketGetCommentsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetCommentsResponseDto.class).getType())).a();
            default:
                return (MessagesEnumerateBackgroundsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesEnumerateBackgroundsResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetAppLaunchParamsResponseDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AudioMoosicPlaylistDto.class).getType()).getType());
            case 8:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsGetFieldsResponseDto.class).getType());
            case 9:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EsiaCheckEsiaLinkResponseDto.class).getType());
            case 19:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, GiftsCatalogGiftDto.class).getType()).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 26:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetIncognitoMembersByIdsResponseDto.class).getType());
            case 28:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsGetRedesignSettingResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OrdersAppSubscriptionItemDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 13:
                if (l.longValue() >= 0) {
                }
                break;
            case 14:
                if (l.longValue() > 0) {
                }
                break;
            default:
                if (l.longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new jfa0();
    }

    public /* synthetic */ b(by1.a aVar, vr10 vr10Var) {
        this.b = 12;
    }
}
