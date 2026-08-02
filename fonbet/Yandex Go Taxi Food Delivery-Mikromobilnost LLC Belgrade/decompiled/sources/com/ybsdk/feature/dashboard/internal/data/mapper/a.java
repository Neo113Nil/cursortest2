package com.ybsdk.feature.dashboard.internal.data.mapper;

import com.ybsdk.core.common.data.network.dto.ProductSkinDto;
import com.ybsdk.core.common.data.network.dto.SpoilerParamDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ColoredTextEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.common.domain.entities.cache.ExpireableEntity$Behaviour;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.dashboard.internal.data.dto.BalanceV3Dto;
import com.ybsdk.feature.dashboard.internal.data.dto.BalanceV4Dto;
import com.ybsdk.feature.dashboard.internal.data.dto.CardA11yDto;
import com.ybsdk.feature.dashboard.internal.data.dto.CardDto;
import com.ybsdk.feature.dashboard.internal.data.dto.CarouselCardBackdrop;
import com.ybsdk.feature.dashboard.internal.data.dto.CarouselCardDivkitBackdrop;
import com.ybsdk.feature.dashboard.internal.data.dto.CarouselProductDto;
import com.ybsdk.feature.dashboard.internal.data.dto.DashboardV3Response;
import com.ybsdk.feature.dashboard.internal.data.dto.HeaderTopButtonsDto;
import com.ybsdk.feature.dashboard.internal.data.dto.NfcPayloadDto;
import com.ybsdk.feature.dashboard.internal.data.dto.RadialGradientColorDto;
import com.ybsdk.feature.dashboard.internal.data.dto.RadialGradientDto;
import com.ybsdk.feature.dashboard.internal.data.dto.ScreenItem;
import com.ybsdk.feature.dashboard.internal.data.dto.ToolbarHorizontalAlignment;
import com.ybsdk.feature.dashboard.internal.domain.model.TopButton$Alignment;
import com.ybsdk.feature.dashboard.internal.domain.model.TopButtonTag;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import defpackage.a9f0;
import defpackage.aic;
import defpackage.aso;
import defpackage.awz0;
import defpackage.b98;
import defpackage.cvu0;
import defpackage.dzh0;
import defpackage.eh4;
import defpackage.elg;
import defpackage.ez8;
import defpackage.go4;
import defpackage.j6a1;
import defpackage.jl40;
import defpackage.job1;
import defpackage.kpn;
import defpackage.lrp0;
import defpackage.lvy0;
import defpackage.n5i0;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.rbv;
import defpackage.rr51;
import defpackage.sv00;
import defpackage.svt0;
import defpackage.tcc;
import defpackage.tw8;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.uw8;
import defpackage.v860;
import defpackage.vmz;
import defpackage.w511;
import defpackage.w5i0;
import defpackage.ws00;
import defpackage.x4c;
import defpackage.xvq;
import defpackage.ye8;
import defpackage.yua1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes3.dex */
public abstract class a {
    public static final go4 a(BalanceV3Dto balanceV3Dto) {
        ColorModel a;
        String text = balanceV3Dto.getText();
        a = lvy0.a(balanceV3Dto.getColor(), new ColorModel.Attr(ung0.ybColor_textIcon_primary), new xvq(29));
        Themes<String> icon = balanceV3Dto.getIcon();
        ThemedImageUrlEntity c = icon != null ? qxy0.c(icon, null) : null;
        RadialGradientDto radialGradient = balanceV3Dto.getRadialGradient();
        return new go4(text, a, c, false, radialGradient != null ? e(radialGradient) : null);
    }

    public static final go4 b(BalanceV4Dto balanceV4Dto, String str, boolean z) {
        ColorModel a;
        a = lvy0.a(balanceV4Dto.getColor(), new ColorModel.Attr(ung0.ybColor_textIcon_primary), new xvq(29));
        Themes<String> icon = balanceV4Dto.getIcon();
        ThemedImageUrlEntity c = icon != null ? qxy0.c(icon, null) : null;
        RadialGradientDto radialGradient = balanceV4Dto.getRadialGradient();
        return new go4(str, a, c, z, radialGradient != null ? e(radialGradient) : null);
    }

    public static final tw8 c(CarouselCardBackdrop carouselCardBackdrop) {
        ColorModel a;
        a = lvy0.a(carouselCardBackdrop.getBackgroundColor(), new ColorModel.Attr(ung0.ybColor_background_primary), new xvq(29));
        ColoredTextEntity b = aic.b(carouselCardBackdrop.getAmount(), new ColorModel.Attr(ung0.ybColor_textIcon_primary));
        ColoredTextEntity b2 = aic.b(carouselCardBackdrop.getDescription(), new ColorModel.Attr(ung0.ybColor_textIcon_primary));
        Themes<String> actionImage = carouselCardBackdrop.getActionImage();
        rbv f = actionImage != null ? job1.f(qxy0.c(actionImage, null), new ws00(3)) : null;
        String action = carouselCardBackdrop.getAction();
        Themes<String> image = carouselCardBackdrop.getImage();
        return new tw8(a, b, b2, f, image != null ? job1.f(qxy0.c(image, null), new ws00(4)) : null, action, carouselCardBackdrop.getAnalyticsId());
    }

    public static final v860 d(NfcPayloadDto nfcPayloadDto) {
        Boolean hideNativeNfcButton = nfcPayloadDto.getHideNativeNfcButton();
        boolean booleanValue = hideNativeNfcButton != null ? hideNativeNfcButton.booleanValue() : false;
        String tokenizationButtonAction = nfcPayloadDto.getTokenizationButtonAction();
        Themes<String> tokenizationButtonTint = nfcPayloadDto.getTokenizationButtonTint();
        return new v860(tokenizationButtonAction, tokenizationButtonTint != null ? lvy0.c(tokenizationButtonTint) : null, booleanValue);
    }

    public static final w5i0 e(RadialGradientDto radialGradientDto) {
        float centerX = radialGradientDto.getCenterX();
        float centerY = radialGradientDto.getCenterY();
        float radius = radialGradientDto.getRadius();
        List<RadialGradientColorDto> colors = radialGradientDto.getColors();
        ArrayList arrayList = new ArrayList(tcc.n(colors, 10));
        for (RadialGradientColorDto radialGradientColorDto : colors) {
            ColorModel c = lvy0.c(radialGradientColorDto.getColor());
            if (c == null) {
                x4c.g("Failed to parse balance colors in RadialGradientDto in dashboard", null, null, null, 14);
                return null;
            }
            arrayList.add(new n5i0(radialGradientColorDto.getPosition(), c));
        }
        return new w5i0(centerX, centerY, radius, arrayList);
    }

    public static final awz0 f(HeaderTopButtonsDto headerTopButtonsDto) {
        Object obj;
        Text.Resource h;
        TopButton$Alignment topButton$Alignment;
        ThemedImageUrlEntity c = qxy0.c(headerTopButtonsDto.getImage(), null);
        Iterator<E> it = TopButtonTag.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((TopButtonTag) obj).name(), headerTopButtonsDto.getTag(), true)) {
                break;
            }
        }
        TopButtonTag topButtonTag = (TopButtonTag) obj;
        if (topButtonTag == null) {
            topButtonTag = TopButtonTag.UNKNOWN;
        }
        TopButtonTag topButtonTag2 = topButtonTag;
        String action = headerTopButtonsDto.getAction();
        int i = sv00.b[topButtonTag2.ordinal()];
        if (i == 1) {
            h = unr0.h(Text.Companion, dzh0.ybsdk_dashboard_action_contact_support_title);
        } else if (i == 2) {
            h = unr0.h(Text.Companion, dzh0.ybsdk_dashboard_action_profile_title);
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            h = null;
        }
        ToolbarHorizontalAlignment alignment = headerTopButtonsDto.getAlignment();
        int i2 = alignment == null ? -1 : sv00.a[alignment.ordinal()];
        if (i2 == -1) {
            topButton$Alignment = TopButton$Alignment.RIGHT;
        } else if (i2 == 1) {
            topButton$Alignment = TopButton$Alignment.LEFT;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            topButton$Alignment = TopButton$Alignment.RIGHT;
        }
        return new awz0(action, c, topButtonTag2, h, topButton$Alignment);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(CardDto cardDto, String str, com.ybsdk.feature.divkit.api.domain.a aVar, ContinuationImpl continuationImpl) {
        MapperExtKt$toEntity$6 mapperExtKt$toEntity$6;
        int i;
        eh4 d;
        String viewId;
        ColoredTextEntity b;
        ThemedImageUrlEntity c;
        ThemedImageUrlEntity c2;
        go4 a;
        b98 b98Var;
        go4 go4Var;
        String str2;
        ColoredTextEntity coloredTextEntity;
        ThemedImageUrlEntity themedImageUrlEntity;
        ThemedImageUrlEntity themedImageUrlEntity2;
        CardDto cardDto2;
        svt0 svt0Var;
        com.ybsdk.feature.divkit.api.domain.a aVar2;
        rr51 rr51Var;
        go4 go4Var2;
        svt0 svt0Var2;
        go4 go4Var3;
        Object obj;
        b98 b98Var2;
        ProductSkinDto skin;
        CardDto cardDto3;
        a9f0 a9f0Var;
        CarouselCardDivkitBackdrop divkitBackdrop;
        eh4 eh4Var;
        tw8 tw8Var;
        a9f0 a9f0Var2;
        uw8 uw8Var;
        String str3;
        eh4 eh4Var2;
        a9f0 a9f0Var3;
        String str4;
        tw8 tw8Var2;
        Throwable a2;
        if (continuationImpl instanceof MapperExtKt$toEntity$6) {
            mapperExtKt$toEntity$6 = (MapperExtKt$toEntity$6) continuationImpl;
            int i2 = mapperExtKt$toEntity$6.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapperExtKt$toEntity$6.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapperExtKt$toEntity$6.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapperExtKt$toEntity$6.label;
                if (i != 0) {
                    b.b(obj2);
                    d = j6a1.d(cardDto.getBackground());
                    viewId = cardDto.getViewId();
                    b = aic.b(cardDto.getTitle(), new ColorModel.Attr(ung0.ybColor_textIcon_primary));
                    c = qxy0.c(cardDto.getTitleIcon(), null);
                    c2 = qxy0.c(cardDto.getIconAfterTitle(), null);
                    go4 a3 = a(cardDto.getBalance());
                    BalanceV3Dto additionalBalance = cardDto.getAdditionalBalance();
                    a = additionalBalance != null ? a(additionalBalance) : null;
                    SpoilerParamDto balanceSpoilerParams = cardDto.getBalanceSpoilerParams();
                    Themes<String> particleColor = balanceSpoilerParams.getParticleColor();
                    svt0 svt0Var3 = new svt0(lvy0.b(particleColor.getLight(), particleColor.getDark(), new vmz(11, balanceSpoilerParams, str)), balanceSpoilerParams.getWidth(), balanceSpoilerParams.getHeight());
                    DivDataDto divkitOverlay = cardDto.getDivkitOverlay();
                    if (divkitOverlay != null) {
                        mapperExtKt$toEntity$6.L$0 = cardDto;
                        mapperExtKt$toEntity$6.L$1 = aVar;
                        mapperExtKt$toEntity$6.L$2 = d;
                        mapperExtKt$toEntity$6.L$3 = viewId;
                        mapperExtKt$toEntity$6.L$4 = b;
                        mapperExtKt$toEntity$6.L$5 = c;
                        mapperExtKt$toEntity$6.L$6 = c2;
                        mapperExtKt$toEntity$6.L$7 = a3;
                        mapperExtKt$toEntity$6.L$8 = a;
                        mapperExtKt$toEntity$6.L$9 = svt0Var3;
                        mapperExtKt$toEntity$6.label = 1;
                        Object b2 = aVar.b(divkitOverlay, mapperExtKt$toEntity$6);
                        if (b2 != coroutineSingletons) {
                            aVar2 = aVar;
                            svt0Var2 = svt0Var3;
                            cardDto2 = cardDto;
                            go4Var3 = a3;
                            obj = b2;
                        }
                        return coroutineSingletons;
                    }
                    b98Var = null;
                    go4Var = a3;
                    str2 = viewId;
                    coloredTextEntity = b;
                    themedImageUrlEntity = c;
                    themedImageUrlEntity2 = c2;
                    cardDto2 = cardDto;
                    svt0Var = svt0Var3;
                    aVar2 = aVar;
                    rr51Var = null;
                    go4Var2 = a;
                    CardA11yDto a11y = cardDto2.getA11y();
                    b98Var2 = a11y != null ? new b98(d.g(a11y.getBalance())) : b98Var;
                    skin = cardDto2.getSkin();
                    if (skin != null) {
                        cardDto3 = cardDto2;
                        a9f0Var = new a9f0(skin.getId(), j6a1.f(skin.getMini()), d);
                    } else {
                        cardDto3 = cardDto2;
                        a9f0Var = null;
                    }
                    CarouselCardBackdrop backdrop = cardDto3.getBackdrop();
                    tw8 c3 = backdrop != null ? c(backdrop) : null;
                    divkitBackdrop = cardDto3.getDivkitBackdrop();
                    if (divkitBackdrop == null) {
                        eh4Var = d;
                        tw8Var = c3;
                        a9f0Var2 = a9f0Var;
                        uw8Var = null;
                        str3 = str2;
                        return new ye8(str3, eh4Var, tw8Var, uw8Var, coloredTextEntity, themedImageUrlEntity, themedImageUrlEntity2, go4Var, go4Var2, svt0Var, rr51Var, b98Var2, a9f0Var2);
                    }
                    mapperExtKt$toEntity$6.L$0 = d;
                    mapperExtKt$toEntity$6.L$1 = str2;
                    mapperExtKt$toEntity$6.L$2 = coloredTextEntity;
                    mapperExtKt$toEntity$6.L$3 = themedImageUrlEntity;
                    mapperExtKt$toEntity$6.L$4 = themedImageUrlEntity2;
                    mapperExtKt$toEntity$6.L$5 = go4Var;
                    mapperExtKt$toEntity$6.L$6 = go4Var2;
                    mapperExtKt$toEntity$6.L$7 = svt0Var;
                    mapperExtKt$toEntity$6.L$8 = rr51Var;
                    mapperExtKt$toEntity$6.L$9 = b98Var2;
                    mapperExtKt$toEntity$6.L$10 = a9f0Var;
                    mapperExtKt$toEntity$6.L$11 = c3;
                    a9f0 a9f0Var4 = a9f0Var;
                    mapperExtKt$toEntity$6.label = 2;
                    Object h = h(divkitBackdrop, aVar2, mapperExtKt$toEntity$6);
                    if (h != coroutineSingletons) {
                        eh4Var2 = d;
                        a9f0Var3 = a9f0Var4;
                        str4 = str2;
                        obj2 = h;
                        tw8Var2 = c3;
                        tw8Var = tw8Var2;
                        uw8Var = (uw8) obj2;
                        eh4Var = eh4Var2;
                        a9f0Var2 = a9f0Var3;
                        str3 = str4;
                        return new ye8(str3, eh4Var, tw8Var, uw8Var, coloredTextEntity, themedImageUrlEntity, themedImageUrlEntity2, go4Var, go4Var2, svt0Var, rr51Var, b98Var2, a9f0Var2);
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tw8Var2 = (tw8) mapperExtKt$toEntity$6.L$11;
                    a9f0Var3 = (a9f0) mapperExtKt$toEntity$6.L$10;
                    b98Var2 = (b98) mapperExtKt$toEntity$6.L$9;
                    rr51Var = (rr51) mapperExtKt$toEntity$6.L$8;
                    svt0Var = (svt0) mapperExtKt$toEntity$6.L$7;
                    go4Var2 = (go4) mapperExtKt$toEntity$6.L$6;
                    go4Var = (go4) mapperExtKt$toEntity$6.L$5;
                    themedImageUrlEntity2 = (ThemedImageUrlEntity) mapperExtKt$toEntity$6.L$4;
                    themedImageUrlEntity = (ThemedImageUrlEntity) mapperExtKt$toEntity$6.L$3;
                    coloredTextEntity = (ColoredTextEntity) mapperExtKt$toEntity$6.L$2;
                    str4 = (String) mapperExtKt$toEntity$6.L$1;
                    eh4Var2 = (eh4) mapperExtKt$toEntity$6.L$0;
                    b.b(obj2);
                    tw8Var = tw8Var2;
                    uw8Var = (uw8) obj2;
                    eh4Var = eh4Var2;
                    a9f0Var2 = a9f0Var3;
                    str3 = str4;
                    return new ye8(str3, eh4Var, tw8Var, uw8Var, coloredTextEntity, themedImageUrlEntity, themedImageUrlEntity2, go4Var, go4Var2, svt0Var, rr51Var, b98Var2, a9f0Var2);
                }
                svt0Var2 = (svt0) mapperExtKt$toEntity$6.L$9;
                a = (go4) mapperExtKt$toEntity$6.L$8;
                go4Var3 = (go4) mapperExtKt$toEntity$6.L$7;
                c2 = (ThemedImageUrlEntity) mapperExtKt$toEntity$6.L$6;
                c = (ThemedImageUrlEntity) mapperExtKt$toEntity$6.L$5;
                b = (ColoredTextEntity) mapperExtKt$toEntity$6.L$4;
                viewId = (String) mapperExtKt$toEntity$6.L$3;
                d = (eh4) mapperExtKt$toEntity$6.L$2;
                aVar2 = (com.ybsdk.feature.divkit.api.domain.a) mapperExtKt$toEntity$6.L$1;
                cardDto2 = (CardDto) mapperExtKt$toEntity$6.L$0;
                b.b(obj2);
                obj = ((Result) obj2).getValue();
                a2 = Result.a(obj);
                if (a2 != null) {
                    rr51Var = (rr51) obj;
                    go4Var2 = a;
                    str2 = viewId;
                    coloredTextEntity = b;
                    themedImageUrlEntity = c;
                    themedImageUrlEntity2 = c2;
                    go4Var = go4Var3;
                    svt0Var = svt0Var2;
                    b98Var = null;
                } else {
                    svt0 svt0Var4 = svt0Var2;
                    b98Var = null;
                    x4c.g("Can't parse divkitOverlay", a2, lrp0.g, null, 8);
                    rr51Var = null;
                    go4Var2 = a;
                    str2 = viewId;
                    coloredTextEntity = b;
                    themedImageUrlEntity = c;
                    themedImageUrlEntity2 = c2;
                    go4Var = go4Var3;
                    svt0Var = svt0Var4;
                }
                CardA11yDto a11y2 = cardDto2.getA11y();
                if (a11y2 != null) {
                }
                skin = cardDto2.getSkin();
                if (skin != null) {
                }
                CarouselCardBackdrop backdrop2 = cardDto3.getBackdrop();
                if (backdrop2 != null) {
                }
                divkitBackdrop = cardDto3.getDivkitBackdrop();
                if (divkitBackdrop == null) {
                }
            }
        }
        mapperExtKt$toEntity$6 = new MapperExtKt$toEntity$6(continuationImpl);
        Object obj22 = mapperExtKt$toEntity$6.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapperExtKt$toEntity$6.label;
        if (i != 0) {
        }
        a2 = Result.a(obj);
        if (a2 != null) {
        }
        CardA11yDto a11y22 = cardDto2.getA11y();
        if (a11y22 != null) {
        }
        skin = cardDto2.getSkin();
        if (skin != null) {
        }
        CarouselCardBackdrop backdrop22 = cardDto3.getBackdrop();
        if (backdrop22 != null) {
        }
        divkitBackdrop = cardDto3.getDivkitBackdrop();
        if (divkitBackdrop == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(CarouselCardDivkitBackdrop carouselCardDivkitBackdrop, com.ybsdk.feature.divkit.api.domain.a aVar, ContinuationImpl continuationImpl) {
        MapperExtKt$toEntity$12 mapperExtKt$toEntity$12;
        int i;
        Object b;
        Throwable a;
        rr51 rr51Var;
        if (continuationImpl instanceof MapperExtKt$toEntity$12) {
            mapperExtKt$toEntity$12 = (MapperExtKt$toEntity$12) continuationImpl;
            int i2 = mapperExtKt$toEntity$12.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapperExtKt$toEntity$12.label = i2 - Integer.MIN_VALUE;
                Object obj = mapperExtKt$toEntity$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapperExtKt$toEntity$12.label;
                if (i != 0) {
                    b.b(obj);
                    DivDataDto divkitData = carouselCardDivkitBackdrop.getDivkitData();
                    mapperExtKt$toEntity$12.L$0 = carouselCardDivkitBackdrop;
                    mapperExtKt$toEntity$12.label = 1;
                    b = aVar.b(divkitData, mapperExtKt$toEntity$12);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    carouselCardDivkitBackdrop = (CarouselCardDivkitBackdrop) mapperExtKt$toEntity$12.L$0;
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                a = Result.a(b);
                if (a != null) {
                    x4c.g("Can't parse carousel card backdrop divkitData", a, lrp0.g, null, 8);
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51Var = (rr51) b;
                if (rr51Var == null) {
                    return new uw8(carouselCardDivkitBackdrop.getPaddingBottom(), rr51Var);
                }
                return null;
            }
        }
        mapperExtKt$toEntity$12 = new MapperExtKt$toEntity$12(continuationImpl);
        Object obj3 = mapperExtKt$toEntity$12.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapperExtKt$toEntity$12.label;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f A[LOOP:0: B:51:0x0129->B:53:0x012f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0223 -> B:12:0x0224). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x017f -> B:31:0x0187). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(CarouselProductDto carouselProductDto, com.ybsdk.feature.divkit.api.domain.a aVar, List list, List list2, NfcPayloadDto nfcPayloadDto, List list3, ContinuationImpl continuationImpl) {
        MapperExtKt$toEntity$1 mapperExtKt$toEntity$1;
        int i;
        ArrayList arrayList;
        String productType;
        CarouselProductDto carouselProductDto2;
        NfcPayloadDto nfcPayloadDto2;
        List list4;
        Object g;
        List list5;
        List list6;
        Iterator<T> it;
        Collection arrayList2;
        String str;
        List list7;
        List list8;
        ye8 ye8Var;
        com.ybsdk.feature.divkit.api.domain.a aVar2;
        List list9;
        Iterator it2;
        NfcPayloadDto nfcPayloadDto3;
        List list10;
        aso asoVar;
        v860 d;
        List list11;
        ye8 ye8Var2;
        v860 v860Var;
        Collection arrayList3;
        String str2;
        List list12;
        aso asoVar2;
        Iterator it3;
        aso asoVar3;
        List list13;
        ye8 ye8Var3;
        v860 v860Var2;
        String str3;
        List list14;
        aso asoVar4;
        com.ybsdk.feature.divkit.api.domain.a aVar3 = aVar;
        if (continuationImpl instanceof MapperExtKt$toEntity$1) {
            mapperExtKt$toEntity$1 = (MapperExtKt$toEntity$1) continuationImpl;
            int i2 = mapperExtKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapperExtKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapperExtKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapperExtKt$toEntity$1.label;
                int i3 = 2;
                aso asoVar5 = null;
                if (i != 0) {
                    b.b(obj);
                    if (list2 != null) {
                        List list15 = list2;
                        arrayList = new ArrayList(tcc.n(list15, 10));
                        Iterator it4 = list15.iterator();
                        while (it4.hasNext()) {
                            arrayList.add(yua1.c((FullScreenDto) it4.next(), FullScreenEntity$Type.DASHBOARD));
                        }
                    } else {
                        arrayList = EmptyList.a;
                    }
                    productType = carouselProductDto.getProductType();
                    CardDto card = carouselProductDto.getCard();
                    String productType2 = carouselProductDto.getProductType();
                    carouselProductDto2 = carouselProductDto;
                    mapperExtKt$toEntity$1.L$0 = carouselProductDto2;
                    mapperExtKt$toEntity$1.L$1 = aVar3;
                    mapperExtKt$toEntity$1.L$2 = list;
                    nfcPayloadDto2 = nfcPayloadDto;
                    mapperExtKt$toEntity$1.L$3 = nfcPayloadDto2;
                    list4 = list3;
                    mapperExtKt$toEntity$1.L$4 = list4;
                    mapperExtKt$toEntity$1.L$5 = arrayList;
                    mapperExtKt$toEntity$1.L$6 = productType;
                    mapperExtKt$toEntity$1.label = 1;
                    g = g(card, productType2, aVar3, mapperExtKt$toEntity$1);
                    if (g != coroutineSingletons) {
                        list5 = list;
                        list6 = arrayList;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    String str4 = (String) mapperExtKt$toEntity$1.L$6;
                    List list16 = (List) mapperExtKt$toEntity$1.L$5;
                    List list17 = (List) mapperExtKt$toEntity$1.L$4;
                    NfcPayloadDto nfcPayloadDto4 = (NfcPayloadDto) mapperExtKt$toEntity$1.L$3;
                    list5 = (List) mapperExtKt$toEntity$1.L$2;
                    com.ybsdk.feature.divkit.api.domain.a aVar4 = (com.ybsdk.feature.divkit.api.domain.a) mapperExtKt$toEntity$1.L$1;
                    CarouselProductDto carouselProductDto3 = (CarouselProductDto) mapperExtKt$toEntity$1.L$0;
                    b.b(obj);
                    list4 = list17;
                    nfcPayloadDto2 = nfcPayloadDto4;
                    g = obj;
                    productType = str4;
                    aVar3 = aVar4;
                    carouselProductDto2 = carouselProductDto3;
                    list6 = list16;
                } else if (i == 2) {
                    list9 = (List) mapperExtKt$toEntity$1.L$9;
                    ye8Var = (ye8) mapperExtKt$toEntity$1.L$8;
                    str = (String) mapperExtKt$toEntity$1.L$7;
                    ScreenItem screenItem = (ScreenItem) mapperExtKt$toEntity$1.L$6;
                    it2 = (Iterator) mapperExtKt$toEntity$1.L$5;
                    arrayList2 = (Collection) mapperExtKt$toEntity$1.L$4;
                    List list18 = (List) mapperExtKt$toEntity$1.L$3;
                    List list19 = (List) mapperExtKt$toEntity$1.L$2;
                    NfcPayloadDto nfcPayloadDto5 = (NfcPayloadDto) mapperExtKt$toEntity$1.L$1;
                    aVar2 = (com.ybsdk.feature.divkit.api.domain.a) mapperExtKt$toEntity$1.L$0;
                    b.b(obj);
                    Object obj2 = ((Result) obj).getValue();
                    Throwable a = Result.a(obj2);
                    if (a != null) {
                        asoVar3 = new aso(new elg((rr51) obj2, screenItem.getItemType()), ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, 0L, ExpireableEntity$Behaviour.REQUIRED);
                    } else {
                        x4c.g("Can't parse dashboard divKit", a, lrp0.g, null, 8);
                        asoVar3 = null;
                    }
                    if (asoVar3 != null) {
                        arrayList2.add(asoVar3);
                    }
                    list7 = list19;
                    nfcPayloadDto3 = nfcPayloadDto5;
                    i3 = 2;
                    list8 = list18;
                    if (!it2.hasNext()) {
                        ScreenItem screenItem2 = (ScreenItem) it2.next();
                        DivDataDto divKitData = screenItem2.getDivKitData();
                        mapperExtKt$toEntity$1.L$0 = aVar2;
                        mapperExtKt$toEntity$1.L$1 = nfcPayloadDto3;
                        mapperExtKt$toEntity$1.L$2 = list7;
                        mapperExtKt$toEntity$1.L$3 = list8;
                        mapperExtKt$toEntity$1.L$4 = arrayList2;
                        mapperExtKt$toEntity$1.L$5 = it2;
                        mapperExtKt$toEntity$1.L$6 = screenItem2;
                        mapperExtKt$toEntity$1.L$7 = str;
                        mapperExtKt$toEntity$1.L$8 = ye8Var;
                        mapperExtKt$toEntity$1.L$9 = list9;
                        mapperExtKt$toEntity$1.label = i3;
                        Object b = aVar2.b(divKitData, mapperExtKt$toEntity$1);
                        if (b != coroutineSingletons) {
                            List list20 = list8;
                            list19 = list7;
                            obj2 = b;
                            nfcPayloadDto5 = nfcPayloadDto3;
                            screenItem = screenItem2;
                            list18 = list20;
                            Throwable a2 = Result.a(obj2);
                            if (a2 != null) {
                            }
                            if (asoVar3 != null) {
                            }
                            list7 = list19;
                            nfcPayloadDto3 = nfcPayloadDto5;
                            i3 = 2;
                            list8 = list18;
                            if (!it2.hasNext()) {
                                list10 = (List) arrayList2;
                                asoVar = new aso(list8, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, 0L, ExpireableEntity$Behaviour.REQUIRED);
                                d = nfcPayloadDto3 != null ? d(nfcPayloadDto3) : new v860(0);
                                if (list7 != null) {
                                    List list21 = list7;
                                    list11 = list9;
                                    ye8Var2 = ye8Var;
                                    v860Var = d;
                                    arrayList3 = new ArrayList(tcc.n(list21, 10));
                                    str2 = str;
                                    list12 = list10;
                                    asoVar2 = asoVar;
                                    it3 = list21.iterator();
                                    if (it3.hasNext()) {
                                    }
                                }
                                list13 = list9;
                                ye8Var3 = ye8Var;
                                v860Var2 = d;
                                str3 = str;
                                list14 = list10;
                                asoVar4 = asoVar;
                                return new ez8(str3, ye8Var3, list13, list14, asoVar4, v860Var2, asoVar5);
                            }
                        }
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList3 = (Collection) mapperExtKt$toEntity$1.L$8;
                    v860Var = (v860) mapperExtKt$toEntity$1.L$7;
                    asoVar2 = (aso) mapperExtKt$toEntity$1.L$6;
                    list12 = (List) mapperExtKt$toEntity$1.L$5;
                    list11 = (List) mapperExtKt$toEntity$1.L$4;
                    ye8Var2 = (ye8) mapperExtKt$toEntity$1.L$3;
                    str2 = (String) mapperExtKt$toEntity$1.L$2;
                    it3 = (Iterator) mapperExtKt$toEntity$1.L$1;
                    Collection collection = (Collection) mapperExtKt$toEntity$1.L$0;
                    b.b(obj);
                    arrayList3.add((kpn) obj);
                    arrayList3 = collection;
                    if (it3.hasNext()) {
                        EducationsV2Dto educationsV2Dto = (EducationsV2Dto) it3.next();
                        mapperExtKt$toEntity$1.L$0 = arrayList3;
                        mapperExtKt$toEntity$1.L$1 = it3;
                        mapperExtKt$toEntity$1.L$2 = str2;
                        mapperExtKt$toEntity$1.L$3 = ye8Var2;
                        mapperExtKt$toEntity$1.L$4 = list11;
                        mapperExtKt$toEntity$1.L$5 = list12;
                        mapperExtKt$toEntity$1.L$6 = asoVar2;
                        mapperExtKt$toEntity$1.L$7 = v860Var;
                        mapperExtKt$toEntity$1.L$8 = arrayList3;
                        mapperExtKt$toEntity$1.L$9 = null;
                        mapperExtKt$toEntity$1.label = 3;
                        obj = com.ybsdk.feature.educations.api.a.d(educationsV2Dto, mapperExtKt$toEntity$1);
                        if (obj != coroutineSingletons) {
                            collection = arrayList3;
                            arrayList3.add((kpn) obj);
                            arrayList3 = collection;
                            if (it3.hasNext()) {
                                List list22 = (List) arrayList3;
                                if (list22 != null) {
                                    asoVar5 = new aso(list22, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, 0L, ExpireableEntity$Behaviour.REQUIRED);
                                    v860Var2 = v860Var;
                                    asoVar4 = asoVar2;
                                    list14 = list12;
                                    list13 = list11;
                                    ye8Var3 = ye8Var2;
                                    str3 = str2;
                                    return new ez8(str3, ye8Var3, list13, list14, asoVar4, v860Var2, asoVar5);
                                }
                                d = v860Var;
                                asoVar = asoVar2;
                                list10 = list12;
                                list9 = list11;
                                ye8Var = ye8Var2;
                                str = str2;
                                list13 = list9;
                                ye8Var3 = ye8Var;
                                v860Var2 = d;
                                str3 = str;
                                list14 = list10;
                                asoVar4 = asoVar;
                                return new ez8(str3, ye8Var3, list13, list14, asoVar4, v860Var2, asoVar5);
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                ye8 ye8Var4 = (ye8) g;
                List<HeaderTopButtonsDto> headerTopButtons = carouselProductDto2.getHeaderTopButtons();
                ArrayList arrayList4 = new ArrayList(tcc.n(headerTopButtons, 10));
                it = headerTopButtons.iterator();
                while (it.hasNext()) {
                    arrayList4.add(f((HeaderTopButtonsDto) it.next()));
                }
                arrayList2 = new ArrayList();
                str = productType;
                list7 = list4;
                list8 = list6;
                ye8Var = ye8Var4;
                aVar2 = aVar3;
                list9 = arrayList4;
                it2 = list5.iterator();
                nfcPayloadDto3 = nfcPayloadDto2;
                if (!it2.hasNext()) {
                }
            }
        }
        mapperExtKt$toEntity$1 = new MapperExtKt$toEntity$1(continuationImpl);
        Object obj3 = mapperExtKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapperExtKt$toEntity$1.label;
        int i32 = 2;
        aso asoVar52 = null;
        if (i != 0) {
        }
        ye8 ye8Var42 = (ye8) g;
        List<HeaderTopButtonsDto> headerTopButtons2 = carouselProductDto2.getHeaderTopButtons();
        ArrayList arrayList42 = new ArrayList(tcc.n(headerTopButtons2, 10));
        it = headerTopButtons2.iterator();
        while (it.hasNext()) {
        }
        arrayList2 = new ArrayList();
        str = productType;
        list7 = list4;
        list8 = list6;
        ye8Var = ye8Var42;
        aVar2 = aVar3;
        list9 = arrayList42;
        it2 = list5.iterator();
        nfcPayloadDto3 = nfcPayloadDto2;
        if (!it2.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(DashboardV3Response dashboardV3Response, ContinuationImpl continuationImpl) {
        MapperExtKt$toSingleDashboardV3Product$1 mapperExtKt$toSingleDashboardV3Product$1;
        int i;
        if (continuationImpl instanceof MapperExtKt$toSingleDashboardV3Product$1) {
            mapperExtKt$toSingleDashboardV3Product$1 = (MapperExtKt$toSingleDashboardV3Product$1) continuationImpl;
            int i2 = mapperExtKt$toSingleDashboardV3Product$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapperExtKt$toSingleDashboardV3Product$1.label = i2 - Integer.MIN_VALUE;
                MapperExtKt$toSingleDashboardV3Product$1 mapperExtKt$toSingleDashboardV3Product$12 = mapperExtKt$toSingleDashboardV3Product$1;
                Object obj = mapperExtKt$toSingleDashboardV3Product$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapperExtKt$toSingleDashboardV3Product$12.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                Object obj2 = null;
                com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(dashboardV3Response.getCommonDivData());
                Iterator<T> it = dashboardV3Response.getCarousel().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jl40.l(((CarouselProductDto) next).getProductType(), dashboardV3Response.getProductType())) {
                        obj2 = next;
                        break;
                    }
                }
                CarouselProductDto carouselProductDto = (CarouselProductDto) obj2;
                if (carouselProductDto == null) {
                    return new Result.Failure(new IllegalStateException("There is no item \"productType\" in carousel"));
                }
                List<ScreenItem> screenItems = dashboardV3Response.getScreenItems();
                List<FullScreenDto> fullscreens = dashboardV3Response.getFullscreens();
                NfcPayloadDto nfcPayload = dashboardV3Response.getNfcPayload();
                List<EducationsV2Dto> educationsV2 = dashboardV3Response.getEducationsV2();
                mapperExtKt$toSingleDashboardV3Product$12.label = 1;
                Object i3 = i(carouselProductDto, aVar, screenItems, fullscreens, nfcPayload, educationsV2, mapperExtKt$toSingleDashboardV3Product$12);
                return i3 == coroutineSingletons ? coroutineSingletons : i3;
            }
        }
        mapperExtKt$toSingleDashboardV3Product$1 = new MapperExtKt$toSingleDashboardV3Product$1(continuationImpl);
        MapperExtKt$toSingleDashboardV3Product$1 mapperExtKt$toSingleDashboardV3Product$122 = mapperExtKt$toSingleDashboardV3Product$1;
        Object obj3 = mapperExtKt$toSingleDashboardV3Product$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapperExtKt$toSingleDashboardV3Product$122.label;
        if (i == 0) {
        }
    }
}
