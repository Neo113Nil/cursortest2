package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.ArrayList;

/* compiled from: MusicStackedListSpanStrategy.kt */
/* loaded from: classes16.dex */
public final class g750 implements sok0 {
    public UIBlockList b;

    /* compiled from: MusicStackedListSpanStrategy.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.sok0
    public final boolean S(UIBlockList uIBlockList) {
        boolean z = !epx.f(this.b, uIBlockList);
        this.b = uIBlockList;
        return z;
    }

    @Override // xsna.sok0
    public final int getSpanCount() {
        CatalogViewType catalogViewType;
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        UIBlockList uIBlockList = this.b;
        if (uIBlockList == null || (arrayList = uIBlockList.y) == null || (uIBlock = (UIBlock) j5g.a0(arrayList)) == null || (catalogViewType = uIBlock.d) == null) {
            catalogViewType = CatalogViewType.LIST;
        }
        int i = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        return (i == 1 || i == 2) ? 2 : 1;
    }

    @Override // xsna.sok0
    public final int q(UIBlock uIBlock) {
        return 1;
    }
}
