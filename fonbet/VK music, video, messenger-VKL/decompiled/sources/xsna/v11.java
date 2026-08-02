package xsna;

import com.ironsource.mediationsdk.logger.IronLog;
import com.vk.api.generated.audio.dto.AudioPreviewSnippetDto;
import com.vk.api.generated.auth.dto.AuthValidatePhoneCheckResponseDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.gifts.dto.GiftsMessagesConversationCardConfigDto;
import com.vk.api.generated.market.dto.MarketGetStorefrontResponseDto;
import com.vk.api.generated.messages.dto.MessagesAudioMessageDto;
import com.vk.api.generated.messages.dto.MessagesEnumerateAppearancesResponseDto;
import com.vk.api.generated.orders.dto.OrdersConfirmSubscriptionResponseDto;
import com.vk.api.generated.video.dto.VideoStopStreamingResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xsna.by1;
import xsna.ihz;
import xsna.lfe;
import xsna.pst;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v11 implements f03, b03, lfe.a, ihz.a, ValueValidator, ListValidator, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;

    public /* synthetic */ v11(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, Map map) {
        return (map.hashCode() + i) * i2;
    }

    public static Integer b(int i, Integer num) {
        return Integer.valueOf(num.intValue() + i);
    }

    public static void c(String str, String str2, Map map, String str3, int i) {
        map.put(str, str2);
        map.put(str3, String.valueOf(i));
    }

    public static void d(Object[] objArr, int i, String str, IronLog ironLog) {
        ironLog.error(String.format(str, Arrays.copyOf(objArr, i)));
    }

    public static /* synthetic */ boolean f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, null)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        par0.a.getClass();
        par0.d(th);
        return ((th instanceof IOException) || ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1)) ? pst.c.a : pst.a.a;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, AudioPreviewSnippetDto.class).getType()).getType())).a();
            case 4:
                return (AuthValidatePhoneCheckResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, AuthValidatePhoneCheckResponseDto.class).getType())).a();
            case 19:
                return (MessagesEnumerateAppearancesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesEnumerateAppearancesResponseDto.class).getType())).a();
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
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, String.class).getType());
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 14:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, GiftsMessagesConversationCardConfigDto.class).getType()).getType());
            case 16:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetStorefrontResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesAudioMessageDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Object.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OrdersConfirmSubscriptionResponseDto.class).getType());
            case 23:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 27:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoStopStreamingResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        by1 by1Var = (by1) obj;
        by1Var.getClass();
        by1Var.Y();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 11:
                return ParsingValidatorsKt.doesMatch((String) obj, "^(?!/)(.+)(?<!/)$");
            default:
                return ((Long) obj).longValue() >= 0;
        }
    }

    public /* synthetic */ v11(by1.a aVar, boolean z) {
        this.b = 9;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 2;
    }
}
