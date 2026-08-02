package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: MarkupFontAdapter.kt */
/* loaded from: classes4.dex */
public final class lf10 extends m.e<kzp0> {
    public static final lf10 a = new lf10();

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(kzp0 kzp0Var, kzp0 kzp0Var2) {
        return kzp0Var.equals(kzp0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(kzp0 kzp0Var, kzp0 kzp0Var2) {
        return epx.f(kzp0Var.a.a, kzp0Var2.a.a);
    }
}
