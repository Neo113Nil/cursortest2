package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsGetActivityResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemCheckPhoneReuseResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetEventsResponseDto;
import com.vk.api.generated.identity.dto.IdentityLabelDto;
import com.vk.api.generated.market.dto.MarketReferenceDto;
import com.vk.api.generated.messages.dto.MessagesGetGroupsForCallResponseDto;
import com.vk.api.generated.pages.dto.PagesWikipageFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingActivitySearchActivitiesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetDownloadUrlResponseDto;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.core.apps.BuildInfo;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.log.L;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hq implements b03, f03, io.reactivex.rxjava3.functions.l, Preference.b, ValueValidator, io.reactivex.rxjava3.core.d {
    public final /* synthetic */ int b;

    public /* synthetic */ hq(int i) {
        this.b = i;
    }

    public static HashMap a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return hashMap;
    }

    public static tlo0.d b(tlo0.a aVar, int i, int i2) {
        aVar.getClass();
        return new tlo0.d(i, i2);
    }

    public static void c(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(Integer.valueOf(i), str);
        hashMap.put(Integer.valueOf(i2), str2);
    }

    public static /* synthetic */ boolean d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, swi swiVar, Object obj, swi swiVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(swiVar, obj, swiVar2)) {
            if (atomicReferenceFieldUpdater.get(swiVar) != obj) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        Boolean bool = (Boolean) obj;
        bool.getClass();
        if (!BuildInfo.h()) {
            bn40.f("Preview ad available only on Debug app");
        }
        boolean booleanValue = bool.booleanValue();
        if (!BuildInfo.h()) {
            L.p("Preview ad available only on Debug app");
            booleanValue = false;
        }
        jb4.d = booleanValue;
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 4:
                dhw0 L = com.vk.voip.ui.c.b.L();
                return Boolean.valueOf(L != null ? L.I : false);
            case 7:
                return new Result(new Result.Failure(new ClipsCoauthorsException.CoauthorsNetworkException()));
            default:
                return Boolean.TRUE;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 1:
                return (AppsGetActivityResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppsGetActivityResponseDto.class).getType())).a();
            case 5:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 13:
                return (EcosystemCheckPhoneReuseResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, EcosystemCheckPhoneReuseResponseDto.class).getType())).a();
            case 17:
                return (List) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, xtp0.getParameterized(List.class, IdentityLabelDto.class).getType()).getType())).a();
            case 21:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 22:
                return (MessagesGetGroupsForCallResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesGetGroupsForCallResponseDto.class).getType())).a();
            default:
                return (PagesWikipageFullDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PagesWikipageFullDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetEventsResponseDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketReferenceDto.class).getType());
            case 23:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType());
            case 26:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingActivitySearchActivitiesResponseDto.class).getType());
            case 27:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetDownloadUrlResponseDto.class).getType());
            case 28:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
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

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        int i = ify.a;
        if (!ify.e(ify.c)) {
            bVar.onComplete();
            return;
        }
        final cfy cfyVar = new cfy(bVar);
        ify.a(cfyVar);
        bVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.bfy
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                int i2 = ify.a;
                ify.g(cfy.this);
            }
        });
    }
}
