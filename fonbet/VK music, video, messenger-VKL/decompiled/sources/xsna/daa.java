package xsna;

import com.google.android.gms.common.api.Scope;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stickers.StickerStockItem;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes16.dex */
public final class daa implements Comparator {
    public static final /* synthetic */ daa c = new daa(2);
    public final /* synthetic */ int b;

    public /* synthetic */ daa(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Long.valueOf(((MusicTrack) obj).z), Long.valueOf(((MusicTrack) obj2).z));
            case 1:
                return jw5.b(Integer.valueOf(((StickerStockItem) obj).z), Integer.valueOf(((StickerStockItem) obj2).z));
            default:
                return ((Scope) obj).c.compareTo(((Scope) obj2).c);
        }
    }
}
