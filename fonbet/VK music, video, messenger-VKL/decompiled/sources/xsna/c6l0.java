package xsna;

import android.util.SparseIntArray;
import com.vk.dto.stickers.StickerItem;
import java.util.Comparator;

/* compiled from: StickerSearcher.kt */
/* loaded from: classes5.dex */
public final class c6l0 implements Comparator<StickerItem> {
    public final /* synthetic */ SparseIntArray b;

    public c6l0(SparseIntArray sparseIntArray) {
        this.b = sparseIntArray;
    }

    @Override // java.util.Comparator
    public final int compare(StickerItem stickerItem, StickerItem stickerItem2) {
        StickerItem stickerItem3 = stickerItem;
        StickerItem stickerItem4 = stickerItem2;
        if (stickerItem3 == null) {
            return stickerItem4 == null ? 0 : -1;
        }
        if (stickerItem4 == null) {
            return 1;
        }
        int i = stickerItem3.b;
        SparseIntArray sparseIntArray = this.b;
        return sparseIntArray.get(stickerItem4.b, Integer.MAX_VALUE) - sparseIntArray.get(i, Integer.MAX_VALUE);
    }
}
