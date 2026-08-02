package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.container.UIBlockCustomItemUniqueIdWrapper;
import com.vk.lists.ListDataSet;

/* compiled from: HorizontalLoopVh.kt */
/* loaded from: classes16.dex */
public final class nyp0 extends ListDataSet<UIBlock> {
    @Override // com.vk.lists.ListDataSet, xsna.uuk
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final UIBlock c(int i) {
        UIBlock uIBlock = (UIBlock) super.c(i);
        return uIBlock instanceof UIBlockCustomItemUniqueIdWrapper ? ((UIBlockCustomItemUniqueIdWrapper) uIBlock).z : uIBlock;
    }
}
