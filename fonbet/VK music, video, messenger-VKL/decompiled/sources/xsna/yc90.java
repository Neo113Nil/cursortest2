package xsna;

import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PagesDiffUtilCallback.kt */
/* loaded from: classes6.dex */
public final class yc90 extends m.b {
    public final List<y890> b;
    public final ArrayList c;

    public yc90(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        return epx.f(this.b.get(i).b, ((y890) this.c.get(i2)).b);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return this.b.get(i).a == ((y890) this.c.get(i2)).a;
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
