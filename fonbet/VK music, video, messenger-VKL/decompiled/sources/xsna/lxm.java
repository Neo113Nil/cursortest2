package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: ReactionsAdapter.kt */
/* loaded from: classes16.dex */
public final class lxm extends m.e<vze0> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(vze0 vze0Var, vze0 vze0Var2) {
        return vze0Var.equals(vze0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(vze0 vze0Var, vze0 vze0Var2) {
        return vze0Var.b.a == vze0Var2.b.a;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(vze0 vze0Var, vze0 vze0Var2) {
        return s3q0.a;
    }
}
