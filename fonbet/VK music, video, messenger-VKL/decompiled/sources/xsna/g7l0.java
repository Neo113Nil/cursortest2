package xsna;

import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.details.holders.PackStylesListHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StickerStyleSelectorContract.kt */
/* loaded from: classes6.dex */
public interface g7l0 extends dc6<f7l0> {
    static void Yg(o7l0 o7l0Var, StickerStockItem stickerStockItem, StickerStockItem stickerStockItem2, ArrayList arrayList, PackStylesListHolder.State state, int i, int i2) {
        List<qai0> list = arrayList;
        if ((i2 & 4) != 0) {
            list = EmptyList.b;
        }
        List<qai0> list2 = list;
        if ((i2 & 8) != 0) {
            state = PackStylesListHolder.State.UNDEFINED;
        }
        PackStylesListHolder.State state2 = state;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        o7l0Var.c(stickerStockItem, stickerStockItem2, list2, state2, i, -1);
    }
}
