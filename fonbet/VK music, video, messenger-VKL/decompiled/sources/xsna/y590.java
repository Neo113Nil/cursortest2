package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: OwnersAdapterDiffCallback.kt */
/* loaded from: classes7.dex */
public final class y590 extends m.e<z590> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(z590 z590Var, z590 z590Var2) {
        return z590Var.equals(z590Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(z590 z590Var, z590 z590Var2) {
        return epx.f(z590Var.a.getId(), z590Var2.a.getId());
    }
}
