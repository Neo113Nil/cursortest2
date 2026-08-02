package xsna;

import com.ironsource.X3;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppFieldsDto;
import com.vk.api.generated.apps.dto.AppsGetResponseDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogAppDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemHeaderDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadCardDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadCardPanelDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadListDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadListItemDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemTextDto;
import com.vk.api.generated.apps.dto.AppsNeedToShowActionResponseDto;
import com.vk.api.generated.apps.dto.AppsSearchResponseDto;
import com.vk.api.generated.apps.dto.AppsVkAppsSectionDto;
import com.vk.api.generated.apps.dto.AppsVkAppsSectionViewTypeDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.exploreStyles.dto.ExploreStylesStyleBaseColorDto;
import com.vk.api.generated.exploreStyles.dto.ExploreStylesStyleBaseTextDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseButtonDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseFooterDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseFooterPayloadDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseImageContainerDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseTextDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsUserStackDto;
import com.vk.api.generated.orders.dto.OrdersAppSubscriptionItemDto;
import com.vk.api.generated.search.dto.SearchHintDto;
import com.vk.api.generated.search.dto.SearchTagDto;
import com.vk.api.generated.superApp.dto.SuperAppBadgeInfoDto;
import com.vk.api.generated.superApp.dto.SuperAppCustomMenuItemDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.external.miniapp.net.app.ProfileItem;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.superapp.api.dto.app.AppsSection;
import com.vk.superapp.api.dto.app.Status;
import com.vk.superapp.api.dto.app.WebSubscriptionInfo;
import com.vk.superapp.api.dto.app.catalog.CustomItem;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import com.vk.superapp.api.dto.app.catalog.SectionButton;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import com.vk.superapp.api.dto.app.catalog.SectionTitle;
import com.vk.superapp.api.dto.app.catalog.UserStack;
import com.vk.superapp.api.dto.app.catalog.footer.UserStackFooter;
import com.vk.superapp.api.dto.app.catalog.section.AppCard;
import com.vk.superapp.api.dto.app.catalog.section.AppCardSection;
import com.vk.superapp.api.dto.app.catalog.section.AppCardsSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategoriesSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import com.vk.superapp.api.dto.app.catalog.section.AppsHorizontalListSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsPaginatedSection;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.nak;

/* compiled from: AppMapper.kt */
/* loaded from: classes6.dex */
public final class q73 {
    public final ykg a;

    /* compiled from: AppMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[AppFields.values().length];
            try {
                iArr[AppFields.IS_IM_ACTIONS_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppFields.ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppFields.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppFields.CAN_CACHE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AppFields.IS_VKUI_INTERNAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AppFields.TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AppFields.ADS_SLOTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AppFields.SCREEN_ORIENTATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AppFields.MOBILE_CONTROLS_TYPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AppFields.SPLASH_SCREEN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AppFields.BACKGROUND_LOADER_COLOR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AppFields.PLACEHOLDER_INFO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AppFields.HIDE_TABBAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AppFields.TRACK_CODE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AppFields.AUTHOR_OWNER_ID.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AppFields.ICON_75.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AppFields.ICON_139.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AppFields.ICON_150.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AppFields.ICON_278.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AppFields.ICON_576.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AppFields.WEBVIEW_URL.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AppFields.IS_IN_CATALOG.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AppFields.PRELOAD_AD_TYPES.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AppFields.HAS_VK_CONNECT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[AppFields.AD_CONFIG.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[AppFields.SHORT_DESCRIPTION.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[AppFields.NEED_SHOW_UNVERIFIED_SCREEN.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[AppFields.LEGAL_INFO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[AppFields.GENRE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[AppFields.SCREENSHOTS.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[AppFields.DESCRIPTION.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[AppFields.RIGHTS.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[AppFields.FRIENDS_USE_APP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[AppFields.MEMBERS_COUNT.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[AppFields.IS_NEED_TO_SHOW_LAUNCH_SCREEN.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[AppFields.IS_INSTALL_SCREEN.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[AppFields.IS_INSTALLED.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppsVkAppsSectionViewTypeDto.values().length];
            try {
                iArr2[AppsVkAppsSectionViewTypeDto.LIST_SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[AppsVkAppsSectionViewTypeDto.LIST_CAROUSEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[AppsVkAppsSectionViewTypeDto.CAROUSEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[AppsVkAppsSectionViewTypeDto.CAROUSEL_BANNER_COLOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[AppsVkAppsSectionViewTypeDto.CAROUSEL_BANNER_IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrdersAppSubscriptionItemDto.StatusDto.values().length];
            try {
                iArr3[OrdersAppSubscriptionItemDto.StatusDto.WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BaseBoolIntDto.values().length];
            try {
                iArr4[BaseBoolIntDto.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr4[BaseBoolIntDto.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[BaseOkResponseDto.values().length];
            try {
                iArr5[BaseOkResponseDto.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[AppsNeedToShowActionResponseDto.TypeDto.values().length];
            try {
                iArr6[AppsNeedToShowActionResponseDto.TypeDto.RECOMMEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[AppsNeedToShowActionResponseDto.TypeDto.ADD_TO_MAIN_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[AppsNeedToShowActionResponseDto.TypeDto.RECOMMENDATION_NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr6[AppsNeedToShowActionResponseDto.TypeDto.NOTIFICATIONS_AUTO_PERMISSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr6[AppsNeedToShowActionResponseDto.TypeDto.PERSONAL_DISCOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr6[AppsNeedToShowActionResponseDto.TypeDto.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr6[AppsNeedToShowActionResponseDto.TypeDto.ADD_TO_COMMUNITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused53) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public q73(ykg ykgVar) {
        this.a = ykgVar;
    }

    public static AppsAppFieldsDto a(AppFields appFields) {
        switch (a.$EnumSwitchMapping$0[appFields.ordinal()]) {
            case 1:
                return AppsAppFieldsDto.IS_IM_ACTIONS_SUPPORTED;
            case 2:
                return AppsAppFieldsDto.ID;
            case 3:
                return AppsAppFieldsDto.TITLE;
            case 4:
                return AppsAppFieldsDto.CAN_CACHE;
            case 5:
                return AppsAppFieldsDto.IS_VKUI_INTERNAL;
            case 6:
                return AppsAppFieldsDto.TYPE;
            case 7:
                return AppsAppFieldsDto.ADS_SLOTS;
            case 8:
                return AppsAppFieldsDto.SCREEN_ORIENTATION;
            case 9:
                return AppsAppFieldsDto.MOBILE_CONTROLS_TYPE;
            case 10:
                return AppsAppFieldsDto.SPLASH_SCREEN;
            case 11:
                return AppsAppFieldsDto.BACKGROUND_LOADER_COLOR;
            case 12:
                return AppsAppFieldsDto.PLACEHOLDER_INFO;
            case 13:
                return AppsAppFieldsDto.HIDE_TABBAR;
            case 14:
                return AppsAppFieldsDto.TRACK_CODE;
            case 15:
                return AppsAppFieldsDto.AUTHOR_OWNER_ID;
            case 16:
                return AppsAppFieldsDto.ICON_75;
            case 17:
                return AppsAppFieldsDto.ICON_139;
            case 18:
                return AppsAppFieldsDto.ICON_150;
            case 19:
                return AppsAppFieldsDto.ICON_278;
            case 20:
                return AppsAppFieldsDto.ICON_576;
            case 21:
                return AppsAppFieldsDto.WEBVIEW_URL;
            case 22:
                return AppsAppFieldsDto.IS_IN_CATALOG;
            case 23:
                return AppsAppFieldsDto.PRELOAD_AD_TYPES;
            case 24:
                return AppsAppFieldsDto.HAS_VK_CONNECT;
            case 25:
                return AppsAppFieldsDto.AD_CONFIG;
            case 26:
                return AppsAppFieldsDto.SHORT_DESCRIPTION;
            case 27:
                return AppsAppFieldsDto.NEED_SHOW_UNVERIFIED_SCREEN;
            case 28:
                return AppsAppFieldsDto.LEGAL_INFO;
            case 29:
                return AppsAppFieldsDto.GENRE;
            case 30:
                return AppsAppFieldsDto.SCREENSHOTS;
            case 31:
                return AppsAppFieldsDto.DESCRIPTION;
            case 32:
                return AppsAppFieldsDto.RIGHTS;
            case 33:
                return AppsAppFieldsDto.FRIENDS_USE_APP;
            case 34:
                return AppsAppFieldsDto.MEMBERS_COUNT;
            case 35:
                return AppsAppFieldsDto.IS_NEED_TO_SHOW_LAUNCH_SCREEN;
            case 36:
                return AppsAppFieldsDto.IS_INSTALL_SCREEN;
            case 37:
                return AppsAppFieldsDto.IS_INSTALLED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static ArrayList b(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((AppFields) it.next()));
        }
        return arrayList;
    }

    public static BadgeInfo i(SuperAppBadgeInfoDto superAppBadgeInfoDto) {
        if (superAppBadgeInfoDto == null) {
            return null;
        }
        String g = superAppBadgeInfoDto.g();
        if (g == null) {
            g = "";
        }
        Boolean j = superAppBadgeInfoDto.j();
        boolean booleanValue = j != null ? j.booleanValue() : false;
        Boolean e = superAppBadgeInfoDto.e();
        boolean booleanValue2 = e != null ? e.booleanValue() : false;
        Integer d = superAppBadgeInfoDto.d();
        int intValue = d != null ? d.intValue() : 0;
        Boolean i = superAppBadgeInfoDto.i();
        boolean booleanValue3 = i != null ? i.booleanValue() : false;
        Boolean f = superAppBadgeInfoDto.f();
        return new BadgeInfo(g, booleanValue, booleanValue2, intValue, booleanValue3, f != null ? f.booleanValue() : false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public final AppCard.Panel c(AppsMiniappsCatalogItemPayloadCardPanelDto appsMiniappsCatalogItemPayloadCardPanelDto) {
        ykg ykgVar;
        ?? r1;
        SectionTitle m = m(appsMiniappsCatalogItemPayloadCardPanelDto.g());
        if (m == null) {
            m = new SectionTitle("", null);
        }
        SectionTitle m2 = m(appsMiniappsCatalogItemPayloadCardPanelDto.f());
        if (m2 == null) {
            m2 = new SectionTitle("", null);
        }
        List<String> e = appsMiniappsCatalogItemPayloadCardPanelDto.e();
        ArrayList arrayList = new ArrayList();
        Iterator it = e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ykgVar = this.a;
            if (!hasNext) {
                break;
            }
            String str = (String) it.next();
            ykgVar.getClass();
            Integer b = ykg.b(str);
            if (b != null) {
                arrayList.add(b);
            }
        }
        List<String> d = appsMiniappsCatalogItemPayloadCardPanelDto.d();
        if (d != null) {
            r1 = new ArrayList();
            for (String str2 : d) {
                ykgVar.getClass();
                Integer b2 = ykg.b(str2);
                if (b2 != null) {
                    r1.add(b2);
                }
            }
        } else {
            r1 = EmptyList.b;
        }
        return new AppCard.Panel(m, m2, arrayList, r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0507 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v21, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ke3 d(AppsMiniappsCatalogDto appsMiniappsCatalogDto) {
        ykg ykgVar;
        AppsMiniappsCatalogItemHeaderDto e;
        ExploreWidgetsBaseTextDto f;
        SectionHeader sectionHeader;
        SectionButton sectionButton;
        UserStackFooter userStackFooter;
        Iterator it;
        Object obj;
        AppsHorizontalListSection appsHorizontalListSection;
        Object appCardsSection;
        WebImage webImage;
        WebImage webImage2;
        ?? r15;
        ?? r9;
        ?? r92;
        ?? r93;
        WebImage webImage3;
        List<AppsAppDto> d = appsMiniappsCatalogDto.d();
        int i = 10;
        int e2 = on00.e(c5g.u(d, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        Iterator it2 = d.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            ykgVar = this.a;
            if (!hasNext) {
                break;
            }
            AppsAppDto appsAppDto = (AppsAppDto) it2.next();
            Long valueOf = Long.valueOf(appsAppDto.getId());
            ykgVar.getClass();
            Pair pair = new Pair(valueOf, ykg.c(appsAppDto));
            linkedHashMap.put(pair.i(), pair.j());
        }
        List<AppsMiniappsCatalogItemDto> e3 = appsMiniappsCatalogDto.e();
        ArrayList arrayList = new ArrayList();
        Iterator it3 = e3.iterator();
        while (it3.hasNext()) {
            AppsMiniappsCatalogItemDto appsMiniappsCatalogItemDto = (AppsMiniappsCatalogItemDto) it3.next();
            AppsMiniappsCatalogItemPayloadDto f2 = appsMiniappsCatalogItemDto.f();
            int id = appsMiniappsCatalogItemDto.getId();
            AppsMiniappsCatalogItemHeaderDto e4 = appsMiniappsCatalogItemDto.e();
            if (e4 == null) {
                sectionHeader = null;
            } else {
                SectionTitle n = n(e4.f());
                if (n == null) {
                    n = new SectionTitle("", null);
                }
                SectionTitle n2 = n(e4.e());
                ExploreWidgetsBaseButtonDto d2 = e4.d();
                if (d2 == null) {
                    sectionButton = null;
                } else {
                    ExploreWidgetsBaseTextDto e5 = d2.e();
                    String e6 = e5 != null ? e5.e() : null;
                    String str = e6 == null ? "" : e6;
                    bpn0 bpn0Var = pdx0.a;
                    sectionButton = new SectionButton(str, pdx0.a(d2.d()));
                }
                sectionHeader = new SectionHeader(n, n2, sectionButton);
            }
            ExploreWidgetsBaseFooterDto d3 = appsMiniappsCatalogItemDto.d();
            if (d3 == null) {
                userStackFooter = null;
            } else {
                if (!(d3.d() instanceof ExploreWidgetsBaseFooterPayloadDto.ExploreWidgetsUserStackDto)) {
                    throw new IllegalStateException("Unknown footer type: " + d3.e());
                }
                ExploreWidgetsBaseFooterPayloadDto.ExploreWidgetsUserStackDto exploreWidgetsUserStackDto = (ExploreWidgetsBaseFooterPayloadDto.ExploreWidgetsUserStackDto) d3.d();
                String description = exploreWidgetsUserStackDto.getDescription();
                List<ExploreWidgetsBaseImageContainerDto> d4 = exploreWidgetsUserStackDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d4, i));
                Iterator it4 = d4.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(k((ExploreWidgetsBaseImageContainerDto) it4.next()));
                }
                userStackFooter = new UserStackFooter(description, arrayList2);
            }
            String i2 = appsMiniappsCatalogItemDto.i();
            String str2 = i2 == null ? "" : i2;
            if (f2 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAppPaginatedDto) {
                AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAppPaginatedDto appsMiniappsCatalogItemPayloadAppPaginatedDto = (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAppPaginatedDto) f2;
                int e7 = appsMiniappsCatalogItemPayloadAppPaginatedDto.e();
                List<SuperAppCustomMenuItemDto> d5 = appsMiniappsCatalogItemPayloadAppPaginatedDto.d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d5, i));
                for (SuperAppCustomMenuItemDto superAppCustomMenuItemDto : d5) {
                    String n3 = superAppCustomMenuItemDto.n();
                    String j = superAppCustomMenuItemDto.j();
                    List<String> g = superAppCustomMenuItemDto.g();
                    if (g != null) {
                        r15 = new ArrayList();
                        for (String str3 : g) {
                            ykgVar.getClass();
                            Integer b = ykg.b(str3);
                            if (b != null) {
                                r15.add(b);
                            }
                        }
                    } else {
                        r15 = EmptyList.b;
                    }
                    List list = r15;
                    List<String> e8 = superAppCustomMenuItemDto.e();
                    if (e8 != null) {
                        r9 = new ArrayList();
                        for (String str4 : e8) {
                            ykgVar.getClass();
                            Integer b2 = ykg.b(str4);
                            if (b2 != null) {
                                r9.add(b2);
                            }
                        }
                    } else {
                        r9 = EmptyList.b;
                    }
                    List list2 = r9;
                    List<String> g2 = superAppCustomMenuItemDto.g();
                    if (g2 != null) {
                        r92 = new ArrayList();
                        for (String str5 : g2) {
                            ykgVar.getClass();
                            Integer b3 = ykg.b(str5);
                            if (b3 != null) {
                                r92.add(b3);
                            }
                        }
                    } else {
                        r92 = EmptyList.b;
                    }
                    List list3 = r92;
                    List<String> k = superAppCustomMenuItemDto.k();
                    if (k != null) {
                        r93 = new ArrayList();
                        for (String str6 : k) {
                            ykgVar.getClass();
                            Integer b4 = ykg.b(str6);
                            if (b4 != null) {
                                r93.add(b4);
                            }
                        }
                    } else {
                        r93 = EmptyList.b;
                    }
                    List list4 = r93;
                    String title = superAppCustomMenuItemDto.getTitle();
                    String str7 = title == null ? "" : title;
                    List<BaseImageDto> i3 = superAppCustomMenuItemDto.i();
                    if (i3 != null) {
                        ykgVar.getClass();
                        webImage3 = ykg.e(i3);
                    } else {
                        webImage3 = new WebImage(EmptyList.b);
                    }
                    WebImage webImage4 = webImage3;
                    SuperAppUniversalWidgetActionDto d6 = superAppCustomMenuItemDto.d();
                    WebAction webActionOpenUrl = d6 == null ? new WebActionOpenUrl("", WebActionOpenUrl.Target.f43default, null, null, false, 0L, "", 48, null) : pdx0.b(d6, null);
                    BadgeInfo i4 = i(superAppCustomMenuItemDto.f());
                    String r = superAppCustomMenuItemDto.r();
                    arrayList3.add(new CustomItem(n3, j, list, list2, list3, list4, str7, webImage4, webActionOpenUrl, i4, r == null ? "" : r));
                }
                appCardsSection = new AppsPaginatedSection(id, str2, sectionHeader, e7, arrayList3, appsMiniappsCatalogItemPayloadAppPaginatedDto.f());
            } else {
                String str8 = str2;
                if (f2 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadCardDto) {
                    AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadCardDto appsMiniappsCatalogItemPayloadCardDto = (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadCardDto) f2;
                    AppsMiniappsCatalogAppDto d7 = appsMiniappsCatalogItemPayloadCardDto.d();
                    long id2 = d7.getId();
                    WebApiApplication webApiApplication = (WebApiApplication) linkedHashMap.get(Long.valueOf(id2));
                    if (webApiApplication == null) {
                        throw new IllegalStateException(("Response doesn't contains app with id: " + id2).toString());
                    }
                    SectionAppItem sectionAppItem = new SectionAppItem(webApiApplication, d7.g(), d7.e(), i(d7.d()), str8, o(d7.f()));
                    List<BaseImageDto> d8 = appsMiniappsCatalogItemPayloadCardDto.f().d();
                    if (d8 != null) {
                        ykgVar.getClass();
                        webImage2 = ykg.e(d8);
                    } else {
                        webImage2 = new WebImage(EmptyList.b);
                    }
                    WebImage webImage5 = webImage2;
                    List<String> e9 = appsMiniappsCatalogItemPayloadCardDto.e();
                    ArrayList arrayList4 = new ArrayList();
                    for (String str9 : e9) {
                        ykgVar.getClass();
                        Integer b5 = ykg.b(str9);
                        if (b5 != null) {
                            arrayList4.add(b5);
                        }
                    }
                    SectionTitle m = m(appsMiniappsCatalogItemPayloadCardDto.j());
                    AppsMiniappsCatalogItemTextDto i5 = appsMiniappsCatalogItemPayloadCardDto.i();
                    SectionTitle m2 = i5 != null ? m(i5) : null;
                    AppsMiniappsCatalogItemPayloadCardPanelDto g3 = appsMiniappsCatalogItemPayloadCardDto.g();
                    appCardsSection = new AppCardSection(id, str8, sectionHeader, userStackFooter, new AppCard(sectionAppItem, webImage5, arrayList4, m, m2, g3 != null ? c(g3) : null, str8));
                } else if (f2 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadCardsDto) {
                    List<AppsMiniappsCatalogItemPayloadCardDto> d9 = ((AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadCardsDto) f2).d();
                    ArrayList arrayList5 = new ArrayList(c5g.u(d9, 10));
                    Iterator it5 = d9.iterator();
                    while (it5.hasNext()) {
                        AppsMiniappsCatalogItemPayloadCardDto appsMiniappsCatalogItemPayloadCardDto2 = (AppsMiniappsCatalogItemPayloadCardDto) it5.next();
                        AppsMiniappsCatalogAppDto d10 = appsMiniappsCatalogItemPayloadCardDto2.d();
                        Iterator it6 = it3;
                        Iterator it7 = it5;
                        long id3 = d10.getId();
                        WebApiApplication webApiApplication2 = (WebApiApplication) linkedHashMap.get(Long.valueOf(id3));
                        if (webApiApplication2 == null) {
                            throw new IllegalStateException(("Response doesn't contains app with id: " + id3).toString());
                        }
                        SectionAppItem sectionAppItem2 = new SectionAppItem(webApiApplication2, d10.g(), d10.e(), i(d10.d()), str8, o(d10.f()));
                        List<BaseImageDto> d11 = appsMiniappsCatalogItemPayloadCardDto2.f().d();
                        if (d11 != null) {
                            ykgVar.getClass();
                            webImage = ykg.e(d11);
                        } else {
                            webImage = new WebImage(EmptyList.b);
                        }
                        WebImage webImage6 = webImage;
                        List<String> e10 = appsMiniappsCatalogItemPayloadCardDto2.e();
                        ArrayList arrayList6 = new ArrayList();
                        for (String str10 : e10) {
                            ykgVar.getClass();
                            Integer b6 = ykg.b(str10);
                            if (b6 != null) {
                                arrayList6.add(b6);
                            }
                        }
                        SectionTitle m3 = m(appsMiniappsCatalogItemPayloadCardDto2.j());
                        AppsMiniappsCatalogItemTextDto i6 = appsMiniappsCatalogItemPayloadCardDto2.i();
                        SectionTitle m4 = i6 != null ? m(i6) : null;
                        AppsMiniappsCatalogItemPayloadCardPanelDto g4 = appsMiniappsCatalogItemPayloadCardDto2.g();
                        arrayList5.add(new AppCard(sectionAppItem2, webImage6, arrayList6, m3, m4, g4 != null ? c(g4) : null, str8));
                        it3 = it6;
                        it5 = it7;
                    }
                    it = it3;
                    appCardsSection = new AppCardsSection(id, str8, sectionHeader, userStackFooter, arrayList5);
                    obj = appCardsSection;
                    i = 10;
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                    it3 = it;
                } else {
                    it = it3;
                    if (f2 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadListDto) {
                        List<AppsMiniappsCatalogItemPayloadListItemDto> d12 = ((AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadListDto) f2).d();
                        ArrayList arrayList7 = new ArrayList(c5g.u(d12, 10));
                        Iterator it8 = d12.iterator();
                        while (it8.hasNext()) {
                            arrayList7.add(e((AppsMiniappsCatalogItemPayloadListItemDto) it8.next(), str8));
                        }
                        obj = new AppsCategoriesSection(id, str8, sectionHeader, arrayList7);
                        i = 10;
                        if (obj != null) {
                        }
                        it3 = it;
                    } else {
                        if (f2 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAppsDto) {
                            AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAppsDto appsMiniappsCatalogItemPayloadAppsDto = (AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadAppsDto) f2;
                            List<AppsMiniappsCatalogAppDto> d13 = appsMiniappsCatalogItemPayloadAppsDto.d();
                            i = 10;
                            ArrayList arrayList8 = new ArrayList(c5g.u(d13, 10));
                            Iterator it9 = d13.iterator();
                            while (it9.hasNext()) {
                                arrayList8.add(l((AppsMiniappsCatalogAppDto) it9.next(), linkedHashMap, str8));
                            }
                            appsHorizontalListSection = new AppsHorizontalListSection(id, str8, sectionHeader, arrayList8, appsMiniappsCatalogItemPayloadAppsDto.e());
                        } else {
                            i = 10;
                            if (f2 instanceof AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadSingleAppDto) {
                                appsHorizontalListSection = new AppsHorizontalListSection(id, str8, sectionHeader, Collections.singletonList(l(((AppsMiniappsCatalogItemPayloadDto.AppsMiniappsCatalogItemPayloadSingleAppDto) f2).d(), linkedHashMap, str8)), String.valueOf(id));
                            } else {
                                xgx0.a.getClass();
                                xgx0.a("Unknown section type: " + appsMiniappsCatalogItemDto);
                                obj = null;
                                if (obj != null) {
                                }
                                it3 = it;
                            }
                        }
                        obj = appsHorizontalListSection;
                        if (obj != null) {
                        }
                        it3 = it;
                    }
                }
            }
            it = it3;
            obj = appCardsSection;
            i = 10;
            if (obj != null) {
            }
            it3 = it;
        }
        int count = appsMiniappsCatalogDto.getCount();
        AppsMiniappsCatalogItemDto appsMiniappsCatalogItemDto2 = (AppsMiniappsCatalogItemDto) j5g.a0(appsMiniappsCatalogDto.e());
        return new ke3(arrayList, linkedHashMap, count, (appsMiniappsCatalogItemDto2 == null || (e = appsMiniappsCatalogItemDto2.e()) == null || (f = e.f()) == null) ? null : f.e(), null);
    }

    public final AppsCategory e(AppsMiniappsCatalogItemPayloadListItemDto appsMiniappsCatalogItemPayloadListItemDto, String str) {
        WebImage webImage;
        List<BaseImageDto> d;
        String title = appsMiniappsCatalogItemPayloadListItemDto.getTitle();
        String e = appsMiniappsCatalogItemPayloadListItemDto.e();
        ExploreWidgetsBaseImageContainerDto d2 = appsMiniappsCatalogItemPayloadListItemDto.d();
        if (d2 == null || (d = d2.d()) == null) {
            webImage = null;
        } else {
            this.a.getClass();
            webImage = ykg.e(d);
        }
        return new AppsCategory(title, e, webImage, str);
    }

    public final ArrayList f(AppsMiniappsCatalogItemPayloadListDto appsMiniappsCatalogItemPayloadListDto) {
        List<AppsMiniappsCatalogItemPayloadListItemDto> d = appsMiniappsCatalogItemPayloadListDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(e((AppsMiniappsCatalogItemPayloadListItemDto) it.next(), ""));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public final of3 g(AppsSearchResponseDto appsSearchResponseDto) {
        ?? r2;
        WebApiApplication webApiApplication;
        List<SearchHintDto> d = appsSearchResponseDto.d();
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            AppsAppDto d2 = ((SearchHintDto) it.next()).d();
            if (d2 != null) {
                this.a.getClass();
                webApiApplication = ykg.c(d2);
            } else {
                webApiApplication = null;
            }
            if (webApiApplication != null) {
                arrayList.add(webApiApplication);
            }
        }
        List<SearchTagDto> e = appsSearchResponseDto.e();
        if (e != null) {
            List<SearchTagDto> list = e;
            r2 = new ArrayList(c5g.u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                r2.add(new jzh0(r3.getId(), ((SearchTagDto) it2.next()).d()));
            }
        } else {
            r2 = EmptyList.b;
        }
        return new of3(appsSearchResponseDto.getCount(), arrayList, r2);
    }

    public final ArrayList h(List list) {
        AppsSection.ViewType viewType;
        List<AppsVkAppsSectionDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (AppsVkAppsSectionDto appsVkAppsSectionDto : list2) {
            String id = appsVkAppsSectionDto.getId();
            List<AppsAppDto> d = appsVkAppsSectionDto.d();
            ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
            for (AppsAppDto appsAppDto : d) {
                this.a.getClass();
                arrayList2.add(ykg.c(appsAppDto));
            }
            String title = appsVkAppsSectionDto.getTitle();
            int count = appsVkAppsSectionDto.getCount();
            AppsVkAppsSectionViewTypeDto e = appsVkAppsSectionDto.e();
            if (e == null) {
                e = AppsVkAppsSectionViewTypeDto.LIST_SIMPLE;
            }
            int i = a.$EnumSwitchMapping$1[e.ordinal()];
            if (i == 1) {
                viewType = AppsSection.ViewType.LIST_SIMPLE;
            } else if (i == 2) {
                viewType = AppsSection.ViewType.LIST_CAROUSEL;
            } else if (i == 3) {
                viewType = AppsSection.ViewType.CAROUSEL;
            } else if (i == 4) {
                viewType = AppsSection.ViewType.CAROUSEL_BANNER_COLOR;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                viewType = AppsSection.ViewType.CAROUSEL_BANNER_IMAGE;
            }
            arrayList.add(new AppsSection(id, arrayList2, title, count, viewType));
        }
        return arrayList;
    }

    public final nak j(OrdersAppSubscriptionItemDto ordersAppSubscriptionItemDto) {
        WebImage webImage;
        int i;
        long j;
        if (a.$EnumSwitchMapping$2[ordersAppSubscriptionItemDto.o().ordinal()] == 1) {
            return new nak.b(ordersAppSubscriptionItemDto.k());
        }
        int k = ordersAppSubscriptionItemDto.k();
        String i2 = ordersAppSubscriptionItemDto.i();
        Status.a aVar = Status.Companion;
        String i3 = ordersAppSubscriptionItemDto.o().i();
        aVar.getClass();
        Status status = i3.equals(X3.i.r) ? Status.LOADED : Status.WAITING;
        List<BaseImageDto> g = ordersAppSubscriptionItemDto.g();
        if (g != null) {
            this.a.getClass();
            webImage = ykg.e(g);
        } else {
            webImage = new WebImage(EmptyList.b);
        }
        WebPhoto webPhoto = new WebPhoto(webImage);
        String j2 = ordersAppSubscriptionItemDto.j();
        Integer n = ordersAppSubscriptionItemDto.n();
        int intValue = n != null ? n.intValue() : 0;
        Integer d = ordersAppSubscriptionItemDto.d();
        int intValue2 = d != null ? d.intValue() : 0;
        Integer p = ordersAppSubscriptionItemDto.p();
        int intValue3 = p != null ? p.intValue() : 0;
        Boolean B = ordersAppSubscriptionItemDto.B();
        boolean booleanValue = B != null ? B.booleanValue() : false;
        Boolean u = ordersAppSubscriptionItemDto.u();
        boolean booleanValue2 = u != null ? u.booleanValue() : true;
        String e = ordersAppSubscriptionItemDto.e();
        Integer l = ordersAppSubscriptionItemDto.l();
        int intValue4 = l != null ? l.intValue() : 0;
        Integer f = ordersAppSubscriptionItemDto.f();
        if (f != null) {
            i = intValue2;
            j = f.intValue();
        } else {
            i = intValue2;
            j = 0;
        }
        return new nak.a(new WebSubscriptionInfo(k, i2, status, webPhoto, j2, i, intValue, intValue3, booleanValue, booleanValue2, e, intValue4, j, ordersAppSubscriptionItemDto.getDescription()));
    }

    public final ProfileItem k(ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto) {
        WebImage webImage;
        long intValue = exploreWidgetsBaseImageContainerDto.e() != null ? r0.intValue() : 0L;
        List<BaseImageDto> d = exploreWidgetsBaseImageContainerDto.d();
        if (d != null) {
            this.a.getClass();
            webImage = ykg.e(d);
        } else {
            webImage = new WebImage(EmptyList.b);
        }
        return new ProfileItem(intValue, webImage);
    }

    public final SectionAppItem l(AppsMiniappsCatalogAppDto appsMiniappsCatalogAppDto, LinkedHashMap linkedHashMap, String str) {
        long id = appsMiniappsCatalogAppDto.getId();
        WebApiApplication webApiApplication = (WebApiApplication) linkedHashMap.get(Long.valueOf(id));
        if (webApiApplication != null) {
            return new SectionAppItem(webApiApplication, appsMiniappsCatalogAppDto.g(), appsMiniappsCatalogAppDto.e(), i(appsMiniappsCatalogAppDto.d()), str, o(appsMiniappsCatalogAppDto.f()));
        }
        throw new IllegalStateException(("Response doesn't contains app with id: " + id).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public final SectionTitle m(AppsMiniappsCatalogItemTextDto appsMiniappsCatalogItemTextDto) {
        ?? r1;
        if (appsMiniappsCatalogItemTextDto == null) {
            return null;
        }
        String e = appsMiniappsCatalogItemTextDto.e();
        List<String> d = appsMiniappsCatalogItemTextDto.d();
        if (d != null) {
            r1 = new ArrayList();
            for (String str : d) {
                this.a.getClass();
                Integer b = ykg.b(str);
                if (b != null) {
                    r1.add(b);
                }
            }
        } else {
            r1 = EmptyList.b;
        }
        return new SectionTitle(e, r1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SectionTitle n(ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto) {
        List list;
        ExploreStylesStyleBaseColorDto d;
        if (exploreWidgetsBaseTextDto == null) {
            return null;
        }
        String e = exploreWidgetsBaseTextDto.e();
        ExploreStylesStyleBaseTextDto d2 = exploreWidgetsBaseTextDto.d();
        if (d2 != null && (d = d2.d()) != null) {
            String i = d.i();
            this.a.getClass();
            list = e43.m(ykg.b(i));
        }
        list = EmptyList.b;
        return new SectionTitle(e, list);
    }

    public final UserStack o(ExploreWidgetsUserStackDto exploreWidgetsUserStackDto) {
        if (exploreWidgetsUserStackDto == null) {
            return null;
        }
        String description = exploreWidgetsUserStackDto.getDescription();
        List<ExploreWidgetsBaseImageContainerDto> d = exploreWidgetsUserStackDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(k((ExploreWidgetsBaseImageContainerDto) it.next()));
        }
        return new UserStack(description, arrayList);
    }

    public final WebApiApplication p(AppsGetResponseDto appsGetResponseDto) {
        AppsAppDto appsAppDto = (AppsAppDto) j5g.a0(appsGetResponseDto.d());
        if (appsAppDto != null) {
            this.a.getClass();
            return ykg.c(appsAppDto);
        }
        throw new IllegalStateException("No app in AppsGetResponse: " + appsGetResponseDto);
    }
}
