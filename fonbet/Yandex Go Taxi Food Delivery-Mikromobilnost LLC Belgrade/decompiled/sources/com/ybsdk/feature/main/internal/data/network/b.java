package com.ybsdk.feature.main.internal.data.network;

import com.ybsdk.core.common.data.network.dto.ProductSkinDto;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.main.internal.data.network.dto.ProductA11yDto;
import com.ybsdk.feature.main.internal.data.network.dto.ProductDto;
import com.ybsdk.feature.main.internal.data.network.dto.ProductRightPartDto;
import com.ybsdk.feature.main.internal.data.network.dto.ProductSubtitle;
import com.ybsdk.feature.main.internal.data.network.dto.RadialGradientColorDto;
import com.ybsdk.feature.main.internal.data.network.dto.RadialGradientDto;
import com.ybsdk.feature.main.internal.data.network.dto.SubtitleTypeDto;
import com.ybsdk.feature.main.internal.domain.entities.ProductType;
import com.ybsdk.feature.main.internal.domain.entities.SubtitleTypeEntity;
import defpackage.a6f0;
import defpackage.a9f0;
import defpackage.bob1;
import defpackage.caf0;
import defpackage.d2v0;
import defpackage.d7f0;
import defpackage.daf0;
import defpackage.dcc0;
import defpackage.eh4;
import defpackage.g8e;
import defpackage.j6a1;
import defpackage.job1;
import defpackage.lvy0;
import defpackage.m5i0;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.rbv;
import defpackage.rr51;
import defpackage.rvt0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.ugd0;
import defpackage.ung0;
import defpackage.v5i0;
import defpackage.w511;
import defpackage.w530;
import defpackage.x4c;
import defpackage.z6f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final w530 a;

    public b(w530 w530Var) {
        this.a = w530Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v21, types: [kotlin.collections.EmptyList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(final ProductDto productDto, ContinuationImpl continuationImpl) {
        ProductsMapper$toEntity$1 productsMapper$toEntity$1;
        int i;
        String id;
        String viewId;
        String action;
        ProductType productType;
        ProductType productType2;
        ArrayList arrayList;
        Text.Constant i2;
        ColorModel a;
        d2v0 b;
        d2v0 d2v0Var;
        String str;
        ProductType productType3;
        Text.Constant constant;
        final ProductDto productDto2;
        rr51 rr51Var;
        DivDataDto divRightPart;
        Object a2;
        d2v0 d2v0Var2;
        ProductSubtitle subtitleMini;
        ProductSubtitle subtitle;
        ArrayList arrayList2;
        List list;
        ColorModel colorModel;
        ProductA11yDto a11y;
        z6f0 z6f0Var;
        ProductSkinDto skin;
        rbv rbvVar;
        z6f0 z6f0Var2;
        ProductDto productDto3;
        a9f0 a9f0Var;
        DivDataDto productCaption;
        String str2;
        String str3;
        eh4 eh4Var;
        rbv rbvVar2;
        rvt0 rvt0Var;
        String str4;
        a9f0 a9f0Var2;
        d2v0 d2v0Var3;
        z6f0 z6f0Var3;
        rr51 rr51Var2;
        Object a3;
        a9f0 a9f0Var3;
        String str5;
        rbv rbvVar3;
        String str6;
        String str7;
        eh4 eh4Var2;
        rvt0 rvt0Var2;
        d2v0 d2v0Var4;
        z6f0 z6f0Var4;
        ArrayList arrayList3;
        if (continuationImpl instanceof ProductsMapper$toEntity$1) {
            productsMapper$toEntity$1 = (ProductsMapper$toEntity$1) continuationImpl;
            int i3 = productsMapper$toEntity$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                productsMapper$toEntity$1.label = i3 - Integer.MIN_VALUE;
                Object obj = productsMapper$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsMapper$toEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    id = productDto.getId();
                    viewId = productDto.getViewId();
                    action = productDto.getAction();
                    switch (daf0.b[productDto.getType().ordinal()]) {
                        case 1:
                            productType = ProductType.WALLET;
                            break;
                        case 2:
                            productType = ProductType.PRO;
                            break;
                        case 3:
                            productType = ProductType.CREDIT_LIMIT;
                            break;
                        case 4:
                            productType = ProductType.CORP_CARD;
                            break;
                        case 5:
                            productType = ProductType.PROMO;
                            break;
                        case 6:
                            productType = ProductType.OTHER;
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                    productType2 = productType;
                    List<Themes<String>> icons = productDto.getIcons();
                    int i4 = 0;
                    if (icons != null) {
                        Integer iconCornerRadius = productDto.getIconCornerRadius();
                        arrayList = new ArrayList();
                        Iterator it = icons.iterator();
                        while (it.hasNext()) {
                            Themes themes = (Themes) it.next();
                            rbv f = job1.f(qxy0.c(themes, null), new caf0(i4, iconCornerRadius));
                            if (f == null) {
                                x4c.g("Failed to parse logo in left top part card on screen products", null, "icon=" + themes, null, 10);
                            }
                            if (f != null) {
                                arrayList.add(f);
                            }
                            i4 = 0;
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = EmptyList.a;
                    }
                    i2 = g8e.i(Text.Companion, productDto.getTitle());
                    final int i5 = 0;
                    a = lvy0.a(productDto.getTitleColor(), new ColorModel.Attr(ung0.ybColor_fill_default_800), new tls() { // from class: baf0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i6 = i5;
                            zy11 zy11Var = zy11.a;
                            ProductDto productDto4 = productDto;
                            switch (i6) {
                                case 0:
                                    x4c.g("Failed to parse titleColor in product", null, "color=" + productDto4.getTitleColor() + " product=" + productDto4.getId(), null, 10);
                                    break;
                                default:
                                    x4c.g("Failed to parse spoilerParam.particleColor in product", null, "particleColor=" + productDto4.getSpoilerParam().getParticleColor() + " product=" + productDto4.getId(), null, 10);
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    ProductRightPartDto productRightPart = productDto.getProductRightPart();
                    d2v0 b2 = (productRightPart == null || (subtitle = productRightPart.getSubtitle()) == null) ? null : b(subtitle, productDto.getId(), productDto.getBackground().getColor());
                    ProductRightPartDto productRightPart2 = productDto.getProductRightPart();
                    b = (productRightPart2 == null || (subtitleMini = productRightPart2.getSubtitleMini()) == null) ? null : b(subtitleMini, productDto.getId(), productDto.getBackground().getColor());
                    ProductRightPartDto productRightPart3 = productDto.getProductRightPart();
                    if (productRightPart3 == null || (divRightPart = productRightPart3.getDivRightPart()) == null) {
                        d2v0Var = b2;
                        str = viewId;
                        productType3 = productType2;
                        constant = i2;
                        productDto2 = productDto;
                        rr51Var = null;
                        arrayList2 = arrayList;
                        String str8 = action;
                        list = arrayList2;
                        colorModel = a;
                        eh4 d = j6a1.d(productDto2.getBackground());
                        final int i6 = 1;
                        rvt0 rvt0Var3 = new rvt0(lvy0.a(productDto2.getSpoilerParam().getParticleColor(), new ColorModel.Attr(ung0.ybColor_fill_default_300), new tls() { // from class: baf0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj2) {
                                int i62 = i6;
                                zy11 zy11Var = zy11.a;
                                ProductDto productDto4 = productDto2;
                                switch (i62) {
                                    case 0:
                                        x4c.g("Failed to parse titleColor in product", null, "color=" + productDto4.getTitleColor() + " product=" + productDto4.getId(), null, 10);
                                        break;
                                    default:
                                        x4c.g("Failed to parse spoilerParam.particleColor in product", null, "particleColor=" + productDto4.getSpoilerParam().getParticleColor() + " product=" + productDto4.getId(), null, 10);
                                        break;
                                }
                                return zy11Var;
                            }
                        }), productDto2.getSpoilerParam().getWidth(), productDto2.getSpoilerParam().getHeight());
                        rbv f2 = job1.f(qxy0.c(productDto2.getIconAfterTitle(), null), new a6f0(3));
                        a11y = productDto2.getA11y();
                        if (a11y != null) {
                            String subtitle2 = a11y.getSubtitle();
                            z6f0Var = new z6f0(subtitle2 != null ? d.e(subtitle2) : null);
                        } else {
                            z6f0Var = null;
                        }
                        skin = productDto2.getSkin();
                        if (skin != null) {
                            productDto3 = productDto2;
                            z6f0Var2 = z6f0Var;
                            rbvVar = f2;
                            a9f0Var = new a9f0(skin.getId(), j6a1.f(skin.getMini()), j6a1.d(productDto2.getBackground()));
                        } else {
                            rbvVar = f2;
                            z6f0Var2 = z6f0Var;
                            productDto3 = productDto2;
                            a9f0Var = null;
                        }
                        productCaption = productDto3.getProductCaption();
                        if (productCaption == null) {
                            str2 = str8;
                            str3 = str;
                            eh4Var = d;
                            rbvVar2 = rbvVar;
                            rvt0Var = rvt0Var3;
                            str4 = id;
                            a9f0Var2 = a9f0Var;
                            d2v0Var3 = b;
                            z6f0Var3 = z6f0Var2;
                            rr51Var2 = null;
                            return new d7f0(str4, str3, productType3, str2, list, constant, colorModel, eh4Var, rvt0Var, d2v0Var, d2v0Var3, rbvVar2, z6f0Var3, rr51Var, a9f0Var2, rr51Var2);
                        }
                        productsMapper$toEntity$1.L$0 = id;
                        productsMapper$toEntity$1.L$1 = str;
                        productsMapper$toEntity$1.L$2 = str8;
                        productsMapper$toEntity$1.L$3 = productType3;
                        productsMapper$toEntity$1.L$4 = list;
                        productsMapper$toEntity$1.L$5 = constant;
                        productsMapper$toEntity$1.L$6 = colorModel;
                        productsMapper$toEntity$1.L$7 = d2v0Var;
                        productsMapper$toEntity$1.L$8 = b;
                        productsMapper$toEntity$1.L$9 = rr51Var;
                        productsMapper$toEntity$1.L$10 = d;
                        productsMapper$toEntity$1.L$11 = rvt0Var3;
                        rbv rbvVar4 = rbvVar;
                        productsMapper$toEntity$1.L$12 = rbvVar4;
                        d2v0 d2v0Var5 = b;
                        productsMapper$toEntity$1.L$13 = z6f0Var2;
                        productsMapper$toEntity$1.L$14 = a9f0Var;
                        productsMapper$toEntity$1.label = 2;
                        a3 = com.ybsdk.feature.divkit.internal.a.a(productCaption, new com.ybsdk.feature.divkit.api.domain.a(null), productsMapper$toEntity$1);
                        if (a3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        String str9 = str;
                        obj = a3;
                        a9f0Var3 = a9f0Var;
                        str5 = str9;
                        rbvVar3 = rbvVar4;
                        str6 = id;
                        str7 = str8;
                        eh4Var2 = d;
                        rvt0Var2 = rvt0Var3;
                        d2v0Var4 = d2v0Var5;
                        z6f0Var4 = z6f0Var2;
                        a9f0Var2 = a9f0Var3;
                        z6f0Var3 = z6f0Var4;
                        rr51Var2 = (rr51) obj;
                        str4 = str6;
                        rbvVar2 = rbvVar3;
                        rvt0Var = rvt0Var2;
                        eh4Var = eh4Var2;
                        d2v0Var3 = d2v0Var4;
                        str2 = str7;
                        str3 = str5;
                        return new d7f0(str4, str3, productType3, str2, list, constant, colorModel, eh4Var, rvt0Var, d2v0Var, d2v0Var3, rbvVar2, z6f0Var3, rr51Var, a9f0Var2, rr51Var2);
                    }
                    productsMapper$toEntity$1.L$0 = productDto;
                    productsMapper$toEntity$1.L$1 = id;
                    productsMapper$toEntity$1.L$2 = viewId;
                    productsMapper$toEntity$1.L$3 = action;
                    productsMapper$toEntity$1.L$4 = productType2;
                    productsMapper$toEntity$1.L$5 = arrayList;
                    productsMapper$toEntity$1.L$6 = i2;
                    productsMapper$toEntity$1.L$7 = a;
                    productsMapper$toEntity$1.L$8 = b2;
                    productsMapper$toEntity$1.L$9 = b;
                    productsMapper$toEntity$1.label = 1;
                    a2 = com.ybsdk.feature.divkit.internal.a.a(divRightPart, new com.ybsdk.feature.divkit.api.domain.a(null), productsMapper$toEntity$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    productDto2 = productDto;
                    d2v0Var2 = b2;
                    obj = a2;
                    arrayList3 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a9f0Var3 = (a9f0) productsMapper$toEntity$1.L$14;
                        z6f0Var4 = (z6f0) productsMapper$toEntity$1.L$13;
                        rbvVar3 = (rbv) productsMapper$toEntity$1.L$12;
                        rvt0Var2 = (rvt0) productsMapper$toEntity$1.L$11;
                        eh4Var2 = (eh4) productsMapper$toEntity$1.L$10;
                        rr51Var = (rr51) productsMapper$toEntity$1.L$9;
                        d2v0Var4 = (d2v0) productsMapper$toEntity$1.L$8;
                        d2v0Var = (d2v0) productsMapper$toEntity$1.L$7;
                        colorModel = (ColorModel) productsMapper$toEntity$1.L$6;
                        constant = (Text.Constant) productsMapper$toEntity$1.L$5;
                        list = (List) productsMapper$toEntity$1.L$4;
                        productType3 = (ProductType) productsMapper$toEntity$1.L$3;
                        str7 = (String) productsMapper$toEntity$1.L$2;
                        str5 = (String) productsMapper$toEntity$1.L$1;
                        str6 = (String) productsMapper$toEntity$1.L$0;
                        kotlin.b.b(obj);
                        a9f0Var2 = a9f0Var3;
                        z6f0Var3 = z6f0Var4;
                        rr51Var2 = (rr51) obj;
                        str4 = str6;
                        rbvVar2 = rbvVar3;
                        rvt0Var = rvt0Var2;
                        eh4Var = eh4Var2;
                        d2v0Var3 = d2v0Var4;
                        str2 = str7;
                        str3 = str5;
                        return new d7f0(str4, str3, productType3, str2, list, constant, colorModel, eh4Var, rvt0Var, d2v0Var, d2v0Var3, rbvVar2, z6f0Var3, rr51Var, a9f0Var2, rr51Var2);
                    }
                    b = (d2v0) productsMapper$toEntity$1.L$9;
                    d2v0Var2 = (d2v0) productsMapper$toEntity$1.L$8;
                    a = (ColorModel) productsMapper$toEntity$1.L$7;
                    i2 = (Text.Constant) productsMapper$toEntity$1.L$6;
                    ?? r10 = (List) productsMapper$toEntity$1.L$5;
                    productType2 = (ProductType) productsMapper$toEntity$1.L$4;
                    action = (String) productsMapper$toEntity$1.L$3;
                    viewId = (String) productsMapper$toEntity$1.L$2;
                    id = (String) productsMapper$toEntity$1.L$1;
                    productDto2 = (ProductDto) productsMapper$toEntity$1.L$0;
                    kotlin.b.b(obj);
                    arrayList3 = r10;
                }
                rr51Var = (rr51) obj;
                str = viewId;
                productType3 = productType2;
                constant = i2;
                d2v0Var = d2v0Var2;
                arrayList2 = arrayList3;
                String str82 = action;
                list = arrayList2;
                colorModel = a;
                eh4 d2 = j6a1.d(productDto2.getBackground());
                final int i62 = 1;
                rvt0 rvt0Var32 = new rvt0(lvy0.a(productDto2.getSpoilerParam().getParticleColor(), new ColorModel.Attr(ung0.ybColor_fill_default_300), new tls() { // from class: baf0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i622 = i62;
                        zy11 zy11Var = zy11.a;
                        ProductDto productDto4 = productDto2;
                        switch (i622) {
                            case 0:
                                x4c.g("Failed to parse titleColor in product", null, "color=" + productDto4.getTitleColor() + " product=" + productDto4.getId(), null, 10);
                                break;
                            default:
                                x4c.g("Failed to parse spoilerParam.particleColor in product", null, "particleColor=" + productDto4.getSpoilerParam().getParticleColor() + " product=" + productDto4.getId(), null, 10);
                                break;
                        }
                        return zy11Var;
                    }
                }), productDto2.getSpoilerParam().getWidth(), productDto2.getSpoilerParam().getHeight());
                rbv f22 = job1.f(qxy0.c(productDto2.getIconAfterTitle(), null), new a6f0(3));
                a11y = productDto2.getA11y();
                if (a11y != null) {
                }
                skin = productDto2.getSkin();
                if (skin != null) {
                }
                productCaption = productDto3.getProductCaption();
                if (productCaption == null) {
                }
            }
        }
        productsMapper$toEntity$1 = new ProductsMapper$toEntity$1(this, continuationImpl);
        Object obj2 = productsMapper$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsMapper$toEntity$1.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        str = viewId;
        productType3 = productType2;
        constant = i2;
        d2v0Var = d2v0Var2;
        arrayList2 = arrayList3;
        String str822 = action;
        list = arrayList2;
        colorModel = a;
        eh4 d22 = j6a1.d(productDto2.getBackground());
        final int i622 = 1;
        rvt0 rvt0Var322 = new rvt0(lvy0.a(productDto2.getSpoilerParam().getParticleColor(), new ColorModel.Attr(ung0.ybColor_fill_default_300), new tls() { // from class: baf0
            @Override // defpackage.tls
            public final Object invoke(Object obj22) {
                int i6222 = i622;
                zy11 zy11Var = zy11.a;
                ProductDto productDto4 = productDto2;
                switch (i6222) {
                    case 0:
                        x4c.g("Failed to parse titleColor in product", null, "color=" + productDto4.getTitleColor() + " product=" + productDto4.getId(), null, 10);
                        break;
                    default:
                        x4c.g("Failed to parse spoilerParam.particleColor in product", null, "particleColor=" + productDto4.getSpoilerParam().getParticleColor() + " product=" + productDto4.getId(), null, 10);
                        break;
                }
                return zy11Var;
            }
        }), productDto2.getSpoilerParam().getWidth(), productDto2.getSpoilerParam().getHeight());
        rbv f222 = job1.f(qxy0.c(productDto2.getIconAfterTitle(), null), new a6f0(3));
        a11y = productDto2.getA11y();
        if (a11y != null) {
        }
        skin = productDto2.getSkin();
        if (skin != null) {
        }
        productCaption = productDto3.getProductCaption();
        if (productCaption == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ybsdk.core.utils.ColorModel] */
    public final d2v0 b(ProductSubtitle productSubtitle, String str, ThemedParameter themedParameter) {
        v5i0 v5i0Var;
        SubtitleTypeEntity subtitleTypeEntity;
        v5i0 v5i0Var2;
        ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_background_primary);
        ?? b = lvy0.b((String) themedParameter.getLight(), (String) themedParameter.getDark(), new ugd0(10, themedParameter, str));
        if (b != 0) {
            attr = b;
        }
        Text.Constant e = d.e(bob1.g(productSubtitle.getMoney(), this.a).getFormattedAmount());
        Boolean shouldAnimateSubtitle = productSubtitle.getShouldAnimateSubtitle();
        ColorModel a = lvy0.a(productSubtitle.getSubtitleColor(), new ColorModel.Attr(ung0.ybColor_fill_default_800), new dcc0(str, 7));
        Themes<String> shimmerAnimateColor = productSubtitle.getShimmerAnimateColor();
        ColorModel a2 = shimmerAnimateColor != null ? lvy0.a(shimmerAnimateColor, attr, new dcc0(str, 8)) : null;
        Themes<String> icon = productSubtitle.getIcon();
        rbv f = icon != null ? job1.f(qxy0.c(icon, null), new a6f0(4)) : null;
        RadialGradientDto radialGradient = productSubtitle.getRadialGradient();
        if (radialGradient != null) {
            float centerX = radialGradient.getCenterX();
            float centerY = radialGradient.getCenterY();
            float radius = radialGradient.getRadius();
            List<RadialGradientColorDto> colors = radialGradient.getColors();
            ArrayList arrayList = new ArrayList(tcc.n(colors, 10));
            Iterator it = colors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    v5i0Var2 = new v5i0(centerX, centerY, radius, arrayList);
                    break;
                }
                RadialGradientColorDto radialGradientColorDto = (RadialGradientColorDto) it.next();
                ColorModel c = lvy0.c(radialGradientColorDto.getColor());
                if (c == null) {
                    x4c.g(g8e.o("Failed to parse subtitle colors in RadialGradientDto in product ", str), null, null, null, 14);
                    v5i0Var2 = null;
                    break;
                }
                arrayList.add(new m5i0(radialGradientColorDto.getPosition(), c));
            }
            v5i0Var = v5i0Var2;
        } else {
            v5i0Var = null;
        }
        SubtitleTypeDto type = productSubtitle.getType();
        int i = type == null ? -1 : daf0.a[type.ordinal()];
        if (i != -1) {
            if (i == 1) {
                subtitleTypeEntity = SubtitleTypeEntity.ULTRA;
                return new d2v0(e, shouldAnimateSubtitle, a, a2, f, v5i0Var, subtitleTypeEntity);
            }
            if (i != 2) {
                w511.b();
                return null;
            }
        }
        subtitleTypeEntity = SubtitleTypeEntity.DEFAULT;
        return new d2v0(e, shouldAnimateSubtitle, a, a2, f, v5i0Var, subtitleTypeEntity);
    }
}
