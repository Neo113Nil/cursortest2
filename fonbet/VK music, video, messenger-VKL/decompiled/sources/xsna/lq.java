package xsna;

import android.content.Context;
import android.view.View;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.preference.Preference;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.account.dto.AccountGetContactListResponseDto;
import com.vk.api.generated.adsint.dto.AdsintSuccessResponseDto;
import com.vk.api.generated.appWidgets.dto.AppWidgetsGetWidgetPreviewResponseDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsGetChannelMessagesCountersResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemCheckOtpResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetSuggestionsResponseDto;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionRestoreAudioResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetTimesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetAnonUserInfoResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.VideoFile;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.lists.AbstractPaginatedView;
import com.vk.log.L;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import xsna.dug0;
import xsna.ihz;
import xsna.jza0;
import xsna.k840;
import xsna.l8x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lq implements f03, b03, AbstractPaginatedView.f, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, Preference.b, ValueValidator, ListValidator, ihz.a, io.reactivex.rxjava3.functions.m, l8x.a {
    public final /* synthetic */ int b;

    public /* synthetic */ lq(int i) {
        this.b = i;
    }

    public static String a(StringBuilder sb, VideoFile videoFile, char c) {
        sb.append(videoFile);
        sb.append(c);
        return sb.toString();
    }

    public static void b(String str, b8y b8yVar, p2y p2yVar) {
        b8yVar.D1(new JsMethod(str), p2yVar);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        wzs<? super String, ? super gzs<? extends Object>, s3q0> k8dVar;
        String[] strArr = DebugDevSettingsFragment.t0;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        bn40.a.getClass();
        if (booleanValue) {
            k8dVar = new an40(2, L.a, L.class, "i", "i(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", 0);
        } else {
            k8dVar = new k8d((byte) 0, 4);
        }
        bn40.c = k8dVar;
        k840.b.C3169b.a = booleanValue;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 9:
                return ((VkPaginationList) obj).b;
            default:
                return new GroupsGetByIdObjectResponseDto(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Override // xsna.l8x.a
    public te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var) {
        return new ejh0(ym5Var, n3y0Var);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AdsintSuccessResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AdsintSuccessResponseDto.class).getType())).a();
            case 3:
                return (AppWidgetsGetWidgetPreviewResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AppWidgetsGetWidgetPreviewResponseDto.class).getType())).a();
            case 8:
                return (ChannelsGetChannelMessagesCountersResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ChannelsGetChannelMessagesCountersResponseDto.class).getType())).a();
            case 15:
                return (EcosystemCheckOtpResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, EcosystemCheckOtpResponseDto.class).getType())).a();
            case 19:
                return (KidsCollectionRestoreAudioResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, KidsCollectionRestoreAudioResponseDto.class).getType())).a();
            case 21:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 23:
                return (String) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, String.class).getType())).a();
            case 24:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetContactListResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AudioAudioDto.class).getType()).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 17:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetSuggestionsResponseDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 28:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingGetTimesResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetAnonUserInfoResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).onPlayerError(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // com.vk.lists.AbstractPaginatedView.f
    public View l(Context context) {
        return new View(context);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = RestoreSearchFragment.h0;
        return obj instanceof mru0;
    }

    public /* synthetic */ lq(int i, xzs xzsVar) {
        this.b = i;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 11:
                return (vqt) obj;
            default:
                dug0.c cVar = (dug0.c) obj;
                dug0.c cVar2 = (dug0.c) obj2;
                if (cVar.d() && cVar2.d()) {
                    if (cVar.b < cVar2.b) {
                        return cVar;
                    }
                } else if (!cVar2.d()) {
                    return cVar;
                }
                return cVar2;
        }
    }
}
