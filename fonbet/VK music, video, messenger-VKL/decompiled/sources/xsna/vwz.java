package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: LocalityItemDiffCallback.kt */
/* loaded from: classes6.dex */
public final class vwz extends m.e<zif0> {
    public static final vwz a = new vwz();

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(zif0 zif0Var, zif0 zif0Var2) {
        return zif0Var.equals(zif0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(zif0 zif0Var, zif0 zif0Var2) {
        zif0 zif0Var3 = zif0Var;
        zif0 zif0Var4 = zif0Var2;
        return ((zif0Var3 instanceof uwz) && (zif0Var4 instanceof uwz)) ? epx.f(((uwz) zif0Var3).a.d, ((uwz) zif0Var4).a.d) : (zif0Var3 instanceof twz) && (zif0Var4 instanceof twz);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ Object getChangePayload(zif0 zif0Var, zif0 zif0Var2) {
        return null;
    }
}
