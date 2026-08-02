package xsna;

import androidx.recyclerview.widget.m;
import java.util.List;

/* compiled from: ClipsRecyclerViewDiffScrollHelper.kt */
/* loaded from: classes17.dex */
public final class k0f extends m.b {
    public final /* synthetic */ List<hfz> b;
    public final /* synthetic */ List<hfz> c;

    /* JADX WARN: Multi-variable type inference failed */
    public k0f(List<? extends hfz> list, List<? extends hfz> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        return true;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return epx.f(this.b.get(i).getItemId(), this.c.get(i2).getItemId());
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
