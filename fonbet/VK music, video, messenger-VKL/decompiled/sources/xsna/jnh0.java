package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityAnswer;
import com.vk.catalog2.common.dto.api.sport.CatalogSportMatch;
import com.vk.catalog2.common.dto.api.sport.CatalogSportMatchItem;
import com.vk.catalog2.common.dto.ui.UIBlockSportMatch;
import com.vk.dto.music.SearchSuggestion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: SearchBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class jnh0 {

    /* compiled from: SearchBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogSearchEntityAnswer.EntityType.values().length];
            try {
                iArr2[CatalogSearchEntityAnswer.EntityType.Person.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogSearchEntityAnswer.EntityType.VideoPlaylist.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final List a(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        Map<String, CatalogSportMatchItem> map = catalogBlock.m.l;
        Map<String, CatalogSportMatch> map2 = catalogExtendedData.m0;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, CatalogSportMatchItem> entry : map.entrySet()) {
            String key = entry.getKey();
            CatalogSportMatchItem value = entry.getValue();
            CatalogSportMatch catalogSportMatch = map2.get(key);
            if (catalogSportMatch != null) {
                arrayList.add(new UIBlockSportMatch(bi20Var.b(), catalogSportMatch, value));
            }
        }
        return Collections.singletonList(bez.b(bi20Var, arrayList, EmptyList.b, null, catalogBlock.c == CatalogDataType.DATA_TYPE_SPORTS_MATCHES_CURRENT ? CatalogViewType.SYNTHETIC_SPORT_WIDGET_SLIDER : CatalogViewType.SYNTHETIC_SPORT_WIDGET_LIST, CatalogDataType.DATA_SYNTHETIC_SECTION, null, false, null, false, null, 524184));
    }

    public static final List b(CatalogExtendedData catalogExtendedData, CatalogBlock catalogBlock, bi20 bi20Var) {
        int i = a.$EnumSwitchMapping$0[catalogBlock.i.b.ordinal()];
        return (i == 1 || i == 2) ? rli0.A(new ulp0(rli0.k(new i5g(catalogBlock.Gb(catalogExtendedData)), SearchSuggestion.class), new rxz(bi20Var, 24))) : EmptyList.b;
    }
}
