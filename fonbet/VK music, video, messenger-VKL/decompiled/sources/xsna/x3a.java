package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import java.util.Iterator;
import java.util.List;

/* compiled from: CatalogCompositeSectionBlockListener.kt */
/* loaded from: classes16.dex */
public final class x3a implements zda {
    public final List<zda> b;

    /* JADX WARN: Multi-variable type inference failed */
    public x3a(List<? extends zda> list) {
        this.b = list;
    }

    @Override // xsna.zda
    public final void H(UIBlockCatalog uIBlockCatalog) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((zda) it.next()).H(uIBlockCatalog);
        }
    }

    @Override // xsna.zda
    public final void I(Throwable th) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((zda) it.next()).I(th);
        }
    }

    @Override // xsna.zda
    public final void k(UIBlock uIBlock) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((zda) it.next()).k(uIBlock);
        }
    }
}
