package xsna;

import com.vk.dto.stickers.StickerStockItem;
import java.util.Comparator;
import xsna.vwc0;

/* compiled from: Comparisons.kt */
/* loaded from: classes12.dex */
public final class chf0 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ chf0(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(((vwc0.d) obj).a, ((vwc0.d) obj2).a);
            default:
                return jw5.b(Boolean.valueOf(((StickerStockItem) obj).h), Boolean.valueOf(((StickerStockItem) obj2).h));
        }
    }
}
