package xsna;

import androidx.recyclerview.widget.m;
import java.util.List;
import xsna.uwl0;

/* compiled from: StoryActionAdapter.kt */
/* loaded from: classes6.dex */
public final class swl0 extends m.b {
    public final /* synthetic */ List<uwl0> b;
    public final /* synthetic */ List<uwl0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public swl0(List<? extends uwl0> list, List<? extends uwl0> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        uwl0 uwl0Var = this.b.get(i);
        uwl0 uwl0Var2 = this.c.get(i2);
        if (((uwl0Var instanceof uwl0.a.AbstractC3841a.b) && (uwl0Var2 instanceof uwl0.a.AbstractC3841a.b)) || ((uwl0Var instanceof uwl0.a.AbstractC3841a.e) && (uwl0Var2 instanceof uwl0.a.AbstractC3841a.e))) {
            return false;
        }
        if ((uwl0Var instanceof uwl0.a.AbstractC3841a.d) && (uwl0Var2 instanceof uwl0.a.AbstractC3841a.d)) {
            return false;
        }
        return ((uwl0Var instanceof uwl0.a) && (uwl0Var2 instanceof uwl0.a)) ? epx.f(uwl0Var, uwl0Var2) && ((uwl0.a) uwl0Var).a == ((uwl0.a) uwl0Var2).a : epx.f(uwl0Var, uwl0Var2);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        uwl0 uwl0Var = this.b.get(i);
        uwl0 uwl0Var2 = this.c.get(i2);
        if ((uwl0Var instanceof uwl0.a.b.c.d) && (uwl0Var2 instanceof uwl0.a.b.c.d)) {
            return true;
        }
        if ((uwl0Var instanceof uwl0.a.AbstractC3841a.d) && (uwl0Var2 instanceof uwl0.a.AbstractC3841a.d)) {
            return true;
        }
        if (((uwl0Var instanceof uwl0.a.AbstractC3841a.b) && (uwl0Var2 instanceof uwl0.a.AbstractC3841a.b)) || ((uwl0Var instanceof uwl0.a.AbstractC3841a.e) && (uwl0Var2 instanceof uwl0.a.AbstractC3841a.e))) {
            return true;
        }
        return epx.f(uwl0Var, uwl0Var2);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final Object getChangePayload(int i, int i2) {
        return this.c.get(i2);
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
