package xsna;

import androidx.recyclerview.widget.m;
import java.util.List;

/* compiled from: ContactsDiffCallback.kt */
/* loaded from: classes2.dex */
public final class xaj extends m.b {
    public final List<hfz> b;
    public final List<hfz> c;
    public final Object d = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public xaj(List<? extends hfz> list, List<? extends hfz> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        return epx.f(this.b.get(i), this.c.get(i2));
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        return epx.f(this.b.get(i).getItemId(), this.c.get(i2).getItemId());
    }

    @Override // androidx.recyclerview.widget.m.b
    public final Object getChangePayload(int i, int i2) {
        return this.d;
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
