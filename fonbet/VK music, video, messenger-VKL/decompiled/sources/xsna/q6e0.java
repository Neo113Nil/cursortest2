package xsna;

import com.vk.dto.stickers.StickerItem;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes5.dex */
public final class q6e0<T> implements Comparator {
    public final /* synthetic */ ArrayList b;

    public q6e0(ArrayList arrayList) {
        this.b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Integer valueOf = Integer.valueOf(((StickerItem) t).b);
        ArrayList arrayList = this.b;
        return jw5.b(Integer.valueOf(arrayList.indexOf(valueOf)), Integer.valueOf(arrayList.indexOf(Integer.valueOf(((StickerItem) t2).b))));
    }
}
