package xsna;

import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseHalfTileAlignDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseHalfTileContentDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseHalfTileContentProgressProgressBarDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseHalfTileContentRegularIconDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseHalfTileTitleBlockDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseHalfTileUniversalIconDto;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ui.uniwidgets.WidgetObjects;
import com.vk.superapp.ui.widgets.half_tile.HalfTileAlign;
import com.vk.superapp.ui.widgets.half_tile.HalfTileContent;
import com.vk.superapp.ui.widgets.half_tile.HalfTileIconSize;
import com.vk.superapp.ui.widgets.half_tile.HalfTileProgressType;
import com.vk.superapp.ui.widgets.half_tile.HalfTileTitleSize;
import com.vk.superapp.ui.widgets.half_tile.ProgressHalfTileData;
import com.vk.superapp.ui.widgets.half_tile.RawHalfTileIcon;
import com.vk.superapp.ui.widgets.half_tile.RepHalfTileIcon;
import com.vk.superapp.ui.widgets.half_tile.SuperAppHalfTileTextBlock;
import com.vk.superapp.ui.widgets.half_tile.UniversalHalfTileIcon;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: HalfTileMapper.kt */
/* loaded from: classes6.dex */
public final class vsu {
    public final WidgetObjects a;

    /* compiled from: HalfTileMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[SuperAppShowcaseHalfTileAlignDto.values().length];
            try {
                iArr[SuperAppShowcaseHalfTileAlignDto.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperAppShowcaseHalfTileAlignDto.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileRawIconDto.SizeDto.values().length];
            try {
                iArr2[SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileRawIconDto.SizeDto.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileRawIconDto.SizeDto.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SuperAppShowcaseHalfTileTitleBlockDto.TitleSizeDto.values().length];
            try {
                iArr3[SuperAppShowcaseHalfTileTitleBlockDto.TitleSizeDto.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[SuperAppShowcaseHalfTileTitleBlockDto.TitleSizeDto.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SuperAppShowcaseHalfTileContentProgressProgressBarDto.TypeDto.values().length];
            try {
                iArr4[SuperAppShowcaseHalfTileContentProgressProgressBarDto.TypeDto.PERCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[SuperAppShowcaseHalfTileContentProgressProgressBarDto.TypeDto.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public vsu(WidgetObjects widgetObjects) {
        this.a = widgetObjects;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.vk.superapp.ui.widgets.half_tile.RepHalfTileIcon] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.vk.superapp.ui.widgets.half_tile.RawHalfTileIcon] */
    public final HalfTileContent a(SuperAppShowcaseHalfTileContentDto superAppShowcaseHalfTileContentDto) {
        int i;
        SuperAppUniversalWidgetImageBlockDto d;
        List list;
        ?? r13;
        boolean z = superAppShowcaseHalfTileContentDto instanceof SuperAppShowcaseHalfTileContentDto.SuperAppShowcaseHalfTileContentRegularDto;
        WidgetObjects widgetObjects = this.a;
        HalfTileTitleSize halfTileTitleSize = null;
        HalfTileIconSize halfTileIconSize = null;
        HalfTileAlign halfTileAlign = null;
        UniversalHalfTileIcon universalHalfTileIcon = null;
        if (!z) {
            if (superAppShowcaseHalfTileContentDto instanceof SuperAppShowcaseHalfTileContentDto.SuperAppShowcaseTileForegroundUserStackDto) {
                SuperAppShowcaseHalfTileContentDto.SuperAppShowcaseTileForegroundUserStackDto superAppShowcaseTileForegroundUserStackDto = (SuperAppShowcaseHalfTileContentDto.SuperAppShowcaseTileForegroundUserStackDto) superAppShowcaseHalfTileContentDto;
                List<SuperAppUniversalWidgetImageBlockDto> e = superAppShowcaseTileForegroundUserStackDto.e();
                ArrayList arrayList = new ArrayList();
                for (SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto : e) {
                    WebImage k = ks20.k(superAppUniversalWidgetImageBlockDto, widgetObjects);
                    ImageWithAction imageWithAction = k != null ? new ImageWithAction(k, ks20.a(superAppUniversalWidgetImageBlockDto)) : null;
                    if (imageWithAction != null) {
                        arrayList.add(imageWithAction);
                    }
                }
                return new HalfTileContent.UserStack(arrayList, superAppShowcaseTileForegroundUserStackDto.d(), superAppShowcaseTileForegroundUserStackDto.f());
            }
            if (!(superAppShowcaseHalfTileContentDto instanceof SuperAppShowcaseHalfTileContentDto.SuperAppShowcaseHalfTileContentProgressDto)) {
                return HalfTileContent.NotSupported.b;
            }
            SuperAppShowcaseHalfTileContentDto.SuperAppShowcaseHalfTileContentProgressDto superAppShowcaseHalfTileContentProgressDto = (SuperAppShowcaseHalfTileContentDto.SuperAppShowcaseHalfTileContentProgressDto) superAppShowcaseHalfTileContentDto;
            SuperAppShowcaseHalfTileUniversalIconDto d2 = superAppShowcaseHalfTileContentProgressDto.d();
            UniversalHalfTileIcon universalHalfTileIcon2 = (d2 == null || (d = d2.d()) == null) ? null : new UniversalHalfTileIcon(ks20.k(d, widgetObjects));
            String title = superAppShowcaseHalfTileContentProgressDto.f().getTitle();
            String e2 = superAppShowcaseHalfTileContentProgressDto.f().e();
            SuperAppShowcaseHalfTileAlignDto d3 = superAppShowcaseHalfTileContentProgressDto.f().d();
            int i2 = d3 == null ? -1 : a.$EnumSwitchMapping$0[d3.ordinal()];
            HalfTileAlign halfTileAlign2 = i2 != 1 ? i2 != 2 ? null : HalfTileAlign.BOTTOM : HalfTileAlign.TOP;
            SuperAppShowcaseHalfTileTitleBlockDto.TitleSizeDto f = superAppShowcaseHalfTileContentProgressDto.f().f();
            i = f != null ? a.$EnumSwitchMapping$2[f.ordinal()] : -1;
            if (i == 1) {
                halfTileTitleSize = HalfTileTitleSize.REGULAR;
            } else if (i == 2) {
                halfTileTitleSize = HalfTileTitleSize.LARGE;
            }
            SuperAppHalfTileTextBlock superAppHalfTileTextBlock = new SuperAppHalfTileTextBlock(title, e2, halfTileAlign2, halfTileTitleSize);
            SuperAppShowcaseHalfTileContentProgressProgressBarDto e3 = superAppShowcaseHalfTileContentProgressDto.e();
            String e4 = e3.e();
            int d4 = e3.d();
            int f2 = e3.f();
            int i3 = a.$EnumSwitchMapping$3[e3.g().ordinal()];
            return new HalfTileContent.Progress(superAppHalfTileTextBlock, universalHalfTileIcon2, new ProgressHalfTileData(e4, d4, f2, i3 != 1 ? i3 != 2 ? HalfTileProgressType.UNKNOWN : HalfTileProgressType.NUMBER : HalfTileProgressType.PERCENT));
        }
        SuperAppShowcaseHalfTileContentDto.SuperAppShowcaseHalfTileContentRegularDto superAppShowcaseHalfTileContentRegularDto = (SuperAppShowcaseHalfTileContentDto.SuperAppShowcaseHalfTileContentRegularDto) superAppShowcaseHalfTileContentDto;
        String title2 = superAppShowcaseHalfTileContentRegularDto.f().getTitle();
        String e5 = superAppShowcaseHalfTileContentRegularDto.f().e();
        SuperAppShowcaseHalfTileAlignDto d5 = superAppShowcaseHalfTileContentRegularDto.f().d();
        int i4 = d5 == null ? -1 : a.$EnumSwitchMapping$0[d5.ordinal()];
        HalfTileAlign halfTileAlign3 = i4 != 1 ? i4 != 2 ? null : HalfTileAlign.BOTTOM : HalfTileAlign.TOP;
        SuperAppShowcaseHalfTileTitleBlockDto.TitleSizeDto f3 = superAppShowcaseHalfTileContentRegularDto.f().f();
        int i5 = f3 == null ? -1 : a.$EnumSwitchMapping$2[f3.ordinal()];
        SuperAppHalfTileTextBlock superAppHalfTileTextBlock2 = new SuperAppHalfTileTextBlock(title2, e5, halfTileAlign3, i5 != 1 ? i5 != 2 ? null : HalfTileTitleSize.LARGE : HalfTileTitleSize.REGULAR);
        String description = superAppShowcaseHalfTileContentRegularDto.getDescription();
        List<SuperAppUniversalWidgetImageItemDto> d6 = superAppShowcaseHalfTileContentRegularDto.d();
        if (d6 != null) {
            List<SuperAppUniversalWidgetImageItemDto> list2 = d6;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (SuperAppUniversalWidgetImageItemDto superAppUniversalWidgetImageItemDto : list2) {
                arrayList2.add(new WebImageSize(superAppUniversalWidgetImageItemDto.getUrl(), superAppUniversalWidgetImageItemDto.getHeight(), superAppUniversalWidgetImageItemDto.getWidth(), (char) 0, false, Boolean.FALSE, 24, null));
            }
            list = Collections.singletonList(new ImageWithAction(new WebImage(arrayList2), null, 2, null));
        } else {
            list = null;
        }
        SuperAppShowcaseHalfTileContentRegularIconDto e6 = superAppShowcaseHalfTileContentRegularDto.e();
        if (e6 instanceof SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileRawIconDto) {
            SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileRawIconDto superAppShowcaseHalfTileRawIconDto = (SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileRawIconDto) e6;
            List<SuperAppUniversalWidgetImageItemDto> d7 = superAppShowcaseHalfTileRawIconDto.d();
            if (d7 != null) {
                List<SuperAppUniversalWidgetImageItemDto> list3 = d7;
                r13 = new ArrayList(c5g.u(list3, 10));
                for (SuperAppUniversalWidgetImageItemDto superAppUniversalWidgetImageItemDto2 : list3) {
                    r13.add(new WebImageSize(superAppUniversalWidgetImageItemDto2.getUrl(), superAppUniversalWidgetImageItemDto2.getHeight(), superAppUniversalWidgetImageItemDto2.getWidth(), (char) 0, false, Boolean.FALSE, 24, null));
                }
            } else {
                r13 = EmptyList.b;
            }
            List singletonList = Collections.singletonList(new ImageWithAction(new WebImage((List<WebImageSize>) r13), null, 2, null));
            SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileRawIconDto.SizeDto e7 = superAppShowcaseHalfTileRawIconDto.e();
            i = e7 != null ? a.$EnumSwitchMapping$1[e7.ordinal()] : -1;
            if (i == 1) {
                halfTileIconSize = HalfTileIconSize.LARGE;
            } else if (i == 2) {
                halfTileIconSize = HalfTileIconSize.REGULAR;
            }
            universalHalfTileIcon = new RawHalfTileIcon(singletonList, halfTileIconSize);
        } else if (e6 instanceof SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileRepIconDto) {
            SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileRepIconDto superAppShowcaseHalfTileRepIconDto = (SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileRepIconDto) e6;
            String e8 = superAppShowcaseHalfTileRepIconDto.e();
            int i6 = a.$EnumSwitchMapping$0[superAppShowcaseHalfTileRepIconDto.d().ordinal()];
            if (i6 == 1) {
                halfTileAlign = HalfTileAlign.TOP;
            } else if (i6 == 2) {
                halfTileAlign = HalfTileAlign.BOTTOM;
            }
            universalHalfTileIcon = new RepHalfTileIcon(e8, halfTileAlign);
        } else if (e6 instanceof SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileUniversalIconDto) {
            universalHalfTileIcon = new UniversalHalfTileIcon(ks20.k(((SuperAppShowcaseHalfTileContentRegularIconDto.SuperAppShowcaseHalfTileUniversalIconDto) e6).d(), widgetObjects));
        }
        return new HalfTileContent.Regular(superAppHalfTileTextBlock2, description, list, universalHalfTileIcon);
    }
}
