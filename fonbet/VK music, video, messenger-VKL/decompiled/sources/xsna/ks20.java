package xsna;

import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetAdditionalHeaderIconDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetHeaderRightTypeDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageStyleDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageSubIconDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetVerticalAlignDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemPayloadDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.VerticalAlign;
import com.vk.superapp.ui.widgets.AdditionalHeaderIconBlock;
import com.vk.superapp.ui.widgets.HeaderRightImageType;
import com.vk.superapp.ui.widgets.subscribe_tile.SubIcon;
import com.vk.superapp.ui.widgets.tile.TileImageSubIcon;
import com.vk.superapp.ui.widgets.tile.TileImageSubIconType;
import com.vk.superapp.ui.widgets.tile.TileStyle;
import com.vk.superapp.ui.widgets.tile.TileType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MiscMappers.kt */
/* loaded from: classes6.dex */
public final class ks20 {

    /* compiled from: MiscMappers.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto.TypeDto.values().length];
            try {
                iArr[SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto.TypeDto.MINI_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto.TypeDto.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto.TypeDto.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SuperAppUniversalWidgetImageStyleDto.TypeDto.values().length];
            try {
                iArr2[SuperAppUniversalWidgetImageStyleDto.TypeDto.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SuperAppUniversalWidgetImageStyleDto.TypeDto.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SuperAppUniversalWidgetImageStyleDto.TypeDto.CIRCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SuperAppUniversalWidgetImageStyleDto.TypeDto.POSTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SuperAppUniversalWidgetImageStyleDto.TypeDto.TV.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SuperAppUniversalWidgetImageStyleDto.TypeDto.RAW.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SuperAppUniversalWidgetVerticalAlignDto.values().length];
            try {
                iArr3[SuperAppUniversalWidgetVerticalAlignDto.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[SuperAppUniversalWidgetVerticalAlignDto.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[SuperAppUniversalWidgetVerticalAlignDto.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SuperAppUniversalWidgetHeaderRightTypeDto.values().length];
            try {
                iArr4[SuperAppUniversalWidgetHeaderRightTypeDto.MORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[SuperAppUniversalWidgetHeaderRightTypeDto.CHEVRON.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[SuperAppUniversalWidgetHeaderRightTypeDto.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static WebAction a(SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto) {
        SuperAppUniversalWidgetActionDto d;
        if (superAppUniversalWidgetImageBlockDto instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) {
            SuperAppUniversalWidgetActionDto d2 = ((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) superAppUniversalWidgetImageBlockDto).d();
            if (d2 != null) {
                bpn0 bpn0Var = pdx0.a;
                return pdx0.b(d2, null);
            }
        } else if ((superAppUniversalWidgetImageBlockDto instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) && (d = ((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) superAppUniversalWidgetImageBlockDto).d()) != null) {
            bpn0 bpn0Var2 = pdx0.a;
            return pdx0.b(d, null);
        }
        return null;
    }

    public static AdditionalHeaderIconBlock b(SuperAppUniversalWidgetAdditionalHeaderIconDto superAppUniversalWidgetAdditionalHeaderIconDto, SuperAppShowcaseItemPayloadDto superAppShowcaseItemPayloadDto) {
        SuperAppUniversalWidgetImageBlockDto d = superAppUniversalWidgetAdditionalHeaderIconDto.d();
        WebAction webAction = null;
        if (!(d instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto)) {
            return null;
        }
        SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto superAppUniversalWidgetImageInlineDto = (SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) d;
        WebImage n = n(superAppUniversalWidgetImageInlineDto.e());
        SuperAppUniversalWidgetActionDto d2 = superAppUniversalWidgetImageInlineDto.d();
        if (d2 != null) {
            bpn0 bpn0Var = pdx0.a;
            webAction = pdx0.b(d2, superAppShowcaseItemPayloadDto);
        }
        return new AdditionalHeaderIconBlock(n, webAction);
    }

    public static HeaderRightImageType c(SuperAppUniversalWidgetHeaderRightTypeDto superAppUniversalWidgetHeaderRightTypeDto) {
        int i = superAppUniversalWidgetHeaderRightTypeDto == null ? -1 : a.$EnumSwitchMapping$3[superAppUniversalWidgetHeaderRightTypeDto.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? HeaderRightImageType.NONE : HeaderRightImageType.NONE : HeaderRightImageType.CHEVRON : HeaderRightImageType.MORE;
    }

    public static TileStyle d(SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto) {
        SuperAppUniversalWidgetImageStyleDto g;
        if (superAppUniversalWidgetImageBlockDto instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) {
            SuperAppUniversalWidgetImageStyleDto f = ((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) superAppUniversalWidgetImageBlockDto).f();
            if (f != null) {
                return e(f);
            }
            return null;
        }
        if (!(superAppUniversalWidgetImageBlockDto instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) || (g = ((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) superAppUniversalWidgetImageBlockDto).g()) == null) {
            return null;
        }
        return e(g);
    }

    public static TileStyle e(SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto) {
        TileType tileType = a.$EnumSwitchMapping$1[superAppUniversalWidgetImageStyleDto.d().ordinal()] == 3 ? TileType.CIRCLE : TileType.NONE;
        Boolean f = superAppUniversalWidgetImageStyleDto.f();
        return new TileStyle(tileType, f != null ? f.booleanValue() : false);
    }

    public static SubIcon f(SuperAppUniversalWidgetImageSubIconDto superAppUniversalWidgetImageSubIconDto) {
        if (superAppUniversalWidgetImageSubIconDto instanceof SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconVerifiedDto) {
            return SubIcon.Verified.b;
        }
        if (superAppUniversalWidgetImageSubIconDto instanceof SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconIconDto) {
            return new SubIcon.Icon(n(((SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconIconDto) superAppUniversalWidgetImageSubIconDto).d()));
        }
        if (!(superAppUniversalWidgetImageSubIconDto instanceof SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconNumberDto)) {
            return null;
        }
        SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconNumberDto superAppUniversalWidgetImageSubIconNumberDto = (SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconNumberDto) superAppUniversalWidgetImageSubIconDto;
        return new SubIcon.Number(superAppUniversalWidgetImageSubIconNumberDto.e(), superAppUniversalWidgetImageSubIconNumberDto.d());
    }

    public static TileImageSubIcon g(SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto) {
        SuperAppUniversalWidgetImageSubIconDto i;
        if (superAppUniversalWidgetImageBlockDto instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) {
            SuperAppUniversalWidgetImageSubIconDto g = ((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) superAppUniversalWidgetImageBlockDto).g();
            if (g != null) {
                return j(g);
            }
            return null;
        }
        if (!(superAppUniversalWidgetImageBlockDto instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) || (i = ((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) superAppUniversalWidgetImageBlockDto).i()) == null) {
            return null;
        }
        return j(i);
    }

    public static ImageBlock.Style h(SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto) {
        ImageBlock.Style.Outline outline;
        ImageBlock.Style.Size size = ImageBlock.Style.Size.MEDIUM;
        switch (a.$EnumSwitchMapping$1[superAppUniversalWidgetImageStyleDto.d().ordinal()]) {
            case 1:
                outline = ImageBlock.Style.Outline.APP;
                break;
            case 2:
                outline = ImageBlock.Style.Outline.SQUARE;
                break;
            case 3:
                outline = ImageBlock.Style.Outline.CIRCLE;
                break;
            case 4:
                outline = ImageBlock.Style.Outline.POSTER;
                break;
            case 5:
                outline = ImageBlock.Style.Outline.TV;
                break;
            case 6:
                outline = ImageBlock.Style.Outline.RAW;
                break;
            default:
                outline = ImageBlock.Style.Outline.RAW;
                break;
        }
        SuperAppUniversalWidgetVerticalAlignDto e = superAppUniversalWidgetImageStyleDto.e();
        int i = e == null ? -1 : a.$EnumSwitchMapping$2[e.ordinal()];
        VerticalAlign verticalAlign = i != 1 ? i != 2 ? i != 3 ? null : VerticalAlign.BOTTOM : VerticalAlign.CENTER : VerticalAlign.TOP;
        if (verticalAlign == null) {
            verticalAlign = VerticalAlign.TOP;
        }
        return new ImageBlock.Style(size, outline, verticalAlign);
    }

    public static SubIcon i(SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto) {
        SuperAppUniversalWidgetImageSubIconDto i;
        if (superAppUniversalWidgetImageBlockDto instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) {
            SuperAppUniversalWidgetImageSubIconDto g = ((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) superAppUniversalWidgetImageBlockDto).g();
            if (g != null) {
                return f(g);
            }
            return null;
        }
        if (!(superAppUniversalWidgetImageBlockDto instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) || (i = ((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) superAppUniversalWidgetImageBlockDto).i()) == null) {
            return null;
        }
        return f(i);
    }

    public static TileImageSubIcon j(SuperAppUniversalWidgetImageSubIconDto superAppUniversalWidgetImageSubIconDto) {
        if (superAppUniversalWidgetImageSubIconDto instanceof SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconVerifiedDto) {
            return new TileImageSubIcon(TileImageSubIconType.VERIFIED, null, null, null, 14, null);
        }
        if (superAppUniversalWidgetImageSubIconDto instanceof SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconIconDto) {
            return new TileImageSubIcon(TileImageSubIconType.ICON, n(((SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconIconDto) superAppUniversalWidgetImageSubIconDto).d()), null, null, 12, null);
        }
        if (!(superAppUniversalWidgetImageSubIconDto instanceof SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconNumberDto)) {
            return null;
        }
        SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconNumberDto superAppUniversalWidgetImageSubIconNumberDto = (SuperAppUniversalWidgetImageSubIconDto.SuperAppUniversalWidgetImageSubIconNumberDto) superAppUniversalWidgetImageSubIconDto;
        return new TileImageSubIcon(TileImageSubIconType.TEXT, null, erm0.D0(2, superAppUniversalWidgetImageSubIconNumberDto.e()), superAppUniversalWidgetImageSubIconNumberDto.d(), 2, null);
    }

    public static WebImage k(SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, WidgetObjects widgetObjects) {
        WebGroupShortInfo webGroupShortInfo;
        if (superAppUniversalWidgetImageBlockDto instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) {
            return n(((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageInlineDto) superAppUniversalWidgetImageBlockDto).e());
        }
        if (!(superAppUniversalWidgetImageBlockDto instanceof SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto)) {
            return null;
        }
        int i = a.$EnumSwitchMapping$0[((SuperAppUniversalWidgetImageBlockDto.SuperAppUniversalWidgetImageEntityDto) superAppUniversalWidgetImageBlockDto).i().ordinal()];
        if (i == 1) {
            WebApiApplication webApiApplication = widgetObjects.b.get(Long.valueOf(r2.e()));
            if (webApiApplication != null) {
                return webApiApplication.d.b;
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (webGroupShortInfo = widgetObjects.d.get(Long.valueOf(r2.e()))) != null) {
                return webGroupShortInfo.i;
            }
            return null;
        }
        WebUserShortInfo webUserShortInfo = widgetObjects.c.get(Long.valueOf(r2.e()));
        if (webUserShortInfo != null) {
            return webUserShortInfo.h;
        }
        return null;
    }

    public static WebUserShortInfo l(UsersUserFullDto usersUserFullDto) {
        WebImage webImage;
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
            if (o2 == null) {
                o2 = "";
            }
            WebImageSize webImageSize = new WebImageSize(o2, 50, 50, (char) 0, false, null, 56, null);
            String X1 = usersUserFullDto.X1();
            if (X1 == null) {
                X1 = "";
            }
            WebImageSize webImageSize2 = new WebImageSize(X1, 100, 100, (char) 0, false, null, 56, null);
            String i2 = usersUserFullDto.i2();
            if (i2 == null) {
                i2 = "";
            }
            WebImageSize webImageSize3 = new WebImageSize(i2, 200, 200, (char) 0, false, null, 56, null);
            String l2 = usersUserFullDto.l2();
            if (l2 == null) {
                l2 = "";
            }
            webImage = new WebImage((List<WebImageSize>) e43.l(webImageSize, webImageSize2, webImageSize3, new WebImageSize(l2, 400, 400, (char) 0, false, null, 56, null)));
        }
        BaseCityDto G = usersUserFullDto.G();
        return new WebUserShortInfo(s1, D0, x1, z, booleanValue, booleanValue2, webImage, G != null ? G.getTitle() : null);
    }

    public static WebAction m(SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto) {
        bpn0 bpn0Var = pdx0.a;
        return pdx0.b(superAppUniversalWidgetActionDto, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public static WebImage n(List list) {
        ?? r0;
        if (list != null) {
            List<SuperAppUniversalWidgetImageItemDto> list2 = list;
            r0 = new ArrayList(c5g.u(list2, 10));
            for (SuperAppUniversalWidgetImageItemDto superAppUniversalWidgetImageItemDto : list2) {
                int width = superAppUniversalWidgetImageItemDto.getWidth();
                r0.add(new WebImageSize(superAppUniversalWidgetImageItemDto.getUrl(), superAppUniversalWidgetImageItemDto.getHeight(), width, (char) 0, false, Boolean.FALSE, 24, null));
            }
        } else {
            r0 = EmptyList.b;
        }
        return new WebImage((List<WebImageSize>) r0);
    }
}
