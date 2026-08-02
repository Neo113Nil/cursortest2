package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.holders.LinkVh;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: SmallPlaylistItemVh.kt */
/* loaded from: classes16.dex */
public final class o3k0 implements VkCell.e {
    public final k7a a;
    public final LinkVh.a b;

    public o3k0(k7a k7aVar, LinkVh.a aVar) {
        this.a = k7aVar;
        this.b = aVar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new n3k0(context, this.a, this.b);
    }
}
