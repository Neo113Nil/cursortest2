package xsna;

import com.vk.donut.design.compose.banner.DonutContentType;
import com.vk.donut.design.compose.banner.c;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.profile.DonutBanner;
import com.vk.toggle.features.ComFeatures;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: DonutBannerUiModel.kt */
/* loaded from: classes5.dex */
public final class jyn {

    /* compiled from: DonutBannerUiModel.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DonutBanner.DonutRegularSupport.DonutBenefitBlock.Type.values().length];
            try {
                iArr[DonutBanner.DonutRegularSupport.DonutBenefitBlock.Type.ARTICLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutBanner.DonutRegularSupport.DonutBenefitBlock.Type.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DonutBanner.DonutRegularSupport.DonutBenefitBlock.Type.PODCAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DonutBanner.DonutRegularSupport.DonutBenefitBlock.Type.POST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DonutBanner.DonutRegularSupport.DonutBenefitBlock.Type.CHAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DonutBanner.DonutInfoBanner.Icon.values().length];
            try {
                iArr2[DonutBanner.DonutInfoBanner.Icon.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final q3u a(DonutBanner.b bVar, a2o a2oVar) {
        String str = bVar.a;
        DonutBanner.a aVar = bVar.b;
        String str2 = bVar.c;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = aVar.a;
        DonutPriceTemplate parse = a2oVar.parse(str3);
        ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
        comFeatures.getClass();
        if (!com.vk.toggle.b.A.a(comFeatures)) {
            parse = null;
        }
        return new q3u(str, str2, new ws9(str3, parse, aVar.c));
    }

    public static final twm0 b(DonutBanner.DonutRegularSupport donutRegularSupport, a2o a2oVar) {
        com.vk.donut.design.compose.banner.c aVar;
        DonutContentType donutContentType;
        String str = donutRegularSupport.a;
        DonutBanner.a aVar2 = donutRegularSupport.b;
        String str2 = donutRegularSupport.c;
        if (str2 != null) {
            aVar = new c.b(str2, donutRegularSupport.d);
        } else {
            Iterable iterable = donutRegularSupport.e;
            if (iterable == null) {
                iterable = EmptyList.b;
            }
            Iterable<DonutBanner.DonutRegularSupport.DonutBenefitBlock> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
            for (DonutBanner.DonutRegularSupport.DonutBenefitBlock donutBenefitBlock : iterable2) {
                int i = a.$EnumSwitchMapping$0[donutBenefitBlock.b.ordinal()];
                if (i == 1) {
                    donutContentType = DonutContentType.ARTICLE;
                } else if (i == 2) {
                    donutContentType = DonutContentType.VIDEO;
                } else if (i == 3) {
                    donutContentType = DonutContentType.PODCAST;
                } else if (i == 4) {
                    donutContentType = DonutContentType.POST;
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    donutContentType = DonutContentType.CHAT;
                }
                arrayList.add(new hzn(donutContentType, donutBenefitBlock.a));
            }
            aVar = new c.a(arrayList);
        }
        String str3 = aVar2.a;
        DonutPriceTemplate parse = a2oVar.parse(str3);
        ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
        comFeatures.getClass();
        if (!com.vk.toggle.b.A.a(comFeatures)) {
            parse = null;
        }
        return new twm0(str, aVar, new ws9(str3, parse, aVar2.c));
    }
}
