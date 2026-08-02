package xsna;

import android.os.Parcel;
import com.vk.api.generated.audio.dto.AudioGetPlaylistsResponseDto;
import com.vk.api.generated.auth.dto.AuthCheckValidationStatusResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetRecommendedTipsListResponseDto;
import com.vk.api.generated.market.dto.MarketGetResponseDto;
import com.vk.api.generated.messages.dto.MessagesSendResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoFeedGetResponseDto;
import com.vk.api.generated.tags.dto.TagsGetListResponseDto;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.vk.voip.dto.call_member.CallMemberId;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.by1;
import xsna.co8;
import xsna.ihz;
import xsna.jza0;
import xsna.ogb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class pm0 implements io.reactivex.rxjava3.functions.l, b03, f03, co8.c, io.reactivex.rxjava3.functions.m, ihz.a, ListValidator, ValueValidator, h9l {
    public final /* synthetic */ int b;

    public /* synthetic */ pm0(int i) {
        this.b = i;
    }

    public static float a(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }

    public static int b(Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(Integer.valueOf(parcel.readInt()));
        return i + i2;
    }

    public static int c(AdapterEntryType adapterEntryType, int i, int i2) {
        return (adapterEntryType.hashCode() + i) * i2;
    }

    public static String d(char c, long j, StringBuilder sb) {
        sb.append((Object) l5g.j(j));
        sb.append(c);
        return sb.toString();
    }

    public static KotlinNothingValueException f(String str) {
        uzw.c(str);
        return new KotlinNothingValueException();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                int i = ym0.k1;
                return Boolean.FALSE;
            case 3:
                return ((ogb.a) obj).a;
            case 19:
                return af10.a((TagsGetListResponseDto) obj);
            default:
                return Boolean.FALSE;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 8:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 15:
                return (EcosystemSendOtpResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, EcosystemSendOtpResponseDto.class).getType())).a();
            case 17:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 20:
                return (MarketGetResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetResponseDto.class).getType())).a();
            case 21:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 22:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 24:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioGetPlaylistsResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthCheckValidationStatusResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetRecommendedTipsListResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesSendResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosPhotoFeedGetResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.b) {
            case 13:
                if (((Double) obj).doubleValue() >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                }
                break;
            default:
                if (((Long) obj).longValue() > 0) {
                }
                break;
        }
        return false;
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new hi1();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        Set<CallMemberId> set;
        dhw0 L = com.vk.voip.ui.c.b.L();
        return ((L == null || (set = L.h) == null) ? 0 : set.size()) < 1000;
    }

    public /* synthetic */ pm0(by1.a aVar, jza0.a aVar2) {
        this.b = 11;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
