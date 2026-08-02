package io.reactivex.rxjava3.internal.operators.observable;

import com.vk.api.generated.account.dto.AccountSaveProfileInfoResponseDto;
import com.vk.api.generated.audio.dto.AudioMoosicPlaylistDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsCheckParticipantNameResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsDonutSettingsDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.database.dto.DatabaseCityByIdDto;
import com.vk.api.generated.docs.dto.DocsGetResponseDto;
import com.vk.api.generated.groups.dto.GroupsBidOrganizationLinkedDto;
import com.vk.api.generated.market.dto.MarketUpdateItemReviewResponseDto;
import com.vk.api.generated.masks.dto.MasksGetModelResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetRecommendedFoldersResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.pattern.entity.PatternMatchRaw;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.tensorflow.util.Predicate;
import xsna.b03;
import xsna.by1;
import xsna.f03;
import xsna.fjw0;
import xsna.h3x0;
import xsna.i6p;
import xsna.ihz;
import xsna.jj90;
import xsna.jwa0;
import xsna.ush;
import xsna.wwx;
import xsna.xtp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class n0 implements b03, jj90, f03, Predicate, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, ihz.a, i6p.a, ValueValidator, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;

    public /* synthetic */ n0(int i) {
        this.b = i;
    }

    public static float b(float f, float f2, float f3, float f4) {
        return ((f / f2) * f3) + f4;
    }

    public static ArrayList c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public static /* synthetic */ boolean d(AtomicReference atomicReference, io.reactivex.rxjava3.internal.queue.b bVar) {
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // ru.ok.tensorflow.util.Predicate, io.reactivex.rxjava3.functions.l
    public Boolean apply(Object obj) {
        Boolean lambda$process$1;
        lambda$process$1 = BodyPatternMatchingPipeline.lambda$process$1((PatternMatchRaw) obj);
        return lambda$process$1;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AccountSaveProfileInfoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountSaveProfileInfoResponseDto.class).getType())).a();
            case 4:
                return (BaseBoolIntDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 5:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 6:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, AudioMoosicPlaylistDto.class).getType()).getType())).a();
            case 9:
                return (CatalogCatalogResponseObjectDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 14:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, DatabaseCityByIdDto.class).getType()).getType())).a();
            case 24:
                return (GroupsBidOrganizationLinkedDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, GroupsBidOrganizationLinkedDto.class).getType())).a();
            case 25:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 27:
                return (MasksGetModelResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MasksGetModelResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 8:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CallsCheckParticipantNameResponseDto.class).getType());
            case 12:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ChannelsDonutSettingsDto.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DocsGetResponseDto.class).getType());
            case 21:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 23:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 26:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketUpdateItemReviewResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetRecommendedFoldersResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Double d = (Double) obj;
        switch (this.b) {
            case 18:
                double doubleValue = d.doubleValue();
                if (doubleValue < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue > 1.0d) {
                }
                break;
            default:
                double doubleValue2 = d.doubleValue();
                if (doubleValue2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || doubleValue2 > 1.0d) {
                }
                break;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return (obj instanceof fjw0) || (obj instanceof h3x0);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return EmptyList.b;
    }

    public /* synthetic */ n0(by1.a aVar, jwa0 jwa0Var) {
        this.b = 15;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (ush.a) obj;
    }

    @Override // xsna.jj90
    public Object a(JSONObject jSONObject) {
        return jSONObject;
    }
}
