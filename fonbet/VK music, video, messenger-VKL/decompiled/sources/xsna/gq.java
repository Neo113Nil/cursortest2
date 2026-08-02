package xsna;

import android.view.MotionEvent;
import com.vk.api.generated.apps.dto.AppsMarkBadgeAsClickedResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemGetMaxSessionStatusResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetEventsResponseDto;
import com.vk.api.generated.identity.dto.IdentityAddressResponseDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsDto;
import com.vk.api.generated.market.dto.MarketGetAddressesResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetScheduledCallsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.tips.Tooltip;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import xsna.b900;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gq implements f03, b03, io.reactivex.rxjava3.functions.m, szs, io.reactivex.rxjava3.functions.l, ValueValidator, DivPreloader.Callback, ListValidator, Tooltip.c, b900.b, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ gq(int i) {
        this.b = i;
    }

    public static float a(MotionEvent motionEvent, float f) {
        return Math.abs(f - motionEvent.getY());
    }

    public static String b(int i, String str, String str2, String str3, String str4) {
        return str + i + str2 + str3 + str4;
    }

    public static String d(Integer num, String str) {
        return str + num;
    }

    public static String f(StringBuilder sb, WidgetBasePayload widgetBasePayload, char c) {
        sb.append(widgetBasePayload);
        sb.append(c);
        return sb.toString();
    }

    public static void h(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (ClipsPlaylist) obj2;
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        kpp kppVar = opp.T;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 7:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 19:
                return (GroupsGetEventsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, GroupsGetEventsResponseDto.class).getType())).a();
            case 21:
                return Integer.valueOf(((Number) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
            case 27:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            default:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType())).a();
        }
    }

    @Override // com.yandex.div.core.DivPreloader.Callback
    public void finish(boolean z) {
        DivPreloader.NO_CALLBACK$lambda$0(z);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsMarkBadgeAsClickedResponseDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 14:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EcosystemGetMaxSessionStatusResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, IdentityAddressResponseDto.class).getType());
            case 24:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketCheckoutSettingsDto.class).getType());
            case 25:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetAddressesResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetScheduledCallsResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return m99.m(obj);
    }

    @Override // xsna.szs
    public Object apply(Object obj) {
        switch (this.b) {
            case 9:
                return Integer.valueOf(((rkk) obj).r);
            case 10:
                return Boolean.TRUE;
            default:
                return klk.c;
        }
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
