package io.reactivex.rxjava3.internal.operators.mixed;

import android.graphics.Color;
import android.os.Bundle;
import com.vk.api.generated.account.dto.AccountPushSettingsDto;
import com.vk.api.generated.apps.dto.AppsGamesCatalogDto;
import com.vk.api.generated.audio.dto.AudioGetFeedPlaylistsBlockResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsDeleteParticipantNameResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.market.dto.MarketGetCartResponseDto;
import com.vk.api.generated.market.dto.MarketUserReviewsItemsResponseObjectDto;
import com.vk.api.generated.messages.dto.MessagesGetCallTokenResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetPodcastResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetRecordsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoEditResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.yandex.div.internal.parser.ListValidator;
import io.reactivex.rxjava3.internal.operators.mixed.o;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import org.webrtc.EglThread;
import xsna.a0a;
import xsna.ako0;
import xsna.b03;
import xsna.f03;
import xsna.rbr;
import xsna.stf;
import xsna.szz;
import xsna.ukk;
import xsna.wwx;
import xsna.xtp0;
import xsna.xzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class n implements f03, b03, io.reactivex.rxjava3.functions.l, ako0, ListValidator, EglThread.ReleaseMonitor, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ n(int i) {
        this.b = i;
    }

    public static Integer a(String str, String str2) {
        return Integer.valueOf(Color.parseColor(str.concat(str2)));
    }

    public static Object b(Object obj) {
        return new Result(obj).d();
    }

    public static Iterator c(Serializer serializer, Map map) {
        serializer.S(map.size());
        return map.entrySet().iterator();
    }

    public static /* synthetic */ void f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, szz szzVar, szz szzVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(szzVar, null, szzVar2) && atomicReferenceFieldUpdater.get(szzVar) == null) {
        }
    }

    public static /* synthetic */ boolean h(AtomicReference atomicReference, o.a.C2139a c2139a) {
        while (!atomicReference.compareAndSet(c2139a, null)) {
            if (atomicReference.get() != c2139a) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Bundle w;
        switch (this.b) {
            case 7:
                return ((stf) obj).a;
            case 14:
                Throwable th = (Throwable) obj;
                String str = null;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.h0() && (w = vKApiExecutionException.w()) != null) {
                        str = w.getString("validation_url", String.format("https://m.%s/payments?act=buy_votes", Arrays.copyOf(new Object[]{a0a.d}, 1)));
                    }
                }
                return new rbr(str, th.getLocalizedMessage());
            default:
                return (io.reactivex.rxjava3.core.p) obj;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (AudioGetFeedPlaylistsBlockResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AudioGetFeedPlaylistsBlockResponseDto.class).getType())).a();
            case 4:
                return (CallsDeleteParticipantNameResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CallsDeleteParticipantNameResponseDto.class).getType())).a();
            case 5:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 13:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 15:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 18:
                return (MarketGetCartResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetCartResponseDto.class).getType())).a();
            case 21:
                return (MessagesGetCallTokenResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesGetCallTokenResponseDto.class).getType())).a();
            case 23:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType())).a();
            case 24:
                return (PodcastsGetPodcastResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PodcastsGetPodcastResponseDto.class).getType())).a();
            case 28:
                return (ShortVideoEditResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, ShortVideoEditResponseDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountPushSettingsDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGamesCatalogDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketUserReviewsItemsResponseObjectDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Boolean.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingGetRecordsResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        switch (this.b) {
            case 9:
                if (list.size() >= 1) {
                }
                break;
            default:
                if (list.size() >= 1) {
                }
                break;
        }
        return true;
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        boolean lambda$create$1;
        lambda$create$1 = EglThread.lambda$create$1(eglThread);
        return lambda$create$1;
    }

    public /* synthetic */ n(int i, xzs xzsVar) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (MusicTrack) obj;
    }

    @Override // xsna.ako0
    public void d(ukk ukkVar) {
    }
}
