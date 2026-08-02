package xsna;

import com.vk.dto.stickers.StickerItem;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StickersAdapter.kt */
/* loaded from: classes2.dex */
public final class o8l0 extends qul {
    public final kcl0 h;
    public List<StickerItem> i;

    /* compiled from: StickersAdapter.kt */
    public interface a {
        void a(StickerItem stickerItem);
    }

    public o8l0(a aVar, kcl0 kcl0Var) {
        super(false);
        this.h = kcl0Var;
        this.i = EmptyList.b;
        setHasStableIds(true);
        x0(d8l0.class, new mi10(aVar, 25));
    }
}
