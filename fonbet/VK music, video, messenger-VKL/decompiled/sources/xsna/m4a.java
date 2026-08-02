package xsna;

import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CatalogDiffCallback.kt */
/* loaded from: classes6.dex */
public final class m4a extends m.b {
    public final List<x7a> b;
    public final List<x7a> c;

    public m4a(ArrayList arrayList, List list) {
        this.b = arrayList;
        this.c = list;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        x7a x7aVar = this.b.get(i);
        x7a x7aVar2 = this.c.get(i2);
        return x7aVar.a == x7aVar2.a && x7aVar.c == x7aVar2.c && x7aVar.b == x7aVar2.b && x7aVar.a(x7aVar2);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        x7a x7aVar = this.b.get(i);
        x7a x7aVar2 = this.c.get(i2);
        return x7aVar.a == x7aVar2.a && x7aVar.b(x7aVar2);
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
