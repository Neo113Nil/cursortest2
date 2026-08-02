package xsna;

import com.vk.api.generated.donut.dto.DonutBannerDto;
import com.vk.api.generated.donut.dto.DonutBenefitBlockDto;
import com.vk.api.generated.donut.dto.DonutGoalsInfoDto;
import com.vk.api.generated.donut.dto.DonutRegularSupportDto;
import com.vk.donut.design.compose.banner.DonutContentType;
import com.vk.donut.design.compose.banner.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: DonutBannerFromDtoMapper.kt */
/* loaded from: classes5.dex */
public final class exn {

    /* compiled from: DonutBannerFromDtoMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DonutBenefitBlockDto.TypeDto.values().length];
            try {
                iArr[DonutBenefitBlockDto.TypeDto.ARTICLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutBenefitBlockDto.TypeDto.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DonutBenefitBlockDto.TypeDto.PODCAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DonutBenefitBlockDto.TypeDto.POST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DonutBenefitBlockDto.TypeDto.CHAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DonutBannerDto.IconDto.values().length];
            try {
                iArr2[DonutBannerDto.IconDto.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static p3u a(DonutGoalsInfoDto donutGoalsInfoDto) {
        String title = donutGoalsInfoDto.getTitle();
        String e = donutGoalsInfoDto.e();
        if (e == null) {
            e = "";
        }
        String title2 = donutGoalsInfoDto.d().getTitle();
        return new p3u(title, e, new vs9(donutGoalsInfoDto.d().d(), ws2.e(title2 != null ? title2 : "")));
    }

    public static swm0 b(DonutRegularSupportDto donutRegularSupportDto) {
        com.vk.donut.design.compose.banner.c aVar;
        DonutContentType donutContentType;
        String title = donutRegularSupportDto.getTitle();
        String g = donutRegularSupportDto.g();
        if (g != null) {
            aVar = new c.b(g, donutRegularSupportDto.d());
        } else {
            List<DonutBenefitBlockDto> f = donutRegularSupportDto.f();
            if (f == null) {
                f = EmptyList.b;
            }
            List<DonutBenefitBlockDto> list = f;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (DonutBenefitBlockDto donutBenefitBlockDto : list) {
                int i = a.$EnumSwitchMapping$0[donutBenefitBlockDto.d().ordinal()];
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
                arrayList.add(new hzn(donutContentType, donutBenefitBlockDto.getDescription()));
            }
            aVar = new c.a(arrayList);
        }
        String title2 = donutRegularSupportDto.e().getTitle();
        if (title2 == null) {
            title2 = "";
        }
        return new swm0(title, aVar, new vs9(donutRegularSupportDto.e().d(), ws2.e(title2)));
    }
}
