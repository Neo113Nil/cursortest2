package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import com.vk.api.generated.apps.dto.AppsGetGroupsListResponseDto;
import com.vk.api.generated.audio.dto.AudioGetPlaylistsResponseDto;
import com.vk.api.generated.audio.dto.AudioPlaylistOriginalFollowedDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsStartResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsHasActiveSubscriptionResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutGetOneTimePaymentsResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetBirthdaysResponseDto;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.api.generated.market.dto.MarketCreateCommunityReviewResponseDto;
import com.vk.api.generated.market.dto.MarketGetAlbumsResponseDto;
import com.vk.api.generated.messages.dto.MessagesSendServiceResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesGetFromOwnerResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedIgnoreItemResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationListRedesignResponseDto;
import com.vk.api.generated.photos.dto.PhotosSaveAudioPlaylistCoverResponseDto;
import com.vk.im.engine.models.messages.Msg;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import xsna.by1;
import xsna.epx;
import xsna.ihz;
import xsna.s3q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pn implements f03, b03, ihz.a, io.reactivex.rxjava3.core.s, qq9, io.reactivex.rxjava3.functions.l, xw8, ValueValidator, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;

    public /* synthetic */ pn(int i) {
        this.b = i;
    }

    public static int a(Msg msg, int i, int i2) {
        return (msg.hashCode() + i) * i2;
    }

    public static String c(int i, String str, String str2, String str3, List list) {
        return str + i + str2 + list + str3;
    }

    public static /* synthetic */ boolean d(AtomicReference atomicReference, String str, String str2) {
        while (!atomicReference.compareAndSet(str, str2)) {
            if (atomicReference.get() != str) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((agm) obj).b.Zb();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (AppsGetGroupsListResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsGetGroupsListResponseDto.class).getType())).a();
            case 5:
                return (AudioPlaylistOriginalFollowedDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioPlaylistOriginalFollowedDto.class).getType())).a();
            case 10:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 17:
                return (DonutGetOneTimePaymentsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, DonutGetOneTimePaymentsResponseDto.class).getType())).a();
            case 21:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 22:
                return (LikesDeleteResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, LikesDeleteResponseDto.class).getType())).a();
            case 26:
                return (NarrativesGetFromOwnerResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NarrativesGetFromOwnerResponseDto.class).getType())).a();
            default:
                return (NewsfeedIgnoreItemResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NewsfeedIgnoreItemResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetPlaylistsResponseDto.class).getType());
            case 8:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CallsStartResponseDto.class).getType());
            case 12:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CommunitySubscriptionsHasActiveSubscriptionResponseDto.class).getType());
            case 19:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsGetBirthdaysResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetAlbumsResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketCreateCommunityReviewResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesSendServiceResponseDto.class).getType());
            case 28:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsNotificationListRedesignResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosSaveAudioPlaylistCoverResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        switch (this.b) {
            case 6:
                ((AudioOutputProvider.c) obj).a();
                break;
            default:
                ((by1) obj).getClass();
                break;
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // xsna.xw8
    public String k(evk evkVar) {
        return evkVar.a.toString();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.vk.libvideo.bottomsheet.about.AuthorVideoItemsLoader$observeDonutSubscriptionPaidEvent$1$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (epx.f(intent.getAction(), "com.vkontakte.android.DONUT_SUBSCRIPTION_PAID")) {
                    rVar.onNext(s3q0.a);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
        dhr0.a.getClass();
        Context E = dhr0.E();
        anj.d(E, broadcastReceiver, intentFilter, hf8.a, 4);
        rVar.a(new dd5(0, E, broadcastReceiver));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return vao.d.containsKey(((n8o) obj).a());
    }

    public /* synthetic */ pn(by1.a aVar, int i) {
        this.b = 13;
    }

    @Override // xsna.qq9
    public void cancel() {
    }
}
