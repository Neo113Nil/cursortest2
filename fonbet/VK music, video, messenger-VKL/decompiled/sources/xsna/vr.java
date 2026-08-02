package xsna;

import android.view.ViewGroup;
import androidx.preference.Preference;
import com.vk.api.generated.account.dto.AccountGetUserObjectDto;
import com.vk.api.generated.apps.dto.AppsGetTrackBridgeCallHandlersResponseDto;
import com.vk.api.generated.apps.dto.AppsMemberAllowedScopeItemDto;
import com.vk.api.generated.audio.dto.AudioSearchResponseDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksBoolResponseDto;
import com.vk.api.generated.auth.dto.AuthValidateEmailResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetListsResponseDto;
import com.vk.api.generated.market.dto.MarketGetCountersResponseDto;
import com.vk.api.generated.market.dto.MarketGetItemReviewResponseDto;
import com.vk.api.generated.messages.dto.MessagesSearchConversationMembersResponseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGenericResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignSettingResponseDto;
import com.vk.api.generated.orders.dto.OrdersSubscriptionDto;
import com.vk.api.generated.photos.dto.PhotosGetAlbumsResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.MaxCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import io.appmetrica.analytics.impl.Go;
import io.appmetrica.analytics.impl.Jo;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.List;
import org.json.JSONObject;
import xsna.by1;
import xsna.ihz;
import xsna.ttf;
import xsna.uel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vr implements f03, b03, io.reactivex.rxjava3.functions.l, Preference.b, ihz.a, uel.a.InterfaceC3800a, ValueValidator, HeightCalculatorFactory, Jo {
    public final /* synthetic */ int b;

    public /* synthetic */ vr(int i) {
        this.b = i;
    }

    public static String b(Class cls, String str) {
        return str + cls;
    }

    public static void c(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void d(sin0 sin0Var, String str, String str2, String str3, String str4) {
        sin0Var.execSQL(str);
        sin0Var.execSQL(str2);
        sin0Var.execSQL(str3);
        sin0Var.execSQL(str4);
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        com.vkontakte.android.data.b.h().o = ((Boolean) obj).booleanValue();
        return true;
    }

    @Override // io.appmetrica.analytics.impl.Jo
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        return Go.a(jSONObject, jSONObject2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 8:
                return ttf.k.a.b;
            default:
                return ((FriendsGetListsResponseDto) obj).d();
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AppsGetTrackBridgeCallHandlersResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsGetTrackBridgeCallHandlersResponseDto.class).getType())).a();
            case 2:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, AppsMemberAllowedScopeItemDto.class).getType()).getType())).a();
            case 3:
                return (AudioBooksBoolResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, AudioBooksBoolResponseDto.class).getType())).a();
            case 5:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 6:
                return (AuthValidateEmailResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthValidateEmailResponseDto.class).getType())).a();
            case 14:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 18:
                return (MarketGetCountersResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketGetCountersResponseDto.class).getType())).a();
            case 21:
                return (MessagesSearchConversationMembersResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesSearchConversationMembersResponseDto.class).getType())).a();
            case 26:
                return (PhotosGetAlbumsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, PhotosGetAlbumsResponseDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, AccountGetUserObjectDto.class).getType()).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioSearchResponseDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 19:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetItemReviewResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 23:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NewsfeedGenericResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, NotificationsEditRedesignSettingResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, OrdersSubscriptionDto.class).getType());
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
    public ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        return new MaxCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    public /* synthetic */ vr(by1.a aVar, g8l g8lVar) {
        this.b = 10;
    }

    @Override // xsna.uel.a.InterfaceC3800a
    public Constructor a() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(pgq.class).getConstructor(null);
    }
}
