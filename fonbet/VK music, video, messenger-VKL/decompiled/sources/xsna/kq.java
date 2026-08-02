package xsna;

import com.google.firebase.perf.util.Timer;
import com.vk.api.generated.adsint.dto.AdsintSuccessResponseDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUploadServerDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetSuggestionsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetChatOnlineResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetVideoMessageShapesResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingGetTimesResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetAnonUserInfoResponseDto;
import com.vk.log.L;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.text.Regex;
import xsna.ap9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kq implements f03, io.reactivex.rxjava3.functions.l, b03, ValueValidator, ListValidator, ujo0 {
    public final /* synthetic */ int b;

    public /* synthetic */ kq(int i) {
        this.b = i;
    }

    public static Set b(String str) {
        return Collections.singleton(new Regex(str));
    }

    public static void c(Timer timer, e560 e560Var, e560 e560Var2) {
        e560Var.l(timer.d());
        f560.c(e560Var2);
    }

    public static void d(Number number, ArrayList arrayList) {
        arrayList.add(String.valueOf(number.intValue()));
    }

    public static /* synthetic */ void f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, pyx pyxVar, nep nepVar, atw atwVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(pyxVar, nepVar, atwVar) && atomicReferenceFieldUpdater.get(pyxVar) == nepVar) {
        }
    }

    @Override // xsna.ujo0
    public void a(Object obj, String str, String str2) {
        List list = (List) ((Map) obj).putIfAbsent(str, new ArrayList());
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 4:
                return ((nex0) obj).a;
            case 7:
                L.i((Throwable) obj);
                return ap9.a.a;
            case 11:
                return ((s080) obj).c;
            default:
                return bn00.a((EcosystemSendOtpResponseDto) obj);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 5:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 6:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, AudioAudioDto.class).getType()).getType())).a();
            case 9:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 18:
                return (GroupsGetSuggestionsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GroupsGetSuggestionsResponseDto.class).getType())).a();
            case 21:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 24:
                return (MessagesGetVideoMessageShapesResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetVideoMessageShapesResponseDto.class).getType())).a();
            case 27:
                return (BaseUploadServerDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseUploadServerDto.class).getType())).a();
            case 28:
                return (ServiceBookingGetTimesResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ServiceBookingGetTimesResponseDto.class).getType())).a();
            default:
                return (ShortVideoGetAnonUserInfoResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, ShortVideoGetAnonUserInfoResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 1:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AdsintSuccessResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 10:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseUploadServerDto.class).getType());
            case 15:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetChatOnlineResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        switch (this.b) {
            case 13:
                return list.size() >= 2;
            default:
                return list.size() >= 1;
        }
    }
}
