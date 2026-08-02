package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;

/* compiled from: CatalogSearchViewHolderFactory.kt */
/* loaded from: classes16.dex */
public final class vda implements n5a {

    /* compiled from: CatalogSearchViewHolderFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_SPELLCHECKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // xsna.n5a
    public final SearchSpellcheckVh a(CatalogDataType catalogDataType, CatalogViewType catalogViewType, z4a z4aVar) {
        if (a.$EnumSwitchMapping$1[catalogDataType.ordinal()] != 1 || a.$EnumSwitchMapping$0[catalogViewType.ordinal()] != 1) {
            return null;
        }
        return new SearchSpellcheckVh(z4aVar.a, z4aVar.b);
    }
}
