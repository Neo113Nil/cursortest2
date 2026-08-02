package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: MenuDiffUtilCallback.kt */
/* loaded from: classes6.dex */
public final class h620 extends m.e<kbn0> {
    public static final h620 a = new h620();

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(kbn0 kbn0Var, kbn0 kbn0Var2) {
        return kbn0Var.equals(kbn0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(kbn0 kbn0Var, kbn0 kbn0Var2) {
        kbn0 kbn0Var3 = kbn0Var;
        kbn0 kbn0Var4 = kbn0Var2;
        return ((kbn0Var3 instanceof j8q) && (kbn0Var4 instanceof j8q)) ? epx.f(((j8q) kbn0Var3).b.c, ((j8q) kbn0Var4).b.c) : ((kbn0Var3 instanceof m8q) && (kbn0Var4 instanceof m8q)) || kbn0Var3 == kbn0Var4;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(kbn0 kbn0Var, kbn0 kbn0Var2) {
        return kbn0Var2;
    }
}
