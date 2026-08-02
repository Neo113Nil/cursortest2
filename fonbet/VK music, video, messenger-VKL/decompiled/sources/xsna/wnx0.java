package xsna;

import com.vk.api.generated.superApp.dto.SuperAppMiniWidgetItemDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: WidgetSettingsConverter.kt */
/* loaded from: classes6.dex */
public final class wnx0 {

    /* compiled from: WidgetSettingsConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SuperAppMiniWidgetItemDto.HeaderIconAlignDto.values().length];
            try {
                iArr[SuperAppMiniWidgetItemDto.HeaderIconAlignDto.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperAppMiniWidgetItemDto.HeaderIconAlignDto.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SuperAppMiniWidgetItemDto.TypeDto.values().length];
            try {
                iArr2[SuperAppMiniWidgetItemDto.TypeDto.MW_EXCHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public static WebImage a(List list) {
        ?? r0;
        if (list != null) {
            List<SuperAppUniversalWidgetImageItemDto> list2 = list;
            r0 = new ArrayList(c5g.u(list2, 10));
            for (SuperAppUniversalWidgetImageItemDto superAppUniversalWidgetImageItemDto : list2) {
                int width = superAppUniversalWidgetImageItemDto.getWidth();
                r0.add(new WebImageSize(superAppUniversalWidgetImageItemDto.getUrl(), superAppUniversalWidgetImageItemDto.getHeight(), width, (char) 0, false, null, 56, null));
            }
        } else {
            r0 = EmptyList.b;
        }
        return new WebImage((List<WebImageSize>) r0);
    }
}
