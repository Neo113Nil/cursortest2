package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.GifWithQueryData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.b6l0;

/* compiled from: FullSearchState.kt */
/* loaded from: classes15.dex */
public final class gws {
    public final ArrayList a;
    public StickerStockItem b;
    public List<StickerItem> c;
    public b6l0.a d;
    public GifWithQueryData e;
    public boolean f;

    public gws() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gws)) {
            return false;
        }
        gws gwsVar = (gws) obj;
        return epx.f(this.a, gwsVar.a) && epx.f(this.b, gwsVar.b) && epx.f(this.c, gwsVar.c) && epx.f(this.d, gwsVar.d) && epx.f(this.e, gwsVar.e) && this.f == gwsVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        StickerStockItem stickerStockItem = this.b;
        int a = fw3.a((hashCode + (stickerStockItem == null ? 0 : stickerStockItem.hashCode())) * 31, 31, this.c);
        b6l0.a aVar = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((a + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullSearchState(excludedPacksIds=");
        sb.append(this.a);
        sb.append(", purchasedPack=");
        sb.append(this.b);
        sb.append(", currentWebStickersRes=");
        sb.append(this.c);
        sb.append(", currentLocalRes=");
        sb.append(this.d);
        sb.append(", currentGifResult=");
        sb.append(this.e);
        sb.append(", currentIsLoadingGif=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    public gws(Object obj) {
        ArrayList arrayList = new ArrayList();
        EmptyList emptyList = EmptyList.b;
        GifWithQueryData gifWithQueryData = new GifWithQueryData("", emptyList);
        this.a = arrayList;
        this.b = null;
        this.c = emptyList;
        this.d = null;
        this.e = gifWithQueryData;
        this.f = false;
    }
}
