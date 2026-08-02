package xsna;

import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;

/* compiled from: StickerCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class p2l0 implements PaginatedGridListVh.c {
    @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.c
    public final int a(int i, boolean z) {
        int b = cn70.b(112);
        int b2 = cn70.b(z ? 10 : 2);
        int b3 = (int) ((i - (cn70.b(z ? 22 : 6) * 2.0f)) / ((b + b2) + b2));
        if (b3 < 1) {
            return 1;
        }
        return b3;
    }
}
