package xsna;

import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import xsna.dnt0;

/* compiled from: VideoDelegate.kt */
/* loaded from: classes16.dex */
public final class zha implements ent0 {
    public final CatalogViewHolder b;
    public final bpn0 c = new bpn0(new gy0(this, 12));

    public zha(CatalogViewHolder catalogViewHolder) {
        this.b = catalogViewHolder;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        CatalogViewHolder catalogViewHolder = this.b;
        if (catalogViewHolder instanceof ent0) {
            return ((ent0) catalogViewHolder).q3();
        }
        if (catalogViewHolder instanceof CatalogBasePaginatedListVh) {
            return (dnt0.a) this.c.getValue();
        }
        return null;
    }
}
