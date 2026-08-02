package xsna;

import androidx.recyclerview.widget.m;
import xsna.o960;

/* compiled from: WidgetSettingItemDiffCallback.kt */
/* loaded from: classes6.dex */
public final class unx0 extends m.e<zif0> {
    public static final unx0 a = new unx0();

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(zif0 zif0Var, zif0 zif0Var2) {
        zif0 zif0Var3 = zif0Var;
        zif0 zif0Var4 = zif0Var2;
        return ((zif0Var3 instanceof tnx0) && (zif0Var4 instanceof tnx0)) ? epx.f(((tnx0) zif0Var3).c(), ((tnx0) zif0Var4).c()) : (zif0Var3 instanceof o960.b) && (zif0Var4 instanceof o960.b);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(zif0 zif0Var, zif0 zif0Var2) {
        zif0 zif0Var3 = zif0Var;
        zif0 zif0Var4 = zif0Var2;
        return ((zif0Var3 instanceof tnx0) && (zif0Var4 instanceof tnx0)) ? epx.f(((tnx0) zif0Var3).c().a, ((tnx0) zif0Var4).c().a) : ((zif0Var3 instanceof o960.b) && (zif0Var4 instanceof o960.b)) || zif0Var3 == zif0Var4;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(zif0 zif0Var, zif0 zif0Var2) {
        return zif0Var2;
    }
}
