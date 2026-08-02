package xsna;

import androidx.recyclerview.widget.m;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import java.util.List;

/* compiled from: BlockListDiffCallback.kt */
/* loaded from: classes16.dex */
public final class if7 extends m.b {
    public final List<UIBlock> b;
    public final List<UIBlock> c;

    /* compiled from: BlockListDiffCallback.kt */
    public static final class a {
    }

    public if7(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        return epx.f(this.b.get(i), this.c.get(i2));
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return epx.f(this.b.get(i).Fb(), this.c.get(i2).Fb());
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.b.size();
    }
}
