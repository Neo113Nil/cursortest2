package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: PhotoDiffUtilCallback.kt */
/* loaded from: classes4.dex */
public final class z5a0 extends m.e<ucv0> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(ucv0 ucv0Var, ucv0 ucv0Var2) {
        return ucv0Var.equals(ucv0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(ucv0 ucv0Var, ucv0 ucv0Var2) {
        return ucv0Var.a.c == ucv0Var2.a.c;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(ucv0 ucv0Var, ucv0 ucv0Var2) {
        return ucv0Var2.a;
    }
}
