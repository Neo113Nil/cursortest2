package xsna;

import com.vk.api.generated.atum.dto.AtumAnyActionDto;
import com.vk.api.generated.atum.dto.AtumAnyViewDto;
import com.vk.api.generated.atum.dto.AtumContainerViewPropsDto;
import com.vk.api.generated.atum.dto.AtumOpenUrlActionParametersDto;
import com.vk.api.generated.atum.dto.AtumVkApiRequestActionParametersDto;
import com.vk.api.generated.atum.dto.AtumVkuiAnyActionDto;
import com.vk.api.generated.atum.dto.AtumVkuiLabelPropsDto;
import com.vk.api.generated.atum.dto.AtumVkuiSnackbarActionParametersDto;
import com.vk.api.generated.atum.dto.AtumVkuiSuperAppTypeStatsParametersDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.superApp.dto.SuperAppBadgeInfoDto;
import com.vk.api.generated.superApp.dto.SuperAppCustomMenuItemDto;
import com.vk.api.generated.superApp.dto.SuperAppMiniWidgetItemDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetAdditionalHeaderIconDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageStyleDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageSubIconDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetTextBlockDto;
import com.vk.api.generated.superApp.dto.SuperAppWidgetOnboardingPanelActionDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseBadgeDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemInnerDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemPayloadDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseMarketTileForegroundDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseScrollItemDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseSectionPosterUserStackDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseSectionScrollAdInfoDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseSectionScrollItemDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseSectionVideoBannerBottomDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseServicesMenuBadgeDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseServicesMenuItemDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseServicesMenuItemIconDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseServicesMenuMoreItemDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseTileBackgroundDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseTileForegroundDto;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.ad.AdInfo;
import com.vk.superapp.api.dto.market.MarketTileInfo;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.api.dto.menu.QueueSettings;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.menu.WidgetSettings;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl;
import com.vk.superapp.ui.requests.WidgetFlags;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.VerticalAlign;
import com.vk.superapp.ui.widgets.HeaderRightImageType;
import com.vk.superapp.ui.widgets.SuperAppShowcaseConfirmNumberWidget;
import com.vk.superapp.ui.widgets.SuperAppShowcaseExpandableServiceMenu;
import com.vk.superapp.ui.widgets.SuperAppShowcasePromoWidget;
import com.vk.superapp.ui.widgets.SuperAppShowcaseScrollWidget;
import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionPosterWidget;
import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionScrollWidget;
import com.vk.superapp.ui.widgets.SuperAppShowcaseVideoBannerWidget;
import com.vk.superapp.ui.widgets.SuperAppTextWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.SuperAppWidgetOnboardingPanel;
import com.vk.superapp.ui.widgets.SuperAppWidgetSize;
import com.vk.superapp.ui.widgets.WidgetBasePayload;
import com.vk.superapp.ui.widgets.half_tile.SuperAppWidgetHalfTile;
import com.vk.superapp.ui.widgets.menu.CustomMenuInfo;
import com.vk.superapp.ui.widgets.menu.SuperAppWidgetCustomMenu;
import com.vk.superapp.ui.widgets.miniwidgets.DefaultMiniWidget;
import com.vk.superapp.ui.widgets.miniwidgets.ExchangeMiniWidget;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.superapp.ui.widgets.miniwidgets.SettingsMiniWidget;
import com.vk.superapp.ui.widgets.miniwidgets.SuperAppMiniWidget;
import com.vk.superapp.ui.widgets.subscribe_tile.SubIcon;
import com.vk.superapp.ui.widgets.subscribe_tile.SubscribeTileIcon;
import com.vk.superapp.ui.widgets.subscribe_tile.SuperAppWidgetSubscribeTile;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import com.vk.superapp.ui.widgets.tile.OverlapIcons;
import com.vk.superapp.ui.widgets.tile.SuperAppMoreTile;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetMarketProductTile;
import com.vk.superapp.ui.widgets.tile.SuperAppWidgetTile;
import com.vk.superapp.ui.widgets.tile.TileBackground;
import com.vk.superapp.ui.widgets.tile.TileBackgroundImage;
import com.vk.superapp.ui.widgets.tile.TileBadgeInfo;
import com.vk.superapp.ui.widgets.tile.TileBottomContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b2i0;

/* compiled from: WidgetMapper.kt */
/* loaded from: classes6.dex */
public final class knx0 {
    public final WidgetObjects a;
    public final bpn0 b = new bpn0(new mwm0(this, 26));
    public final bpn0 c = new bpn0(new wcs0(this, 11));
    public final bpn0 d = new bpn0(new icn0(this, 25));
    public final bpn0 e = new bpn0(new c2c0(19));

    /* compiled from: WidgetMapper.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[SuperAppShowcaseItemPayloadDto.SuperAppMiniWidgetsDto.WidgetSizeDto.values().length];
            try {
                iArr[SuperAppShowcaseItemPayloadDto.SuperAppMiniWidgetsDto.WidgetSizeDto.BIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperAppShowcaseItemPayloadDto.SuperAppMiniWidgetsDto.WidgetSizeDto.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SuperAppShowcaseItemInnerDto.SuperAppMiniWidgetItemDto.HeaderIconAlignDto.values().length];
            try {
                iArr2[SuperAppShowcaseItemInnerDto.SuperAppMiniWidgetItemDto.HeaderIconAlignDto.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SuperAppShowcaseItemInnerDto.SuperAppMiniWidgetItemDto.HeaderIconAlignDto.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SuperAppShowcaseItemInnerDto.SuperAppMiniWidgetItemDto.TypeDto.values().length];
            try {
                iArr3[SuperAppShowcaseItemInnerDto.SuperAppMiniWidgetItemDto.TypeDto.MW_EXCHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[SuperAppShowcaseItemInnerDto.SuperAppMiniWidgetItemDto.TypeDto.MW_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SuperAppMiniWidgetItemDto.HeaderIconAlignDto.values().length];
            try {
                iArr4[SuperAppMiniWidgetItemDto.HeaderIconAlignDto.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[SuperAppMiniWidgetItemDto.HeaderIconAlignDto.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[SuperAppMiniWidgetItemDto.TypeDto.values().length];
            try {
                iArr5[SuperAppMiniWidgetItemDto.TypeDto.MW_EXCHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr5[SuperAppMiniWidgetItemDto.TypeDto.MW_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public knx0(WidgetObjects widgetObjects) {
        this.a = widgetObjects;
    }

    public static AtumAnyViewDto.AtumViewDto a(SuperAppShowcaseItemPayloadDto.SuperAppShowcaseUniversalFullWidthDto superAppShowcaseUniversalFullWidthDto) {
        AtumAnyViewDto atumAnyViewDto;
        List<AtumAnyViewDto> d;
        AtumAnyViewDto.AtumViewDto d2 = d(superAppShowcaseUniversalFullWidthDto);
        if (d2 != null) {
            AtumContainerViewPropsDto d3 = d2.d();
            if (d3 == null || (d = d3.d()) == null) {
                atumAnyViewDto = null;
            } else {
                d.size();
                atumAnyViewDto = d.get(2);
            }
            if (atumAnyViewDto instanceof AtumAnyViewDto.AtumViewDto) {
                return (AtumAnyViewDto.AtumViewDto) atumAnyViewDto;
            }
        }
        return null;
    }

    public static AtumAnyViewDto.AtumVkuiButtonUniversalDto b(SuperAppShowcaseItemPayloadDto.SuperAppShowcaseUniversalFullWidthDto superAppShowcaseUniversalFullWidthDto) {
        AtumContainerViewPropsDto d;
        List<AtumAnyViewDto> d2;
        AtumAnyViewDto.AtumViewDto a2 = a(superAppShowcaseUniversalFullWidthDto);
        if (a2 == null || (d = a2.d()) == null || (d2 = d.d()) == null) {
            return null;
        }
        d2.size();
        AtumAnyViewDto atumAnyViewDto = d2.get(1);
        if (atumAnyViewDto instanceof AtumAnyViewDto.AtumVkuiButtonUniversalDto) {
            return (AtumAnyViewDto.AtumVkuiButtonUniversalDto) atumAnyViewDto;
        }
        return null;
    }

    public static AtumAnyViewDto.AtumVkuiButtonUniversalDto c(SuperAppShowcaseItemPayloadDto.SuperAppShowcaseUniversalFullWidthDto superAppShowcaseUniversalFullWidthDto) {
        AtumContainerViewPropsDto d;
        List<AtumAnyViewDto> d2;
        AtumAnyViewDto.AtumViewDto a2 = a(superAppShowcaseUniversalFullWidthDto);
        if (a2 == null || (d = a2.d()) == null || (d2 = d.d()) == null) {
            return null;
        }
        Object a0 = j5g.a0(d2);
        if (a0 instanceof AtumAnyViewDto.AtumVkuiButtonUniversalDto) {
            return (AtumAnyViewDto.AtumVkuiButtonUniversalDto) a0;
        }
        return null;
    }

    public static AtumAnyViewDto.AtumViewDto d(SuperAppShowcaseItemPayloadDto.SuperAppShowcaseUniversalFullWidthDto superAppShowcaseUniversalFullWidthDto) {
        List<AtumAnyViewDto> d;
        AtumAnyViewDto d2 = superAppShowcaseUniversalFullWidthDto.d();
        AtumAnyViewDto.AtumViewDto atumViewDto = d2 instanceof AtumAnyViewDto.AtumViewDto ? (AtumAnyViewDto.AtumViewDto) d2 : null;
        if (atumViewDto != null) {
            AtumContainerViewPropsDto d3 = atumViewDto.d();
            AtumAnyViewDto atumAnyViewDto = (d3 == null || (d = d3.d()) == null) ? null : (AtumAnyViewDto) j5g.a0(d);
            if (atumAnyViewDto instanceof AtumAnyViewDto.AtumViewDto) {
                return (AtumAnyViewDto.AtumViewDto) atumAnyViewDto;
            }
        }
        return null;
    }

    public static BadgeInfo e(SuperAppShowcaseServicesMenuBadgeDto superAppShowcaseServicesMenuBadgeDto) {
        if (superAppShowcaseServicesMenuBadgeDto instanceof SuperAppShowcaseServicesMenuBadgeDto.SuperAppShowcaseServicesMenuBadgeCounterDto) {
            return new BadgeInfo(null, false, false, ((SuperAppShowcaseServicesMenuBadgeDto.SuperAppShowcaseServicesMenuBadgeCounterDto) superAppShowcaseServicesMenuBadgeDto).getCount(), false, false, 55, null);
        }
        if (superAppShowcaseServicesMenuBadgeDto instanceof SuperAppShowcaseServicesMenuBadgeDto.SuperAppShowcaseServicesMenuBadgeDotDto) {
            return new BadgeInfo(null, false, true, 0, false, false, 59, null);
        }
        if (superAppShowcaseServicesMenuBadgeDto instanceof SuperAppShowcaseServicesMenuBadgeDto.SuperAppShowcaseServicesMenuBadgeNewDto) {
            return new BadgeInfo(null, true, false, 0, false, false, 61, null);
        }
        return null;
    }

    public static CustomMenuInfo f(SuperAppCustomMenuItemDto superAppCustomMenuItemDto) {
        WebImage webImage;
        String m = cqm0.m(superAppCustomMenuItemDto.l().name());
        String j = superAppCustomMenuItemDto.j();
        String str = j == null ? "" : j;
        String n = superAppCustomMenuItemDto.n();
        String r = superAppCustomMenuItemDto.r();
        String str2 = r == null ? "" : r;
        String title = superAppCustomMenuItemDto.getTitle();
        String str3 = title == null ? "" : title;
        SuperAppBadgeInfoDto f = superAppCustomMenuItemDto.f();
        BadgeInfo h = f != null ? h(f) : null;
        List<String> k = superAppCustomMenuItemDto.k();
        List<String> g = superAppCustomMenuItemDto.g();
        List<String> e = superAppCustomMenuItemDto.e();
        List<BaseImageDto> i = superAppCustomMenuItemDto.i();
        if (i != null) {
            List<BaseImageDto> list = i;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (BaseImageDto baseImageDto : list) {
                arrayList.add(new WebImageSize(baseImageDto.getUrl(), baseImageDto.getHeight(), baseImageDto.getWidth(), (char) 0, false, baseImageDto.e(), 24, null));
            }
            webImage = new WebImage(arrayList);
        } else {
            webImage = null;
        }
        SuperAppUniversalWidgetActionDto d = superAppCustomMenuItemDto.d();
        return new CustomMenuInfo(m, str, n, str2, str3, h, k, g, e, webImage, d != null ? ks20.m(d) : null);
    }

    public static BadgeInfo h(SuperAppBadgeInfoDto superAppBadgeInfoDto) {
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SuperAppShowcaseConfirmNumberWidget l(a aVar, SuperAppShowcaseItemPayloadDto.SuperAppShowcaseUniversalFullWidthDto superAppShowcaseUniversalFullWidthDto) {
        String str;
        String str2;
        List<AtumAnyViewDto> d;
        AtumVkuiLabelPropsDto d2;
        AtumAnyViewDto.AtumViewDto d3;
        String str3;
        String str4;
        List<AtumAnyViewDto> d4;
        AtumVkuiLabelPropsDto d5;
        String title;
        String title2;
        AtumAnyViewDto.AtumVkuiButtonUniversalDto c;
        AtumAnyActionDto.AtumVkApiRequestActionDto atumVkApiRequestActionDto;
        AtumVkApiRequestActionParametersDto d6;
        List<AtumAnyActionDto> e;
        String title3;
        String str5;
        AtumVkuiSnackbarActionParametersDto d7;
        AtumAnyViewDto.AtumVkuiButtonUniversalDto c2;
        AtumAnyActionDto.AtumVkApiRequestActionDto atumVkApiRequestActionDto2;
        AtumVkApiRequestActionParametersDto d8;
        List<AtumAnyActionDto> d9;
        String title4;
        String str6;
        AtumVkuiSnackbarActionParametersDto d10;
        AtumAnyViewDto.AtumVkuiButtonUniversalDto b2;
        AtumAnyActionDto.AtumOpenUrlActionDto atumOpenUrlActionDto;
        AtumOpenUrlActionParametersDto d11;
        String url;
        String str7;
        AtumAnyViewDto.AtumVkuiButtonUniversalDto c3;
        int i;
        AtumAnyViewDto.AtumVkuiButtonUniversalDto b3;
        int i2;
        AtumAnyViewDto.AtumVkuiButtonUniversalDto c4;
        int i3;
        AtumAnyViewDto.AtumVkuiButtonUniversalDto c5;
        int i4;
        AtumAnyActionDto.AtumVkApiRequestActionDto atumVkApiRequestActionDto3;
        AtumVkApiRequestActionParametersDto d12;
        List<AtumAnyActionDto> d13;
        AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto atumVkuiSuperAppTypeClickActionDto;
        AtumVkuiSuperAppTypeStatsParametersDto d14;
        AtumAnyActionDto.AtumVkApiRequestActionDto atumVkApiRequestActionDto4;
        AtumVkApiRequestActionParametersDto d15;
        List<AtumAnyActionDto> e2;
        Integer d16;
        AtumVkuiSuperAppTypeStatsParametersDto d17;
        AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto atumVkuiSuperAppTypeClickActionDto2;
        AtumVkuiSuperAppTypeStatsParametersDto d18;
        Integer d19;
        AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto atumVkuiSuperAppTypeClickActionDto3;
        AtumVkuiSuperAppTypeStatsParametersDto d20;
        Integer d21;
        WidgetIds widgetIds = aVar.a;
        String str8 = aVar.b;
        QueueSettings queueSettings = aVar.c;
        WidgetSettings widgetSettings = aVar.d;
        SuperAppWidgetSize superAppWidgetSize = SuperAppWidgetSize.REGULAR;
        AtumAnyViewDto.AtumViewDto d22 = d(superAppShowcaseUniversalFullWidthDto);
        Integer num = null;
        if (d22 != null) {
            AtumContainerViewPropsDto d23 = d22.d();
            if (d23 != null && (d = d23.d()) != null) {
                Object a0 = j5g.a0(d);
                AtumAnyViewDto.AtumVkuiLabelUniversalDto atumVkuiLabelUniversalDto = a0 instanceof AtumAnyViewDto.AtumVkuiLabelUniversalDto ? (AtumAnyViewDto.AtumVkuiLabelUniversalDto) a0 : null;
                if (atumVkuiLabelUniversalDto != null && (d2 = atumVkuiLabelUniversalDto.d()) != null) {
                    str = d2.d();
                    if (str != null) {
                        str2 = str;
                        d3 = d(superAppShowcaseUniversalFullWidthDto);
                        if (d3 != null) {
                            AtumContainerViewPropsDto d24 = d3.d();
                            if (d24 != null && (d4 = d24.d()) != null) {
                                d4.size();
                                AtumAnyViewDto atumAnyViewDto = d4.get(1);
                                AtumAnyViewDto.AtumVkuiLabelUniversalDto atumVkuiLabelUniversalDto2 = atumAnyViewDto instanceof AtumAnyViewDto.AtumVkuiLabelUniversalDto ? (AtumAnyViewDto.AtumVkuiLabelUniversalDto) atumAnyViewDto : null;
                                if (atumVkuiLabelUniversalDto2 != null && (d5 = atumVkuiLabelUniversalDto2.d()) != null) {
                                    str3 = d5.d();
                                    if (str3 != null) {
                                        str4 = str3;
                                        AtumAnyViewDto.AtumVkuiButtonUniversalDto c6 = c(superAppShowcaseUniversalFullWidthDto);
                                        String str9 = (c6 == null || (title = c6.d().getTitle()) == null) ? "" : title;
                                        AtumAnyViewDto.AtumVkuiButtonUniversalDto b4 = b(superAppShowcaseUniversalFullWidthDto);
                                        String str10 = (b4 == null || (title2 = b4.d().getTitle()) == null) ? "" : title2;
                                        c = c(superAppShowcaseUniversalFullWidthDto);
                                        if (c != null) {
                                            List<AtumVkuiAnyActionDto> d25 = c.d().d();
                                            if (d25 != null) {
                                                d25.size();
                                                AtumAnyActionDto d26 = d25.get(1).d();
                                                if (d26 instanceof AtumAnyActionDto.AtumVkApiRequestActionDto) {
                                                    atumVkApiRequestActionDto = (AtumAnyActionDto.AtumVkApiRequestActionDto) d26;
                                                    if (atumVkApiRequestActionDto != null && (d6 = atumVkApiRequestActionDto.d()) != null && (e = d6.e()) != null) {
                                                        e.size();
                                                        AtumAnyActionDto atumAnyActionDto = e.get(1);
                                                        AtumAnyActionDto.AtumVkuiSnackbarActionDto atumVkuiSnackbarActionDto = !(atumAnyActionDto instanceof AtumAnyActionDto.AtumVkuiSnackbarActionDto) ? (AtumAnyActionDto.AtumVkuiSnackbarActionDto) atumAnyActionDto : null;
                                                        title3 = (atumVkuiSnackbarActionDto != null || (d7 = atumVkuiSnackbarActionDto.d()) == null) ? null : d7.getTitle();
                                                        if (title3 != null) {
                                                            str5 = title3;
                                                            c2 = c(superAppShowcaseUniversalFullWidthDto);
                                                            if (c2 != null) {
                                                                List<AtumVkuiAnyActionDto> d27 = c2.d().d();
                                                                if (d27 != null) {
                                                                    d27.size();
                                                                    AtumAnyActionDto d28 = d27.get(1).d();
                                                                    if (d28 instanceof AtumAnyActionDto.AtumVkApiRequestActionDto) {
                                                                        atumVkApiRequestActionDto2 = (AtumAnyActionDto.AtumVkApiRequestActionDto) d28;
                                                                        if (atumVkApiRequestActionDto2 != null && (d8 = atumVkApiRequestActionDto2.d()) != null && (d9 = d8.d()) != null) {
                                                                            d9.size();
                                                                            AtumAnyActionDto atumAnyActionDto2 = d9.get(1);
                                                                            AtumAnyActionDto.AtumVkuiSnackbarActionDto atumVkuiSnackbarActionDto2 = !(atumAnyActionDto2 instanceof AtumAnyActionDto.AtumVkuiSnackbarActionDto) ? (AtumAnyActionDto.AtumVkuiSnackbarActionDto) atumAnyActionDto2 : null;
                                                                            title4 = (atumVkuiSnackbarActionDto2 != null || (d10 = atumVkuiSnackbarActionDto2.d()) == null) ? null : d10.getTitle();
                                                                            if (title4 != null) {
                                                                                str6 = title4;
                                                                                b2 = b(superAppShowcaseUniversalFullWidthDto);
                                                                                if (b2 != null) {
                                                                                    List<AtumVkuiAnyActionDto> d29 = b2.d().d();
                                                                                    if (d29 != null) {
                                                                                        d29.size();
                                                                                        AtumAnyActionDto d30 = d29.get(1).d();
                                                                                        if (d30 instanceof AtumAnyActionDto.AtumOpenUrlActionDto) {
                                                                                            atumOpenUrlActionDto = (AtumAnyActionDto.AtumOpenUrlActionDto) d30;
                                                                                            if (atumOpenUrlActionDto != null && (d11 = atumOpenUrlActionDto.d()) != null && (url = d11.getUrl()) != null) {
                                                                                                str7 = url;
                                                                                                c3 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                if (c3 != null) {
                                                                                                    List<AtumVkuiAnyActionDto> d31 = c3.d().d();
                                                                                                    if (d31 != null) {
                                                                                                        Object a02 = j5g.a0(d31);
                                                                                                        AtumVkuiAnyActionDto atumVkuiAnyActionDto = a02 instanceof AtumVkuiAnyActionDto ? (AtumVkuiAnyActionDto) a02 : null;
                                                                                                        AtumAnyActionDto d32 = atumVkuiAnyActionDto != null ? atumVkuiAnyActionDto.d() : null;
                                                                                                        if (d32 instanceof AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto) {
                                                                                                            atumVkuiSuperAppTypeClickActionDto3 = (AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto) d32;
                                                                                                            if (atumVkuiSuperAppTypeClickActionDto3 != null && (d20 = atumVkuiSuperAppTypeClickActionDto3.d()) != null && (d21 = d20.d()) != null) {
                                                                                                                i = d21.intValue();
                                                                                                                b3 = b(superAppShowcaseUniversalFullWidthDto);
                                                                                                                if (b3 != null) {
                                                                                                                    List<AtumVkuiAnyActionDto> d33 = b3.d().d();
                                                                                                                    if (d33 != null) {
                                                                                                                        d33.size();
                                                                                                                        AtumVkuiAnyActionDto atumVkuiAnyActionDto2 = (AtumVkuiAnyActionDto) j5g.a0(d33);
                                                                                                                        AtumAnyActionDto d34 = atumVkuiAnyActionDto2 != null ? atumVkuiAnyActionDto2.d() : null;
                                                                                                                        if (d34 instanceof AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto) {
                                                                                                                            atumVkuiSuperAppTypeClickActionDto2 = (AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto) d34;
                                                                                                                            if (atumVkuiSuperAppTypeClickActionDto2 != null && (d18 = atumVkuiSuperAppTypeClickActionDto2.d()) != null && (d19 = d18.d()) != null) {
                                                                                                                                i2 = d19.intValue();
                                                                                                                                int i5 = i2;
                                                                                                                                c4 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                                                if (c4 != null) {
                                                                                                                                    List<AtumVkuiAnyActionDto> d35 = c4.d().d();
                                                                                                                                    if (d35 != null) {
                                                                                                                                        d35.size();
                                                                                                                                        AtumAnyActionDto d36 = d35.get(1).d();
                                                                                                                                        if (d36 instanceof AtumAnyActionDto.AtumVkApiRequestActionDto) {
                                                                                                                                            atumVkApiRequestActionDto4 = (AtumAnyActionDto.AtumVkApiRequestActionDto) d36;
                                                                                                                                            if (atumVkApiRequestActionDto4 != null && (d15 = atumVkApiRequestActionDto4.d()) != null && (e2 = d15.e()) != null) {
                                                                                                                                                Object a03 = j5g.a0(e2);
                                                                                                                                                AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto atumVkuiSuperAppTypeClickActionDto4 = !(a03 instanceof AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto) ? (AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto) a03 : null;
                                                                                                                                                d16 = (atumVkuiSuperAppTypeClickActionDto4 != null || (d17 = atumVkuiSuperAppTypeClickActionDto4.d()) == null) ? null : d17.d();
                                                                                                                                                if (d16 != null) {
                                                                                                                                                    i3 = d16.intValue();
                                                                                                                                                    int i6 = i3;
                                                                                                                                                    c5 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                                                                    if (c5 != null) {
                                                                                                                                                        List<AtumVkuiAnyActionDto> d37 = c5.d().d();
                                                                                                                                                        if (d37 != null) {
                                                                                                                                                            d37.size();
                                                                                                                                                            AtumAnyActionDto d38 = d37.get(1).d();
                                                                                                                                                            if (d38 instanceof AtumAnyActionDto.AtumVkApiRequestActionDto) {
                                                                                                                                                                atumVkApiRequestActionDto3 = (AtumAnyActionDto.AtumVkApiRequestActionDto) d38;
                                                                                                                                                                if (atumVkApiRequestActionDto3 != null && (d12 = atumVkApiRequestActionDto3.d()) != null && (d13 = d12.d()) != null) {
                                                                                                                                                                    Object a04 = j5g.a0(d13);
                                                                                                                                                                    atumVkuiSuperAppTypeClickActionDto = !(a04 instanceof AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto) ? (AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto) a04 : null;
                                                                                                                                                                    if (atumVkuiSuperAppTypeClickActionDto != null && (d14 = atumVkuiSuperAppTypeClickActionDto.d()) != null) {
                                                                                                                                                                        num = d14.d();
                                                                                                                                                                    }
                                                                                                                                                                    if (num != null) {
                                                                                                                                                                        i4 = num.intValue();
                                                                                                                                                                        return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i5, i6, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        atumVkApiRequestActionDto3 = null;
                                                                                                                                                        if (atumVkApiRequestActionDto3 != null) {
                                                                                                                                                            Object a042 = j5g.a0(d13);
                                                                                                                                                            if (!(a042 instanceof AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto)) {
                                                                                                                                                            }
                                                                                                                                                            if (atumVkuiSuperAppTypeClickActionDto != null) {
                                                                                                                                                                num = d14.d();
                                                                                                                                                            }
                                                                                                                                                            if (num != null) {
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    i4 = 4;
                                                                                                                                                    return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i5, i6, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    atumVkApiRequestActionDto4 = null;
                                                                                                                                    if (atumVkApiRequestActionDto4 != null) {
                                                                                                                                        Object a032 = j5g.a0(e2);
                                                                                                                                        if (!(a032 instanceof AtumAnyActionDto.AtumVkuiSuperAppTypeClickActionDto)) {
                                                                                                                                        }
                                                                                                                                        if (atumVkuiSuperAppTypeClickActionDto4 != null) {
                                                                                                                                        }
                                                                                                                                        if (d16 != null) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                i3 = 3;
                                                                                                                                int i62 = i3;
                                                                                                                                c5 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                                                if (c5 != null) {
                                                                                                                                }
                                                                                                                                i4 = 4;
                                                                                                                                return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i5, i62, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    atumVkuiSuperAppTypeClickActionDto2 = null;
                                                                                                                    if (atumVkuiSuperAppTypeClickActionDto2 != null) {
                                                                                                                        i2 = d19.intValue();
                                                                                                                        int i52 = i2;
                                                                                                                        c4 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                                        if (c4 != null) {
                                                                                                                        }
                                                                                                                        i3 = 3;
                                                                                                                        int i622 = i3;
                                                                                                                        c5 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                                        if (c5 != null) {
                                                                                                                        }
                                                                                                                        i4 = 4;
                                                                                                                        return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i52, i622, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                                                                                                    }
                                                                                                                }
                                                                                                                i2 = 2;
                                                                                                                int i522 = i2;
                                                                                                                c4 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                                if (c4 != null) {
                                                                                                                }
                                                                                                                i3 = 3;
                                                                                                                int i6222 = i3;
                                                                                                                c5 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                                if (c5 != null) {
                                                                                                                }
                                                                                                                i4 = 4;
                                                                                                                return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i522, i6222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    atumVkuiSuperAppTypeClickActionDto3 = null;
                                                                                                    if (atumVkuiSuperAppTypeClickActionDto3 != null) {
                                                                                                        i = d21.intValue();
                                                                                                        b3 = b(superAppShowcaseUniversalFullWidthDto);
                                                                                                        if (b3 != null) {
                                                                                                        }
                                                                                                        i2 = 2;
                                                                                                        int i5222 = i2;
                                                                                                        c4 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                        if (c4 != null) {
                                                                                                        }
                                                                                                        i3 = 3;
                                                                                                        int i62222 = i3;
                                                                                                        c5 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                        if (c5 != null) {
                                                                                                        }
                                                                                                        i4 = 4;
                                                                                                        return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i5222, i62222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                                                                                    }
                                                                                                }
                                                                                                i = 1;
                                                                                                b3 = b(superAppShowcaseUniversalFullWidthDto);
                                                                                                if (b3 != null) {
                                                                                                }
                                                                                                i2 = 2;
                                                                                                int i52222 = i2;
                                                                                                c4 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                if (c4 != null) {
                                                                                                }
                                                                                                i3 = 3;
                                                                                                int i622222 = i3;
                                                                                                c5 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                                if (c5 != null) {
                                                                                                }
                                                                                                i4 = 4;
                                                                                                return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i52222, i622222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    atumOpenUrlActionDto = null;
                                                                                    if (atumOpenUrlActionDto != null) {
                                                                                        str7 = url;
                                                                                        c3 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                        if (c3 != null) {
                                                                                        }
                                                                                        i = 1;
                                                                                        b3 = b(superAppShowcaseUniversalFullWidthDto);
                                                                                        if (b3 != null) {
                                                                                        }
                                                                                        i2 = 2;
                                                                                        int i522222 = i2;
                                                                                        c4 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                        if (c4 != null) {
                                                                                        }
                                                                                        i3 = 3;
                                                                                        int i6222222 = i3;
                                                                                        c5 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                        if (c5 != null) {
                                                                                        }
                                                                                        i4 = 4;
                                                                                        return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i522222, i6222222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                                                                    }
                                                                                }
                                                                                str7 = "";
                                                                                c3 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                if (c3 != null) {
                                                                                }
                                                                                i = 1;
                                                                                b3 = b(superAppShowcaseUniversalFullWidthDto);
                                                                                if (b3 != null) {
                                                                                }
                                                                                i2 = 2;
                                                                                int i5222222 = i2;
                                                                                c4 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                if (c4 != null) {
                                                                                }
                                                                                i3 = 3;
                                                                                int i62222222 = i3;
                                                                                c5 = c(superAppShowcaseUniversalFullWidthDto);
                                                                                if (c5 != null) {
                                                                                }
                                                                                i4 = 4;
                                                                                return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i5222222, i62222222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                atumVkApiRequestActionDto2 = null;
                                                                if (atumVkApiRequestActionDto2 != null) {
                                                                    d9.size();
                                                                    AtumAnyActionDto atumAnyActionDto22 = d9.get(1);
                                                                    if (!(atumAnyActionDto22 instanceof AtumAnyActionDto.AtumVkuiSnackbarActionDto)) {
                                                                    }
                                                                    if (atumVkuiSnackbarActionDto2 != null) {
                                                                    }
                                                                    if (title4 != null) {
                                                                    }
                                                                }
                                                            }
                                                            str6 = "";
                                                            b2 = b(superAppShowcaseUniversalFullWidthDto);
                                                            if (b2 != null) {
                                                            }
                                                            str7 = "";
                                                            c3 = c(superAppShowcaseUniversalFullWidthDto);
                                                            if (c3 != null) {
                                                            }
                                                            i = 1;
                                                            b3 = b(superAppShowcaseUniversalFullWidthDto);
                                                            if (b3 != null) {
                                                            }
                                                            i2 = 2;
                                                            int i52222222 = i2;
                                                            c4 = c(superAppShowcaseUniversalFullWidthDto);
                                                            if (c4 != null) {
                                                            }
                                                            i3 = 3;
                                                            int i622222222 = i3;
                                                            c5 = c(superAppShowcaseUniversalFullWidthDto);
                                                            if (c5 != null) {
                                                            }
                                                            i4 = 4;
                                                            return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i52222222, i622222222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                                        }
                                                    }
                                                }
                                            }
                                            atumVkApiRequestActionDto = null;
                                            if (atumVkApiRequestActionDto != null) {
                                                e.size();
                                                AtumAnyActionDto atumAnyActionDto3 = e.get(1);
                                                if (!(atumAnyActionDto3 instanceof AtumAnyActionDto.AtumVkuiSnackbarActionDto)) {
                                                }
                                                if (atumVkuiSnackbarActionDto != null) {
                                                }
                                                if (title3 != null) {
                                                }
                                            }
                                        }
                                        str5 = "";
                                        c2 = c(superAppShowcaseUniversalFullWidthDto);
                                        if (c2 != null) {
                                        }
                                        str6 = "";
                                        b2 = b(superAppShowcaseUniversalFullWidthDto);
                                        if (b2 != null) {
                                        }
                                        str7 = "";
                                        c3 = c(superAppShowcaseUniversalFullWidthDto);
                                        if (c3 != null) {
                                        }
                                        i = 1;
                                        b3 = b(superAppShowcaseUniversalFullWidthDto);
                                        if (b3 != null) {
                                        }
                                        i2 = 2;
                                        int i522222222 = i2;
                                        c4 = c(superAppShowcaseUniversalFullWidthDto);
                                        if (c4 != null) {
                                        }
                                        i3 = 3;
                                        int i6222222222 = i3;
                                        c5 = c(superAppShowcaseUniversalFullWidthDto);
                                        if (c5 != null) {
                                        }
                                        i4 = 4;
                                        return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i522222222, i6222222222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                                    }
                                }
                            }
                            str3 = null;
                            if (str3 != null) {
                            }
                        }
                        str4 = "";
                        AtumAnyViewDto.AtumVkuiButtonUniversalDto c62 = c(superAppShowcaseUniversalFullWidthDto);
                        if (c62 == null) {
                            AtumAnyViewDto.AtumVkuiButtonUniversalDto b42 = b(superAppShowcaseUniversalFullWidthDto);
                            if (b42 == null) {
                                c = c(superAppShowcaseUniversalFullWidthDto);
                                if (c != null) {
                                }
                                str5 = "";
                                c2 = c(superAppShowcaseUniversalFullWidthDto);
                                if (c2 != null) {
                                }
                                str6 = "";
                                b2 = b(superAppShowcaseUniversalFullWidthDto);
                                if (b2 != null) {
                                }
                                str7 = "";
                                c3 = c(superAppShowcaseUniversalFullWidthDto);
                                if (c3 != null) {
                                }
                                i = 1;
                                b3 = b(superAppShowcaseUniversalFullWidthDto);
                                if (b3 != null) {
                                }
                                i2 = 2;
                                int i5222222222 = i2;
                                c4 = c(superAppShowcaseUniversalFullWidthDto);
                                if (c4 != null) {
                                }
                                i3 = 3;
                                int i62222222222 = i3;
                                c5 = c(superAppShowcaseUniversalFullWidthDto);
                                if (c5 != null) {
                                }
                                i4 = 4;
                                return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i5222222222, i62222222222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                            }
                            c = c(superAppShowcaseUniversalFullWidthDto);
                            if (c != null) {
                            }
                            str5 = "";
                            c2 = c(superAppShowcaseUniversalFullWidthDto);
                            if (c2 != null) {
                            }
                            str6 = "";
                            b2 = b(superAppShowcaseUniversalFullWidthDto);
                            if (b2 != null) {
                            }
                            str7 = "";
                            c3 = c(superAppShowcaseUniversalFullWidthDto);
                            if (c3 != null) {
                            }
                            i = 1;
                            b3 = b(superAppShowcaseUniversalFullWidthDto);
                            if (b3 != null) {
                            }
                            i2 = 2;
                            int i52222222222 = i2;
                            c4 = c(superAppShowcaseUniversalFullWidthDto);
                            if (c4 != null) {
                            }
                            i3 = 3;
                            int i622222222222 = i3;
                            c5 = c(superAppShowcaseUniversalFullWidthDto);
                            if (c5 != null) {
                            }
                            i4 = 4;
                            return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i52222222222, i622222222222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                        }
                        AtumAnyViewDto.AtumVkuiButtonUniversalDto b422 = b(superAppShowcaseUniversalFullWidthDto);
                        if (b422 == null) {
                        }
                        c = c(superAppShowcaseUniversalFullWidthDto);
                        if (c != null) {
                        }
                        str5 = "";
                        c2 = c(superAppShowcaseUniversalFullWidthDto);
                        if (c2 != null) {
                        }
                        str6 = "";
                        b2 = b(superAppShowcaseUniversalFullWidthDto);
                        if (b2 != null) {
                        }
                        str7 = "";
                        c3 = c(superAppShowcaseUniversalFullWidthDto);
                        if (c3 != null) {
                        }
                        i = 1;
                        b3 = b(superAppShowcaseUniversalFullWidthDto);
                        if (b3 != null) {
                        }
                        i2 = 2;
                        int i522222222222 = i2;
                        c4 = c(superAppShowcaseUniversalFullWidthDto);
                        if (c4 != null) {
                        }
                        i3 = 3;
                        int i6222222222222 = i3;
                        c5 = c(superAppShowcaseUniversalFullWidthDto);
                        if (c5 != null) {
                        }
                        i4 = 4;
                        return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i522222222222, i6222222222222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
                    }
                }
            }
            str = null;
            if (str != null) {
            }
        }
        str2 = "";
        d3 = d(superAppShowcaseUniversalFullWidthDto);
        if (d3 != null) {
        }
        str4 = "";
        AtumAnyViewDto.AtumVkuiButtonUniversalDto c622 = c(superAppShowcaseUniversalFullWidthDto);
        if (c622 == null) {
        }
        AtumAnyViewDto.AtumVkuiButtonUniversalDto b4222 = b(superAppShowcaseUniversalFullWidthDto);
        if (b4222 == null) {
        }
        c = c(superAppShowcaseUniversalFullWidthDto);
        if (c != null) {
        }
        str5 = "";
        c2 = c(superAppShowcaseUniversalFullWidthDto);
        if (c2 != null) {
        }
        str6 = "";
        b2 = b(superAppShowcaseUniversalFullWidthDto);
        if (b2 != null) {
        }
        str7 = "";
        c3 = c(superAppShowcaseUniversalFullWidthDto);
        if (c3 != null) {
        }
        i = 1;
        b3 = b(superAppShowcaseUniversalFullWidthDto);
        if (b3 != null) {
        }
        i2 = 2;
        int i5222222222222 = i2;
        c4 = c(superAppShowcaseUniversalFullWidthDto);
        if (c4 != null) {
        }
        i3 = 3;
        int i62222222222222 = i3;
        c5 = c(superAppShowcaseUniversalFullWidthDto);
        if (c5 != null) {
        }
        i4 = 4;
        return new SuperAppShowcaseConfirmNumberWidget(widgetIds, str8, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppShowcaseConfirmNumberWidget.Payload(str2, str4, str9, str10, str5, str6, str7, i, i5222222222222, i62222222222222, i4, new WidgetBasePayload(superAppShowcaseUniversalFullWidthDto.r(), superAppShowcaseUniversalFullWidthDto.e(), null, null, HeaderRightImageType.NONE)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.ArrayList] */
    public final SuperAppWidgetTile.Payload g(SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto, String str, float f, List<? extends SuperAppShowcaseTileForegroundDto> list, SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto) {
        TileBackground tileBackground;
        TileBadgeInfo tileBadgeInfo;
        TileBottomContent tileBottomContent;
        TileBottomContent tileBottomContent2;
        ?? r13;
        boolean z = superAppShowcaseTileBackgroundDto instanceof SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundIconDto;
        WidgetObjects widgetObjects = this.a;
        TileBadgeInfo tileBadgeInfo2 = null;
        if (z) {
            SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundIconDto superAppShowcaseTileBackgroundIconDto = (SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundIconDto) superAppShowcaseTileBackgroundDto;
            WebImage k = ks20.k(superAppShowcaseTileBackgroundIconDto.d(), widgetObjects);
            if (k != null) {
                tileBackground = new TileBackground(null, new TileBackgroundImage(k, ks20.d(superAppShowcaseTileBackgroundIconDto.d()), ks20.g(superAppShowcaseTileBackgroundIconDto.d())), null, null, 13, null);
            }
            tileBackground = null;
        } else if (superAppShowcaseTileBackgroundDto instanceof SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundIconGridDto) {
            List<SuperAppUniversalWidgetImageBlockDto> d = ((SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundIconGridDto) superAppShowcaseTileBackgroundDto).d();
            ArrayList arrayList = new ArrayList();
            for (SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto : d) {
                WebImage k2 = ks20.k(superAppUniversalWidgetImageBlockDto, widgetObjects);
                TileBackgroundImage tileBackgroundImage = k2 != null ? new TileBackgroundImage(k2, ks20.d(superAppUniversalWidgetImageBlockDto), ks20.g(superAppUniversalWidgetImageBlockDto)) : null;
                if (tileBackgroundImage != null) {
                    arrayList.add(tileBackgroundImage);
                }
            }
            tileBackground = new TileBackground(arrayList, null, null, null, 14, null);
        } else if (superAppShowcaseTileBackgroundDto instanceof SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundBackImageDto) {
            SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundBackImageDto superAppShowcaseTileBackgroundBackImageDto = (SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundBackImageDto) superAppShowcaseTileBackgroundDto;
            WebImage k3 = ks20.k(superAppShowcaseTileBackgroundBackImageDto.d(), widgetObjects);
            if (k3 != null) {
                tileBackground = new TileBackground(null, null, new TileBackgroundImage(k3, ks20.d(superAppShowcaseTileBackgroundBackImageDto.d()), ks20.g(superAppShowcaseTileBackgroundBackImageDto.d())), null, 11, null);
            }
            tileBackground = null;
        } else {
            if (superAppShowcaseTileBackgroundDto instanceof SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundIconOverlapsDto) {
                SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundIconOverlapsDto superAppShowcaseTileBackgroundIconOverlapsDto = (SuperAppShowcaseTileBackgroundDto.SuperAppShowcaseTileBackgroundIconOverlapsDto) superAppShowcaseTileBackgroundDto;
                WebImage k4 = ks20.k(superAppShowcaseTileBackgroundIconOverlapsDto.d(), widgetObjects);
                WebImage k5 = ks20.k(superAppShowcaseTileBackgroundIconOverlapsDto.e(), widgetObjects);
                if (k4 != null && k5 != null) {
                    tileBackground = new TileBackground(null, null, null, new OverlapIcons(new TileBackgroundImage(k4, ks20.d(superAppShowcaseTileBackgroundIconOverlapsDto.d()), ks20.g(superAppShowcaseTileBackgroundIconOverlapsDto.d())), new TileBackgroundImage(k5, ks20.d(superAppShowcaseTileBackgroundIconOverlapsDto.e()), ks20.g(superAppShowcaseTileBackgroundIconOverlapsDto.e())), superAppShowcaseTileBackgroundIconOverlapsDto.f()), 7, null);
                }
            }
            tileBackground = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            for (SuperAppShowcaseTileForegroundDto superAppShowcaseTileForegroundDto : list) {
                if (superAppShowcaseTileForegroundDto instanceof SuperAppShowcaseTileForegroundDto.SuperAppShowcaseTileForegroundTextDto) {
                    SuperAppShowcaseTileForegroundDto.SuperAppShowcaseTileForegroundTextDto superAppShowcaseTileForegroundTextDto = (SuperAppShowcaseTileForegroundDto.SuperAppShowcaseTileForegroundTextDto) superAppShowcaseTileForegroundDto;
                    tileBottomContent2 = new TileBottomContent(superAppShowcaseTileForegroundTextDto.d() == SuperAppShowcaseTileForegroundDto.SuperAppShowcaseTileForegroundTextDto.StyleDto.PRIMARY ? TileBottomContent.BottomContentType.TITLE : TileBottomContent.BottomContentType.SUBTITLE, superAppShowcaseTileForegroundTextDto.e(), null, null, false, false, 60, null);
                } else {
                    if (superAppShowcaseTileForegroundDto instanceof SuperAppShowcaseTileForegroundDto.SuperAppShowcaseTileForegroundButtonDto) {
                        TileBottomContent.BottomContentType bottomContentType = TileBottomContent.BottomContentType.BUTTON;
                        SuperAppShowcaseTileForegroundDto.SuperAppShowcaseTileForegroundButtonDto superAppShowcaseTileForegroundButtonDto = (SuperAppShowcaseTileForegroundDto.SuperAppShowcaseTileForegroundButtonDto) superAppShowcaseTileForegroundDto;
                        String f2 = superAppShowcaseTileForegroundButtonDto.f();
                        String str2 = f2 == null ? "" : f2;
                        List<SuperAppUniversalWidgetImageItemDto> e = superAppShowcaseTileForegroundButtonDto.e();
                        if (e != null) {
                            List<SuperAppUniversalWidgetImageItemDto> list2 = e;
                            r13 = new ArrayList(c5g.u(list2, 10));
                            for (SuperAppUniversalWidgetImageItemDto superAppUniversalWidgetImageItemDto : list2) {
                                r13.add(new WebImageSize(superAppUniversalWidgetImageItemDto.getUrl(), superAppUniversalWidgetImageItemDto.getHeight(), superAppUniversalWidgetImageItemDto.getWidth(), (char) 0, false, Boolean.FALSE, 24, null));
                            }
                        } else {
                            r13 = EmptyList.b;
                        }
                        List singletonList = Collections.singletonList(new ImageWithAction(new WebImage((List<WebImageSize>) r13), null, 2, null));
                        SuperAppUniversalWidgetActionDto d2 = superAppShowcaseTileForegroundButtonDto.d();
                        SuperAppUniversalWidgetActionDto d3 = superAppShowcaseTileForegroundButtonDto.d();
                        bpn0 bpn0Var = pdx0.a;
                        WebAction b2 = pdx0.b(d2, d3);
                        Boolean g = superAppShowcaseTileForegroundButtonDto.g();
                        boolean booleanValue = g != null ? g.booleanValue() : false;
                        Boolean i = superAppShowcaseTileForegroundButtonDto.i();
                        tileBottomContent = new TileBottomContent(bottomContentType, str2, singletonList, b2, booleanValue, i != null ? i.booleanValue() : false);
                    } else {
                        if (!(superAppShowcaseTileForegroundDto instanceof SuperAppShowcaseTileForegroundDto.SuperAppShowcaseTileForegroundUserStackDto)) {
                            throw new IllegalArgumentException("Unknown foreground: " + superAppShowcaseTileForegroundDto);
                        }
                        TileBottomContent.BottomContentType bottomContentType2 = TileBottomContent.BottomContentType.USER_STACK;
                        SuperAppShowcaseTileForegroundDto.SuperAppShowcaseTileForegroundUserStackDto superAppShowcaseTileForegroundUserStackDto = (SuperAppShowcaseTileForegroundDto.SuperAppShowcaseTileForegroundUserStackDto) superAppShowcaseTileForegroundDto;
                        String e2 = superAppShowcaseTileForegroundUserStackDto.e();
                        String str3 = e2 == null ? "" : e2;
                        List<SuperAppUniversalWidgetImageBlockDto> d4 = superAppShowcaseTileForegroundUserStackDto.d();
                        ArrayList arrayList3 = new ArrayList();
                        for (SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto2 : d4) {
                            WebImage k6 = ks20.k(superAppUniversalWidgetImageBlockDto2, widgetObjects);
                            ImageWithAction imageWithAction = k6 != null ? new ImageWithAction(k6, ks20.a(superAppUniversalWidgetImageBlockDto2)) : null;
                            if (imageWithAction != null) {
                                arrayList3.add(imageWithAction);
                            }
                        }
                        tileBottomContent = new TileBottomContent(bottomContentType2, str3, arrayList3, null, false, false, 56, null);
                    }
                    tileBottomContent2 = tileBottomContent;
                }
                arrayList2.add(tileBottomContent2);
            }
        }
        if (superAppShowcaseBadgeDto instanceof SuperAppShowcaseBadgeDto.SuperAppShowcaseBadgeDiscountDto) {
            tileBadgeInfo = new TileBadgeInfo(TileBadgeInfo.BadgeType.DISCOUNT, String.valueOf(((SuperAppShowcaseBadgeDto.SuperAppShowcaseBadgeDiscountDto) superAppShowcaseBadgeDto).d()), null, null, 12, null);
        } else {
            if (!(superAppShowcaseBadgeDto instanceof SuperAppShowcaseBadgeDto.SuperAppShowcaseBadgeNewDto)) {
                if (superAppShowcaseBadgeDto instanceof SuperAppShowcaseBadgeDto.SuperAppShowcaseBadgeTextDto) {
                    SuperAppShowcaseBadgeDto.SuperAppShowcaseBadgeTextDto superAppShowcaseBadgeTextDto = (SuperAppShowcaseBadgeDto.SuperAppShowcaseBadgeTextDto) superAppShowcaseBadgeDto;
                    tileBadgeInfo2 = new TileBadgeInfo(TileBadgeInfo.BadgeType.TEXT, superAppShowcaseBadgeTextDto.e(), superAppShowcaseBadgeTextDto.f(), superAppShowcaseBadgeTextDto.d());
                }
                return new SuperAppWidgetTile.Payload(tileBackground, arrayList2, tileBadgeInfo2, ks20.m(superAppUniversalWidgetActionDto), new WidgetBasePayload(str, f, null, null, HeaderRightImageType.NONE));
            }
            tileBadgeInfo = new TileBadgeInfo(TileBadgeInfo.BadgeType.NEW, null, null, null, 14, null);
        }
        tileBadgeInfo2 = tileBadgeInfo;
        return new SuperAppWidgetTile.Payload(tileBackground, arrayList2, tileBadgeInfo2, ks20.m(superAppUniversalWidgetActionDto), new WidgetBasePayload(str, f, null, null, HeaderRightImageType.NONE));
    }

    public final SuperAppWidget i(SuperAppShowcaseItemDto superAppShowcaseItemDto) {
        WidgetSettings widgetSettings;
        WidgetIds widgetIds = new WidgetIds(superAppShowcaseItemDto.g(), -1, "", "");
        String lowerCase = superAppShowcaseItemDto.f().name().toLowerCase(Locale.ROOT);
        QueueSettings queueSettings = new QueueSettings(false, false);
        Long d = superAppShowcaseItemDto.d();
        if (d != null) {
            widgetSettings = new WidgetSettings(WidgetFlags.IS_ENABLED.a(d.longValue()), WidgetFlags.IS_UNREMOVABLE.a(d.longValue()), WidgetFlags.IS_SKIP_ANALYTIC.a(d.longValue()), WidgetFlags.HAS_TAB_DOT.a(d.longValue()));
        } else {
            Boolean i = superAppShowcaseItemDto.i();
            boolean booleanValue = i != null ? i.booleanValue() : true;
            Boolean j = superAppShowcaseItemDto.j();
            widgetSettings = new WidgetSettings(booleanValue, j != null ? j.booleanValue() : true, false, false, 12, null);
        }
        return k(new a(widgetIds, lowerCase, queueSettings, widgetSettings), superAppShowcaseItemDto.e());
    }

    public final enx0 j(a aVar, SuperAppShowcaseItemInnerDto superAppShowcaseItemInnerDto) {
        MiniWidgetItem.HeaderIconAlign headerIconAlign;
        WebImage webImage;
        if (superAppShowcaseItemInnerDto instanceof SuperAppShowcaseItemInnerDto.SuperAppCustomMenuItemDto) {
            SuperAppShowcaseItemInnerDto.SuperAppCustomMenuItemDto superAppCustomMenuItemDto = (SuperAppShowcaseItemInnerDto.SuperAppCustomMenuItemDto) superAppShowcaseItemInnerDto;
            String m = cqm0.m(superAppCustomMenuItemDto.l().name());
            String j = superAppCustomMenuItemDto.j();
            String str = j == null ? "" : j;
            String n = superAppCustomMenuItemDto.n();
            String r = superAppCustomMenuItemDto.r();
            String str2 = r == null ? "" : r;
            String title = superAppCustomMenuItemDto.getTitle();
            String str3 = title == null ? "" : title;
            SuperAppBadgeInfoDto f = superAppCustomMenuItemDto.f();
            BadgeInfo h = f != null ? h(f) : null;
            List<String> k = superAppCustomMenuItemDto.k();
            List<String> g = superAppCustomMenuItemDto.g();
            List<String> e = superAppCustomMenuItemDto.e();
            List<BaseImageDto> i = superAppCustomMenuItemDto.i();
            if (i != null) {
                List<BaseImageDto> list = i;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (BaseImageDto baseImageDto : list) {
                    arrayList.add(new WebImageSize(baseImageDto.getUrl(), baseImageDto.getHeight(), baseImageDto.getWidth(), (char) 0, false, baseImageDto.e(), 24, null));
                }
                webImage = new WebImage(arrayList);
            } else {
                webImage = null;
            }
            SuperAppUniversalWidgetActionDto d = superAppCustomMenuItemDto.d();
            return new CustomMenuInfo(m, str, n, str2, str3, h, k, g, e, webImage, d != null ? ks20.m(d) : null);
        }
        if (!(superAppShowcaseItemInnerDto instanceof SuperAppShowcaseItemInnerDto.SuperAppMiniWidgetItemDto)) {
            if (superAppShowcaseItemInnerDto instanceof SuperAppShowcaseItemInnerDto.SuperAppShowcasePromoDto) {
                SuperAppShowcaseItemInnerDto.SuperAppShowcasePromoDto superAppShowcasePromoDto = (SuperAppShowcaseItemInnerDto.SuperAppShowcasePromoDto) superAppShowcaseItemInnerDto;
                return new SuperAppShowcasePromoWidget(aVar.a, aVar.b, SuperAppWidgetSize.REGULAR, aVar.c, aVar.d, new SuperAppShowcasePromoWidget.Payload(ks20.n(superAppShowcasePromoDto.e().d()), ks20.m(superAppShowcasePromoDto.d()), new WidgetBasePayload(superAppShowcasePromoDto.r(), superAppShowcasePromoDto.f(), null, null, HeaderRightImageType.NONE)));
            }
            if (!(superAppShowcaseItemInnerDto instanceof SuperAppShowcaseItemInnerDto.SuperAppShowcaseSubscribeTileDto)) {
                if (superAppShowcaseItemInnerDto instanceof SuperAppShowcaseItemInnerDto.SuperAppShowcaseTileDto) {
                    SuperAppShowcaseItemInnerDto.SuperAppShowcaseTileDto superAppShowcaseTileDto = (SuperAppShowcaseItemInnerDto.SuperAppShowcaseTileDto) superAppShowcaseItemInnerDto;
                    return new SuperAppWidgetTile(aVar.a, aVar.b, SuperAppWidgetSize.REGULAR, aVar.c, aVar.d, g(superAppShowcaseTileDto.d(), superAppShowcaseTileDto.e(), superAppShowcaseTileDto.r(), superAppShowcaseTileDto.i(), superAppShowcaseTileDto.g(), superAppShowcaseTileDto.f()));
                }
                throw new IllegalArgumentException("Unknown widget: " + superAppShowcaseItemInnerDto);
            }
            SuperAppShowcaseItemInnerDto.SuperAppShowcaseSubscribeTileDto superAppShowcaseSubscribeTileDto = (SuperAppShowcaseItemInnerDto.SuperAppShowcaseSubscribeTileDto) superAppShowcaseItemInnerDto;
            WidgetIds widgetIds = aVar.a;
            String str4 = aVar.b;
            QueueSettings queueSettings = aVar.c;
            WidgetSettings widgetSettings = aVar.d;
            SuperAppWidgetSize superAppWidgetSize = SuperAppWidgetSize.REGULAR;
            qwm0 qwm0Var = (qwm0) this.b.getValue();
            qwm0Var.getClass();
            return new SuperAppWidgetSubscribeTile(widgetIds, str4, superAppWidgetSize, queueSettings, widgetSettings, new SuperAppWidgetSubscribeTile.Payload(new SubscribeTileIcon(ks20.k(superAppShowcaseSubscribeTileDto.i(), qwm0Var.a), ks20.d(superAppShowcaseSubscribeTileDto.i()), ks20.i(superAppShowcaseSubscribeTileDto.i())), ks20.m(superAppShowcaseSubscribeTileDto.d()), ks20.m(superAppShowcaseSubscribeTileDto.f()), ks20.n(superAppShowcaseSubscribeTileDto.e()), qwm0Var.a(superAppShowcaseSubscribeTileDto.g()), new WidgetBasePayload("", ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, null, HeaderRightImageType.NONE)));
        }
        SuperAppShowcaseItemInnerDto.SuperAppMiniWidgetItemDto superAppMiniWidgetItemDto = (SuperAppShowcaseItemInnerDto.SuperAppMiniWidgetItemDto) superAppShowcaseItemInnerDto;
        SuperAppShowcaseItemInnerDto.SuperAppMiniWidgetItemDto.HeaderIconAlignDto k2 = superAppMiniWidgetItemDto.k();
        int i2 = k2 == null ? -1 : b.$EnumSwitchMapping$1[k2.ordinal()];
        if (i2 == -1) {
            headerIconAlign = MiniWidgetItem.HeaderIconAlign.UNKNOWN;
        } else if (i2 == 1) {
            headerIconAlign = MiniWidgetItem.HeaderIconAlign.TOP;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            headerIconAlign = MiniWidgetItem.HeaderIconAlign.BOTTOM;
        }
        MiniWidgetItem.HeaderIconAlign headerIconAlign2 = headerIconAlign;
        int i3 = b.$EnumSwitchMapping$2[superAppMiniWidgetItemDto.o().ordinal()];
        if (i3 == 1) {
            String i4 = superAppMiniWidgetItemDto.o().i();
            String p = superAppMiniWidgetItemDto.p();
            Boolean B = superAppMiniWidgetItemDto.B();
            boolean booleanValue = B != null ? B.booleanValue() : true;
            WebAction m2 = ks20.m(superAppMiniWidgetItemDto.d());
            List<SuperAppUniversalWidgetImageItemDto> j2 = superAppMiniWidgetItemDto.j();
            WebImage n2 = j2 != null ? ks20.n(j2) : null;
            String i5 = superAppMiniWidgetItemDto.i();
            String str5 = i5 == null ? "" : i5;
            String g2 = superAppMiniWidgetItemDto.g();
            String str6 = g2 == null ? "" : g2;
            String e2 = superAppMiniWidgetItemDto.e();
            return new ExchangeMiniWidget(i4, m2, n2, headerIconAlign2, p, booleanValue, str5, str6, e2 == null ? "" : e2, Double.parseDouble(String.valueOf(superAppMiniWidgetItemDto.f().floatValue())));
        }
        if (i3 == 2) {
            String i6 = superAppMiniWidgetItemDto.o().i();
            String p2 = superAppMiniWidgetItemDto.p();
            WebAction m3 = ks20.m(superAppMiniWidgetItemDto.d());
            List<SuperAppUniversalWidgetImageItemDto> j3 = superAppMiniWidgetItemDto.j();
            WebImage n3 = j3 != null ? ks20.n(j3) : null;
            SuperAppUniversalWidgetTextBlockDto n4 = superAppMiniWidgetItemDto.n();
            String d2 = n4 != null ? n4.d() : null;
            return new SettingsMiniWidget(i6, m3, n3, headerIconAlign2, p2, d2 == null ? "" : d2);
        }
        String i7 = superAppMiniWidgetItemDto.o().i();
        String p3 = superAppMiniWidgetItemDto.p();
        Boolean B2 = superAppMiniWidgetItemDto.B();
        boolean booleanValue2 = B2 != null ? B2.booleanValue() : true;
        WebAction m4 = ks20.m(superAppMiniWidgetItemDto.d());
        List<SuperAppUniversalWidgetImageItemDto> j4 = superAppMiniWidgetItemDto.j();
        WebImage n5 = j4 != null ? ks20.n(j4) : null;
        SuperAppUniversalWidgetTextBlockDto n6 = superAppMiniWidgetItemDto.n();
        String d3 = n6 != null ? n6.d() : null;
        String str7 = d3 == null ? "" : d3;
        SuperAppUniversalWidgetTextBlockDto l = superAppMiniWidgetItemDto.l();
        String d4 = l != null ? l.d() : null;
        return new DefaultMiniWidget(i7, m4, n5, headerIconAlign2, p3, booleanValue2, epx.f(superAppMiniWidgetItemDto.u(), Boolean.TRUE), str7, d4 == null ? "" : d4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r19v16, types: [com.vk.superapp.ui.widgets.miniwidgets.SettingsMiniWidget] */
    /* JADX WARN: Type inference failed for: r19v17, types: [com.vk.superapp.ui.widgets.miniwidgets.DefaultMiniWidget] */
    /* JADX WARN: Type inference failed for: r26v11, types: [com.vk.superapp.ui.widgets.tile.SuperAppWidgetTile] */
    /* JADX WARN: Type inference failed for: r26v8, types: [com.vk.superapp.ui.widgets.tile.SuperAppWidgetMarketProductTile] */
    /* JADX WARN: Type inference failed for: r26v9, types: [com.vk.superapp.ui.widgets.subscribe_tile.SuperAppWidgetSubscribeTile] */
    public final SuperAppWidget k(a aVar, SuperAppShowcaseItemPayloadDto superAppShowcaseItemPayloadDto) {
        WidgetSettings widgetSettings;
        SuperAppShowcaseItemPayloadDto.SuperAppShowcaseServicesMenuDto superAppShowcaseServicesMenuDto;
        char c;
        WebImage webImage;
        ?? r14;
        TileBottomContent tileBottomContent;
        ?? r15;
        SuperAppShowcaseSectionPosterWidget.Payload.BottomContent bottomContent;
        WidgetSettings widgetSettings2;
        ArrayList arrayList;
        knx0 knx0Var;
        QueueSettings queueSettings;
        SuperAppMoreTile superAppMoreTile;
        ImageBlock.Style style;
        WidgetSettings widgetSettings3;
        ImageBlock imageBlock;
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto;
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionOpenNativeAppDto;
        MiniWidgetItem.HeaderIconAlign headerIconAlign;
        ExchangeMiniWidget exchangeMiniWidget;
        WebAction webAction = null;
        if (superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppMiniWidgetsDto) {
            SuperAppShowcaseItemPayloadDto.SuperAppMiniWidgetsDto superAppMiniWidgetsDto = (SuperAppShowcaseItemPayloadDto.SuperAppMiniWidgetsDto) superAppShowcaseItemPayloadDto;
            WidgetIds widgetIds = aVar.a;
            String str = aVar.b;
            QueueSettings queueSettings2 = aVar.c;
            WidgetSettings widgetSettings4 = aVar.d;
            ArrayList arrayList2 = new ArrayList();
            List<SuperAppMiniWidgetItemDto> f = superAppMiniWidgetsDto.f();
            if (f == null) {
                f = EmptyList.b;
            }
            for (SuperAppMiniWidgetItemDto superAppMiniWidgetItemDto : f) {
                SuperAppMiniWidgetItemDto.HeaderIconAlignDto k = superAppMiniWidgetItemDto.k();
                int i = k == null ? -1 : b.$EnumSwitchMapping$3[k.ordinal()];
                if (i == -1) {
                    headerIconAlign = MiniWidgetItem.HeaderIconAlign.UNKNOWN;
                } else if (i == 1) {
                    headerIconAlign = MiniWidgetItem.HeaderIconAlign.TOP;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    headerIconAlign = MiniWidgetItem.HeaderIconAlign.BOTTOM;
                }
                MiniWidgetItem.HeaderIconAlign headerIconAlign2 = headerIconAlign;
                int i2 = b.$EnumSwitchMapping$4[superAppMiniWidgetItemDto.o().ordinal()];
                if (i2 == 1) {
                    String i3 = superAppMiniWidgetItemDto.o().i();
                    String p = superAppMiniWidgetItemDto.p();
                    Boolean B = superAppMiniWidgetItemDto.B();
                    boolean booleanValue = B != null ? B.booleanValue() : true;
                    WebAction m = ks20.m(superAppMiniWidgetItemDto.d());
                    List<SuperAppUniversalWidgetImageItemDto> j = superAppMiniWidgetItemDto.j();
                    WebImage n = j != null ? ks20.n(j) : null;
                    String i4 = superAppMiniWidgetItemDto.i();
                    String str2 = i4 == null ? "" : i4;
                    String g = superAppMiniWidgetItemDto.g();
                    String str3 = g == null ? "" : g;
                    String e = superAppMiniWidgetItemDto.e();
                    exchangeMiniWidget = new ExchangeMiniWidget(i3, m, n, headerIconAlign2, p, booleanValue, str2, str3, e == null ? "" : e, Double.parseDouble(String.valueOf(superAppMiniWidgetItemDto.f().floatValue())));
                } else if (i2 != 2) {
                    String i5 = superAppMiniWidgetItemDto.o().i();
                    String p2 = superAppMiniWidgetItemDto.p();
                    Boolean B2 = superAppMiniWidgetItemDto.B();
                    boolean booleanValue2 = B2 != null ? B2.booleanValue() : true;
                    WebAction m2 = ks20.m(superAppMiniWidgetItemDto.d());
                    List<SuperAppUniversalWidgetImageItemDto> j2 = superAppMiniWidgetItemDto.j();
                    WebImage n2 = j2 != null ? ks20.n(j2) : null;
                    SuperAppUniversalWidgetTextBlockDto n3 = superAppMiniWidgetItemDto.n();
                    String d = n3 != null ? n3.d() : null;
                    String str4 = d == null ? "" : d;
                    SuperAppUniversalWidgetTextBlockDto l = superAppMiniWidgetItemDto.l();
                    String d2 = l != null ? l.d() : null;
                    exchangeMiniWidget = new DefaultMiniWidget(i5, m2, n2, headerIconAlign2, p2, booleanValue2, epx.f(superAppMiniWidgetItemDto.u(), Boolean.TRUE), str4, d2 == null ? "" : d2);
                } else {
                    String i6 = superAppMiniWidgetItemDto.o().i();
                    String p3 = superAppMiniWidgetItemDto.p();
                    WebAction m3 = ks20.m(superAppMiniWidgetItemDto.d());
                    List<SuperAppUniversalWidgetImageItemDto> j3 = superAppMiniWidgetItemDto.j();
                    WebImage n4 = j3 != null ? ks20.n(j3) : null;
                    SuperAppUniversalWidgetTextBlockDto n5 = superAppMiniWidgetItemDto.n();
                    String d3 = n5 != null ? n5.d() : null;
                    exchangeMiniWidget = new SettingsMiniWidget(i6, m3, n4, headerIconAlign2, p3, d3 == null ? "" : d3);
                }
                arrayList2.add(exchangeMiniWidget);
            }
            String r = superAppMiniWidgetsDto.r();
            String str5 = r == null ? "" : r;
            double floatValue = superAppMiniWidgetsDto.g() != null ? r3.floatValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            SuperAppUniversalWidgetAdditionalHeaderIconDto d4 = superAppMiniWidgetsDto.d();
            SuperAppMiniWidget.Payload payload = new SuperAppMiniWidget.Payload(arrayList2, new WidgetBasePayload(str5, floatValue, null, d4 != null ? ks20.b(d4, superAppMiniWidgetsDto) : null, ks20.c(superAppMiniWidgetsDto.e())));
            int i7 = b.$EnumSwitchMapping$0[superAppMiniWidgetsDto.i().ordinal()];
            return new SuperAppMiniWidget(widgetIds, str, queueSettings2, widgetSettings4, payload, i7 != 1 ? i7 != 2 ? SuperAppMiniWidget.WidgetSize.BIG : SuperAppMiniWidget.WidgetSize.SMALL : SuperAppMiniWidget.WidgetSize.BIG);
        }
        if (superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppWidgetShowcaseMenuDto) {
            SuperAppShowcaseItemPayloadDto.SuperAppWidgetShowcaseMenuDto superAppWidgetShowcaseMenuDto = (SuperAppShowcaseItemPayloadDto.SuperAppWidgetShowcaseMenuDto) superAppShowcaseItemPayloadDto;
            WidgetIds widgetIds2 = aVar.a;
            String str6 = aVar.b;
            QueueSettings queueSettings3 = aVar.c;
            WidgetSettings widgetSettings5 = aVar.d;
            SuperAppWidgetSize superAppWidgetSize = SuperAppWidgetSize.REGULAR;
            List<SuperAppCustomMenuItemDto> g2 = superAppWidgetShowcaseMenuDto.g();
            ArrayList arrayList3 = new ArrayList(c5g.u(g2, 10));
            Iterator it = g2.iterator();
            while (it.hasNext()) {
                arrayList3.add(f((SuperAppCustomMenuItemDto) it.next()));
            }
            SuperAppCustomMenuItemDto e2 = superAppWidgetShowcaseMenuDto.e();
            CustomMenuInfo f2 = e2 != null ? f(e2) : null;
            String r2 = superAppWidgetShowcaseMenuDto.r();
            String str7 = r2 == null ? "" : r2;
            double floatValue2 = superAppWidgetShowcaseMenuDto.i() != null ? r6.floatValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            SuperAppUniversalWidgetAdditionalHeaderIconDto d5 = superAppWidgetShowcaseMenuDto.d();
            return new SuperAppWidgetCustomMenu(widgetIds2, str6, superAppWidgetSize, queueSettings3, widgetSettings5, new SuperAppWidgetCustomMenu.Payload(arrayList3, false, new WidgetBasePayload(str7, floatValue2, null, d5 != null ? ks20.b(d5, superAppWidgetShowcaseMenuDto) : null, ks20.c(superAppWidgetShowcaseMenuDto.f())), f2));
        }
        if (superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppShowcaseTileDto) {
            SuperAppShowcaseItemPayloadDto.SuperAppShowcaseTileDto superAppShowcaseTileDto = (SuperAppShowcaseItemPayloadDto.SuperAppShowcaseTileDto) superAppShowcaseItemPayloadDto;
            return new SuperAppWidgetTile(aVar.a, aVar.b, SuperAppWidgetSize.REGULAR, aVar.c, aVar.d, g(superAppShowcaseTileDto.d(), superAppShowcaseTileDto.e(), superAppShowcaseTileDto.r(), superAppShowcaseTileDto.i(), superAppShowcaseTileDto.g(), superAppShowcaseTileDto.f()));
        }
        knx0 knx0Var2 = this;
        if (superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppWidgetOnboardingPanelDto) {
            SuperAppShowcaseItemPayloadDto.SuperAppWidgetOnboardingPanelDto superAppWidgetOnboardingPanelDto = (SuperAppShowcaseItemPayloadDto.SuperAppWidgetOnboardingPanelDto) superAppShowcaseItemPayloadDto;
            WidgetIds widgetIds3 = aVar.a;
            String str8 = aVar.b;
            QueueSettings queueSettings4 = aVar.c;
            WidgetSettings widgetSettings6 = aVar.d;
            String r3 = superAppWidgetOnboardingPanelDto.r();
            double floatValue3 = superAppWidgetOnboardingPanelDto.j() != null ? r5.floatValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            WebImage n6 = ks20.n(superAppWidgetOnboardingPanelDto.f());
            List<String> g3 = superAppWidgetOnboardingPanelDto.g();
            String title = superAppWidgetOnboardingPanelDto.getTitle();
            String i8 = superAppWidgetOnboardingPanelDto.i();
            boolean e3 = superAppWidgetOnboardingPanelDto.e();
            SuperAppWidgetOnboardingPanelActionDto d6 = superAppWidgetOnboardingPanelDto.d();
            if (d6 instanceof SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionVkInternalDto) {
                SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionVkInternalDto superAppUniversalWidgetActionVkInternalDto = (SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionVkInternalDto) d6;
                superAppUniversalWidgetActionDto = new SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionVkInternalDto(SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionVkInternalDto.TypeDto.VK_INTERNAL, superAppUniversalWidgetActionVkInternalDto.e(), superAppUniversalWidgetActionVkInternalDto.f(), superAppUniversalWidgetActionVkInternalDto.d());
            } else {
                if (d6 instanceof SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionOpenAppDto) {
                    SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionOpenAppDto superAppUniversalWidgetActionOpenAppDto = (SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionOpenAppDto) d6;
                    superAppUniversalWidgetActionOpenNativeAppDto = new SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenAppDto(SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenAppDto.TypeDto.valueOf(superAppUniversalWidgetActionOpenAppDto.g().name()), superAppUniversalWidgetActionOpenAppDto.e(), superAppUniversalWidgetActionOpenAppDto.getUrl(), superAppUniversalWidgetActionOpenAppDto.f(), superAppUniversalWidgetActionOpenAppDto.d(), null, 32, null);
                } else if (d6 instanceof SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionOpenUrlDto) {
                    SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionOpenUrlDto superAppUniversalWidgetActionOpenUrlDto = (SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionOpenUrlDto) d6;
                    superAppUniversalWidgetActionDto = new SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenUrlDto(SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenUrlDto.TypeDto.OPEN_URL, superAppUniversalWidgetActionOpenUrlDto.getUrl(), superAppUniversalWidgetActionOpenUrlDto.e(), superAppUniversalWidgetActionOpenUrlDto.d());
                } else if (d6 instanceof SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionShareMeDto) {
                    superAppUniversalWidgetActionDto = new SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionShareMeDto(SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionShareMeDto.TypeDto.SHARE_ME, ((SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionShareMeDto) d6).d());
                } else if (d6 instanceof SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionOpenNativeAppDto) {
                    SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionOpenNativeAppDto superAppUniversalWidgetActionOpenNativeAppDto2 = (SuperAppWidgetOnboardingPanelActionDto.SuperAppUniversalWidgetActionOpenNativeAppDto) d6;
                    superAppUniversalWidgetActionOpenNativeAppDto = new SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenNativeAppDto(SuperAppUniversalWidgetActionDto.SuperAppUniversalWidgetActionOpenNativeAppDto.TypeDto.OPEN_NATIVE_APP, superAppUniversalWidgetActionOpenNativeAppDto2.g(), superAppUniversalWidgetActionOpenNativeAppDto2.e(), superAppUniversalWidgetActionOpenNativeAppDto2.f(), superAppUniversalWidgetActionOpenNativeAppDto2.d());
                } else {
                    superAppUniversalWidgetActionDto = null;
                }
                superAppUniversalWidgetActionDto = superAppUniversalWidgetActionOpenNativeAppDto;
            }
            if (superAppUniversalWidgetActionDto != null) {
                bpn0 bpn0Var = pdx0.a;
                webAction = pdx0.b(superAppUniversalWidgetActionDto, null);
            }
            return new SuperAppWidgetOnboardingPanel(widgetIds3, str8, queueSettings4, widgetSettings6, r3, floatValue3, n6, title, g3, i8, e3, webAction);
        }
        if (superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppShowcasePromoDto) {
            SuperAppShowcaseItemPayloadDto.SuperAppShowcasePromoDto superAppShowcasePromoDto = (SuperAppShowcaseItemPayloadDto.SuperAppShowcasePromoDto) superAppShowcaseItemPayloadDto;
            SuperAppShowcasePromoWidget superAppShowcasePromoWidget = new SuperAppShowcasePromoWidget(aVar.a, aVar.b, SuperAppWidgetSize.REGULAR, aVar.c, aVar.d, new SuperAppShowcasePromoWidget.Payload(ks20.n(superAppShowcasePromoDto.e().d()), ks20.m(superAppShowcasePromoDto.d()), new WidgetBasePayload(superAppShowcasePromoDto.r(), superAppShowcasePromoDto.g(), null, null, HeaderRightImageType.NONE)));
            superAppShowcasePromoWidget.i = superAppShowcasePromoDto.f();
            return superAppShowcasePromoWidget;
        }
        boolean z = superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppShowcaseScrollDto;
        WidgetObjects widgetObjects = knx0Var2.a;
        if (z) {
            SuperAppShowcaseItemPayloadDto.SuperAppShowcaseScrollDto superAppShowcaseScrollDto = (SuperAppShowcaseItemPayloadDto.SuperAppShowcaseScrollDto) superAppShowcaseItemPayloadDto;
            WidgetIds widgetIds4 = aVar.a;
            String str9 = aVar.b;
            SuperAppWidgetSize superAppWidgetSize2 = SuperAppWidgetSize.REGULAR;
            QueueSettings queueSettings5 = aVar.c;
            WidgetSettings widgetSettings7 = aVar.d;
            String e4 = superAppShowcaseScrollDto.e();
            List<SuperAppShowcaseScrollItemDto> f3 = superAppShowcaseScrollDto.f();
            ArrayList arrayList4 = new ArrayList(c5g.u(f3, 10));
            for (SuperAppShowcaseScrollItemDto superAppShowcaseScrollItemDto : f3) {
                String g4 = superAppShowcaseScrollItemDto.g();
                String title2 = superAppShowcaseScrollItemDto.getTitle();
                SuperAppUniversalWidgetImageBlockDto e5 = superAppShowcaseScrollItemDto.e();
                if (e5 instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) {
                    WebImage k2 = ks20.k(e5, widgetObjects);
                    SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto superAppUniversalWidgetImageEntityDto = (SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) e5;
                    SuperAppUniversalWidgetImageStyleDto f4 = superAppUniversalWidgetImageEntityDto.f();
                    ImageBlock.Style h = f4 != null ? ks20.h(f4) : new ImageBlock.Style(ImageBlock.Style.Size.SMALL, ImageBlock.Style.Outline.SQUARE, VerticalAlign.TOP);
                    SuperAppUniversalWidgetActionDto d7 = superAppUniversalWidgetImageEntityDto.d();
                    widgetSettings3 = widgetSettings7;
                    imageBlock = new ImageBlock(k2, h, d7 != null ? ks20.m(d7) : null, (String) null, 8, (zcl) null);
                } else {
                    if (!(e5 instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto)) {
                        throw new IllegalArgumentException("Unknown ImageBlock: " + e5);
                    }
                    SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto superAppUniversalWidgetImageInlineDto = (SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) e5;
                    WebImage n7 = ks20.n(superAppUniversalWidgetImageInlineDto.e());
                    SuperAppUniversalWidgetImageStyleDto g5 = superAppUniversalWidgetImageInlineDto.g();
                    if (g5 != null) {
                        style = ks20.h(g5);
                        widgetSettings3 = widgetSettings7;
                    } else {
                        widgetSettings3 = widgetSettings7;
                        style = new ImageBlock.Style(ImageBlock.Style.Size.SMALL, ImageBlock.Style.Outline.SQUARE, VerticalAlign.TOP);
                    }
                    SuperAppUniversalWidgetActionDto d8 = superAppUniversalWidgetImageInlineDto.d();
                    imageBlock = new ImageBlock(n7, style, d8 != null ? ks20.m(d8) : null, superAppUniversalWidgetImageInlineDto.f());
                }
                WebAction m4 = ks20.m(superAppShowcaseScrollItemDto.d());
                SuperAppShowcaseScrollWidget.Payload.ScrollItem.ImageStyle imageStyle = superAppShowcaseScrollItemDto.f() == SuperAppShowcaseScrollItemDto.ImageStyleDto.CIRCLE ? SuperAppShowcaseScrollWidget.Payload.ScrollItem.ImageStyle.CIRCLE : SuperAppShowcaseScrollWidget.Payload.ScrollItem.ImageStyle.SQUARE;
                SuperAppUniversalWidgetImageBlockDto e6 = superAppShowcaseScrollItemDto.e();
                arrayList4.add(new SuperAppShowcaseScrollWidget.Payload.ScrollItem(g4, title2, imageBlock.b, m4, imageStyle, ((e6 instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) && (((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) e6).i() instanceof SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconVideoLiveDto)) ? SubIcon.VideoLive.b : null));
                widgetSettings7 = widgetSettings3;
            }
            return new SuperAppShowcaseScrollWidget(widgetIds4, str9, superAppWidgetSize2, queueSettings5, widgetSettings7, new SuperAppShowcaseScrollWidget.Payload(e4, arrayList4, ks20.m(superAppShowcaseScrollDto.d()), new WidgetBasePayload(superAppShowcaseScrollDto.r(), superAppShowcaseScrollDto.g(), null, null, HeaderRightImageType.NONE)));
        }
        if (superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppShowcaseSectionScrollDto) {
            SuperAppShowcaseItemPayloadDto.SuperAppShowcaseSectionScrollDto superAppShowcaseSectionScrollDto = (SuperAppShowcaseItemPayloadDto.SuperAppShowcaseSectionScrollDto) superAppShowcaseItemPayloadDto;
            WidgetIds widgetIds5 = aVar.a;
            String str10 = aVar.b;
            SuperAppWidgetSize superAppWidgetSize3 = SuperAppWidgetSize.REGULAR;
            QueueSettings queueSettings6 = aVar.c;
            WidgetSettings widgetSettings8 = aVar.d;
            String title3 = superAppShowcaseSectionScrollDto.getTitle();
            String g6 = superAppShowcaseSectionScrollDto.g();
            SuperAppUniversalWidgetActionDto d9 = superAppShowcaseSectionScrollDto.d();
            WebAction m5 = d9 != null ? ks20.m(d9) : null;
            SuperAppShowcaseSectionScrollAdInfoDto e7 = superAppShowcaseSectionScrollDto.e();
            AdInfo adInfo = e7 != null ? new AdInfo(e7.e(), new WebActionOpenUrl(e7.d(), WebActionOpenUrl.Target.f43default, null, null, false, 0L, "open_url", 48, null)) : null;
            List<SuperAppShowcaseSectionScrollItemDto> f5 = superAppShowcaseSectionScrollDto.f();
            ArrayList arrayList5 = new ArrayList(c5g.u(f5, 10));
            for (SuperAppShowcaseSectionScrollItemDto superAppShowcaseSectionScrollItemDto : f5) {
                if (superAppShowcaseSectionScrollItemDto instanceof SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseTileDto) {
                    SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseTileDto superAppShowcaseTileDto2 = (SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseTileDto) superAppShowcaseSectionScrollItemDto;
                    String j4 = superAppShowcaseTileDto2.j();
                    if (j4 == null) {
                        j4 = "";
                    }
                    arrayList = arrayList5;
                    widgetSettings2 = widgetSettings8;
                    knx0 knx0Var3 = knx0Var2;
                    queueSettings = queueSettings6;
                    knx0Var = knx0Var3;
                    superAppMoreTile = new SuperAppWidgetTile(new WidgetIds(j4, -1, "", ""), superAppShowcaseTileDto2.i().name().toLowerCase(Locale.ROOT), SuperAppWidgetSize.REGULAR, new QueueSettings(false, false), new WidgetSettings(true, false, false, false, 12, null), knx0Var3.g(superAppShowcaseTileDto2.d(), superAppShowcaseTileDto2.e(), superAppShowcaseTileDto2.r(), superAppShowcaseTileDto2.k(), superAppShowcaseTileDto2.g(), superAppShowcaseTileDto2.f()));
                } else {
                    widgetSettings2 = widgetSettings8;
                    arrayList = arrayList5;
                    knx0Var = knx0Var2;
                    queueSettings = queueSettings6;
                    if (superAppShowcaseSectionScrollItemDto instanceof SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseSubscribeTileDto) {
                        SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseSubscribeTileDto superAppShowcaseSubscribeTileDto = (SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseSubscribeTileDto) superAppShowcaseSectionScrollItemDto;
                        WidgetIds widgetIds6 = new WidgetIds(superAppShowcaseSubscribeTileDto.k(), -1, "", "");
                        String lowerCase = superAppShowcaseSubscribeTileDto.j().name().toLowerCase(Locale.ROOT);
                        SuperAppWidgetSize superAppWidgetSize4 = SuperAppWidgetSize.REGULAR;
                        QueueSettings queueSettings7 = new QueueSettings(false, false);
                        WidgetSettings widgetSettings9 = new WidgetSettings(true, false, false, false, 12, null);
                        qwm0 qwm0Var = (qwm0) knx0Var.b.getValue();
                        qwm0Var.getClass();
                        superAppMoreTile = new SuperAppWidgetSubscribeTile(widgetIds6, lowerCase, superAppWidgetSize4, queueSettings7, widgetSettings9, new SuperAppWidgetSubscribeTile.Payload(new SubscribeTileIcon(ks20.k(superAppShowcaseSubscribeTileDto.i(), qwm0Var.a), ks20.d(superAppShowcaseSubscribeTileDto.i()), ks20.i(superAppShowcaseSubscribeTileDto.i())), ks20.m(superAppShowcaseSubscribeTileDto.d()), ks20.m(superAppShowcaseSubscribeTileDto.f()), ks20.n(superAppShowcaseSubscribeTileDto.e()), qwm0Var.a(superAppShowcaseSubscribeTileDto.g()), new WidgetBasePayload("", ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, null, HeaderRightImageType.NONE)));
                    } else {
                        boolean z2 = superAppShowcaseSectionScrollItemDto instanceof SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseMarketTileDto;
                        bpn0 bpn0Var2 = knx0Var.e;
                        if (z2) {
                            SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseMarketTileDto superAppShowcaseMarketTileDto = (SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseMarketTileDto) superAppShowcaseSectionScrollItemDto;
                            String k3 = superAppShowcaseMarketTileDto.k();
                            if (k3 == null) {
                                k3 = "";
                            }
                            WidgetIds widgetIds7 = new WidgetIds(k3, -1, "", "");
                            String lowerCase2 = superAppShowcaseMarketTileDto.j().name().toLowerCase(Locale.ROOT);
                            SuperAppWidgetSize superAppWidgetSize5 = SuperAppWidgetSize.REGULAR;
                            QueueSettings queueSettings8 = new QueueSettings(false, false);
                            WidgetSettings widgetSettings10 = new WidgetSettings(true, false, false, false, 12, null);
                            ((b2i0) bpn0Var2.getValue()).getClass();
                            WebAction m6 = ks20.m(superAppShowcaseMarketTileDto.d());
                            WebImage n8 = ks20.n(superAppShowcaseMarketTileDto.e());
                            List<SuperAppShowcaseMarketTileForegroundDto> g7 = superAppShowcaseMarketTileDto.g();
                            MarketTileInfo marketTileInfo = new MarketTileInfo("", "", null);
                            if (g7 != null) {
                                for (SuperAppShowcaseMarketTileForegroundDto superAppShowcaseMarketTileForegroundDto : g7) {
                                    if (superAppShowcaseMarketTileForegroundDto instanceof SuperAppShowcaseMarketTileForegroundDto.SuperAppShowcaseTileForegroundTextDto) {
                                        marketTileInfo = MarketTileInfo.a(marketTileInfo, ((SuperAppShowcaseMarketTileForegroundDto.SuperAppShowcaseTileForegroundTextDto) superAppShowcaseMarketTileForegroundDto).d(), null, null, 6);
                                    } else {
                                        if (!(superAppShowcaseMarketTileForegroundDto instanceof SuperAppShowcaseMarketTileForegroundDto.SuperAppShowcaseTileForegroundPriceDto)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        SuperAppShowcaseMarketTileForegroundDto.SuperAppShowcaseTileForegroundPriceDto superAppShowcaseTileForegroundPriceDto = (SuperAppShowcaseMarketTileForegroundDto.SuperAppShowcaseTileForegroundPriceDto) superAppShowcaseMarketTileForegroundDto;
                                        int i9 = b2i0.a.$EnumSwitchMapping$0[superAppShowcaseTileForegroundPriceDto.d().ordinal()];
                                        if (i9 == 1) {
                                            marketTileInfo = MarketTileInfo.a(marketTileInfo, null, superAppShowcaseTileForegroundPriceDto.e(), null, 5);
                                        } else {
                                            if (i9 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            marketTileInfo = MarketTileInfo.a(marketTileInfo, null, null, superAppShowcaseTileForegroundPriceDto.e(), 3);
                                        }
                                    }
                                }
                            }
                            superAppMoreTile = new SuperAppWidgetMarketProductTile(widgetIds7, lowerCase2, superAppWidgetSize5, queueSettings8, widgetSettings10, new SuperAppWidgetMarketProductTile.Payload(m6, n8, marketTileInfo, superAppShowcaseMarketTileDto.n(), superAppShowcaseMarketTileDto.f(), new WidgetBasePayload(superAppShowcaseMarketTileDto.r(), superAppShowcaseMarketTileDto.l(), null, null, HeaderRightImageType.NONE), superAppShowcaseMarketTileDto.i()));
                        } else {
                            if (!(superAppShowcaseSectionScrollItemDto instanceof SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseActionTileDto)) {
                                throw new IllegalArgumentException("Unknown nested widget type: " + superAppShowcaseSectionScrollItemDto);
                            }
                            SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseActionTileDto superAppShowcaseActionTileDto = (SuperAppShowcaseSectionScrollItemDto.SuperAppShowcaseActionTileDto) superAppShowcaseSectionScrollItemDto;
                            String f6 = superAppShowcaseActionTileDto.f();
                            if (f6 == null) {
                                f6 = "";
                            }
                            WidgetIds widgetIds8 = new WidgetIds(f6, -1, "", "");
                            String lowerCase3 = superAppShowcaseActionTileDto.e().name().toLowerCase(Locale.ROOT);
                            SuperAppWidgetSize superAppWidgetSize6 = SuperAppWidgetSize.REGULAR;
                            QueueSettings queueSettings9 = new QueueSettings(false, false);
                            WidgetSettings widgetSettings11 = new WidgetSettings(true, false, false, false, 12, null);
                            ((b2i0) bpn0Var2.getValue()).getClass();
                            superAppMoreTile = new SuperAppMoreTile(widgetIds8, lowerCase3, superAppWidgetSize6, queueSettings9, widgetSettings11, new SuperAppMoreTile.Payload(ks20.m(superAppShowcaseActionTileDto.d()), new WidgetBasePayload(superAppShowcaseActionTileDto.r(), superAppShowcaseActionTileDto.g(), null, null, HeaderRightImageType.NONE)));
                        }
                    }
                }
                ArrayList arrayList6 = arrayList;
                arrayList6.add(superAppMoreTile);
                arrayList5 = arrayList6;
                queueSettings6 = queueSettings;
                widgetSettings8 = widgetSettings2;
                knx0Var2 = knx0Var;
            }
            return new SuperAppShowcaseSectionScrollWidget(widgetIds5, str10, superAppWidgetSize3, queueSettings6, widgetSettings8, new SuperAppShowcaseSectionScrollWidget.Payload(title3, g6, m5, adInfo, arrayList5, new WidgetBasePayload(superAppShowcaseSectionScrollDto.r(), superAppShowcaseSectionScrollDto.i(), null, null, HeaderRightImageType.NONE)));
        }
        if (superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppShowcaseSectionPosterDto) {
            SuperAppShowcaseItemPayloadDto.SuperAppShowcaseSectionPosterDto superAppShowcaseSectionPosterDto = (SuperAppShowcaseItemPayloadDto.SuperAppShowcaseSectionPosterDto) superAppShowcaseItemPayloadDto;
            WidgetIds widgetIds9 = aVar.a;
            String str11 = aVar.b;
            SuperAppWidgetSize superAppWidgetSize7 = SuperAppWidgetSize.REGULAR;
            QueueSettings queueSettings10 = aVar.c;
            WidgetSettings widgetSettings12 = aVar.d;
            String title4 = superAppShowcaseSectionPosterDto.getTitle();
            WebAction m7 = ks20.m(superAppShowcaseSectionPosterDto.d());
            WebImage n9 = ks20.n(superAppShowcaseSectionPosterDto.e());
            SuperAppShowcaseSectionPosterUserStackDto f7 = superAppShowcaseSectionPosterDto.f();
            if (f7 != null) {
                String e8 = f7.e();
                List<SuperAppUniversalWidgetImageBlockDto> d10 = f7.d();
                ArrayList arrayList7 = new ArrayList();
                for (SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto : d10) {
                    WebImage k4 = ks20.k(superAppUniversalWidgetImageBlockDto, widgetObjects);
                    ImageWithAction imageWithAction = k4 != null ? new ImageWithAction(k4, ks20.a(superAppUniversalWidgetImageBlockDto)) : null;
                    if (imageWithAction != null) {
                        arrayList7.add(imageWithAction);
                    }
                }
                bottomContent = new SuperAppShowcaseSectionPosterWidget.Payload.BottomContent(e8, arrayList7);
            } else {
                bottomContent = null;
            }
            return new SuperAppShowcaseSectionPosterWidget(widgetIds9, str11, superAppWidgetSize7, queueSettings10, widgetSettings12, new SuperAppShowcaseSectionPosterWidget.Payload(title4, m7, n9, bottomContent, new WidgetBasePayload(superAppShowcaseSectionPosterDto.r(), superAppShowcaseSectionPosterDto.g(), null, null, HeaderRightImageType.NONE)));
        }
        if (!(superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppShowcaseSectionVideoBannerDto)) {
            if (!(superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppShowcaseServicesMenuDto)) {
                if (superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppShowcaseHalfTileDto) {
                    SuperAppShowcaseItemPayloadDto.SuperAppShowcaseHalfTileDto superAppShowcaseHalfTileDto = (SuperAppShowcaseItemPayloadDto.SuperAppShowcaseHalfTileDto) superAppShowcaseItemPayloadDto;
                    return new SuperAppWidgetHalfTile(aVar.a, aVar.b, SuperAppWidgetSize.REGULAR, aVar.c, aVar.d, new SuperAppWidgetHalfTile.Payload(ks20.m(superAppShowcaseHalfTileDto.d()), ((vsu) knx0Var2.d.getValue()).a(superAppShowcaseHalfTileDto.e()), new WidgetBasePayload(superAppShowcaseHalfTileDto.r(), superAppShowcaseHalfTileDto.f(), null, null, HeaderRightImageType.NONE)));
                }
                if (superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppShowcaseWidgetTextDto) {
                    return new SuperAppTextWidget(aVar.a, aVar.b, SuperAppWidgetSize.REGULAR, aVar.c, aVar.d, new SuperAppTextWidget.Payload(((SuperAppShowcaseItemPayloadDto.SuperAppShowcaseWidgetTextDto) superAppShowcaseItemPayloadDto).d(), new WidgetBasePayload("", r1.e(), null, null, HeaderRightImageType.NONE)));
                }
                if (superAppShowcaseItemPayloadDto instanceof SuperAppShowcaseItemPayloadDto.SuperAppShowcaseUniversalFullWidthDto) {
                    return l(aVar, (SuperAppShowcaseItemPayloadDto.SuperAppShowcaseUniversalFullWidthDto) superAppShowcaseItemPayloadDto);
                }
                throw new IllegalArgumentException("Unknown widget: " + superAppShowcaseItemPayloadDto);
            }
            SuperAppShowcaseItemPayloadDto.SuperAppShowcaseServicesMenuDto superAppShowcaseServicesMenuDto2 = (SuperAppShowcaseItemPayloadDto.SuperAppShowcaseServicesMenuDto) superAppShowcaseItemPayloadDto;
            WidgetIds widgetIds10 = aVar.a;
            String str12 = aVar.b;
            QueueSettings queueSettings11 = aVar.c;
            WidgetSettings widgetSettings13 = aVar.d;
            SuperAppWidgetSize superAppWidgetSize8 = SuperAppWidgetSize.REGULAR;
            List<SuperAppShowcaseServicesMenuItemDto> d11 = superAppShowcaseServicesMenuDto2.d();
            SuperAppShowcaseServicesMenuMoreItemDto e9 = superAppShowcaseServicesMenuDto2.e();
            ArrayList arrayList8 = new ArrayList();
            List<SuperAppShowcaseServicesMenuItemDto> list = d11;
            ArrayList arrayList9 = new ArrayList(c5g.u(list, 10));
            for (SuperAppShowcaseServicesMenuItemDto superAppShowcaseServicesMenuItemDto : list) {
                SuperAppShowcaseServicesMenuItemIconDto f8 = superAppShowcaseServicesMenuItemDto.f();
                String d12 = f8 instanceof SuperAppShowcaseServicesMenuItemIconDto.SuperAppShowcaseServicesMenuItemIconIdDto ? ((SuperAppShowcaseServicesMenuItemIconDto.SuperAppShowcaseServicesMenuItemIconIdDto) f8).d() : null;
                if (f8 instanceof SuperAppShowcaseServicesMenuItemIconDto.SuperAppShowcaseServicesMenuItemIconImageDto) {
                    List<SuperAppUniversalWidgetImageItemDto> d13 = ((SuperAppShowcaseServicesMenuItemIconDto.SuperAppShowcaseServicesMenuItemIconImageDto) f8).d();
                    if (d13 != null) {
                        List<SuperAppUniversalWidgetImageItemDto> list2 = d13;
                        widgetSettings = widgetSettings13;
                        superAppShowcaseServicesMenuDto = superAppShowcaseServicesMenuDto2;
                        c = '\n';
                        r14 = new ArrayList(c5g.u(list2, 10));
                        for (SuperAppUniversalWidgetImageItemDto superAppUniversalWidgetImageItemDto : list2) {
                            r14.add(new WebImageSize(superAppUniversalWidgetImageItemDto.getUrl(), superAppUniversalWidgetImageItemDto.getHeight(), superAppUniversalWidgetImageItemDto.getWidth(), (char) 0, false, Boolean.FALSE, 24, null));
                        }
                    } else {
                        widgetSettings = widgetSettings13;
                        superAppShowcaseServicesMenuDto = superAppShowcaseServicesMenuDto2;
                        c = '\n';
                        r14 = EmptyList.b;
                    }
                    webImage = new WebImage((List<WebImageSize>) r14);
                } else {
                    widgetSettings = widgetSettings13;
                    superAppShowcaseServicesMenuDto = superAppShowcaseServicesMenuDto2;
                    c = '\n';
                    webImage = null;
                }
                Pair pair = new Pair(d12, webImage);
                arrayList9.add(new SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem(SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType.DEFAULT_ITEM, superAppShowcaseServicesMenuItemDto.i(), superAppShowcaseServicesMenuItemDto.g(), superAppShowcaseServicesMenuItemDto.r(), superAppShowcaseServicesMenuItemDto.getTitle(), (WebImage) pair.j(), (String) pair.i(), ks20.m(superAppShowcaseServicesMenuItemDto.d()), e(superAppShowcaseServicesMenuItemDto.e())));
                superAppShowcaseServicesMenuDto2 = superAppShowcaseServicesMenuDto;
                widgetSettings13 = widgetSettings;
            }
            WidgetSettings widgetSettings14 = widgetSettings13;
            SuperAppShowcaseItemPayloadDto.SuperAppShowcaseServicesMenuDto superAppShowcaseServicesMenuDto3 = superAppShowcaseServicesMenuDto2;
            arrayList8.addAll(arrayList9);
            SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType expandableMenuItemType = SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType.MORE_ITEM;
            String e10 = e9.e();
            String r4 = e9.r();
            String title5 = e9.getTitle();
            arrayList8.add(new SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem(expandableMenuItemType, e10, "", r4, title5 == null ? "" : title5, null, null, null, e(e9.d())));
            String r5 = superAppShowcaseServicesMenuDto3.r();
            return new SuperAppShowcaseExpandableServiceMenu(widgetIds10, str12, superAppWidgetSize8, queueSettings11, widgetSettings14, new SuperAppShowcaseExpandableServiceMenu.Payload(arrayList8, new WidgetBasePayload(r5 == null ? "" : r5, superAppShowcaseServicesMenuDto3.f(), null, null, HeaderRightImageType.NONE)));
        }
        SuperAppShowcaseItemPayloadDto.SuperAppShowcaseSectionVideoBannerDto superAppShowcaseSectionVideoBannerDto = (SuperAppShowcaseItemPayloadDto.SuperAppShowcaseSectionVideoBannerDto) superAppShowcaseItemPayloadDto;
        WidgetIds widgetIds11 = aVar.a;
        String str13 = aVar.b;
        SuperAppWidgetSize superAppWidgetSize9 = SuperAppWidgetSize.REGULAR;
        QueueSettings queueSettings12 = aVar.c;
        WidgetSettings widgetSettings15 = aVar.d;
        z4s0 z4s0Var = (z4s0) knx0Var2.c.getValue();
        z4s0Var.getClass();
        String title6 = superAppShowcaseSectionVideoBannerDto.getTitle();
        WebAction m8 = ks20.m(superAppShowcaseSectionVideoBannerDto.d());
        WebImage n10 = ks20.n(superAppShowcaseSectionVideoBannerDto.f());
        List<SuperAppShowcaseSectionVideoBannerBottomDto> e11 = superAppShowcaseSectionVideoBannerDto.e();
        ArrayList arrayList10 = new ArrayList();
        if (e11 != null) {
            for (SuperAppShowcaseSectionVideoBannerBottomDto superAppShowcaseSectionVideoBannerBottomDto : e11) {
                if (superAppShowcaseSectionVideoBannerBottomDto instanceof SuperAppShowcaseSectionVideoBannerBottomDto.SuperAppShowcaseTileForegroundTextDto) {
                    SuperAppShowcaseSectionVideoBannerBottomDto.SuperAppShowcaseTileForegroundTextDto superAppShowcaseTileForegroundTextDto = (SuperAppShowcaseSectionVideoBannerBottomDto.SuperAppShowcaseTileForegroundTextDto) superAppShowcaseSectionVideoBannerBottomDto;
                    tileBottomContent = new TileBottomContent(superAppShowcaseTileForegroundTextDto.d() == SuperAppShowcaseSectionVideoBannerBottomDto.SuperAppShowcaseTileForegroundTextDto.StyleDto.PRIMARY ? TileBottomContent.BottomContentType.TITLE : TileBottomContent.BottomContentType.SUBTITLE, superAppShowcaseTileForegroundTextDto.e(), null, null, false, false, 60, null);
                } else if (superAppShowcaseSectionVideoBannerBottomDto instanceof SuperAppShowcaseSectionVideoBannerBottomDto.SuperAppShowcaseTileForegroundButtonDto) {
                    TileBottomContent.BottomContentType bottomContentType = TileBottomContent.BottomContentType.BUTTON;
                    SuperAppShowcaseSectionVideoBannerBottomDto.SuperAppShowcaseTileForegroundButtonDto superAppShowcaseTileForegroundButtonDto = (SuperAppShowcaseSectionVideoBannerBottomDto.SuperAppShowcaseTileForegroundButtonDto) superAppShowcaseSectionVideoBannerBottomDto;
                    String f9 = superAppShowcaseTileForegroundButtonDto.f();
                    String str14 = f9 == null ? "" : f9;
                    List<SuperAppUniversalWidgetImageItemDto> e12 = superAppShowcaseTileForegroundButtonDto.e();
                    if (e12 != null) {
                        List<SuperAppUniversalWidgetImageItemDto> list3 = e12;
                        r15 = new ArrayList(c5g.u(list3, 10));
                        for (SuperAppUniversalWidgetImageItemDto superAppUniversalWidgetImageItemDto2 : list3) {
                            r15.add(new WebImageSize(superAppUniversalWidgetImageItemDto2.getUrl(), superAppUniversalWidgetImageItemDto2.getHeight(), superAppUniversalWidgetImageItemDto2.getWidth(), (char) 0, false, Boolean.FALSE, 24, null));
                        }
                    } else {
                        r15 = EmptyList.b;
                    }
                    List singletonList = Collections.singletonList(new ImageWithAction(new WebImage((List<WebImageSize>) r15), null, 2, null));
                    SuperAppUniversalWidgetActionDto d14 = superAppShowcaseTileForegroundButtonDto.d();
                    SuperAppUniversalWidgetActionDto d15 = superAppShowcaseTileForegroundButtonDto.d();
                    bpn0 bpn0Var3 = pdx0.a;
                    WebAction b2 = pdx0.b(d14, d15);
                    Boolean g8 = superAppShowcaseTileForegroundButtonDto.g();
                    boolean booleanValue3 = g8 != null ? g8.booleanValue() : false;
                    Boolean i10 = superAppShowcaseTileForegroundButtonDto.i();
                    tileBottomContent = new TileBottomContent(bottomContentType, str14, singletonList, b2, booleanValue3, i10 != null ? i10.booleanValue() : false);
                } else {
                    if (!(superAppShowcaseSectionVideoBannerBottomDto instanceof SuperAppShowcaseSectionVideoBannerBottomDto.SuperAppShowcaseTileForegroundUserStackDto)) {
                        throw new IllegalArgumentException("Unknown foreground: " + superAppShowcaseSectionVideoBannerBottomDto);
                    }
                    TileBottomContent.BottomContentType bottomContentType2 = TileBottomContent.BottomContentType.USER_STACK;
                    SuperAppShowcaseSectionVideoBannerBottomDto.SuperAppShowcaseTileForegroundUserStackDto superAppShowcaseTileForegroundUserStackDto = (SuperAppShowcaseSectionVideoBannerBottomDto.SuperAppShowcaseTileForegroundUserStackDto) superAppShowcaseSectionVideoBannerBottomDto;
                    String e13 = superAppShowcaseTileForegroundUserStackDto.e();
                    String str15 = e13 == null ? "" : e13;
                    List<SuperAppUniversalWidgetImageBlockDto> d16 = superAppShowcaseTileForegroundUserStackDto.d();
                    ArrayList arrayList11 = new ArrayList();
                    for (SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto2 : d16) {
                        WebImage k5 = ks20.k(superAppUniversalWidgetImageBlockDto2, z4s0Var.a);
                        ImageWithAction imageWithAction2 = k5 != null ? new ImageWithAction(k5, ks20.a(superAppUniversalWidgetImageBlockDto2)) : null;
                        if (imageWithAction2 != null) {
                            arrayList11.add(imageWithAction2);
                        }
                    }
                    tileBottomContent = new TileBottomContent(bottomContentType2, str15, arrayList11, null, false, false, 56, null);
                }
                arrayList10.add(tileBottomContent);
            }
        }
        SuperAppShowcaseVideoBannerWidget superAppShowcaseVideoBannerWidget = new SuperAppShowcaseVideoBannerWidget(widgetIds11, str13, superAppWidgetSize9, queueSettings12, widgetSettings15, new SuperAppShowcaseVideoBannerWidget.Payload(title6, m8, n10, arrayList10, superAppShowcaseSectionVideoBannerDto.i(), new WidgetBasePayload(superAppShowcaseSectionVideoBannerDto.r(), superAppShowcaseSectionVideoBannerDto.j(), null, null, HeaderRightImageType.NONE)));
        superAppShowcaseVideoBannerWidget.i = superAppShowcaseSectionVideoBannerDto.g();
        return superAppShowcaseVideoBannerWidget;
    }

    /* compiled from: WidgetMapper.kt */
    public static final class a {
        public final WidgetIds a;
        public final String b;
        public final QueueSettings c;
        public final WidgetSettings d;

        public a(WidgetIds widgetIds) {
            this(widgetIds, "", new QueueSettings(false, false), new WidgetSettings(true, false, false, false, 12, null));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + bzk0.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            return "BaseWidgetInfo(ids=" + this.a + ", type=" + this.b + ", queueSettings=" + this.c + ", settings=" + this.d + ')';
        }

        public a(WidgetIds widgetIds, String str, QueueSettings queueSettings, WidgetSettings widgetSettings) {
            this.a = widgetIds;
            this.b = str;
            this.c = queueSettings;
            this.d = widgetSettings;
        }
    }
}
