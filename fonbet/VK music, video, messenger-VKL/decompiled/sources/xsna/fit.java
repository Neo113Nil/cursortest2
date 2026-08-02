package xsna;

import android.location.Location;
import android.net.Uri;
import android.webkit.URLUtil;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.generated.appWidgets.dto.AppWidgetsGetWidgetPreviewTypeDto;
import com.vk.api.generated.apps.dto.AppsAdsSlotsDto;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppFieldsDto;
import com.vk.api.generated.apps.dto.AppsCheckAllowedScopesScopesDto;
import com.vk.api.generated.apps.dto.AppsClearRecentsPlatformDto;
import com.vk.api.generated.apps.dto.AppsGetActionMenuAppsResponseDto;
import com.vk.api.generated.apps.dto.AppsGetEmbeddedUrlResponseDto;
import com.vk.api.generated.apps.dto.AppsGetFriendsListExtendedResponseDto;
import com.vk.api.generated.apps.dto.AppsGetLeaderboardByAppResponseDto;
import com.vk.api.generated.apps.dto.AppsGetResponseDto;
import com.vk.api.generated.apps.dto.AppsGetScopesResponseDto;
import com.vk.api.generated.apps.dto.AppsGetScopesTypeDto;
import com.vk.api.generated.apps.dto.AppsGetSecretHashResponseDto;
import com.vk.api.generated.apps.dto.AppsGetTrackBridgeCallHandlersResponseDto;
import com.vk.api.generated.apps.dto.AppsHintAppItemDto;
import com.vk.api.generated.apps.dto.AppsLeaderboardDto;
import com.vk.api.generated.apps.dto.AppsMemberAllowedScopeItemDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadListDto;
import com.vk.api.generated.apps.dto.AppsNeedToShowActionPlaceIdDto;
import com.vk.api.generated.apps.dto.AppsNeedToShowActionResponseDto;
import com.vk.api.generated.apps.dto.AppsScopeDto;
import com.vk.api.generated.apps.dto.AppsSearchFiltersDto;
import com.vk.api.generated.apps.dto.AppsSetActionShownActionTypeDto;
import com.vk.api.generated.apps.dto.AppsSetActionShownShowTypeDto;
import com.vk.api.generated.apps.dto.AppsStartCallResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.orders.dto.OrdersAppOrderItemDto;
import com.vk.api.generated.orders.dto.OrdersAppSubscriptionItemDto;
import com.vk.api.generated.orders.dto.OrdersConfirmOrderAutoBuyCheckedDto;
import com.vk.api.generated.orders.dto.OrdersConfirmSubscriptionResponseDto;
import com.vk.api.generated.orders.dto.OrdersOrderDto;
import com.vk.api.generated.orders.dto.OrdersSubscriptionDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.superapp.api.dto.app.AppLifecycleEvent;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.app.AutoBuyStatus;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vk.superapp.api.dto.app.Status;
import com.vk.superapp.api.dto.app.WebGameLeaderboard;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import com.vk.superapp.api.internal.requests.app.ConfirmResult;
import com.vk.superapp.api.internal.requests.app.OrdersCancelUserSubscriptionResult;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.q73;
import xsna.uxm0;
import xsna.vf3;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class fit implements zen0 {
    public final bpn0 a = new bpn0(new ee4(14));
    public final bpn0 b = new bpn0(new af0(16));

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AutoBuyStatus.values().length];
            try {
                iArr[AutoBuyStatus.CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutoBuyStatus.UNCHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AutoBuyStatus.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AutoBuyStatus.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppLifecycleEvent.values().length];
            try {
                iArr2[AppLifecycleEvent.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AppLifecycleEvent.ON_CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<AppsNeedToShowActionResponseDto, AddActionSuggestion> {
        @Override // xsna.izs
        public final AddActionSuggestion invoke(AppsNeedToShowActionResponseDto appsNeedToShowActionResponseDto) {
            AddActionSuggestion.Action action;
            AppsNeedToShowActionResponseDto appsNeedToShowActionResponseDto2 = appsNeedToShowActionResponseDto;
            q73 q73Var = (q73) this.receiver;
            q73Var.getClass();
            Boolean f = appsNeedToShowActionResponseDto2.f();
            boolean booleanValue = f != null ? f.booleanValue() : false;
            boolean z = appsNeedToShowActionResponseDto2.e() != null;
            long intValue = appsNeedToShowActionResponseDto2.e() != null ? r1.intValue() : 0L;
            AppsNeedToShowActionResponseDto.TypeDto i = appsNeedToShowActionResponseDto2.i();
            switch (i == null ? -1 : q73.a.$EnumSwitchMapping$5[i.ordinal()]) {
                case 1:
                    action = AddActionSuggestion.Action.RECOMMEND;
                    break;
                case 2:
                    action = AddActionSuggestion.Action.ADD_TO_MAIN_SCREEN;
                    break;
                case 3:
                    action = AddActionSuggestion.Action.RECOMMENDATION_FROM_NOTIFICATION;
                    break;
                case 4:
                    action = AddActionSuggestion.Action.NOTIFICATIONS_AUTO_PERMISSION;
                    break;
                case 5:
                    action = AddActionSuggestion.Action.PERSONAL_DISCOUNT;
                    break;
                case 6:
                    action = AddActionSuggestion.Action.NONE;
                    break;
                case 7:
                    action = AddActionSuggestion.Action.ADD_TO_COMMUNITY;
                    break;
                default:
                    action = AddActionSuggestion.Action.NONE;
                    break;
            }
            AddActionSuggestion.Action action2 = action;
            String j = appsNeedToShowActionResponseDto2.j();
            if (j == null) {
                j = "";
            }
            String str = j;
            UserId d = appsNeedToShowActionResponseDto2.d();
            ArrayList arrayList = null;
            Long valueOf = d != null ? Long.valueOf(d.b) : null;
            List<AppsAppDto> g = appsNeedToShowActionResponseDto2.g();
            if (g != null) {
                List<AppsAppDto> list = g;
                ykg ykgVar = q73Var.a;
                arrayList = new ArrayList(c5g.u(list, 10));
                for (AppsAppDto appsAppDto : list) {
                    ykgVar.getClass();
                    arrayList.add(ykg.c(appsAppDto));
                }
            }
            return new AddActionSuggestion(booleanValue, z, intValue, action2, str, valueOf, arrayList);
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<BaseBoolIntDto, OrdersCancelUserSubscriptionResult> {
        @Override // xsna.izs
        public final OrdersCancelUserSubscriptionResult invoke(BaseBoolIntDto baseBoolIntDto) {
            ((q73) this.receiver).getClass();
            int i = q73.a.$EnumSwitchMapping$3[baseBoolIntDto.ordinal()];
            if (i == 1) {
                return OrdersCancelUserSubscriptionResult.SUCCESS;
            }
            if (i == 2) {
                return OrdersCancelUserSubscriptionResult.ERROR;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<OrdersConfirmSubscriptionResponseDto, uxm0> {
        @Override // xsna.izs
        public final uxm0 invoke(OrdersConfirmSubscriptionResponseDto ordersConfirmSubscriptionResponseDto) {
            ((q73) this.receiver).getClass();
            return new uxm0.a(ordersConfirmSubscriptionResponseDto.d());
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<BaseOkResponseDto, ConfirmResult> {
        @Override // xsna.izs
        public final ConfirmResult invoke(BaseOkResponseDto baseOkResponseDto) {
            ((q73) this.receiver).getClass();
            return q73.a.$EnumSwitchMapping$4[baseOkResponseDto.ordinal()] == 1 ? ConfirmResult.OK : ConfirmResult.FAILURE;
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<OrdersAppOrderItemDto, fhx0> {
        @Override // xsna.izs
        public final fhx0 invoke(OrdersAppOrderItemDto ordersAppOrderItemDto) {
            WebImage webImage;
            OrdersAppOrderItemDto ordersAppOrderItemDto2 = ordersAppOrderItemDto;
            q73 q73Var = (q73) this.receiver;
            q73Var.getClass();
            int j = ordersAppOrderItemDto2.j();
            Status.a aVar = Status.Companion;
            String i = ordersAppOrderItemDto2.l().i();
            aVar.getClass();
            Status status = i.equals(X3.i.r) ? Status.LOADED : Status.WAITING;
            String i2 = ordersAppOrderItemDto2.i();
            List<BaseImageDto> f = ordersAppOrderItemDto2.f();
            if (f != null) {
                q73Var.a.getClass();
                webImage = ykg.e(f);
            } else {
                webImage = new WebImage(EmptyList.b);
            }
            WebPhoto webPhoto = new WebPhoto(webImage);
            String g = ordersAppOrderItemDto2.g();
            Integer d = ordersAppOrderItemDto2.d();
            int intValue = d != null ? d.intValue() : 0;
            Integer k = ordersAppOrderItemDto2.k();
            int intValue2 = k != null ? k.intValue() : 0;
            Boolean p = ordersAppOrderItemDto2.p();
            boolean booleanValue = p != null ? p.booleanValue() : false;
            Boolean n = ordersAppOrderItemDto2.n();
            boolean booleanValue2 = n != null ? n.booleanValue() : false;
            Boolean o = ordersAppOrderItemDto2.o();
            return new fhx0(j, status, i2, webPhoto, g, intValue, intValue2, booleanValue, booleanValue2, o != null ? o.booleanValue() : false, ordersAppOrderItemDto2.e());
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<OrdersAppSubscriptionItemDto, nak> {
        @Override // xsna.izs
        public final nak invoke(OrdersAppSubscriptionItemDto ordersAppSubscriptionItemDto) {
            return ((q73) this.receiver).j(ordersAppSubscriptionItemDto);
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<OrdersSubscriptionDto, GameSubscription> {
        @Override // xsna.izs
        public final GameSubscription invoke(OrdersSubscriptionDto ordersSubscriptionDto) {
            OrdersSubscriptionDto ordersSubscriptionDto2;
            long j;
            long j2;
            OrdersSubscriptionDto ordersSubscriptionDto3 = ordersSubscriptionDto;
            ((q73) this.receiver).getClass();
            int id = ordersSubscriptionDto3.getId();
            String j3 = ordersSubscriptionDto3.j();
            String u = ordersSubscriptionDto3.u();
            int p = ordersSubscriptionDto3.p();
            int l = ordersSubscriptionDto3.l();
            long g = ordersSubscriptionDto3.g();
            long C = ordersSubscriptionDto3.C();
            long n = ordersSubscriptionDto3.n();
            String o = ordersSubscriptionDto3.o();
            if (o == null) {
                o = "";
            }
            String title = ordersSubscriptionDto3.getTitle();
            if (title == null) {
                title = "";
            }
            String e = ordersSubscriptionDto3.e();
            if (e == null) {
                e = "";
            }
            Integer i = ordersSubscriptionDto3.i();
            long j4 = 0;
            if (i != null) {
                ordersSubscriptionDto2 = ordersSubscriptionDto3;
                j = i.intValue();
            } else {
                ordersSubscriptionDto2 = ordersSubscriptionDto3;
                j = 0;
            }
            Integer B = ordersSubscriptionDto2.B();
            if (B != null) {
                j2 = j;
                j4 = B.intValue();
            } else {
                j2 = j;
            }
            Integer d = ordersSubscriptionDto2.d();
            int intValue = d != null ? d.intValue() : 0;
            String f = ordersSubscriptionDto2.f();
            boolean z = !(f == null || drm0.N(f));
            Boolean D = ordersSubscriptionDto2.D();
            return new GameSubscription(id, j3, u, p, l, g, C, n, o, title, e, j2, j4, intValue, z, D != null ? D.booleanValue() : false, ordersSubscriptionDto2.k() != null ? Long.valueOf(r0.intValue()) : null);
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<OrdersAppSubscriptionItemDto, nak> {
        @Override // xsna.izs
        public final nak invoke(OrdersAppSubscriptionItemDto ordersAppSubscriptionItemDto) {
            return ((q73) this.receiver).j(ordersAppSubscriptionItemDto);
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<AppsGetResponseDto, WebApiApplication> {
        @Override // xsna.izs
        public final WebApiApplication invoke(AppsGetResponseDto appsGetResponseDto) {
            return ((q73) this.receiver).p(appsGetResponseDto);
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements izs<AppsGetActionMenuAppsResponseDto, x30> {
        @Override // xsna.izs
        public final x30 invoke(AppsGetActionMenuAppsResponseDto appsGetActionMenuAppsResponseDto) {
            AppsGetActionMenuAppsResponseDto appsGetActionMenuAppsResponseDto2 = appsGetActionMenuAppsResponseDto;
            q73 q73Var = (q73) this.receiver;
            q73Var.getClass();
            String title = appsGetActionMenuAppsResponseDto2.getTitle();
            List<AppsHintAppItemDto> d = appsGetActionMenuAppsResponseDto2.d();
            ArrayList arrayList = new ArrayList(c5g.u(d, 10));
            for (AppsHintAppItemDto appsHintAppItemDto : d) {
                ykg ykgVar = q73Var.a;
                AppsAppDto d2 = appsHintAppItemDto.d();
                ykgVar.getClass();
                arrayList.add(ykg.c(d2));
            }
            return new x30(title, arrayList);
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements izs<AppsAdsSlotsDto, AdvertisementConfig> {
        @Override // xsna.izs
        public final AdvertisementConfig invoke(AppsAdsSlotsDto appsAdsSlotsDto) {
            ((c41) this.receiver).getClass();
            return c41.a(appsAdsSlotsDto);
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements izs<List<? extends AppsMemberAllowedScopeItemDto>, Map<String, ? extends Boolean>> {
        @Override // xsna.izs
        public final Map<String, ? extends Boolean> invoke(List<? extends AppsMemberAllowedScopeItemDto> list) {
            ((q73) this.receiver).getClass();
            List<? extends AppsMemberAllowedScopeItemDto> list2 = list;
            int e = on00.e(c5g.u(list2, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (AppsMemberAllowedScopeItemDto appsMemberAllowedScopeItemDto : list2) {
                Pair pair = new Pair(appsMemberAllowedScopeItemDto.e(), Boolean.valueOf(appsMemberAllowedScopeItemDto.d()));
                linkedHashMap.put(pair.i(), pair.j());
            }
            return linkedHashMap;
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements izs<AppsMiniappsCatalogDto, ke3> {
        @Override // xsna.izs
        public final ke3 invoke(AppsMiniappsCatalogDto appsMiniappsCatalogDto) {
            return ((q73) this.receiver).d(appsMiniappsCatalogDto);
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements izs<AppsGetScopesResponseDto, Map<String, ? extends String>> {
        @Override // xsna.izs
        public final Map<String, ? extends String> invoke(AppsGetScopesResponseDto appsGetScopesResponseDto) {
            ((q73) this.receiver).getClass();
            List<AppsScopeDto> d = appsGetScopesResponseDto.d();
            int e = on00.e(c5g.u(d, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (AppsScopeDto appsScopeDto : d) {
                String i = appsScopeDto.d().i();
                String title = appsScopeDto.getTitle();
                if (title == null) {
                    title = "";
                }
                Pair pair = new Pair(i, title);
                linkedHashMap.put(pair.i(), pair.j());
            }
            return linkedHashMap;
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements izs<AppsGetEmbeddedUrlResponseDto, nex0> {
        @Override // xsna.izs
        public final nex0 invoke(AppsGetEmbeddedUrlResponseDto appsGetEmbeddedUrlResponseDto) {
            AppsGetEmbeddedUrlResponseDto appsGetEmbeddedUrlResponseDto2 = appsGetEmbeddedUrlResponseDto;
            ((q73) this.receiver).getClass();
            return new nex0(appsGetEmbeddedUrlResponseDto2.e(), appsGetEmbeddedUrlResponseDto2.d());
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class q extends FunctionReferenceImpl implements izs<AppsGetFriendsListExtendedResponseDto, List<? extends WebUserShortInfo>> {
        @Override // xsna.izs
        public final List<? extends WebUserShortInfo> invoke(AppsGetFriendsListExtendedResponseDto appsGetFriendsListExtendedResponseDto) {
            WebImage webImage;
            ((q73) this.receiver).getClass();
            List<UsersUserFullDto> d = appsGetFriendsListExtendedResponseDto.d();
            ArrayList arrayList = new ArrayList(c5g.u(d, 10));
            for (UsersUserFullDto usersUserFullDto : d) {
                UserId s1 = usersUserFullDto.s1();
                String D0 = usersUserFullDto.D0();
                if (D0 == null) {
                    D0 = "";
                }
                String x1 = usersUserFullDto.x1();
                if (x1 == null) {
                    x1 = "";
                }
                boolean z = usersUserFullDto.L2() == BaseSexDto.FEMALE;
                Boolean T2 = usersUserFullDto.T2();
                boolean booleanValue = T2 != null ? T2.booleanValue() : false;
                Boolean l = usersUserFullDto.l();
                boolean booleanValue2 = l != null ? l.booleanValue() : false;
                String r2 = usersUserFullDto.r2();
                if (r2 != null) {
                    WebImage.CREATOR.getClass();
                    webImage = WebImage.a.c(r2);
                } else {
                    String o2 = usersUserFullDto.o2();
                    WebImageSize webImageSize = new WebImageSize(o2 == null ? "" : o2, 50, 50, (char) 0, false, null, 56, null);
                    String X1 = usersUserFullDto.X1();
                    WebImageSize webImageSize2 = new WebImageSize(X1 == null ? "" : X1, 100, 100, (char) 0, false, null, 56, null);
                    String i2 = usersUserFullDto.i2();
                    webImage = new WebImage((List<WebImageSize>) e43.l(webImageSize, webImageSize2, new WebImageSize(i2 == null ? "" : i2, 200, 200, (char) 0, false, null, 56, null)));
                }
                arrayList.add(new WebUserShortInfo(s1, D0, x1, z, booleanValue, booleanValue2, webImage, null));
            }
            return arrayList;
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class r extends FunctionReferenceImpl implements izs<AppsGetLeaderboardByAppResponseDto, List<? extends WebGameLeaderboard>> {
        @Override // xsna.izs
        public final List<? extends WebGameLeaderboard> invoke(AppsGetLeaderboardByAppResponseDto appsGetLeaderboardByAppResponseDto) {
            String str;
            String str2;
            boolean z;
            WebImage webImage;
            AppsGetLeaderboardByAppResponseDto appsGetLeaderboardByAppResponseDto2 = appsGetLeaderboardByAppResponseDto;
            ((q73) this.receiver).getClass();
            ArrayList X0 = j5g.X0(appsGetLeaderboardByAppResponseDto2.e(), appsGetLeaderboardByAppResponseDto2.d());
            ArrayList arrayList = new ArrayList(c5g.u(X0, 10));
            Iterator it = X0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                UsersUserDto usersUserDto = (UsersUserDto) pair.i();
                AppsLeaderboardDto appsLeaderboardDto = (AppsLeaderboardDto) pair.j();
                UserId j = usersUserDto.j();
                String f = usersUserDto.f();
                if (f == null) {
                    f = "";
                }
                String k = usersUserDto.k();
                if (k == null) {
                    k = "";
                }
                if (usersUserDto.C() == BaseSexDto.FEMALE) {
                    str = "";
                    str2 = k;
                    z = true;
                } else {
                    str = "";
                    str2 = k;
                    z = false;
                }
                Boolean G = usersUserDto.G();
                boolean booleanValue = G != null ? G.booleanValue() : false;
                Boolean d = usersUserDto.d();
                boolean booleanValue2 = d != null ? d.booleanValue() : false;
                String u = usersUserDto.u();
                if (u != null) {
                    WebImage.CREATOR.getClass();
                    webImage = WebImage.a.c(u);
                } else {
                    String p = usersUserDto.p();
                    WebImageSize webImageSize = new WebImageSize(p == null ? str : p, 50, 50, (char) 0, false, null, 56, null);
                    String o = usersUserDto.o();
                    webImage = new WebImage((List<WebImageSize>) e43.l(webImageSize, new WebImageSize(o == null ? str : o, 100, 100, (char) 0, false, null, 56, null)));
                }
                WebUserShortInfo webUserShortInfo = new WebUserShortInfo(j, f, str2, z, booleanValue, booleanValue2, webImage, null);
                UserId j2 = usersUserDto.j();
                Integer e = appsLeaderboardDto.e();
                arrayList.add(new WebGameLeaderboard(webUserShortInfo, j2, (e == null && (e = appsLeaderboardDto.d()) == null && (e = appsLeaderboardDto.f()) == null) ? 0 : e.intValue(), 0, (appsLeaderboardDto.e() == null && appsLeaderboardDto.f() == null) ? false : true, 8, null));
            }
            return arrayList;
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class s extends FunctionReferenceImpl implements izs<JSONObject, z53> {
        @Override // xsna.izs
        public final z53 invoke(JSONObject jSONObject) {
            ((q73) this.receiver).getClass();
            return new z53(jSONObject);
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class t extends FunctionReferenceImpl implements izs<AppsMiniappsCatalogItemPayloadListDto, List<? extends AppsCategory>> {
        @Override // xsna.izs
        public final List<? extends AppsCategory> invoke(AppsMiniappsCatalogItemPayloadListDto appsMiniappsCatalogItemPayloadListDto) {
            return ((q73) this.receiver).f(appsMiniappsCatalogItemPayloadListDto);
        }
    }

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class u extends FunctionReferenceImpl implements izs<AppsGetSecretHashResponseDto, pf3> {
        @Override // xsna.izs
        public final pf3 invoke(AppsGetSecretHashResponseDto appsGetSecretHashResponseDto) {
            AppsGetSecretHashResponseDto appsGetSecretHashResponseDto2 = appsGetSecretHashResponseDto;
            ((q73) this.receiver).getClass();
            return new pf3(appsGetSecretHashResponseDto2.g(), appsGetSecretHashResponseDto2.f(), appsGetSecretHashResponseDto2.e(), appsGetSecretHashResponseDto2.d());
        }
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> A(long j2, UserId userId, String str, String str2) {
        ufx ufxVar = new ufx("apps.sendRequest", new sq(2), new tq(3));
        ufx.m(ufxVar, "user_id", userId, 1L, 8);
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        if (str != null) {
            ufx.n(ufxVar, "text", str, 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "key", str2, 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new qa(new com.vk.movika.sdk.base.utils.b(27), 22));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> B(long j2, String str) {
        ufx ufxVar = new ufx("apps.uploadAttachedLinkWallPost", new com.vk.movika.sdk.android.defaultplayer.interactive.c(2), new bt(2));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 12);
        ufx.n(ufxVar, "attachments", str, 0, 12);
        return rdx0.u(e370.e(ufxVar)).U(new com.vk.movika.sdk.base.hooks.k(new sd4(23), 26));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> C(long j2, AppLifecycleEvent appLifecycleEvent, String str) {
        AppsSetActionShownShowTypeDto appsSetActionShownShowTypeDto;
        AppsSetActionShownActionTypeDto appsSetActionShownActionTypeDto = AppsSetActionShownActionTypeDto.ADD_TO_MAIN_SCREEN;
        if (!epx.f(str, appsSetActionShownActionTypeDto.i())) {
            appsSetActionShownActionTypeDto = AppsSetActionShownActionTypeDto.RECOMMEND;
            if (!epx.f(str, appsSetActionShownActionTypeDto.i())) {
                appsSetActionShownActionTypeDto = AppsSetActionShownActionTypeDto.RECOMMENDATION_NOTIFICATION;
                if (!epx.f(str, appsSetActionShownActionTypeDto.i())) {
                    appsSetActionShownActionTypeDto = AppsSetActionShownActionTypeDto.NOTIFICATIONS_AUTO_PERMISSION;
                    if (!epx.f(str, appsSetActionShownActionTypeDto.i())) {
                        appsSetActionShownActionTypeDto = AppsSetActionShownActionTypeDto.ADD_TO_COMMUNITY;
                        if (!epx.f(str, appsSetActionShownActionTypeDto.i())) {
                            appsSetActionShownActionTypeDto = AppsSetActionShownActionTypeDto.PERSONAL_DISCOUNT;
                            if (!epx.f(str, appsSetActionShownActionTypeDto.i())) {
                                appsSetActionShownActionTypeDto = AppsSetActionShownActionTypeDto.PERSONAL_DISCOUNT_CASHBACK;
                                if (!epx.f(str, appsSetActionShownActionTypeDto.i())) {
                                    appsSetActionShownActionTypeDto = null;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (appsSetActionShownActionTypeDto == null) {
            return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
        }
        int i2 = (int) j2;
        int i3 = a.$EnumSwitchMapping$1[appLifecycleEvent.ordinal()];
        if (i3 == 1) {
            appsSetActionShownShowTypeDto = AppsSetActionShownShowTypeDto.ON_START;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            appsSetActionShownShowTypeDto = AppsSetActionShownShowTypeDto.ON_CLOSE;
        }
        ufx ufxVar = new ufx("apps.setActionShown", new jr(2), new kr(3));
        ufx.k(ufxVar, "app_id", i2, 0, 8);
        ufx.n(ufxVar, "action_type", appsSetActionShownActionTypeDto.i(), 0, 12);
        ufx.n(ufxVar, CampaignEx.KEY_SHOW_TYPE, appsSetActionShownShowTypeDto.i(), 0, 12);
        return rdx0.u(e370.e(ufxVar)).U(new np1(new c4r(4), 18));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q D(long j2, String str, String str2, String str3, List list) {
        Z().getClass();
        ArrayList b2 = q73.b(list);
        Integer valueOf = Integer.valueOf((int) j2);
        if ((52730 & 4) != 0) {
            str2 = null;
        }
        if ((52730 & 512) != 0) {
            str = null;
        }
        if ((52730 & 4096) != 0) {
            str3 = null;
        }
        if ((52730 & 8192) != 0) {
            b2 = null;
        }
        return rdx0.u(e370.e(vf3.a.b(str2, str, valueOf, str3, b2))).U(new tp1(new j(1, Z(), q73.class, "mapToWebApiApplication", "mapToWebApiApplication(Lcom/vk/api/generated/apps/dto/AppsGetResponseDto;)Lcom/vk/external/miniapp/net/app/WebApiApplication;", 0), 13));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<List<AppsCategory>> E() {
        return rdx0.u(e370.e(new ufx("apps.getMiniAppCategories", new io.reactivex.rxjava3.subjects.c(3), new as(1)))).U(new ca6(new t(1, Z(), q73.class, "mapToAppsCategoryList", "mapToAppsCategoryList(Lcom/vk/api/generated/apps/dto/AppsMiniappsCatalogItemPayloadListDto;)Ljava/util/List;", 0), 19));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q F(String str, List list) {
        Z().getClass();
        return rdx0.u(e370.e(vf3.a.k(str, null, null, q73.b(list)))).U(new ed(new n8(1, Z(), q73.class, "mapToAppsSectionList", "mapToAppsSectionList(Ljava/util/List;)Ljava/util/List;", 0, 6), 18));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<Boolean> G(long j2, String str) {
        ufx ufxVar = new ufx("apps.setGameIsInstalled", new pr(2), new qr(3));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        if (str != null) {
            ufx.n(ufxVar, "track_code", str, 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new oyr(new d0k(9), 1));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<BaseBoolIntDto> H(long j2, boolean z) {
        ufx ufxVar = new ufx("apps.changeAppBadgeStatus", new ct(2), new dt(3));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 12);
        ufxVar.i("is_badge_allowed", z);
        return rdx0.u(e370.e(ufxVar));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<JSONObject> I(long j2, long j3, String str, String str2) {
        AppWidgetsGetWidgetPreviewTypeDto appWidgetsGetWidgetPreviewTypeDto;
        UserId userId = new UserId(j2);
        int i2 = (int) j3;
        AppWidgetsGetWidgetPreviewTypeDto[] values = AppWidgetsGetWidgetPreviewTypeDto.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                appWidgetsGetWidgetPreviewTypeDto = null;
                break;
            }
            appWidgetsGetWidgetPreviewTypeDto = values[i3];
            if (epx.f(appWidgetsGetWidgetPreviewTypeDto.i(), str2)) {
                break;
            }
            i3++;
        }
        if (appWidgetsGetWidgetPreviewTypeDto == null) {
            appWidgetsGetWidgetPreviewTypeDto = AppWidgetsGetWidgetPreviewTypeDto.COMPACT_LIST;
        }
        ufx ufxVar = new ufx("appWidgets.getWidgetPreview", new lq(3), new mq(2));
        ufx.m(ufxVar, "group_id", userId, 1L, 8);
        ufx.k(ufxVar, "app_id", i2, 0, 8);
        ufx.n(ufxVar, "code", str, 100000, 4);
        ufx.n(ufxVar, "type", appWidgetsGetWidgetPreviewTypeDto.i(), 0, 12);
        bx2 bx2Var = new bx2("5.285", new io.reactivex.rxjava3.internal.operators.observable.n0(2), ufxVar.b());
        bx2Var.i = ufxVar.c();
        bx2Var.j.putAll(ufxVar.getParamsMap());
        return rdx0.u(bx2Var);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<pf3> J(long j2, String str) {
        ufx ufxVar = new ufx("apps.getSecretHash", new en(4), new io.reactivex.rxjava3.internal.operators.observable.q1(3));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        if (str != null) {
            ufx.n(ufxVar, CommonUrlParts.REQUEST_ID, str, 5000, 4);
        }
        return rdx0.B(e370.e(ufxVar)).l(new e10(new u(1, Z(), q73.class, "mapToAppsSecretHash", "mapToAppsSecretHash(Lcom/vk/api/generated/apps/dto/AppsGetSecretHashResponseDto;)Lcom/vk/superapp/api/dto/app/AppsSecretHash;", 0), 29));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> K(long j2) {
        ufx ufxVar = new ufx("apps.removeFromMenu", new hr(3), new ir(2));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new q9(new cj1(26), 12));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Map<String, String>> L(long j2, String str) {
        AppsGetScopesTypeDto appsGetScopesTypeDto = AppsGetScopesTypeDto.USER;
        if (!str.equals(appsGetScopesTypeDto.i())) {
            appsGetScopesTypeDto = AppsGetScopesTypeDto.GROUP;
            if (!str.equals(appsGetScopesTypeDto.i())) {
                throw new IllegalArgumentException(zr.a("Unknown scope type (", str, ") in apps.getScopes"));
            }
        }
        ufx ufxVar = new ufx("apps.getScopes", new br(4), new cr(2));
        ufx.n(ufxVar, "type", appsGetScopesTypeDto.i(), 0, 12);
        ufx.k(ufxVar, "app_id", (int) j2, 1, 8);
        return rdx0.u(e370.e(ufxVar)).U(new nm3(new o(1, Z(), q73.class, "mapToScopesMap", "mapToScopesMap(Lcom/vk/api/generated/apps/dto/AppsGetScopesResponseDto;)Ljava/util/Map;", 0), 13));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<BaseBoolIntDto> M(long j2, boolean z) {
        ufx ufxVar = new ufx("apps.recommend", new uf3(0), new up(1));
        ufx.k(ufxVar, "app_id", (int) j2, 1, 8);
        ufxVar.i("is_recommended", z);
        return rdx0.B(e370.e(ufxVar));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<List<AppsGroupsContainer>> N(int i2) {
        io.reactivex.rxjava3.internal.operators.observable.l2 a2;
        ufx ufxVar = new ufx("apps.getGroupsList", new pn(2), new mr(1));
        ufx.k(ufxVar, "app_id", i2, 0, 8);
        a2 = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", e370.e(ufxVar), dgn0.c(), null, null);
        return a2.U(new rf1(new zos(1), 27));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<nak> O(long j2, int i2, Integer num) {
        ufx ufxVar = new ufx("orders.resumeSubscription", new io.reactivex.rxjava3.processors.b(26), new io.reactivex.rxjava3.subjects.b(29));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        ufx.k(ufxVar, "subscription_id", i2, 0, 8);
        if (num != null) {
            ufx.k(ufxVar, "order_id", num.intValue(), 0, 8);
        }
        return rdx0.u(e370.e(ufxVar)).U(new e8(new i(1, Z(), q73.class, "mapToCreateSubscriptionResult", "mapToCreateSubscriptionResult(Lcom/vk/api/generated/orders/dto/OrdersAppSubscriptionItemDto;)Lcom/vk/superapp/api/internal/requests/app/CreateSubscriptionResult;", 0), 19));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q P(long j2, UserId userId) {
        ufx ufxVar = new ufx("apps.checkInviteFriend", new yq(1), new io.reactivex.rxjava3.internal.operators.mixed.j(2));
        ufx.m(ufxVar, "user_id", userId, 0L, 8);
        ufx.k(ufxVar, "app_id", (int) j2, 1, 8);
        return rdx0.u(e370.e(ufxVar)).U(new jo3(new io3(19), 16));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> Q(long j2) {
        io.reactivex.rxjava3.internal.operators.observable.l2 a2;
        ufx ufxVar = new ufx("apps.checkAllowPosting", new tr(1), new ur(1));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 12);
        a2 = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", e370.e(ufxVar), dgn0.c(), null, null);
        return a2.U(new n7(new vt1(26), 25));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q R(String str, List list) {
        float f2 = (float) ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        Float valueOf = Float.valueOf(f2);
        Float valueOf2 = Float.valueOf(f2);
        Z().getClass();
        bx2 e2 = e370.e(vf3.a.k(str, valueOf, valueOf2, q73.b(list)));
        e2.d = true;
        return rdx0.u(e2).U(new rx0(new o8(1, Z(), q73.class, "mapToAppsSectionList", "mapToAppsSectionList(Ljava/util/List;)Ljava/util/List;", 0, 6), 24));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q S(long j2, UserId userId, String str) {
        ufx ufxVar = new ufx("apps.inviteFriend", new io.reactivex.rxjava3.internal.operators.observable.n0(4), new dr(2));
        ufx.m(ufxVar, "user_id", userId, 0L, 8);
        ufx.k(ufxVar, "app_id", (int) j2, 1, 8);
        if (str != null) {
            ufx.n(ufxVar, "request_key", str, 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new op0(new com.vk.movika.sdk.base.logic.interactor.f(27), 17));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q T(String str, Collection collection, int i2, Collection collection2) {
        AppsSearchFiltersDto appsSearchFiltersDto;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            AppsSearchFiltersDto[] values = AppsSearchFiltersDto.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    appsSearchFiltersDto = null;
                    break;
                }
                appsSearchFiltersDto = values[i3];
                if (epx.f(appsSearchFiltersDto.i(), str2)) {
                    break;
                }
                i3++;
            }
            if (appsSearchFiltersDto != null) {
                arrayList.add(appsSearchFiltersDto);
            }
        }
        return rdx0.u(e370.e(vf3.a.l(str, arrayList, Integer.valueOf(i2), 3))).U(new d22(new j37(1, Z(), q73.class, "mapToAppsSearchResponse", "mapToAppsSearchResponse(Lcom/vk/api/generated/apps/dto/AppsSearchResponseDto;)Lcom/vk/superapp/api/dto/app/AppsSearchResponse;", 0, 6), 18));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<AppsGetTrackBridgeCallHandlersResponseDto> U() {
        return rdx0.u(e370.e(new ufx("apps.getTrackBridgeCallHandlers", new vr(1), new s11(1))));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q V(int i2, long j2) {
        ufx ufxVar = new ufx("orders.cancelUserSubscription", new ky80(0), new xr(26));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        ufx.k(ufxVar, "subscription_id", i2, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new j7(new c(1, Z(), q73.class, "mapToCancelResult", "mapToCancelResult(Lcom/vk/api/generated/base/dto/BaseBoolIntDto;)Lcom/vk/superapp/api/internal/requests/app/OrdersCancelUserSubscriptionResult;", 0), 26));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<z53> W(long j2, String str, Long l2, Long l3) {
        int i2 = (int) j2;
        UserId userId = l2 != null ? new UserId(l2.longValue()) : null;
        UserId userId2 = l3 != null ? new UserId(l3.longValue()) : null;
        ufx ufxVar = new ufx("apps.getAppLaunchParams", new io.reactivex.rxjava3.processors.b(1), new io.reactivex.rxjava3.subjects.b(2));
        ufx.k(ufxVar, "mini_app_id", i2, 1, 8);
        ufx.n(ufxVar, "referer", str, 0, 12);
        if (userId != null) {
            ufx.m(ufxVar, "group_id", userId, 1L, 8);
        }
        if (userId2 != null) {
            ufx.m(ufxVar, "vk_profile_id", userId2, 1L, 8);
        }
        bx2 bx2Var = new bx2("5.285", new io.reactivex.rxjava3.internal.operators.observable.n0(2), ufxVar.b());
        bx2Var.i = ufxVar.c();
        bx2Var.j.putAll(ufxVar.getParamsMap());
        return rdx0.u(bx2Var).U(new t7(new e60(28), 15)).U(new bl(new s(1, Z(), q73.class, "mapToAppLaunchParams", "mapToAppLaunchParams(Lorg/json/JSONObject;)Lcom/vk/superapp/api/dto/app/AppLaunchParams;", 0), 22));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q X(String str) {
        String concat;
        String path;
        String group;
        if (wgx0.b.k().matcher(str).matches()) {
            Long n2 = arm0.n(str);
            return n2 != null ? wgx0.b(n2.longValue(), 0L, str) : wgx0.c(str, str);
        }
        if (URLUtil.isNetworkUrl(str)) {
            if (!brm0.B(str, "http", false) && !brm0.B(str, HttpRequest.DEFAULT_SCHEME, false)) {
                int K = drm0.K(0, 6, str, "://", false);
                concat = str.substring(0, K).toLowerCase(Locale.ROOT).concat(str.substring(K));
            }
            concat = str;
        } else {
            if (!brm0.B(str, "vkontakte://", true) && !brm0.B(str, "vk://", true)) {
                concat = "https://".concat(str);
            }
            concat = str;
        }
        Uri parse = Uri.parse(concat);
        m2v0.a.getClass();
        if (!m2v0.a(parse) || (path = parse.getPath()) == null || path.length() == 0) {
            return io.reactivex.rxjava3.core.q.H(new IllegalArgumentException("Wrong url for screen resolving: ".concat(str)));
        }
        String s0 = drm0.s0(parse.getPath(), '/');
        Matcher matcher = wgx0.a.k().matcher(s0);
        if (!matcher.matches()) {
            Matcher matcher2 = wgx0.c.k().matcher(s0);
            return (!matcher2.matches() || (group = matcher2.group(1)) == null) ? io.reactivex.rxjava3.core.q.H(new IllegalArgumentException(go9.b("Wrong url for screen resolving: ", concat))) : wgx0.c(group, concat);
        }
        String group2 = matcher.group(4);
        StringBuilder sb = new StringBuilder();
        sb.append(matcher.group(2));
        if (group2 != null && !drm0.N(group2)) {
            sb.append(BundleUtil.UNDERLINE_TAG);
            sb.append(group2);
        }
        return wgx0.c(sb.toString(), concat);
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Map<String, Boolean>> Y(long j2, List<String> list) {
        AppsCheckAllowedScopesScopesDto appsCheckAllowedScopesScopesDto;
        int i2 = (int) j2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            AppsCheckAllowedScopesScopesDto[] values = AppsCheckAllowedScopesScopesDto.values();
            int length = values.length;
            while (true) {
                if (i3 >= length) {
                    appsCheckAllowedScopesScopesDto = null;
                    break;
                }
                appsCheckAllowedScopesScopesDto = values[i3];
                if (epx.f(appsCheckAllowedScopesScopesDto.i(), str)) {
                    break;
                }
                i3++;
            }
            if (appsCheckAllowedScopesScopesDto != null) {
                arrayList.add(appsCheckAllowedScopesScopesDto);
            }
        }
        ufx ufxVar = new ufx("apps.checkAllowedScopes", new vr(2), new wr(2));
        ufx.k(ufxVar, "app_id", i2, 0, 8);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AppsCheckAllowedScopesScopesDto) it2.next()).i());
        }
        ufxVar.h(SharedKt.PARAM_SCOPES, arrayList2);
        return rdx0.u(e370.e(ufxVar)).U(new h7(new m(1, Z(), q73.class, "mapToAllowedScopesMap", "mapToAllowedScopesMap(Ljava/util/List;)Ljava/util/Map;", 0), 23));
    }

    public final q73 Z() {
        return (q73) this.a.getValue();
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q a(int i2, String str, String str2, long j2) {
        ufx ufxVar = new ufx("orders.confirmSubscription", new u11(29), new v11(22));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        ufx.k(ufxVar, "order_id", i2, 0, 8);
        ufx.n(ufxVar, "confirm_hash", str, 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, "track_code", str2, 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new mj1(new d(1, Z(), q73.class, "mapToSubscriptionConfirmResult", "mapToSubscriptionConfirmResult(Lcom/vk/api/generated/orders/dto/OrdersConfirmSubscriptionResponseDto;)Lcom/vk/superapp/api/internal/requests/app/SubscriptionConfirmResult;", 0), 20));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x b(long j2, Integer num, String str, String str2, String str3) {
        Z().getClass();
        ufx ufxVar = new ufx("apps.joinAndGet", new wr(1), new xr(1));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        if (num != null) {
            ufx.k(ufxVar, "need_settings", num.intValue(), 0, 8);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "url", str2, 0, 12);
        }
        if (str != null) {
            ufx.n(ufxVar, "ref", str, 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "track_code", str3, 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new y7(new p8(1, Z(), q73.class, "mapToWebApiApplication", "mapToWebApiApplication(Lcom/vk/api/generated/apps/dto/AppsJoinAndGetResponseDto;)Lcom/vk/external/miniapp/net/app/WebApiApplication;", 0, 4), 21));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q c(int i2, String str, Collection collection) {
        AppsSearchFiltersDto appsSearchFiltersDto;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            AppsSearchFiltersDto[] values = AppsSearchFiltersDto.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    appsSearchFiltersDto = null;
                    break;
                }
                appsSearchFiltersDto = values[i3];
                if (epx.f(appsSearchFiltersDto.i(), str2)) {
                    break;
                }
                i3++;
            }
            if (appsSearchFiltersDto != null) {
                arrayList.add(appsSearchFiltersDto);
            }
        }
        bx2 e2 = e370.e(vf3.a.l(str, arrayList, Integer.valueOf(i2), 3));
        e2.d = true;
        return rdx0.u(e2).U(new h8(new m8(1, Z(), q73.class, "mapToAppsSearchResponse", "mapToAppsSearchResponse(Lcom/vk/api/generated/apps/dto/AppsSearchResponseDto;)Lcom/vk/superapp/api/dto/app/AppsSearchResponse;", 0, 3), 18));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q d(long j2, UserId userId, String str, String str2, String str3) {
        int i2 = (int) j2;
        if ((32 & 16) != 0) {
            str3 = null;
        }
        return rdx0.u(e370.e(vf3.a.e(i2, userId, str, str2, str3))).U(new kb(new p(1, Z(), q73.class, "mapToWebAppEmbeddedUrl", "mapToWebAppEmbeddedUrl(Lcom/vk/api/generated/apps/dto/AppsGetEmbeddedUrlResponseDto;)Lcom/vk/superapp/api/dto/app/WebAppEmbeddedUrl;", 0), 27));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<AppsStartCallResponseDto> e(long j2) {
        ufx ufxVar = new ufx("apps.startCall", new w11(3), new at(2));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        return rdx0.B(e370.e(ufxVar));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q f(int i2, int i3, long j2) {
        boolean z = i2 == 1;
        int i4 = (int) j2;
        ufx ufxVar = new ufx("apps.getLeaderboardByApp", new jh(2), new qq(1));
        ufxVar.i("global", z);
        ufx.k(ufxVar, "user_result", i3, 0, 8);
        ufx.k(ufxVar, "app_id", i4, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new lh3(new r(1, Z(), q73.class, "mapToWebGameLeaderboardList", "mapToWebGameLeaderboardList(Lcom/vk/api/generated/apps/dto/AppsGetLeaderboardByAppResponseDto;)Ljava/util/List;", 0), 19));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q g(int i2, long j2, int i3, String str) {
        List singletonList = Collections.singletonList(UsersFieldsDto.PHOTO_BASE);
        ufx ufxVar = new ufx("apps.getFriendsList", new mr(2), new sn(4));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        ufxVar.i("extended", true);
        ufxVar.f(i3, 0, 5000, "count");
        ufx.k(ufxVar, SignalingProtocol.KEY_OFFSET, i2, 0, 8);
        List list = singletonList;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UsersFieldsDto) it.next()).i());
        }
        ufxVar.h("fields", arrayList);
        if (str != null) {
            ufx.n(ufxVar, "query", str, 256, 4);
        }
        return rdx0.u(e370.e(ufxVar)).U(new ai3(new q(1, Z(), q73.class, "mapToWebUserShortInfoList", "mapToWebUserShortInfoList(Lcom/vk/api/generated/apps/dto/AppsGetFriendsListExtendedResponseDto;)Ljava/util/List;", 0), 23));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> h(long j2, long j3, boolean z) {
        UserId userId = new UserId(j3);
        ufx ufxVar = new ufx("apps.addToGroup", new cr(1), new io.reactivex.rxjava3.internal.operators.observable.n0(3));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        ufx.m(ufxVar, "group_id", userId, 1L, 8);
        ufxVar.i("should_send_push", z);
        return rdx0.u(e370.e(ufxVar)).U(new com.vk.movika.sdk.base.ui.j(new fj1(27), 14));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<OrdersOrderDto.StatusDto> i(int i2, long j2) {
        ufx ufxVar = new ufx("orders.getById", new sf3(21), new s11(21));
        ufx.k(ufxVar, "order_id", i2, 0, 8);
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        return rdx0.B(e370.e(ufxVar)).l(new e4t(new eit(i2), 1));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q j(int i2, long j2) {
        io.reactivex.rxjava3.internal.operators.observable.l2 a2;
        ufx ufxVar = new ufx("orders.getUserSubscription", new ur(27), new vr(25));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        ufx.k(ufxVar, "subscription_id", i2, 0, 8);
        a2 = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", e370.e(ufxVar), dgn0.c(), null, null);
        return a2;
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> k(long j2) {
        ufx ufxVar = new ufx("apps.addToMenu", new defpackage.j0(6), new or(2));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new e05(new f57(25), 24));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<ke3> l(List<? extends AppFields> list) {
        ArrayList arrayList;
        Z().getClass();
        ArrayList b2 = q73.b(list);
        ufx ufxVar = new ufx("apps.getMiniAppsCatalogSearch", new gr(1), new dn(2));
        if (b2 != null) {
            arrayList = new ArrayList(c5g.u(b2, 10));
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AppsAppFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            ufxVar.h("app_fields", arrayList);
        }
        return rdx0.u(e370.e(ufxVar)).U(new tt0(new n(1, Z(), q73.class, "mapToAppsCatalogSectionsResponse", "mapToAppsCatalogSectionsResponse(Lcom/vk/api/generated/apps/dto/AppsMiniappsCatalogDto;)Lcom/vk/superapp/api/dto/app/catalog/AppsCatalogSectionsResponse;", 0), 22));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<AdvertisementConfig> m(String str) {
        ufx ufxVar = new ufx("apps.getAdvertisementConfig", new or(1), new pr(1));
        if (str != null) {
            ufx.n(ufxVar, "active_features", str, 128, 4);
        }
        return rdx0.B(e370.e(ufxVar)).l(new q7(new l(1, (c41) this.b.getValue(), c41.class, "mapToAdvertisementConfig", "mapToAdvertisementConfig(Lcom/vk/api/generated/apps/dto/AppsAdsSlotsDto;)Lcom/vk/external/miniapp/net/ad/AdvertisementConfig;", 0), 23));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q n(int i2, long j2) {
        ufx ufxVar = new ufx("orders.getUserSubscription", new ur(27), new vr(25));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        ufx.k(ufxVar, "subscription_id", i2, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new yi2(new h(1, Z(), q73.class, "mapToGameSubscription", "mapToGameSubscription(Lcom/vk/api/generated/orders/dto/OrdersSubscriptionDto;)Lcom/vk/superapp/api/dto/app/GameSubscription;", 0), 20));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<ConfirmResult> o(long j2, int i2, String str, AutoBuyStatus autoBuyStatus, String str2) {
        OrdersConfirmOrderAutoBuyCheckedDto ordersConfirmOrderAutoBuyCheckedDto;
        int i3 = a.$EnumSwitchMapping$0[autoBuyStatus.ordinal()];
        if (i3 == 1) {
            ordersConfirmOrderAutoBuyCheckedDto = OrdersConfirmOrderAutoBuyCheckedDto.CHECKED;
        } else if (i3 == 2) {
            ordersConfirmOrderAutoBuyCheckedDto = OrdersConfirmOrderAutoBuyCheckedDto.UNCHECKED;
        } else if (i3 == 3) {
            ordersConfirmOrderAutoBuyCheckedDto = OrdersConfirmOrderAutoBuyCheckedDto.DISABLED;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            ordersConfirmOrderAutoBuyCheckedDto = null;
        }
        ufx ufxVar = new ufx("orders.confirmOrder", new rf3(23), new r11(24));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        ufx.k(ufxVar, "order_id", i2, 0, 8);
        ufx.n(ufxVar, "confirm_hash", str, 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, "track_code", str2, 0, 12);
        }
        if (ordersConfirmOrderAutoBuyCheckedDto != null) {
            ufx.n(ufxVar, "auto_buy_checked", ordersConfirmOrderAutoBuyCheckedDto.i(), 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new ft0(new e(1, Z(), q73.class, "mapToConfirmResult", "mapToConfirmResult(Lcom/vk/api/generated/base/dto/BaseOkResponseDto;)Lcom/vk/superapp/api/internal/requests/app/ConfirmResult;", 0), 28));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<x30> p(int i2) {
        ufx ufxVar = new ufx("apps.getActionMenuApps", new mq(4), new l4(3));
        ufx.k(ufxVar, "app_id", i2, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new xl0(new k(1, Z(), q73.class, "mapToActionMenuApps", "mapToActionMenuApps(Lcom/vk/api/generated/apps/dto/AppsGetActionMenuAppsResponseDto;)Lcom/vk/superapp/api/dto/app/ActionMenuApps;", 0), 22));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.x<g16> q(long j2) {
        ufx ufxVar = new ufx("apps.getActionMenuBanner", new ar(1), new br(3));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        return rdx0.B(e370.e(ufxVar)).l(new bk1(new nk(23), 18));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> r(long j2) {
        ufx ufxVar = new ufx("apps.remove", new eq0(1), new k73(1));
        ufx.k(ufxVar, "id", (int) j2, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new w7(new i0r(2), 22));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q s(Location location, String str, int i2, Integer num, List list, String str2) {
        ArrayList arrayList = null;
        Float valueOf = location != null ? Float.valueOf((float) location.getLatitude()) : null;
        Float valueOf2 = location != null ? Float.valueOf((float) location.getLongitude()) : null;
        List b0 = str != null ? drm0.b0(str, new char[]{','}, 0, 6) : null;
        Z().getClass();
        ArrayList b2 = q73.b(list);
        ufx ufxVar = new ufx("apps.getMiniAppsCatalog", new r11(1), new sf3(0));
        ufx.k(ufxVar, SignalingProtocol.KEY_LIMIT, i2, 0, 8);
        if (num != null) {
            ufx.k(ufxVar, "last_seen_section_id", num.intValue(), 0, 8);
        }
        if (valueOf != null) {
            ufx.j(ufxVar, "latitude", valueOf.floatValue());
        }
        if (valueOf2 != null) {
            ufx.j(ufxVar, "longitude", valueOf2.floatValue());
        }
        if (b0 != null) {
            ufxVar.h("active_features", b0);
        }
        if (b2 != null) {
            arrayList = new ArrayList(c5g.u(b2, 10));
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AppsAppFieldsDto) it.next()).i());
            }
        }
        if (arrayList != null) {
            ufxVar.h("app_fields", arrayList);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "section_id", str2, 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new c8(new i37(1, Z(), q73.class, "mapToAppsCatalogSectionsResponse", "mapToAppsCatalogSectionsResponse(Lcom/vk/api/generated/apps/dto/AppsMiniappsCatalogDto;)Lcom/vk/superapp/api/dto/app/catalog/AppsCatalogSectionsResponse;", 0, 8), 15));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<AddActionSuggestion> t(long j2, String str, String str2, AppsNeedToShowActionPlaceIdDto appsNeedToShowActionPlaceIdDto) {
        ufx ufxVar = new ufx("apps.needToShowAction", new xr(2), new io.reactivex.rxjava3.processors.b(2));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        if (str != null) {
            ufx.n(ufxVar, "url", str, 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "track_code", str2, 0, 12);
        }
        if (appsNeedToShowActionPlaceIdDto != null) {
            ufx.n(ufxVar, "place_id", appsNeedToShowActionPlaceIdDto.i(), 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new q40(new b(1, Z(), q73.class, "mapToAddActionSuggestion", "mapToAddActionSuggestion(Lcom/vk/api/generated/apps/dto/AppsNeedToShowActionResponseDto;)Lcom/vk/superapp/api/internal/requests/app/AddActionSuggestion;", 0), 16));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q u(long j2, String str, ArrayList arrayList) {
        ufx ufxVar = new ufx("apps.inviteMultipleFriend", new as(2), new p11(2));
        ufx.o(ufxVar, "friend_ids", arrayList, 8);
        ufx.k(ufxVar, "app_id", (int) j2, 1, 8);
        if (str != null) {
            ufx.n(ufxVar, "request_key", str, 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new lp0(new n1d(arrayList, 18), 20));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q v() {
        AppsClearRecentsPlatformDto appsClearRecentsPlatformDto = AppsClearRecentsPlatformDto.HTML5;
        if (!epx.f(null, appsClearRecentsPlatformDto.i())) {
            appsClearRecentsPlatformDto = AppsClearRecentsPlatformDto.VK_APPS;
            if (!epx.f(null, appsClearRecentsPlatformDto.i())) {
                appsClearRecentsPlatformDto = null;
            }
        }
        ufx ufxVar = new ufx("apps.clearRecents", new dn(3), new nr(2));
        if (appsClearRecentsPlatformDto != null) {
            ufx.n(ufxVar, "platform", appsClearRecentsPlatformDto.i(), 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new fq1(new py(27), 19));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<nak> w(long j2, String str, Integer num, String str2) {
        ufx ufxVar = new ufx("orders.createSubscription", new ly80(0), new as(25));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        ufx.n(ufxVar, "item_id", str, 0, 12);
        if (num != null) {
            ufx.k(ufxVar, "order_id", num.intValue(), 0, 8);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "track_code", str2, 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new mm6(new g(1, Z(), q73.class, "mapToCreateSubscriptionResult", "mapToCreateSubscriptionResult(Lcom/vk/api/generated/orders/dto/OrdersAppSubscriptionItemDto;)Lcom/vk/superapp/api/internal/requests/app/CreateSubscriptionResult;", 0), 17));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> x(long j2) {
        ufx ufxVar = new ufx("apps.uninstall", new qr(2), new rr(2));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new l7(new wh6(27), 25));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<Boolean> y(long j2) {
        ufx ufxVar = new ufx("apps.confirmPolicy", new ir(1), new jr(1));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        return rdx0.u(e370.e(ufxVar)).U(new b8(new j0r(5), 24));
    }

    @Override // xsna.zen0
    public final io.reactivex.rxjava3.core.q<fhx0> z(long j2, String str, Integer num, String str2) {
        ufx ufxVar = new ufx("orders.createOrder", new tr(20), new p11(22));
        ufx.k(ufxVar, "app_id", (int) j2, 0, 8);
        ufx.n(ufxVar, "item_id", str, 0, 12);
        if (num != null) {
            ufx.k(ufxVar, "order_id", num.intValue(), 0, 8);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "track_code", str2, 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new nu0(new f(1, Z(), q73.class, "mapToWebOrderInfo", "mapToWebOrderInfo(Lcom/vk/api/generated/orders/dto/OrdersAppOrderItemDto;)Lcom/vk/superapp/api/dto/app/WebOrderInfo;", 0), 23));
    }
}
