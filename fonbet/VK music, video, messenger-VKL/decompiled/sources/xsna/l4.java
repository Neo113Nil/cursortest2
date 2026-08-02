package xsna;

import androidx.preference.Preference;
import com.vk.api.generated.actionLinks.dto.ActionLinksSaveLinksResponseDto;
import com.vk.api.generated.apps.dto.AppsGetActionMenuAppsResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsPinMessagesResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemCardResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetAnonymCallTokenResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingRecordDto;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vkontakte.android.data.b;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import xsna.bg7;
import xsna.ihz;
import xsna.jza0;
import xsna.k840;
import xsna.l8x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l4 implements ScreenModeVideoStatMapper.a, f03, b03, VkSwitchItem.a, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, Preference.b, ListValidator, ValueValidator, gjp, ihz.b, l8x.a {
    public final /* synthetic */ int b;

    public /* synthetic */ l4(int i) {
        this.b = i;
    }

    public static String f(androidx.compose.runtime.a aVar, int i, Integer num, androidx.compose.runtime.a aVar2, int i2) {
        aVar.K(i);
        String N = d370.N(num.intValue(), i2, aVar2);
        aVar.j();
        return N;
    }

    public static String h(StringBuilder sb, Collection collection, char c) {
        sb.append(collection);
        sb.append(c);
        return sb.toString();
    }

    public static void i(Boolean bool, String str, String str2, String str3, StringBuilder sb) {
        sb.append(bool);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        k840.b.e.a = ((Boolean) obj).booleanValue();
        k840.a.d().x();
        return true;
    }

    @Override // xsna.ihz.b
    public void a(Object obj, vnr vnrVar) {
        ((jza0.b) obj).M();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 7:
                return bg7.c.a.c;
            case 10:
                return Collections.singletonList((List) obj);
            default:
                return ((Boolean) obj).booleanValue() ? wmi0.a.e("masks_catalog") : io.reactivex.rxjava3.core.q.T(new ArrayList());
        }
    }

    @Override // com.vk.core.view.components.switch.VkSwitchItem.a
    public void b(boolean z) {
        String str = z ? "share_to_feed_turn_on" : "share_to_feed_turn_off";
        b.d dVar = new b.d("change_avatar_screen_actions");
        dVar.b(str, "event_type");
        dVar.e();
    }

    @Override // xsna.l8x.a
    public te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var) {
        return new hjh0(ym5Var, n3y0Var);
    }

    @Override // com.vk.libvideo.tracker.ScreenModeVideoStatMapper.a
    public Object d(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        return com.vk.libvideo.tracker.a.a(unifiedStatScreenMode);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (ActionLinksSaveLinksResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ActionLinksSaveLinksResponseDto.class).getType())).a();
            case 11:
                return (ChannelsPinMessagesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ChannelsPinMessagesResponseDto.class).getType())).a();
            case 21:
                return Integer.valueOf(((Number) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, Integer.class).getType())).a()).intValue());
            case 23:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 26:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 27:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, PhotosPhotoDto.class).getType()).getType())).a();
            default:
                return (ServiceBookingRecordDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ServiceBookingRecordDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGetActionMenuAppsResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 9:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 19:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, GroupsGetObjectExtendedResponseDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetItemCardResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetAnonymCallTokenResponseDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 15:
                if (l.longValue() >= 0) {
                }
                break;
            default:
                if (l.longValue() > 0) {
                }
                break;
        }
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return m99.m(obj);
    }

    public /* synthetic */ l4(Object obj, int i) {
        this.b = i;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }
}
