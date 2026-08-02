package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: VideoStackedListSectionBlockListener.kt */
/* loaded from: classes16.dex */
public final class cit0 implements zda {
    public final u4a b;
    public Integer c;

    public cit0(u4a u4aVar) {
        this.b = u4aVar;
    }

    @Override // xsna.zda
    public final void k(UIBlock uIBlock) {
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList != null) {
            bit0.a.getClass();
            if (bit0.b(uIBlockList)) {
                this.b.b.e.b(new buz(12, new s1f0(7, uIBlockList, this), new oac(this, 18)), false);
            }
        }
    }

    @Override // xsna.zda
    public final void H(UIBlockCatalog uIBlockCatalog) {
    }

    @Override // xsna.zda
    public final void I(Throwable th) {
    }
}
