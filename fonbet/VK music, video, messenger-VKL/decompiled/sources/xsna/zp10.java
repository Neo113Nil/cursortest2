package xsna;

import androidx.recyclerview.widget.m;
import xsna.ehw;

/* compiled from: MediaCellItemDiffCallback.kt */
/* loaded from: classes17.dex */
public final class zp10 extends m.e<xp10> {
    public static final zp10 a = new zp10();

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(xp10 xp10Var, xp10 xp10Var2) {
        xp10 xp10Var3 = xp10Var;
        xp10 xp10Var4 = xp10Var2;
        return ((xp10Var3 instanceof dhw) && (xp10Var4 instanceof dhw)) ? epx.f(((dhw) xp10Var3).a, ((dhw) xp10Var4).a) : (xp10Var3 instanceof og9) && (xp10Var4 instanceof og9) && ((og9) xp10Var3).a == ((og9) xp10Var4).a;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(xp10 xp10Var, xp10 xp10Var2) {
        xp10 xp10Var3 = xp10Var;
        xp10 xp10Var4 = xp10Var2;
        return ((xp10Var3 instanceof dhw) && (xp10Var4 instanceof dhw)) ? ((dhw) xp10Var3).a.a == ((dhw) xp10Var4).a.a : ((xp10Var3 instanceof og9) && (xp10Var4 instanceof og9)) || xp10Var3 == xp10Var4;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(xp10 xp10Var, xp10 xp10Var2) {
        xp10 xp10Var3 = xp10Var;
        xp10 xp10Var4 = xp10Var2;
        if (!(xp10Var3 instanceof dhw) || !(xp10Var4 instanceof dhw)) {
            return null;
        }
        ehw.b bVar = ((dhw) xp10Var3).a.f;
        ehw ehwVar = ((dhw) xp10Var4).a;
        if (epx.f(bVar, ehwVar.f)) {
            return null;
        }
        return ehwVar.f;
    }
}
