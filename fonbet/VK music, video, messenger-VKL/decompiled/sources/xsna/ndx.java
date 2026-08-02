package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: ClipsInterestsItemsAdapter.kt */
/* loaded from: classes16.dex */
public final class ndx extends m.e<vka> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(vka vkaVar, vka vkaVar2) {
        return vkaVar.equals(vkaVar2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(vka vkaVar, vka vkaVar2) {
        return epx.f(vkaVar.b, vkaVar2.b);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(vka vkaVar, vka vkaVar2) {
        boolean z = vkaVar2.e;
        if (z != vkaVar.e) {
            return Boolean.valueOf(z);
        }
        return null;
    }
}
