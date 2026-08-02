package xsna;

import android.location.Location;
import com.vk.api.generated.apps.dto.AppsGetTrackBridgeCallHandlersResponseDto;
import com.vk.api.generated.apps.dto.AppsNeedToShowActionPlaceIdDto;
import com.vk.api.generated.apps.dto.AppsStartCallResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.orders.dto.OrdersOrderDto;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.superapp.api.dto.app.AppLifecycleEvent;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.app.AutoBuyStatus;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import com.vk.superapp.api.internal.requests.app.ConfirmResult;
import com.vk.superapp.api.requests.app.WebAppsSearchType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import org.json.JSONObject;

/* compiled from: SuperappApi.kt */
/* loaded from: classes6.dex */
public interface zen0 {

    /* compiled from: SuperappApi.kt */
    public static final class a {
        public static /* synthetic */ io.reactivex.rxjava3.core.q a(zen0 zen0Var, long j, String str, AppsNeedToShowActionPlaceIdDto appsNeedToShowActionPlaceIdDto, int i) {
            if ((i & 8) != 0) {
                appsNeedToShowActionPlaceIdDto = null;
            }
            return zen0Var.t(j, str, null, appsNeedToShowActionPlaceIdDto);
        }

        public static /* synthetic */ io.reactivex.rxjava3.core.q b(zen0 zen0Var, long j, String str, List list, String str2, String str3, int i) {
            List list2;
            String str4;
            String str5;
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                list = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            if ((i & 16) != 0) {
                list2 = list;
                str4 = str2;
                str5 = null;
            } else {
                list2 = list;
                str4 = str2;
                str5 = str3;
            }
            return zen0Var.D(j, str, str4, str5, list2);
        }

        public static io.reactivex.rxjava3.core.q c(zen0 zen0Var, String str, int i, int i2) {
            Set singleton = Collections.singleton(WebAppsSearchType.TYPE_VK_APPS.h());
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return zen0Var.T(str, singleton, i, EmptySet.b);
        }

        public static /* synthetic */ io.reactivex.rxjava3.core.q d(zen0 zen0Var, String str, int i, int i2) {
            Set singleton = Collections.singleton(WebAppsSearchType.TYPE_VK_APPS.h());
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return zen0Var.c(i, str, singleton);
        }
    }

    io.reactivex.rxjava3.core.q<Boolean> A(long j, UserId userId, String str, String str2);

    io.reactivex.rxjava3.core.q<Boolean> B(long j, String str);

    io.reactivex.rxjava3.core.q<Boolean> C(long j, AppLifecycleEvent appLifecycleEvent, String str);

    io.reactivex.rxjava3.core.q D(long j, String str, String str2, String str3, List list);

    io.reactivex.rxjava3.core.q<List<AppsCategory>> E();

    io.reactivex.rxjava3.core.q F(String str, List list);

    io.reactivex.rxjava3.core.x<Boolean> G(long j, String str);

    io.reactivex.rxjava3.core.q<BaseBoolIntDto> H(long j, boolean z);

    io.reactivex.rxjava3.core.q<JSONObject> I(long j, long j2, String str, String str2);

    io.reactivex.rxjava3.core.x<pf3> J(long j, String str);

    io.reactivex.rxjava3.core.q<Boolean> K(long j);

    io.reactivex.rxjava3.core.q<Map<String, String>> L(long j, String str);

    io.reactivex.rxjava3.core.x<BaseBoolIntDto> M(long j, boolean z);

    io.reactivex.rxjava3.core.q<List<AppsGroupsContainer>> N(int i);

    io.reactivex.rxjava3.core.q<nak> O(long j, int i, Integer num);

    io.reactivex.rxjava3.core.q P(long j, UserId userId);

    io.reactivex.rxjava3.core.q<Boolean> Q(long j);

    io.reactivex.rxjava3.core.q R(String str, List list);

    io.reactivex.rxjava3.core.q S(long j, UserId userId, String str);

    io.reactivex.rxjava3.core.q T(String str, Collection collection, int i, Collection collection2);

    io.reactivex.rxjava3.core.q<AppsGetTrackBridgeCallHandlersResponseDto> U();

    io.reactivex.rxjava3.core.q V(int i, long j);

    io.reactivex.rxjava3.core.q<z53> W(long j, String str, Long l, Long l2);

    io.reactivex.rxjava3.core.q X(String str);

    io.reactivex.rxjava3.core.q<Map<String, Boolean>> Y(long j, List<String> list);

    io.reactivex.rxjava3.core.q a(int i, String str, String str2, long j);

    io.reactivex.rxjava3.core.x b(long j, Integer num, String str, String str2, String str3);

    io.reactivex.rxjava3.core.q c(int i, String str, Collection collection);

    io.reactivex.rxjava3.core.q d(long j, UserId userId, String str, String str2, String str3);

    io.reactivex.rxjava3.core.x<AppsStartCallResponseDto> e(long j);

    io.reactivex.rxjava3.core.q f(int i, int i2, long j);

    io.reactivex.rxjava3.core.q g(int i, long j, int i2, String str);

    io.reactivex.rxjava3.core.q<Boolean> h(long j, long j2, boolean z);

    io.reactivex.rxjava3.core.x<OrdersOrderDto.StatusDto> i(int i, long j);

    io.reactivex.rxjava3.core.q j(int i, long j);

    io.reactivex.rxjava3.core.q<Boolean> k(long j);

    io.reactivex.rxjava3.core.q<ke3> l(List<? extends AppFields> list);

    io.reactivex.rxjava3.core.x<AdvertisementConfig> m(String str);

    io.reactivex.rxjava3.core.q n(int i, long j);

    io.reactivex.rxjava3.core.q<ConfirmResult> o(long j, int i, String str, AutoBuyStatus autoBuyStatus, String str2);

    io.reactivex.rxjava3.core.q<x30> p(int i);

    io.reactivex.rxjava3.core.x<g16> q(long j);

    io.reactivex.rxjava3.core.q<Boolean> r(long j);

    io.reactivex.rxjava3.core.q s(Location location, String str, int i, Integer num, List list, String str2);

    io.reactivex.rxjava3.core.q<AddActionSuggestion> t(long j, String str, String str2, AppsNeedToShowActionPlaceIdDto appsNeedToShowActionPlaceIdDto);

    io.reactivex.rxjava3.core.q u(long j, String str, ArrayList arrayList);

    io.reactivex.rxjava3.core.q v();

    io.reactivex.rxjava3.core.q<nak> w(long j, String str, Integer num, String str2);

    io.reactivex.rxjava3.core.q<Boolean> x(long j);

    io.reactivex.rxjava3.core.q<Boolean> y(long j);

    io.reactivex.rxjava3.core.q<fhx0> z(long j, String str, Integer num, String str2);
}
