package xsna;

import androidx.recyclerview.widget.m;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SectionAppItemDiffCallback.kt */
/* loaded from: classes6.dex */
public final class p1i0 extends m.b {
    public final List<SectionAppItem> b;
    public final List<SectionAppItem> c;

    public p1i0(ArrayList arrayList, List list) {
        this.b = arrayList;
        this.c = list;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        return epx.f(this.b.get(i), this.c.get(i2));
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return this.b.get(i).b.b == this.c.get(i2).b.b;
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
