package xsna;

import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ReactionChipsAdapter.kt */
/* loaded from: classes2.dex */
public final class f3f0 extends m.b {
    public final List<k0f0> b;
    public final ArrayList c;

    public f3f0(ArrayList arrayList, List list) {
        this.b = list;
        this.c = arrayList;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        return epx.f(this.b.get(i), this.c.get(i2));
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return this.b.get(i).a == ((k0f0) this.c.get(i2)).a;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final Object getChangePayload(int i, int i2) {
        return Boolean.TRUE;
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
