package xsna;

import com.vk.dto.stickers.StickerStockItem;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes5.dex */
public final class cni0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(Integer.valueOf(((StickerStockItem) t).z), Integer.valueOf(((StickerStockItem) t2).z));
    }
}
