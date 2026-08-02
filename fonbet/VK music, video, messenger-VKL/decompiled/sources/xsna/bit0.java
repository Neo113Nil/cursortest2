package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VideoStackedListEmptySpacesUtil.kt */
/* loaded from: classes16.dex */
public final class bit0 {
    public static final bit0 a = new bit0();

    /* compiled from: VideoStackedListEmptySpacesUtil.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<UIBlock, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(UIBlock uIBlock) {
            bit0 bit0Var = (bit0) this.receiver;
            bit0 bit0Var2 = bit0.a;
            bit0Var.getClass();
            return Boolean.valueOf(bit0.c(uIBlock));
        }
    }

    public static boolean b(UIBlockList uIBlockList) {
        int size = uIBlockList.y.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            if (c(uIBlockList.y.get(i4))) {
                i++;
            } else if (i > 0) {
                i2++;
                if (i % 6 > 0) {
                    i3++;
                }
                i = 0;
            }
        }
        if (i > 0) {
            i2++;
        }
        return i3 > 0 && i2 > 1;
    }

    public static boolean c(UIBlock uIBlock) {
        CatalogViewType catalogViewType = uIBlock.d;
        return (catalogViewType == CatalogViewType.STACKED_LIST || catalogViewType == CatalogViewType.SYNTHETIC_VIDEO_VIDEOS_STACKED_HIDE) && uIBlock.e == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS;
    }

    public final UIBlockList a(UIBlockList uIBlockList) {
        ArrayList arrayList = new ArrayList(uIBlockList.y);
        int i = 0;
        int i2 = 0;
        while (i < arrayList.size()) {
            if (!c((UIBlock) arrayList.get(i))) {
                if (i2 > 0) {
                    int i3 = i2 % 6;
                    if (i3 == 0) {
                        i++;
                        i2 = 0;
                    } else {
                        Integer g = i7o0.g(arrayList.subList(i, arrayList.size()), new a(1, this, bit0.class, "isStackedListVideo", "isStackedListVideo(Lcom/vk/catalog2/common/dto/api/ui/UIBlock;)Z", 0));
                        Integer valueOf = g != null ? Integer.valueOf(g.intValue() + i) : null;
                        if (valueOf != null) {
                            if (i3 > 3 || i2 < 6) {
                                arrayList.add(i, (UIBlock) arrayList.remove(valueOf.intValue()));
                            } else {
                                int intValue = valueOf.intValue();
                                if (1 <= i3) {
                                    int i4 = 1;
                                    while (true) {
                                        arrayList.add(intValue - i4, (UIBlock) arrayList.remove(i - i4));
                                        if (i4 == i3) {
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                                i -= i3;
                            }
                        }
                        i2 = 0;
                    }
                }
                i++;
            }
            i2++;
            i++;
        }
        return new UIBlockList(uIBlockList, arrayList);
    }
}
