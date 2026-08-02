package xsna;

import android.net.Uri;
import androidx.preference.Preference;
import com.vk.api.generated.apps.dto.AppsAdsSlotsDto;
import com.vk.api.generated.apps.dto.AppsGetEmbeddedUrlResponseDto;
import com.vk.api.generated.atum.dto.AtumIdentityPropsDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.database.dto.DatabaseStationDto;
import com.vk.api.generated.fave.dto.FaveCheckLinkResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetRequestsResponseDto;
import com.vk.api.generated.market.dto.MarketEditCommunityReviewCommentResponseDto;
import com.vk.api.generated.market.dto.MarketGeoSuggestResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetMessagesReactionsResponseDto;
import com.vk.api.generated.places.dto.PlacesGetPostsExtendedResponseDto;
import com.vk.api.generated.podcasts.dto.PodcastsSuccessResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.OneLogImpl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.pattern.entity.PatternMatchRaw;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function;
import xsna.by1;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class er implements f03, b03, io.reactivex.rxjava3.functions.l, Function, m6o, Preference.c, ihz.a, ValueValidator, ListValidator {
    public final /* synthetic */ int b;

    public /* synthetic */ er(int i) {
        this.b = i;
    }

    public static Uri.Builder a(String str) {
        return new Uri.Builder().scheme(str);
    }

    public static String c(StringBuilder sb, AtumIdentityPropsDto atumIdentityPropsDto, char c) {
        sb.append(atumIdentityPropsDto);
        sb.append(c);
        return sb.toString();
    }

    public static String d(StringBuilder sb, Image image, char c) {
        sb.append(image);
        sb.append(c);
        return sb.toString();
    }

    public static boolean f(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        jaiVar.invoke(aVar, Integer.valueOf(i));
        aVar.G();
        return androidx.compose.runtime.b.d();
    }

    public static /* synthetic */ boolean h(AtomicReference atomicReference, OneLogImpl.MaxTimeToUploadRecord maxTimeToUploadRecord, OneLogImpl.MaxTimeToUploadRecord maxTimeToUploadRecord2) {
        while (!atomicReference.compareAndSet(maxTimeToUploadRecord, maxTimeToUploadRecord2)) {
            if (atomicReference.get() != maxTimeToUploadRecord) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Detection detection;
        switch (this.b) {
            case 5:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ca3.b((Attachment) it.next()));
                }
                return arrayList;
            default:
                detection = ((PatternMatchRaw) obj).patternDetectionOriginal;
                return detection;
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        double d2;
        double d3 = d < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? -d : d;
        if (d3 >= 0.0031308049535603718d) {
            d3 = Math.pow(d3, 0.4166666666666667d) - 0.05213270142180095d;
            d2 = 0.9478672985781991d;
        } else {
            d2 = 0.07739938080495357d;
        }
        return Math.copySign(d3 / d2, d);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AppsAdsSlotsDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsAdsSlotsDto.class).getType())).a();
            case 4:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, UserId.class).getType()).getType())).a();
            case 7:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 9:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 17:
                return (FaveCheckLinkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, FaveCheckLinkResponseDto.class).getType())).a();
            case 20:
                return (FriendsGetRequestsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, FriendsGetRequestsResponseDto.class).getType())).a();
            case 21:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 25:
                return (MessagesGetMessagesReactionsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetMessagesReactionsResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        String[] strArr = DebugDevSettingsFragment.t0;
        ihs.b.onNext(Boolean.TRUE);
        return true;
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetEmbeddedUrlResponseDto.class).getType());
            case 8:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 11:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, DatabaseStationDto.class).getType()).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGeoSuggestResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketEditCommunityReviewCommentResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 28:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PlacesGetPostsExtendedResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PodcastsSuccessResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    public /* synthetic */ er(by1.a aVar, boolean z, int i) {
        this.b = 13;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
