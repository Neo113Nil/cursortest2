package xsna;

import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StoriesAdapter.kt */
/* loaded from: classes3.dex */
public final class npl0 extends m.b {
    public final /* synthetic */ List<z2m0> b;
    public final /* synthetic */ ArrayList c;

    public npl0(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        return epx.f(this.b.get(i), this.c.get(i2));
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return this.b.get(i).a.c == ((z2m0) this.c.get(i2)).a.c;
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
